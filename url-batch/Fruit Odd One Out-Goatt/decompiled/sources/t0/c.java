package t0;

import d1.h;
import java.io.Serializable;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f1173b;

    public c(Throwable th) {
        th.getClass();
        this.f1173b = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return h.a(this.f1173b, ((c) obj).f1173b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1173b.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f1173b + ')';
    }
}
