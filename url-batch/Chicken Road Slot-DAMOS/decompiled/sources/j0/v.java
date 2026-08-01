package j0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final long f4896a = k1.p.g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            return k1.p.c(this.f4896a, ((v) obj).f4896a);
        }
        return false;
    }

    public final int hashCode() {
        int i3 = k1.p.f5341h;
        hd.z zVar = hd.a0.f4495e;
        return Long.hashCode(this.f4896a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) k1.p.h(this.f4896a)) + ", rippleAlpha=null)";
    }
}
