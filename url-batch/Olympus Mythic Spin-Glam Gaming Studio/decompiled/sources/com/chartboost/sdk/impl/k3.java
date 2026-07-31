package com.chartboost.sdk.impl;

import com.chartboost.sdk.ChartboostDSP;
import com.chartboost.sdk.impl.b3;
import com.chartboost.sdk.impl.e3;
import com.chartboost.sdk.impl.g3;
import com.chartboost.sdk.impl.si;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.NetworkHelper;
import com.ironsource.B5;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class k3 extends e3 {
    public static final b t = new b(null);
    public final String k;
    public final ig l;
    public final String m;
    public final a n;
    public final p7 o;
    public final zg p;
    public JSONObject q;
    public JSONArray r;
    public boolean s;

    public interface a {
        void a(k3 k3Var, CBError cBError);

        void a(k3 k3Var, JSONObject jSONObject);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(e3.c method, String endpoint, String path, ig igVar, af priority, String str, a aVar, p7 eventTracker, zg zgVar) {
        super(method, NetworkHelper.a.a(endpoint, path), priority, null);
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.k = path;
        this.l = igVar;
        this.m = str;
        this.n = aVar;
        this.o = eventTracker;
        this.p = zgVar;
        this.q = new JSONObject();
    }

    public void f() {
        i5 a2;
        l6 b2;
        l6 b3;
        l6 b4;
        l6 b5;
        l6 b6;
        pf g;
        yd d;
        l6 b7;
        l6 b8;
        pf g2;
        wh j;
        ig igVar = this.l;
        a("app", igVar != null ? igVar.h : null);
        ig igVar2 = this.l;
        a("model", igVar2 != null ? igVar2.a : null);
        ig igVar3 = this.l;
        a("make", igVar3 != null ? igVar3.k : null);
        ig igVar4 = this.l;
        a(CommonUrlParts.DEVICE_TYPE, igVar4 != null ? igVar4.j : null);
        ig igVar5 = this.l;
        a("actual_device_type", igVar5 != null ? igVar5.l : null);
        ig igVar6 = this.l;
        a("os", igVar6 != null ? igVar6.b : null);
        ig igVar7 = this.l;
        a("country", igVar7 != null ? igVar7.c : null);
        ig igVar8 = this.l;
        a(POBConstants.KEY_LANGUAGE, igVar8 != null ? igVar8.d : null);
        ig igVar9 = this.l;
        a("sdk", igVar9 != null ? igVar9.g : null);
        a("user_agent", kj.b.a());
        ig igVar10 = this.l;
        a("timestamp", (igVar10 == null || (j = igVar10.j()) == null) ? null : String.valueOf(TimeUnit.MILLISECONDS.toSeconds(j.a())));
        ig igVar11 = this.l;
        a("session", igVar11 != null ? Integer.valueOf(igVar11.i()) : null);
        ig igVar12 = this.l;
        a("reachability", (igVar12 == null || (g2 = igVar12.g()) == null) ? null : g2.b());
        ig igVar13 = this.l;
        a("is_portrait", (igVar13 == null || (b8 = igVar13.b()) == null) ? null : Boolean.valueOf(b8.k()));
        ig igVar14 = this.l;
        a("scale", (igVar14 == null || (b7 = igVar14.b()) == null) ? null : Float.valueOf(b7.h()));
        ig igVar15 = this.l;
        a(POBConstants.KEY_BUNDLE, igVar15 != null ? igVar15.e : null);
        ig igVar16 = this.l;
        a("bundle_id", igVar16 != null ? igVar16.f : null);
        ig igVar17 = this.l;
        a("carrier", igVar17 != null ? igVar17.m : null);
        ig igVar18 = this.l;
        lc d2 = igVar18 != null ? igVar18.d() : null;
        if (d2 != null) {
            a("mediation", d2.c());
            a("mediation_version", d2.b());
            a("adapter_version", d2.a());
            a("sdk.mediation", d2.d());
            a("sdk.mediation_version", d2.b());
            a("sdk.adapter_version", d2.a());
        }
        ig igVar19 = this.l;
        a("timezone", igVar19 != null ? igVar19.o : null);
        ig igVar20 = this.l;
        a("connectiontype", (igVar20 == null || (g = igVar20.g()) == null || (d = g.d()) == null) ? null : Integer.valueOf(d.c()));
        ig igVar21 = this.l;
        a("dw", (igVar21 == null || (b6 = igVar21.b()) == null) ? null : Integer.valueOf(b6.c()));
        ig igVar22 = this.l;
        a("dh", (igVar22 == null || (b5 = igVar22.b()) == null) ? null : Integer.valueOf(b5.a()));
        ig igVar23 = this.l;
        a("dpi", (igVar23 == null || (b4 = igVar23.b()) == null) ? null : b4.d());
        ig igVar24 = this.l;
        a("w", (igVar24 == null || (b3 = igVar24.b()) == null) ? null : Integer.valueOf(b3.j()));
        ig igVar25 = this.l;
        a("h", (igVar25 == null || (b2 = igVar25.b()) == null) ? null : Integer.valueOf(b2.e()));
        a("commit_hash", "046e4d88fb5334ad97b395fba791da746b7830e2");
        ig igVar26 = this.l;
        s9 c = igVar26 != null ? igVar26.c() : null;
        a("identity", c != null ? c.b() : null);
        a("instance_id", c != null ? c.c() : null);
        xi f = c != null ? c.f() : null;
        if (f != xi.c) {
            a(CommonUrlParts.LIMIT_AD_TRACKING, Boolean.valueOf(f == xi.e));
        }
        a("appsetidscope", c != null ? c.e() : null);
        ig igVar27 = this.l;
        cf f2 = igVar27 != null ? igVar27.f() : null;
        Object h = f2 != null ? f2.h() : null;
        if (h != null) {
            a("consent", h);
        }
        a("pidatauseconsent", f2 != null ? f2.f() : null);
        ig igVar28 = this.l;
        String a3 = (igVar28 == null || (a2 = igVar28.a()) == null) ? null : a2.a();
        if (!l1.b().a(a3)) {
            a("config_variant", a3);
        }
        JSONObject g3 = f2 != null ? f2.g() : null;
        String b9 = f2 != null ? f2.b() : null;
        String a4 = f2 != null ? f2.a() : null;
        if (g3 != null) {
            try {
                g3.put("gpp", b9);
                g3.put(POBConstants.KEY_GPP_SID, a4);
            } catch (JSONException e) {
                xb.b("Failed to add GPP and/or GPP SID to request body", e);
            }
        }
        a("privacy", g3);
    }

    public final String g() {
        e4 e4Var = e4.a;
        String a2 = e4Var.a();
        int[] b2 = e4Var.b();
        JSONObject jSONObject = new JSONObject();
        if (a2.length() > 0 && b2 != null) {
            if (!(b2.length == 0)) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (int i : b2) {
                        jSONArray.put(i);
                    }
                    jSONObject.put("exchangeMode", 2);
                    jSONObject.put("bidFloor", 0.01d);
                    jSONObject.put("code", a2);
                    jSONObject.put("forceCreativeTypes", jSONArray);
                } catch (JSONException unused) {
                    return null;
                }
            }
        }
        return jSONObject.toString();
    }

    public final ig j() {
        return this.l;
    }

    public final JSONArray h() {
        return this.r;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k3(String endpoint, String path, ig igVar, af priority, a aVar, p7 eventTracker, zg zgVar) {
        this(e3.c.c, endpoint, path, igVar, priority, (String) null, aVar, eventTracker, zgVar);
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
    }

    public final void a(String str, Object obj) {
        b3.a(this.q, str, obj);
    }

    public /* synthetic */ k3(String str, String str2, ig igVar, af afVar, a aVar, p7 p7Var, zg zgVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, igVar, afVar, aVar, p7Var, (i & 64) != 0 ? null : zgVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k3(String endpoint, String path, ig igVar, af priority, String eventType, a aVar, p7 eventTracker, zg zgVar) {
        this(e3.c.c, endpoint, path, igVar, priority, eventType, aVar, eventTracker, zgVar);
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
    }

    public final String k() {
        return i();
    }

    public final String i() {
        if (StringsKt.startsWith$default(this.k, "/", false, 2, (Object) null)) {
            return this.k;
        }
        return "/" + this.k;
    }

    @Override // com.chartboost.sdk.impl.e3
    public f3 a() {
        String g;
        s9 c;
        String d;
        String d2;
        f();
        String jSONObject = this.q.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        ig igVar = this.l;
        String str = igVar != null ? igVar.h : null;
        if (str == null) {
            str = "";
        }
        String str2 = igVar != null ? igVar.i : null;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%s %s\n%s\n%s", Arrays.copyOf(new Object[]{c(), k(), str2, jSONObject}, 4));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        String a2 = u2.a(format);
        HashMap hashMap = new HashMap();
        hashMap.put(com.safedk.android.utils.n.c, "application/json");
        hashMap.put("X-Chartboost-Client", p3.b());
        hashMap.put("X-Chartboost-API", "9.12.1");
        hashMap.put("X-Chartboost-App", str);
        hashMap.put("X-Chartboost-Signature", a2);
        zg zgVar = this.p;
        if (zgVar != null && (d2 = zgVar.d()) != null) {
            hashMap.put("x-monetization-session-id", d2);
        }
        ig igVar2 = this.l;
        if (igVar2 != null && (c = igVar2.c()) != null && (d = c.d()) != null) {
            hashMap.put("x-monetization-idfv", d);
        }
        hashMap.put("x-monetization-sdk-version", "9.12.1");
        if (pg.a.d()) {
            String b2 = pg.b();
            String str3 = b2.length() > 0 ? b2 : null;
            if (str3 != null) {
                hashMap.put("X-Chartboost-Test", str3);
            }
            String a3 = pg.a();
            if (a3 != null) {
                hashMap.put("X-Chartboost-Test", a3);
            }
        }
        if (ChartboostDSP.INSTANCE.isDSP() && (g = g()) != null && g.length() != 0) {
            hashMap.put("X-Chartboost-DspDemoApp", g);
        }
        byte[] bytes = jSONObject.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return new f3(hashMap, bytes, "application/json");
    }

    public final void b(String str) {
        this.o.mo3222track(s5.m.a(si.h.d, str));
    }

    public final JSONObject b(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", i);
            jSONObject.put("message", str);
        } catch (JSONException e) {
            xb.b("Error creating JSON", e);
        }
        return jSONObject;
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.chartboost.sdk.impl.e3
    public void a(CBError cBError, h3 h3Var) {
        if (cBError == null) {
            return;
        }
        xb.d("Request failure: " + e() + " status: " + cBError.getErrorDesc(), null);
        a aVar = this.n;
        if (aVar != null) {
            aVar.a(this, cBError);
        }
        a(h3Var, cBError);
    }

    @Override // com.chartboost.sdk.impl.e3
    public void a(JSONObject jSONObject, h3 h3Var) {
        int b2 = h3Var != null ? h3Var.b() : -1;
        xb.d("Request success: " + e() + " status: " + b2, null);
        a aVar = this.n;
        if (aVar != null) {
            aVar.a(this, jSONObject);
        }
        a(h3Var, (CBError) null);
    }

    public final g3 a(String str) {
        JSONObject b2 = b(404, str);
        g3.a aVar = g3.c;
        CBError.Internal internal2 = CBError.Internal.HTTP_NOT_FOUND;
        String jSONObject = b2.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        return aVar.a(new CBError(internal2, jSONObject));
    }

    public final g3 a(int i, String str) {
        JSONObject b2 = b(i, str);
        g3.a aVar = g3.c;
        CBError.Internal internal2 = CBError.Internal.HTTP_NOT_OK;
        String jSONObject = b2.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        return aVar.a(new CBError(internal2, jSONObject));
    }

    public final g3 a(Exception exc) {
        g3.a aVar = g3.c;
        CBError.Internal internal2 = CBError.Internal.MISCELLANEOUS;
        String localizedMessage = exc.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "";
        }
        return aVar.a(new CBError(internal2, localizedMessage));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[Catch: Exception -> 0x000b, TryCatch #0 {Exception -> 0x000b, blocks: (B:2:0x0000, B:4:0x0004, B:7:0x0011, B:9:0x0022, B:10:0x002c, B:12:0x0059, B:14:0x0069, B:21:0x0079, B:23:0x009a, B:26:0x000e), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[Catch: Exception -> 0x000b, TryCatch #0 {Exception -> 0x000b, blocks: (B:2:0x0000, B:4:0x0004, B:7:0x0011, B:9:0x0022, B:10:0x002c, B:12:0x0059, B:14:0x0069, B:21:0x0079, B:23:0x009a, B:26:0x000e), top: B:1:0x0000 }] */
    @Override // com.chartboost.sdk.impl.e3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g3 a(h3 h3Var) {
        byte[] bArr;
        try {
            if (h3Var != null) {
                bArr = h3Var.a();
                if (bArr == null) {
                }
                JSONObject jSONObject = new JSONObject(new String(bArr, Charsets.UTF_8));
                String i = i();
                Integer valueOf = h3Var == null ? Integer.valueOf(h3Var.b()) : null;
                xb.d("Request " + i + " succeeded. Response code: " + valueOf + ", body: " + jSONObject.toString(4), null);
                if (this.s) {
                    int optInt = jSONObject.optInt("status");
                    String optString = jSONObject.optString("message");
                    if (optInt == 404) {
                        Intrinsics.checkNotNull(optString);
                        return a(optString);
                    }
                    if (optInt < 200 || optInt > 299) {
                        xb.b("Request failed due to status code " + optInt + " in message", null);
                        Intrinsics.checkNotNull(optString);
                        return a(optInt, optString);
                    }
                }
                return g3.c.a(jSONObject);
            }
            bArr = new byte[0];
            JSONObject jSONObject2 = new JSONObject(new String(bArr, Charsets.UTF_8));
            String i2 = i();
            if (h3Var == null) {
            }
            xb.d("Request " + i2 + " succeeded. Response code: " + valueOf + ", body: " + jSONObject2.toString(4), null);
            if (this.s) {
            }
            return g3.c.a(jSONObject2);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            b(message);
            xb.b("parseServerResponse", e);
            return a(e);
        }
    }

    public final void a(h3 h3Var, CBError cBError) {
        String str;
        String errorDesc;
        CBError.Type type;
        b3.a a2 = b3.a(B5.r, i());
        String str2 = "None";
        b3.a a3 = b3.a("statuscode", h3Var == null ? "None" : Integer.valueOf(h3Var.b()));
        if (cBError == null || (type = cBError.getType()) == null || (str = type.toString()) == null) {
            str = "None";
        }
        b3.a a4 = b3.a("error", str);
        if (cBError != null && (errorDesc = cBError.getErrorDesc()) != null) {
            str2 = errorDesc;
        }
        JSONObject a5 = b3.a(a2, a3, a4, b3.a("errorDescription", str2), b3.a("retryCount", (Object) 0));
        Intrinsics.checkNotNullExpressionValue(a5, "jsonObject(...)");
        xb.a("sendToSessionLogs: " + a5, null);
    }

    public final void a(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<set-?>");
        this.q = jSONObject;
    }

    public final void a(JSONArray jSONArray) {
        this.r = jSONArray;
    }
}
