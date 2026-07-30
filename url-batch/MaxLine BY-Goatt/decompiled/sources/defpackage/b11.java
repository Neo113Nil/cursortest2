package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class b11 {
    public final int a;

    public static String a(int i) {
        return i == -1 ? "Unspecified" : i == 0 ? "None" : i == 1 ? "Default" : i == 2 ? "Go" : i == 3 ? "Search" : i == 4 ? "Send" : i == 5 ? "Previous" : i == 6 ? "Next" : i == 7 ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b11) {
            return this.a == ((b11) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
