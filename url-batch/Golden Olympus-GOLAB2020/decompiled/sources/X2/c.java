package X2;

/* loaded from: classes3.dex */
class c implements e {

    /* renamed from: a, reason: collision with root package name */
    protected final int[] f9720a;

    c(int[] iArr) {
        this.f9720a = Z2.a.d(iArr);
    }

    @Override // X2.e
    public int[] a() {
        return Z2.a.d(this.f9720a);
    }

    @Override // X2.e
    public int b() {
        return this.f9720a[r0.length - 1];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return Z2.a.b(this.f9720a, ((c) obj).f9720a);
        }
        return false;
    }

    public int hashCode() {
        return Z2.a.i(this.f9720a);
    }
}
