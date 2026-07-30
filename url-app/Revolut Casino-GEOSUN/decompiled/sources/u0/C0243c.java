package u0;

import F0.i;
import java.io.Serializable;

/* renamed from: u0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0243c implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f3000e;

    public C0243c(Throwable th) {
        i.e(th, "exception");
        this.f3000e = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0243c) {
            if (i.a(this.f3000e, ((C0243c) obj).f3000e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3000e.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f3000e + ')';
    }
}
