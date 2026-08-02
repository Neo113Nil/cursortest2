package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ccl {
    public final String a;

    public ccl(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ccl) {
            return this.a.equals(((ccl) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Encoding{name=\"" + this.a + "\"}";
    }
}
