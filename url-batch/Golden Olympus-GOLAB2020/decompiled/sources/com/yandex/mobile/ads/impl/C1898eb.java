package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import android.os.Handler;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.eb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1898eb {

    /* renamed from: f, reason: collision with root package name */
    private static final long f25164f = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Dialog f25165a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2226sb f25166b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final n50 f25167c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final xe1 f25168d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Handler f25169e;

    /* renamed from: com.yandex.mobile.ads.impl.eb$b */
    private final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c10.a(C1898eb.this.f25165a);
        }
    }

    public C1898eb(@NotNull Dialog dialog, @NotNull C2226sb adtuneWebView, @NotNull n50 eventListenerController, @NotNull xe1 openUrlHandler, @NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Intrinsics.checkNotNullParameter(adtuneWebView, "adtuneWebView");
        Intrinsics.checkNotNullParameter(eventListenerController, "eventListenerController");
        Intrinsics.checkNotNullParameter(openUrlHandler, "openUrlHandler");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f25165a = dialog;
        this.f25166b = adtuneWebView;
        this.f25167c = eventListenerController;
        this.f25168d = openUrlHandler;
        this.f25169e = handler;
    }

    public static final void d(C1898eb c1898eb) {
        c1898eb.f25169e.removeCallbacksAndMessages(null);
    }

    /* renamed from: com.yandex.mobile.ads.impl.eb$a */
    private final class a implements InterfaceC2295vb {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC2295vb
        public final void a(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            C1898eb.this.f25168d.a(url);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC2295vb
        public final void b() {
            C1898eb.this.f25167c.a();
            c10.a(C1898eb.this.f25165a);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC2295vb
        public final void a() {
            C1898eb.d(C1898eb.this);
        }
    }

    public final void a(@NotNull String url, @NotNull String optOutUrl) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(optOutUrl, "optOutUrl");
        this.f25166b.setAdtuneWebViewListener(new a());
        this.f25166b.setOptOutUrl(optOutUrl);
        this.f25166b.loadUrl(url);
        this.f25169e.postDelayed(new b(), f25164f);
        this.f25165a.show();
    }
}
