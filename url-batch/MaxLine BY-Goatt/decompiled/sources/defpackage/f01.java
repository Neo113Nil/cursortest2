package defpackage;

import com.facebook.internal.FacebookRequestErrorClassification;
import java.util.ArrayList;
import java.util.EnumMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class f01 extends z71 {
    public static final int[] C = {1, 1, 1, 1};
    public static final int[] D = {3, 1, 1};
    public static final int[][] E = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};
    public final /* synthetic */ int B;

    public /* synthetic */ f01(int i) {
        this.B = i;
    }

    public static void W(boolean[] zArr, int i, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i + 1;
            zArr[i] = iArr[i2] != 0;
            i2++;
            i = i3;
        }
    }

    public static int X(int i, String str) {
        int i2 = 0;
        int i3 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i2 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i3;
            i3++;
            if (i3 > i) {
                i3 = 1;
            }
        }
        return i2 % 47;
    }

    public static int Y(int i, String str) {
        char charAt;
        int length = str.length();
        if (i < length) {
            char charAt2 = str.charAt(i);
            if (charAt2 == 241) {
                return 4;
            }
            if (charAt2 >= '0' && charAt2 <= '9') {
                int i2 = i + 1;
                return (i2 < length && (charAt = str.charAt(i2)) >= '0' && charAt <= '9') ? 3 : 2;
            }
        }
        return 1;
    }

    public static void Z(int[] iArr, int i) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }

    public static void a0(int[] iArr, int i) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) == 0) {
                i3 = 0;
            }
            iArr[i2] = i3;
        }
    }

    @Override // defpackage.z71, defpackage.k93
    public final eo f(String str, int i, EnumMap enumMap) {
        switch (this.B) {
            case 0:
                if (i != 9) {
                    lh.e("Can only encode ITF, but got ".concat(q40.v(i)));
                    break;
                } else {
                    break;
                }
            case 1:
                if (i != 5) {
                    lh.e("Can only encode CODE_128, but got ".concat(q40.v(i)));
                    break;
                } else {
                    break;
                }
            case 2:
                if (i != 3) {
                    lh.e("Can only encode CODE_39, but got ".concat(q40.v(i)));
                    break;
                } else {
                    break;
                }
            default:
                if (i != 4) {
                    lh.e("Can only encode CODE_93, but got ".concat(q40.v(i)));
                    break;
                } else {
                    break;
                }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x0270, code lost:
    
        if (r10 < '`') goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02a9, code lost:
    
        if (Y(r7 + 3, r1) == 3) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02ab, code lost:
    
        r10 = 99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x02b9, code lost:
    
        if (r12 == 2) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x02c4, code lost:
    
        if (r12 == 3) goto L133;
     */
    @Override // defpackage.z71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean[] q(String str) {
        int i;
        int i2;
        int i3;
        char c;
        int Y;
        int i4;
        String str2 = str;
        char c2 = '`';
        char c3 = ' ';
        int i5 = 9;
        int i6 = 0;
        switch (this.B) {
            case 0:
                int length = str2.length();
                if (length % 2 != 0) {
                    lh.e("The length of the input should be even");
                } else {
                    if (length <= 80) {
                        boolean[] zArr = new boolean[(length * 9) + 9];
                        int e = z71.e(zArr, 0, C, true);
                        for (int i7 = 0; i7 < length; i7 += 2) {
                            int digit = Character.digit(str2.charAt(i7), 10);
                            int digit2 = Character.digit(str2.charAt(i7 + 1), 10);
                            int[] iArr = new int[10];
                            for (int i8 = 0; i8 < 5; i8++) {
                                int i9 = i8 * 2;
                                int[][] iArr2 = E;
                                iArr[i9] = iArr2[digit][i8];
                                iArr[i9 + 1] = iArr2[digit2][i8];
                            }
                            e += z71.e(zArr, e, iArr, true);
                        }
                        z71.e(zArr, e, D, true);
                        return zArr;
                    }
                    lh.e("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
                }
                return null;
            case 1:
                int[][] iArr3 = ev.n;
                int length2 = str2.length();
                if (length2 > 0 && length2 <= 80) {
                    for (int i10 = 0; i10 < length2; i10++) {
                        char charAt = str2.charAt(i10);
                        switch (charAt) {
                            case 241:
                            case 242:
                            case 243:
                            case 244:
                            default:
                                if (charAt > 127) {
                                    lh.e("Bad character in input: ".concat(String.valueOf(charAt)));
                                    break;
                                }
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    int i11 = 0;
                    int i12 = 0;
                    int i13 = 0;
                    int i14 = 1;
                    while (i11 < length2) {
                        int Y2 = Y(i11, str2);
                        int i15 = 100;
                        if (Y2 != 2) {
                            i = 103;
                            if (Y2 != 1) {
                                i2 = 96;
                                i3 = 99;
                                if (i13 != 99) {
                                    c = c3;
                                    if (i13 == 100) {
                                        if (Y2 != 4 && (Y = Y(i11 + 2, str2)) != 1 && Y != 2) {
                                            if (Y == 4) {
                                                break;
                                            } else {
                                                int i16 = i11 + 4;
                                                while (true) {
                                                    int Y3 = Y(i16, str2);
                                                    if (Y3 != 3) {
                                                        break;
                                                    } else {
                                                        i16 += 2;
                                                    }
                                                }
                                            }
                                        }
                                        i3 = 100;
                                    } else if (Y2 == 4) {
                                        Y2 = Y(i11 + 1, str2);
                                        break;
                                    }
                                } else {
                                    c = c3;
                                }
                            } else {
                                if (i11 < str2.length()) {
                                    char charAt2 = str2.charAt(i11);
                                    if (charAt2 >= c3) {
                                        if (i13 == 101) {
                                            i4 = 96;
                                            break;
                                        }
                                    } else {
                                        i4 = 96;
                                    }
                                    c = c3;
                                    i2 = i4;
                                    i3 = 101;
                                }
                                i4 = 96;
                                c = c3;
                                i2 = i4;
                                i3 = 100;
                            }
                        } else {
                            c = c3;
                            i3 = 100;
                            i = 103;
                            i2 = 96;
                        }
                        if (i3 == i13) {
                            switch (str2.charAt(i11)) {
                                case 241:
                                    i15 = FacebookRequestErrorClassification.EC_INVALID_SESSION;
                                    break;
                                case 242:
                                    i15 = 97;
                                    break;
                                case 243:
                                    i15 = i2;
                                    break;
                                case 244:
                                    if (i13 == 101) {
                                        i15 = 101;
                                        break;
                                    }
                                    break;
                                default:
                                    if (i13 != 100) {
                                        if (i13 != 101) {
                                            i15 = Integer.parseInt(str2.substring(i11, i11 + 2));
                                            i11++;
                                            break;
                                        } else {
                                            char charAt3 = str2.charAt(i11);
                                            i15 = charAt3 - ' ';
                                            if (i15 < 0) {
                                                i15 = charAt3 + '@';
                                                break;
                                            }
                                        }
                                    } else {
                                        i15 = str2.charAt(i11) - ' ';
                                        break;
                                    }
                                    break;
                            }
                            i11++;
                        } else {
                            i15 = i13 == 0 ? i3 != 100 ? i3 != 101 ? 105 : i : 104 : i3;
                            i13 = i3;
                        }
                        arrayList.add(iArr3[i15]);
                        i12 += i15 * i14;
                        if (i11 != 0) {
                            i14++;
                        }
                        c3 = c;
                    }
                    arrayList.add(iArr3[i12 % 103]);
                    arrayList.add(iArr3[106]);
                    int size = arrayList.size();
                    int i17 = 0;
                    int i18 = 0;
                    while (i18 < size) {
                        Object obj = arrayList.get(i18);
                        i18++;
                        for (int i19 : (int[]) obj) {
                            i17 += i19;
                        }
                    }
                    boolean[] zArr2 = new boolean[i17];
                    int size2 = arrayList.size();
                    int i20 = 0;
                    while (i20 < size2) {
                        Object obj2 = arrayList.get(i20);
                        i20++;
                        i6 += z71.e(zArr2, i6, (int[]) obj2, true);
                    }
                    return zArr2;
                }
                lh.e("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length2)));
                return null;
            case 2:
                int[] iArr4 = ev.o;
                int length3 = str2.length();
                if (length3 <= 80) {
                    int i21 = 0;
                    while (true) {
                        if (i21 < length3) {
                            if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str2.charAt(i21)) < 0) {
                                int length4 = str2.length();
                                StringBuilder sb = new StringBuilder();
                                int i22 = 0;
                                while (i22 < length4) {
                                    char charAt4 = str2.charAt(i22);
                                    if (charAt4 != 0) {
                                        if (charAt4 != ' ') {
                                            if (charAt4 == '@') {
                                                sb.append("%V");
                                            } else if (charAt4 == c2) {
                                                sb.append("%W");
                                            } else if (charAt4 != '-' && charAt4 != '.') {
                                                if (charAt4 <= 26) {
                                                    sb.append('$');
                                                    sb.append((char) (charAt4 + '@'));
                                                } else if (charAt4 < ' ') {
                                                    sb.append('%');
                                                    sb.append((char) (charAt4 + '&'));
                                                } else if (charAt4 <= ',' || charAt4 == '/' || charAt4 == ':') {
                                                    sb.append('/');
                                                    sb.append((char) (charAt4 + ' '));
                                                } else if (charAt4 <= '9') {
                                                    sb.append(charAt4);
                                                } else if (charAt4 <= '?') {
                                                    sb.append('%');
                                                    sb.append((char) (charAt4 + 11));
                                                } else if (charAt4 <= 'Z') {
                                                    sb.append(charAt4);
                                                } else if (charAt4 <= '_') {
                                                    sb.append('%');
                                                    sb.append((char) (charAt4 - 16));
                                                } else if (charAt4 <= 'z') {
                                                    sb.append('+');
                                                    sb.append((char) (charAt4 - ' '));
                                                } else {
                                                    if (charAt4 > 127) {
                                                        throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str2.charAt(i22) + "'");
                                                    }
                                                    sb.append('%');
                                                    sb.append((char) (charAt4 - '+'));
                                                }
                                            }
                                        }
                                        sb.append(charAt4);
                                    } else {
                                        sb.append("%U");
                                    }
                                    i22++;
                                    c2 = '`';
                                }
                                str2 = sb.toString();
                                length3 = str2.length();
                                if (length3 > 80) {
                                    lh.e(in1.l(length3, "Requested contents should be less than 80 digits long, but got ", " (extended full ASCII mode)"));
                                }
                            } else {
                                i21++;
                                c2 = '`';
                            }
                        }
                    }
                    int[] iArr5 = new int[9];
                    int i23 = length3 + 25;
                    for (int i24 = 0; i24 < length3; i24++) {
                        Z(iArr5, iArr4["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str2.charAt(i24))]);
                        for (int i25 = 0; i25 < 9; i25++) {
                            i23 += iArr5[i25];
                        }
                    }
                    boolean[] zArr3 = new boolean[i23];
                    Z(iArr5, 148);
                    int e2 = z71.e(zArr3, 0, iArr5, true);
                    int[] iArr6 = {1};
                    int e3 = z71.e(zArr3, e2, iArr6, false) + e2;
                    for (int i26 = 0; i26 < length3; i26++) {
                        Z(iArr5, iArr4["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str2.charAt(i26))]);
                        int e4 = z71.e(zArr3, e3, iArr5, true) + e3;
                        e3 = z71.e(zArr3, e4, iArr6, false) + e4;
                    }
                    Z(iArr5, 148);
                    z71.e(zArr3, e3, iArr5, true);
                    return zArr3;
                }
                lh.e("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length3)));
                return null;
            default:
                int[] iArr7 = ev.p;
                int length5 = str2.length();
                if (length5 > 80) {
                    lh.e("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length5)));
                    return null;
                }
                int[] iArr8 = new int[9];
                int length6 = ((str2.length() + 4) * 9) + 1;
                a0(iArr8, iArr7[47]);
                boolean[] zArr4 = new boolean[length6];
                W(zArr4, 0, iArr8);
                while (i6 < length5) {
                    a0(iArr8, iArr7["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str2.charAt(i6))]);
                    W(zArr4, i5, iArr8);
                    i5 += 9;
                    i6++;
                }
                int X = X(20, str2);
                a0(iArr8, iArr7[X]);
                W(zArr4, i5, iArr8);
                a0(iArr8, iArr7[X(15, str2 + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(X))]);
                W(zArr4, i5 + 9, iArr8);
                a0(iArr8, iArr7[47]);
                W(zArr4, i5 + 18, iArr8);
                zArr4[i5 + 27] = true;
                return zArr4;
        }
    }
}
