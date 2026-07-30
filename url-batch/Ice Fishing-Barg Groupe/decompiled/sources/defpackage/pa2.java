package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class pa2 extends oa2 {
    public static boolean IXK6ba3ucyzm(int i, int i2, int i3, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    public static String JHNfcAUfKc4G(String str, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        }
        if (i == 0) {
            return "";
        }
        int i2 = 1;
        if (i == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length != 1) {
            StringBuilder sb = new StringBuilder(str.length() * i);
            if (1 <= i) {
                while (true) {
                    sb.append((CharSequence) str);
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
            return sb.toString();
        }
        char charAt = str.charAt(0);
        char[] cArr = new char[i];
        for (int i3 = 0; i3 < i; i3++) {
            cArr[i3] = charAt;
        }
        return new String(cArr);
    }

    public static Integer KUoIVIumpKat(String str) {
        boolean z;
        int i;
        int i2;
        str.getClass();
        ov2.RfyTYNmI9Srp(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        int i4 = -2147483647;
        if (cs0.gPXPFXrUH4XX(charAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z = false;
            } else {
                if (charAt != '-') {
                    return null;
                }
                i4 = Integer.MIN_VALUE;
                z = true;
            }
        } else {
            z = false;
            i = 0;
        }
        int i5 = -59652323;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if ((i3 < i5 && (i5 != -59652323 || i3 < (i5 = i4 / 10))) || (i2 = i3 * 10) < i4 + digit) {
                return null;
            }
            i3 = i2 - digit;
            i++;
        }
        return z ? Integer.valueOf(i3) : Integer.valueOf(-i3);
    }

    public static String bEKsvqmvPh2y(String str, String str2, String str3) {
        str.getClass();
        int JTxCbbCwomzt = ia2.JTxCbbCwomzt(str, str2, 0, false);
        if (JTxCbbCwomzt < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, JTxCbbCwomzt);
            sb.append(str3);
            i2 = JTxCbbCwomzt + length;
            if (JTxCbbCwomzt >= str.length()) {
                break;
            }
            JTxCbbCwomzt = ia2.JTxCbbCwomzt(str, str2, JTxCbbCwomzt + i, false);
        } while (JTxCbbCwomzt > 0);
        sb.append((CharSequence) str, i2, str.length());
        return sb.toString();
    }

    public static boolean ngxnMNrpiKat(String str, String str2, int i, boolean z) {
        str.getClass();
        return !z ? str.startsWith(str2, i) : IXK6ba3ucyzm(i, 0, str2.length(), str, str2, z);
    }

    public static final void nxJAScVArhE9(String str) {
        throw new NumberFormatException(o0.dgRBjINgWbAK("Invalid number format: '", str, '\''));
    }

    public static Long qudtW7lwm99e(String str) {
        boolean z;
        str.getClass();
        ov2.RfyTYNmI9Srp(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char charAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (cs0.gPXPFXrUH4XX(charAt, 48) < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z = false;
                i = 1;
            } else {
                if (charAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i = 1;
            }
        } else {
            z = false;
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if (j2 < j3) {
                if (j3 != -256204778801521550L) {
                    return null;
                }
                j3 = j / 10;
                if (j2 < j3) {
                    return null;
                }
            }
            long j4 = j2 * 10;
            long j5 = digit;
            if (j4 < j + j5) {
                return null;
            }
            j2 = j4 - j5;
            i++;
        }
        return z ? Long.valueOf(j2) : Long.valueOf(-j2);
    }

    public static boolean xbgXKYA2cIfu(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static boolean yQRudnv4La6p(String str, String str2, boolean z) {
        str.getClass();
        return !z ? str.startsWith(str2) : IXK6ba3ucyzm(0, 0, str2.length(), str, str2, z);
    }
}
