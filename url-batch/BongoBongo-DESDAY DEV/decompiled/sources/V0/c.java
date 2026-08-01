package V0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f941a;

    public c(Throwable th) {
        this.f941a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (h1.d.a(this.f941a, ((c) obj).f941a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f941a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f941a + ')';
    }
}
