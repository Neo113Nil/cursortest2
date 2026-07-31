package x;

import a0.f;

/* renamed from: x.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1049c implements InterfaceC1047a {

    /* renamed from: a, reason: collision with root package name */
    public final float f8711a;

    public C1049c(float f3) {
        this.f8711a = f3;
        if (f3 < 0.0f || f3 > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // x.InterfaceC1047a
    public final float a(long j3, M0.b bVar) {
        return (this.f8711a / 100.0f) * f.c(j3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1049c) && Float.compare(this.f8711a, ((C1049c) obj).f8711a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8711a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f8711a + "%)";
    }
}
