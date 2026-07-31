package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.tb2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fk2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f25831a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final x92 f25832b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final cd2 f25833c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final tb2 f25834d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fk2(Context context, C2286v2 c2286v2, x92 x92Var, cd2 cd2Var) {
        this(context, c2286v2, x92Var, cd2Var, tb2.a.a(context));
        int i4 = tb2.f32289d;
    }

    public final void a(@NotNull Context context, @NotNull bb2 wrapperAd, @NotNull xp1<List<bb2>> listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(wrapperAd, "wrapperAd");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f25834d.a(context, this.f25831a, this.f25832b, wrapperAd, this.f25833c, new gk2(context, wrapperAd, listener, new hk2(context, wrapperAd)));
    }

    public fk2(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull x92 requestConfigurationParametersProvider, @NotNull cd2 reportParametersProvider, @NotNull tb2 videoAdLoadNetwork) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(requestConfigurationParametersProvider, "requestConfigurationParametersProvider");
        Intrinsics.checkNotNullParameter(reportParametersProvider, "reportParametersProvider");
        Intrinsics.checkNotNullParameter(videoAdLoadNetwork, "videoAdLoadNetwork");
        this.f25831a = adConfiguration;
        this.f25832b = requestConfigurationParametersProvider;
        this.f25833c = reportParametersProvider;
        this.f25834d = videoAdLoadNetwork;
    }
}
