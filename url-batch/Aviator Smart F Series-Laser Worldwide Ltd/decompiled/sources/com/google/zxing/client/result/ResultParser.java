package com.google.zxing.client.result;

import cn.hutool.core.util.l;
import com.google.zxing.Result;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public abstract class ResultParser {
    private static final String BYTE_ORDER_MARK = "\ufeff";
    private static final ResultParser[] PARSERS = {new BookmarkDoCoMoResultParser(), new AddressBookDoCoMoResultParser(), new EmailDoCoMoResultParser(), new AddressBookAUResultParser(), new VCardResultParser(), new BizcardResultParser(), new VEventResultParser(), new EmailAddressResultParser(), new SMTPResultParser(), new TelResultParser(), new SMSMMSResultParser(), new SMSTOMMSTOResultParser(), new GeoResultParser(), new WifiResultParser(), new URLTOResultParser(), new URIResultParser(), new ISBNResultParser(), new ProductResultParser(), new ExpandedProductResultParser(), new VINResultParser()};
    private static final Pattern DIGITS = Pattern.compile("\\d+");
    private static final Pattern AMPERSAND = Pattern.compile("&");
    private static final Pattern EQUALS = Pattern.compile("=");

    private static void appendKeyValue(CharSequence charSequence, Map<String, String> map) {
        String[] split = EQUALS.split(charSequence, 2);
        if (split.length == 2) {
            try {
                map.put(split[0], urlDecode(split[1]));
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    private static int countPrecedingBackslashes(CharSequence charSequence, int i8) {
        int i9 = 0;
        for (int i10 = i8 - 1; i10 >= 0 && charSequence.charAt(i10) == '\\'; i10--) {
            i9++;
        }
        return i9;
    }

    protected static String getMassagedText(Result result) {
        String text = result.getText();
        return text.startsWith(BYTE_ORDER_MARK) ? text.substring(1) : text;
    }

    protected static boolean isStringOfDigits(CharSequence charSequence, int i8) {
        return charSequence != null && i8 > 0 && i8 == charSequence.length() && DIGITS.matcher(charSequence).matches();
    }

    protected static boolean isSubstringOfDigits(CharSequence charSequence, int i8, int i9) {
        int i10;
        return charSequence != null && i9 > 0 && charSequence.length() >= (i10 = i9 + i8) && DIGITS.matcher(charSequence.subSequence(i8, i10)).matches();
    }

    static String[] matchPrefixedField(String str, String str2, char c8, boolean z7) {
        int length = str2.length();
        ArrayList arrayList = null;
        int i8 = 0;
        while (i8 < length) {
            int indexOf = str2.indexOf(str, i8);
            if (indexOf < 0) {
                break;
            }
            int length2 = indexOf + str.length();
            ArrayList arrayList2 = arrayList;
            boolean z8 = true;
            int i9 = length2;
            while (z8) {
                int indexOf2 = str2.indexOf(c8, i9);
                if (indexOf2 < 0) {
                    i9 = str2.length();
                } else if (countPrecedingBackslashes(str2, indexOf2) % 2 != 0) {
                    i9 = indexOf2 + 1;
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(3);
                    }
                    String unescapeBackslash = unescapeBackslash(str2.substring(length2, indexOf2));
                    if (z7) {
                        unescapeBackslash = unescapeBackslash.trim();
                    }
                    if (!unescapeBackslash.isEmpty()) {
                        arrayList2.add(unescapeBackslash);
                    }
                    i9 = indexOf2 + 1;
                }
                z8 = false;
            }
            i8 = i9;
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    static String matchSinglePrefixedField(String str, String str2, char c8, boolean z7) {
        String[] matchPrefixedField = matchPrefixedField(str, str2, c8, z7);
        if (matchPrefixedField == null) {
            return null;
        }
        return matchPrefixedField[0];
    }

    protected static void maybeAppend(String str, StringBuilder sb) {
        if (str != null) {
            sb.append('\n');
            sb.append(str);
        }
    }

    protected static String[] maybeWrap(String str) {
        if (str == null) {
            return null;
        }
        return new String[]{str};
    }

    protected static int parseHexDigit(char c8) {
        if (c8 >= '0' && c8 <= '9') {
            return c8 - '0';
        }
        if (c8 >= 'a' && c8 <= 'f') {
            return c8 - 'W';
        }
        if (c8 < 'A' || c8 > 'F') {
            return -1;
        }
        return c8 - '7';
    }

    static Map<String, String> parseNameValuePairs(String str) {
        int indexOf = str.indexOf(63);
        if (indexOf < 0) {
            return null;
        }
        HashMap hashMap = new HashMap(3);
        for (String str2 : AMPERSAND.split(str.substring(indexOf + 1))) {
            appendKeyValue(str2, hashMap);
        }
        return hashMap;
    }

    public static ParsedResult parseResult(Result result) {
        for (ResultParser resultParser : PARSERS) {
            ParsedResult parse = resultParser.parse(result);
            if (parse != null) {
                return parse;
            }
        }
        return new TextParsedResult(result.getText(), null);
    }

    protected static String unescapeBackslash(String str) {
        int indexOf = str.indexOf(92);
        if (indexOf < 0) {
            return str;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length - 1);
        sb.append(str.toCharArray(), 0, indexOf);
        boolean z7 = false;
        while (indexOf < length) {
            char charAt = str.charAt(indexOf);
            if (z7 || charAt != '\\') {
                sb.append(charAt);
                z7 = false;
            } else {
                z7 = true;
            }
            indexOf++;
        }
        return sb.toString();
    }

    static String urlDecode(String str) {
        try {
            return URLDecoder.decode(str, l.UTF_8);
        } catch (UnsupportedEncodingException e8) {
            throw new IllegalStateException(e8);
        }
    }

    public abstract ParsedResult parse(Result result);

    protected static void maybeAppend(String[] strArr, StringBuilder sb) {
        if (strArr != null) {
            for (String str : strArr) {
                sb.append('\n');
                sb.append(str);
            }
        }
    }
}
