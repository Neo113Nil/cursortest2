package com.startapp.sdk.internal;

import E1.AbstractC0033i;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: c, reason: collision with root package name */
    public static final String f4174c = si.a(71, 13, -10, 14, -3, -6, -5, -54, 66, -11, 13, -5, -4, 10, 0, -10, 6, -1, -64, 19, 2, 0, 2, 14, 0, 12);

    /* renamed from: d, reason: collision with root package name */
    public static final String f4175d = si.a(66, 3, 5, -9);

    /* renamed from: e, reason: collision with root package name */
    public static final String f4176e = si.a(61, 12, -14, 17, 1, -14);
    public static final String f = si.a(56, -1, 2, 8, -4, 11, -3, 6, -7, -10);

    /* renamed from: g, reason: collision with root package name */
    public static final String f4177g = si.a(86, -19, 3, -12, -2, 19, -11, 6, -1);

    /* renamed from: a, reason: collision with root package name */
    public final Context f4178a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f4179b = new AtomicInteger(0);

    public n0(Context context) {
        this.f4178a = context;
    }

    public final String a() {
        Context context = this.f4178a;
        StringBuilder sb = new StringBuilder();
        String str = f4174c;
        sb.append(str);
        sb.append(f4176e);
        String str2 = f4177g;
        sb.append(str2);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        String m3 = AbstractC0033i.m(sb3, f4175d, str2);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str);
        int[] a3 = si.a(context, sb2, m3, AbstractC0033i.m(sb4, f, str2));
        StringBuilder sb5 = new StringBuilder(a3.length);
        for (int i3 : a3) {
            sb5.append(i3);
        }
        return sb5.toString();
    }
}
