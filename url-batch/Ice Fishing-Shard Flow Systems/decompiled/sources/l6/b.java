package l6;

import java.util.Iterator;
import kotlin.collections.E;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes.dex */
public final class b implements Sequence, c {

    /* renamed from: a, reason: collision with root package name */
    public final Sequence f6307a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6308b;

    public b(Sequence sequence, int i2) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f6307a = sequence;
        this.f6308b = i2;
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i2 + '.').toString());
    }

    @Override // l6.c
    public final Sequence a(int i2) {
        int i5 = this.f6308b + i2;
        return i5 < 0 ? new b(this, i2) : new b(this.f6307a, i5);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new E(this);
    }
}
