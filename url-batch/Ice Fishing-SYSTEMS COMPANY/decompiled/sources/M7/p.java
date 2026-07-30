package M7;

/* loaded from: classes2.dex */
public abstract class p extends o {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean A(String str) {
        char c4;
        boolean z8;
        boolean z9;
        int charAt;
        int i;
        boolean z10;
        boolean z11;
        boolean z12 = true;
        int length = str.length() - 1;
        int i4 = 0;
        while (true) {
            c4 = ' ';
            if (i4 > length || str.charAt(i4) > ' ') {
                break;
            }
            i4++;
        }
        if (i4 > length) {
            return false;
        }
        while (length > i4 && str.charAt(length) <= ' ') {
            length--;
        }
        if (str.charAt(i4) == '+' || str.charAt(i4) == '-') {
            i4++;
        }
        if (i4 > length) {
            return false;
        }
        if (str.charAt(i4) == '0') {
            int i9 = i4 + 1;
            if (i9 > length) {
                return true;
            }
            if ((str.charAt(i9) | ' ') == 120) {
                int i10 = i4 + 2;
                int i11 = i10;
                while (true) {
                    if (i11 > length) {
                        z8 = z12;
                        break;
                    }
                    z8 = z12;
                    if (((str.charAt(i11) - '0') & 65535) >= 10 && (((r15 | ' ') - 97) & 65535) >= 6) {
                        break;
                    }
                    i11++;
                    z12 = z8;
                }
                boolean z13 = i10 != i11 ? z8 : false;
                if (i11 <= length) {
                    if (str.charAt(i11) == '.') {
                        int i12 = i11 + 1;
                        int i13 = i12;
                        while (i13 <= length) {
                            char c9 = c4;
                            if (((str.charAt(i13) - '0') & 65535) >= 10 && (((r15 | ' ') - 97) & 65535) >= 6) {
                                break;
                            }
                            i13++;
                            c4 = c9;
                        }
                        z11 = i12 != i13 ? z8 : false;
                        i11 = i13;
                    } else {
                        z11 = false;
                    }
                    if (z13 || z11) {
                        i4 = i11;
                        if (i4 != -1 || i4 > length) {
                            return false;
                        }
                        z9 = z8;
                        if (!z9) {
                            int i14 = i4;
                            while (i14 <= length && ((str.charAt(i14) - '0') & 65535) < 10) {
                                i14++;
                            }
                            boolean z14 = i4 != i14 ? z8 : false;
                            if (i14 > length) {
                                i4 = i14;
                            } else {
                                if (str.charAt(i14) == '.') {
                                    int i15 = i14 + 1;
                                    i = i15;
                                    while (i <= length && ((str.charAt(i) - '0') & 65535) < 10) {
                                        i++;
                                    }
                                    if (i15 != i) {
                                        z10 = z8;
                                        if (!z14 || z10) {
                                            i4 = i;
                                        } else {
                                            String str2 = length == i + 2 ? "NaN" : length == i + 7 ? "Infinity" : null;
                                            i4 = (str2 != null && j.P(str, str2, i, false) == i) ? length + 1 : -1;
                                        }
                                    }
                                } else {
                                    i = i14;
                                }
                                z10 = false;
                                if (z14) {
                                }
                                i4 = i;
                            }
                            if (i4 == -1) {
                                return false;
                            }
                            if (i4 > length) {
                                return z8;
                            }
                        }
                        int i16 = i4 + 1;
                        charAt = str.charAt(i4) | ' ';
                        if (charAt == (!z9 ? 112 : 101)) {
                            if (z9 || (!(charAt == 102 || charAt == 100) || i16 <= length)) {
                                return false;
                            }
                            return z8;
                        }
                        if (i16 > length) {
                            return false;
                        }
                        if ((str.charAt(i16) == '+' || str.charAt(i16) == '-') && (i16 = i4 + 2) > length) {
                            return false;
                        }
                        while (i16 <= length && ((str.charAt(i16) - '0') & 65535) < 10) {
                            i16++;
                        }
                        if (i16 > length) {
                            return z8;
                        }
                        if (i16 != length) {
                            return false;
                        }
                        int charAt2 = str.charAt(i16) | ' ';
                        if (charAt2 == 102 || charAt2 == 100) {
                            return z8;
                        }
                        return false;
                    }
                }
                i4 = -1;
                if (i4 != -1) {
                }
                return false;
            }
        }
        z8 = true;
        z9 = false;
        if (!z9) {
        }
        int i162 = i4 + 1;
        charAt = str.charAt(i4) | ' ';
        if (charAt == (!z9 ? 112 : 101)) {
        }
    }
}
