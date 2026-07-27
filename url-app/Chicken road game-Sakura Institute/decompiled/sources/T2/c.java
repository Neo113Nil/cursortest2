package T2;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes.dex */
public final class c implements Sequence, d {

    /* renamed from: a, reason: collision with root package name */
    public final Sequence f4038a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4039b;

    public c(Sequence sequence, int i2) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f4038a = sequence;
        this.f4039b = i2;
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i2 + '.').toString());
    }

    @Override // T2.d
    public final Sequence a(int i2) {
        int i4 = this.f4039b + i2;
        return i4 < 0 ? new c(this, i2) : new c(this.f4038a, i4);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new b(this);
    }
}
