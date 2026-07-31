package l6;

/* loaded from: classes.dex */
class b extends a {
    public static final boolean d(char c7, char c8, boolean z6) {
        if (c7 == c8) {
            return true;
        }
        if (!z6) {
            return false;
        }
        char upperCase = Character.toUpperCase(c7);
        char upperCase2 = Character.toUpperCase(c8);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
