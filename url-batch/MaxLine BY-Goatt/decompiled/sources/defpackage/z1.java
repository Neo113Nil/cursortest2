package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class z1 extends b90 {
    public static z1 c;

    @Override // defpackage.b90
    public final int[] f(int i) {
        int length = j().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && j().charAt(i) == '\n' && (j().charAt(i) == '\n' || (i != 0 && j().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !o(i2)) {
            i2++;
        }
        return i(i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        return null;
     */
    @Override // defpackage.b90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] m(int i) {
        int length = j().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && j().charAt(i - 1) == '\n' && !o(i)) {
            i--;
        }
        int i2 = i - 1;
        while (i2 > 0 && (j().charAt(i2) == '\n' || (i2 != 0 && j().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return i(i2, i);
    }

    public final boolean o(int i) {
        if (i <= 0 || j().charAt(i - 1) == '\n') {
            return false;
        }
        return i == j().length() || j().charAt(i) == '\n';
    }
}
