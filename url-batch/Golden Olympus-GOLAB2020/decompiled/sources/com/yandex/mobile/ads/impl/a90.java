package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.yandex.div.R$style;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a90 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f23187a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mp1 f23188b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final tz1 f23189c;

    public /* synthetic */ a90(Context context, mp1 mp1Var) {
        this(context, mp1Var, new tz1());
    }

    @NotNull
    public final z80 a(@NotNull k20 clickHandler) {
        Intrinsics.checkNotNullParameter(clickHandler, "clickHandler");
        sz1 sz1Var = new sz1(this.f23188b);
        tz1 tz1Var = this.f23189c;
        Context context = this.f23187a;
        tz1Var.getClass();
        return new z80(new ContextThemeWrapper(this.f23187a, R$style.Div), tz1.a(context, sz1Var, clickHandler), sz1Var);
    }

    public a90(@NotNull Context appContext, @NotNull mp1 reporter, @NotNull tz1 sliderDivConfigurationCreator) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(sliderDivConfigurationCreator, "sliderDivConfigurationCreator");
        this.f23187a = appContext;
        this.f23188b = reporter;
        this.f23189c = sliderDivConfigurationCreator;
    }
}
