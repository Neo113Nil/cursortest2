package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class kh0 {
    public final String a;

    public kh0(String str) {
        if (str != null) {
            this.a = str;
        } else {
            ch2.l("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh0)) {
            return false;
        }
        return this.a.equals(((kh0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return q40.p(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
