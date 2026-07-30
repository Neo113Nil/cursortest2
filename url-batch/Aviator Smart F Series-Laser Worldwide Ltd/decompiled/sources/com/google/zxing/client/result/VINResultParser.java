package com.google.zxing.client.result;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.moyoung.dafit.module.common.utils.u;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class VINResultParser extends ResultParser {
    private static final Pattern IOQ = Pattern.compile("[IOQ]");
    private static final Pattern AZ09 = Pattern.compile("[A-Z0-9]{17}");

    private static char checkChar(int i8) {
        if (i8 < 10) {
            return (char) (i8 + 48);
        }
        if (i8 == 10) {
            return 'X';
        }
        throw new IllegalArgumentException();
    }

    private static boolean checkChecksum(CharSequence charSequence) {
        int i8 = 0;
        int i9 = 0;
        while (i8 < charSequence.length()) {
            int i10 = i8 + 1;
            i9 += vinPositionWeight(i10) * vinCharValue(charSequence.charAt(i8));
            i8 = i10;
        }
        return charSequence.charAt(8) == checkChar(i9 % 11);
    }

    private static String countryCode(CharSequence charSequence) {
        char charAt = charSequence.charAt(0);
        char charAt2 = charSequence.charAt(1);
        if (charAt == '9') {
            if (charAt2 >= 'A' && charAt2 <= 'E') {
                return "BR";
            }
            if (charAt2 < '3' || charAt2 > '9') {
                return null;
            }
            return "BR";
        }
        if (charAt == 'S') {
            if (charAt2 >= 'A' && charAt2 <= 'M') {
                return "UK";
            }
            if (charAt2 < 'N' || charAt2 > 'T') {
                return null;
            }
            return "DE";
        }
        if (charAt == 'Z') {
            if (charAt2 < 'A' || charAt2 > 'R') {
                return null;
            }
            return "IT";
        }
        switch (charAt) {
            case '1':
            case '4':
            case '5':
                return u.COUNTRY_US;
            case '2':
                return u.COUNTRY_CA;
            case '3':
                if (charAt2 < 'A' || charAt2 > 'W') {
                    return null;
                }
                return "MX";
            default:
                switch (charAt) {
                    case 'J':
                        if (charAt2 < 'A' || charAt2 > 'T') {
                            return null;
                        }
                        return u.COUNTRY_JP;
                    case 'K':
                        if (charAt2 < 'L' || charAt2 > 'R') {
                            return null;
                        }
                        return "KO";
                    case 'L':
                        return u.COUNTRY_CN;
                    case 'M':
                        if (charAt2 < 'A' || charAt2 > 'E') {
                            return null;
                        }
                        return u.COUNTRY_IN;
                    default:
                        switch (charAt) {
                            case 'V':
                                if (charAt2 >= 'F' && charAt2 <= 'R') {
                                    return "FR";
                                }
                                if (charAt2 < 'S' || charAt2 > 'W') {
                                    return null;
                                }
                                return "ES";
                            case 'W':
                                return "DE";
                            case 'X':
                                if (charAt2 == '0') {
                                    return "RU";
                                }
                                if (charAt2 < '3' || charAt2 > '9') {
                                    return null;
                                }
                                return "RU";
                            default:
                                return null;
                        }
                }
        }
    }

    private static int modelYear(char c8) {
        if (c8 >= 'E' && c8 <= 'H') {
            return c8 + 1915;
        }
        if (c8 >= 'J' && c8 <= 'N') {
            return c8 + 1914;
        }
        if (c8 == 'P') {
            return 1993;
        }
        if (c8 >= 'R' && c8 <= 'T') {
            return c8 + 1912;
        }
        if (c8 >= 'V' && c8 <= 'Y') {
            return c8 + 1911;
        }
        if (c8 >= '1' && c8 <= '9') {
            return c8 + 1952;
        }
        if (c8 < 'A' || c8 > 'D') {
            throw new IllegalArgumentException();
        }
        return c8 + 1945;
    }

    private static int vinCharValue(char c8) {
        if (c8 >= 'A' && c8 <= 'I') {
            return c8 - '@';
        }
        if (c8 >= 'J' && c8 <= 'R') {
            return c8 - 'I';
        }
        if (c8 >= 'S' && c8 <= 'Z') {
            return c8 - 'Q';
        }
        if (c8 < '0' || c8 > '9') {
            throw new IllegalArgumentException();
        }
        return c8 - '0';
    }

    private static int vinPositionWeight(int i8) {
        if (i8 > 0 && i8 <= 7) {
            return 9 - i8;
        }
        if (i8 == 8) {
            return 10;
        }
        if (i8 == 9) {
            return 0;
        }
        if (i8 < 10 || i8 > 17) {
            throw new IllegalArgumentException();
        }
        return 19 - i8;
    }

    @Override // com.google.zxing.client.result.ResultParser
    public VINParsedResult parse(Result result) {
        if (result.getBarcodeFormat() != BarcodeFormat.CODE_39) {
            return null;
        }
        String trim = IOQ.matcher(result.getText()).replaceAll("").trim();
        if (!AZ09.matcher(trim).matches()) {
            return null;
        }
        try {
            if (!checkChecksum(trim)) {
                return null;
            }
            String substring = trim.substring(0, 3);
            return new VINParsedResult(trim, substring, trim.substring(3, 9), trim.substring(9, 17), countryCode(substring), trim.substring(3, 8), modelYear(trim.charAt(9)), trim.charAt(10), trim.substring(11));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
