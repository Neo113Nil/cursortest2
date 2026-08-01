package m3;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class d extends c {
    /* JADX WARN: Removed duplicated region for block: B:102:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean t0(String str) {
        boolean z3;
        boolean z4;
        boolean z5;
        int charAt;
        int i;
        boolean z6;
        boolean z7;
        boolean z8 = true;
        int length = str.length() - 1;
        int i4 = 0;
        while (i4 <= length && str.charAt(i4) <= ' ') {
            i4++;
        }
        if (i4 <= length) {
            while (length > i4 && str.charAt(length) <= ' ') {
                length--;
            }
            if (str.charAt(i4) == '+' || str.charAt(i4) == '-') {
                i4++;
            }
            if (i4 <= length) {
                if (str.charAt(i4) == '0') {
                    int i5 = i4 + 1;
                    if (i5 > length) {
                        return true;
                    }
                    if ((str.charAt(i5) | ' ') == 120) {
                        int i6 = i4 + 2;
                        int i7 = i6;
                        while (true) {
                            if (i7 > length) {
                                z3 = z8;
                                break;
                            }
                            z3 = z8;
                            if (((str.charAt(i7) - '0') & 65535) >= 10 && (((r15 | ' ') - 97) & 65535) >= 6) {
                                break;
                            }
                            i7++;
                            z8 = z3;
                        }
                        boolean z9 = i6 != i7 ? z3 : false;
                        if (i7 > length) {
                            i4 = -1;
                            z4 = false;
                        } else {
                            if (str.charAt(i7) == '.') {
                                int i8 = i7 + 1;
                                int i9 = i8;
                                while (true) {
                                    if (i9 > length) {
                                        z4 = false;
                                        break;
                                    }
                                    z4 = false;
                                    if (((str.charAt(i9) - '0') & 65535) >= 10 && (((r15 | ' ') - 97) & 65535) >= 6) {
                                        break;
                                    }
                                    i9++;
                                }
                                z7 = i8 != i9 ? z3 : z4;
                                i7 = i9;
                            } else {
                                z4 = false;
                                z7 = false;
                            }
                            i4 = (z9 || z7) ? i7 : -1;
                        }
                        if (i4 == -1 || i4 > length) {
                            return z4;
                        }
                        z5 = z3;
                        if (!z5) {
                            int i10 = i4;
                            while (i10 <= length && ((str.charAt(i10) - '0') & 65535) < 10) {
                                i10++;
                            }
                            boolean z10 = i4 != i10 ? z3 : z4;
                            if (i10 <= length) {
                                if (str.charAt(i10) == '.') {
                                    int i11 = i10 + 1;
                                    i = i11;
                                    while (i <= length && ((str.charAt(i) - '0') & 65535) < 10) {
                                        i++;
                                    }
                                    if (i11 != i) {
                                        z6 = z3;
                                        if (!z10 || z6) {
                                            i4 = i;
                                        } else {
                                            String str2 = length == i + 2 ? "NaN" : length == i + 7 ? "Infinity" : null;
                                            if (str2 != null && str.indexOf(str2, i) == i) {
                                                i10 = length + 1;
                                            } else {
                                                i4 = -1;
                                            }
                                        }
                                        if (i4 == -1) {
                                            return z4;
                                        }
                                        if (i4 > length) {
                                            return z3;
                                        }
                                    }
                                } else {
                                    i = i10;
                                }
                                z6 = z4;
                                if (z10) {
                                }
                                i4 = i;
                                if (i4 == -1) {
                                }
                            }
                            i4 = i10;
                            if (i4 == -1) {
                            }
                        }
                        int i12 = i4 + 1;
                        charAt = str.charAt(i4) | ' ';
                        if (charAt == (!z5 ? 112 : 101)) {
                            return !z5 ? ((charAt == 102 || charAt == 100) && i12 > length) ? z3 : z4 : z4;
                        }
                        if (i12 > length) {
                            return z4;
                        }
                        if ((str.charAt(i12) == '+' || str.charAt(i12) == '-') && (i12 = i4 + 2) > length) {
                            return z4;
                        }
                        while (i12 <= length && ((str.charAt(i12) - '0') & 65535) < 10) {
                            i12++;
                        }
                        if (i12 > length) {
                            return z3;
                        }
                        if (i12 != length) {
                            return z4;
                        }
                        int charAt2 = str.charAt(i12) | ' ';
                        return (charAt2 == 102 || charAt2 == 100) ? z3 : z4;
                    }
                }
                z3 = true;
                z4 = false;
                z5 = false;
                if (!z5) {
                }
                int i122 = i4 + 1;
                charAt = str.charAt(i4) | ' ';
                if (charAt == (!z5 ? 112 : 101)) {
                }
            }
        }
        return false;
    }

    public static Double u0(String str) {
        f3.d.e(str, "<this>");
        try {
            if (t0(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
