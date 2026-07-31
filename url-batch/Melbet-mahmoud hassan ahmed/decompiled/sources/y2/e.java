package y2;

import a3.r1;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.cc0;
import com.google.android.gms.internal.ads.cc3;
import com.google.android.gms.internal.ads.dc3;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.on0;
import com.google.android.gms.internal.ads.po0;
import com.google.android.gms.internal.ads.rb0;
import com.google.android.gms.internal.ads.rb3;
import com.google.android.gms.internal.ads.sw;
import com.google.android.gms.internal.ads.wb0;
import com.google.android.gms.internal.ads.wo0;
import com.google.android.gms.internal.ads.xa3;
import com.google.android.gms.internal.ads.zb0;
import com.google.android.gms.internal.ads.zo0;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private Context f23393a;

    /* renamed from: b, reason: collision with root package name */
    private long f23394b = 0;

    public final void a(Context context, po0 po0Var, String str, Runnable runnable) {
        b(context, po0Var, true, null, str, null, runnable);
    }

    final void b(Context context, po0 po0Var, boolean z6, on0 on0Var, String str, String str2, Runnable runnable) {
        PackageInfo f7;
        if (t.a().a() - this.f23394b < 5000) {
            io0.g("Not retrying to fetch app settings");
            return;
        }
        this.f23394b = t.a().a();
        if (on0Var != null) {
            if (t.a().b() - on0Var.a() <= ((Long) sw.c().b(m10.E2)).longValue() && on0Var.i()) {
                return;
            }
        }
        if (context == null) {
            io0.g("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            io0.g("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f23393a = applicationContext;
        cc0 a7 = t.g().a(this.f23393a, po0Var);
        wb0<JSONObject> wb0Var = zb0.f15062b;
        rb0 a8 = a7.a("google.afma.config.fetchAppSettings", wb0Var, wb0Var);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z6);
            jSONObject.put("pn", context.getPackageName());
            jSONObject.put("experiment_ids", TextUtils.join(",", m10.a()));
            try {
                ApplicationInfo applicationInfo = this.f23393a.getApplicationInfo();
                if (applicationInfo != null && (f7 = w3.c.a(context).f(applicationInfo.packageName, 0)) != null) {
                    jSONObject.put("version", f7.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                r1.k("Error fetching PackageInfo.");
            }
            cc3 a9 = a8.a(jSONObject);
            d dVar = new xa3() { // from class: y2.d
                @Override // com.google.android.gms.internal.ads.xa3
                public final cc3 c(Object obj) {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    if (jSONObject2.optBoolean("isSuccessful", false)) {
                        t.p().h().V(jSONObject2.getString("appSettingsJson"));
                    }
                    return rb3.i(null);
                }
            };
            dc3 dc3Var = wo0.f13899f;
            cc3 n7 = rb3.n(a9, dVar, dc3Var);
            if (runnable != null) {
                a9.b(runnable, dc3Var);
            }
            zo0.a(n7, "ConfigLoader.maybeFetchNewAppSettings");
        } catch (Exception e7) {
            io0.e("Error requesting application settings", e7);
        }
    }

    public final void c(Context context, po0 po0Var, String str, on0 on0Var) {
        b(context, po0Var, false, on0Var, on0Var != null ? on0Var.b() : null, str, null);
    }
}
