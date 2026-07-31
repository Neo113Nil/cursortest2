package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.e1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1888e1 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f25054b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f25055c;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2307w0 f25056a = new C2307w0();

    static {
        String str = "com.yandex.mobile.ads.common.AdActivity";
        f25054b = str;
        f25055c = "There is no presence of " + str + " activity in AndroidManifest file.";
    }

    @SuppressLint({"WrongConstant"})
    public final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), f25054b), 0);
            Intrinsics.checkNotNullExpressionValue(activityInfo, "getActivityInfo(...)");
            this.f25056a.getClass();
            C2307w0.a(activityInfo);
        } catch (PackageManager.NameNotFoundException unused) {
            String str = f25055c;
            throw new jo0(str, str);
        }
    }
}
