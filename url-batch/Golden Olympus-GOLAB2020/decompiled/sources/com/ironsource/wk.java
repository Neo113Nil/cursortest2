package com.ironsource;

import android.annotation.SuppressLint;
import android.os.Build;
import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface wk {

    @Metadata
    public static final class a implements wk {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private WebView f20238a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f20239b;

        public a() {
            this(0, 1, null);
        }

        @SuppressLint({"NewApi"})
        private final void b(String str) {
            WebView webView = this.f20238a;
            if (webView != null) {
                webView.evaluateJavascript(str, null);
            }
        }

        private final void c(String str) {
            WebView webView = this.f20238a;
            if (webView != null) {
                webView.loadUrl("javascript:" + str);
            }
        }

        @Override // com.ironsource.wk
        public void a(@NotNull WebView webView) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            this.f20238a = webView;
        }

        public a(int i4) {
            this.f20239b = i4 >= 19;
        }

        @Override // com.ironsource.wk
        public void a(@NotNull String script) {
            Intrinsics.checkNotNullParameter(script, "script");
            try {
                if (this.f20239b) {
                    b(script);
                } else {
                    c(script);
                }
            } catch (Throwable th) {
                o9.d().a(th);
                this.f20239b = false;
                c(script);
            }
        }

        public /* synthetic */ a(int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? Build.VERSION.SDK_INT : i4);
        }

        @Override // com.ironsource.wk
        public boolean a() {
            return this.f20238a != null;
        }
    }

    void a(@NotNull WebView webView);

    void a(@NotNull String str);

    boolean a();
}
