package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfq {
    public static final jfq a = new jfq(true, true, true, null);
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final jho e;

    public jfq(boolean z, boolean z2, boolean z3, jho jhoVar) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = jhoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfq)) {
            return false;
        }
        jfq jfqVar = (jfq) obj;
        return this.b == jfqVar.b && this.c == jfqVar.c && this.d == jfqVar.d && this.e == jfqVar.e;
    }

    public final int hashCode() {
        jho jhoVar = this.e;
        return (((((a.m(this.b) * 31) + a.m(this.c)) * 31) + a.m(this.d)) * 31) + (jhoVar == null ? 0 : jhoVar.hashCode());
    }

    public final String toString() {
        return "AccountCapabilities(canDisplayEmailAddress=" + this.b + ", canUseIncognitoMode=" + this.c + ", canUseWithoutAnAccount=" + this.d + ", subscriptionTier=" + this.e + ")";
    }

    public jfq() {
        this(false, false, false, null);
    }
}
