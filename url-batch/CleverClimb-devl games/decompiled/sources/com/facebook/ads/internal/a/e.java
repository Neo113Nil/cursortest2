package com.facebook.ads.internal.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.sdk.AppLovinEventParameters;
import com.facebook.ads.internal.j.a;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e extends a {

    /* renamed from: d, reason: collision with root package name */
    private static final String f4884d = "e";
    private final Uri e;
    private final Map<String, String> f;

    public e(Context context, com.facebook.ads.internal.m.c cVar, String str, Uri uri, Map<String, String> map) {
        super(context, cVar, str);
        this.e = uri;
        this.f = map;
    }

    private Intent a(f fVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        if (!TextUtils.isEmpty(fVar.a()) && !TextUtils.isEmpty(fVar.b())) {
            intent.setComponent(new ComponentName(fVar.a(), fVar.b()));
        }
        if (!TextUtils.isEmpty(fVar.c())) {
            intent.setData(Uri.parse(fVar.c()));
        }
        return intent;
    }

    private Intent b(f fVar) {
        if (TextUtils.isEmpty(fVar.a()) || !d.a(this.f4876a, fVar.a())) {
            return null;
        }
        String c2 = fVar.c();
        if (!TextUtils.isEmpty(c2) && (c2.startsWith("tel:") || c2.startsWith("telprompt:"))) {
            return new Intent("android.intent.action.CALL", Uri.parse(c2));
        }
        PackageManager packageManager = this.f4876a.getPackageManager();
        if (TextUtils.isEmpty(fVar.b()) && TextUtils.isEmpty(c2)) {
            return packageManager.getLaunchIntentForPackage(fVar.a());
        }
        Intent a2 = a(fVar);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(a2, 65536);
        if (a2.getComponent() == null) {
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ResolveInfo next = it.next();
                if (next.activityInfo.packageName.equals(fVar.a())) {
                    a2.setComponent(new ComponentName(next.activityInfo.packageName, next.activityInfo.name));
                    break;
                }
            }
        }
        if (queryIntentActivities.isEmpty() || a2.getComponent() == null) {
            return null;
        }
        return a2;
    }

    private List<f> e() {
        String queryParameter = this.e.getQueryParameter("appsite_data");
        if (TextUtils.isEmpty(queryParameter) || "[]".equals(queryParameter)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray optJSONArray = new JSONObject(queryParameter).optJSONArray(TapjoyConstants.TJC_DEVICE_PLATFORM_TYPE);
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    f a2 = f.a(optJSONArray.optJSONObject(i));
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
            }
        } catch (JSONException e) {
            Log.w(f4884d, "Error parsing appsite_data", e);
        }
        return arrayList;
    }

    private boolean f() {
        List<Intent> d2 = d();
        if (d2 == null) {
            return false;
        }
        Iterator<Intent> it = d2.iterator();
        while (it.hasNext()) {
            try {
                this.f4876a.startActivity(it.next());
                return true;
            } catch (Exception e) {
                Log.d(f4884d, "Failed to open app intent, falling back", e);
            }
        }
        return false;
    }

    private boolean g() {
        com.facebook.ads.internal.q.c.g gVar = new com.facebook.ads.internal.q.c.g();
        try {
            com.facebook.ads.internal.q.c.g.a(gVar, this.f4876a, c(), this.f4878c);
            return true;
        } catch (Exception e) {
            Log.d(f4884d, "Failed to open market url: " + this.e.toString(), e);
            String queryParameter = this.e.getQueryParameter("store_url_web_fallback");
            if (queryParameter == null || queryParameter.length() <= 0) {
                return false;
            }
            try {
                com.facebook.ads.internal.q.c.g.a(gVar, this.f4876a, Uri.parse(queryParameter), this.f4878c);
                return false;
            } catch (Exception e2) {
                Log.d(f4884d, "Failed to open fallback url: " + queryParameter, e2);
                return false;
            }
        }
    }

    @Override // com.facebook.ads.internal.a.a
    public a.EnumC0346a a() {
        return a.EnumC0346a.OPEN_STORE;
    }

    @Override // com.facebook.ads.internal.a.a
    public void b() {
        this.f.put(f() ? "opened_deeplink" : g() ? "opened_store_url" : "opened_store_fallback_url", String.valueOf(true));
        a(this.f);
    }

    protected Uri c() {
        String queryParameter = this.e.getQueryParameter("store_url");
        return !TextUtils.isEmpty(queryParameter) ? Uri.parse(queryParameter) : Uri.parse(String.format("market://details?id=%s", this.e.getQueryParameter(AppLovinEventParameters.IN_APP_PURCHASE_TRANSACTION_IDENTIFIER)));
    }

    protected List<Intent> d() {
        List<f> e = e();
        ArrayList arrayList = new ArrayList();
        if (e != null) {
            Iterator<f> it = e.iterator();
            while (it.hasNext()) {
                Intent b2 = b(it.next());
                if (b2 != null) {
                    arrayList.add(b2);
                }
            }
        }
        return arrayList;
    }
}
