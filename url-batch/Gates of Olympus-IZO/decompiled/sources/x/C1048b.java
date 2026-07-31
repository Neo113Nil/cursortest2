package x;

/* renamed from: x.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1048b implements InterfaceC1047a {

    /* renamed from: a, reason: collision with root package name */
    public final float f8710a;

    public C1048b(float f3) {
        this.f8710a = f3;
    }

    @Override // x.InterfaceC1047a
    public final float a(long j3, M0.b bVar) {
        return bVar.F(this.f8710a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1048b) && M0.e.a(this.f8710a, ((C1048b) obj).f8710a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f8710a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f8710a + ".dp)";
    }
}
