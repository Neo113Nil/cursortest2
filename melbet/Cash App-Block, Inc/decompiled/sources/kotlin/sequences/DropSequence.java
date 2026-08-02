package kotlin.sequences;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public final class DropSequence implements Sequence, DropTakeSequence {
    public final /* synthetic */ int $r8$classId;
    public final int count;
    public final Sequence sequence;

    public DropSequence(Sequence sequence, int i, int i2) {
        this.$r8$classId = i2;
        switch (i2) {
            case 1:
                sequence.getClass();
                this.sequence = sequence;
                this.count = i;
                if (i >= 0) {
                    return;
                }
                Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m("count must be non-negative, but was ", i, '.'));
                throw null;
            default:
                sequence.getClass();
                this.sequence = sequence;
                this.count = i;
                if (i >= 0) {
                    return;
                }
                Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m("count must be non-negative, but was ", i, '.'));
                throw null;
        }
    }

    @Override // kotlin.sequences.DropTakeSequence
    public final Sequence drop(int i) {
        switch (this.$r8$classId) {
            case 0:
                int i2 = this.count + i;
                return i2 < 0 ? new DropSequence(this, i, 0) : new DropSequence(this.sequence, i2, 0);
            default:
                int i3 = this.count;
                return i >= i3 ? EmptySequence.INSTANCE : new SubSequence(this.sequence, i, i3);
        }
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.$r8$classId) {
            case 0:
                return new DropSequence$iterator$1(this);
            default:
                return new DropSequence$iterator$1(this, (byte) 0);
        }
    }

    @Override // kotlin.sequences.DropTakeSequence
    public final Sequence take(int i) {
        switch (this.$r8$classId) {
            case 0:
                int i2 = this.count;
                int i3 = i2 + i;
                return i3 < 0 ? new DropSequence(this, i, 1) : new SubSequence(this.sequence, i2, i3);
            default:
                return i >= this.count ? this : new DropSequence(this.sequence, i, 1);
        }
    }
}
