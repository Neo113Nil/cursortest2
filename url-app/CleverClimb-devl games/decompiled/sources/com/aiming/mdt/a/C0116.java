package com.aiming.mdt.a;

import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.aiming.mdt.a.ʼʽʾˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0116 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static int f327 = 0;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static long f328 = 0;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static int f329 = 0;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static char f330 = 3058;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static int f331 = 1;

    /* renamed from: ʻ, reason: contains not printable characters */
    public static String m432(Object obj) {
        if (obj == null) {
            return "";
        }
        String str = "";
        try {
            Method declaredMethod = obj.getClass().getDeclaredMethod(m433("\u0000\u0000\u0000\u0000", "曮㩚╍ꘗ", (char) 5925, "툜", 1295669862).intern(), new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(obj, new Object[0]);
            if (!(invoke != null)) {
                str = "";
            } else {
                int i = f331 + 81;
                f329 = i % 128;
                int i2 = i % 2;
                Method declaredMethod2 = invoke.getClass().getDeclaredMethod(m433("\u0000\u0000\u0000\u0000", "曮㩚╍ꘗ", (char) 5925, "툜", 1295669862).intern(), new Class[0]);
                declaredMethod2.setAccessible(true);
                Matcher matcher = Pattern.compile(m433("\u0000\u0000\u0000\u0000", "嬝ذ繁토", (char) 41210, "섍㶓麉\udf96\uf25fࠅ騺\uf520㊯젚뾔䦄겤䩚鵑\uf335", 0).intern()).matcher(declaredMethod2.invoke(invoke, new Object[0]).toString());
                if ((matcher.find() ? '4' : '7') != '7') {
                    str = matcher.group(1);
                }
            }
        } catch (Throwable unused) {
            m433("\u0000\u0000\u0000\u0000", "讚\ueac2ᓆⵁ", (char) 0, "ਭ멤䫧⺘꿞퀽≫혍ᶼ㶗ṥ䔭熛쇲棅\uee42辆̂ﳽꬳ䱩\uec4e\uf821ᨎ籿ཁ耒䄍ᆌ쪶鸍㻌䞣⪬蓊ॄ☩窾", 0).intern();
            C0044.m109();
        }
        int i3 = f329 + 99;
        f331 = i3 % 128;
        if (i3 % 2 != 0) {
        }
        return str;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static String m433(String str, String str2, char c2, String str3, int i) {
        int i2 = f329 + 99;
        f331 = i2 % 128;
        int i3 = i2 % 2;
        char[] charArray = str3.toCharArray();
        int i4 = f329 + 51;
        f331 = i4 % 128;
        if (i4 % 2 == 0) {
        }
        char[] charArray2 = str2.toCharArray();
        int i5 = f331 + 99;
        f329 = i5 % 128;
        int i6 = i5 % 2;
        char[] charArray3 = str.toCharArray();
        char[] cArr = (char[]) charArray2.clone();
        char[] cArr2 = (char[]) charArray3.clone();
        cArr[0] = (char) (c2 ^ cArr[0]);
        cArr2[2] = (char) (cArr2[2] + ((char) i));
        int length = charArray.length;
        char[] cArr3 = new char[length];
        for (int i7 = 0; i7 < length; i7++) {
            C0192.m722(cArr, cArr2, i7);
            cArr3[i7] = (char) ((r8[i7] ^ cArr[(i7 + 3) % 4]) ^ f330);
        }
        return new String(cArr3);
    }
}
