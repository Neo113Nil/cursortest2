package cn.hutool.core.io.file;

import cn.hutool.core.util.p0;
import java.io.File;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class c {
    public static final String EXT_CLASS = ".class";
    public static final String EXT_JAR = ".jar";
    public static final String EXT_JAVA = ".java";
    private static final Pattern FILE_NAME_INVALID_PATTERN_WIN = Pattern.compile("[\\\\/:*?\"<>|\r\n]");
    private static final CharSequence[] SPECIAL_SUFFIX = {"tar.bz2", "tar.Z", "tar.gz", "tar.xz"};
    public static final char UNIX_SEPARATOR = '/';
    public static final char WINDOWS_SEPARATOR = '\\';

    public static String cleanInvalid(String str) {
        return cn.hutool.core.text.l.isBlank(str) ? str : p0.delAll(FILE_NAME_INVALID_PATTERN_WIN, str);
    }

    public static boolean containsInvalid(String str) {
        return !cn.hutool.core.text.l.isBlank(str) && p0.contains(FILE_NAME_INVALID_PATTERN_WIN, str);
    }

    public static String extName(File file) {
        if (file == null || file.isDirectory()) {
            return null;
        }
        return extName(file.getName());
    }

    public static String getName(File file) {
        if (file != null) {
            return file.getName();
        }
        return null;
    }

    public static String getPrefix(File file) {
        return mainName(file);
    }

    public static String getSuffix(File file) {
        return extName(file);
    }

    public static boolean isType(String str, String... strArr) {
        return cn.hutool.core.text.l.equalsAnyIgnoreCase(extName(str), strArr);
    }

    public static String mainName(File file) {
        return file.isDirectory() ? file.getName() : mainName(file.getName());
    }

    public static String getName(String str) {
        int i8;
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return str;
        }
        if (cn.hutool.core.util.k.isFileSeparator(str.charAt(length - 1))) {
            length--;
        }
        int i9 = length - 1;
        while (true) {
            if (i9 <= -1) {
                i8 = 0;
                break;
            }
            if (cn.hutool.core.util.k.isFileSeparator(str.charAt(i9))) {
                i8 = i9 + 1;
                break;
            }
            i9--;
        }
        return str.substring(i8, length);
    }

    public static String getPrefix(String str) {
        return mainName(str);
    }

    public static String getSuffix(String str) {
        return extName(str);
    }

    public static String extName(String str) {
        if (str == null) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf == -1) {
            return "";
        }
        int lastIndexOf2 = str.substring(0, lastIndexOf).lastIndexOf(".");
        String substring = str.substring(lastIndexOf2 == -1 ? lastIndexOf : lastIndexOf2 + 1);
        if (cn.hutool.core.text.l.containsAny(substring, SPECIAL_SUFFIX)) {
            return substring;
        }
        String substring2 = str.substring(lastIndexOf + 1);
        return cn.hutool.core.text.l.containsAny(substring2, UNIX_SEPARATOR, WINDOWS_SEPARATOR) ? "" : substring2;
    }

    public static String mainName(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return str;
        }
        int i8 = 0;
        for (CharSequence charSequence : SPECIAL_SUFFIX) {
            if (cn.hutool.core.text.l.endWith(str, "." + ((Object) charSequence))) {
                return cn.hutool.core.text.l.subPre(str, (length - r5.length()) - 1);
            }
        }
        if (cn.hutool.core.util.k.isFileSeparator(str.charAt(length - 1))) {
            length--;
        }
        int i9 = length - 1;
        int i10 = length;
        while (true) {
            if (i9 < 0) {
                break;
            }
            char charAt = str.charAt(i9);
            if (length == i10 && '.' == charAt) {
                i10 = i9;
            }
            if (cn.hutool.core.util.k.isFileSeparator(charAt)) {
                i8 = i9 + 1;
                break;
            }
            i9--;
        }
        return str.substring(i8, i10);
    }
}
