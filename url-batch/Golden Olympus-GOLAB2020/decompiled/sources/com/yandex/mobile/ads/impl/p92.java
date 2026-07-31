package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class p92 implements xp1<o92> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final w92 f30367a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2105n4 f30368b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final xp1<o92> f30369c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final nd2 f30370d;

    public p92(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull w92 vastRequestConfiguration, @NotNull x92 requestConfigurationParametersProvider, @NotNull C2105n4 adLoadingPhasesManager, @NotNull m92 reportParametersProvider, @NotNull xp1 requestListener, @NotNull nd2 responseHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(vastRequestConfiguration, "vastRequestConfiguration");
        Intrinsics.checkNotNullParameter(requestConfigurationParametersProvider, "requestConfigurationParametersProvider");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(reportParametersProvider, "reportParametersProvider");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        Intrinsics.checkNotNullParameter(responseHandler, "responseHandler");
        this.f30367a = vastRequestConfiguration;
        this.f30368b = adLoadingPhasesManager;
        this.f30369c = requestListener;
        this.f30370d = responseHandler;
    }

    public static final void a(p92 p92Var, hb2 hb2Var) {
        p92Var.getClass();
        p92Var.f30368b.a(EnumC2082m4.f28863t, new u92("error", hb2Var), p92Var.f30367a);
    }

    public final class a implements xp1<List<? extends bb2>> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final o92 f30371a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final xp1<o92> f30372b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ p92 f30373c;

        public a(p92 p92Var, @NotNull o92 vastData, @NotNull xp1<o92> requestListener) {
            Intrinsics.checkNotNullParameter(vastData, "vastData");
            Intrinsics.checkNotNullParameter(requestListener, "requestListener");
            this.f30373c = p92Var;
            this.f30371a = vastData;
            this.f30372b = requestListener;
        }

        @Override // com.yandex.mobile.ads.impl.xp1
        public final void a(@NotNull hb2 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            p92.a(this.f30373c, error);
            this.f30372b.a(error);
        }

        @Override // com.yandex.mobile.ads.impl.xp1
        public final void a(List<? extends bb2> list) {
            List<? extends bb2> result = list;
            Intrinsics.checkNotNullParameter(result, "result");
            p92.a(this.f30373c);
            this.f30372b.a((xp1<o92>) new o92(new j92(this.f30371a.b().a(), result), this.f30371a.a()));
        }
    }

    public static final void a(p92 p92Var) {
        p92Var.getClass();
        p92Var.f30368b.a(EnumC2082m4.f28863t, new u92("success", null), p92Var.f30367a);
    }

    @Override // com.yandex.mobile.ads.impl.xp1
    public final void a(@NotNull hb2 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f30368b.a(EnumC2082m4.f28863t, new u92("error", error), this.f30367a);
        this.f30369c.a(error);
    }

    @Override // com.yandex.mobile.ads.impl.xp1
    public final void a(o92 o92Var) {
        o92 result = o92Var;
        Intrinsics.checkNotNullParameter(result, "result");
        this.f30370d.a(result.b().b(), new a(this, result, this.f30369c));
    }
}
