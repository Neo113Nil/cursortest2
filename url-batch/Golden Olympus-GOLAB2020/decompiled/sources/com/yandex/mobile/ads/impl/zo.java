package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.ip1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zo implements InterfaceC2283v<InterfaceC2237t> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final np1 f35648a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final e51 f35649b;

    public zo(@NotNull np1 reporter, @NotNull e51 nativeAdEventController) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(nativeAdEventController, "nativeAdEventController");
        this.f35648a = reporter;
        this.f35649b = nativeAdEventController;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2283v
    @NotNull
    public final ve0 a(@NotNull View view, @NotNull InterfaceC2237t action) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f35649b.a();
        this.f35648a.a(ip1.b.f27316D);
        return new ve0(false);
    }
}
