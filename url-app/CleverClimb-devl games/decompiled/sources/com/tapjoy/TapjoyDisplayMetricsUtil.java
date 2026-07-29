package com.tapjoy;

import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* loaded from: classes2.dex */
public class TapjoyDisplayMetricsUtil {

    /* renamed from: a, reason: collision with root package name */
    private Context f7773a;

    /* renamed from: b, reason: collision with root package name */
    private Configuration f7774b;

    /* renamed from: c, reason: collision with root package name */
    private DisplayMetrics f7775c = new DisplayMetrics();

    public TapjoyDisplayMetricsUtil(Context context) {
        this.f7773a = context;
        ((WindowManager) this.f7773a.getSystemService("window")).getDefaultDisplay().getMetrics(this.f7775c);
        this.f7774b = this.f7773a.getResources().getConfiguration();
    }

    public int getScreenDensityDPI() {
        return this.f7775c.densityDpi;
    }

    public float getScreenDensityScale() {
        return this.f7775c.density;
    }

    public int getScreenLayoutSize() {
        return this.f7774b.screenLayout & 15;
    }
}
