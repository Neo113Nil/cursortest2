package com.yandex.mobile.ads.impl;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a10 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ct1 f23118a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final lt1 f23119b;

    public /* synthetic */ a10() {
        this(new ct1());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (r8.getPackageManager().hasSystemFeature("android.hardware.touchscreen") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004e, code lost:
    
        if (r8.getCurrentModeType() == 4) goto L19;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final z00 a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Point a4 = this.f23119b.a(context);
        int i4 = a4.x;
        int i5 = a4.y;
        float f4 = displayMetrics.density;
        float f5 = i4;
        float f6 = i5;
        float f7 = kotlin.ranges.g.f(f5 / f4, f6 / f4);
        float f8 = f4 * 160;
        float f9 = f5 / f8;
        float f10 = f6 / f8;
        double sqrt = Math.sqrt((f10 * f10) + (f9 * f9));
        if (C2385z9.a(13)) {
            Object systemService = context.getSystemService("uimode");
            UiModeManager uiModeManager = systemService instanceof UiModeManager ? (UiModeManager) systemService : null;
            if (uiModeManager != null) {
            }
        } else if (sqrt >= 15.0d) {
            this.f23118a.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter("android.hardware.touchscreen", "name");
            try {
            } catch (Throwable unused) {
                ap0.c(new Object[0]);
            }
        }
        return (sqrt >= 7.0d || f7 >= 600.0f) ? z00.f35412c : z00.f35411b;
        return z00.f35413d;
    }

    public a10(@NotNull ct1 safePackageManager) {
        Intrinsics.checkNotNullParameter(safePackageManager, "safePackageManager");
        this.f23118a = safePackageManager;
        this.f23119b = new lt1();
    }
}
