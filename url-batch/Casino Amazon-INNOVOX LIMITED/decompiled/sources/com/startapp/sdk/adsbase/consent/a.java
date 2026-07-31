package com.startapp.sdk.adsbase.consent;

import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.gb;
import com.startapp.sdk.internal.hb;
import com.startapp.sdk.internal.n8;
import com.startapp.sdk.internal.tj;
import com.startapp.sdk.internal.x5;
import com.startapp.sdk.internal.y6;
import com.startapp.sdk.internal.zh;
import java.util.WeakHashMap;
import kotlin.UByte$$ExternalSyntheticBackport0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class a extends tj {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConsentActivity f136a;

    public a(ConsentActivity consentActivity) {
        this.f136a = consentActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(WebView webView, String str) {
        Drawable drawable;
        String str2;
        String string;
        String string2;
        PackageManager packageManager;
        Bundle extras = this.f136a.getIntent().getExtras();
        if (extras == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("template", str);
        }
        if (extras.containsKey("allowCT")) {
            jSONObject.put("allowCT", extras.getBoolean("allowCT"));
        }
        ConsentActivity consentActivity = this.f136a;
        WeakHashMap weakHashMap = zh.f528a;
        String str3 = null;
        try {
            packageManager = consentActivity.getPackageManager();
        } catch (Throwable th) {
            n8.a(th);
        }
        if (packageManager != null) {
            drawable = packageManager.getApplicationInfo(consentActivity.getPackageName(), 128).loadIcon(packageManager);
            if (drawable != null) {
            }
            if (!TextUtils.isEmpty(str3)) {
            }
            if (extras.containsKey("dParam")) {
            }
            if (extras.containsKey("clickUrl")) {
            }
            if (extras.containsKey("impressionUrl")) {
            }
            str2 = ((gb) ((hb) com.startapp.sdk.components.a.a(this.f136a).c.a()).b()).c;
            if (!TextUtils.isEmpty(str2)) {
            }
            if (extras.containsKey("timestamp")) {
            }
            if (extras.containsKey("templateName")) {
            }
            if (extras.containsKey("templateId")) {
            }
            jSONObject.put("os", "android");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("consentTypeInfo", jSONObject2);
            if (extras.containsKey("impression")) {
            }
            if (extras.containsKey("trueClick")) {
            }
            if (extras.containsKey("falseClick")) {
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject.put("infoForExternalLinks", jSONObject3);
            if (extras.containsKey("advertisingId")) {
            }
            if (extras.containsKey("consentType")) {
            }
            if (extras.containsKey("erid")) {
                jSONObject.put("erid", string2);
            }
            if (extras.containsKey("eridUrl")) {
                jSONObject.put("eridUrl", string);
            }
            webView.loadUrl("javascript:startappInit(" + jSONObject + ");");
        }
        drawable = null;
        if (drawable != null) {
            try {
                float f = consentActivity.getResources().getDisplayMetrics().density;
                int i = (int) (48.0f * f);
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
                    Drawable mutate = drawable.mutate();
                    mutate.setBounds(0, 0, i, i);
                    mutate.draw(new Canvas(createBitmap));
                    y6 y6Var = new y6(i * i);
                    createBitmap.compress(Bitmap.CompressFormat.PNG, 100, y6Var);
                    str3 = new String(Base64.encode(y6Var.a(), 0, y6Var.b(), 2));
                } catch (OutOfMemoryError unused) {
                    int i2 = (int) (f * 24.0f);
                    try {
                        Bitmap createBitmap2 = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_4444);
                        Drawable mutate2 = drawable.mutate();
                        mutate2.setBounds(0, 0, i2, i2);
                        mutate2.draw(new Canvas(createBitmap2));
                        y6 y6Var2 = new y6(i2 * i2);
                        createBitmap2.compress(Bitmap.CompressFormat.PNG, 100, y6Var2);
                        str3 = new String(Base64.encode(y6Var2.a(), 0, y6Var2.b(), 2));
                    } catch (OutOfMemoryError unused2) {
                    }
                }
            } catch (Throwable th2) {
                n8.a(th2);
            }
        }
        if (!TextUtils.isEmpty(str3)) {
            jSONObject.put("imageBase64", str3);
        }
        if (extras.containsKey("dParam")) {
            String string3 = extras.getString("dParam");
            if (!TextUtils.isEmpty(string3)) {
                jSONObject.put("dParam", string3);
            }
        }
        if (extras.containsKey("clickUrl")) {
            String string4 = extras.getString("clickUrl");
            if (!TextUtils.isEmpty(string4)) {
                jSONObject.put("clickUrl", string4);
            }
        }
        if (extras.containsKey("impressionUrl")) {
            String string5 = extras.getString("impressionUrl");
            if (!TextUtils.isEmpty(string5)) {
                jSONObject.put("impressionUrl", string5);
            }
        }
        str2 = ((gb) ((hb) com.startapp.sdk.components.a.a(this.f136a).c.a()).b()).c;
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("locales", str2);
        }
        if (extras.containsKey("timestamp")) {
            jSONObject.put("timeStamp", extras.getLong("timestamp"));
        }
        if (extras.containsKey("templateName")) {
            jSONObject.put("templateName", extras.getInt("templateName"));
        }
        if (extras.containsKey("templateId")) {
            jSONObject.put("templateId", extras.getInt("templateId"));
        }
        jSONObject.put("os", "android");
        JSONObject jSONObject22 = new JSONObject();
        jSONObject.put("consentTypeInfo", jSONObject22);
        if (extras.containsKey("impression")) {
            jSONObject22.put("impression", extras.getInt("impression"));
        }
        if (extras.containsKey("trueClick")) {
            jSONObject22.put("trueClick", extras.getInt("trueClick"));
        }
        if (extras.containsKey("falseClick")) {
            jSONObject22.put("falseClick", extras.getInt("falseClick"));
        }
        JSONObject jSONObject32 = new JSONObject();
        jSONObject.put("infoForExternalLinks", jSONObject32);
        if (extras.containsKey("advertisingId")) {
            jSONObject32.put("advertisingId", extras.getString("advertisingId"));
        }
        if (extras.containsKey("consentType")) {
            jSONObject32.put("consentType", extras.getInt("consentType"));
        }
        if (extras.containsKey("erid") && (string2 = extras.getString("erid")) != null && !UByte$$ExternalSyntheticBackport0.m(string2)) {
            jSONObject.put("erid", string2);
        }
        if (extras.containsKey("eridUrl") && (string = extras.getString("eridUrl")) != null && !UByte$$ExternalSyntheticBackport0.m(string)) {
            jSONObject.put("eridUrl", string);
        }
        webView.loadUrl("javascript:startappInit(" + jSONObject + ");");
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        try {
            a(webView, str);
        } catch (JSONException e) {
            n8.a(e);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return a(webResourceRequest.getUrl());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return a(Uri.parse(str));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:8|(2:9|10)|(7:12|13|14|15|(1:17)|19|20)|25|14|15|(0)|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        com.startapp.sdk.internal.n8.a(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054 A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #2 {all -> 0x005d, blocks: (B:15:0x004e, B:17:0x0054), top: B:14:0x004e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Uri uri) {
        Integer num;
        String scheme = uri.getScheme();
        String host = uri.getHost();
        ConsentConfig q = MetaData.A().q();
        if ("startappad".equals(scheme) && !TextUtils.isEmpty(host) && q != null) {
            if (host.equalsIgnoreCase("setconsent")) {
                String queryParameter = uri.getQueryParameter(NotificationCompat.CATEGORY_STATUS);
                String queryParameter2 = uri.getQueryParameter("apc");
                Boolean bool = null;
                try {
                } catch (NumberFormatException unused) {
                } catch (Throwable th) {
                    n8.a(th);
                }
                if (!TextUtils.isEmpty(queryParameter)) {
                    num = Integer.valueOf(Integer.parseInt(queryParameter));
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        bool = Boolean.valueOf(Boolean.parseBoolean(queryParameter2));
                    }
                    ((x5) com.startapp.sdk.components.a.a(this.f136a).i.a()).a(num, Long.valueOf(q.j()), bool, true, true);
                    return true;
                }
                num = null;
                if (!TextUtils.isEmpty(queryParameter2)) {
                }
                ((x5) com.startapp.sdk.components.a.a(this.f136a).i.a()).a(num, Long.valueOf(q.j()), bool, true, true);
                return true;
            }
            if (host.equalsIgnoreCase("close")) {
                this.f136a.c = true;
                this.f136a.finish();
                return true;
            }
        }
        return false;
    }
}
