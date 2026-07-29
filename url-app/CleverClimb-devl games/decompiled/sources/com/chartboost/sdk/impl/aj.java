package com.chartboost.sdk.impl;

import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.Libraries.d;
import com.chartboost.sdk.Libraries.e;
import com.chartboost.sdk.Model.CBError;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class aj extends ad<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f3718a;
    public final a k;
    public boolean l;
    protected final ap m;
    private final String n;
    private String o;
    private final com.chartboost.sdk.Tracking.a p;

    public interface a {
        void a(aj ajVar, CBError cBError);

        void a(aj ajVar, JSONObject jSONObject);
    }

    public aj(String str, ap apVar, com.chartboost.sdk.Tracking.a aVar, int i, a aVar2) {
        super("POST", a(str), i, null);
        this.l = false;
        this.f3718a = new JSONObject();
        this.n = str;
        this.m = apVar;
        this.p = aVar;
        this.k = aVar2;
    }

    public static String a(String str) {
        Object[] objArr = new Object[3];
        objArr[0] = "https://live.chartboost.com";
        objArr[1] = (str == null || !str.startsWith("/")) ? "/" : "";
        if (str == null) {
            str = "";
        }
        objArr[2] = str;
        return String.format("%s%s%s", objArr);
    }

    public void a(String str, Object obj) {
        com.chartboost.sdk.Libraries.e.a(this.f3718a, str, obj);
    }

    protected void c() {
        a(TapjoyConstants.TJC_APP_PLACEMENT, this.m.s);
        a("model", this.m.f);
        a("device_type", this.m.t);
        a("actual_device_type", this.m.u);
        a(com.umeng.commonsdk.proguard.d.w, this.m.g);
        a(com.umeng.commonsdk.proguard.d.N, this.m.h);
        a(com.umeng.commonsdk.proguard.d.M, this.m.i);
        a(TapjoyConstants.TJC_SDK_PLACEMENT, this.m.l);
        a("user_agent", com.chartboost.sdk.i.w);
        a(TapjoyConstants.TJC_TIMESTAMP, String.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.m.e.a())));
        a(com.umeng.analytics.pro.b.ac, Integer.valueOf(this.m.f3738d.getInt("cbPrefSessionCount", 0)));
        a("reachability", Integer.valueOf(this.m.f3736b.a()));
        a("scale", this.m.r);
        a("is_portrait", Boolean.valueOf(CBUtility.a(CBUtility.a())));
        a(TJAdUnitConstants.String.BUNDLE, this.m.j);
        a("bundle_id", this.m.k);
        a(com.umeng.commonsdk.proguard.d.O, this.m.v);
        a("custom_id", com.chartboost.sdk.i.f3677a);
        a("mediation", com.chartboost.sdk.i.h);
        if (com.chartboost.sdk.i.f3680d != null) {
            a("framework_version", com.chartboost.sdk.i.f);
            a("wrapper_version", com.chartboost.sdk.i.f3678b);
        }
        a("rooted_device", Boolean.valueOf(this.m.w));
        a("timezone", this.m.x);
        a("mobile_network", this.m.y);
        a("dw", this.m.o);
        a("dh", this.m.p);
        a("dpi", this.m.q);
        a("w", this.m.m);
        a("h", this.m.n);
        a("commit_hash", "ea5c9878e5dca6c95016765177cbd146c39a21f7");
        d.a a2 = this.m.f3735a.a();
        a("identity", a2.f3578b);
        if (a2.f3577a != -1) {
            a("limit_ad_tracking", Boolean.valueOf(a2.f3577a == 1));
        }
        a("pidatauseconsent", Integer.valueOf(com.chartboost.sdk.i.x.getValue()));
        String str = this.m.f3737c.get().f3621a;
        if (!s.a().a(str)) {
            a("config_variant", str);
        }
        a("certification_providers", o.e());
    }

    public String d() {
        return e();
    }

    public String e() {
        if (this.n == null) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.n.startsWith("/") ? "" : "/");
        sb.append(this.n);
        return sb.toString();
    }

    private void a(ag agVar, CBError cBError) {
        e.a[] aVarArr = new e.a[5];
        aVarArr[0] = com.chartboost.sdk.Libraries.e.a("endpoint", e());
        aVarArr[1] = com.chartboost.sdk.Libraries.e.a("statuscode", agVar == null ? "None" : Integer.valueOf(agVar.f3707a));
        aVarArr[2] = com.chartboost.sdk.Libraries.e.a("error", cBError == null ? "None" : cBError.a().toString());
        aVarArr[3] = com.chartboost.sdk.Libraries.e.a("errorDescription", cBError == null ? "None" : cBError.b());
        aVarArr[4] = com.chartboost.sdk.Libraries.e.a("retryCount", (Object) 0);
        this.p.a("request_manager", "request", cBError == null ? "success" : "failure", (String) null, (String) null, (String) null, com.chartboost.sdk.Libraries.e.a(aVarArr));
    }

    public void b(String str) {
        this.o = str;
    }

    @Override // com.chartboost.sdk.impl.ad
    public ae a() {
        c();
        String jSONObject = this.f3718a.toString();
        String str = com.chartboost.sdk.i.k;
        String b2 = com.chartboost.sdk.Libraries.c.b(com.chartboost.sdk.Libraries.c.a(String.format(Locale.US, "%s %s\n%s\n%s", this.f3699b, d(), com.chartboost.sdk.i.l, jSONObject).getBytes()));
        HashMap hashMap = new HashMap();
        hashMap.put("Accept", "application/json");
        hashMap.put("X-Chartboost-Client", CBUtility.b());
        hashMap.put("X-Chartboost-API", "7.3.1");
        hashMap.put("X-Chartboost-App", str);
        hashMap.put("X-Chartboost-Signature", b2);
        return new ae(hashMap, jSONObject.getBytes(), "application/json");
    }

    @Override // com.chartboost.sdk.impl.ad
    public af<JSONObject> a(ag agVar) {
        try {
            if (agVar.f3708b == null) {
                return af.a(new CBError(CBError.a.INVALID_RESPONSE, "Response is not a valid json object"));
            }
            JSONObject jSONObject = new JSONObject(new String(agVar.f3708b));
            CBLogging.c("CBRequest", "Request " + e() + " succeeded. Response code: " + agVar.f3707a + ", body: " + jSONObject.toString(4));
            if (this.l) {
                int optInt = jSONObject.optInt("status");
                if (optInt == 404) {
                    return af.a(new CBError(CBError.a.HTTP_NOT_FOUND, "404 error from server"));
                }
                if (optInt < 200 || optInt > 299) {
                    String str = "Request failed due to status code " + optInt + " in message";
                    CBLogging.b("CBRequest", str);
                    return af.a(new CBError(CBError.a.UNEXPECTED_RESPONSE, str));
                }
            }
            return af.a(jSONObject);
        } catch (Exception e) {
            com.chartboost.sdk.Tracking.a.a(getClass(), "parseServerResponse", e);
            return af.a(new CBError(CBError.a.MISCELLANEOUS, e.getLocalizedMessage()));
        }
    }

    @Override // com.chartboost.sdk.impl.ad
    public void a(JSONObject jSONObject, ag agVar) {
        if (this.k != null && jSONObject != null) {
            this.k.a(this, jSONObject);
        }
        if (this.p != null) {
            a(agVar, (CBError) null);
        }
    }

    @Override // com.chartboost.sdk.impl.ad
    public void a(CBError cBError, ag agVar) {
        if (cBError == null) {
            return;
        }
        if (this.k != null) {
            this.k.a(this, cBError);
        }
        if (this.p != null) {
            a(agVar, cBError);
        }
    }
}
