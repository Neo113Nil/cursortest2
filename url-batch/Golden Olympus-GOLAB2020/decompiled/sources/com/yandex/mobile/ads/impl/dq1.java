package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.Log;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.vz0;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class dq1 {
    @NotNull
    public static final cq1 a(@NotNull Context context, int i4) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i5 = um1.f33179b;
        boolean z4 = ii2.f27214a;
        ap0.a("Yandex Mobile Ads");
        ii2.f27214a = Log.isLoggable("Yandex Mobile Ads", 2);
        ii2.f27214a = false;
        C1931fk c1931fk = new C1931fk(new jh0(context, xs1.a()).a(), new C2374yl());
        File a4 = g10.a(context, "mobileads-volley-cache");
        int i6 = ew1.f25476l;
        du1 a5 = ew1.a.a().a(context);
        cq1 cq1Var = new cq1(new f10(a4, (int) vz0.a.a(context, 10485760L, (a5 == null || a5.B() == 0) ? 52428800L : a5.B())), c1931fk, i4);
        cq1Var.a(new up1());
        return cq1Var;
    }
}
