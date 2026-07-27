package kotlin.text;

/* renamed from: kotlin.text.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0754a extends CharsKt__CharJVMKt {
    public static final boolean a(char c4, char c5, boolean z4) {
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
}
