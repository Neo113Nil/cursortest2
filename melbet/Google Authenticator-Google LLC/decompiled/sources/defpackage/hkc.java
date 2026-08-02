package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hkc {
    public final TimeUnit a;
    private final int b = 1;

    public hkc(TimeUnit timeUnit) {
        timeUnit.getClass();
        this.a = timeUnit;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hkc) {
            hkc hkcVar = (hkc) obj;
            int i = hkcVar.b;
            if (this.a == hkcVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 37;
    }

    public final String toString() {
        return "1 ".concat(this.a.toString());
    }
}
