package q;

import A.AbstractC0017m;

/* loaded from: classes.dex */
public final class a0 implements InterfaceC1021Z {

    /* renamed from: a, reason: collision with root package name */
    public final float f9234a;

    /* renamed from: b, reason: collision with root package name */
    public final float f9235b;

    /* renamed from: c, reason: collision with root package name */
    public final float f9236c;

    /* renamed from: d, reason: collision with root package name */
    public final float f9237d;

    public a0(float f4, float f5, float f6, float f7) {
        this.f9234a = f4;
        this.f9235b = f5;
        this.f9236c = f6;
        this.f9237d = f7;
        if (f4 < 0.0f) {
            throw new IllegalArgumentException("Start padding must be non-negative");
        }
        if (f5 < 0.0f) {
            throw new IllegalArgumentException("Top padding must be non-negative");
        }
        if (f6 < 0.0f) {
            throw new IllegalArgumentException("End padding must be non-negative");
        }
        if (f7 < 0.0f) {
            throw new IllegalArgumentException("Bottom padding must be non-negative");
        }
    }

    @Override // q.InterfaceC1021Z
    public final float a(M0.k kVar) {
        return kVar == M0.k.f3555d ? this.f9236c : this.f9234a;
    }

    @Override // q.InterfaceC1021Z
    public final float b(M0.k kVar) {
        return kVar == M0.k.f3555d ? this.f9234a : this.f9236c;
    }

    @Override // q.InterfaceC1021Z
    public final float c() {
        return this.f9237d;
    }

    @Override // q.InterfaceC1021Z
    public final float d() {
        return this.f9235b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return M0.e.a(this.f9234a, a0Var.f9234a) && M0.e.a(this.f9235b, a0Var.f9235b) && M0.e.a(this.f9236c, a0Var.f9236c) && M0.e.a(this.f9237d, a0Var.f9237d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f9237d) + AbstractC0017m.a(this.f9236c, AbstractC0017m.a(this.f9235b, Float.hashCode(this.f9234a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) M0.e.c(this.f9234a)) + ", top=" + ((Object) M0.e.c(this.f9235b)) + ", end=" + ((Object) M0.e.c(this.f9236c)) + ", bottom=" + ((Object) M0.e.c(this.f9237d)) + ')';
    }
}
