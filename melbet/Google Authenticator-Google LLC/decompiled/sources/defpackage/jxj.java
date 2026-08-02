package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxj {
    public final jxi a;
    public final kbq b;

    public jxj(jxi jxiVar, kbq kbqVar) {
        jxiVar.getClass();
        this.a = jxiVar;
        kbqVar.getClass();
        this.b = kbqVar;
    }

    public static jxj a(jxi jxiVar) {
        hoq.y(jxiVar != jxi.c, "state is TRANSIENT_ERROR. Use forError() instead");
        return new jxj(jxiVar, kbq.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jxj)) {
            return false;
        }
        jxj jxjVar = (jxj) obj;
        return this.a.equals(jxjVar.a) && this.b.equals(jxjVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        kbq kbqVar = this.b;
        boolean g = kbqVar.g();
        jxi jxiVar = this.a;
        if (g) {
            return jxiVar.toString();
        }
        return jxiVar.toString() + "(" + kbqVar.toString() + ")";
    }
}
