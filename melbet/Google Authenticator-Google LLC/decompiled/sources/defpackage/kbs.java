package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kbs {
    private final kbq a;
    private final Object b;

    public kbs(kbq kbqVar, Object obj) {
        this.a = kbqVar;
        this.b = obj;
    }

    public static kbs b(kbq kbqVar) {
        kbs kbsVar = new kbs(kbqVar, null);
        hoq.C(!kbqVar.g(), "cannot use OK status: %s", kbqVar);
        return kbsVar;
    }

    public final kbq a() {
        kbq kbqVar = this.a;
        return kbqVar == null ? kbq.b : kbqVar;
    }

    public final Object c() {
        if (this.a == null) {
            return this.b;
        }
        throw new IllegalStateException("No value present.");
    }

    public final boolean d() {
        return this.a == null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kbs)) {
            return false;
        }
        kbs kbsVar = (kbs) obj;
        if (d() == kbsVar.d()) {
            return d() ? Objects.equals(this.b, kbsVar.b) : Objects.equals(this.a, kbsVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        gzo T = hoq.T(this);
        kbq kbqVar = this.a;
        if (kbqVar == null) {
            T.b("value", this.b);
        } else {
            T.b("error", kbqVar);
        }
        return T.toString();
    }
}
