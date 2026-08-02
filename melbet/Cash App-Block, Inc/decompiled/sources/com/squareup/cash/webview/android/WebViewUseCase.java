package com.squareup.cash.webview.android;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class WebViewUseCase {
    public static final /* synthetic */ WebViewUseCase[] $VALUES;
    public static final WebViewUseCase AFFILIATE;
    public static final WebViewUseCase AFTERPAY;
    public static final WebViewUseCase INCENTIVES;
    public static final WebViewUseCase SUP;
    public static final WebViewUseCase SUPPORT_ARTICLES;
    public static final WebViewUseCase WORK;

    static {
        WebViewUseCase webViewUseCase = new WebViewUseCase("SUP", 0);
        SUP = webViewUseCase;
        WebViewUseCase webViewUseCase2 = new WebViewUseCase("INCENTIVES", 1);
        INCENTIVES = webViewUseCase2;
        WebViewUseCase webViewUseCase3 = new WebViewUseCase("AFTERPAY", 2);
        AFTERPAY = webViewUseCase3;
        WebViewUseCase webViewUseCase4 = new WebViewUseCase("AFFILIATE", 3);
        AFFILIATE = webViewUseCase4;
        WebViewUseCase webViewUseCase5 = new WebViewUseCase("SQUARE_ONLINE", 4);
        WebViewUseCase webViewUseCase6 = new WebViewUseCase("SUPPORT_ARTICLES", 5);
        SUPPORT_ARTICLES = webViewUseCase6;
        WebViewUseCase webViewUseCase7 = new WebViewUseCase("WORK", 6);
        WORK = webViewUseCase7;
        $VALUES = new WebViewUseCase[]{webViewUseCase, webViewUseCase2, webViewUseCase3, webViewUseCase4, webViewUseCase5, webViewUseCase6, webViewUseCase7};
    }

    public static WebViewUseCase valueOf(String str) {
        return (WebViewUseCase) Enum.valueOf(WebViewUseCase.class, str);
    }

    public static WebViewUseCase[] values() {
        return (WebViewUseCase[]) $VALUES.clone();
    }
}
