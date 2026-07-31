package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.C2069lf;
import com.yandex.mobile.ads.impl.ew1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.jf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2021jf {
    @NotNull
    public static Cif a(@NotNull Context context, @NotNull um2 sdkEnvironmentModule) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext);
        int i4 = ew1.f25476l;
        du1 a4 = ew1.a.a().a(applicationContext);
        if (a4 == null || !a4.Y()) {
            return new C2166pj(applicationContext, sdkEnvironmentModule, new ts0(applicationContext), new ps0(), new C2045kf(sdkEnvironmentModule));
        }
        ts0 ts0Var = new ts0(applicationContext);
        ps0 ps0Var = new ps0();
        C2045kf c2045kf = new C2045kf(sdkEnvironmentModule);
        int i5 = C2069lf.f28525e;
        return new rm(applicationContext, sdkEnvironmentModule, ts0Var, ps0Var, c2045kf, C2069lf.a.a(), new qk1());
    }
}
