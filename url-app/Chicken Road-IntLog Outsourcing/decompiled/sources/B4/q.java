package B4;

/* loaded from: classes.dex */
public abstract class q extends p {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean G(String str) {
        boolean z;
        int charAt;
        int i2;
        boolean z5;
        int i3;
        boolean z6;
        int length = str.length() - 1;
        int i6 = 0;
        while (i6 <= length && str.charAt(i6) <= ' ') {
            i6++;
        }
        if (i6 > length) {
            return false;
        }
        while (length > i6 && str.charAt(length) <= ' ') {
            length--;
        }
        if (str.charAt(i6) == '+' || str.charAt(i6) == '-') {
            i6++;
        }
        if (i6 > length) {
            return false;
        }
        if (str.charAt(i6) == '0') {
            int i7 = i6 + 1;
            if (i7 > length) {
                return true;
            }
            if ((str.charAt(i7) | ' ') == 120) {
                int i8 = i6 + 2;
                int i9 = i8;
                while (i9 <= length) {
                    if (((str.charAt(i9) - '0') & 65535) >= 10 && (((r15 | ' ') - 97) & 65535) >= 6) {
                        break;
                    }
                    i9++;
                }
                boolean z7 = i8 != i9;
                if (i9 <= length) {
                    if (str.charAt(i9) == '.') {
                        int i10 = i9 + 1;
                        i3 = i10;
                        while (i3 <= length) {
                            if (((str.charAt(i3) - '0') & 65535) >= 10 && (((r15 | ' ') - 97) & 65535) >= 6) {
                                break;
                            }
                            i3++;
                        }
                        if (i10 != i3) {
                            z6 = true;
                            if (!z7 || z6) {
                                i6 = i3;
                                if (i6 != -1 || i6 > length) {
                                    return false;
                                }
                                z = true;
                                if (!z) {
                                    int i11 = i6;
                                    while (i11 <= length && ((str.charAt(i11) - '0') & 65535) < 10) {
                                        i11++;
                                    }
                                    boolean z8 = i6 != i11;
                                    if (i11 > length) {
                                        i6 = i11;
                                    } else {
                                        if (str.charAt(i11) == '.') {
                                            int i12 = i11 + 1;
                                            i2 = i12;
                                            while (i2 <= length && ((str.charAt(i2) - '0') & 65535) < 10) {
                                                i2++;
                                            }
                                            if (i12 != i2) {
                                                z5 = true;
                                                if (!z8 || z5) {
                                                    i6 = i2;
                                                } else {
                                                    String str2 = length == i2 + 2 ? "NaN" : length == i2 + 7 ? "Infinity" : null;
                                                    i6 = (str2 != null && k.V(i2, str, str2, false) == i2) ? length + 1 : -1;
                                                }
                                            }
                                        } else {
                                            i2 = i11;
                                        }
                                        z5 = false;
                                        if (z8) {
                                        }
                                        i6 = i2;
                                    }
                                    if (i6 == -1) {
                                        return false;
                                    }
                                    if (i6 > length) {
                                        return true;
                                    }
                                }
                                int i13 = i6 + 1;
                                charAt = str.charAt(i6) | ' ';
                                if (charAt == (!z ? 112 : 101)) {
                                    return !z && (charAt == 102 || charAt == 100) && i13 > length;
                                }
                                if (i13 > length) {
                                    return false;
                                }
                                if ((str.charAt(i13) == '+' || str.charAt(i13) == '-') && (i13 = i6 + 2) > length) {
                                    return false;
                                }
                                while (i13 <= length && ((str.charAt(i13) - '0') & 65535) < 10) {
                                    i13++;
                                }
                                if (i13 > length) {
                                    return true;
                                }
                                if (i13 != length) {
                                    return false;
                                }
                                int charAt2 = str.charAt(i13) | ' ';
                                return charAt2 == 102 || charAt2 == 100;
                            }
                        }
                    } else {
                        i3 = i9;
                    }
                    z6 = false;
                    if (!z7) {
                    }
                    i6 = i3;
                    if (i6 != -1) {
                    }
                    return false;
                }
                i6 = -1;
                if (i6 != -1) {
                }
                return false;
            }
        }
        z = false;
        if (!z) {
        }
        int i132 = i6 + 1;
        charAt = str.charAt(i6) | ' ';
        if (charAt == (!z ? 112 : 101)) {
        }
    }
}
