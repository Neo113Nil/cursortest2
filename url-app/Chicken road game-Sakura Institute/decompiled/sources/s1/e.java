package s1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: c, reason: collision with root package name */
    public static e f8200c;

    @Override // s1.b
    public final int[] a(int i7) {
        int length = c().length();
        if (length <= 0 || i7 >= length) {
            return null;
        }
        if (i7 < 0) {
            i7 = 0;
        }
        while (i7 < length && c().charAt(i7) == '\n' && (c().charAt(i7) == '\n' || (i7 != 0 && c().charAt(i7 - 1) != '\n'))) {
            i7++;
        }
        if (i7 >= length) {
            return null;
        }
        int i8 = i7 + 1;
        while (i8 < length && !e(i8)) {
            i8++;
        }
        return b(i7, i8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        return null;
     */
    @Override // s1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] d(int i7) {
        int length = c().length();
        if (length <= 0 || i7 <= 0) {
            return null;
        }
        if (i7 > length) {
            i7 = length;
        }
        while (i7 > 0 && c().charAt(i7 - 1) == '\n' && !e(i7)) {
            i7--;
        }
        int i8 = i7 - 1;
        while (i8 > 0 && (c().charAt(i8) == '\n' || (i8 != 0 && c().charAt(i8 - 1) != '\n'))) {
            i8--;
        }
        return b(i8, i7);
    }

    public final boolean e(int i7) {
        if (i7 <= 0 || c().charAt(i7 - 1) == '\n') {
            return false;
        }
        return i7 == c().length() || c().charAt(i7) == '\n';
    }
}
