package com.baidu.bbalbscesium.k.d;

import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    final String f4161a;

    /* renamed from: b, reason: collision with root package name */
    final String f4162b;

    /* renamed from: c, reason: collision with root package name */
    final String f4163c;

    /* renamed from: d, reason: collision with root package name */
    final String f4164d;

    private g(String str, String str2, String str3, String str4) {
        this.f4161a = str + str2;
        this.f4162b = str2.toUpperCase(Locale.ENGLISH);
        this.f4163c = str3;
        this.f4164d = str4;
    }

    public static g a(String str) {
        String[] b8 = b(str);
        String str2 = b8[0];
        String str3 = b8[1];
        String str4 = b8[2];
        if (str3 != null && str3.length() == 0) {
            str3 = null;
        }
        if (str4 != null && str4.length() == 0) {
            str4 = null;
        }
        return new g(str2, "", str3, str4);
    }

    private static String[] b(String str) {
        if (str == null) {
            throw new NoSuchAlgorithmException("No transformation given");
        }
        String[] strArr = new String[3];
        StringTokenizer stringTokenizer = new StringTokenizer(str, "/");
        int i8 = 0;
        while (stringTokenizer.hasMoreTokens() && i8 < 3) {
            try {
                strArr[i8] = stringTokenizer.nextToken().trim();
                i8++;
            } catch (NoSuchElementException unused) {
                throw new NoSuchAlgorithmException("Invalid transformation format:" + str);
            }
        }
        if (i8 == 0 || i8 == 2 || stringTokenizer.hasMoreTokens()) {
            throw new NoSuchAlgorithmException("Invalid transformation format:" + str);
        }
        String str2 = strArr[0];
        if (str2 != null && str2.length() != 0) {
            return strArr;
        }
        throw new NoSuchAlgorithmException("Invalid transformation:algorithm not specified-" + str);
    }

    public void a(c cVar) {
        String str = this.f4163c;
        if (str != null) {
            cVar.a(str);
        }
        String str2 = this.f4164d;
        if (str2 != null) {
            cVar.b(str2);
        }
    }
}
