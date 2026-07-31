package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class e3 implements Comparable, AppLovinCommunicatorSubscriber {
    private final List A;
    private final List B;
    private final List C;
    private final List D;
    private final Map E;
    private final boolean F;
    private final a7 G;
    private final boolean H;
    private final String I;
    private final Map J;
    private final com.applovin.impl.sdk.k a;
    private final a b;
    private int c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final String p;
    private final String q;
    private String r;
    private String s;
    private final String t;
    private final String u;
    private final String v;
    private final String w;
    private final int x;
    private final List y;
    private final List z;

    public enum a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");

        private final String a;

        a(String str) {
            this.a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String b() {
            return this.a;
        }
    }

    public enum b {
        NOT_SUPPORTED("Not Supported", -65536, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", -65536, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", -65536, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY("", -16776961, "");

        private final String a;
        private final int b;
        private final String c;

        b(String str, int i2, String str2) {
            this.a = str;
            this.b = i2;
            this.c = str2;
        }

        public String b() {
            return this.c;
        }

        public String c() {
            return this.a;
        }

        public int d() {
            return this.b;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0257 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0279  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e3(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        String str;
        String str2;
        String str3;
        boolean z;
        boolean z2;
        boolean z3;
        Integer a2;
        JSONObject jSONObject2;
        String string;
        String str4;
        String str5;
        boolean z4;
        boolean z5;
        String str6;
        this.a = kVar;
        String string2 = JsonUtils.getString(jSONObject, "name", "");
        this.p = string2;
        this.q = JsonUtils.getString(jSONObject, "display_name", "");
        this.r = JsonUtils.getString(jSONObject, "adapter_class", "");
        this.u = JsonUtils.getString(jSONObject, "latest_adapter_version", "");
        this.B = a(jSONObject);
        Boolean bool = Boolean.FALSE;
        this.k = JsonUtils.getBoolean(jSONObject, "hide_if_missing", bool).booleanValue();
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject, com.safedk.android.utils.j.c, new JSONObject());
        this.z = a(jSONObject3, kVar);
        this.o = JsonUtils.getBoolean(jSONObject3, "java_8_required", bool).booleanValue();
        this.F = JsonUtils.getBoolean(jSONObject3, "hide_initialization_status", bool).booleanValue();
        this.n = JsonUtils.getBoolean(jSONObject3, "check_sdk_adapter_version_mismatch", Boolean.TRUE).booleanValue();
        this.C = JsonUtils.getList(jSONObject3, "live_network_filtering_names", null);
        JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONObject3, "test_mode", new JSONObject());
        JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, "network_names", (JSONObject) null);
        if (jSONObject5 == null || jSONObject5.length() <= 0) {
            this.D = Arrays.asList(string2);
            this.E = null;
        } else {
            ArrayList arrayList = new ArrayList(Arrays.asList(string2));
            HashMap hashMap = new HashMap(jSONObject5.length());
            Iterator<String> keys = jSONObject5.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                MaxAdFormat formatFromString = MaxAdFormat.formatFromString(next);
                String string3 = JsonUtils.getString(jSONObject5, next, null);
                if (formatFromString != null && !TextUtils.isEmpty(string3)) {
                    arrayList.add(string3);
                    hashMap.put(formatFromString, string3);
                }
            }
            this.D = arrayList;
            this.E = hashMap;
        }
        JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject, "test_mode", new JSONObject());
        Boolean bool2 = Boolean.TRUE;
        this.i = JsonUtils.getBoolean(jSONObject6, "supported", bool2).booleanValue();
        this.j = JsonUtils.getBoolean(jSONObject, "test_mode_requires_init", Boolean.FALSE).booleanValue();
        this.v = JsonUtils.getString(jSONObject6, "message", null);
        this.G = new a7(JsonUtils.getJSONObject(jSONObject3, "tcf_config"), this.q);
        List list = JsonUtils.getList(jSONObject, "existence_classes", null);
        if (list != null) {
            this.d = n7.a(list);
        } else {
            this.d = n7.a(JsonUtils.getString(jSONObject, "existence_class", ""));
        }
        List emptyList = Collections.emptyList();
        String str7 = this.r;
        String string4 = JsonUtils.getString(jSONObject3, "init_adapter_class", null);
        if (string4 != null) {
            this.r = string4;
        }
        MaxAdapter a3 = w3.a(str7, kVar);
        if (a3 != null) {
            this.e = true;
            try {
                str = a3.getAdapterVersion();
                try {
                    str2 = w3.a(a3);
                    try {
                        this.h = w3.a(a3, this.r);
                        emptyList = a(a3, JsonUtils.getBoolean(jSONObject4, "is_mrec_supported", bool2).booleanValue());
                        JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONObject3, "native_ad_view_config", (JSONObject) null);
                        if (jSONObject7 != null) {
                            String string5 = JsonUtils.getString(jSONObject7, "min_adapter_version", null);
                            try {
                                if (string5 != null) {
                                    if (n7.a(str, string5) < 0) {
                                        z3 = false;
                                        str4 = JsonUtils.getString(jSONObject7, BrandSafetyEvent.ad, null);
                                    }
                                }
                                str4 = JsonUtils.getString(jSONObject7, BrandSafetyEvent.ad, null);
                            } catch (Throwable th) {
                                th = th;
                                str4 = null;
                                com.applovin.impl.sdk.o.h("MediatedNetwork", "Failed to load adapter for network " + this.p + ". Please check that you have a compatible network SDK integrated. Error: " + th);
                                str5 = str4;
                                z4 = false;
                                Class<?> cls = Class.forName(this.r);
                                z5 = z4;
                                str6 = str5;
                                z = cls.getMethod("loadNativeAd", MaxAdapterResponseParameters.class, Activity.class, MaxNativeAdAdapterListener.class).getDeclaringClass().equals(cls);
                                z2 = z5;
                                str3 = str6;
                                this.t = str;
                                this.s = str2;
                                this.y = emptyList;
                                this.l = z;
                                this.m = z3;
                                this.w = str3;
                                this.A = a(jSONObject3, str, kVar);
                                this.g = n7.a(JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "alternative_network", (JSONObject) null), "adapter_class", ""));
                                this.b = a();
                                this.f = str.equals(this.u) && !z2;
                                Context o = com.applovin.impl.sdk.k.o();
                                int lastIndexOf = this.p.lastIndexOf("_");
                                if (lastIndexOf != -1) {
                                }
                                this.x = o.getResources().getIdentifier("applovin_ic_mediation_" + r2, "drawable", o.getPackageName());
                                this.c = MaxAdapter.InitializationStatus.NOT_INITIALIZED.getCode();
                                AppLovinCommunicator.getInstance(o).subscribe(this, "adapter_initialization_status");
                                a2 = kVar.S().a(this.r);
                                if (a2 != null) {
                                }
                                jSONObject2 = JsonUtils.getJSONObject(jSONObject3, "amazon_marketplace", (JSONObject) null);
                                if (jSONObject2 != null) {
                                }
                                this.H = false;
                                this.I = null;
                                this.J = null;
                                return;
                            }
                            z3 = true;
                        } else {
                            str4 = null;
                            z3 = false;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        str4 = null;
                        z3 = false;
                        com.applovin.impl.sdk.o.h("MediatedNetwork", "Failed to load adapter for network " + this.p + ". Please check that you have a compatible network SDK integrated. Error: " + th);
                        str5 = str4;
                        z4 = false;
                        Class<?> cls2 = Class.forName(this.r);
                        z5 = z4;
                        str6 = str5;
                        z = cls2.getMethod("loadNativeAd", MaxAdapterResponseParameters.class, Activity.class, MaxNativeAdAdapterListener.class).getDeclaringClass().equals(cls2);
                        z2 = z5;
                        str3 = str6;
                        this.t = str;
                        this.s = str2;
                        this.y = emptyList;
                        this.l = z;
                        this.m = z3;
                        this.w = str3;
                        this.A = a(jSONObject3, str, kVar);
                        this.g = n7.a(JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "alternative_network", (JSONObject) null), "adapter_class", ""));
                        this.b = a();
                        this.f = str.equals(this.u) && !z2;
                        Context o2 = com.applovin.impl.sdk.k.o();
                        int lastIndexOf2 = this.p.lastIndexOf("_");
                        if (lastIndexOf2 != -1) {
                        }
                        this.x = o2.getResources().getIdentifier("applovin_ic_mediation_" + r2, "drawable", o2.getPackageName());
                        this.c = MaxAdapter.InitializationStatus.NOT_INITIALIZED.getCode();
                        AppLovinCommunicator.getInstance(o2).subscribe(this, "adapter_initialization_status");
                        a2 = kVar.S().a(this.r);
                        if (a2 != null) {
                        }
                        jSONObject2 = JsonUtils.getJSONObject(jSONObject3, "amazon_marketplace", (JSONObject) null);
                        if (jSONObject2 != null) {
                        }
                        this.H = false;
                        this.I = null;
                        this.J = null;
                        return;
                    }
                    try {
                        str5 = str4;
                        z4 = a3.isBeta();
                    } catch (Throwable th3) {
                        th = th3;
                        com.applovin.impl.sdk.o.h("MediatedNetwork", "Failed to load adapter for network " + this.p + ". Please check that you have a compatible network SDK integrated. Error: " + th);
                        str5 = str4;
                        z4 = false;
                        Class<?> cls22 = Class.forName(this.r);
                        z5 = z4;
                        str6 = str5;
                        z = cls22.getMethod("loadNativeAd", MaxAdapterResponseParameters.class, Activity.class, MaxNativeAdAdapterListener.class).getDeclaringClass().equals(cls22);
                        z2 = z5;
                        str3 = str6;
                        this.t = str;
                        this.s = str2;
                        this.y = emptyList;
                        this.l = z;
                        this.m = z3;
                        this.w = str3;
                        this.A = a(jSONObject3, str, kVar);
                        this.g = n7.a(JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "alternative_network", (JSONObject) null), "adapter_class", ""));
                        this.b = a();
                        this.f = str.equals(this.u) && !z2;
                        Context o22 = com.applovin.impl.sdk.k.o();
                        int lastIndexOf22 = this.p.lastIndexOf("_");
                        if (lastIndexOf22 != -1) {
                        }
                        this.x = o22.getResources().getIdentifier("applovin_ic_mediation_" + r2, "drawable", o22.getPackageName());
                        this.c = MaxAdapter.InitializationStatus.NOT_INITIALIZED.getCode();
                        AppLovinCommunicator.getInstance(o22).subscribe(this, "adapter_initialization_status");
                        a2 = kVar.S().a(this.r);
                        if (a2 != null) {
                        }
                        jSONObject2 = JsonUtils.getJSONObject(jSONObject3, "amazon_marketplace", (JSONObject) null);
                        if (jSONObject2 != null) {
                        }
                        this.H = false;
                        this.I = null;
                        this.J = null;
                        return;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    str2 = "";
                }
            } catch (Throwable th5) {
                th = th5;
                str = "";
                str2 = str;
            }
            try {
                Class<?> cls222 = Class.forName(this.r);
                z5 = z4;
                str6 = str5;
            } catch (Throwable th6) {
                th = th6;
                z5 = z4;
                str6 = str5;
            }
            try {
                z = cls222.getMethod("loadNativeAd", MaxAdapterResponseParameters.class, Activity.class, MaxNativeAdAdapterListener.class).getDeclaringClass().equals(cls222);
                z2 = z5;
                str3 = str6;
            } catch (Throwable th7) {
                th = th7;
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("MediatedNetwork", "Failed to check if adapter overrides MaxNativeAdAdapter", th);
                }
                z2 = z5;
                str3 = str6;
                z = false;
                this.t = str;
                this.s = str2;
                this.y = emptyList;
                this.l = z;
                this.m = z3;
                this.w = str3;
                this.A = a(jSONObject3, str, kVar);
                this.g = n7.a(JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "alternative_network", (JSONObject) null), "adapter_class", ""));
                this.b = a();
                this.f = str.equals(this.u) && !z2;
                Context o222 = com.applovin.impl.sdk.k.o();
                int lastIndexOf222 = this.p.lastIndexOf("_");
                if (lastIndexOf222 != -1) {
                }
                this.x = o222.getResources().getIdentifier("applovin_ic_mediation_" + r2, "drawable", o222.getPackageName());
                this.c = MaxAdapter.InitializationStatus.NOT_INITIALIZED.getCode();
                AppLovinCommunicator.getInstance(o222).subscribe(this, "adapter_initialization_status");
                a2 = kVar.S().a(this.r);
                if (a2 != null) {
                }
                jSONObject2 = JsonUtils.getJSONObject(jSONObject3, "amazon_marketplace", (JSONObject) null);
                if (jSONObject2 != null) {
                }
                this.H = false;
                this.I = null;
                this.J = null;
                return;
            }
        } else {
            this.e = false;
            str = "";
            str2 = str;
            str3 = null;
            z = false;
            z2 = false;
            z3 = false;
        }
        this.t = str;
        this.s = str2;
        this.y = emptyList;
        this.l = z;
        this.m = z3;
        this.w = str3;
        this.A = a(jSONObject3, str, kVar);
        this.g = n7.a(JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "alternative_network", (JSONObject) null), "adapter_class", ""));
        this.b = a();
        this.f = str.equals(this.u) && !z2;
        Context o2222 = com.applovin.impl.sdk.k.o();
        int lastIndexOf2222 = this.p.lastIndexOf("_");
        String substring = lastIndexOf2222 != -1 ? this.p.toLowerCase().substring(0, lastIndexOf2222) : this.p.toLowerCase();
        this.x = o2222.getResources().getIdentifier("applovin_ic_mediation_" + substring, "drawable", o2222.getPackageName());
        this.c = MaxAdapter.InitializationStatus.NOT_INITIALIZED.getCode();
        AppLovinCommunicator.getInstance(o2222).subscribe(this, "adapter_initialization_status");
        a2 = kVar.S().a(this.r);
        if (a2 != null) {
            this.c = a2.intValue();
        }
        jSONObject2 = JsonUtils.getJSONObject(jSONObject3, "amazon_marketplace", (JSONObject) null);
        if (jSONObject2 != null || !this.d) {
            this.H = false;
            this.I = null;
            this.J = null;
            return;
        }
        this.H = true;
        this.I = JsonUtils.getString(jSONObject2, "test_mode_app_id", null);
        JSONObject jSONObject8 = JsonUtils.getJSONObject(jSONObject2, "test_mode_slot_ids", new JSONObject());
        HashMap hashMap2 = new HashMap(jSONObject8.length());
        Iterator<String> keys2 = jSONObject8.keys();
        while (keys2.hasNext()) {
            String next2 = keys2.next();
            MaxAdFormat formatFromString2 = MaxAdFormat.formatFromString(next2);
            JSONObject jSONObject9 = JsonUtils.getJSONObject(jSONObject8, next2, (JSONObject) null);
            if (formatFromString2 != null && jSONObject9 != null && (string = JsonUtils.getString(jSONObject9, CommonUrlParts.UUID, null)) != null) {
                hashMap2.put(formatFromString2, new x(string, jSONObject9, formatFromString2));
            }
        }
        this.J = hashMap2;
    }

    private a a() {
        a aVar = this.d ? this.e ? a.COMPLETE : this.g ? a.MISSING : a.INCOMPLETE_INTEGRATION : this.e ? a.INCOMPLETE_INTEGRATION : a.MISSING;
        if (aVar == a.MISSING) {
            return aVar;
        }
        Iterator it = this.z.iterator();
        while (it.hasNext()) {
            if (!((p4) it.next()).c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        Iterator it2 = this.A.iterator();
        while (it2.hasNext()) {
            if (!((k1) it2.next()).c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        return (!this.o || com.applovin.impl.sdk.k.F0()) ? E() ? a.INCOMPLETE_INTEGRATION : aVar : a.INVALID_INTEGRATION;
    }

    public boolean A() {
        return this.f;
    }

    public boolean B() {
        return this.h;
    }

    public boolean C() {
        return this.H;
    }

    public boolean D() {
        return this.o;
    }

    public boolean E() {
        if (!this.n || !StringUtils.isValidString(this.s)) {
            return false;
        }
        return !n7.d(this.s).equals(n7.a(this.t, this.s.split("\\.").length));
    }

    public boolean F() {
        return this.d;
    }

    public boolean G() {
        return this.b == a.MISSING && this.k;
    }

    public boolean H() {
        return this.F;
    }

    public boolean I() {
        return this.l;
    }

    public boolean J() {
        return this.m;
    }

    public String b() {
        return this.r;
    }

    public String c() {
        return this.t;
    }

    public Map d() {
        return this.J;
    }

    public String e() {
        return this.I;
    }

    public List f() {
        return this.A;
    }

    public String g() {
        return this.q;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediatedNetwork";
    }

    public int h() {
        return this.x;
    }

    public int i() {
        return this.c;
    }

    public final String j() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n---------- ");
        sb.append(this.p);
        sb.append(" ----------");
        sb.append("\nStatus  - ");
        sb.append(this.b.b());
        sb.append("\nSDK     - ");
        String str = "UNAVAILABLE";
        sb.append((!this.d || TextUtils.isEmpty(this.s)) ? "UNAVAILABLE" : this.s);
        sb.append("\nAdapter - ");
        if (this.e && !TextUtils.isEmpty(this.t)) {
            str = this.t;
        }
        sb.append(str);
        for (p4 p4Var : n()) {
            if (!p4Var.c()) {
                sb.append("\n* MISSING ");
                sb.append(p4Var.b());
                sb.append(": ");
                sb.append(p4Var.a());
            }
        }
        for (k1 k1Var : f()) {
            if (!k1Var.c()) {
                sb.append("\n* MISSING ");
                sb.append(k1Var.b());
                sb.append(": ");
                sb.append(k1Var.a());
            }
        }
        return sb.toString();
    }

    public String k() {
        return this.u;
    }

    public List l() {
        return this.C;
    }

    public String m() {
        return this.p;
    }

    public List n() {
        return this.z;
    }

    public final com.applovin.impl.sdk.k o() {
        return this.a;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string = appLovinCommunicatorMessage.getMessageData().getString("adapter_class", "");
        if (this.r.equals(string)) {
            this.c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            MaxAdapter a2 = w3.a(string, this.a);
            if (a2 != null) {
                String a3 = w3.a(a2);
                if (this.s.equals(a3)) {
                    return;
                }
                this.s = a3;
                this.a.t().a(this.s, string);
            }
        }
    }

    public String p() {
        return this.s;
    }

    public a q() {
        return this.b;
    }

    public List r() {
        return this.y;
    }

    public List s() {
        return this.B;
    }

    public a7 t() {
        return this.G;
    }

    public String toString() {
        return "MediatedNetwork{name=" + this.p + ", displayName=" + this.q + ", sdkAvailable=" + this.d + ", sdkVersion=" + this.s + ", adapterAvailable=" + this.e + ", adapterVersion=" + this.t + "}";
    }

    public List u() {
        return this.D;
    }

    public String v() {
        return this.v;
    }

    public String w() {
        return this.w;
    }

    public Map x() {
        return this.E;
    }

    public b y() {
        if (!this.i) {
            return b.NOT_SUPPORTED;
        }
        a aVar = this.b;
        return (aVar == a.COMPLETE || (aVar == a.INCOMPLETE_INTEGRATION && F() && z())) ? !this.a.s0().c() ? b.DISABLED : (this.j && (this.c == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || this.c == MaxAdapter.InitializationStatus.INITIALIZING.getCode())) ? b.NOT_INITIALIZED : b.READY : b.INVALID_INTEGRATION;
    }

    public boolean z() {
        return this.e;
    }

    private List a(MaxAdapter maxAdapter, boolean z) {
        ArrayList arrayList = new ArrayList(5);
        if (maxAdapter instanceof MaxInterstitialAdapter) {
            arrayList.add(MaxAdFormat.INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAppOpenAdapter) {
            arrayList.add(MaxAdFormat.APP_OPEN);
        }
        if (maxAdapter instanceof MaxRewardedAdapter) {
            arrayList.add(MaxAdFormat.REWARDED);
        }
        if (maxAdapter instanceof MaxAdViewAdapter) {
            arrayList.add(MaxAdFormat.BANNER);
            arrayList.add(MaxAdFormat.LEADER);
            if (z) {
                arrayList.add(MaxAdFormat.MREC);
            }
        }
        if (maxAdapter instanceof MaxNativeAdAdapter) {
            arrayList.add(MaxAdFormat.NATIVE);
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        ArrayList arrayList = new ArrayList();
        if (this.r.equals("com.applovin.mediation.adapters.AppLovinMediationAdapter")) {
            p4 p4Var = new p4("com.google.android.gms.permission.AD_ID", "Please add\n<uses-permission android:name=\"com.google.android.gms.permission.AD_ID\" />\nto your AndroidManifest.xml", com.applovin.impl.sdk.k.o());
            if (p4Var.c()) {
                arrayList.add(p4Var);
            }
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "permissions", new JSONObject());
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                arrayList.add(new p4(next, jSONObject2.getString(next), com.applovin.impl.sdk.k.o()));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject) {
        return JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "supported_regions", null), null);
    }

    private List a(JSONObject jSONObject, String str, com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "dependencies", new JSONArray());
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "dependencies_v2", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length() + jSONArray2.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new k1(jSONObject2, kVar));
            }
        }
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray2, i2, (JSONObject) null);
            if (jSONObject3 != null && k1.a(str, JsonUtils.getString(jSONObject3, "min_adapter_version", null), JsonUtils.getString(jSONObject3, "max_adapter_version", null))) {
                arrayList.add(new k1(jSONObject3, kVar));
            }
        }
        return arrayList;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(e3 e3Var) {
        return this.q.compareToIgnoreCase(e3Var.q);
    }
}
