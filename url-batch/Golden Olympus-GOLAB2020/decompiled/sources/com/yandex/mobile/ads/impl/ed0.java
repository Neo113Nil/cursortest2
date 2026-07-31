package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebSettings;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class ed0 extends cg0 {

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final kj2 f25236o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed0(@NotNull Context context, @NotNull C2360y7<?> adResponse, @NotNull C2286v2 adConfiguration) {
        super(context, adResponse, adConfiguration);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.f25236o = new kj2(this);
    }

    @Override // com.yandex.mobile.ads.impl.cg0
    @SuppressLint({"AddJavascriptInterface"})
    protected final void a(@NotNull Context context, @NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        addJavascriptInterface(b(context), "AdPerformActionsJSI");
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    public final void h() {
        this.f25236o.a(l());
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    protected final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.a(context);
        WebSettings settings = getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
        settings.setDatabasePath(getContext().getDatabasePath("com.monetization.ads.db").getAbsolutePath());
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setCacheMode(-1);
    }
}
