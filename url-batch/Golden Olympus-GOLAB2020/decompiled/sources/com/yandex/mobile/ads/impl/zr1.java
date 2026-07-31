package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.ks1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zr1 {
    @NotNull
    public static yr1 a(@NotNull Context context, @NotNull um2 sdkEnvironmentModule) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext);
        int i4 = ew1.f25476l;
        du1 a4 = ew1.a.a().a(applicationContext);
        if (a4 == null || !a4.x0()) {
            return new C1835bk(applicationContext, sdkEnvironmentModule, new ts0(applicationContext), new ps0(), new xr1(sdkEnvironmentModule));
        }
        ts0 ts0Var = new ts0(applicationContext);
        ps0 ps0Var = new ps0();
        xr1 xr1Var = new xr1(sdkEnvironmentModule);
        int i5 = ks1.f28313e;
        return new vm(applicationContext, sdkEnvironmentModule, ts0Var, ps0Var, xr1Var, ks1.a.a(), new qk1());
    }
}
