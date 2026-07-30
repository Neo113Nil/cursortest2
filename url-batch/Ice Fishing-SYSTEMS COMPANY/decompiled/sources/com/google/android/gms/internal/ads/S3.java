package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class S3 {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f27504c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f27505d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    public final Lr f27506a = new Lr();

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f27507b = new StringBuilder();

    public static void a(Lr lr) {
        while (true) {
            for (boolean z8 = true; lr.B() > 0 && z8; z8 = false) {
                int i = lr.f26234b;
                byte[] bArr = lr.f26233a;
                byte b9 = bArr[i];
                char c4 = (char) b9;
                if (c4 == '\t' || c4 == '\n' || c4 == '\f' || c4 == '\r' || c4 == ' ') {
                    lr.G(1);
                } else {
                    int i4 = lr.f26235c;
                    if (i + 2 <= i4) {
                        int i9 = i + 1;
                        if (b9 == 47) {
                            int i10 = i + 2;
                            if (bArr[i9] == 42) {
                                while (true) {
                                    int i11 = i10 + 1;
                                    if (i11 >= i4) {
                                        break;
                                    }
                                    if (((char) bArr[i10]) == '*' && ((char) bArr[i11]) == '/') {
                                        i4 = i10 + 2;
                                        i10 = i4;
                                    } else {
                                        i10 = i11;
                                    }
                                }
                                lr.G(i4 - lr.f26234b);
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    public static String b(Lr lr, StringBuilder sb) {
        a(lr);
        if (lr.B() == 0) {
            return null;
        }
        String c4 = c(lr, sb);
        if (!c4.isEmpty()) {
            return c4;
        }
        char K8 = (char) lr.K();
        StringBuilder sb2 = new StringBuilder(String.valueOf(K8).length());
        sb2.append(K8);
        return sb2.toString();
    }

    public static String c(Lr lr, StringBuilder sb) {
        sb.setLength(0);
        int i = lr.f26234b;
        int i4 = lr.f26235c;
        loop0: while (true) {
            for (boolean z8 = false; i < i4 && !z8; z8 = true) {
                char c4 = (char) lr.f26233a[i];
                if ((c4 >= 'A' && c4 <= 'Z') || ((c4 >= 'a' && c4 <= 'z') || ((c4 >= '0' && c4 <= '9') || c4 == '#' || c4 == '-' || c4 == '.' || c4 == '_'))) {
                    sb.append(c4);
                    i++;
                }
            }
        }
        lr.G(i - lr.f26234b);
        return sb.toString();
    }
}
