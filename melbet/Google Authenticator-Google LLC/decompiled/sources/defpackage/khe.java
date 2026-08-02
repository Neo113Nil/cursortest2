package defpackage;

import j$.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class khe {
    final int a;
    final long b;
    final Set c;

    public khe(int i, long j, Set set) {
        this.a = i;
        this.b = j;
        this.c = hfm.n(set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            khe kheVar = (khe) obj;
            if (this.a == kheVar.a && this.b == kheVar.b && Objects.equals(this.c, kheVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Long.valueOf(this.b), this.c);
    }

    public final String toString() {
        gzo T = hoq.T(this);
        T.e("maxAttempts", this.a);
        T.f("hedgingDelayNanos", this.b);
        T.b("nonFatalStatusCodes", this.c);
        return T.toString();
    }
}
