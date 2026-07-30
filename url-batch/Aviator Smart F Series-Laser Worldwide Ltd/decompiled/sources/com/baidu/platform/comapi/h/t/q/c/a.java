package com.baidu.platform.comapi.h.t.q.c;

import android.content.Context;
import android.util.DisplayMetrics;
import com.baidu.location.BDLocation;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private int f9320a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f9321b = -1;

    /* renamed from: c, reason: collision with root package name */
    private float f9322c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    private int f9323d = -1;

    /* renamed from: e, reason: collision with root package name */
    private int f9324e = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f9325f = -1;

    /* renamed from: g, reason: collision with root package name */
    private double f9326g = -1.0d;

    public void a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f9320a = displayMetrics.widthPixels;
        this.f9321b = displayMetrics.heightPixels;
        this.f9322c = displayMetrics.density;
        this.f9323d = (int) displayMetrics.xdpi;
        this.f9324e = (int) displayMetrics.ydpi;
        double sqrt = Math.sqrt((r1 * r1) + (r0 * r0));
        double d8 = displayMetrics.widthPixels / displayMetrics.xdpi;
        double d9 = displayMetrics.heightPixels / displayMetrics.ydpi;
        int ceil = (int) Math.ceil(sqrt / Math.sqrt((d8 * d8) + (d9 * d9)));
        this.f9325f = ceil;
        if (ceil < 240) {
            this.f9325f = displayMetrics.densityDpi;
        }
        if (this.f9325f == 0) {
            this.f9325f = BDLocation.TypeCoarseLocation;
        }
        this.f9326g = this.f9325f / 240.0d;
    }

    public int b() {
        if (this.f9321b == -1) {
            a(com.baidu.platform.comapi.h.t.q.a.a());
        }
        return this.f9321b;
    }

    public int c() {
        if (this.f9320a == -1) {
            a(com.baidu.platform.comapi.h.t.q.a.a());
        }
        return this.f9320a;
    }

    public float a() {
        if (this.f9322c == -1.0f) {
            a(com.baidu.platform.comapi.h.t.q.a.a());
        }
        return this.f9322c;
    }
}
