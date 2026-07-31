package u0;

/* renamed from: u0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0968e extends AbstractC0962b {

    /* renamed from: c, reason: collision with root package name */
    public static C0968e f8321c;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        return null;
     */
    @Override // u0.AbstractC0962b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] a(int i3) {
        int length = c().length();
        if (length <= 0 || i3 >= length) {
            return null;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        while (i3 < length && c().charAt(i3) == '\n' && !f(i3)) {
            i3++;
        }
        int i4 = i3 + 1;
        while (i4 < length && !e(i4)) {
            i4++;
        }
        return b(i3, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        return null;
     */
    @Override // u0.AbstractC0962b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] d(int i3) {
        int length = c().length();
        if (length <= 0 || i3 <= 0) {
            return null;
        }
        if (i3 > length) {
            i3 = length;
        }
        while (i3 > 0 && c().charAt(i3 - 1) == '\n' && !e(i3)) {
            i3--;
        }
        int i4 = i3 - 1;
        while (i4 > 0 && !f(i4)) {
            i4--;
        }
        return b(i4, i3);
    }

    public final boolean e(int i3) {
        return i3 > 0 && c().charAt(i3 + (-1)) != '\n' && (i3 == c().length() || c().charAt(i3) == '\n');
    }

    public final boolean f(int i3) {
        return c().charAt(i3) != '\n' && (i3 == 0 || c().charAt(i3 - 1) == '\n');
    }
}
