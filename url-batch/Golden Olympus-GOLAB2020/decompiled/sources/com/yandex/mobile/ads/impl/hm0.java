package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class hm0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ob2<on0> f26808a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final bg2 f26809b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final tn0 f26810c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final wd2 f26811d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final h82 f26812e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final xe1 f26813f;

    public /* synthetic */ hm0(Context context, vu1 vu1Var, ss ssVar, ob2 ob2Var, bg2 bg2Var, tn0 tn0Var, wd2 wd2Var) {
        this(context, vu1Var, ssVar, ob2Var, bg2Var, tn0Var, wd2Var, new gn0(context, vu1Var, ssVar, ob2Var), new h82(context));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View v4) {
        Intrinsics.checkNotNullParameter(v4, "v");
        this.f26809b.m();
        this.f26810c.i(this.f26808a.d());
        String a4 = this.f26811d.a();
        if (a4 == null || a4.length() == 0) {
            return;
        }
        this.f26813f.a(this.f26812e.a(a4));
    }

    public hm0(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull ss coreInstreamAdBreak, @NotNull ob2<on0> videoAdInfo, @NotNull bg2 videoTracker, @NotNull tn0 playbackListener, @NotNull wd2 videoClicks, @NotNull gn0 openUrlHandlerProvider, @NotNull h82 urlModifier) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(coreInstreamAdBreak, "coreInstreamAdBreak");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        Intrinsics.checkNotNullParameter(playbackListener, "playbackListener");
        Intrinsics.checkNotNullParameter(videoClicks, "videoClicks");
        Intrinsics.checkNotNullParameter(openUrlHandlerProvider, "openUrlHandlerProvider");
        Intrinsics.checkNotNullParameter(urlModifier, "urlModifier");
        this.f26808a = videoAdInfo;
        this.f26809b = videoTracker;
        this.f26810c = playbackListener;
        this.f26811d = videoClicks;
        this.f26812e = urlModifier;
        this.f26813f = openUrlHandlerProvider.a();
    }
}
