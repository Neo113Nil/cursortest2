package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.ironsource.b9;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes3.dex */
final class v12 {

    /* renamed from: a, reason: collision with root package name */
    public final int f33462a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33463b;

    /* renamed from: c, reason: collision with root package name */
    public final int f33464c;

    /* renamed from: d, reason: collision with root package name */
    public final int f33465d;

    /* renamed from: e, reason: collision with root package name */
    public final int f33466e;

    private v12(int i4, int i5, int i6, int i7, int i8) {
        this.f33462a = i4;
        this.f33463b = i5;
        this.f33464c = i6;
        this.f33465d = i7;
        this.f33466e = i8;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static v12 a(String str) {
        char c4;
        if (!str.startsWith("Format:")) {
            throw new IllegalArgumentException();
        }
        String[] split = TextUtils.split(str.substring(7), StringUtils.COMMA);
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        for (int i8 = 0; i8 < split.length; i8++) {
            String b4 = C2207rf.b(split[i8].trim());
            b4.getClass();
            switch (b4.hashCode()) {
                case 100571:
                    if (b4.equals("end")) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 3556653:
                    if (b4.equals(b9.h.f15450K0)) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 109757538:
                    if (b4.equals("start")) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 109780401:
                    if (b4.equals("style")) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            switch (c4) {
                case 0:
                    i5 = i8;
                    break;
                case 1:
                    i7 = i8;
                    break;
                case 2:
                    i4 = i8;
                    break;
                case 3:
                    i6 = i8;
                    break;
            }
        }
        if (i4 == -1 || i5 == -1 || i7 == -1) {
            return null;
        }
        return new v12(i4, i5, i6, i7, split.length);
    }
}
