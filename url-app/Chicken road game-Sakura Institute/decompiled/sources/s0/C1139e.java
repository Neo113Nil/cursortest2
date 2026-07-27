package s0;

/* renamed from: s0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1139e extends AbstractC1133b {

    /* renamed from: c, reason: collision with root package name */
    public static C1139e f10196c;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        return null;
     */
    @Override // s0.AbstractC1133b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] a(int i2) {
        int length = c().length();
        if (length <= 0 || i2 >= length) {
            return null;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < length && c().charAt(i2) == '\n' && !f(i2)) {
            i2++;
        }
        int i4 = i2 + 1;
        while (i4 < length && !e(i4)) {
            i4++;
        }
        return b(i2, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        return null;
     */
    @Override // s0.AbstractC1133b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] d(int i2) {
        int length = c().length();
        if (length <= 0 || i2 <= 0) {
            return null;
        }
        if (i2 > length) {
            i2 = length;
        }
        while (i2 > 0 && c().charAt(i2 - 1) == '\n' && !e(i2)) {
            i2--;
        }
        int i4 = i2 - 1;
        while (i4 > 0 && !f(i4)) {
            i4--;
        }
        return b(i4, i2);
    }

    public final boolean e(int i2) {
        return i2 > 0 && c().charAt(i2 + (-1)) != '\n' && (i2 == c().length() || c().charAt(i2) == '\n');
    }

    public final boolean f(int i2) {
        return c().charAt(i2) != '\n' && (i2 == 0 || c().charAt(i2 - 1) == '\n');
    }
}
