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
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.a7;
import com.startapp.sdk.internal.ac;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.g6;
import com.startapp.sdk.internal.qk;
import com.startapp.sdk.internal.si;
import com.startapp.sdk.internal.zb;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a extends qk {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConsentActivity f3308a;

    public a(ConsentActivity consentActivity) {
        this.f3308a = consentActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fe A[EDGE_INSN: B:74:0x01fe->B:75:0x01fe BREAK  A[LOOP:0: B:68:0x01e8->B:71:0x01f8], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0226 A[EDGE_INSN: B:86:0x0226->B:87:0x0226 BREAK  A[LOOP:1: B:80:0x0210->B:83:0x0220], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(WebView webView, String str) {
        Drawable drawable;
        int i3;
        String str2;
        String string;
        int length;
        int codePointAt;
        String string2;
        int length2;
        int i4;
        int codePointAt2;
        PackageManager packageManager;
        Bundle extras = this.f3308a.getIntent().getExtras();
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
        ConsentActivity consentActivity = this.f3308a;
        WeakHashMap weakHashMap = si.f4438a;
        String str3 = null;
        try {
            packageManager = consentActivity.getPackageManager();
        } catch (Throwable th) {
            d9.a(th);
        }
        if (packageManager != null) {
            drawable = packageManager.getApplicationInfo(consentActivity.getPackageName(), 128).loadIcon(packageManager);
            i3 = 0;
            if (drawable != null) {
                try {
                    float f = consentActivity.getResources().getDisplayMetrics().density;
                    int i5 = (int) (48.0f * f);
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(i5, i5, Bitmap.Config.ARGB_8888);
                        Drawable mutate = drawable.mutate();
                        mutate.setBounds(0, 0, i5, i5);
                        mutate.draw(new Canvas(createBitmap));
                        a7 a7Var = new a7(i5 * i5);
                        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, a7Var);
                        str3 = new String(Base64.encode(a7Var.a(), 0, a7Var.b(), 2));
                    } catch (OutOfMemoryError unused) {
                        int i6 = (int) (f * 24.0f);
                        try {
                            Bitmap createBitmap2 = Bitmap.createBitmap(i6, i6, Bitmap.Config.ARGB_4444);
                            Drawable mutate2 = drawable.mutate();
                            mutate2.setBounds(0, 0, i6, i6);
                            mutate2.draw(new Canvas(createBitmap2));
                            a7 a7Var2 = new a7(i6 * i6);
                            createBitmap2.compress(Bitmap.CompressFormat.PNG, 100, a7Var2);
                            str3 = new String(Base64.encode(a7Var2.a(), 0, a7Var2.b(), 2));
                        } catch (OutOfMemoryError unused2) {
                        }
                    }
                } catch (Throwable th2) {
                    d9.a(th2);
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
            str2 = ((zb) ((ac) com.startapp.sdk.components.a.a(this.f3308a).f3465d.a()).b()).f4883c;
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
            jSONObject.put("os", ConstantDeviceInfo.APP_PLATFORM);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("consentTypeInfo", jSONObject2);
            if (extras.containsKey("impression")) {
                jSONObject2.put("impression", extras.getInt("impression"));
            }
            if (extras.containsKey("trueClick")) {
                jSONObject2.put("trueClick", extras.getInt("trueClick"));
            }
            if (extras.containsKey("falseClick")) {
                jSONObject2.put("falseClick", extras.getInt("falseClick"));
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject.put("infoForExternalLinks", jSONObject3);
            if (extras.containsKey("advertisingId")) {
                jSONObject3.put("advertisingId", extras.getString("advertisingId"));
            }
            if (extras.containsKey("consentType")) {
                jSONObject3.put("consentType", extras.getInt("consentType"));
            }
            if (extras.containsKey("erid") && (string2 = extras.getString("erid")) != null) {
                length2 = string2.length();
                i4 = 0;
                while (true) {
                    if (i4 < length2) {
                        break;
                    }
                    codePointAt2 = string2.codePointAt(i4);
                    if (!Character.isWhitespace(codePointAt2)) {
                        jSONObject.put("erid", string2);
                        break;
                    }
                    i4 += Character.charCount(codePointAt2);
                }
            }
            if (extras.containsKey("eridUrl") && (string = extras.getString("eridUrl")) != null) {
                length = string.length();
                while (true) {
                    if (i3 < length) {
                        break;
                    }
                    codePointAt = string.codePointAt(i3);
                    if (!Character.isWhitespace(codePointAt)) {
                        jSONObject.put("eridUrl", string);
                        break;
                    }
                    i3 += Character.charCount(codePointAt);
                }
            }
            webView.loadUrl("javascript:startappInit(" + jSONObject + ");");
        }
        drawable = null;
        i3 = 0;
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
        str2 = ((zb) ((ac) com.startapp.sdk.components.a.a(this.f3308a).f3465d.a()).b()).f4883c;
        if (!TextUtils.isEmpty(str2)) {
        }
        if (extras.containsKey("timestamp")) {
        }
        if (extras.containsKey("templateName")) {
        }
        if (extras.containsKey("templateId")) {
        }
        jSONObject.put("os", ConstantDeviceInfo.APP_PLATFORM);
        JSONObject jSONObject22 = new JSONObject();
        jSONObject.put("consentTypeInfo", jSONObject22);
        if (extras.containsKey("impression")) {
        }
        if (extras.containsKey("trueClick")) {
        }
        if (extras.containsKey("falseClick")) {
        }
        JSONObject jSONObject32 = new JSONObject();
        jSONObject.put("infoForExternalLinks", jSONObject32);
        if (extras.containsKey("advertisingId")) {
        }
        if (extras.containsKey("consentType")) {
        }
        if (extras.containsKey("erid")) {
            length2 = string2.length();
            i4 = 0;
            while (true) {
                if (i4 < length2) {
                }
                i4 += Character.charCount(codePointAt2);
            }
        }
        if (extras.containsKey("eridUrl")) {
            length = string.length();
            while (true) {
                if (i3 < length) {
                }
                i3 += Character.charCount(codePointAt);
            }
        }
        webView.loadUrl("javascript:startappInit(" + jSONObject + ");");
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        try {
            a(webView, str);
        } catch (JSONException e3) {
            d9.a(e3);
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

    /* JADX WARN: Can't wrap try/catch for region: R(10:8|(2:9|10)|(8:12|13|14|15|(1:17)|19|20|21)|26|14|15|(0)|19|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        com.startapp.sdk.internal.d9.a(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054 A[Catch: all -> 0x005e, TRY_LEAVE, TryCatch #2 {all -> 0x005e, blocks: (B:15:0x004e, B:17:0x0054), top: B:14:0x004e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Uri uri) {
        Integer num;
        String scheme = uri.getScheme();
        String host = uri.getHost();
        ConsentConfig r3 = MetaData.E().r();
        if ("startappad".equals(scheme) && !TextUtils.isEmpty(host) && r3 != null) {
            if (host.equalsIgnoreCase("setconsent")) {
                String queryParameter = uri.getQueryParameter("status");
                String queryParameter2 = uri.getQueryParameter("apc");
                Boolean bool = null;
                try {
                } catch (NumberFormatException unused) {
                } catch (Throwable th) {
                    d9.a(th);
                }
                if (!TextUtils.isEmpty(queryParameter)) {
                    num = Integer.valueOf(Integer.parseInt(queryParameter));
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        bool = Boolean.valueOf(Boolean.parseBoolean(queryParameter2));
                    }
                    ((g6) com.startapp.sdk.components.a.a(this.f3308a).f3470j.a()).a(num, Long.valueOf(r3.j()), bool, true, true);
                    return true;
                }
                num = null;
                if (!TextUtils.isEmpty(queryParameter2)) {
                }
                ((g6) com.startapp.sdk.components.a.a(this.f3308a).f3470j.a()).a(num, Long.valueOf(r3.j()), bool, true, true);
                return true;
            }
            if (host.equalsIgnoreCase("close")) {
                this.f3308a.f3307c = true;
                this.f3308a.finish();
                return true;
            }
        }
        return false;
    }
}
