package j0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f3928a = f1.s.f2704h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v1) {
            return f1.s.c(this.f3928a, ((v1) obj).f3928a);
        }
        return false;
    }

    public final int hashCode() {
        int i = f1.s.i;
        return Long.hashCode(this.f3928a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) f1.s.i(this.f3928a)) + ", rippleAlpha=null)";
    }
}
