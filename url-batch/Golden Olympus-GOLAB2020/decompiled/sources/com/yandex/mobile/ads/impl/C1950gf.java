package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.gf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1950gf implements id0<C1926ff> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f26121a;

    public C1950gf(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26121a = context;
    }

    @Override // com.yandex.mobile.ads.impl.id0
    public final C1926ff a(C2360y7 adResponse, C2286v2 adConfiguration, rc0<C1926ff> fullScreenController) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(fullScreenController, "fullScreenController");
        return new C1926ff(this.f26121a, adResponse, adConfiguration, new kc0(), new yf0(), fullScreenController);
    }
}
