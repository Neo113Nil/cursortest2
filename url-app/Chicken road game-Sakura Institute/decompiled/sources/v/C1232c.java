package v;

import Y.f;

/* renamed from: v.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1232c implements InterfaceC1230a {

    /* renamed from: a, reason: collision with root package name */
    public final float f10967a;

    public C1232c(float f4) {
        this.f10967a = f4;
        if (f4 < 0.0f || f4 > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // v.InterfaceC1230a
    public final float a(long j4, M0.b bVar) {
        return (this.f10967a / 100.0f) * f.c(j4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1232c) && Float.compare(this.f10967a, ((C1232c) obj).f10967a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10967a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f10967a + "%)";
    }
}
