package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bfy {
    public final String a;

    public bfy(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bfy) {
            return this.a.equals(((bfy) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StringHeaderFactory{value='" + this.a + "'}";
    }
}
