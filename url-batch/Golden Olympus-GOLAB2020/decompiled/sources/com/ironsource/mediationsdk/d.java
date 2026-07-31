package com.ironsource.mediationsdk;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.ironsource.C1436b5;
import com.ironsource.C1464f5;
import com.ironsource.C1513m5;
import com.ironsource.C1591x2;
import com.ironsource.InterfaceC1581v4;
import com.ironsource.bk;
import com.ironsource.br;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.ge;
import com.ironsource.jn;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.p;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.nk;
import com.ironsource.nm;
import com.ironsource.o9;
import com.ironsource.of;
import com.ironsource.zb;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: A, reason: collision with root package name */
    public static final boolean f17312A = false;

    /* renamed from: B, reason: collision with root package name */
    private static d f17313B = new d();

    /* renamed from: c, reason: collision with root package name */
    public static final String f17314c = "auctionId";

    /* renamed from: d, reason: collision with root package name */
    public static final String f17315d = "armData";

    /* renamed from: e, reason: collision with root package name */
    public static final String f17316e = "larmData";

    /* renamed from: f, reason: collision with root package name */
    public static final String f17317f = "isAdUnitCapped";

    /* renamed from: g, reason: collision with root package name */
    public static final String f17318g = "settings";

    /* renamed from: h, reason: collision with root package name */
    public static final String f17319h = "waterfall";

    /* renamed from: i, reason: collision with root package name */
    public static final String f17320i = "genericParams";

    /* renamed from: j, reason: collision with root package name */
    public static final String f17321j = "configurations";

    /* renamed from: k, reason: collision with root package name */
    public static final String f17322k = "instances";

    /* renamed from: l, reason: collision with root package name */
    public static final String f17323l = "${AUCTION_LOSS}";

    /* renamed from: m, reason: collision with root package name */
    public static final String f17324m = "${AUCTION_MBR}";

    /* renamed from: n, reason: collision with root package name */
    public static final String f17325n = "${AUCTION_PRICE}";

    /* renamed from: o, reason: collision with root package name */
    public static final String f17326o = "${DYNAMIC_DEMAND_SOURCE}";

    /* renamed from: p, reason: collision with root package name */
    public static final String f17327p = "${INSTANCE}";

    /* renamed from: q, reason: collision with root package name */
    public static final String f17328q = "${INSTANCE_TYPE}";

    /* renamed from: r, reason: collision with root package name */
    public static final String f17329r = "${PLACEMENT_NAME}";

    /* renamed from: s, reason: collision with root package name */
    private static final String f17330s = "adMarkup";

    /* renamed from: t, reason: collision with root package name */
    private static final String f17331t = "dynamicDemandSource";

    /* renamed from: u, reason: collision with root package name */
    private static final String f17332u = "params";

    /* renamed from: v, reason: collision with root package name */
    public static final String f17333v = "dlpl";

    /* renamed from: w, reason: collision with root package name */
    public static final String f17334w = "adUnit";

    /* renamed from: x, reason: collision with root package name */
    public static final String f17335x = "parallelLoad";

    /* renamed from: y, reason: collision with root package name */
    public static final String f17336y = "bidderExclusive";

    /* renamed from: z, reason: collision with root package name */
    public static final String f17337z = "showPriorityEnabled";

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f17338a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final of f17339b = nm.S().f();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f17340a;

        /* renamed from: b, reason: collision with root package name */
        private List<C1513m5> f17341b;

        /* renamed from: c, reason: collision with root package name */
        private C1513m5 f17342c;

        /* renamed from: d, reason: collision with root package name */
        private JSONObject f17343d;

        /* renamed from: e, reason: collision with root package name */
        private JSONObject f17344e;

        /* renamed from: f, reason: collision with root package name */
        private int f17345f;

        /* renamed from: g, reason: collision with root package name */
        private String f17346g;

        /* renamed from: h, reason: collision with root package name */
        private InterfaceC1581v4 f17347h;

        public a(String str) {
            this.f17340a = str;
        }

        public JSONObject b() {
            return this.f17344e;
        }

        public int c() {
            return this.f17345f;
        }

        public String d() {
            return this.f17346g;
        }

        public C1513m5 e() {
            return this.f17342c;
        }

        public JSONObject f() {
            return this.f17343d;
        }

        public InterfaceC1581v4 g() {
            return this.f17347h;
        }

        public List<C1513m5> h() {
            return this.f17341b;
        }

        public com.ironsource.mediationsdk.demandOnly.p a(String str) {
            InterfaceC1581v4 interfaceC1581v4 = this.f17347h;
            return interfaceC1581v4 != null ? interfaceC1581v4.a(str) : new p.b();
        }

        public String a() {
            return this.f17340a;
        }
    }

    static class b implements Runnable {

        /* renamed from: d, reason: collision with root package name */
        private static final int f17348d = 15000;

        /* renamed from: a, reason: collision with root package name */
        private String f17349a;

        /* renamed from: b, reason: collision with root package name */
        private String f17350b;

        /* renamed from: c, reason: collision with root package name */
        private String f17351c;

        public b(String str, String str2, String str3) {
            this.f17349a = str;
            this.f17350b = str2;
            this.f17351c = str3;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            boolean z4;
            String str = this.f17349a + ";" + this.f17350b + ";" + this.f17351c;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f17351c).openConnection();
                httpURLConnection.setRequestMethod(jn.f16864a);
                httpURLConnection.setReadTimeout(f17348d);
                httpURLConnection.setConnectTimeout(f17348d);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                String responseMessage = httpURLConnection.getResponseMessage();
                httpURLConnection.disconnect();
                if (responseCode != 200 && responseCode != 204) {
                    z4 = false;
                    br.i().a(new zb(!z4 ? IronSourceConstants.TROUBLESHOOTING_SEND_AUCTION_URL_SUCCESS : IronSourceConstants.TROUBLESHOOTING_FAILED_TO_SEND_AUCTION_URL, new JSONObject().put(IronSourceConstants.EVENTS_PROVIDER, "Mediation").put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1).put(IronSourceConstants.EVENTS_EXT1, str).put("errorCode", responseCode).put("reason", responseMessage)));
                }
                z4 = true;
                br.i().a(new zb(!z4 ? IronSourceConstants.TROUBLESHOOTING_SEND_AUCTION_URL_SUCCESS : IronSourceConstants.TROUBLESHOOTING_FAILED_TO_SEND_AUCTION_URL, new JSONObject().put(IronSourceConstants.EVENTS_PROVIDER, "Mediation").put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1).put(IronSourceConstants.EVENTS_EXT1, str).put("errorCode", responseCode).put("reason", responseMessage)));
            } catch (Exception e4) {
                o9.d().a(e4);
                IronLog.INTERNAL.error("Send auction url failed with params - " + str + ";" + e4.getMessage());
            }
        }
    }

    private enum c {
        NOT_SECURE,
        SECURE
    }

    public static d b() {
        return f17313B;
    }

    public a a(JSONObject jSONObject) {
        String optString = jSONObject.optString("auctionId");
        if (TextUtils.isEmpty(optString)) {
            throw new JSONException("Invalid auction response - auction id is missing");
        }
        a aVar = new a(optString);
        if (jSONObject.has("settings")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("settings");
            aVar.f17342c = new C1513m5(jSONObject2);
            r3 = jSONObject2.has(f17315d) ? jSONObject2.optJSONObject(f17315d) : null;
            if (jSONObject2.has("genericParams")) {
                aVar.f17343d = jSONObject2.optJSONObject("genericParams");
            }
            if (jSONObject2.has("configurations")) {
                aVar.f17344e = jSONObject2.optJSONObject("configurations");
            }
            if (jSONObject2.has(f17322k)) {
                aVar.f17347h = new InterfaceC1581v4.a(jSONObject2.optJSONObject(f17322k));
            }
        }
        aVar.f17341b = new ArrayList();
        if (jSONObject.has(f17319h)) {
            JSONArray jSONArray = jSONObject.getJSONArray(f17319h);
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                C1513m5 c1513m5 = new C1513m5(jSONArray.getJSONObject(i4), i4, r3);
                if (!c1513m5.m()) {
                    aVar.f17345f = 1002;
                    aVar.f17346g = "waterfall " + i4;
                    IronLog.INTERNAL.verbose("AuctionResponseItem " + i4 + " not valid - parsing error");
                    throw new JSONException("invalid response");
                }
                aVar.f17341b.add(c1513m5);
            }
        }
        return aVar;
    }

    public String c(String str) {
        String str2 = "";
        try {
            if (!TextUtils.isEmpty(str) && nk.a(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("params")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("parameters = " + jSONObject2);
                    if (jSONObject2.has("dynamicDemandSource")) {
                        str2 = jSONObject2.getString("dynamicDemandSource");
                        ironLog.verbose("demand source = " + str2);
                        return str2;
                    }
                }
            }
            return "";
        } catch (JSONException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error("exception " + e4.getMessage());
            return str2;
        }
    }

    private c a() {
        c cVar = c.SECURE;
        if (Build.VERSION.SDK_INT >= 28) {
            if (!NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                return cVar;
            }
        } else if ((ContextProvider.getInstance().getApplicationContext().getApplicationInfo().flags & 134217728) == 0) {
            return cVar;
        }
        return c.NOT_SECURE;
    }

    public Map<String, String> b(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("params")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jSONObject2.get(next);
                    if (obj instanceof String) {
                        hashMap.put(next, (String) obj);
                    }
                }
            }
        } catch (JSONException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error("exception " + e4.getMessage());
        }
        return hashMap;
    }

    public String a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("adMarkup")) {
                    return jSONObject.getString("adMarkup");
                }
            }
        } catch (JSONException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error("exception " + e4.getMessage());
        }
        return str;
    }

    public String a(String str, int i4, C1513m5 c1513m5, String str2, String str3, String str4) {
        String i5 = c1513m5.i();
        return a(str, c1513m5.c(), i4, b().c(c1513m5.k()), i5, b().a(i5, str2), str3, str4);
    }

    private String a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        double parseDouble = Double.parseDouble(str);
        return Double.parseDouble(str2) == 0.0d ? "" : String.valueOf(Math.round((parseDouble / r7) * 1000.0d) / 1000.0d);
    }

    public String a(String str, String str2, int i4, String str3, String str4, String str5, String str6, String str7) {
        return str.replace(f17325n, str4).replace(f17323l, str6).replace(f17324m, str5).replace(f17327p, str2).replace(f17328q, Integer.toString(i4)).replace(f17326o, str3).replace(f17329r, str7);
    }

    JSONObject a(i iVar) {
        IronSource.AD_UNIT ad_unit;
        boolean z4;
        List<String> list;
        int i4;
        int i5;
        IronSource.AD_UNIT c4 = iVar.c();
        boolean s4 = iVar.s();
        Map<String, Object> g4 = iVar.g();
        List<String> k4 = iVar.k();
        h e4 = iVar.e();
        int n4 = iVar.n();
        ISBannerSize f4 = iVar.f();
        IronSourceSegment m4 = iVar.m();
        boolean o4 = iVar.o();
        boolean p4 = iVar.p();
        ArrayList<C1464f5> j4 = iVar.j();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> it = g4.keySet().iterator();
        while (true) {
            ad_unit = c4;
            z4 = s4;
            String str = "";
            list = k4;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            ISBannerSize iSBannerSize = f4;
            JSONObject jSONObject3 = new JSONObject();
            IronSourceSegment ironSourceSegment = m4;
            jSONObject3.put(ge.f16503v0, 2);
            jSONObject3.put(ge.f16476m0, new JSONObject((Map) g4.get(next)));
            if (e4 != null) {
                str = e4.a(next);
            }
            jSONObject3.put(ge.f16512y0, str);
            jSONObject3.put("ts", p4 ? 1 : 0);
            jSONObject2.put(next, jSONObject3);
            c4 = ad_unit;
            s4 = z4 ? 1 : 0;
            k4 = list;
            f4 = iSBannerSize;
            m4 = ironSourceSegment;
        }
        ISBannerSize iSBannerSize2 = f4;
        IronSourceSegment ironSourceSegment2 = m4;
        Iterator<String> it2 = list.iterator();
        while (true) {
            i4 = 1;
            if (!it2.hasNext()) {
                break;
            }
            String next2 = it2.next();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(ge.f16503v0, 1);
            jSONObject4.put(ge.f16512y0, e4 != null ? e4.a(next2) : "");
            jSONObject2.put(next2, jSONObject4);
        }
        int size = j4.size();
        int i6 = 0;
        while (i6 < size) {
            C1464f5 c1464f5 = j4.get(i6);
            i6++;
            C1464f5 c1464f52 = c1464f5;
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put(ge.f16503v0, c1464f52.e() ? 2 : i4);
            Map<String, Object> f5 = c1464f52.f();
            if (!f5.isEmpty()) {
                jSONObject5.put(ge.f16476m0, new JSONObject(f5));
            }
            jSONObject5.put(ge.f16512y0, e4 != null ? e4.a(c1464f52.g()) : "");
            jSONObject5.put("ts", p4 ? 1 : 0);
            if (!c1464f52.h().isEmpty()) {
                jSONObject5.put(f17333v, c1464f52.h());
            }
            jSONObject2.put(c1464f52.g(), jSONObject5);
            i4 = 1;
        }
        jSONObject.put(ge.f16500u0, jSONObject2);
        if (iVar.u()) {
            i5 = 1;
            jSONObject.put(ge.f16501u1, 1);
        } else {
            i5 = 1;
        }
        if (iVar.r()) {
            jSONObject.put(ge.f16498t1, i5);
        }
        new bk().b(ContextProvider.getInstance().getApplicationContext());
        JSONObject a4 = new C1436b5(C1591x2.a(ad_unit)).a();
        a(a4, false);
        a4.put(ge.f16506w0, n4);
        a4.put(ge.f16509x0, a().ordinal());
        if (ironSourceSegment2 != null) {
            a4.put(ge.f16459g1, ironSourceSegment2.toJson());
        }
        jSONObject.put(ge.f16491r0, a4);
        if (iSBannerSize2 != null) {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put(ge.f16482o0, iSBannerSize2.getDescription());
            jSONObject6.put(ge.f16488q0, iSBannerSize2.getWidth());
            jSONObject6.put(ge.f16485p0, iSBannerSize2.getHeight());
            jSONObject.put(ge.f16479n0, jSONObject6);
        }
        jSONObject.put(ge.f16464i0, ad_unit.toString());
        if (iVar.b() != null) {
            jSONObject.put("adf", iVar.b());
        }
        if (iVar.d() != null) {
            jSONObject.put("mediationAdUnitId", iVar.d());
        }
        if (iVar.t() != null) {
            jSONObject.put(ge.f16473l0, iVar.t());
        }
        jSONObject.put(ge.f16494s0, !z4 ? 1 : 0);
        Object remove = a4.remove(ge.f16489q1);
        if (remove != null) {
            jSONObject.put(ge.f16489q1, remove);
        }
        if (o4) {
            jSONObject.put(ge.f16483o1, 1);
        }
        return jSONObject;
    }

    public void a(String str, String str2, String str3) {
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new b(str, str2, str3));
    }

    public void a(JSONObject jSONObject, boolean z4) {
        if (jSONObject == null || jSONObject.length() <= 0 || TextUtils.isEmpty(jSONObject.optString(ge.f16465i1)) || !this.f17338a.compareAndSet(false, true)) {
            return;
        }
        br.i().a(new zb(IronSourceConstants.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED, IronSourceUtils.getMediationAdditionalData(z4, true, -1)));
    }
}
