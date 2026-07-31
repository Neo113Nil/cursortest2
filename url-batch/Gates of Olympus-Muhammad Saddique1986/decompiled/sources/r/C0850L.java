package r;

/* renamed from: r.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0850L implements InterfaceC0849K {

    /* renamed from: a, reason: collision with root package name */
    public final float f7979a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7980b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7981c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7982d;

    public C0850L(float f3, float f4, float f5, float f6) {
        this.f7979a = f3;
        this.f7980b = f4;
        this.f7981c = f5;
        this.f7982d = f6;
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("Start padding must be non-negative");
        }
        if (f4 < 0.0f) {
            throw new IllegalArgumentException("Top padding must be non-negative");
        }
        if (f5 < 0.0f) {
            throw new IllegalArgumentException("End padding must be non-negative");
        }
        if (f6 < 0.0f) {
            throw new IllegalArgumentException("Bottom padding must be non-negative");
        }
    }

    @Override // r.InterfaceC0849K
    public final float a(O0.k kVar) {
        return kVar == O0.k.f3741d ? this.f7981c : this.f7979a;
    }

    @Override // r.InterfaceC0849K
    public final float b(O0.k kVar) {
        return kVar == O0.k.f3741d ? this.f7979a : this.f7981c;
    }

    @Override // r.InterfaceC0849K
    public final float c() {
        return this.f7982d;
    }

    @Override // r.InterfaceC0849K
    public final float d() {
        return this.f7980b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0850L)) {
            return false;
        }
        C0850L c0850l = (C0850L) obj;
        return O0.e.a(this.f7979a, c0850l.f7979a) && O0.e.a(this.f7980b, c0850l.f7980b) && O0.e.a(this.f7981c, c0850l.f7981c) && O0.e.a(this.f7982d, c0850l.f7982d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f7982d) + A.k.a(this.f7981c, A.k.a(this.f7980b, Float.hashCode(this.f7979a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) O0.e.b(this.f7979a)) + ", top=" + ((Object) O0.e.b(this.f7980b)) + ", end=" + ((Object) O0.e.b(this.f7981c)) + ", bottom=" + ((Object) O0.e.b(this.f7982d)) + ')';
    }
}
