package org.commonmark.internal.util;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public abstract class Html5Entities {
    public static final HashMap NAMED_CHARACTER_REFERENCES;
    public static final Pattern NUMERIC_PATTERN;

    static {
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Html5Entities.class.getResourceAsStream("/org/commonmark/internal/util/entities.properties"), Charset.forName("UTF-8")));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        bufferedReader.close();
                        hashMap.put("NewLine", "\n");
                        NAMED_CHARACTER_REFERENCES = hashMap;
                        NUMERIC_PATTERN = Pattern.compile("^&#[Xx]?");
                        return;
                    }
                    if (readLine.length() != 0) {
                        int indexOf = readLine.indexOf("=");
                        hashMap.put(readLine.substring(0, indexOf), readLine.substring(indexOf + 1));
                    }
                } finally {
                }
            }
        } catch (IOException e) {
            a$$ExternalSyntheticBUOutline0.m("Failed reading data for HTML named character references", e);
        }
    }

    public static String entityToString(String str) {
        Matcher matcher = NUMERIC_PATTERN.matcher(str);
        if (!matcher.find()) {
            String str2 = (String) NAMED_CHARACTER_REFERENCES.get(Boxes$$ExternalSyntheticOutline1.m1148m(1, 1, str));
            return str2 != null ? str2 : str;
        }
        try {
            int parseInt = Integer.parseInt(str.substring(matcher.end(), str.length() - 1), matcher.end() == 2 ? 10 : 16);
            return parseInt == 0 ? "�" : new String(Character.toChars(parseInt));
        } catch (IllegalArgumentException unused) {
            return "�";
        }
    }
}
