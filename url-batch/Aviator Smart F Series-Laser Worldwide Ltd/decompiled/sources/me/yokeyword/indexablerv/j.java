package me.yokeyword.indexablerv;

import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public class j {
    private static final String PATTERN_LETTER = "^[a-zA-Z].*+";
    private static final String PATTERN_POLYPHONE = "^#[a-zA-Z]+#.+";

    static String gePolyphoneInitial(String str) {
        return str.substring(1, 2);
    }

    public static String getPingYin(String str) {
        return str == null ? "" : com.github.promeg.pinyinhelper.c.toPinyin(str, "").toLowerCase();
    }

    static String getPolyphoneRealHanzi(String str) {
        return str.split("#")[2];
    }

    static String getPolyphoneRealPinyin(String str) {
        return str.split("#")[1];
    }

    static boolean matchingLetter(String str) {
        return Pattern.matches(PATTERN_LETTER, str);
    }

    static boolean matchingPolyphone(String str) {
        return Pattern.matches(PATTERN_POLYPHONE, str);
    }
}
