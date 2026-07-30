package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* loaded from: classes2.dex */
public final class E0 {

    /* renamed from: a, reason: collision with root package name */
    public long f24621a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f24622b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f24623c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f24624d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f24625e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f24626f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f24627g = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f24628h = -1;

    public static long a(long j9, long j10, long j11, long j12, long j13, long j14) {
        if (j12 + 1 >= j13 || 1 + j10 >= j11) {
            return j12;
        }
        long j15 = (long) (((j13 - j12) / (j11 - j10)) * (j9 - j10));
        String str = AbstractC3548lu.f32613a;
        return Math.max(j12, Math.min(((j12 + j15) - j14) - (j15 / 20), j13 - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00be, code lost:
    
        if (r6.contains("REWARDED") != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(Context context, View view) {
        this.f24624d = this.f24623c;
        this.f24623c = SystemClock.uptimeMillis();
        long j9 = this.f24625e;
        if (j9 != -1) {
            this.f24626f = j9;
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            defaultDisplay.getRealMetrics(displayMetrics);
        } catch (NoSuchMethodError unused) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        int i = displayMetrics.widthPixels * displayMetrics.heightPixels;
        if (view != null) {
            int min = Math.min(view.getHeight(), displayMetrics.heightPixels) * Math.min(view.getWidth(), displayMetrics.widthPixels);
            if (min + min < i) {
                if (min == 0) {
                    try {
                        if (view.getClass().getName().contains("DebugGestureViewWrapper")) {
                            view = ((ViewGroup) view).getChildAt(0);
                        }
                        Object invoke = view.getClass().getMethod("getAdConfiguration", new Class[0]).invoke(view, new Object[0]);
                        Integer num = (Integer) invoke.getClass().getField("adType").get(invoke);
                        num.intValue();
                        String str = (String) invoke.getClass().getMethod("adTypeToString", Integer.TYPE).invoke(null, num);
                        if (!str.contains("INTERSTITIAL") && !str.contains("APP_OPEN")) {
                        }
                    } catch (ReflectiveOperationException | SecurityException unused2) {
                    }
                }
            }
            this.f24625e = this.f24623c;
            return;
        }
        this.f24625e = -1L;
    }
}
