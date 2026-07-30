package cn.hutool.core.text;

import cn.hutool.core.util.c1;
import java.util.Map;

/* loaded from: classes.dex */
public class n {
    public static String format(String str, Object... objArr) {
        return formatWith(str, "{}", objArr);
    }

    public static String formatWith(String str, String str2, Object... objArr) {
        int i8;
        if (l.isBlank(str) || l.isBlank(str2) || cn.hutool.core.util.h.isEmpty(objArr)) {
            return str;
        }
        int length = str.length();
        int length2 = str2.length();
        StringBuilder sb = new StringBuilder(length + 50);
        int i9 = 0;
        int i10 = 0;
        while (i9 < objArr.length) {
            int indexOf = str.indexOf(str2, i10);
            if (indexOf == -1) {
                if (i10 == 0) {
                    return str;
                }
                sb.append((CharSequence) str, i10, length);
                return sb.toString();
            }
            if (indexOf > 0) {
                int i11 = indexOf - 1;
                if (str.charAt(i11) == '\\') {
                    if (indexOf <= 1 || str.charAt(indexOf - 2) != '\\') {
                        i9--;
                        sb.append((CharSequence) str, i10, i11);
                        sb.append(str2.charAt(0));
                        i8 = indexOf + 1;
                        i10 = i8;
                        i9++;
                    } else {
                        sb.append((CharSequence) str, i10, i11);
                        sb.append(c1.utf8Str(objArr[i9]));
                        i8 = indexOf + length2;
                        i10 = i8;
                        i9++;
                    }
                }
            }
            sb.append((CharSequence) str, i10, indexOf);
            sb.append(c1.utf8Str(objArr[i9]));
            i8 = indexOf + length2;
            i10 = i8;
            i9++;
        }
        sb.append((CharSequence) str, i10, length);
        return sb.toString();
    }

    public static String format(CharSequence charSequence, Map<?, ?> map, boolean z7) {
        if (charSequence == null) {
            return null;
        }
        if (map == null || map.isEmpty()) {
            return charSequence.toString();
        }
        String charSequence2 = charSequence.toString();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            String utf8Str = c1.utf8Str(entry.getValue());
            if (utf8Str != null || !z7) {
                charSequence2 = l.replace(charSequence2, "{" + entry.getKey() + "}", utf8Str);
            }
        }
        return charSequence2;
    }
}
