package com.google.ads.consent;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.gson.e;
import com.tapjoy.TJAdUnitConstants;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ConsentForm {
    private final boolean adFreeOption;
    private final URL appPrivacyPolicyURL;
    private final Context context;
    private final Dialog dialog;
    private final ConsentFormListener listener;
    private LoadState loadState;
    private final boolean nonPersonalizedAdsOption;
    private final boolean personalizedAdsOption;
    private final WebView webView;

    /* renamed from: com.google.ads.consent.ConsentForm$1, reason: invalid class name */
    class AnonymousClass1 extends ConsentFormListener {
    }

    public static class Builder {
        private boolean adFreeOption;
        private final URL appPrivacyPolicyURL;
        private final Context context;
        private ConsentFormListener listener;
        private boolean nonPersonalizedAdsOption;
        private boolean personalizedAdsOption;
    }

    private enum LoadState {
        NOT_READY,
        LOADING,
        LOADED
    }

    /* renamed from: com.google.ads.consent.ConsentForm$2, reason: invalid class name */
    class AnonymousClass2 extends WebViewClient {
        boolean isInternalRedirect;
        final /* synthetic */ ConsentForm this$0;

        private boolean a(String str) {
            return !TextUtils.isEmpty(str) && str.startsWith("consent://");
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
        
            if (r1.equals(com.tapjoy.TapjoyConstants.TJC_FULLSCREEN_AD_DISMISS_URL) == false) goto L21;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void b(String str) {
            if (a(str)) {
                char c2 = 1;
                this.isInternalRedirect = true;
                Uri parse = Uri.parse(str);
                String queryParameter = parse.getQueryParameter("action");
                String queryParameter2 = parse.getQueryParameter("status");
                String queryParameter3 = parse.getQueryParameter("url");
                int hashCode = queryParameter.hashCode();
                if (hashCode == -1370505102) {
                    if (queryParameter.equals("load_complete")) {
                        c2 = 0;
                    }
                    c2 = 65535;
                } else if (hashCode != 150940456) {
                    if (hashCode == 1671672458) {
                    }
                    c2 = 65535;
                } else {
                    if (queryParameter.equals("browser")) {
                        c2 = 2;
                    }
                    c2 = 65535;
                }
                switch (c2) {
                    case 0:
                        this.this$0.a(queryParameter2);
                        break;
                    case 1:
                        this.isInternalRedirect = false;
                        this.this$0.c(queryParameter2);
                        break;
                    case 2:
                        this.this$0.b(queryParameter3);
                        break;
                }
            }
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            b(str);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(24)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            String uri = webResourceRequest.getUrl().toString();
            if (!a(uri)) {
                return false;
            }
            b(uri);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!a(str)) {
                return false;
            }
            b(str);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (!this.isInternalRedirect) {
                this.this$0.a(webView);
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            this.this$0.loadState = LoadState.NOT_READY;
            this.this$0.listener.a(webResourceError.toString());
        }
    }

    private static String a(Context context) {
        return context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
    }

    private static String b(Context context) {
        Drawable applicationIcon = context.getPackageManager().getApplicationIcon(context.getApplicationInfo());
        Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        applicationIcon.draw(canvas);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        String valueOf = String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
        return valueOf.length() != 0 ? "data:image/png;base64,".concat(valueOf) : new String("data:image/png;base64,");
    }

    private static String a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(TJAdUnitConstants.String.VIDEO_INFO, str2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("args", hashMap);
        return String.format("javascript:%s(%s)", str, new e().b(hashMap2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(WebView webView) {
        HashMap hashMap = new HashMap();
        hashMap.put("app_name", a(this.context));
        hashMap.put("app_icon", b(this.context));
        hashMap.put("offer_personalized", Boolean.valueOf(this.personalizedAdsOption));
        hashMap.put("offer_non_personalized", Boolean.valueOf(this.nonPersonalizedAdsOption));
        hashMap.put("offer_ad_free", Boolean.valueOf(this.adFreeOption));
        hashMap.put("is_request_in_eea_or_unknown", Boolean.valueOf(ConsentInformation.a(this.context).d()));
        hashMap.put("app_privacy_url", this.appPrivacyPolicyURL);
        ConsentData c2 = ConsentInformation.a(this.context).c();
        hashMap.put("plat", c2.g());
        hashMap.put("consent_info", c2);
        webView.loadUrl(a("setUpConsentDialog", new e().b(hashMap)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.loadState = LoadState.NOT_READY;
            this.listener.a("No information");
        } else if (str.contains("Error")) {
            this.loadState = LoadState.NOT_READY;
            this.listener.a(str);
        } else {
            this.loadState = LoadState.LOADED;
            this.listener.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            this.listener.a("No valid URL for browser navigation.");
            return;
        }
        try {
            this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException unused) {
            this.listener.a("No Activity found to handle browser intent.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        ConsentStatus consentStatus;
        this.loadState = LoadState.NOT_READY;
        this.dialog.dismiss();
        if (TextUtils.isEmpty(str)) {
            this.listener.a("No information provided.");
            return;
        }
        if (str.contains("Error")) {
            this.listener.a(str);
            return;
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        boolean z = false;
        if (hashCode != -1152655096) {
            if (hashCode != -258041904) {
                if (hashCode == 1666911234 && str.equals("non_personalized")) {
                    c2 = 1;
                }
            } else if (str.equals("personalized")) {
                c2 = 0;
            }
        } else if (str.equals("ad_free")) {
            c2 = 2;
        }
        switch (c2) {
            case 0:
                consentStatus = ConsentStatus.PERSONALIZED;
                break;
            case 1:
                consentStatus = ConsentStatus.NON_PERSONALIZED;
                break;
            case 2:
                consentStatus = ConsentStatus.UNKNOWN;
                z = true;
                break;
            default:
                consentStatus = ConsentStatus.UNKNOWN;
                break;
        }
        ConsentInformation.a(this.context).a(consentStatus, "form");
        this.listener.a(consentStatus, Boolean.valueOf(z));
    }

    /* renamed from: com.google.ads.consent.ConsentForm$3, reason: invalid class name */
    class AnonymousClass3 implements DialogInterface.OnShowListener {
        final /* synthetic */ ConsentForm this$0;

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            this.this$0.listener.b();
        }
    }
}
