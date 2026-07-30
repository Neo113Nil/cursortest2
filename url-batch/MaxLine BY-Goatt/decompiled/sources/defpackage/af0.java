package defpackage;

import java.util.EnumMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class af0 extends z71 {
    public final /* synthetic */ int B;

    public /* synthetic */ af0(int i) {
        this.B = i;
    }

    @Override // defpackage.z71, defpackage.k93
    public final eo f(String str, int i, EnumMap enumMap) {
        switch (this.B) {
            case 0:
                if (i != 8) {
                    lh.e("Can only encode EAN_13, but got ".concat(q40.v(i)));
                    break;
                } else {
                    break;
                }
            case 1:
                if (i != 7) {
                    lh.e("Can only encode EAN_8, but got ".concat(q40.v(i)));
                    break;
                } else {
                    break;
                }
            default:
                if (i != 16) {
                    lh.e("Can only encode UPC_E, but got ".concat(q40.v(i)));
                    break;
                } else {
                    break;
                }
        }
        return null;
    }

    @Override // defpackage.z71
    public final boolean[] q(String str) {
        boolean[] zArr = null;
        switch (this.B) {
            case 0:
                int length = str.length();
                if (length != 12) {
                    if (length == 13) {
                        try {
                            if (!s13.d0(str)) {
                                throw new IllegalArgumentException("Contents do not pass checksum");
                            }
                        } catch (rq0 unused) {
                            lh.e("Illegal contents");
                        }
                    } else {
                        lh.e("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
                    }
                    return zArr;
                }
                try {
                    str = str + s13.e0(str);
                } catch (rq0 e) {
                    throw new IllegalArgumentException(e);
                }
                int i = ze0.q[Character.digit(str.charAt(0), 10)];
                zArr = new boolean[95];
                int e2 = z71.e(zArr, 0, s13.l, true);
                for (int i2 = 1; i2 <= 6; i2++) {
                    int digit = Character.digit(str.charAt(i2), 10);
                    if (((i >> (6 - i2)) & 1) == 1) {
                        digit += 10;
                    }
                    e2 += z71.e(zArr, e2, s13.p[digit], false);
                }
                int e3 = z71.e(zArr, e2, s13.m, false) + e2;
                for (int i3 = 7; i3 <= 12; i3++) {
                    e3 += z71.e(zArr, e3, s13.o[Character.digit(str.charAt(i3), 10)], true);
                }
                z71.e(zArr, e3, s13.l, true);
                return zArr;
            case 1:
                int length2 = str.length();
                if (length2 != 7) {
                    if (length2 == 8) {
                        try {
                            if (!s13.d0(str)) {
                                throw new IllegalArgumentException("Contents do not pass checksum");
                            }
                        } catch (rq0 unused2) {
                            lh.e("Illegal contents");
                        }
                    } else {
                        lh.e("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length2)));
                    }
                    return zArr;
                }
                try {
                    str = str + s13.e0(str);
                } catch (rq0 e4) {
                    throw new IllegalArgumentException(e4);
                }
                zArr = new boolean[67];
                int e5 = z71.e(zArr, 0, s13.l, true);
                for (int i4 = 0; i4 <= 3; i4++) {
                    e5 += z71.e(zArr, e5, s13.o[Character.digit(str.charAt(i4), 10)], false);
                }
                int e6 = z71.e(zArr, e5, s13.m, false) + e5;
                for (int i5 = 4; i5 <= 7; i5++) {
                    e6 += z71.e(zArr, e6, s13.o[Character.digit(str.charAt(i5), 10)], true);
                }
                z71.e(zArr, e6, s13.l, true);
                return zArr;
            default:
                int length3 = str.length();
                if (length3 != 7) {
                    if (length3 == 8) {
                        try {
                            if (!s13.d0(str)) {
                                throw new IllegalArgumentException("Contents do not pass checksum");
                            }
                        } catch (rq0 unused3) {
                            lh.e("Illegal contents");
                        }
                    } else {
                        lh.e("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length3)));
                    }
                    return zArr;
                }
                try {
                    str = str + s13.e0(ze0.f0(str));
                } catch (rq0 e7) {
                    throw new IllegalArgumentException(e7);
                }
                int digit2 = Character.digit(str.charAt(0), 10);
                if (digit2 == 0 || digit2 == 1) {
                    int i6 = ze0.r[digit2][Character.digit(str.charAt(7), 10)];
                    zArr = new boolean[51];
                    int e8 = z71.e(zArr, 0, s13.l, true);
                    for (int i7 = 1; i7 <= 6; i7++) {
                        int digit3 = Character.digit(str.charAt(i7), 10);
                        if (((i6 >> (6 - i7)) & 1) == 1) {
                            digit3 += 10;
                        }
                        e8 += z71.e(zArr, e8, s13.p[digit3], false);
                    }
                    z71.e(zArr, e8, s13.n, false);
                } else {
                    lh.e("Number system must be 0 or 1");
                }
                return zArr;
        }
    }

    @Override // defpackage.z71
    public final int v() {
        return 9;
    }
}
