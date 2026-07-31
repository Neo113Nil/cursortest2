package com.startapp.sdk.internal;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class k0 {
    public static final String c = zh.a(71, 13, -10, 14, -3, -6, -5, -54, 66, -11, 13, -5, -4, 10, 0, -10, 6, -1, -64, 19, 2, 0, 2, 14, 0, 12);
    public static final String d = zh.a(66, 3, 5, -9);
    public static final String e = zh.a(61, 12, -14, 17, 1, -14);
    public static final String f = zh.a(56, -1, 2, 8, -4, 11, -3, 6, -7, -10);
    public static final String g = zh.a(86, -19, 3, -12, -2, 19, -11, 6, -1);

    /* renamed from: a, reason: collision with root package name */
    public final Context f295a;
    public final AtomicInteger b = new AtomicInteger(0);

    public k0(Context context) {
        this.f295a = context;
    }

    public final String a() {
        Context context = this.f295a;
        StringBuilder sb = new StringBuilder();
        String str = c;
        StringBuilder append = sb.append(str).append(e);
        String str2 = g;
        int[] a2 = zh.a(context, append.append(str2).toString(), str + d + str2, str + f + str2);
        StringBuilder sb2 = new StringBuilder(a2.length);
        for (int i : a2) {
            sb2.append(i);
        }
        return sb2.toString();
    }
}
