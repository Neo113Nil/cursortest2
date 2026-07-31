package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class df1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f24608a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC1912f1 f24609b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f24610c;

    public df1(@NotNull Context context, @NotNull C2360y7 adResponse, @NotNull C2193r1 adActivityListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adActivityListener, "adActivityListener");
        this.f24608a = adResponse;
        this.f24609b = adActivityListener;
        this.f24610c = context.getApplicationContext();
    }

    public final void a() {
        if (this.f24608a.T()) {
            return;
        }
        vy1 M3 = this.f24608a.M();
        Context context = this.f24610c;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        new bb0(context, M3, this.f24609b).a();
    }
}
