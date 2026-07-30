package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class Strings {
    private Strings() {
    }

    public static String commonPrefix(CharSequence charSequence, CharSequence charSequence2) {
        Preconditions.checkNotNull(charSequence);
        Preconditions.checkNotNull(charSequence2);
        int min = Math.min(charSequence.length(), charSequence2.length());
        int i8 = 0;
        while (i8 < min && charSequence.charAt(i8) == charSequence2.charAt(i8)) {
            i8++;
        }
        int i9 = i8 - 1;
        if (validSurrogatePairAt(charSequence, i9) || validSurrogatePairAt(charSequence2, i9)) {
            i8--;
        }
        return charSequence.subSequence(0, i8).toString();
    }

    public static String commonSuffix(CharSequence charSequence, CharSequence charSequence2) {
        Preconditions.checkNotNull(charSequence);
        Preconditions.checkNotNull(charSequence2);
        int min = Math.min(charSequence.length(), charSequence2.length());
        int i8 = 0;
        while (i8 < min && charSequence.charAt((charSequence.length() - i8) - 1) == charSequence2.charAt((charSequence2.length() - i8) - 1)) {
            i8++;
        }
        if (validSurrogatePairAt(charSequence, (charSequence.length() - i8) - 1) || validSurrogatePairAt(charSequence2, (charSequence2.length() - i8) - 1)) {
            i8--;
        }
        return charSequence.subSequence(charSequence.length() - i8, charSequence.length()).toString();
    }

    @CheckForNull
    public static String emptyToNull(@CheckForNull String str) {
        return Platform.emptyToNull(str);
    }

    public static boolean isNullOrEmpty(@CheckForNull String str) {
        return Platform.stringIsNullOrEmpty(str);
    }

    public static String lenientFormat(@CheckForNull String str, @CheckForNull Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        int i8 = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        } else {
            for (int i9 = 0; i9 < objArr.length; i9++) {
                objArr[i9] = lenientToString(objArr[i9]);
            }
        }
        StringBuilder sb = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i10 = 0;
        while (i8 < objArr.length && (indexOf = valueOf.indexOf("%s", i10)) != -1) {
            sb.append((CharSequence) valueOf, i10, indexOf);
            sb.append(objArr[i8]);
            i10 = indexOf + 2;
            i8++;
        }
        sb.append((CharSequence) valueOf, i10, valueOf.length());
        if (i8 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i8]);
            for (int i11 = i8 + 1; i11 < objArr.length; i11++) {
                sb.append(", ");
                sb.append(objArr[i11]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    private static String lenientToString(@CheckForNull Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e8) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
            sb.append(name);
            sb.append('@');
            sb.append(hexString);
            String sb2 = sb.toString();
            Logger logger = Logger.getLogger("com.google.common.base.Strings");
            Level level = Level.WARNING;
            String valueOf = String.valueOf(sb2);
            logger.log(level, valueOf.length() != 0 ? "Exception during lenientFormat for ".concat(valueOf) : new String("Exception during lenientFormat for "), (Throwable) e8);
            String name2 = e8.getClass().getName();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 9 + name2.length());
            sb3.append("<");
            sb3.append(sb2);
            sb3.append(" threw ");
            sb3.append(name2);
            sb3.append(">");
            return sb3.toString();
        }
    }

    public static String nullToEmpty(@CheckForNull String str) {
        return Platform.nullToEmpty(str);
    }

    public static String padEnd(String str, int i8, char c8) {
        Preconditions.checkNotNull(str);
        if (str.length() >= i8) {
            return str;
        }
        StringBuilder sb = new StringBuilder(i8);
        sb.append(str);
        for (int length = str.length(); length < i8; length++) {
            sb.append(c8);
        }
        return sb.toString();
    }

    public static String padStart(String str, int i8, char c8) {
        Preconditions.checkNotNull(str);
        if (str.length() >= i8) {
            return str;
        }
        StringBuilder sb = new StringBuilder(i8);
        for (int length = str.length(); length < i8; length++) {
            sb.append(c8);
        }
        sb.append(str);
        return sb.toString();
    }

    public static String repeat(String str, int i8) {
        Preconditions.checkNotNull(str);
        if (i8 <= 1) {
            Preconditions.checkArgument(i8 >= 0, "invalid count: %s", i8);
            return i8 == 0 ? "" : str;
        }
        int length = str.length();
        long j8 = length * i8;
        int i9 = (int) j8;
        if (i9 != j8) {
            StringBuilder sb = new StringBuilder(51);
            sb.append("Required array size too large: ");
            sb.append(j8);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        char[] cArr = new char[i9];
        str.getChars(0, length, cArr, 0);
        while (true) {
            int i10 = i9 - length;
            if (length >= i10) {
                System.arraycopy(cArr, 0, cArr, length, i10);
                return new String(cArr);
            }
            System.arraycopy(cArr, 0, cArr, length, length);
            length <<= 1;
        }
    }

    @VisibleForTesting
    static boolean validSurrogatePairAt(CharSequence charSequence, int i8) {
        return i8 >= 0 && i8 <= charSequence.length() + (-2) && Character.isHighSurrogate(charSequence.charAt(i8)) && Character.isLowSurrogate(charSequence.charAt(i8 + 1));
    }
}
