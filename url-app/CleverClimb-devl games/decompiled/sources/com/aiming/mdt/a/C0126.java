package com.aiming.mdt.a;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.aiming.mdt.a.ʼʽˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0126 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static boolean f383 = true;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static int f385 = 238;

    /* renamed from: ʼʾ, reason: contains not printable characters */
    private static int f387 = 1;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static int f388;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static char[] f384 = {337, 349, 347, 284, 356, 355, 348, 341, 346, 339, 357, 335, 352, 324, 333, 343, 353, 354, 340, 338, 303, 308, 318, 305, 322, 323, 320, 314, 315, 345, 311, 270, 316, 329, 301, 276, 331, 299, 278, 332, 280, 279};

    /* renamed from: ʼ, reason: contains not printable characters */
    private static boolean f386 = true;

    /* renamed from: ʻ, reason: contains not printable characters */
    public static String m473(String str) {
        int i = f388 + 35;
        f387 = i % 128;
        int i2 = i % 2;
        String str2 = "";
        try {
            Class<?> cls = Class.forName(m475(null, null, 127, "\u008a\u0089\u0088\u0087\u0086\u008e\u0084\u0087\u008a\u008d\u008d\u008c\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern());
            Field declaredField = cls.getDeclaredField(m475(null, null, 127, "\u008a\u0081\u0087\u008c\u0092\u0091\u0087\u0090\u008f").intern());
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Field declaredField2 = cls.getDeclaredField(m475(null, null, 127, "\u008a\u0088\u008c\u008d\u0082\u0092\u0091").intern());
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            Object invoke = obj2.getClass().getDeclaredMethod(m475(null, null, 127, "\u0092\u0087\u008a\u0083\u008a\u0081\u008c\u0089\u0097\u008d\u0082\u0096\u0092\u0087\u008a\u0083\u008a\u0091\u0090\u0092\u008d\u008a\u0085\u0094\u0095\u0094\u0090\u0089\u008c\u008e\u0094\u0087\u0090\u0093").intern(), String.class).invoke(obj2, str);
            if ((invoke != null ? 'B' : (char) 19) == 'B') {
                String m474 = m474(String.valueOf(invoke.getClass().getDeclaredMethod(m475(null, null, 127, "\u009c\u009b\u009a\u0095\u0099\u0098\u0092\u008a\u0088").intern(), Boolean.TYPE).invoke(invoke, Boolean.FALSE)));
                if (TextUtils.isEmpty(m474)) {
                    int i3 = f388 + 111;
                    f387 = i3 % 128;
                    str2 = String.valueOf(!(i3 % 2 != 0) ? invoke.getClass().getDeclaredMethod(m475(null, null, 54, "\u0094\u009f\u0092\u008a\u009e\u008d\u008c\u009d\u0094\u0095\u0092\u008a\u0088").intern(), new Class[1]).invoke(invoke, new Object[1]) : invoke.getClass().getDeclaredMethod(m475(null, null, 127, "\u0094\u009f\u0092\u008a\u009e\u008d\u008c\u009d\u0094\u0095\u0092\u008a\u0088").intern(), new Class[0]).invoke(invoke, new Object[0]));
                } else {
                    str2 = m474;
                }
                int i4 = f387 + 115;
                f388 = i4 % 128;
                int i5 = i4 % 2;
            }
        } catch (Throwable unused) {
            m475(null, null, 127, "\u008d\u0082\u008d\u008d\u008a \u008a\u0083\u008c¡\u008a\u0088\u008c\u009e\u0081\u008c\u0097\u0092\u008a\u0088 \u0089\u0090\u0092\u009a\u008a\u0089\u0088\u0087\u0086\u008e").intern();
            C0044.m107();
        }
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x007d, code lost:
    
        r7 = com.aiming.mdt.a.C0126.f388 + 7;
        com.aiming.mdt.a.C0126.f387 = r7 % 128;
        r7 = r7 % 2;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0067, code lost:
    
        r3 = com.aiming.mdt.a.C0126.f388 + 71;
        com.aiming.mdt.a.C0126.f387 = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
    
        r7 = r7.group(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0074, code lost:
    
        r0 = com.aiming.mdt.a.C0126.f387 + 1;
        com.aiming.mdt.a.C0126.f388 = r0 % 128;
        r0 = r0 % 2;
        r0 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if ((r7.find()) != true) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
    
        if (r7.find() != false) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* renamed from: ʻʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String m474(String str) {
        String str2;
        Matcher matcher;
        int i = f387 + 1;
        f388 = i % 128;
        ?? r0 = i % 2 != 0 ? 2 : 21;
        try {
            if (r0 != 21) {
                r0 = "";
                m475(null, null, 92, "ª©¥¤¨¢§¦\u0094\u0090¥¤£¢").intern();
                matcher = Pattern.compile(m475(null, null, 2, "ª©¥¤¨¢§¦\u0094\u0090¥¤£¢").intern(), 4).matcher(str);
            } else {
                r0 = "";
                m475(null, null, 127, "ª©¥¤¨¢§¦\u0094\u0090¥¤£¢").intern();
                matcher = Pattern.compile(m475(null, null, 127, "ª©¥¤¨¢§¦\u0094\u0090¥¤£¢").intern(), 2).matcher(str);
            }
        } catch (Throwable unused) {
            m475(null, null, 127, "\u008d\u0082\u008d\u008d\u008a \u0088\u009e\u0097\u0092\u008a\u0088 \u0089\u0090\u0092\u009a\u008a\u0089\u0088\u0087\u0086\u008e").intern();
            C0044.m107();
            str2 = r0;
        }
        return str2;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static String m475(String str, int[] iArr, int i, String str2) {
        int i2 = f387 + 7;
        f388 = i2 % 128;
        int i3 = 0;
        if (i2 % 2 != 0) {
        }
        byte[] bytes = str2.getBytes("ISO-8859-1");
        char[] cArr = f384;
        int i4 = f385;
        if (f386) {
            int i5 = f388 + 121;
            f387 = i5 % 128;
            int i6 = i5 % 2;
            int length = bytes.length;
            char[] cArr2 = new char[length];
            int i7 = f388 + 45;
            f387 = i7 % 128;
            if (i7 % 2 == 0) {
            }
            while (i3 < length) {
                cArr2[i3] = (char) (cArr[bytes[(length - 1) - i3] + i] - i4);
                i3++;
            }
            return new String(cArr2);
        }
        char[] cArr3 = null;
        if (!(f383 ? false : true)) {
            int length2 = cArr3.length;
            char[] cArr4 = new char[length2];
            while (i3 < length2) {
                cArr4[i3] = (char) (cArr[cArr3[(length2 - 1) - i3] - i] - i4);
                i3++;
                int i8 = f387 + 99;
                f388 = i8 % 128;
                if (i8 % 2 != 0) {
                }
            }
            return new String(cArr4);
        }
        int length3 = cArr3.length;
        char[] cArr5 = new char[length3];
        while (true) {
            if ((i3 < length3 ? 'U' : (char) 15) == 15) {
                return new String(cArr5);
            }
            cArr5[i3] = (char) (cArr[cArr3[(length3 - 1) - i3] - i] - i4);
            i3++;
        }
    }
}
