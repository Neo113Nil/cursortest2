package v;

/* renamed from: v.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1231b implements InterfaceC1230a {

    /* renamed from: a, reason: collision with root package name */
    public final float f10966a;

    public C1231b(float f4) {
        this.f10966a = f4;
    }

    @Override // v.InterfaceC1230a
    public final float a(long j4, M0.b bVar) {
        return bVar.L(this.f10966a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1231b) && M0.e.a(this.f10966a, ((C1231b) obj).f10966a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f10966a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f10966a + ".dp)";
    }
}
