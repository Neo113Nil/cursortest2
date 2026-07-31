package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.np0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class hp0 {
    @NotNull
    public static gp0 a(@NotNull Context context, @NotNull um2 sdkEnvironmentModule) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext);
        int i4 = ew1.f25476l;
        du1 a4 = ew1.a.a().a(applicationContext);
        if (a4 == null || !a4.j0()) {
            return new C2326wj(applicationContext, sdkEnvironmentModule, new ts0(applicationContext), new ps0(), new fp0(sdkEnvironmentModule));
        }
        ts0 ts0Var = new ts0(applicationContext);
        ps0 ps0Var = new ps0();
        fp0 fp0Var = new fp0(sdkEnvironmentModule);
        int i5 = np0.f29723e;
        return new um(applicationContext, sdkEnvironmentModule, ts0Var, ps0Var, fp0Var, np0.a.a(), new qk1());
    }
}
