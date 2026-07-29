package com.aiming.mdt.a;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.aiming.mdt.a.ʼʾˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0135 {

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static int f445 = 0;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static int f446 = 1;

    /* renamed from: ʻ, reason: contains not printable characters */
    private static char[] f444 = {'[', '.', ']', 'g', 'e', 't', ' ', 'p', 'a', 'r', 'm', 'v', 'l', 'u', 'o', '\\'};

    /* renamed from: ʼ, reason: contains not printable characters */
    private static char f447 = 4;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a4 A[Catch: Exception -> 0x00bb, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00bb, blocks: (B:3:0x0001, B:11:0x002e, B:22:0x004d, B:17:0x00a4, B:26:0x0093, B:36:0x0033, B:38:0x0035), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    /* renamed from: ʻ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Object m513(Object obj, String str) {
        String str2;
        Object obj2 = null;
        try {
            String[] split = str.split(m514("\u0001\u0002\u008c", (byte) 47, 3).intern());
            int length = split.length;
            Object obj3 = obj;
            for (int i = 0; i < length; i++) {
                int i2 = f445 + 123;
                f446 = i2 % 128;
                if ((i2 % 2 == 0 ? (char) 25 : '\t') != 25) {
                    str2 = split[i];
                    if (obj3 == null) {
                        return null;
                    }
                    if ((!(obj3 instanceof Map) ? ' ' : (char) 28) == ' ') {
                        try {
                            try {
                                Class<?> cls = obj3.getClass();
                                StringBuilder sb = new StringBuilder();
                                sb.append(m514("\u0000\u0007Á", (byte) 77, 3).intern());
                                sb.append(Character.toUpperCase(str2.charAt(0)));
                                sb.append(str2.substring(1));
                                Object invoke = cls.getMethod(sb.toString(), new Class[0]).invoke(obj3, new Object[0]);
                                int i3 = f446 + 113;
                                f445 = i3 % 128;
                                int i4 = i3 % 2;
                                obj3 = invoke;
                            } catch (NoSuchMethodException unused) {
                                Field declaredField = obj3.getClass().getDeclaredField(str2);
                                declaredField.setAccessible(true);
                                obj3 = declaredField.get(obj3);
                            }
                        } catch (NoSuchFieldException unused2) {
                            return null;
                        }
                    } else {
                        obj3 = ((Map) obj3).get(str2);
                        int i5 = f445 + 27;
                        f446 = i5 % 128;
                        int i6 = i5 % 2;
                    }
                } else {
                    str2 = split[i];
                    super.hashCode();
                    if (obj3 == null) {
                        return null;
                    }
                    if ((!(obj3 instanceof Map) ? ' ' : (char) 28) == ' ') {
                    }
                }
            }
            return obj3;
        } catch (Exception unused3) {
            m514("\u0000\u0007\u0006\u0007\u0004\u000b\n\t\u000e\n\b\t\r\u000e\u0005\u0007\u0005\b\n\rÓ", (byte) 97, 21).intern();
            C0044.m107();
            return null;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static String m514(String str, byte b2, int i) {
        int i2 = f446 + 95;
        f445 = i2 % 128;
        if (i2 % 2 == 0) {
        }
        int i3 = f446 + 5;
        f445 = i3 % 128;
        int i4 = i3 % 2;
        char[] charArray = str.toCharArray();
        char[] cArr = f444;
        char c2 = f447;
        char[] cArr2 = new char[i];
        if (i % 2 != 0) {
            i--;
            cArr2[i] = (char) (charArray[i] - b2);
        }
        if (!(i <= 1)) {
            int i5 = f445 + 75;
            f446 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 0;
            while (true) {
                if ((i7 >= i ? '(' : (char) 3) == '(') {
                    break;
                }
                char c3 = charArray[i7];
                int i8 = i7 + 1;
                char c4 = charArray[i8];
                if (c3 != c4) {
                    int i9 = c3 / c2;
                    int i10 = c3 % c2;
                    int i11 = c4 / c2;
                    int i12 = c4 % c2;
                    if (i10 != i12) {
                        if (i9 == i11) {
                            int i13 = f445 + 67;
                            f446 = i13 % 128;
                            int i14 = i13 % 2;
                            cArr2[i7] = cArr[(i9 * c2) + (((i10 + c2) - 1) % c2)];
                            cArr2[i8] = cArr[(i11 * c2) + (((i12 + c2) - 1) % c2)];
                        } else {
                            cArr2[i7] = cArr[(i9 * c2) + i12];
                            cArr2[i8] = cArr[(i11 * c2) + i10];
                        }
                    } else {
                        cArr2[i7] = cArr[((((i9 + c2) - 1) % c2) * c2) + i10];
                        cArr2[i8] = cArr[((((i11 + c2) - 1) % c2) * c2) + i12];
                    }
                } else {
                    cArr2[i7] = (char) (c3 - b2);
                    cArr2[i8] = (char) (c4 - b2);
                }
                i7 += 2;
            }
        }
        return new String(cArr2);
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public static String m515(Pattern pattern, String str, Object obj) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer(str.length() + 100);
        int i = f446 + 67;
        f445 = i % 128;
        int i2 = i % 2;
        do {
            Object m513 = m513(obj, matcher.group(1));
            if ((m513 != null ? 'b' : (char) 27) == 'b') {
                matcher.appendReplacement(stringBuffer, m513.toString());
            }
        } while ((!matcher.find() ? ' ' : ')') != ' ');
        matcher.appendTail(stringBuffer);
        String obj2 = stringBuffer.toString();
        int i3 = f445 + 95;
        f446 = i3 % 128;
        if (i3 % 2 != 0) {
        }
        return obj2;
    }
}
