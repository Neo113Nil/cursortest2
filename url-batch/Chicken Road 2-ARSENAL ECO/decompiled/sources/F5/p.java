package F5;

/* loaded from: classes.dex */
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
        char c7;
        boolean z5;
        boolean z6;
        int charAt;
        int i7;
        boolean z7;
        boolean z8;
        boolean z9 = true;
        int length = str.length() - 1;
        int i8 = 0;
        while (true) {
            c7 = ' ';
            if (i8 > length || str.charAt(i8) > ' ') {
                break;
            }
            i8++;
        }
        if (i8 > length) {
            return false;
        }
        while (length > i8 && str.charAt(length) <= ' ') {
            length--;
        }
        if (str.charAt(i8) == '+' || str.charAt(i8) == '-') {
            i8++;
        }
        if (i8 > length) {
            return false;
        }
        if (str.charAt(i8) == '0') {
            int i9 = i8 + 1;
            if (i9 > length) {
                return true;
            }
            if ((str.charAt(i9) | ' ') == 120) {
                int i10 = i8 + 2;
                int i11 = i10;
                while (true) {
                    if (i11 > length) {
                        z5 = z9;
                        break;
                    }
                    z5 = z9;
                    if (((str.charAt(i11) - '0') & 65535) >= 10 && (((r15 | ' ') - 97) & 65535) >= 6) {
                        break;
                    }
                    i11++;
                    z9 = z5;
                }
                boolean z10 = i10 != i11 ? z5 : false;
                if (i11 <= length) {
                    if (str.charAt(i11) == '.') {
                        int i12 = i11 + 1;
                        int i13 = i12;
                        while (i13 <= length) {
                            char c8 = c7;
                            if (((str.charAt(i13) - '0') & 65535) >= 10 && (((r15 | ' ') - 97) & 65535) >= 6) {
                                break;
                            }
                            i13++;
                            c7 = c8;
                        }
                        z8 = i12 != i13 ? z5 : false;
                        i11 = i13;
                    } else {
                        z8 = false;
                    }
                    if (z10 || z8) {
                        i8 = i11;
                        if (i8 != -1 || i8 > length) {
                            return false;
                        }
                        z6 = z5;
                        if (!z6) {
                            int i14 = i8;
                            while (i14 <= length && ((str.charAt(i14) - '0') & 65535) < 10) {
                                i14++;
                            }
                            boolean z11 = i8 != i14 ? z5 : false;
                            if (i14 > length) {
                                i8 = i14;
                            } else {
                                if (str.charAt(i14) == '.') {
                                    int i15 = i14 + 1;
                                    i7 = i15;
                                    while (i7 <= length && ((str.charAt(i7) - '0') & 65535) < 10) {
                                        i7++;
                                    }
                                    if (i15 != i7) {
                                        z7 = z5;
                                        if (!z11 || z7) {
                                            i8 = i7;
                                        } else {
                                            String str2 = length == i7 + 2 ? "NaN" : length == i7 + 7 ? "Infinity" : null;
                                            i8 = (str2 != null && j.P(str, str2, i7, false) == i7) ? length + 1 : -1;
                                        }
                                    }
                                } else {
                                    i7 = i14;
                                }
                                z7 = false;
                                if (z11) {
                                }
                                i8 = i7;
                            }
                            if (i8 == -1) {
                                return false;
                            }
                            if (i8 > length) {
                                return z5;
                            }
                        }
                        int i16 = i8 + 1;
                        charAt = str.charAt(i8) | ' ';
                        if (charAt == (!z6 ? 112 : 101)) {
                            if (z6 || (!(charAt == 102 || charAt == 100) || i16 <= length)) {
                                return false;
                            }
                            return z5;
                        }
                        if (i16 > length) {
                            return false;
                        }
                        if ((str.charAt(i16) == '+' || str.charAt(i16) == '-') && (i16 = i8 + 2) > length) {
                            return false;
                        }
                        while (i16 <= length && ((str.charAt(i16) - '0') & 65535) < 10) {
                            i16++;
                        }
                        if (i16 > length) {
                            return z5;
                        }
                        if (i16 != length) {
                            return false;
                        }
                        int charAt2 = str.charAt(i16) | ' ';
                        if (charAt2 == 102 || charAt2 == 100) {
                            return z5;
                        }
                        return false;
                    }
                }
                i8 = -1;
                if (i8 != -1) {
                }
                return false;
            }
        }
        z5 = true;
        z6 = false;
        if (!z6) {
        }
        int i162 = i8 + 1;
        charAt = str.charAt(i8) | ' ';
        if (charAt == (!z6 ? 112 : 101)) {
        }
    }
}
