package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fv extends z71 {
    public static final char[] B;
    public static final char[] C = {'T', 'N', '*', 'E'};
    public static final char[] D = {'/', ':', '+', '.'};
    public static final char E;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        B = cArr;
        E = cArr[0];
    }

    @Override // defpackage.z71
    public final boolean[] q(String str) {
        int i;
        int length = str.length();
        char c = E;
        if (length < 2) {
            str = c + str + c;
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = B;
            boolean d0 = ev.d0(cArr, upperCase);
            boolean d02 = ev.d0(cArr, upperCase2);
            char[] cArr2 = C;
            boolean d03 = ev.d0(cArr2, upperCase);
            boolean d04 = ev.d0(cArr2, upperCase2);
            if (d0) {
                if (!d02) {
                    lh.e("Invalid start/end guards: ".concat(str));
                    return null;
                }
            } else if (!d03) {
                if (d02 || d04) {
                    lh.e("Invalid start/end guards: ".concat(str));
                    return null;
                }
                str = c + str + c;
            } else if (!d04) {
                lh.e("Invalid start/end guards: ".concat(str));
                return null;
            }
        }
        int i2 = 20;
        for (int i3 = 1; i3 < str.length() - 1; i3++) {
            if (Character.isDigit(str.charAt(i3)) || str.charAt(i3) == '-' || str.charAt(i3) == '$') {
                i2 += 9;
            } else {
                if (!ev.d0(D, str.charAt(i3))) {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i3) + '\'');
                }
                i2 += 10;
            }
        }
        boolean[] zArr = new boolean[(str.length() - 1) + i2];
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i5));
            if (i5 == 0 || i5 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i6 = 0;
            while (true) {
                char[] cArr3 = ev.l;
                if (i6 >= 20) {
                    i = 0;
                    break;
                }
                if (upperCase3 == cArr3[i6]) {
                    i = ev.m[i6];
                    break;
                }
                i6++;
            }
            int i7 = 0;
            int i8 = 0;
            boolean z = true;
            while (i7 < 7) {
                zArr[i4] = z;
                i4++;
                if (((i >> (6 - i7)) & 1) == 0 || i8 == 1) {
                    z = !z;
                    i7++;
                    i8 = 0;
                } else {
                    i8++;
                }
            }
            if (i5 < str.length() - 1) {
                zArr[i4] = false;
                i4++;
            }
        }
        return zArr;
    }
}
