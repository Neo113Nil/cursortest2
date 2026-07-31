package q;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final r.v f5885a;

    public o0(r.v vVar) {
        this.f5885a = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0) {
            return Float.compare(0.0f, 0.0f) == 0 && q6.i.a(this.f5885a, ((o0) obj).f5885a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5885a.hashCode() + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.f5885a + ')';
    }
}
