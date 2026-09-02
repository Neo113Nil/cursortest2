package v3;

import E.AbstractC0005f;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n implements j, d {

    /* renamed from: a, reason: collision with root package name */
    public final j f15717a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15718b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15719c;

    public n(j sequence, int i4, int i5) {
        kotlin.jvm.internal.i.e(sequence, "sequence");
        this.f15717a = sequence;
        this.f15718b = i4;
        this.f15719c = i5;
        if (i4 < 0) {
            throw new IllegalArgumentException(AbstractC0005f.j(i4, "startIndex should be non-negative, but is ").toString());
        }
        if (i5 < 0) {
            throw new IllegalArgumentException(AbstractC0005f.j(i5, "endIndex should be non-negative, but is ").toString());
        }
        if (i5 < i4) {
            throw new IllegalArgumentException(AbstractC0005f.i(i5, i4, "endIndex should be not less than startIndex, but was ", " < ").toString());
        }
    }

    @Override // v3.d
    public final j a(int i4) {
        int i5 = this.f15719c;
        int i6 = this.f15718b;
        return i4 >= i5 - i6 ? e.f15700a : new n(this.f15717a, i6 + i4, i5);
    }

    @Override // v3.j
    public final Iterator iterator() {
        return new i(this);
    }

    @Override // v3.d
    public final j take() {
        int i4 = this.f15719c;
        int i5 = this.f15718b;
        if (10 >= i4 - i5) {
            return this;
        }
        return new n(this.f15717a, i5, i5 + 10);
    }
}
