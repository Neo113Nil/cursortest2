package com.baidu.platform.comapi.util.l;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.baidu.location.BDLocation;
import com.baidu.vi.VIContext;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private int f9840a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f9841b = -1;

    /* renamed from: c, reason: collision with root package name */
    private float f9842c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    private int f9843d = -1;

    /* renamed from: e, reason: collision with root package name */
    private int f9844e = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f9845f = -1;

    /* renamed from: g, reason: collision with root package name */
    private double f9846g = -1.0d;

    public void a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i8 = displayMetrics.widthPixels;
        this.f9840a = i8;
        int i9 = displayMetrics.heightPixels;
        this.f9841b = i9;
        if (i8 <= 0 || i9 <= 0) {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            this.f9840a = displayMetrics.widthPixels;
            this.f9841b = displayMetrics.heightPixels;
        }
        this.f9842c = displayMetrics.density;
        this.f9843d = (int) displayMetrics.xdpi;
        this.f9844e = (int) displayMetrics.ydpi;
        int i10 = displayMetrics.densityDpi;
        this.f9845f = i10;
        if (i10 < 240) {
            this.f9845f = i10;
        }
        if (this.f9845f == 0) {
            this.f9845f = BDLocation.TypeCoarseLocation;
        }
        this.f9846g = this.f9845f / 240.0d;
    }

    public int b() {
        if (this.f9845f == -1) {
            a(VIContext.getContext());
        }
        return this.f9845f;
    }

    public int c() {
        if (this.f9841b == -1) {
            a(VIContext.getContext());
        }
        return this.f9841b;
    }

    public int d() {
        if (this.f9840a == -1) {
            a(VIContext.getContext());
        }
        return this.f9840a;
    }

    public float a() {
        if (this.f9842c == -1.0f) {
            a(VIContext.getContext());
        }
        return this.f9842c;
    }
}
