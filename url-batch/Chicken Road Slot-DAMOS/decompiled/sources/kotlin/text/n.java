package kotlin.text;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class n extends m {
    /* JADX WARN: Removed duplicated region for block: B:120:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean e(String str) {
        char c10;
        boolean z10;
        boolean z11;
        int charAt;
        int charAt2;
        int i3;
        boolean z12;
        boolean z13;
        boolean z14 = true;
        int length = str.length() - 1;
        int i10 = 0;
        while (true) {
            c10 = ' ';
            if (i10 > length || str.charAt(i10) > ' ') {
                break;
            }
            i10++;
        }
        if (i10 <= length) {
            while (length > i10 && str.charAt(length) <= ' ') {
                length--;
            }
            if (str.charAt(i10) == '+' || str.charAt(i10) == '-') {
                i10++;
            }
            if (i10 <= length) {
                if (str.charAt(i10) == '0') {
                    int i11 = i10 + 1;
                    if (i11 > length) {
                        return true;
                    }
                    if ((str.charAt(i11) | ' ') == 120) {
                        int i12 = i10 + 2;
                        int i13 = i12;
                        while (true) {
                            if (i13 > length) {
                                z10 = z14;
                                break;
                            }
                            z10 = z14;
                            if (((str.charAt(i13) - '0') & 65535) >= 10 && (((r15 | ' ') - 97) & 65535) >= 6) {
                                break;
                            }
                            i13++;
                            z14 = z10;
                        }
                        boolean z15 = i12 != i13 ? z10 : false;
                        if (i13 <= length) {
                            if (str.charAt(i13) == '.') {
                                int i14 = i13 + 1;
                                int i15 = i14;
                                while (i15 <= length) {
                                    char c11 = c10;
                                    if (((str.charAt(i15) - '0') & 65535) >= 10 && (((r15 | ' ') - 97) & 65535) >= 6) {
                                        break;
                                    }
                                    i15++;
                                    c10 = c11;
                                }
                                z13 = i14 != i15 ? z10 : false;
                                i13 = i15;
                            } else {
                                z13 = false;
                            }
                            if (z15 || z13) {
                                i10 = i13;
                                if (i10 != -1 && i10 <= length) {
                                    z11 = z10;
                                    if (!z11) {
                                        int i16 = i10;
                                        while (i16 <= length && ((str.charAt(i16) - '0') & 65535) < 10) {
                                            i16++;
                                        }
                                        boolean z16 = i10 != i16 ? z10 : false;
                                        if (i16 > length) {
                                            i10 = i16;
                                        } else {
                                            if (str.charAt(i16) == '.') {
                                                int i17 = i16 + 1;
                                                i3 = i17;
                                                while (i3 <= length && ((str.charAt(i3) - '0') & 65535) < 10) {
                                                    i3++;
                                                }
                                                if (i17 != i3) {
                                                    z12 = z10;
                                                    if (!z16 || z12) {
                                                        i10 = i3;
                                                    } else {
                                                        String str2 = length == i3 + 2 ? "NaN" : length == i3 + 7 ? "Infinity" : null;
                                                        i10 = (str2 != null && StringsKt__StringsKt.i(str, str2, i3, false) == i3) ? length + 1 : -1;
                                                    }
                                                }
                                            } else {
                                                i3 = i16;
                                            }
                                            z12 = false;
                                            if (z16) {
                                            }
                                            i10 = i3;
                                        }
                                        if (i10 != -1) {
                                            if (i10 > length) {
                                                return z10;
                                            }
                                        }
                                    }
                                    int i18 = i10 + 1;
                                    charAt = str.charAt(i10) | ' ';
                                    if (charAt != (z11 ? 112 : 101)) {
                                        if (!z11 && ((charAt == 102 || charAt == 100) && i18 > length)) {
                                            return z10;
                                        }
                                    } else if (i18 <= length && ((str.charAt(i18) != '+' && str.charAt(i18) != '-') || (i18 = i10 + 2) <= length)) {
                                        while (i18 <= length && ((str.charAt(i18) - '0') & 65535) < 10) {
                                            i18++;
                                        }
                                        if (i18 > length) {
                                            return z10;
                                        }
                                        if (i18 == length && ((charAt2 = str.charAt(i18) | ' ') == 102 || charAt2 == 100)) {
                                            return z10;
                                        }
                                    }
                                }
                            }
                        }
                        i10 = -1;
                        if (i10 != -1) {
                            z11 = z10;
                            if (!z11) {
                            }
                            int i182 = i10 + 1;
                            charAt = str.charAt(i10) | ' ';
                            if (charAt != (z11 ? 112 : 101)) {
                            }
                        }
                    }
                }
                z10 = true;
                z11 = false;
                if (!z11) {
                }
                int i1822 = i10 + 1;
                charAt = str.charAt(i10) | ' ';
                if (charAt != (z11 ? 112 : 101)) {
                }
            }
        }
        return false;
    }
}
