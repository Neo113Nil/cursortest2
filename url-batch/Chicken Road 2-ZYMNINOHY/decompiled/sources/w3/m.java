package w3;

/* loaded from: classes.dex */
public abstract class m extends l {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean U(String str) {
        char c4;
        boolean z;
        boolean z4;
        int charAt;
        int i4;
        boolean z5;
        boolean z6;
        boolean z7 = true;
        int length = str.length() - 1;
        int i5 = 0;
        while (true) {
            c4 = ' ';
            if (i5 > length || str.charAt(i5) > ' ') {
                break;
            }
            i5++;
        }
        if (i5 > length) {
            return false;
        }
        while (length > i5 && str.charAt(length) <= ' ') {
            length--;
        }
        if (str.charAt(i5) == '+' || str.charAt(i5) == '-') {
            i5++;
        }
        if (i5 > length) {
            return false;
        }
        if (str.charAt(i5) == '0') {
            int i6 = i5 + 1;
            if (i6 > length) {
                return true;
            }
            if ((str.charAt(i6) | ' ') == 120) {
                int i7 = i5 + 2;
                int i8 = i7;
                while (true) {
                    if (i8 > length) {
                        z = z7;
                        break;
                    }
                    z = z7;
                    if (((str.charAt(i8) - '0') & 65535) >= 10 && (((r15 | ' ') - 97) & 65535) >= 6) {
                        break;
                    }
                    i8++;
                    z7 = z;
                }
                boolean z8 = i7 != i8 ? z : false;
                if (i8 <= length) {
                    if (str.charAt(i8) == '.') {
                        int i9 = i8 + 1;
                        int i10 = i9;
                        while (i10 <= length) {
                            char c5 = c4;
                            if (((str.charAt(i10) - '0') & 65535) >= 10 && (((r15 | ' ') - 97) & 65535) >= 6) {
                                break;
                            }
                            i10++;
                            c4 = c5;
                        }
                        z6 = i9 != i10 ? z : false;
                        i8 = i10;
                    } else {
                        z6 = false;
                    }
                    if (z8 || z6) {
                        i5 = i8;
                        if (i5 != -1 || i5 > length) {
                            return false;
                        }
                        z4 = z;
                        if (!z4) {
                            int i11 = i5;
                            while (i11 <= length && ((str.charAt(i11) - '0') & 65535) < 10) {
                                i11++;
                            }
                            boolean z9 = i5 != i11 ? z : false;
                            if (i11 > length) {
                                i5 = i11;
                            } else {
                                if (str.charAt(i11) == '.') {
                                    int i12 = i11 + 1;
                                    i4 = i12;
                                    while (i4 <= length && ((str.charAt(i4) - '0') & 65535) < 10) {
                                        i4++;
                                    }
                                    if (i12 != i4) {
                                        z5 = z;
                                        if (!z9 || z5) {
                                            i5 = i4;
                                        } else {
                                            String str2 = length == i4 + 2 ? "NaN" : length == i4 + 7 ? "Infinity" : null;
                                            i5 = (str2 != null && AbstractC1510g.f0(str, str2, i4, false) == i4) ? length + 1 : -1;
                                        }
                                    }
                                } else {
                                    i4 = i11;
                                }
                                z5 = false;
                                if (z9) {
                                }
                                i5 = i4;
                            }
                            if (i5 == -1) {
                                return false;
                            }
                            if (i5 > length) {
                                return z;
                            }
                        }
                        int i13 = i5 + 1;
                        charAt = str.charAt(i5) | ' ';
                        if (charAt == (!z4 ? 112 : 101)) {
                            if (z4 || (!(charAt == 102 || charAt == 100) || i13 <= length)) {
                                return false;
                            }
                            return z;
                        }
                        if (i13 > length) {
                            return false;
                        }
                        if ((str.charAt(i13) == '+' || str.charAt(i13) == '-') && (i13 = i5 + 2) > length) {
                            return false;
                        }
                        while (i13 <= length && ((str.charAt(i13) - '0') & 65535) < 10) {
                            i13++;
                        }
                        if (i13 > length) {
                            return z;
                        }
                        if (i13 != length) {
                            return false;
                        }
                        int charAt2 = str.charAt(i13) | ' ';
                        if (charAt2 == 102 || charAt2 == 100) {
                            return z;
                        }
                        return false;
                    }
                }
                i5 = -1;
                if (i5 != -1) {
                }
                return false;
            }
        }
        z = true;
        z4 = false;
        if (!z4) {
        }
        int i132 = i5 + 1;
        charAt = str.charAt(i5) | ' ';
        if (charAt == (!z4 ? 112 : 101)) {
        }
    }
}
