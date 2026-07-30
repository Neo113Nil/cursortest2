package kotlin.text;

import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;

/* loaded from: classes.dex */
public class o extends n {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean d(String str) {
        char c7;
        boolean z7;
        boolean z8;
        int charAt;
        int i2;
        boolean z9;
        boolean z10;
        boolean z11 = true;
        int length = str.length() - 1;
        int i5 = 0;
        while (true) {
            c7 = ' ';
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
            int i7 = i5 + 1;
            if (i7 > length) {
                return true;
            }
            if ((str.charAt(i7) | ' ') == 120) {
                int i8 = i5 + 2;
                int i9 = i8;
                while (true) {
                    if (i9 > length) {
                        z7 = z11;
                        break;
                    }
                    z7 = z11;
                    if (((str.charAt(i9) - '0') & 65535) >= 10 && (((r15 | ' ') - 97) & 65535) >= 6) {
                        break;
                    }
                    i9++;
                    z11 = z7;
                }
                boolean z12 = i8 != i9 ? z7 : false;
                if (i9 <= length) {
                    if (str.charAt(i9) == '.') {
                        int i10 = i9 + 1;
                        int i11 = i10;
                        while (i11 <= length) {
                            char c8 = c7;
                            if (((str.charAt(i11) - '0') & 65535) >= 10 && (((r15 | ' ') - 97) & 65535) >= 6) {
                                break;
                            }
                            i11++;
                            c7 = c8;
                        }
                        z10 = i10 != i11 ? z7 : false;
                        i9 = i11;
                    } else {
                        z10 = false;
                    }
                    if (z12 || z10) {
                        i5 = i9;
                        if (i5 != -1 || i5 > length) {
                            return false;
                        }
                        z8 = z7;
                        if (!z8) {
                            int i12 = i5;
                            while (i12 <= length && ((str.charAt(i12) - '0') & 65535) < 10) {
                                i12++;
                            }
                            boolean z13 = i5 != i12 ? z7 : false;
                            if (i12 > length) {
                                i5 = i12;
                            } else {
                                if (str.charAt(i12) == '.') {
                                    int i13 = i12 + 1;
                                    i2 = i13;
                                    while (i2 <= length && ((str.charAt(i2) - '0') & 65535) < 10) {
                                        i2++;
                                    }
                                    if (i13 != i2) {
                                        z9 = z7;
                                        if (!z13 || z9) {
                                            i5 = i2;
                                        } else {
                                            String str2 = length == i2 + 2 ? "NaN" : length == i2 + 7 ? "Infinity" : null;
                                            i5 = (str2 != null && StringsKt__StringsKt.m(i2, str, str2, false) == i2) ? length + 1 : -1;
                                        }
                                    }
                                } else {
                                    i2 = i12;
                                }
                                z9 = false;
                                if (z13) {
                                }
                                i5 = i2;
                            }
                            if (i5 == -1) {
                                return false;
                            }
                            if (i5 > length) {
                                return z7;
                            }
                        }
                        int i14 = i5 + 1;
                        charAt = str.charAt(i5) | ' ';
                        if (charAt == (!z8 ? 112 : ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE)) {
                            if (z8 || (!(charAt == 102 || charAt == 100) || i14 <= length)) {
                                return false;
                            }
                            return z7;
                        }
                        if (i14 > length) {
                            return false;
                        }
                        if ((str.charAt(i14) == '+' || str.charAt(i14) == '-') && (i14 = i5 + 2) > length) {
                            return false;
                        }
                        while (i14 <= length && ((str.charAt(i14) - '0') & 65535) < 10) {
                            i14++;
                        }
                        if (i14 > length) {
                            return z7;
                        }
                        if (i14 != length) {
                            return false;
                        }
                        int charAt2 = str.charAt(i14) | ' ';
                        if (charAt2 == 102 || charAt2 == 100) {
                            return z7;
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
        z7 = true;
        z8 = false;
        if (!z8) {
        }
        int i142 = i5 + 1;
        charAt = str.charAt(i5) | ' ';
        if (charAt == (!z8 ? 112 : ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE)) {
        }
    }
}
