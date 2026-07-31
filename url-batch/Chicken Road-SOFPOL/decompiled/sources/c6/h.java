package c6;

import java.io.Serializable;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final Throwable f1749d;

    public h(Throwable th) {
        q6.i.e(th, "exception");
        this.f1749d = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return q6.i.a(this.f1749d, ((h) obj).f1749d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1749d.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f1749d + ')';
    }
}
