package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.jb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2017jb {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Dialog f27616a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2089mb f27617b;

    /* renamed from: com.yandex.mobile.ads.impl.jb$a */
    private final class a implements InterfaceC2135ob {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC2135ob
        public final void a() {
            c10.a(C2017jb.this.f27616a);
        }
    }

    public C2017jb(@NotNull Dialog dialog, @NotNull C2089mb adtuneOptOutWebView) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Intrinsics.checkNotNullParameter(adtuneOptOutWebView, "adtuneOptOutWebView");
        this.f27616a = dialog;
        this.f27617b = adtuneOptOutWebView;
    }

    public final void a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f27617b.setAdtuneWebViewListener(new a());
        this.f27617b.loadUrl(url);
        this.f27616a.show();
    }
}
