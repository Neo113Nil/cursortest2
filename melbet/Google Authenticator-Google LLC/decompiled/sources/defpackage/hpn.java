package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hpn {
    public final String a;

    static {
        new hpn("");
        new hpn("<br>");
        new hpn("<!DOCTYPE html>");
    }

    public hpn(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hpn) {
            return this.a.equals(((hpn) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 867184553;
    }

    public final String toString() {
        return "SafeHtml{" + this.a + "}";
    }
}
