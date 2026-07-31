package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.feed.FeedAdLoadListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class t80 implements os {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final FeedAdLoadListener f32238a;

    static final class a extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AdRequestError f32240c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AdRequestError adRequestError) {
            super(0);
            this.f32240c = adRequestError;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            FeedAdLoadListener feedAdLoadListener = t80.this.f32238a;
            if (feedAdLoadListener != null) {
                feedAdLoadListener.onAdFailedToLoad(this.f32240c);
            }
            return Unit.f41027a;
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function0<Unit> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            FeedAdLoadListener feedAdLoadListener = t80.this.f32238a;
            if (feedAdLoadListener != null) {
                feedAdLoadListener.onAdLoaded();
            }
            return Unit.f41027a;
        }
    }

    public t80(@Nullable FeedAdLoadListener feedAdLoadListener) {
        this.f32238a = feedAdLoadListener;
    }

    @Override // com.yandex.mobile.ads.impl.os
    public final void onAdLoaded() {
        new CallbackStackTraceMarker(new b());
    }

    @Override // com.yandex.mobile.ads.impl.os
    public final void a(@NotNull C1866d3 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(error, "error");
        new CallbackStackTraceMarker(new a(new AdRequestError(error.b(), error.d(), error.a())));
    }
}
