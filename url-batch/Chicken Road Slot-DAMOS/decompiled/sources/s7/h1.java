package s7;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h1 implements s2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8723d;

    /* renamed from: e, reason: collision with root package name */
    public final q1 f8724e;

    public h1(j4 j4Var) {
        this.f8723d = 0;
        this.f8724e = j4Var.f8771z;
    }

    @Override // s7.s2
    public void a(int i3, Throwable th, byte[] bArr) {
        int i10;
        v0 v0Var;
        v0 v0Var2;
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        q1 q1Var = this.f8724e;
        v0 v0Var3 = q1Var.f8937t;
        if (i3 == 200 || i3 == 204) {
            i10 = i3;
        } else {
            i10 = 304;
            if (i3 != 304) {
                i10 = i3;
                q1.l(v0Var3);
                v0Var3.f9053w.c(Integer.valueOf(i10), th, "Network Request for Deferred Deep Link failed. response, exception");
            }
        }
        if (th == null) {
            f1 f1Var = q1Var.f8936s;
            q1.j(f1Var);
            f1Var.H.b(true);
            if (bArr == null || bArr.length == 0) {
                q1.l(v0Var3);
                v0Var3.A.a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                if (TextUtils.isEmpty(optString)) {
                    q1.l(v0Var3);
                    v0Var3.A.a("Deferred Deep Link is empty.");
                    return;
                }
                String optString2 = jSONObject.optString("gclid", "");
                String optString3 = jSONObject.optString("gbraid", "");
                String optString4 = jSONObject.optString("gad_source", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                Bundle bundle2 = new Bundle();
                p4 p4Var = q1Var.f8940w;
                q1.j(p4Var);
                q1 q1Var2 = (q1) p4Var.f1478d;
                if (TextUtils.isEmpty(optString)) {
                    v0Var2 = v0Var3;
                } else {
                    Context context = q1Var2.f8932d;
                    v0Var2 = v0Var3;
                    try {
                        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                        if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                            if (!TextUtils.isEmpty(optString3)) {
                                bundle2.putString("gbraid", optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                bundle2.putString("gad_source", optString4);
                            }
                            bundle2.putString("gclid", optString2);
                            bundle2.putString("_cis", "ddp");
                            q1Var.A.z("auto", "_cmp", bundle2);
                            if (TextUtils.isEmpty(optString)) {
                                return;
                            }
                            try {
                                SharedPreferences.Editor edit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                    Context context2 = q1Var2.f8932d;
                                    if (Build.VERSION.SDK_INT < 34) {
                                        context2.sendBroadcast(intent);
                                        return;
                                    }
                                    makeBasic = BroadcastOptions.makeBasic();
                                    shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
                                    bundle = shareIdentityEnabled.toBundle();
                                    context2.sendBroadcast(intent, null, bundle);
                                    return;
                                }
                                return;
                            } catch (RuntimeException e2) {
                                v0 v0Var4 = ((q1) p4Var.f1478d).f8937t;
                                q1.l(v0Var4);
                                v0Var4.f9050t.b(e2, "Failed to persist Deferred Deep Link. exception");
                                return;
                            }
                        }
                    } catch (JSONException e9) {
                        e = e9;
                        v0Var = v0Var2;
                        q1.l(v0Var);
                        v0Var.f9050t.b(e, "Failed to parse the Deferred Deep Link response. exception");
                        return;
                    }
                }
                q1.l(v0Var2);
                v0Var = v0Var2;
                try {
                    v0Var.f9053w.d("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                    return;
                } catch (JSONException e10) {
                    e = e10;
                    q1.l(v0Var);
                    v0Var.f9050t.b(e, "Failed to parse the Deferred Deep Link response. exception");
                    return;
                }
            } catch (JSONException e11) {
                e = e11;
                v0Var = v0Var3;
            }
        }
        q1.l(v0Var3);
        v0Var3.f9053w.c(Integer.valueOf(i10), th, "Network Request for Deferred Deep Link failed. response, exception");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean b() {
        switch (this.f8723d) {
            case 0:
                q1 q1Var = this.f8724e;
                boolean z10 = false;
                try {
                    c4.o a9 = i7.b.a(q1Var.f8932d);
                    if (a9 == null) {
                        v0 v0Var = q1Var.f8937t;
                        q1.l(v0Var);
                        v0Var.B.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                        q1Var = q1Var;
                    } else {
                        int i3 = a9.e(128, "com.android.vending").versionCode;
                        q1Var = i3;
                        if (i3 >= 80837300) {
                            z10 = true;
                            q1Var = i3;
                        }
                    }
                } catch (Exception e2) {
                    v0 v0Var2 = q1Var.f8937t;
                    q1.l(v0Var2);
                    v0Var2.B.b(e2, "Failed to retrieve Play Store version for Install Referrer");
                }
                return z10;
            default:
                v0 v0Var3 = this.f8724e.f8937t;
                q1.l(v0Var3);
                return Log.isLoggable(v0Var3.C(), 3);
        }
    }

    public void c(String str, Bundle bundle) {
        String uri;
        q1 q1Var = this.f8724e;
        o1 o1Var = q1Var.f8938u;
        f1 f1Var = q1Var.f8936s;
        q1.l(o1Var);
        o1Var.s();
        if (q1Var.c()) {
            return;
        }
        if (bundle.isEmpty()) {
            uri = null;
        } else {
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            uri = builder.build().toString();
        }
        if (TextUtils.isEmpty(uri)) {
            return;
        }
        q1.j(f1Var);
        f1Var.K.e(uri);
        d1 d1Var = f1Var.L;
        q1Var.f8942y.getClass();
        d1Var.b(System.currentTimeMillis());
    }

    public boolean d() {
        if (!e()) {
            return false;
        }
        q1 q1Var = this.f8724e;
        q1Var.f8942y.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        f1 f1Var = q1Var.f8936s;
        q1.j(f1Var);
        return currentTimeMillis - f1Var.L.a() > q1Var.f8935r.A(null, e0.f8628i0);
    }

    public boolean e() {
        f1 f1Var = this.f8724e.f8936s;
        q1.j(f1Var);
        return f1Var.L.a() > 0;
    }

    public /* synthetic */ h1(q1 q1Var, int i3) {
        this.f8723d = i3;
        this.f8724e = q1Var;
    }

    public h1(e2 e2Var, q1 q1Var) {
        this.f8723d = 2;
        this.f8724e = q1Var;
    }
}
