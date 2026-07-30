package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class g81 {
    public static final g81 b = new g81(0, 127);
    public final int a;

    public g81(int i, int i2) {
        this.a = (i2 & 4) != 0 ? 0 : i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g81) && this.a == ((g81) obj).a;
    }

    public final int hashCode() {
        return q40.e(-1, q40.e(this.a, Integer.hashCode(-1) * 961, 31), 29791);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) "Unspecified") + ", autoCorrectEnabled=null, keyboardType=" + ((Object) h81.a(this.a)) + ", imeAction=" + ((Object) "Unspecified") + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }
}
