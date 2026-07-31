package x1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d extends w4.u {

    /* renamed from: c, reason: collision with root package name */
    public static d f8393c;

    @Override // w4.u
    public final int[] b(int i) {
        int length = n().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && n().charAt(i) == '\n' && (n().charAt(i) == '\n' || (i != 0 && n().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i8 = i + 1;
        while (i8 < length && !t(i8)) {
            i8++;
        }
        return l(i, i8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        return null;
     */
    @Override // w4.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] s(int i) {
        int length = n().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && n().charAt(i - 1) == '\n' && !t(i)) {
            i--;
        }
        int i8 = i - 1;
        while (i8 > 0 && (n().charAt(i8) == '\n' || (i8 != 0 && n().charAt(i8 - 1) != '\n'))) {
            i8--;
        }
        return l(i8, i);
    }

    public final boolean t(int i) {
        if (i <= 0 || n().charAt(i - 1) == '\n') {
            return false;
        }
        return i == n().length() || n().charAt(i) == '\n';
    }
}
