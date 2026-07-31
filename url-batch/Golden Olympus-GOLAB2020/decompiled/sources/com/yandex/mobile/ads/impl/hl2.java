package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.appopenad.AppOpenAdLoadListener;
import com.yandex.mobile.ads.common.AdRequestError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class hl2 implements js {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final AppOpenAdLoadListener f26796a;

    static final class a extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AdRequestError f26798c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AdRequestError adRequestError) {
            super(0);
            this.f26798c = adRequestError;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            AppOpenAdLoadListener appOpenAdLoadListener = hl2.this.f26796a;
            if (appOpenAdLoadListener != null) {
                appOpenAdLoadListener.onAdFailedToLoad(this.f26798c);
            }
            return Unit.f41027a;
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ fl2 f26800c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(fl2 fl2Var) {
            super(0);
            this.f26800c = fl2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            AppOpenAdLoadListener appOpenAdLoadListener = hl2.this.f26796a;
            if (appOpenAdLoadListener != null) {
                appOpenAdLoadListener.onAdLoaded(this.f26800c);
            }
            return Unit.f41027a;
        }
    }

    public hl2(@Nullable AppOpenAdLoadListener appOpenAdLoadListener) {
        this.f26796a = appOpenAdLoadListener;
    }

    @Override // com.yandex.mobile.ads.impl.js
    public final void a(@NotNull C1866d3 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(error, "error");
        new CallbackStackTraceMarker(new a(new AdRequestError(error.b(), error.d(), error.a())));
    }

    @Override // com.yandex.mobile.ads.impl.js
    public final void a(@NotNull hs appOpenAd) {
        Intrinsics.checkNotNullParameter(appOpenAd, "appOpenAd");
        new CallbackStackTraceMarker(new b(new fl2(appOpenAd, new zk2())));
    }
}
