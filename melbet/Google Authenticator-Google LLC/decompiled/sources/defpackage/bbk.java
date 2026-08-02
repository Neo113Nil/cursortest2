package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bbk {
    public static final bbj a = new bbi();
    public final Object b;
    public final bbj c;
    public final String d;
    public volatile byte[] e;

    public bbk(String str, Object obj, bbj bbjVar) {
        a.U(str);
        this.d = str;
        this.b = obj;
        this.c = bbjVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bbk) {
            return this.d.equals(((bbk) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "Option{key='" + this.d + "'}";
    }
}
