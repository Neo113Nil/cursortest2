package com.google.zxing.client.result;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.moyoung.dafit.module.common.utils.n;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class ExpandedProductResultParser extends ResultParser {
    private static String findAIvalue(int i8, String str) {
        if (str.charAt(i8) != '(') {
            return null;
        }
        String substring = str.substring(i8 + 1);
        StringBuilder sb = new StringBuilder();
        for (int i9 = 0; i9 < substring.length(); i9++) {
            char charAt = substring.charAt(i9);
            if (charAt == ')') {
                return sb.toString();
            }
            if (charAt < '0' || charAt > '9') {
                return null;
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    private static String findValue(int i8, String str) {
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(i8);
        for (int i9 = 0; i9 < substring.length(); i9++) {
            char charAt = substring.charAt(i9);
            if (charAt != '(') {
                sb.append(charAt);
            } else {
                if (findAIvalue(i9, substring) != null) {
                    break;
                }
                sb.append('(');
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x020b, code lost:
    
        if (r1.equals("10") == false) goto L13;
     */
    @Override // com.google.zxing.client.result.ResultParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ExpandedProductParsedResult parse(Result result) {
        ExpandedProductParsedResult expandedProductParsedResult = null;
        if (result.getBarcodeFormat() != BarcodeFormat.RSS_EXPANDED) {
            return null;
        }
        String massagedText = ResultParser.getMassagedText(result);
        HashMap hashMap = new HashMap();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        int i8 = 0;
        while (i8 < massagedText.length()) {
            String findAIvalue = findAIvalue(i8, massagedText);
            if (findAIvalue == null) {
                return expandedProductParsedResult;
            }
            char c8 = 2;
            int length = i8 + findAIvalue.length() + 2;
            String findValue = findValue(length, massagedText);
            int length2 = length + findValue.length();
            switch (findAIvalue.hashCode()) {
                case 1536:
                    if (findAIvalue.equals(n.TWO_INTEGERS_PATTERN)) {
                        c8 = 0;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1537:
                    if (findAIvalue.equals("01")) {
                        c8 = 1;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1567:
                    break;
                case 1568:
                    if (findAIvalue.equals("11")) {
                        c8 = 3;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1570:
                    if (findAIvalue.equals("13")) {
                        c8 = 4;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1572:
                    if (findAIvalue.equals("15")) {
                        c8 = 5;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1574:
                    if (findAIvalue.equals("17")) {
                        c8 = 6;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1567966:
                    if (findAIvalue.equals("3100")) {
                        c8 = 7;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1567967:
                    if (findAIvalue.equals("3101")) {
                        c8 = '\b';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1567968:
                    if (findAIvalue.equals("3102")) {
                        c8 = '\t';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1567969:
                    if (findAIvalue.equals("3103")) {
                        c8 = '\n';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1567970:
                    if (findAIvalue.equals("3104")) {
                        c8 = 11;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1567971:
                    if (findAIvalue.equals("3105")) {
                        c8 = '\f';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1567972:
                    if (findAIvalue.equals("3106")) {
                        c8 = '\r';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1567973:
                    if (findAIvalue.equals("3107")) {
                        c8 = 14;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1567974:
                    if (findAIvalue.equals("3108")) {
                        c8 = 15;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1567975:
                    if (findAIvalue.equals("3109")) {
                        c8 = 16;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1568927:
                    if (findAIvalue.equals("3200")) {
                        c8 = 17;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1568928:
                    if (findAIvalue.equals("3201")) {
                        c8 = 18;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1568929:
                    if (findAIvalue.equals("3202")) {
                        c8 = 19;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1568930:
                    if (findAIvalue.equals("3203")) {
                        c8 = 20;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1568931:
                    if (findAIvalue.equals("3204")) {
                        c8 = 21;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1568932:
                    if (findAIvalue.equals("3205")) {
                        c8 = 22;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1568933:
                    if (findAIvalue.equals("3206")) {
                        c8 = 23;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1568934:
                    if (findAIvalue.equals("3207")) {
                        c8 = 24;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1568935:
                    if (findAIvalue.equals("3208")) {
                        c8 = 25;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1568936:
                    if (findAIvalue.equals("3209")) {
                        c8 = 26;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1575716:
                    if (findAIvalue.equals("3920")) {
                        c8 = 27;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1575717:
                    if (findAIvalue.equals("3921")) {
                        c8 = 28;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1575718:
                    if (findAIvalue.equals("3922")) {
                        c8 = 29;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1575719:
                    if (findAIvalue.equals("3923")) {
                        c8 = 30;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1575747:
                    if (findAIvalue.equals("3930")) {
                        c8 = 31;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1575748:
                    if (findAIvalue.equals("3931")) {
                        c8 = ' ';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1575749:
                    if (findAIvalue.equals("3932")) {
                        c8 = '!';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1575750:
                    if (findAIvalue.equals("3933")) {
                        c8 = '\"';
                        break;
                    }
                    c8 = 65535;
                    break;
                default:
                    c8 = 65535;
                    break;
            }
            switch (c8) {
                case 0:
                    str2 = findValue;
                    i8 = length2;
                    expandedProductParsedResult = null;
                case 1:
                    str = findValue;
                    i8 = length2;
                    expandedProductParsedResult = null;
                case 2:
                    str3 = findValue;
                    i8 = length2;
                    expandedProductParsedResult = null;
                case 3:
                    str4 = findValue;
                    i8 = length2;
                    expandedProductParsedResult = null;
                case 4:
                    str5 = findValue;
                    i8 = length2;
                    expandedProductParsedResult = null;
                case 5:
                    str6 = findValue;
                    i8 = length2;
                    expandedProductParsedResult = null;
                case 6:
                    str7 = findValue;
                    i8 = length2;
                    expandedProductParsedResult = null;
                case 7:
                case '\b':
                case '\t':
                case '\n':
                case 11:
                case '\f':
                case '\r':
                case 14:
                case 15:
                case 16:
                    str10 = findAIvalue.substring(3);
                    str9 = ExpandedProductParsedResult.KILOGRAM;
                    str8 = findValue;
                    i8 = length2;
                    expandedProductParsedResult = null;
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    str10 = findAIvalue.substring(3);
                    str9 = ExpandedProductParsedResult.POUND;
                    str8 = findValue;
                    i8 = length2;
                    expandedProductParsedResult = null;
                case 27:
                case 28:
                case 29:
                case 30:
                    str12 = findAIvalue.substring(3);
                    str11 = findValue;
                    i8 = length2;
                    expandedProductParsedResult = null;
                case 31:
                case ' ':
                case '!':
                case '\"':
                    if (findValue.length() < 4) {
                        return null;
                    }
                    String substring = findValue.substring(3);
                    str13 = findValue.substring(0, 3);
                    str11 = substring;
                    i8 = length2;
                    expandedProductParsedResult = null;
                    str12 = findAIvalue.substring(3);
                default:
                    hashMap.put(findAIvalue, findValue);
                    i8 = length2;
                    expandedProductParsedResult = null;
            }
        }
        return new ExpandedProductParsedResult(massagedText, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, hashMap);
    }
}
