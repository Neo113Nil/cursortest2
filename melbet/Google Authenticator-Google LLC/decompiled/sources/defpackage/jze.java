package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jze {
    public static final jze a = new jze(null, kbq.b, false);
    public final jzh b;
    public final kbq c;
    public final boolean d;
    private final iwv e = null;

    private jze(jzh jzhVar, kbq kbqVar, boolean z) {
        this.b = jzhVar;
        kbqVar.getClass();
        this.c = kbqVar;
        this.d = z;
    }

    public static jze a(kbq kbqVar) {
        hoq.y(!kbqVar.g(), "drop status shouldn't be OK");
        return new jze(null, kbqVar, true);
    }

    public static jze b(kbq kbqVar) {
        hoq.y(!kbqVar.g(), "error status shouldn't be OK");
        return new jze(null, kbqVar, false);
    }

    public static jze d(jzh jzhVar) {
        return new jze(jzhVar, kbq.b, false);
    }

    public final boolean c() {
        return (this.b == null && this.c.g()) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jze)) {
            return false;
        }
        jze jzeVar = (jze) obj;
        if (Objects.equals(this.b, jzeVar.b) && Objects.equals(this.c, jzeVar.c)) {
            iwv iwvVar = jzeVar.e;
            if (Objects.equals(null, null) && this.d == jzeVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c, null, Boolean.valueOf(this.d));
    }

    public final String toString() {
        gzo T = hoq.T(this);
        T.b("subchannel", this.b);
        T.b("streamTracerFactory", null);
        T.b("status", this.c);
        T.g("drop", this.d);
        T.b("authority-override", null);
        return T.toString();
    }
}
