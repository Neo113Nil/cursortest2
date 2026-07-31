package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.fe, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1925fe {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f25760a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final y00 f25761b;

    public C1925fe(@NotNull Context context, @NotNull y00 deviceInfoProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceInfoProvider, "deviceInfoProvider");
        this.f25760a = context;
        this.f25761b = deviceInfoProvider;
    }

    @NotNull
    public final mw a() {
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of;
        PackageManager packageManager = this.f25760a.getPackageManager();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33) {
            String packageName = this.f25760a.getPackageName();
            of = PackageManager.PackageInfoFlags.of(0L);
            packageInfo = packageManager.getPackageInfo(packageName, of);
        } else {
            packageInfo = packageManager.getPackageInfo(this.f25760a.getPackageName(), 0);
        }
        this.f25761b.getClass();
        String b4 = y00.b();
        if (b4 == null) {
            b4 = "Undefined";
        }
        String str = "Android " + b4;
        String str2 = "API " + i4;
        String packageName2 = packageInfo.packageName;
        Intrinsics.checkNotNullExpressionValue(packageName2, "packageName");
        String versionName = packageInfo.versionName;
        Intrinsics.checkNotNullExpressionValue(versionName, "versionName");
        return new mw(packageName2, versionName, str, str2);
    }
}
