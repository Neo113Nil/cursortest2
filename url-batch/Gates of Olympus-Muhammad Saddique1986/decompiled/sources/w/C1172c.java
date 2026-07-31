package w;

import a0.C0241f;

/* renamed from: w.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1172c implements InterfaceC1170a {

    /* renamed from: a, reason: collision with root package name */
    public final float f9834a;

    public C1172c(float f3) {
        this.f9834a = f3;
        if (f3 < 0.0f || f3 > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // w.InterfaceC1170a
    public final float a(long j3, O0.b bVar) {
        return (this.f9834a / 100.0f) * C0241f.c(j3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1172c) && Float.compare(this.f9834a, ((C1172c) obj).f9834a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9834a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f9834a + "%)";
    }
}
