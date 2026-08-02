package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hpp {
    public final String a;

    static {
        new hpp("about:invalid#zGuavaz");
    }

    public hpp(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hpp) {
            return this.a.equals(((hpp) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 18288376;
    }

    public final String toString() {
        return "SafeUrl{" + this.a + "}";
    }
}
