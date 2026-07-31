package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import o2.C3345o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class qd2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final nd2 f30747a;

    public /* synthetic */ qd2(Context context, C2286v2 c2286v2, ma1 ma1Var, if1 if1Var) {
        this(context, c2286v2, ma1Var, if1Var, new nd2(context, c2286v2, ma1Var, if1Var));
    }

    @Nullable
    public final Object a(@NotNull ArrayList arrayList, @NotNull kotlin.coroutines.d dVar) {
        C3345o c3345o = new C3345o(AbstractC1241b.c(dVar), 1);
        c3345o.E();
        this.f30747a.a(arrayList, new pd2(c3345o));
        Object y4 = c3345o.y();
        if (y4 == AbstractC1241b.f()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4;
    }

    public qd2(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull ma1 reportParametersProvider, @NotNull if1 requestConfigurationParametersProvider, @NotNull nd2 videoAdsResponseHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(reportParametersProvider, "reportParametersProvider");
        Intrinsics.checkNotNullParameter(requestConfigurationParametersProvider, "requestConfigurationParametersProvider");
        Intrinsics.checkNotNullParameter(videoAdsResponseHandler, "videoAdsResponseHandler");
        this.f30747a = videoAdsResponseHandler;
    }
}
