package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class sp2 extends rp2 {
    /* JADX WARN: Removed duplicated region for block: B:120:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean e(String str) {
        char c;
        boolean z;
        boolean z2;
        int charAt;
        int charAt2;
        int i;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        int length = str.length() - 1;
        int i2 = 0;
        while (true) {
            c = ' ';
            if (i2 > length || str.charAt(i2) > ' ') {
                break;
            }
            i2++;
        }
        if (i2 <= length) {
            while (length > i2 && str.charAt(length) <= ' ') {
                length--;
            }
            if (str.charAt(i2) == '+' || str.charAt(i2) == '-') {
                i2++;
            }
            if (i2 <= length) {
                if (str.charAt(i2) == '0') {
                    int i3 = i2 + 1;
                    if (i3 > length) {
                        return true;
                    }
                    if ((str.charAt(i3) | ' ') == 120) {
                        int i4 = i2 + 2;
                        int i5 = i4;
                        while (true) {
                            if (i5 > length) {
                                z = z5;
                                break;
                            }
                            z = z5;
                            if (((str.charAt(i5) - '0') & 65535) >= 10 && (((r15 | ' ') - 97) & 65535) >= 6) {
                                break;
                            }
                            i5++;
                            z5 = z;
                        }
                        boolean z6 = i4 != i5 ? z : false;
                        if (i5 <= length) {
                            if (str.charAt(i5) == '.') {
                                int i6 = i5 + 1;
                                int i7 = i6;
                                while (i7 <= length) {
                                    char c2 = c;
                                    if (((str.charAt(i7) - '0') & 65535) >= 10 && (((r15 | ' ') - 97) & 65535) >= 6) {
                                        break;
                                    }
                                    i7++;
                                    c = c2;
                                }
                                z4 = i6 != i7 ? z : false;
                                i5 = i7;
                            } else {
                                z4 = false;
                            }
                            if (z6 || z4) {
                                i2 = i5;
                                if (i2 != -1 && i2 <= length) {
                                    z2 = z;
                                    if (!z2) {
                                        int i8 = i2;
                                        while (i8 <= length && ((str.charAt(i8) - '0') & 65535) < 10) {
                                            i8++;
                                        }
                                        boolean z7 = i2 != i8 ? z : false;
                                        if (i8 > length) {
                                            i2 = i8;
                                        } else {
                                            if (str.charAt(i8) == '.') {
                                                int i9 = i8 + 1;
                                                i = i9;
                                                while (i <= length && ((str.charAt(i) - '0') & 65535) < 10) {
                                                    i++;
                                                }
                                                if (i9 != i) {
                                                    z3 = z;
                                                    if (!z7 || z3) {
                                                        i2 = i;
                                                    } else {
                                                        String str2 = length == i + 2 ? "NaN" : length == i + 7 ? "Infinity" : null;
                                                        i2 = (str2 != null && up2.u(str, str2, i, false) == i) ? length + 1 : -1;
                                                    }
                                                }
                                            } else {
                                                i = i8;
                                            }
                                            z3 = false;
                                            if (z7) {
                                            }
                                            i2 = i;
                                        }
                                        if (i2 != -1) {
                                            if (i2 > length) {
                                                return z;
                                            }
                                        }
                                    }
                                    int i10 = i2 + 1;
                                    charAt = str.charAt(i2) | ' ';
                                    if (charAt != (z2 ? 112 : 101)) {
                                        if (!z2 && ((charAt == 102 || charAt == 100) && i10 > length)) {
                                            return z;
                                        }
                                    } else if (i10 <= length && ((str.charAt(i10) != '+' && str.charAt(i10) != '-') || (i10 = i2 + 2) <= length)) {
                                        while (i10 <= length && ((str.charAt(i10) - '0') & 65535) < 10) {
                                            i10++;
                                        }
                                        if (i10 > length) {
                                            return z;
                                        }
                                        if (i10 == length && ((charAt2 = str.charAt(i10) | ' ') == 102 || charAt2 == 100)) {
                                            return z;
                                        }
                                    }
                                }
                            }
                        }
                        i2 = -1;
                        if (i2 != -1) {
                            z2 = z;
                            if (!z2) {
                            }
                            int i102 = i2 + 1;
                            charAt = str.charAt(i2) | ' ';
                            if (charAt != (z2 ? 112 : 101)) {
                            }
                        }
                    }
                }
                z = true;
                z2 = false;
                if (!z2) {
                }
                int i1022 = i2 + 1;
                charAt = str.charAt(i2) | ' ';
                if (charAt != (z2 ? 112 : 101)) {
                }
            }
        }
        return false;
    }
}
