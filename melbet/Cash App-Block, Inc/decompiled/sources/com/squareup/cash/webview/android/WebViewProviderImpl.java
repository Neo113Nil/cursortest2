package com.squareup.cash.webview.android;

import android.content.Context;
import android.webkit.WebView;
import app.cash.local.backend.BuyerIntentManagerKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.internal.Factory;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class WebViewProviderImpl implements WebViewProvider {
    public WebView savedWebViewInstance;
    public boolean shouldSaveWebInstance;

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public static final MetroFactory INSTANCE$1 = new MetroFactory(1);
        public static final MetroFactory INSTANCE = new MetroFactory(0);

        public /* synthetic */ MetroFactory(int i) {
            this.$r8$classId = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            switch (this.$r8$classId) {
                case 0:
                    return new WebViewProviderImpl();
                default:
                    return new AndroidCookieManager();
            }
        }
    }

    /* loaded from: classes7.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WebViewUseCase.values().length];
            try {
                WebViewUseCase webViewUseCase = WebViewUseCase.SUP;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                WebViewUseCase webViewUseCase2 = WebViewUseCase.SUP;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                WebViewUseCase webViewUseCase3 = WebViewUseCase.SUP;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                WebViewUseCase webViewUseCase4 = WebViewUseCase.SUP;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                WebViewUseCase webViewUseCase5 = WebViewUseCase.SUP;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                WebViewUseCase webViewUseCase6 = WebViewUseCase.SUP;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                WebViewUseCase webViewUseCase7 = WebViewUseCase.SUP;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.squareup.cash.webview.android.WebViewProvider
    public final void flushWebView() {
        if (this.shouldSaveWebInstance) {
            return;
        }
        this.savedWebViewInstance = null;
    }

    @Override // com.squareup.cash.webview.android.WebViewProvider
    public final boolean getShouldSaveWebInstance() {
        return this.shouldSaveWebInstance;
    }

    @Override // com.squareup.cash.webview.android.WebViewProvider
    public final WebView getWebView(WebViewUseCase webViewUseCase, Context context) {
        WebView webView;
        context.getClass();
        switch (webViewUseCase == null ? -1 : WhenMappings.$EnumSwitchMapping$0[webViewUseCase.ordinal()]) {
            case -1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                try {
                    return new WebView(context);
                } catch (Exception e) {
                    if (!BuyerIntentManagerKt.isMissingWebViewPackageException(e)) {
                        throw e;
                    }
                    Timber.Forest.e(e);
                    return null;
                }
            case 0:
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 1:
                WebView webView2 = this.savedWebViewInstance;
                if (webView2 != null) {
                    return webView2;
                }
                try {
                    webView = new WebView(context);
                } catch (Exception e2) {
                    if (!BuyerIntentManagerKt.isMissingWebViewPackageException(e2)) {
                        throw e2;
                    }
                    Timber.Forest.e(e2);
                    webView = null;
                }
                if (webView == null) {
                    return null;
                }
                this.savedWebViewInstance = webView;
                return webView;
        }
    }

    @Override // com.squareup.cash.webview.android.WebViewProvider
    public final void setShouldSaveWebInstance(boolean z) {
        this.shouldSaveWebInstance = z;
    }
}
