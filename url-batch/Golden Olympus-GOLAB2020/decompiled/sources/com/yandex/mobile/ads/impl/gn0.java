package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class gn0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vu1 f26242a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ss f26243b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ob2<on0> f26244c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f26245d;

    public gn0(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull ss coreInstreamAdBreak, @NotNull ob2<on0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(coreInstreamAdBreak, "coreInstreamAdBreak");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f26242a = sdkEnvironmentModule;
        this.f26243b = coreInstreamAdBreak;
        this.f26244c = videoAdInfo;
        this.f26245d = context.getApplicationContext();
    }

    @NotNull
    public final xe1 a() {
        this.f26243b.c();
        hu b4 = this.f26244c.b();
        Context context = this.f26245d;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        vu1 vu1Var = this.f26242a;
        dn0 dn0Var = new dn0(context, vu1Var, b4, new C2286v2(gs.f26284h, vu1Var));
        Context context2 = this.f26245d;
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        return new wm0(context2, dn0Var, new n82(new m82()));
    }
}
