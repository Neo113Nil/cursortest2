package kotlin.sequences;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public final class SubSequence implements Sequence, DropTakeSequence {
    public final int endIndex;
    public final Sequence sequence;
    public final int startIndex;

    public SubSequence(Sequence sequence, int i, int i2) {
        sequence.getClass();
        this.sequence = sequence;
        this.startIndex = i;
        this.endIndex = i2;
        if (i < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "startIndex should be non-negative, but is "));
            throw null;
        }
        if (i2 < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "endIndex should be non-negative, but is "));
            throw null;
        }
        if (i2 >= i) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m("endIndex should be not less than startIndex, but was ", i2, i, " < "));
        throw null;
    }

    @Override // kotlin.sequences.DropTakeSequence
    public final Sequence drop(int i) {
        int i2 = this.endIndex;
        int i3 = this.startIndex;
        return i >= i2 - i3 ? EmptySequence.INSTANCE : new SubSequence(this.sequence, i3 + i, i2);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new SubSequence$iterator$1(this);
    }

    @Override // kotlin.sequences.DropTakeSequence
    public final Sequence take(int i) {
        int i2 = this.endIndex;
        int i3 = this.startIndex;
        return i >= i2 - i3 ? this : new SubSequence(this.sequence, i3, i + i3);
    }
}
