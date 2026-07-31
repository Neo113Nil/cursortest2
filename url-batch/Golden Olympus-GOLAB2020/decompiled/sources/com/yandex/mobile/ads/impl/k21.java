package com.yandex.mobile.ads.impl;

import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class k21 extends C2257tj {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final z11 f27989b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k21(@NotNull qf1 parentHtmlWebView, @NotNull jg0 htmlWebViewListener, @NotNull a htmlWebViewMraidListener, @NotNull z11 mraidController) {
        super(parentHtmlWebView);
        Intrinsics.checkNotNullParameter(parentHtmlWebView, "parentHtmlWebView");
        Intrinsics.checkNotNullParameter(htmlWebViewListener, "htmlWebViewListener");
        Intrinsics.checkNotNullParameter(htmlWebViewMraidListener, "htmlWebViewMraidListener");
        Intrinsics.checkNotNullParameter(mraidController, "mraidController");
        this.f27989b = mraidController;
        mraidController.a(htmlWebViewMraidListener);
    }

    @Override // com.yandex.mobile.ads.impl.C2257tj, com.yandex.mobile.ads.impl.dg0
    public final void a(@NotNull String htmlResponse) {
        Intrinsics.checkNotNullParameter(htmlResponse, "htmlResponse");
        this.f27989b.a(htmlResponse);
    }

    @NotNull
    public final z11 b() {
        return this.f27989b;
    }

    @Override // com.yandex.mobile.ads.impl.C2257tj, com.yandex.mobile.ads.impl.dg0
    public final void invalidate() {
        super.invalidate();
        this.f27989b.a();
    }

    public static final class a implements h21 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final WeakReference<jg0> f27990a;

        public /* synthetic */ a(jg0 jg0Var) {
            this(jg0Var, new WeakReference(jg0Var));
        }

        @Override // com.yandex.mobile.ads.impl.h21
        public final void a(@NotNull qf1 webView, @NotNull Map trackingParameters) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            Intrinsics.checkNotNullParameter(trackingParameters, "trackingParameters");
            jg0 jg0Var = this.f27990a.get();
            if (jg0Var != null) {
                jg0Var.a(webView, trackingParameters);
            }
        }

        public a(@NotNull jg0 htmlWebViewListener, @NotNull WeakReference<jg0> htmlWebViewListenerRef) {
            Intrinsics.checkNotNullParameter(htmlWebViewListener, "htmlWebViewListener");
            Intrinsics.checkNotNullParameter(htmlWebViewListenerRef, "htmlWebViewListenerRef");
            this.f27990a = htmlWebViewListenerRef;
        }

        @Override // com.yandex.mobile.ads.impl.h21
        public final void a(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            jg0 jg0Var = this.f27990a.get();
            if (jg0Var != null) {
                jg0Var.a(url);
            }
        }

        @Override // com.yandex.mobile.ads.impl.h21
        public final void a() {
            jg0 jg0Var = this.f27990a.get();
            if (jg0Var != null) {
                jg0Var.a();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.C2257tj
    public final void a(@NotNull jg0 htmlWebViewListener) {
        Intrinsics.checkNotNullParameter(htmlWebViewListener, "htmlWebViewListener");
        super.a(new e21(this.f27989b, htmlWebViewListener));
    }
}
