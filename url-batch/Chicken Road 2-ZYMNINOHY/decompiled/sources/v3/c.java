package v3;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements j, d {

    /* renamed from: a, reason: collision with root package name */
    public final j f15698a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15699b;

    public c(j sequence, int i4) {
        kotlin.jvm.internal.i.e(sequence, "sequence");
        this.f15698a = sequence;
        this.f15699b = i4;
        if (i4 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i4 + '.').toString());
    }

    @Override // v3.d
    public final j a(int i4) {
        int i5 = this.f15699b + i4;
        return i5 < 0 ? new c(this, i4) : new c(this.f15698a, i5);
    }

    @Override // v3.j
    public final Iterator iterator() {
        return new C1480b(this);
    }

    @Override // v3.d
    public final j take() {
        int i4 = this.f15699b;
        int i5 = i4 + 10;
        return i5 < 0 ? new o(this) : new n(this.f15698a, i4, i5);
    }
}
