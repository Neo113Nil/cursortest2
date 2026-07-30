package com.blankj.utilcode.util;

import android.content.res.Resources;
import androidx.annotation.ArrayRes;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import java.util.IllegalFormatException;

/* loaded from: classes2.dex */
public final class v0 {
    private v0() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean equals(CharSequence charSequence, CharSequence charSequence2) {
        int length;
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || (length = charSequence.length()) != charSequence2.length()) {
            return false;
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        for (int i8 = 0; i8 < length; i8++) {
            if (charSequence.charAt(i8) != charSequence2.charAt(i8)) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsIgnoreCase(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static String format(@Nullable String str, Object... objArr) {
        if (str == null || objArr == null || objArr.length <= 0) {
            return str;
        }
        try {
            return String.format(str, objArr);
        } catch (IllegalFormatException e8) {
            e8.printStackTrace();
            return str;
        }
    }

    public static String getString(@StringRes int i8) {
        return getString(i8, null);
    }

    public static String[] getStringArray(@ArrayRes int i8) {
        try {
            return z0.getApp().getResources().getStringArray(i8);
        } catch (Resources.NotFoundException e8) {
            e8.printStackTrace();
            return new String[]{String.valueOf(i8)};
        }
    }

    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean isSpace(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (!Character.isWhitespace(str.charAt(i8))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isTrimEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static int length(CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        return charSequence.length();
    }

    public static String lowerFirstLetter(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (!Character.isUpperCase(str.charAt(0))) {
            return str;
        }
        return String.valueOf((char) (str.charAt(0) + ' ')) + str.substring(1);
    }

    public static String null2Length0(String str) {
        return str == null ? "" : str;
    }

    public static String reverse(String str) {
        if (str == null) {
            return "";
        }
        int length = str.length();
        if (length <= 1) {
            return str;
        }
        int i8 = length >> 1;
        char[] charArray = str.toCharArray();
        for (int i9 = 0; i9 < i8; i9++) {
            char c8 = charArray[i9];
            int i10 = (length - i9) - 1;
            charArray[i9] = charArray[i10];
            charArray[i10] = c8;
        }
        return new String(charArray);
    }

    public static String toDBC(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        for (int i8 = 0; i8 < length; i8++) {
            char c8 = charArray[i8];
            if (c8 == 12288) {
                charArray[i8] = ' ';
            } else if (65281 > c8 || c8 > 65374) {
                charArray[i8] = c8;
            } else {
                charArray[i8] = (char) (c8 - 65248);
            }
        }
        return new String(charArray);
    }

    public static String toSBC(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        for (int i8 = 0; i8 < length; i8++) {
            char c8 = charArray[i8];
            if (c8 == ' ') {
                charArray[i8] = 12288;
            } else if ('!' > c8 || c8 > '~') {
                charArray[i8] = c8;
            } else {
                charArray[i8] = (char) (c8 + 65248);
            }
        }
        return new String(charArray);
    }

    public static String upperFirstLetter(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (!Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return ((char) (str.charAt(0) - ' ')) + str.substring(1);
    }

    public static String getString(@StringRes int i8, Object... objArr) {
        try {
            return format(z0.getApp().getString(i8), objArr);
        } catch (Resources.NotFoundException e8) {
            e8.printStackTrace();
            return String.valueOf(i8);
        }
    }
}
