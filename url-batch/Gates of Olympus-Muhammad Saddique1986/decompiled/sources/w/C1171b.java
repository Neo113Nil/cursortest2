package w;

/* renamed from: w.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1171b implements InterfaceC1170a {

    /* renamed from: a, reason: collision with root package name */
    public final float f9833a;

    public C1171b(float f3) {
        this.f9833a = f3;
    }

    @Override // w.InterfaceC1170a
    public final float a(long j3, O0.b bVar) {
        return bVar.J(this.f9833a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1171b) && O0.e.a(this.f9833a, ((C1171b) obj).f9833a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f9833a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f9833a + ".dp)";
    }
}
