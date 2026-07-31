package kotlin.text;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class a extends CharsKt__CharJVMKt {
    public static final boolean e(char c4, char c5, boolean z4) {
        if (c4 == c5) {
            return true;
        }
        if (!z4) {
            return false;
        }
        char upperCase = Character.toUpperCase(c4);
        char upperCase2 = Character.toUpperCase(c5);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static String f(char c4) {
        return v.a(c4);
    }
}
