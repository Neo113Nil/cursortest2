package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class dp0 implements id0<cp0> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f24730a;

    public dp0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f24730a = context;
    }

    @Override // com.yandex.mobile.ads.impl.id0
    public final cp0 a(C2360y7 adResponse, C2286v2 adConfiguration, rc0<cp0> fullScreenController) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(fullScreenController, "fullScreenController");
        return new cp0(this.f24730a, adResponse, adConfiguration, new kc0(), new yf0(), fullScreenController);
    }
}
