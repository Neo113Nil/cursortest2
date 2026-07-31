package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.yandex.mobile.ads.impl.mb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2089mb extends qf1 {

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C2112nb f28973k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2089mb(@NotNull Context context) {
        this(context, new it0());
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.yandex.mobile.ads.impl.qf1, com.yandex.mobile.ads.impl.hg0
    public final void a(@NotNull Context context, @NotNull String url) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f28973k.a(url);
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    protected final void h() {
    }

    public final void setAdtuneWebViewListener(@NotNull InterfaceC2135ob adtuneOptOutWebViewListener) {
        Intrinsics.checkNotNullParameter(adtuneOptOutWebViewListener, "adtuneOptOutWebViewListener");
        this.f28973k.a(adtuneOptOutWebViewListener);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C2089mb(Context context, it0 it0Var) {
        this(context, it0Var, r0, new C2112nb(r0));
        ye1 ye1Var = new ye1(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2089mb(@NotNull Context context, @NotNull it0 manufacturerChecker, @NotNull ye1 optOutRepository, @NotNull C2112nb adtuneOptOutWebViewController) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(manufacturerChecker, "manufacturerChecker");
        Intrinsics.checkNotNullParameter(optOutRepository, "optOutRepository");
        Intrinsics.checkNotNullParameter(adtuneOptOutWebViewController, "adtuneOptOutWebViewController");
        this.f28973k = adtuneOptOutWebViewController;
        if (manufacturerChecker.a()) {
            setLayerType(2, null);
        }
        setVisibility(0);
        setHtmlWebViewErrorListener(adtuneOptOutWebViewController);
    }
}
