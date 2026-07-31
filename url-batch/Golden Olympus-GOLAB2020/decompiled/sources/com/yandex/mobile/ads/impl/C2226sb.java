package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.yandex.mobile.ads.impl.sb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2226sb extends qf1 {

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C2249tb f31657k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2226sb(@NotNull Context context) {
        this(context, new it0());
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.yandex.mobile.ads.impl.qf1, com.yandex.mobile.ads.impl.hg0
    public final void a(@NotNull Context context, @NotNull String url) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f31657k.a(url);
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    protected final void h() {
    }

    public final void setAdtuneWebViewListener(@NotNull InterfaceC2295vb adtuneWebViewListener) {
        Intrinsics.checkNotNullParameter(adtuneWebViewListener, "adtuneWebViewListener");
        this.f31657k.a(adtuneWebViewListener);
    }

    public final void setOptOutUrl(@Nullable String str) {
        this.f31657k.b(str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C2226sb(Context context, it0 it0Var) {
        this(context, it0Var, r0, new C2249tb(r0));
        C2065lb c2065lb = new C2065lb(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2226sb(@NotNull Context context, @NotNull it0 manufacturerChecker, @NotNull C2065lb optOutRenderer, @NotNull C2249tb adtuneWebViewController) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(manufacturerChecker, "manufacturerChecker");
        Intrinsics.checkNotNullParameter(optOutRenderer, "optOutRenderer");
        Intrinsics.checkNotNullParameter(adtuneWebViewController, "adtuneWebViewController");
        this.f31657k = adtuneWebViewController;
        if (manufacturerChecker.a()) {
            setLayerType(2, null);
        }
        setVisibility(0);
        setHtmlWebViewErrorListener(adtuneWebViewController);
    }
}
