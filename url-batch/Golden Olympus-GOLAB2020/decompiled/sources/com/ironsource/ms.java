package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.cg;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mp;
import com.ironsource.s8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ms {

    /* renamed from: A, reason: collision with root package name */
    protected static final boolean f18076A = false;

    /* renamed from: A0, reason: collision with root package name */
    protected static final String f18077A0 = "sharedManagersThread";

    /* renamed from: A1, reason: collision with root package name */
    protected static final String f18078A1 = "spId";

    /* renamed from: B, reason: collision with root package name */
    protected static final int f18079B = 60;

    /* renamed from: B0, reason: collision with root package name */
    protected static final String f18080B0 = "parallelLoad";

    /* renamed from: B1, reason: collision with root package name */
    protected static final String f18081B1 = "mpis";

    /* renamed from: C, reason: collision with root package name */
    protected static final int f18082C = 10000;

    /* renamed from: C0, reason: collision with root package name */
    protected static final String f18083C0 = "bidderExclusive";

    /* renamed from: C1, reason: collision with root package name */
    protected static final String f18084C1 = "auction";

    /* renamed from: D, reason: collision with root package name */
    protected static final int f18085D = 10000;

    /* renamed from: D0, reason: collision with root package name */
    protected static final String f18086D0 = "adapterTimeOutInSeconds";

    /* renamed from: D1, reason: collision with root package name */
    protected static final String f18087D1 = "auctionData";

    /* renamed from: E, reason: collision with root package name */
    protected static final int f18088E = -1;

    /* renamed from: E0, reason: collision with root package name */
    protected static final String f18089E0 = "atim";

    /* renamed from: E1, reason: collision with root package name */
    protected static final String f18090E1 = "auctioneerURL";

    /* renamed from: F, reason: collision with root package name */
    protected static final int f18091F = 5000;

    /* renamed from: F0, reason: collision with root package name */
    protected static final String f18092F0 = "bannerInterval";

    /* renamed from: F1, reason: collision with root package name */
    protected static final String f18093F1 = "extAuctioneerURL";

    /* renamed from: G, reason: collision with root package name */
    protected static final int f18094G = 3;

    /* renamed from: G0, reason: collision with root package name */
    protected static final String f18095G0 = "isOneFlow";

    /* renamed from: G1, reason: collision with root package name */
    protected static final String f18096G1 = "objectPerWaterfall";

    /* renamed from: H, reason: collision with root package name */
    protected static final int f18097H = 3;

    /* renamed from: H0, reason: collision with root package name */
    protected static final String f18098H0 = "expiredDurationInMinutes";

    /* renamed from: H1, reason: collision with root package name */
    protected static final String f18099H1 = "minTimeBeforeFirstAuction";

    /* renamed from: I, reason: collision with root package name */
    protected static final int f18100I = 3;

    /* renamed from: I0, reason: collision with root package name */
    protected static final String f18101I0 = "server";

    /* renamed from: I1, reason: collision with root package name */
    protected static final String f18102I1 = "timeToWaitBeforeAuction";

    /* renamed from: J, reason: collision with root package name */
    protected static final int f18103J = 0;

    /* renamed from: J0, reason: collision with root package name */
    protected static final String f18104J0 = "publisher";

    /* renamed from: J1, reason: collision with root package name */
    protected static final String f18105J1 = "timeToWaitBeforeLoad";

    /* renamed from: K, reason: collision with root package name */
    protected static final int f18106K = 2;

    /* renamed from: K0, reason: collision with root package name */
    protected static final String f18107K0 = "console";

    /* renamed from: K1, reason: collision with root package name */
    protected static final String f18108K1 = "auctionRetryInterval";

    /* renamed from: L, reason: collision with root package name */
    protected static final int f18109L = 15;

    /* renamed from: L0, reason: collision with root package name */
    protected static final String f18110L0 = "sendUltraEvents";

    /* renamed from: L1, reason: collision with root package name */
    protected static final String f18111L1 = "isLoadWhileShow";

    /* renamed from: M, reason: collision with root package name */
    protected static final long f18112M = 10000;

    /* renamed from: M0, reason: collision with root package name */
    protected static final String f18113M0 = "sendEventsToggle";

    /* renamed from: M1, reason: collision with root package name */
    protected static final String f18114M1 = "auctionTrials";

    /* renamed from: N, reason: collision with root package name */
    protected static final long f18115N = 3000;

    /* renamed from: N0, reason: collision with root package name */
    protected static final String f18116N0 = "eventsCompression";

    /* renamed from: N1, reason: collision with root package name */
    protected static final String f18117N1 = "auctionTimeout";

    /* renamed from: O, reason: collision with root package name */
    protected static final boolean f18118O = false;

    /* renamed from: O0, reason: collision with root package name */
    protected static final String f18119O0 = "eventsCompressionLevel";

    /* renamed from: O1, reason: collision with root package name */
    protected static final String f18120O1 = "auctionSavedHistory";

    /* renamed from: P, reason: collision with root package name */
    protected static final boolean f18121P = false;

    /* renamed from: P0, reason: collision with root package name */
    protected static final String f18122P0 = "serverEventsURL";

    /* renamed from: P1, reason: collision with root package name */
    protected static final String f18123P1 = "disableLoadWhileShowSupportFor";

    /* renamed from: Q, reason: collision with root package name */
    protected static final int f18124Q = 30000;

    /* renamed from: Q0, reason: collision with root package name */
    protected static final String f18125Q0 = "serverEventsType";

    /* renamed from: Q1, reason: collision with root package name */
    protected static final String f18126Q1 = "tokenPerAdapter";

    /* renamed from: R, reason: collision with root package name */
    protected static final int f18127R = -1;

    /* renamed from: R0, reason: collision with root package name */
    protected static final String f18128R0 = "backupThreshold";

    /* renamed from: R1, reason: collision with root package name */
    protected static final String f18129R1 = "timeToDeleteOldWaterfallAfterAuction";

    /* renamed from: S, reason: collision with root package name */
    protected static final int f18130S = 5000;

    /* renamed from: S0, reason: collision with root package name */
    protected static final String f18131S0 = "maxNumberOfEvents";

    /* renamed from: S1, reason: collision with root package name */
    protected static final String f18132S1 = "compressAuctionRequest";

    /* renamed from: T, reason: collision with root package name */
    protected static final int f18133T = 1;

    /* renamed from: T0, reason: collision with root package name */
    protected static final String f18134T0 = "maxEventsPerBatch";

    /* renamed from: T1, reason: collision with root package name */
    protected static final String f18135T1 = "compressAuctionResponse";

    /* renamed from: U, reason: collision with root package name */
    protected static final boolean f18136U = false;

    /* renamed from: U0, reason: collision with root package name */
    protected static final String f18137U0 = "optOut";

    /* renamed from: U1, reason: collision with root package name */
    protected static final String f18138U1 = "encryptionVersion";

    /* renamed from: V, reason: collision with root package name */
    protected static final int f18139V = 15000;

    /* renamed from: V0, reason: collision with root package name */
    protected static final String f18140V0 = "optIn";

    /* renamed from: V1, reason: collision with root package name */
    protected static final String f18141V1 = "shouldSendBannerBURLFromImpression";

    /* renamed from: W, reason: collision with root package name */
    protected static final int f18142W = 15000;

    /* renamed from: W0, reason: collision with root package name */
    protected static final String f18143W0 = "triggerEvents";

    /* renamed from: W1, reason: collision with root package name */
    protected static final String f18144W1 = "impressionTimeout";

    /* renamed from: X, reason: collision with root package name */
    protected static final String f18145X = "providerOrder";

    /* renamed from: X0, reason: collision with root package name */
    protected static final String f18146X0 = "nonConnectivityEvents";

    /* renamed from: X1, reason: collision with root package name */
    protected static final String f18147X1 = "optInKeys";

    /* renamed from: Y, reason: collision with root package name */
    protected static final String f18148Y = "providerSettings";

    /* renamed from: Y0, reason: collision with root package name */
    protected static final String f18149Y0 = "shouldSendPublisherLogsOnUIThread";

    /* renamed from: Y1, reason: collision with root package name */
    protected static final String f18150Y1 = "tokenGenericParams";

    /* renamed from: Z, reason: collision with root package name */
    protected static final String f18151Z = "configurations";

    /* renamed from: Z0, reason: collision with root package name */
    protected static final String f18152Z0 = "pixel";

    /* renamed from: Z1, reason: collision with root package name */
    protected static final String f18153Z1 = "compressToken";

    /* renamed from: a0, reason: collision with root package name */
    protected static final String f18154a0 = "genericParams";

    /* renamed from: a1, reason: collision with root package name */
    protected static final String f18155a1 = "pixelEventsUrl";

    /* renamed from: a2, reason: collision with root package name */
    protected static final String f18156a2 = "compressExternalToken";

    /* renamed from: b0, reason: collision with root package name */
    protected static final String f18157b0 = "adUnits";

    /* renamed from: b1, reason: collision with root package name */
    protected static final String f18158b1 = "pixelEventsEnabled";

    /* renamed from: b2, reason: collision with root package name */
    protected static final String f18159b2 = "instanceType";

    /* renamed from: c0, reason: collision with root package name */
    protected static final String f18160c0 = "providerLoadName";

    /* renamed from: c1, reason: collision with root package name */
    protected static final String f18161c1 = "placements";

    /* renamed from: c2, reason: collision with root package name */
    protected static final String f18162c2 = "maxAdsPerSession";

    /* renamed from: d0, reason: collision with root package name */
    protected static final String f18163d0 = "application";

    /* renamed from: d1, reason: collision with root package name */
    protected static final String f18164d1 = "placementId";

    /* renamed from: d2, reason: collision with root package name */
    protected static final String f18165d2 = "reward";

    /* renamed from: e0, reason: collision with root package name */
    protected static final String f18166e0 = "rewardedVideo";

    /* renamed from: e1, reason: collision with root package name */
    protected static final String f18167e1 = "placementName";

    /* renamed from: e2, reason: collision with root package name */
    protected static final String f18168e2 = "name";

    /* renamed from: f0, reason: collision with root package name */
    protected static final String f18169f0 = "interstitial";

    /* renamed from: f1, reason: collision with root package name */
    protected static final String f18170f1 = "delivery";

    /* renamed from: f2, reason: collision with root package name */
    protected static final String f18171f2 = "amount";

    /* renamed from: g0, reason: collision with root package name */
    protected static final String f18172g0 = "banner";

    /* renamed from: g1, reason: collision with root package name */
    protected static final String f18173g1 = "isDefault";

    /* renamed from: g2, reason: collision with root package name */
    protected static final String f18174g2 = "bannerRefreshRate";

    /* renamed from: h0, reason: collision with root package name */
    protected static final String f18175h0 = "nativeAd";

    /* renamed from: h1, reason: collision with root package name */
    protected static final String f18176h1 = "capping";

    /* renamed from: h2, reason: collision with root package name */
    protected static final String f18177h2 = "protocolVersion";

    /* renamed from: i0, reason: collision with root package name */
    protected static final String f18178i0 = "integration";

    /* renamed from: i1, reason: collision with root package name */
    protected static final String f18179i1 = "pacing";

    /* renamed from: i2, reason: collision with root package name */
    protected static final String f18180i2 = "adFormats";

    /* renamed from: j0, reason: collision with root package name */
    protected static final String f18181j0 = "loggers";

    /* renamed from: j1, reason: collision with root package name */
    protected static final String f18182j1 = "enabled";

    /* renamed from: j2, reason: collision with root package name */
    protected static final String f18183j2 = "adUnits";

    /* renamed from: k0, reason: collision with root package name */
    protected static final String f18184k0 = "segment";

    /* renamed from: k1, reason: collision with root package name */
    protected static final String f18185k1 = "maxImpressions";

    /* renamed from: k2, reason: collision with root package name */
    protected static final String f18186k2 = "rewarded";

    /* renamed from: l, reason: collision with root package name */
    public static final String f18187l = "appKey";

    /* renamed from: l0, reason: collision with root package name */
    protected static final String f18188l0 = "events";

    /* renamed from: l1, reason: collision with root package name */
    protected static final String f18189l1 = "numOfSeconds";

    /* renamed from: m, reason: collision with root package name */
    public static final String f18190m = "userId";

    /* renamed from: m0, reason: collision with root package name */
    protected static final String f18191m0 = "crashReporter";

    /* renamed from: m1, reason: collision with root package name */
    protected static final String f18192m1 = "unit";

    /* renamed from: n, reason: collision with root package name */
    public static final String f18193n = "response";

    /* renamed from: n0, reason: collision with root package name */
    protected static final String f18194n0 = "token";

    /* renamed from: n1, reason: collision with root package name */
    protected static final String f18195n1 = "virtualItemName";

    /* renamed from: o, reason: collision with root package name */
    protected static final String f18196o = "error";

    /* renamed from: o0, reason: collision with root package name */
    protected static final String f18197o0 = "external";

    /* renamed from: o1, reason: collision with root package name */
    protected static final String f18198o1 = "virtualItemCount";

    /* renamed from: p, reason: collision with root package name */
    protected static final int f18199p = 3;

    /* renamed from: p0, reason: collision with root package name */
    protected static final String f18200p0 = "mediationTypes";

    /* renamed from: p1, reason: collision with root package name */
    protected static final String f18201p1 = "uuidEnabled";

    /* renamed from: q, reason: collision with root package name */
    protected static final boolean f18202q = false;

    /* renamed from: q0, reason: collision with root package name */
    protected static final String f18203q0 = "providerDefaultInstance";

    /* renamed from: q1, reason: collision with root package name */
    protected static final String f18204q1 = "abt";

    /* renamed from: r, reason: collision with root package name */
    protected static final boolean f18205r = true;

    /* renamed from: r0, reason: collision with root package name */
    protected static final String f18206r0 = "testSuite";

    /* renamed from: r1, reason: collision with root package name */
    protected static final String f18207r1 = "delayLoadFailure";

    /* renamed from: s, reason: collision with root package name */
    protected static final boolean f18208s = true;

    /* renamed from: s0, reason: collision with root package name */
    protected static final String f18209s0 = "controllerUrl";

    /* renamed from: s1, reason: collision with root package name */
    protected static final String f18210s1 = "keysToInclude";

    /* renamed from: t, reason: collision with root package name */
    protected static final int f18211t = 2;

    /* renamed from: t0, reason: collision with root package name */
    protected static final String f18212t0 = "AdQuality";

    /* renamed from: t1, reason: collision with root package name */
    protected static final String f18213t1 = "reporterURL";

    /* renamed from: u, reason: collision with root package name */
    protected static final int f18214u = 2;

    /* renamed from: u0, reason: collision with root package name */
    protected static final String f18215u0 = "initSDK";

    /* renamed from: u1, reason: collision with root package name */
    protected static final String f18216u1 = "reporterKeyword";

    /* renamed from: v, reason: collision with root package name */
    protected static final int f18217v = 1;

    /* renamed from: v0, reason: collision with root package name */
    protected static final String f18218v0 = "settings";

    /* renamed from: v1, reason: collision with root package name */
    protected static final String f18219v1 = "includeANR";

    /* renamed from: w, reason: collision with root package name */
    protected static final int f18220w = 1;

    /* renamed from: w0, reason: collision with root package name */
    protected static final String f18221w0 = "collectBiddingDataTimeout";

    /* renamed from: w1, reason: collision with root package name */
    protected static final String f18222w1 = "timeout";

    /* renamed from: x, reason: collision with root package name */
    protected static final boolean f18223x = true;

    /* renamed from: x0, reason: collision with root package name */
    protected static final String f18224x0 = "providers";

    /* renamed from: x1, reason: collision with root package name */
    protected static final String f18225x1 = "setIgnoreDebugger";

    /* renamed from: y, reason: collision with root package name */
    protected static final boolean f18226y = false;

    /* renamed from: y0, reason: collision with root package name */
    protected static final String f18227y0 = "parallelInit";

    /* renamed from: y1, reason: collision with root package name */
    protected static final String f18228y1 = "adSourceName";

    /* renamed from: z, reason: collision with root package name */
    protected static final boolean f18229z = false;

    /* renamed from: z0, reason: collision with root package name */
    protected static final String f18230z0 = "waitUntilAllProvidersFinishInit";

    /* renamed from: z1, reason: collision with root package name */
    protected static final String f18231z1 = "providerNetworkKey";

    /* renamed from: a, reason: collision with root package name */
    private bq f18232a;

    /* renamed from: b, reason: collision with root package name */
    private dq f18233b;

    /* renamed from: c, reason: collision with root package name */
    private s8 f18234c;

    /* renamed from: d, reason: collision with root package name */
    private String f18235d;

    /* renamed from: e, reason: collision with root package name */
    private String f18236e;

    /* renamed from: f, reason: collision with root package name */
    private JSONObject f18237f;

    /* renamed from: g, reason: collision with root package name */
    private Context f18238g;

    /* renamed from: h, reason: collision with root package name */
    private a f18239h;

    /* renamed from: i, reason: collision with root package name */
    private cg.a f18240i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18241j;

    /* renamed from: k, reason: collision with root package name */
    private mc f18242k;

    public enum a {
        NOT_SET("0"),
        CACHE("1"),
        SERVER("2");


        /* renamed from: a, reason: collision with root package name */
        private final String f18247a;

        a(String str) {
            this.f18247a = str;
        }

        public String a() {
            return this.f18247a;
        }
    }

    public ms(Context context, String str, String str2, String str3) {
        this.f18239h = a.NOT_SET;
        this.f18241j = false;
        this.f18238g = context;
        this.f18240i = nm.M().m();
        try {
            this.f18237f = TextUtils.isEmpty(str3) ? new JSONObject() : new JSONObject(str3);
            this.f18241j = n();
            s();
            q();
            r();
            this.f18235d = TextUtils.isEmpty(str) ? "" : str;
            this.f18236e = TextUtils.isEmpty(str2) ? "" : str2;
            b(this.f18237f);
        } catch (JSONException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            a();
        }
    }

    private int a(JSONObject jSONObject, JSONObject jSONObject2, String str, int i4) {
        int i5 = 0;
        if (jSONObject.has(str)) {
            i5 = jSONObject.optInt(str, 0);
        } else if (jSONObject2.has(str)) {
            i5 = jSONObject2.optInt(str, 0);
        }
        return i5 == 0 ? i4 : i5;
    }

    @NotNull
    public static ev b(@Nullable ms msVar) {
        return (msVar == null || !msVar.p()) ? ev.a() : msVar.c().b().j();
    }

    private C1467g1 c(JSONObject jSONObject) {
        C1467g1 c1467g1 = new C1467g1();
        JSONObject c4 = c(jSONObject, "AdQuality");
        if (c4 != null) {
            c1467g1.a(c4.optBoolean(f18215u0));
        }
        return c1467g1;
    }

    private Context d() {
        return this.f18238g;
    }

    private dn f(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("placementId", -1);
        String optString = jSONObject.optString("placementName", "");
        boolean optBoolean = jSONObject.optBoolean(f18173g1, false);
        mp a4 = a(jSONObject);
        if (optInt < 0 || TextUtils.isEmpty(optString)) {
            return null;
        }
        dn dnVar = new dn(optInt, optString, optBoolean, a4);
        if (a4 != null) {
            this.f18240i.c(this.f18238g, dnVar, IronSource.AD_UNIT.NATIVE_AD);
        }
        return dnVar;
    }

    private Placement g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("placementId", -1);
        String optString = jSONObject.optString("placementName", "");
        boolean optBoolean = jSONObject.optBoolean(f18173g1, false);
        String optString2 = jSONObject.optString("virtualItemName", "");
        int optInt2 = jSONObject.optInt("virtualItemCount", -1);
        mp a4 = a(jSONObject);
        if (optInt < 0 || TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || optInt2 <= 0) {
            return null;
        }
        Placement placement = new Placement(optInt, optString, optBoolean, optString2, optInt2, a4);
        if (a4 != null) {
            this.f18240i.c(this.f18238g, placement, IronSource.AD_UNIT.REWARDED_VIDEO);
        }
        return placement;
    }

    private String l() {
        return this.f18241j ? "rewarded" : "rewardedVideo";
    }

    private boolean m() {
        JSONObject c4;
        JSONArray optJSONArray;
        JSONObject c5 = c(this.f18237f, "providerOrder");
        JSONArray names = c5.names();
        if (names == null) {
            return true;
        }
        JSONObject c6 = c(c(this.f18237f, "configurations"), b());
        for (int i4 = 0; i4 < names.length(); i4++) {
            String optString = names.optString(i4);
            JSONArray optJSONArray2 = c5.optJSONArray(optString);
            if (optJSONArray2 != null && optJSONArray2.length() != 0 && (c4 = c(c6, optString)) != null && ((optJSONArray = c4.optJSONArray("placements")) == null || optJSONArray.length() == 0)) {
                return false;
            }
        }
        return true;
    }

    private boolean n() {
        int i4;
        try {
            i4 = this.f18237f.optInt(f18177h2, 0);
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            i4 = 0;
        }
        return i4 == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0501 A[Catch: Exception -> 0x0081, TryCatch #0 {Exception -> 0x0081, blocks: (B:3:0x0004, B:5:0x006f, B:7:0x008a, B:9:0x0096, B:13:0x00db, B:15:0x0171, B:16:0x017e, B:18:0x0184, B:22:0x0199, B:24:0x019f, B:25:0x01aa, B:27:0x01b0, B:30:0x01c0, B:32:0x01c8, B:33:0x01d1, B:35:0x01d7, B:38:0x01e5, B:40:0x01ed, B:41:0x01f4, B:43:0x01fa, B:46:0x0208, B:48:0x0213, B:51:0x02be, B:53:0x02c4, B:56:0x02e0, B:59:0x02ea, B:61:0x02f0, B:63:0x02fc, B:65:0x02ff, B:70:0x0317, B:72:0x03a6, B:73:0x03b3, B:75:0x03b9, B:79:0x03ce, B:81:0x03d4, B:82:0x03df, B:84:0x03e5, B:87:0x03f5, B:89:0x03fd, B:90:0x0406, B:92:0x040c, B:95:0x041a, B:97:0x0422, B:98:0x0429, B:100:0x042f, B:103:0x043d, B:105:0x0448, B:107:0x04cb, B:110:0x04d5, B:112:0x04db, B:114:0x04e5, B:116:0x04e8, B:121:0x0501, B:123:0x05b1, B:124:0x05bc, B:126:0x05c2, B:130:0x05d7, B:132:0x05dd, B:133:0x05e6, B:135:0x05ec, B:138:0x05fa, B:140:0x0602, B:141:0x060b, B:143:0x0611, B:146:0x061f, B:148:0x0627, B:149:0x062e, B:151:0x0634, B:154:0x0642, B:156:0x064d, B:158:0x0655, B:160:0x06f0, B:163:0x0700, B:165:0x0706, B:167:0x0710, B:169:0x0713, B:174:0x0737, B:176:0x07bd, B:177:0x07c4, B:179:0x07ca, B:183:0x07db, B:185:0x07e1, B:186:0x07e8, B:188:0x07ee, B:191:0x07fc, B:193:0x0804, B:194:0x080b, B:196:0x0811, B:199:0x081f, B:201:0x0827, B:202:0x082e, B:204:0x0834, B:207:0x0842, B:209:0x084d, B:211:0x0859, B:213:0x08cb, B:216:0x08db, B:218:0x08e1, B:220:0x08eb, B:222:0x08ee, B:225:0x0900, B:227:0x0907, B:230:0x0914, B:232:0x091a, B:234:0x0924, B:236:0x092c, B:237:0x092f, B:238:0x093c, B:240:0x0945, B:241:0x095d, B:243:0x0962, B:244:0x0980, B:246:0x09a8, B:249:0x09ee, B:251:0x09f4, B:254:0x0a00, B:255:0x0a20, B:258:0x0a2c, B:260:0x0a38, B:262:0x0a45, B:263:0x0a49, B:264:0x0a4e, B:266:0x0a57, B:267:0x0a60, B:269:0x0abb, B:271:0x0ac1, B:273:0x0ad8, B:278:0x0a27, B:282:0x08bb, B:283:0x08c1, B:289:0x06dc, B:290:0x06e6, B:296:0x04ba, B:302:0x02d1), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00db A[Catch: Exception -> 0x0081, TRY_ENTER, TryCatch #0 {Exception -> 0x0081, blocks: (B:3:0x0004, B:5:0x006f, B:7:0x008a, B:9:0x0096, B:13:0x00db, B:15:0x0171, B:16:0x017e, B:18:0x0184, B:22:0x0199, B:24:0x019f, B:25:0x01aa, B:27:0x01b0, B:30:0x01c0, B:32:0x01c8, B:33:0x01d1, B:35:0x01d7, B:38:0x01e5, B:40:0x01ed, B:41:0x01f4, B:43:0x01fa, B:46:0x0208, B:48:0x0213, B:51:0x02be, B:53:0x02c4, B:56:0x02e0, B:59:0x02ea, B:61:0x02f0, B:63:0x02fc, B:65:0x02ff, B:70:0x0317, B:72:0x03a6, B:73:0x03b3, B:75:0x03b9, B:79:0x03ce, B:81:0x03d4, B:82:0x03df, B:84:0x03e5, B:87:0x03f5, B:89:0x03fd, B:90:0x0406, B:92:0x040c, B:95:0x041a, B:97:0x0422, B:98:0x0429, B:100:0x042f, B:103:0x043d, B:105:0x0448, B:107:0x04cb, B:110:0x04d5, B:112:0x04db, B:114:0x04e5, B:116:0x04e8, B:121:0x0501, B:123:0x05b1, B:124:0x05bc, B:126:0x05c2, B:130:0x05d7, B:132:0x05dd, B:133:0x05e6, B:135:0x05ec, B:138:0x05fa, B:140:0x0602, B:141:0x060b, B:143:0x0611, B:146:0x061f, B:148:0x0627, B:149:0x062e, B:151:0x0634, B:154:0x0642, B:156:0x064d, B:158:0x0655, B:160:0x06f0, B:163:0x0700, B:165:0x0706, B:167:0x0710, B:169:0x0713, B:174:0x0737, B:176:0x07bd, B:177:0x07c4, B:179:0x07ca, B:183:0x07db, B:185:0x07e1, B:186:0x07e8, B:188:0x07ee, B:191:0x07fc, B:193:0x0804, B:194:0x080b, B:196:0x0811, B:199:0x081f, B:201:0x0827, B:202:0x082e, B:204:0x0834, B:207:0x0842, B:209:0x084d, B:211:0x0859, B:213:0x08cb, B:216:0x08db, B:218:0x08e1, B:220:0x08eb, B:222:0x08ee, B:225:0x0900, B:227:0x0907, B:230:0x0914, B:232:0x091a, B:234:0x0924, B:236:0x092c, B:237:0x092f, B:238:0x093c, B:240:0x0945, B:241:0x095d, B:243:0x0962, B:244:0x0980, B:246:0x09a8, B:249:0x09ee, B:251:0x09f4, B:254:0x0a00, B:255:0x0a20, B:258:0x0a2c, B:260:0x0a38, B:262:0x0a45, B:263:0x0a49, B:264:0x0a4e, B:266:0x0a57, B:267:0x0a60, B:269:0x0abb, B:271:0x0ac1, B:273:0x0ad8, B:278:0x0a27, B:282:0x08bb, B:283:0x08c1, B:289:0x06dc, B:290:0x06e6, B:296:0x04ba, B:302:0x02d1), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0737 A[Catch: Exception -> 0x0081, TryCatch #0 {Exception -> 0x0081, blocks: (B:3:0x0004, B:5:0x006f, B:7:0x008a, B:9:0x0096, B:13:0x00db, B:15:0x0171, B:16:0x017e, B:18:0x0184, B:22:0x0199, B:24:0x019f, B:25:0x01aa, B:27:0x01b0, B:30:0x01c0, B:32:0x01c8, B:33:0x01d1, B:35:0x01d7, B:38:0x01e5, B:40:0x01ed, B:41:0x01f4, B:43:0x01fa, B:46:0x0208, B:48:0x0213, B:51:0x02be, B:53:0x02c4, B:56:0x02e0, B:59:0x02ea, B:61:0x02f0, B:63:0x02fc, B:65:0x02ff, B:70:0x0317, B:72:0x03a6, B:73:0x03b3, B:75:0x03b9, B:79:0x03ce, B:81:0x03d4, B:82:0x03df, B:84:0x03e5, B:87:0x03f5, B:89:0x03fd, B:90:0x0406, B:92:0x040c, B:95:0x041a, B:97:0x0422, B:98:0x0429, B:100:0x042f, B:103:0x043d, B:105:0x0448, B:107:0x04cb, B:110:0x04d5, B:112:0x04db, B:114:0x04e5, B:116:0x04e8, B:121:0x0501, B:123:0x05b1, B:124:0x05bc, B:126:0x05c2, B:130:0x05d7, B:132:0x05dd, B:133:0x05e6, B:135:0x05ec, B:138:0x05fa, B:140:0x0602, B:141:0x060b, B:143:0x0611, B:146:0x061f, B:148:0x0627, B:149:0x062e, B:151:0x0634, B:154:0x0642, B:156:0x064d, B:158:0x0655, B:160:0x06f0, B:163:0x0700, B:165:0x0706, B:167:0x0710, B:169:0x0713, B:174:0x0737, B:176:0x07bd, B:177:0x07c4, B:179:0x07ca, B:183:0x07db, B:185:0x07e1, B:186:0x07e8, B:188:0x07ee, B:191:0x07fc, B:193:0x0804, B:194:0x080b, B:196:0x0811, B:199:0x081f, B:201:0x0827, B:202:0x082e, B:204:0x0834, B:207:0x0842, B:209:0x084d, B:211:0x0859, B:213:0x08cb, B:216:0x08db, B:218:0x08e1, B:220:0x08eb, B:222:0x08ee, B:225:0x0900, B:227:0x0907, B:230:0x0914, B:232:0x091a, B:234:0x0924, B:236:0x092c, B:237:0x092f, B:238:0x093c, B:240:0x0945, B:241:0x095d, B:243:0x0962, B:244:0x0980, B:246:0x09a8, B:249:0x09ee, B:251:0x09f4, B:254:0x0a00, B:255:0x0a20, B:258:0x0a2c, B:260:0x0a38, B:262:0x0a45, B:263:0x0a49, B:264:0x0a4e, B:266:0x0a57, B:267:0x0a60, B:269:0x0abb, B:271:0x0ac1, B:273:0x0ad8, B:278:0x0a27, B:282:0x08bb, B:283:0x08c1, B:289:0x06dc, B:290:0x06e6, B:296:0x04ba, B:302:0x02d1), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0907 A[Catch: Exception -> 0x0081, TryCatch #0 {Exception -> 0x0081, blocks: (B:3:0x0004, B:5:0x006f, B:7:0x008a, B:9:0x0096, B:13:0x00db, B:15:0x0171, B:16:0x017e, B:18:0x0184, B:22:0x0199, B:24:0x019f, B:25:0x01aa, B:27:0x01b0, B:30:0x01c0, B:32:0x01c8, B:33:0x01d1, B:35:0x01d7, B:38:0x01e5, B:40:0x01ed, B:41:0x01f4, B:43:0x01fa, B:46:0x0208, B:48:0x0213, B:51:0x02be, B:53:0x02c4, B:56:0x02e0, B:59:0x02ea, B:61:0x02f0, B:63:0x02fc, B:65:0x02ff, B:70:0x0317, B:72:0x03a6, B:73:0x03b3, B:75:0x03b9, B:79:0x03ce, B:81:0x03d4, B:82:0x03df, B:84:0x03e5, B:87:0x03f5, B:89:0x03fd, B:90:0x0406, B:92:0x040c, B:95:0x041a, B:97:0x0422, B:98:0x0429, B:100:0x042f, B:103:0x043d, B:105:0x0448, B:107:0x04cb, B:110:0x04d5, B:112:0x04db, B:114:0x04e5, B:116:0x04e8, B:121:0x0501, B:123:0x05b1, B:124:0x05bc, B:126:0x05c2, B:130:0x05d7, B:132:0x05dd, B:133:0x05e6, B:135:0x05ec, B:138:0x05fa, B:140:0x0602, B:141:0x060b, B:143:0x0611, B:146:0x061f, B:148:0x0627, B:149:0x062e, B:151:0x0634, B:154:0x0642, B:156:0x064d, B:158:0x0655, B:160:0x06f0, B:163:0x0700, B:165:0x0706, B:167:0x0710, B:169:0x0713, B:174:0x0737, B:176:0x07bd, B:177:0x07c4, B:179:0x07ca, B:183:0x07db, B:185:0x07e1, B:186:0x07e8, B:188:0x07ee, B:191:0x07fc, B:193:0x0804, B:194:0x080b, B:196:0x0811, B:199:0x081f, B:201:0x0827, B:202:0x082e, B:204:0x0834, B:207:0x0842, B:209:0x084d, B:211:0x0859, B:213:0x08cb, B:216:0x08db, B:218:0x08e1, B:220:0x08eb, B:222:0x08ee, B:225:0x0900, B:227:0x0907, B:230:0x0914, B:232:0x091a, B:234:0x0924, B:236:0x092c, B:237:0x092f, B:238:0x093c, B:240:0x0945, B:241:0x095d, B:243:0x0962, B:244:0x0980, B:246:0x09a8, B:249:0x09ee, B:251:0x09f4, B:254:0x0a00, B:255:0x0a20, B:258:0x0a2c, B:260:0x0a38, B:262:0x0a45, B:263:0x0a49, B:264:0x0a4e, B:266:0x0a57, B:267:0x0a60, B:269:0x0abb, B:271:0x0ac1, B:273:0x0ad8, B:278:0x0a27, B:282:0x08bb, B:283:0x08c1, B:289:0x06dc, B:290:0x06e6, B:296:0x04ba, B:302:0x02d1), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0945 A[Catch: Exception -> 0x0081, TryCatch #0 {Exception -> 0x0081, blocks: (B:3:0x0004, B:5:0x006f, B:7:0x008a, B:9:0x0096, B:13:0x00db, B:15:0x0171, B:16:0x017e, B:18:0x0184, B:22:0x0199, B:24:0x019f, B:25:0x01aa, B:27:0x01b0, B:30:0x01c0, B:32:0x01c8, B:33:0x01d1, B:35:0x01d7, B:38:0x01e5, B:40:0x01ed, B:41:0x01f4, B:43:0x01fa, B:46:0x0208, B:48:0x0213, B:51:0x02be, B:53:0x02c4, B:56:0x02e0, B:59:0x02ea, B:61:0x02f0, B:63:0x02fc, B:65:0x02ff, B:70:0x0317, B:72:0x03a6, B:73:0x03b3, B:75:0x03b9, B:79:0x03ce, B:81:0x03d4, B:82:0x03df, B:84:0x03e5, B:87:0x03f5, B:89:0x03fd, B:90:0x0406, B:92:0x040c, B:95:0x041a, B:97:0x0422, B:98:0x0429, B:100:0x042f, B:103:0x043d, B:105:0x0448, B:107:0x04cb, B:110:0x04d5, B:112:0x04db, B:114:0x04e5, B:116:0x04e8, B:121:0x0501, B:123:0x05b1, B:124:0x05bc, B:126:0x05c2, B:130:0x05d7, B:132:0x05dd, B:133:0x05e6, B:135:0x05ec, B:138:0x05fa, B:140:0x0602, B:141:0x060b, B:143:0x0611, B:146:0x061f, B:148:0x0627, B:149:0x062e, B:151:0x0634, B:154:0x0642, B:156:0x064d, B:158:0x0655, B:160:0x06f0, B:163:0x0700, B:165:0x0706, B:167:0x0710, B:169:0x0713, B:174:0x0737, B:176:0x07bd, B:177:0x07c4, B:179:0x07ca, B:183:0x07db, B:185:0x07e1, B:186:0x07e8, B:188:0x07ee, B:191:0x07fc, B:193:0x0804, B:194:0x080b, B:196:0x0811, B:199:0x081f, B:201:0x0827, B:202:0x082e, B:204:0x0834, B:207:0x0842, B:209:0x084d, B:211:0x0859, B:213:0x08cb, B:216:0x08db, B:218:0x08e1, B:220:0x08eb, B:222:0x08ee, B:225:0x0900, B:227:0x0907, B:230:0x0914, B:232:0x091a, B:234:0x0924, B:236:0x092c, B:237:0x092f, B:238:0x093c, B:240:0x0945, B:241:0x095d, B:243:0x0962, B:244:0x0980, B:246:0x09a8, B:249:0x09ee, B:251:0x09f4, B:254:0x0a00, B:255:0x0a20, B:258:0x0a2c, B:260:0x0a38, B:262:0x0a45, B:263:0x0a49, B:264:0x0a4e, B:266:0x0a57, B:267:0x0a60, B:269:0x0abb, B:271:0x0ac1, B:273:0x0ad8, B:278:0x0a27, B:282:0x08bb, B:283:0x08c1, B:289:0x06dc, B:290:0x06e6, B:296:0x04ba, B:302:0x02d1), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0962 A[Catch: Exception -> 0x0081, TryCatch #0 {Exception -> 0x0081, blocks: (B:3:0x0004, B:5:0x006f, B:7:0x008a, B:9:0x0096, B:13:0x00db, B:15:0x0171, B:16:0x017e, B:18:0x0184, B:22:0x0199, B:24:0x019f, B:25:0x01aa, B:27:0x01b0, B:30:0x01c0, B:32:0x01c8, B:33:0x01d1, B:35:0x01d7, B:38:0x01e5, B:40:0x01ed, B:41:0x01f4, B:43:0x01fa, B:46:0x0208, B:48:0x0213, B:51:0x02be, B:53:0x02c4, B:56:0x02e0, B:59:0x02ea, B:61:0x02f0, B:63:0x02fc, B:65:0x02ff, B:70:0x0317, B:72:0x03a6, B:73:0x03b3, B:75:0x03b9, B:79:0x03ce, B:81:0x03d4, B:82:0x03df, B:84:0x03e5, B:87:0x03f5, B:89:0x03fd, B:90:0x0406, B:92:0x040c, B:95:0x041a, B:97:0x0422, B:98:0x0429, B:100:0x042f, B:103:0x043d, B:105:0x0448, B:107:0x04cb, B:110:0x04d5, B:112:0x04db, B:114:0x04e5, B:116:0x04e8, B:121:0x0501, B:123:0x05b1, B:124:0x05bc, B:126:0x05c2, B:130:0x05d7, B:132:0x05dd, B:133:0x05e6, B:135:0x05ec, B:138:0x05fa, B:140:0x0602, B:141:0x060b, B:143:0x0611, B:146:0x061f, B:148:0x0627, B:149:0x062e, B:151:0x0634, B:154:0x0642, B:156:0x064d, B:158:0x0655, B:160:0x06f0, B:163:0x0700, B:165:0x0706, B:167:0x0710, B:169:0x0713, B:174:0x0737, B:176:0x07bd, B:177:0x07c4, B:179:0x07ca, B:183:0x07db, B:185:0x07e1, B:186:0x07e8, B:188:0x07ee, B:191:0x07fc, B:193:0x0804, B:194:0x080b, B:196:0x0811, B:199:0x081f, B:201:0x0827, B:202:0x082e, B:204:0x0834, B:207:0x0842, B:209:0x084d, B:211:0x0859, B:213:0x08cb, B:216:0x08db, B:218:0x08e1, B:220:0x08eb, B:222:0x08ee, B:225:0x0900, B:227:0x0907, B:230:0x0914, B:232:0x091a, B:234:0x0924, B:236:0x092c, B:237:0x092f, B:238:0x093c, B:240:0x0945, B:241:0x095d, B:243:0x0962, B:244:0x0980, B:246:0x09a8, B:249:0x09ee, B:251:0x09f4, B:254:0x0a00, B:255:0x0a20, B:258:0x0a2c, B:260:0x0a38, B:262:0x0a45, B:263:0x0a49, B:264:0x0a4e, B:266:0x0a57, B:267:0x0a60, B:269:0x0abb, B:271:0x0ac1, B:273:0x0ad8, B:278:0x0a27, B:282:0x08bb, B:283:0x08c1, B:289:0x06dc, B:290:0x06e6, B:296:0x04ba, B:302:0x02d1), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x09a8 A[Catch: Exception -> 0x0081, TryCatch #0 {Exception -> 0x0081, blocks: (B:3:0x0004, B:5:0x006f, B:7:0x008a, B:9:0x0096, B:13:0x00db, B:15:0x0171, B:16:0x017e, B:18:0x0184, B:22:0x0199, B:24:0x019f, B:25:0x01aa, B:27:0x01b0, B:30:0x01c0, B:32:0x01c8, B:33:0x01d1, B:35:0x01d7, B:38:0x01e5, B:40:0x01ed, B:41:0x01f4, B:43:0x01fa, B:46:0x0208, B:48:0x0213, B:51:0x02be, B:53:0x02c4, B:56:0x02e0, B:59:0x02ea, B:61:0x02f0, B:63:0x02fc, B:65:0x02ff, B:70:0x0317, B:72:0x03a6, B:73:0x03b3, B:75:0x03b9, B:79:0x03ce, B:81:0x03d4, B:82:0x03df, B:84:0x03e5, B:87:0x03f5, B:89:0x03fd, B:90:0x0406, B:92:0x040c, B:95:0x041a, B:97:0x0422, B:98:0x0429, B:100:0x042f, B:103:0x043d, B:105:0x0448, B:107:0x04cb, B:110:0x04d5, B:112:0x04db, B:114:0x04e5, B:116:0x04e8, B:121:0x0501, B:123:0x05b1, B:124:0x05bc, B:126:0x05c2, B:130:0x05d7, B:132:0x05dd, B:133:0x05e6, B:135:0x05ec, B:138:0x05fa, B:140:0x0602, B:141:0x060b, B:143:0x0611, B:146:0x061f, B:148:0x0627, B:149:0x062e, B:151:0x0634, B:154:0x0642, B:156:0x064d, B:158:0x0655, B:160:0x06f0, B:163:0x0700, B:165:0x0706, B:167:0x0710, B:169:0x0713, B:174:0x0737, B:176:0x07bd, B:177:0x07c4, B:179:0x07ca, B:183:0x07db, B:185:0x07e1, B:186:0x07e8, B:188:0x07ee, B:191:0x07fc, B:193:0x0804, B:194:0x080b, B:196:0x0811, B:199:0x081f, B:201:0x0827, B:202:0x082e, B:204:0x0834, B:207:0x0842, B:209:0x084d, B:211:0x0859, B:213:0x08cb, B:216:0x08db, B:218:0x08e1, B:220:0x08eb, B:222:0x08ee, B:225:0x0900, B:227:0x0907, B:230:0x0914, B:232:0x091a, B:234:0x0924, B:236:0x092c, B:237:0x092f, B:238:0x093c, B:240:0x0945, B:241:0x095d, B:243:0x0962, B:244:0x0980, B:246:0x09a8, B:249:0x09ee, B:251:0x09f4, B:254:0x0a00, B:255:0x0a20, B:258:0x0a2c, B:260:0x0a38, B:262:0x0a45, B:263:0x0a49, B:264:0x0a4e, B:266:0x0a57, B:267:0x0a60, B:269:0x0abb, B:271:0x0ac1, B:273:0x0ad8, B:278:0x0a27, B:282:0x08bb, B:283:0x08c1, B:289:0x06dc, B:290:0x06e6, B:296:0x04ba, B:302:0x02d1), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0a00 A[Catch: Exception -> 0x0081, TryCatch #0 {Exception -> 0x0081, blocks: (B:3:0x0004, B:5:0x006f, B:7:0x008a, B:9:0x0096, B:13:0x00db, B:15:0x0171, B:16:0x017e, B:18:0x0184, B:22:0x0199, B:24:0x019f, B:25:0x01aa, B:27:0x01b0, B:30:0x01c0, B:32:0x01c8, B:33:0x01d1, B:35:0x01d7, B:38:0x01e5, B:40:0x01ed, B:41:0x01f4, B:43:0x01fa, B:46:0x0208, B:48:0x0213, B:51:0x02be, B:53:0x02c4, B:56:0x02e0, B:59:0x02ea, B:61:0x02f0, B:63:0x02fc, B:65:0x02ff, B:70:0x0317, B:72:0x03a6, B:73:0x03b3, B:75:0x03b9, B:79:0x03ce, B:81:0x03d4, B:82:0x03df, B:84:0x03e5, B:87:0x03f5, B:89:0x03fd, B:90:0x0406, B:92:0x040c, B:95:0x041a, B:97:0x0422, B:98:0x0429, B:100:0x042f, B:103:0x043d, B:105:0x0448, B:107:0x04cb, B:110:0x04d5, B:112:0x04db, B:114:0x04e5, B:116:0x04e8, B:121:0x0501, B:123:0x05b1, B:124:0x05bc, B:126:0x05c2, B:130:0x05d7, B:132:0x05dd, B:133:0x05e6, B:135:0x05ec, B:138:0x05fa, B:140:0x0602, B:141:0x060b, B:143:0x0611, B:146:0x061f, B:148:0x0627, B:149:0x062e, B:151:0x0634, B:154:0x0642, B:156:0x064d, B:158:0x0655, B:160:0x06f0, B:163:0x0700, B:165:0x0706, B:167:0x0710, B:169:0x0713, B:174:0x0737, B:176:0x07bd, B:177:0x07c4, B:179:0x07ca, B:183:0x07db, B:185:0x07e1, B:186:0x07e8, B:188:0x07ee, B:191:0x07fc, B:193:0x0804, B:194:0x080b, B:196:0x0811, B:199:0x081f, B:201:0x0827, B:202:0x082e, B:204:0x0834, B:207:0x0842, B:209:0x084d, B:211:0x0859, B:213:0x08cb, B:216:0x08db, B:218:0x08e1, B:220:0x08eb, B:222:0x08ee, B:225:0x0900, B:227:0x0907, B:230:0x0914, B:232:0x091a, B:234:0x0924, B:236:0x092c, B:237:0x092f, B:238:0x093c, B:240:0x0945, B:241:0x095d, B:243:0x0962, B:244:0x0980, B:246:0x09a8, B:249:0x09ee, B:251:0x09f4, B:254:0x0a00, B:255:0x0a20, B:258:0x0a2c, B:260:0x0a38, B:262:0x0a45, B:263:0x0a49, B:264:0x0a4e, B:266:0x0a57, B:267:0x0a60, B:269:0x0abb, B:271:0x0ac1, B:273:0x0ad8, B:278:0x0a27, B:282:0x08bb, B:283:0x08c1, B:289:0x06dc, B:290:0x06e6, B:296:0x04ba, B:302:0x02d1), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0a24  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0a38 A[Catch: Exception -> 0x0081, TryCatch #0 {Exception -> 0x0081, blocks: (B:3:0x0004, B:5:0x006f, B:7:0x008a, B:9:0x0096, B:13:0x00db, B:15:0x0171, B:16:0x017e, B:18:0x0184, B:22:0x0199, B:24:0x019f, B:25:0x01aa, B:27:0x01b0, B:30:0x01c0, B:32:0x01c8, B:33:0x01d1, B:35:0x01d7, B:38:0x01e5, B:40:0x01ed, B:41:0x01f4, B:43:0x01fa, B:46:0x0208, B:48:0x0213, B:51:0x02be, B:53:0x02c4, B:56:0x02e0, B:59:0x02ea, B:61:0x02f0, B:63:0x02fc, B:65:0x02ff, B:70:0x0317, B:72:0x03a6, B:73:0x03b3, B:75:0x03b9, B:79:0x03ce, B:81:0x03d4, B:82:0x03df, B:84:0x03e5, B:87:0x03f5, B:89:0x03fd, B:90:0x0406, B:92:0x040c, B:95:0x041a, B:97:0x0422, B:98:0x0429, B:100:0x042f, B:103:0x043d, B:105:0x0448, B:107:0x04cb, B:110:0x04d5, B:112:0x04db, B:114:0x04e5, B:116:0x04e8, B:121:0x0501, B:123:0x05b1, B:124:0x05bc, B:126:0x05c2, B:130:0x05d7, B:132:0x05dd, B:133:0x05e6, B:135:0x05ec, B:138:0x05fa, B:140:0x0602, B:141:0x060b, B:143:0x0611, B:146:0x061f, B:148:0x0627, B:149:0x062e, B:151:0x0634, B:154:0x0642, B:156:0x064d, B:158:0x0655, B:160:0x06f0, B:163:0x0700, B:165:0x0706, B:167:0x0710, B:169:0x0713, B:174:0x0737, B:176:0x07bd, B:177:0x07c4, B:179:0x07ca, B:183:0x07db, B:185:0x07e1, B:186:0x07e8, B:188:0x07ee, B:191:0x07fc, B:193:0x0804, B:194:0x080b, B:196:0x0811, B:199:0x081f, B:201:0x0827, B:202:0x082e, B:204:0x0834, B:207:0x0842, B:209:0x084d, B:211:0x0859, B:213:0x08cb, B:216:0x08db, B:218:0x08e1, B:220:0x08eb, B:222:0x08ee, B:225:0x0900, B:227:0x0907, B:230:0x0914, B:232:0x091a, B:234:0x0924, B:236:0x092c, B:237:0x092f, B:238:0x093c, B:240:0x0945, B:241:0x095d, B:243:0x0962, B:244:0x0980, B:246:0x09a8, B:249:0x09ee, B:251:0x09f4, B:254:0x0a00, B:255:0x0a20, B:258:0x0a2c, B:260:0x0a38, B:262:0x0a45, B:263:0x0a49, B:264:0x0a4e, B:266:0x0a57, B:267:0x0a60, B:269:0x0abb, B:271:0x0ac1, B:273:0x0ad8, B:278:0x0a27, B:282:0x08bb, B:283:0x08c1, B:289:0x06dc, B:290:0x06e6, B:296:0x04ba, B:302:0x02d1), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0a57 A[Catch: Exception -> 0x0081, TryCatch #0 {Exception -> 0x0081, blocks: (B:3:0x0004, B:5:0x006f, B:7:0x008a, B:9:0x0096, B:13:0x00db, B:15:0x0171, B:16:0x017e, B:18:0x0184, B:22:0x0199, B:24:0x019f, B:25:0x01aa, B:27:0x01b0, B:30:0x01c0, B:32:0x01c8, B:33:0x01d1, B:35:0x01d7, B:38:0x01e5, B:40:0x01ed, B:41:0x01f4, B:43:0x01fa, B:46:0x0208, B:48:0x0213, B:51:0x02be, B:53:0x02c4, B:56:0x02e0, B:59:0x02ea, B:61:0x02f0, B:63:0x02fc, B:65:0x02ff, B:70:0x0317, B:72:0x03a6, B:73:0x03b3, B:75:0x03b9, B:79:0x03ce, B:81:0x03d4, B:82:0x03df, B:84:0x03e5, B:87:0x03f5, B:89:0x03fd, B:90:0x0406, B:92:0x040c, B:95:0x041a, B:97:0x0422, B:98:0x0429, B:100:0x042f, B:103:0x043d, B:105:0x0448, B:107:0x04cb, B:110:0x04d5, B:112:0x04db, B:114:0x04e5, B:116:0x04e8, B:121:0x0501, B:123:0x05b1, B:124:0x05bc, B:126:0x05c2, B:130:0x05d7, B:132:0x05dd, B:133:0x05e6, B:135:0x05ec, B:138:0x05fa, B:140:0x0602, B:141:0x060b, B:143:0x0611, B:146:0x061f, B:148:0x0627, B:149:0x062e, B:151:0x0634, B:154:0x0642, B:156:0x064d, B:158:0x0655, B:160:0x06f0, B:163:0x0700, B:165:0x0706, B:167:0x0710, B:169:0x0713, B:174:0x0737, B:176:0x07bd, B:177:0x07c4, B:179:0x07ca, B:183:0x07db, B:185:0x07e1, B:186:0x07e8, B:188:0x07ee, B:191:0x07fc, B:193:0x0804, B:194:0x080b, B:196:0x0811, B:199:0x081f, B:201:0x0827, B:202:0x082e, B:204:0x0834, B:207:0x0842, B:209:0x084d, B:211:0x0859, B:213:0x08cb, B:216:0x08db, B:218:0x08e1, B:220:0x08eb, B:222:0x08ee, B:225:0x0900, B:227:0x0907, B:230:0x0914, B:232:0x091a, B:234:0x0924, B:236:0x092c, B:237:0x092f, B:238:0x093c, B:240:0x0945, B:241:0x095d, B:243:0x0962, B:244:0x0980, B:246:0x09a8, B:249:0x09ee, B:251:0x09f4, B:254:0x0a00, B:255:0x0a20, B:258:0x0a2c, B:260:0x0a38, B:262:0x0a45, B:263:0x0a49, B:264:0x0a4e, B:266:0x0a57, B:267:0x0a60, B:269:0x0abb, B:271:0x0ac1, B:273:0x0ad8, B:278:0x0a27, B:282:0x08bb, B:283:0x08c1, B:289:0x06dc, B:290:0x06e6, B:296:0x04ba, B:302:0x02d1), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0ad8 A[Catch: Exception -> 0x0081, TRY_LEAVE, TryCatch #0 {Exception -> 0x0081, blocks: (B:3:0x0004, B:5:0x006f, B:7:0x008a, B:9:0x0096, B:13:0x00db, B:15:0x0171, B:16:0x017e, B:18:0x0184, B:22:0x0199, B:24:0x019f, B:25:0x01aa, B:27:0x01b0, B:30:0x01c0, B:32:0x01c8, B:33:0x01d1, B:35:0x01d7, B:38:0x01e5, B:40:0x01ed, B:41:0x01f4, B:43:0x01fa, B:46:0x0208, B:48:0x0213, B:51:0x02be, B:53:0x02c4, B:56:0x02e0, B:59:0x02ea, B:61:0x02f0, B:63:0x02fc, B:65:0x02ff, B:70:0x0317, B:72:0x03a6, B:73:0x03b3, B:75:0x03b9, B:79:0x03ce, B:81:0x03d4, B:82:0x03df, B:84:0x03e5, B:87:0x03f5, B:89:0x03fd, B:90:0x0406, B:92:0x040c, B:95:0x041a, B:97:0x0422, B:98:0x0429, B:100:0x042f, B:103:0x043d, B:105:0x0448, B:107:0x04cb, B:110:0x04d5, B:112:0x04db, B:114:0x04e5, B:116:0x04e8, B:121:0x0501, B:123:0x05b1, B:124:0x05bc, B:126:0x05c2, B:130:0x05d7, B:132:0x05dd, B:133:0x05e6, B:135:0x05ec, B:138:0x05fa, B:140:0x0602, B:141:0x060b, B:143:0x0611, B:146:0x061f, B:148:0x0627, B:149:0x062e, B:151:0x0634, B:154:0x0642, B:156:0x064d, B:158:0x0655, B:160:0x06f0, B:163:0x0700, B:165:0x0706, B:167:0x0710, B:169:0x0713, B:174:0x0737, B:176:0x07bd, B:177:0x07c4, B:179:0x07ca, B:183:0x07db, B:185:0x07e1, B:186:0x07e8, B:188:0x07ee, B:191:0x07fc, B:193:0x0804, B:194:0x080b, B:196:0x0811, B:199:0x081f, B:201:0x0827, B:202:0x082e, B:204:0x0834, B:207:0x0842, B:209:0x084d, B:211:0x0859, B:213:0x08cb, B:216:0x08db, B:218:0x08e1, B:220:0x08eb, B:222:0x08ee, B:225:0x0900, B:227:0x0907, B:230:0x0914, B:232:0x091a, B:234:0x0924, B:236:0x092c, B:237:0x092f, B:238:0x093c, B:240:0x0945, B:241:0x095d, B:243:0x0962, B:244:0x0980, B:246:0x09a8, B:249:0x09ee, B:251:0x09f4, B:254:0x0a00, B:255:0x0a20, B:258:0x0a2c, B:260:0x0a38, B:262:0x0a45, B:263:0x0a49, B:264:0x0a4e, B:266:0x0a57, B:267:0x0a60, B:269:0x0abb, B:271:0x0ac1, B:273:0x0ad8, B:278:0x0a27, B:282:0x08bb, B:283:0x08c1, B:289:0x06dc, B:290:0x06e6, B:296:0x04ba, B:302:0x02d1), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:277:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0a27 A[Catch: Exception -> 0x0081, TryCatch #0 {Exception -> 0x0081, blocks: (B:3:0x0004, B:5:0x006f, B:7:0x008a, B:9:0x0096, B:13:0x00db, B:15:0x0171, B:16:0x017e, B:18:0x0184, B:22:0x0199, B:24:0x019f, B:25:0x01aa, B:27:0x01b0, B:30:0x01c0, B:32:0x01c8, B:33:0x01d1, B:35:0x01d7, B:38:0x01e5, B:40:0x01ed, B:41:0x01f4, B:43:0x01fa, B:46:0x0208, B:48:0x0213, B:51:0x02be, B:53:0x02c4, B:56:0x02e0, B:59:0x02ea, B:61:0x02f0, B:63:0x02fc, B:65:0x02ff, B:70:0x0317, B:72:0x03a6, B:73:0x03b3, B:75:0x03b9, B:79:0x03ce, B:81:0x03d4, B:82:0x03df, B:84:0x03e5, B:87:0x03f5, B:89:0x03fd, B:90:0x0406, B:92:0x040c, B:95:0x041a, B:97:0x0422, B:98:0x0429, B:100:0x042f, B:103:0x043d, B:105:0x0448, B:107:0x04cb, B:110:0x04d5, B:112:0x04db, B:114:0x04e5, B:116:0x04e8, B:121:0x0501, B:123:0x05b1, B:124:0x05bc, B:126:0x05c2, B:130:0x05d7, B:132:0x05dd, B:133:0x05e6, B:135:0x05ec, B:138:0x05fa, B:140:0x0602, B:141:0x060b, B:143:0x0611, B:146:0x061f, B:148:0x0627, B:149:0x062e, B:151:0x0634, B:154:0x0642, B:156:0x064d, B:158:0x0655, B:160:0x06f0, B:163:0x0700, B:165:0x0706, B:167:0x0710, B:169:0x0713, B:174:0x0737, B:176:0x07bd, B:177:0x07c4, B:179:0x07ca, B:183:0x07db, B:185:0x07e1, B:186:0x07e8, B:188:0x07ee, B:191:0x07fc, B:193:0x0804, B:194:0x080b, B:196:0x0811, B:199:0x081f, B:201:0x0827, B:202:0x082e, B:204:0x0834, B:207:0x0842, B:209:0x084d, B:211:0x0859, B:213:0x08cb, B:216:0x08db, B:218:0x08e1, B:220:0x08eb, B:222:0x08ee, B:225:0x0900, B:227:0x0907, B:230:0x0914, B:232:0x091a, B:234:0x0924, B:236:0x092c, B:237:0x092f, B:238:0x093c, B:240:0x0945, B:241:0x095d, B:243:0x0962, B:244:0x0980, B:246:0x09a8, B:249:0x09ee, B:251:0x09f4, B:254:0x0a00, B:255:0x0a20, B:258:0x0a2c, B:260:0x0a38, B:262:0x0a45, B:263:0x0a49, B:264:0x0a4e, B:266:0x0a57, B:267:0x0a60, B:269:0x0abb, B:271:0x0ac1, B:273:0x0ad8, B:278:0x0a27, B:282:0x08bb, B:283:0x08c1, B:289:0x06dc, B:290:0x06e6, B:296:0x04ba, B:302:0x02d1), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0a1e  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x095a  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x093a  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0317 A[Catch: Exception -> 0x0081, TryCatch #0 {Exception -> 0x0081, blocks: (B:3:0x0004, B:5:0x006f, B:7:0x008a, B:9:0x0096, B:13:0x00db, B:15:0x0171, B:16:0x017e, B:18:0x0184, B:22:0x0199, B:24:0x019f, B:25:0x01aa, B:27:0x01b0, B:30:0x01c0, B:32:0x01c8, B:33:0x01d1, B:35:0x01d7, B:38:0x01e5, B:40:0x01ed, B:41:0x01f4, B:43:0x01fa, B:46:0x0208, B:48:0x0213, B:51:0x02be, B:53:0x02c4, B:56:0x02e0, B:59:0x02ea, B:61:0x02f0, B:63:0x02fc, B:65:0x02ff, B:70:0x0317, B:72:0x03a6, B:73:0x03b3, B:75:0x03b9, B:79:0x03ce, B:81:0x03d4, B:82:0x03df, B:84:0x03e5, B:87:0x03f5, B:89:0x03fd, B:90:0x0406, B:92:0x040c, B:95:0x041a, B:97:0x0422, B:98:0x0429, B:100:0x042f, B:103:0x043d, B:105:0x0448, B:107:0x04cb, B:110:0x04d5, B:112:0x04db, B:114:0x04e5, B:116:0x04e8, B:121:0x0501, B:123:0x05b1, B:124:0x05bc, B:126:0x05c2, B:130:0x05d7, B:132:0x05dd, B:133:0x05e6, B:135:0x05ec, B:138:0x05fa, B:140:0x0602, B:141:0x060b, B:143:0x0611, B:146:0x061f, B:148:0x0627, B:149:0x062e, B:151:0x0634, B:154:0x0642, B:156:0x064d, B:158:0x0655, B:160:0x06f0, B:163:0x0700, B:165:0x0706, B:167:0x0710, B:169:0x0713, B:174:0x0737, B:176:0x07bd, B:177:0x07c4, B:179:0x07ca, B:183:0x07db, B:185:0x07e1, B:186:0x07e8, B:188:0x07ee, B:191:0x07fc, B:193:0x0804, B:194:0x080b, B:196:0x0811, B:199:0x081f, B:201:0x0827, B:202:0x082e, B:204:0x0834, B:207:0x0842, B:209:0x084d, B:211:0x0859, B:213:0x08cb, B:216:0x08db, B:218:0x08e1, B:220:0x08eb, B:222:0x08ee, B:225:0x0900, B:227:0x0907, B:230:0x0914, B:232:0x091a, B:234:0x0924, B:236:0x092c, B:237:0x092f, B:238:0x093c, B:240:0x0945, B:241:0x095d, B:243:0x0962, B:244:0x0980, B:246:0x09a8, B:249:0x09ee, B:251:0x09f4, B:254:0x0a00, B:255:0x0a20, B:258:0x0a2c, B:260:0x0a38, B:262:0x0a45, B:263:0x0a49, B:264:0x0a4e, B:266:0x0a57, B:267:0x0a60, B:269:0x0abb, B:271:0x0ac1, B:273:0x0ad8, B:278:0x0a27, B:282:0x08bb, B:283:0x08c1, B:289:0x06dc, B:290:0x06e6, B:296:0x04ba, B:302:0x02d1), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void q() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str;
        String str2;
        String str3;
        JSONObject jSONObject3;
        String str4;
        String str5;
        JSONObject jSONObject4;
        String str6;
        zq zqVar;
        String str7;
        String str8;
        JSONObject jSONObject5;
        zq zqVar2;
        String str9;
        String str10;
        String str11;
        JSONObject jSONObject6;
        nj njVar;
        String str12;
        nj njVar2;
        JSONObject jSONObject7;
        JSONObject jSONObject8;
        String str13;
        String str14;
        String str15;
        JSONObject jSONObject9;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        u6 u6Var;
        String str21;
        JSONObject jSONObject10;
        String str22;
        String str23;
        JSONObject jSONObject11;
        String str24;
        u6 u6Var2;
        String str25;
        sm smVar;
        sm smVar2;
        JSONObject jSONObject12;
        ev evVar;
        boolean z4;
        JSONObject jSONObject13;
        JSONObject c4;
        JSONObject c5;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        C1529o5 c1529o5;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        C1529o5 c1529o52;
        int[] iArr9;
        int[] iArr10;
        int[] iArr11;
        int[] iArr12;
        int i4;
        C1529o5 c1529o53;
        int[] iArr13;
        int[] iArr14;
        int[] iArr15;
        int[] iArr16;
        C1529o5 c1529o54;
        try {
            JSONObject c6 = c(this.f18237f, "configurations");
            JSONObject c7 = c(c6, b());
            JSONObject c8 = c(c6, "application");
            JSONObject c9 = c(c7, l());
            JSONObject c10 = c(c7, "interstitial");
            JSONObject c11 = c(c7, "banner");
            JSONObject c12 = c(c7, "nativeAd");
            JSONObject c13 = c(c8, "events");
            JSONObject c14 = c(c8, "loggers");
            JSONObject c15 = c(c8, "token");
            JSONObject c16 = c(c8, "segment");
            JSONObject c17 = c(c8, "auction");
            JSONObject c18 = c(c8, "crashReporter");
            JSONObject c19 = c(c8, "settings");
            JSONObject c20 = c(c8, "external");
            JSONObject c21 = c(c13, f18152Z0);
            if (c8 != null) {
                jSONObject = c21;
                jSONObject2 = c6;
                IronSourceUtils.saveBooleanToSharedPrefs(this.f18238g, "uuidEnabled", c8.optBoolean("uuidEnabled", true));
            } else {
                jSONObject = c21;
                jSONObject2 = c6;
            }
            if (c13 != null) {
                String optString = c13.optString("abt");
                if (!TextUtils.isEmpty(optString)) {
                    pj.i().a(optString);
                    br.i().a(optString);
                    str = optString;
                    String str26 = f18087D1;
                    String str27 = "optOut";
                    if (c9 == null) {
                        JSONArray optJSONArray = c9.optJSONArray("placements");
                        str4 = "placements";
                        JSONObject c22 = c(c9, "events");
                        JSONArray jSONArray = optJSONArray;
                        JSONObject d4 = d(c9, f18224x0);
                        long optLong = c9.optLong(f18221w0, f18115N);
                        boolean optBoolean = d4.optBoolean(f18227y0, false);
                        boolean optBoolean2 = d4.optBoolean(f18230z0, false);
                        boolean optBoolean3 = c9.optBoolean(f18077A0, true);
                        int a4 = a(c9, c8, "parallelLoad", 2);
                        boolean a5 = a(c9, c8, "bidderExclusive", true);
                        int a6 = a(c9, c8, f18086D0, f18079B);
                        int a7 = a(c9, c8, "expiredDurationInMinutes", -1);
                        int a8 = a(c9, c8, f18207r1, 3);
                        boolean a9 = a(c9, c8, "isOneFlow", false);
                        JSONObject mergeJsons = IronSourceUtils.mergeJsons(c22, c13);
                        boolean optBoolean4 = mergeJsons.optBoolean("sendUltraEvents", false);
                        boolean optBoolean5 = mergeJsons.optBoolean("sendEventsToggle", false);
                        boolean optBoolean6 = mergeJsons.optBoolean("eventsCompression", false);
                        int optInt = mergeJsons.optInt("eventsCompressionLevel", -1);
                        String optString2 = mergeJsons.optString("serverEventsURL", "");
                        String optString3 = mergeJsons.optString("serverEventsType", "");
                        int optInt2 = mergeJsons.optInt("backupThreshold", -1);
                        int optInt3 = mergeJsons.optInt("maxNumberOfEvents", -1);
                        int optInt4 = mergeJsons.optInt("maxEventsPerBatch", 5000);
                        JSONArray optJSONArray2 = mergeJsons.optJSONArray(str27);
                        if (optJSONArray2 != null) {
                            str27 = str27;
                            int[] iArr17 = new int[optJSONArray2.length()];
                            str3 = "eventsCompressionLevel";
                            for (int i5 = 0; i5 < optJSONArray2.length(); i5++) {
                                iArr17[i5] = optJSONArray2.optInt(i5);
                            }
                            iArr13 = iArr17;
                        } else {
                            str27 = str27;
                            str3 = "eventsCompressionLevel";
                            iArr13 = null;
                        }
                        JSONArray optJSONArray3 = mergeJsons.optJSONArray("optIn");
                        if (optJSONArray3 != null) {
                            int[] iArr18 = new int[optJSONArray3.length()];
                            str5 = "optIn";
                            for (int i6 = 0; i6 < optJSONArray3.length(); i6++) {
                                iArr18[i6] = optJSONArray3.optInt(i6);
                            }
                            iArr14 = iArr18;
                        } else {
                            str5 = "optIn";
                            iArr14 = null;
                        }
                        JSONArray optJSONArray4 = mergeJsons.optJSONArray("triggerEvents");
                        if (optJSONArray4 != null) {
                            int[] iArr19 = new int[optJSONArray4.length()];
                            for (int i7 = 0; i7 < optJSONArray4.length(); i7++) {
                                iArr19[i7] = optJSONArray4.optInt(i7);
                            }
                            iArr15 = iArr19;
                        } else {
                            iArr15 = null;
                        }
                        JSONArray optJSONArray5 = mergeJsons.optJSONArray("nonConnectivityEvents");
                        if (optJSONArray5 != null) {
                            int[] iArr20 = new int[optJSONArray5.length()];
                            for (int i8 = 0; i8 < optJSONArray5.length(); i8++) {
                                iArr20[i8] = optJSONArray5.optInt(i8);
                            }
                            iArr16 = iArr20;
                        } else {
                            iArr16 = null;
                        }
                        C1477h4 c1477h4 = new C1477h4(optBoolean4, optBoolean5, optBoolean6, optInt, optString2, optString3, optInt2, optInt3, optInt4, iArr13, iArr14, iArr15, iArr16);
                        if (c17 != null) {
                            JSONObject c23 = c(c17, l());
                            str26 = str26;
                            str6 = "eventsCompression";
                            jSONObject4 = c17;
                            str2 = "";
                            jSONObject3 = c13;
                            C1529o5 c1529o55 = new C1529o5(c17.optString(str26, ""), c17.optString(f18090E1, ""), c17.optString(f18093F1, ""), c17.optInt("auctionTrials", 2), c17.optInt(f18120O1, 15), c17.optLong(f18117N1, 10000L), c23.optInt(f18099H1, 2000), c23.optInt(f18108K1, 30000), c23.optInt(f18102I1, 5000), c23.optInt(f18105J1, 50), c23.optBoolean("isLoadWhileShow", true), c23.optInt(f18129R1, 30000), c17.optBoolean(f18132S1, false), c17.optBoolean(f18135T1, false), c23.optBoolean(f18096G1, false), c17.optInt(f18138U1, 1), false, c17.optBoolean(f18126Q1, false));
                            JSONArray optJSONArray6 = c23.optJSONArray(f18123P1);
                            if (optJSONArray6 != null) {
                                for (int i9 = 0; i9 < optJSONArray6.length(); i9++) {
                                    c1529o55.a(optJSONArray6.optString(i9));
                                }
                            }
                            c1529o54 = c1529o55;
                        } else {
                            str2 = "";
                            jSONObject3 = c13;
                            jSONObject4 = c17;
                            str6 = "eventsCompression";
                            c1529o54 = new C1529o5();
                        }
                        zq zqVar3 = new zq(a4, a5, a6, a7, c1477h4, c1529o54, a8, a9, optLong, optBoolean, optBoolean2, optBoolean3);
                        if (jSONArray != null) {
                            int i10 = 0;
                            while (i10 < jSONArray.length()) {
                                JSONArray jSONArray2 = jSONArray;
                                Placement g4 = g(jSONArray2.optJSONObject(i10));
                                if (g4 != null) {
                                    zqVar3.a(g4);
                                }
                                i10++;
                                jSONArray = jSONArray2;
                            }
                        }
                        zqVar = zqVar3;
                    } else {
                        str2 = "";
                        str3 = "eventsCompressionLevel";
                        jSONObject3 = c13;
                        str4 = "placements";
                        str5 = "optIn";
                        jSONObject4 = c17;
                        str6 = "eventsCompression";
                        zqVar = null;
                    }
                    if (c10 == null) {
                        String str28 = str4;
                        JSONArray optJSONArray7 = c10.optJSONArray(str28);
                        JSONObject c24 = c(c10, "events");
                        JSONObject d5 = d(c10, f18224x0);
                        zq zqVar4 = zqVar;
                        str4 = str28;
                        long optLong2 = c10.optLong(f18221w0, f18115N);
                        boolean optBoolean7 = d5.optBoolean(f18227y0, false);
                        boolean optBoolean8 = d5.optBoolean(f18230z0, false);
                        boolean optBoolean9 = c10.optBoolean(f18077A0, true);
                        int a10 = a(c10, c8, "parallelLoad", 2);
                        boolean a11 = a(c10, c8, "bidderExclusive", false);
                        int a12 = a(c10, c8, f18086D0, f18079B);
                        int a13 = a(c10, c8, f18207r1, 3);
                        boolean a14 = a(c10, c8, "isOneFlow", false);
                        JSONObject jSONObject14 = jSONObject3;
                        JSONObject mergeJsons2 = IronSourceUtils.mergeJsons(c24, jSONObject14);
                        boolean optBoolean10 = mergeJsons2.optBoolean("sendEventsToggle", false);
                        String str29 = str6;
                        boolean optBoolean11 = mergeJsons2.optBoolean(str29, false);
                        str9 = str3;
                        int optInt5 = mergeJsons2.optInt(str9, -1);
                        str7 = f18077A0;
                        String str30 = str2;
                        String optString4 = mergeJsons2.optString("serverEventsURL", str30);
                        String optString5 = mergeJsons2.optString("serverEventsType", str30);
                        jSONObject6 = c8;
                        int optInt6 = mergeJsons2.optInt("backupThreshold", -1);
                        int optInt7 = mergeJsons2.optInt("maxNumberOfEvents", -1);
                        int optInt8 = mergeJsons2.optInt("maxEventsPerBatch", 5000);
                        String str31 = str27;
                        JSONArray optJSONArray8 = mergeJsons2.optJSONArray(str31);
                        if (optJSONArray8 != null) {
                            str11 = str29;
                            int[] iArr21 = new int[optJSONArray8.length()];
                            str10 = str31;
                            for (int i11 = 0; i11 < optJSONArray8.length(); i11++) {
                                iArr21[i11] = optJSONArray8.optInt(i11);
                            }
                            iArr9 = iArr21;
                        } else {
                            str11 = str29;
                            str10 = str31;
                            iArr9 = null;
                        }
                        String str32 = str5;
                        JSONArray optJSONArray9 = mergeJsons2.optJSONArray(str32);
                        if (optJSONArray9 != null) {
                            int[] iArr22 = new int[optJSONArray9.length()];
                            str5 = str32;
                            for (int i12 = 0; i12 < optJSONArray9.length(); i12++) {
                                iArr22[i12] = optJSONArray9.optInt(i12);
                            }
                            iArr10 = iArr22;
                        } else {
                            str5 = str32;
                            iArr10 = null;
                        }
                        JSONArray optJSONArray10 = mergeJsons2.optJSONArray("triggerEvents");
                        if (optJSONArray10 != null) {
                            int[] iArr23 = new int[optJSONArray10.length()];
                            for (int i13 = 0; i13 < optJSONArray10.length(); i13++) {
                                iArr23[i13] = optJSONArray10.optInt(i13);
                            }
                            iArr11 = iArr23;
                        } else {
                            iArr11 = null;
                        }
                        JSONArray optJSONArray11 = mergeJsons2.optJSONArray("nonConnectivityEvents");
                        if (optJSONArray11 != null) {
                            int[] iArr24 = new int[optJSONArray11.length()];
                            for (int i14 = 0; i14 < optJSONArray11.length(); i14++) {
                                iArr24[i14] = optJSONArray11.optInt(i14);
                            }
                            iArr12 = iArr24;
                        } else {
                            iArr12 = null;
                        }
                        C1477h4 c1477h42 = new C1477h4(false, optBoolean10, optBoolean11, optInt5, optString4, optString5, optInt6, optInt7, optInt8, iArr9, iArr10, iArr11, iArr12);
                        if (jSONObject4 != null) {
                            jSONObject5 = jSONObject4;
                            str8 = str26;
                            str2 = str30;
                            jSONObject3 = jSONObject14;
                            zqVar2 = zqVar4;
                            i4 = 0;
                            c1529o53 = new C1529o5(jSONObject5.optString(str8, str30), jSONObject5.optString(f18090E1, str30), jSONObject5.optString(f18093F1, str30), jSONObject5.optInt("auctionTrials", 2), jSONObject5.optInt(f18120O1, 15), jSONObject5.optLong(f18117N1, 10000L), c(jSONObject5, "interstitial").optInt(f18099H1, 2000), 0L, 0L, 0L, true, 0, jSONObject5.optBoolean(f18132S1, false), jSONObject5.optBoolean(f18135T1, false), true, jSONObject5.optInt(f18138U1, 1), false, jSONObject5.optBoolean(f18126Q1, false));
                        } else {
                            str2 = str30;
                            jSONObject3 = jSONObject14;
                            str8 = str26;
                            jSONObject5 = jSONObject4;
                            i4 = 0;
                            zqVar2 = zqVar4;
                            c1529o53 = new C1529o5();
                        }
                        nj njVar3 = new nj(a10, a11, a12, c1477h42, c1529o53, a13, a14, optLong2, optBoolean7, optBoolean8, optBoolean9);
                        if (optJSONArray7 != null) {
                            for (int i15 = i4; i15 < optJSONArray7.length(); i15++) {
                                InterstitialPlacement e4 = e(optJSONArray7.optJSONObject(i15));
                                if (e4 != null) {
                                    njVar3.a(e4);
                                }
                            }
                        }
                        njVar = njVar3;
                    } else {
                        str7 = f18077A0;
                        str8 = str26;
                        jSONObject5 = jSONObject4;
                        zqVar2 = zqVar;
                        str9 = str3;
                        str10 = str27;
                        str11 = str6;
                        jSONObject6 = c8;
                        njVar = null;
                    }
                    if (c11 == null) {
                        String str33 = str4;
                        JSONArray optJSONArray12 = c11.optJSONArray(str33);
                        JSONObject c25 = c(c11, "events");
                        JSONObject d6 = d(c11, f18224x0);
                        String str34 = str8;
                        str14 = str33;
                        njVar2 = njVar;
                        jSONObject7 = c20;
                        jSONObject8 = jSONObject;
                        JSONObject jSONObject15 = jSONObject6;
                        String str35 = str5;
                        String str36 = str10;
                        String str37 = str2;
                        long a15 = a(c11, jSONObject15, f18089E0, 10000L);
                        int a16 = a(c11, jSONObject15, f18207r1, 3);
                        int optInt9 = c11.optInt("bannerInterval", f18079B);
                        long optLong3 = c11.optLong(f18144W1, 15000L);
                        boolean a17 = a(c11, jSONObject15, "isOneFlow", false);
                        str17 = f18207r1;
                        long optLong4 = c11.optLong(f18221w0, f18115N);
                        boolean optBoolean12 = d6.optBoolean(f18227y0, false);
                        boolean optBoolean13 = d6.optBoolean(f18230z0, false);
                        str13 = str7;
                        boolean optBoolean14 = c11.optBoolean(str13, true);
                        jSONObject9 = jSONObject3;
                        JSONObject mergeJsons3 = IronSourceUtils.mergeJsons(c25, jSONObject9);
                        boolean optBoolean15 = mergeJsons3.optBoolean("sendEventsToggle", false);
                        str18 = str11;
                        boolean optBoolean16 = mergeJsons3.optBoolean(str18, false);
                        int optInt10 = mergeJsons3.optInt(str9, -1);
                        String optString6 = mergeJsons3.optString("serverEventsURL", str37);
                        String optString7 = mergeJsons3.optString("serverEventsType", str37);
                        int optInt11 = mergeJsons3.optInt("backupThreshold", -1);
                        int optInt12 = mergeJsons3.optInt("maxNumberOfEvents", -1);
                        str16 = str9;
                        int optInt13 = mergeJsons3.optInt("maxEventsPerBatch", 5000);
                        JSONArray optJSONArray13 = mergeJsons3.optJSONArray(str36);
                        if (optJSONArray13 != null) {
                            int[] iArr25 = new int[optJSONArray13.length()];
                            jSONObject6 = jSONObject15;
                            str20 = str36;
                            for (int i16 = 0; i16 < optJSONArray13.length(); i16++) {
                                iArr25[i16] = optJSONArray13.optInt(i16);
                            }
                            iArr5 = iArr25;
                        } else {
                            jSONObject6 = jSONObject15;
                            str20 = str36;
                            iArr5 = null;
                        }
                        str19 = str35;
                        JSONArray optJSONArray14 = mergeJsons3.optJSONArray(str19);
                        if (optJSONArray14 != null) {
                            int[] iArr26 = new int[optJSONArray14.length()];
                            for (int i17 = 0; i17 < optJSONArray14.length(); i17++) {
                                iArr26[i17] = optJSONArray14.optInt(i17);
                            }
                            iArr6 = iArr26;
                        } else {
                            iArr6 = null;
                        }
                        JSONArray optJSONArray15 = mergeJsons3.optJSONArray("triggerEvents");
                        if (optJSONArray15 != null) {
                            int[] iArr27 = new int[optJSONArray15.length()];
                            for (int i18 = 0; i18 < optJSONArray15.length(); i18++) {
                                iArr27[i18] = optJSONArray15.optInt(i18);
                            }
                            iArr7 = iArr27;
                        } else {
                            iArr7 = null;
                        }
                        JSONArray optJSONArray16 = mergeJsons3.optJSONArray("nonConnectivityEvents");
                        if (optJSONArray16 != null) {
                            int[] iArr28 = new int[optJSONArray16.length()];
                            for (int i19 = 0; i19 < optJSONArray16.length(); i19++) {
                                iArr28[i19] = optJSONArray16.optInt(i19);
                            }
                            iArr8 = iArr28;
                        } else {
                            iArr8 = null;
                        }
                        C1477h4 c1477h43 = new C1477h4(false, optBoolean15, optBoolean16, optInt10, optString6, optString7, optInt11, optInt12, optInt13, iArr5, iArr6, iArr7, iArr8);
                        if (jSONObject5 != null) {
                            JSONObject c26 = c(jSONObject5, "banner");
                            if (c26 != null) {
                                str15 = str37;
                                str12 = str34;
                                c1529o52 = new C1529o5(jSONObject5.optString(str34, str37), jSONObject5.optString(f18090E1, str37), jSONObject5.optString(f18093F1, str37), jSONObject5.optInt("auctionTrials", 2), jSONObject5.optInt(f18120O1, 15), jSONObject5.optLong(f18117N1, 10000L), c26.optInt(f18099H1, 2000), c26.optInt(f18108K1, 15000), c26.optInt(f18102I1, 50), 0L, c26.optBoolean("isLoadWhileShow", false), 0, jSONObject5.optBoolean(f18132S1, false), jSONObject5.optBoolean(f18135T1, false), c26.optBoolean(f18096G1, true), jSONObject5.optInt(f18138U1, 1), c26.optBoolean(f18141V1, true), jSONObject5.optBoolean(f18126Q1, false));
                            } else {
                                str15 = str37;
                                str12 = str34;
                                c1529o52 = new C1529o5();
                            }
                        } else {
                            str15 = str37;
                            str12 = str34;
                            c1529o52 = new C1529o5();
                        }
                        u6 u6Var3 = new u6(1, a15, false, c1477h43, optInt9, c1529o52, a16, a17, optLong4, optBoolean12, optBoolean13, optBoolean14, optLong3);
                        if (optJSONArray12 != null) {
                            for (int i20 = 0; i20 < optJSONArray12.length(); i20++) {
                                h7 d7 = d(optJSONArray12.optJSONObject(i20));
                                if (d7 != null) {
                                    u6Var3.a(d7);
                                }
                            }
                        }
                        u6Var = u6Var3;
                    } else {
                        str12 = str8;
                        njVar2 = njVar;
                        jSONObject7 = c20;
                        jSONObject8 = jSONObject;
                        str13 = str7;
                        str14 = str4;
                        str15 = str2;
                        jSONObject9 = jSONObject3;
                        str16 = str9;
                        str17 = f18207r1;
                        str18 = str11;
                        str19 = str5;
                        str20 = str10;
                        u6Var = null;
                    }
                    if (c12 == null) {
                        JSONArray optJSONArray17 = c12.optJSONArray(str14);
                        JSONObject c27 = c(c12, "events");
                        JSONObject d8 = d(c12, f18224x0);
                        String str38 = str19;
                        String str39 = str12;
                        jSONObject11 = jSONObject6;
                        u6Var2 = u6Var;
                        JSONObject jSONObject16 = jSONObject5;
                        str24 = str20;
                        long a18 = a(c12, jSONObject11, f18089E0, 10000L);
                        int a19 = a(c12, jSONObject11, str17, 0);
                        long optLong5 = c12.optLong(f18221w0, f18115N);
                        boolean optBoolean17 = d8.optBoolean(f18227y0, false);
                        boolean optBoolean18 = d8.optBoolean(f18230z0, false);
                        boolean optBoolean19 = c12.optBoolean(str13, true);
                        JSONObject mergeJsons4 = IronSourceUtils.mergeJsons(c27, jSONObject9);
                        boolean optBoolean20 = mergeJsons4.optBoolean("sendEventsToggle", false);
                        boolean optBoolean21 = mergeJsons4.optBoolean(str18, false);
                        str22 = str16;
                        int optInt14 = mergeJsons4.optInt(str22, -1);
                        str25 = str15;
                        String optString8 = mergeJsons4.optString("serverEventsURL", str25);
                        String optString9 = mergeJsons4.optString("serverEventsType", str25);
                        int optInt15 = mergeJsons4.optInt("backupThreshold", -1);
                        int optInt16 = mergeJsons4.optInt("maxNumberOfEvents", -1);
                        int optInt17 = mergeJsons4.optInt("maxEventsPerBatch", 5000);
                        JSONArray optJSONArray18 = mergeJsons4.optJSONArray(str24);
                        if (optJSONArray18 != null) {
                            int[] iArr29 = new int[optJSONArray18.length()];
                            for (int i21 = 0; i21 < optJSONArray18.length(); i21++) {
                                iArr29[i21] = optJSONArray18.optInt(i21);
                            }
                            iArr = iArr29;
                        } else {
                            iArr = null;
                        }
                        str21 = str38;
                        JSONArray optJSONArray19 = mergeJsons4.optJSONArray(str21);
                        if (optJSONArray19 != null) {
                            int[] iArr30 = new int[optJSONArray19.length()];
                            for (int i22 = 0; i22 < optJSONArray19.length(); i22++) {
                                iArr30[i22] = optJSONArray19.optInt(i22);
                            }
                            iArr2 = iArr30;
                        } else {
                            iArr2 = null;
                        }
                        JSONArray optJSONArray20 = mergeJsons4.optJSONArray("triggerEvents");
                        if (optJSONArray20 != null) {
                            int[] iArr31 = new int[optJSONArray20.length()];
                            for (int i23 = 0; i23 < optJSONArray20.length(); i23++) {
                                iArr31[i23] = optJSONArray20.optInt(i23);
                            }
                            iArr3 = iArr31;
                        } else {
                            iArr3 = null;
                        }
                        JSONArray optJSONArray21 = mergeJsons4.optJSONArray("nonConnectivityEvents");
                        if (optJSONArray21 != null) {
                            int[] iArr32 = new int[optJSONArray21.length()];
                            for (int i24 = 0; i24 < optJSONArray21.length(); i24++) {
                                iArr32[i24] = optJSONArray21.optInt(i24);
                            }
                            iArr4 = iArr32;
                        } else {
                            iArr4 = null;
                        }
                        C1477h4 c1477h44 = new C1477h4(false, optBoolean20, optBoolean21, optInt14, optString8, optString9, optInt15, optInt16, optInt17, iArr, iArr2, iArr3, iArr4);
                        if (jSONObject16 != null) {
                            jSONObject10 = jSONObject16;
                            str23 = str39;
                            c1529o5 = c(jSONObject10, "nativeAd") != null ? new C1529o5(jSONObject10.optString(str23, str25), jSONObject10.optString(f18090E1, str25), jSONObject10.optString(f18093F1, str25), jSONObject10.optInt("auctionTrials", 2), jSONObject10.optInt(f18120O1, 15), jSONObject10.optLong(f18117N1, 10000L), r2.optInt(f18099H1, 2000), 0L, 0L, 0L, true, 0, jSONObject10.optBoolean(f18132S1, false), jSONObject10.optBoolean(f18135T1, false), true, jSONObject10.optInt(f18138U1, 1), false, jSONObject10.optBoolean(f18126Q1, false)) : new C1529o5();
                        } else {
                            jSONObject10 = jSONObject16;
                            str23 = str39;
                            c1529o5 = new C1529o5();
                        }
                        smVar = new sm(1, a18, false, c1477h44, c1529o5, a19, optLong5, optBoolean17, optBoolean18, optBoolean19);
                        if (optJSONArray17 != null) {
                            for (int i25 = 0; i25 < optJSONArray17.length(); i25++) {
                                dn f4 = f(optJSONArray17.optJSONObject(i25));
                                if (f4 != null) {
                                    smVar.a(f4);
                                }
                            }
                        }
                    } else {
                        str21 = str19;
                        jSONObject10 = jSONObject5;
                        str22 = str16;
                        str23 = str12;
                        jSONObject11 = jSONObject6;
                        str24 = str20;
                        u6Var2 = u6Var;
                        str25 = str15;
                        smVar = null;
                    }
                    ev evVar2 = new ev();
                    if (c15 == null) {
                        JSONArray optJSONArray22 = c15.optJSONArray(f18147X1);
                        smVar2 = smVar;
                        if (optJSONArray22 != null) {
                            for (int i26 = 0; i26 < optJSONArray22.length(); i26++) {
                                evVar2.a(optJSONArray22.optString(i26));
                            }
                        }
                        JSONObject optJSONObject = c15.optJSONObject(f18150Y1);
                        if (optJSONObject != null) {
                            evVar2.a(optJSONObject);
                        }
                        evVar2.a(c15.optBoolean(f18153Z1, true));
                    } else {
                        smVar2 = smVar;
                    }
                    kp kpVar = new kp();
                    jSONObject12 = jSONObject8;
                    if (jSONObject12 == null) {
                        String optString10 = jSONObject12.optString(f18155a1, lp.f17109a);
                        evVar = evVar2;
                        z4 = jSONObject12.optBoolean(f18158b1, true);
                        kpVar.a(optString10);
                    } else {
                        evVar = evVar2;
                        z4 = true;
                    }
                    kpVar.b(z4);
                    if (z4) {
                        kpVar.b(a(jSONObject9, str24));
                        kpVar.a(a(jSONObject9, str21));
                        kpVar.a(jSONObject9.optBoolean(str18, false));
                        kpVar.a(jSONObject9.optInt(str22, -1));
                    }
                    C1528o4 c1528o4 = new C1528o4(c14.optInt("server", 3), c14.optInt("publisher", 3), c14.optInt("console", 3), c14.optBoolean("shouldSendPublisherLogsOnUIThread", false));
                    C1456e4 c1456e4 = new C1456e4();
                    if (c18 != null) {
                        c1456e4.a(c18.optBoolean("enabled", false));
                        c1456e4.c(c18.optString("reporterURL", str25));
                        c1456e4.b(c18.optString("reporterKeyword", str25));
                        c1456e4.c(c18.optBoolean("includeANR", false));
                        c1456e4.a(c18.optInt("timeout", 5000));
                        c1456e4.b(c18.optBoolean("setIgnoreDebugger", false));
                        JSONArray optJSONArray23 = c18.optJSONArray("keysToInclude");
                        if (optJSONArray23 != null) {
                            for (int i27 = 0; i27 < optJSONArray23.length(); i27++) {
                                c1456e4.a(optJSONArray23.optString(i27));
                            }
                        }
                    }
                    ns nsVar = c16 == null ? new ns(c16.optString("name", str25), c16.optString("id", "-1"), c16.optJSONObject("custom")) : null;
                    C1498k4 c1498k4 = new C1498k4(c19 == null ? c19 : new JSONObject());
                    C1491j4 c1491j4 = new C1491j4();
                    jSONObject13 = jSONObject7;
                    if (jSONObject13 != null) {
                        JSONObject optJSONObject2 = jSONObject13.optJSONObject(f18200p0);
                        Map hashMap = new HashMap();
                        if (optJSONObject2 != null) {
                            hashMap = IronSourceUtils.parseJsonToStringMap(optJSONObject2);
                        }
                        c1491j4 = new C1491j4(hashMap);
                    }
                    C1491j4 c1491j42 = c1491j4;
                    C1598y3 c1598y3 = new C1598y3();
                    if (jSONObject10 != null) {
                        c1598y3 = new C1598y3(jSONObject10.optString(str23));
                    }
                    C1428a4 c1428a4 = new C1428a4(c1528o4, nsVar, evVar, jSONObject11.optBoolean("integration", false), c1456e4, c1498k4, c1491j42, kpVar, c1598y3, str);
                    JSONObject jSONObject17 = jSONObject2;
                    qu h4 = h(jSONObject17);
                    C1467g1 c28 = c(jSONObject17);
                    s8.a aVar = new s8.a();
                    aVar.a(zqVar2);
                    aVar.a(njVar2);
                    aVar.a(u6Var2);
                    aVar.a(smVar2);
                    aVar.a(c1428a4);
                    aVar.b(h4);
                    aVar.a(c28);
                    s8 a20 = aVar.a();
                    this.f18234c = a20;
                    IronLog.INTERNAL.verbose(a20.toString());
                    c4 = c(jSONObject9, "genericParams");
                    if (c4 != null && (c5 = c(c4, "events")) != null) {
                        c4.remove("events");
                        Map<String, String> parseJsonToStringMap = IronSourceUtils.parseJsonToStringMap(c5);
                        br.i().b(parseJsonToStringMap);
                        pj.i().b(parseJsonToStringMap);
                    }
                    if (c4 == null) {
                        Map<String, String> parseJsonToStringMap2 = IronSourceUtils.parseJsonToStringMap(c4);
                        br.i().a(parseJsonToStringMap2);
                        pj.i().a(parseJsonToStringMap2);
                        return;
                    }
                    return;
                }
            }
            str = null;
            String str262 = f18087D1;
            String str272 = "optOut";
            if (c9 == null) {
            }
            if (c10 == null) {
            }
            if (c11 == null) {
            }
            if (c12 == null) {
            }
            ev evVar22 = new ev();
            if (c15 == null) {
            }
            kp kpVar2 = new kp();
            jSONObject12 = jSONObject8;
            if (jSONObject12 == null) {
            }
            kpVar2.b(z4);
            if (z4) {
            }
            C1528o4 c1528o42 = new C1528o4(c14.optInt("server", 3), c14.optInt("publisher", 3), c14.optInt("console", 3), c14.optBoolean("shouldSendPublisherLogsOnUIThread", false));
            C1456e4 c1456e42 = new C1456e4();
            if (c18 != null) {
            }
            if (c16 == null) {
            }
            C1498k4 c1498k42 = new C1498k4(c19 == null ? c19 : new JSONObject());
            C1491j4 c1491j43 = new C1491j4();
            jSONObject13 = jSONObject7;
            if (jSONObject13 != null) {
            }
            C1491j4 c1491j422 = c1491j43;
            C1598y3 c1598y32 = new C1598y3();
            if (jSONObject10 != null) {
            }
            C1428a4 c1428a42 = new C1428a4(c1528o42, nsVar, evVar, jSONObject11.optBoolean("integration", false), c1456e42, c1498k42, c1491j422, kpVar2, c1598y32, str);
            JSONObject jSONObject172 = jSONObject2;
            qu h42 = h(jSONObject172);
            C1467g1 c282 = c(jSONObject172);
            s8.a aVar2 = new s8.a();
            aVar2.a(zqVar2);
            aVar2.a(njVar2);
            aVar2.a(u6Var2);
            aVar2.a(smVar2);
            aVar2.a(c1428a42);
            aVar2.b(h42);
            aVar2.a(c282);
            s8 a202 = aVar2.a();
            this.f18234c = a202;
            IronLog.INTERNAL.verbose(a202.toString());
            c4 = c(jSONObject9, "genericParams");
            if (c4 != null) {
                c4.remove("events");
                Map<String, String> parseJsonToStringMap3 = IronSourceUtils.parseJsonToStringMap(c5);
                br.i().b(parseJsonToStringMap3);
                pj.i().b(parseJsonToStringMap3);
            }
            if (c4 == null) {
            }
        } catch (Exception e5) {
            o9.d().a(e5);
            IronLog.INTERNAL.error(e5.toString());
        }
    }

    private void r() {
        try {
            JSONObject c4 = c(this.f18237f, "providerOrder");
            JSONArray b4 = b(c4, l());
            JSONArray b5 = b(c4, "interstitial");
            JSONArray b6 = b(c4, "banner");
            JSONArray b7 = b(c4, "nativeAd");
            this.f18232a = new bq();
            if (b4 != null && c() != null && c().f() != null) {
                for (int i4 = 0; i4 < b4.length(); i4++) {
                    String optString = b4.optString(i4);
                    this.f18232a.d(optString);
                    NetworkSettings b8 = dq.c().b(optString);
                    if (b8 != null) {
                        b8.setRewardedVideoPriority(i4);
                    }
                }
            }
            if (b5 != null && c() != null && c().d() != null) {
                for (int i5 = 0; i5 < b5.length(); i5++) {
                    String optString2 = b5.optString(i5);
                    this.f18232a.b(optString2);
                    NetworkSettings b9 = dq.c().b(optString2);
                    if (b9 != null) {
                        b9.setInterstitialPriority(i5);
                    }
                }
            }
            if (b6 != null) {
                for (int i6 = 0; i6 < b6.length(); i6++) {
                    String optString3 = b6.optString(i6);
                    this.f18232a.a(optString3);
                    NetworkSettings b10 = dq.c().b(optString3);
                    if (b10 != null) {
                        b10.setBannerPriority(i6);
                    }
                }
            }
            if (b7 != null) {
                for (int i7 = 0; i7 < b7.length(); i7++) {
                    String optString4 = b7.optString(i7);
                    this.f18232a.c(optString4);
                    NetworkSettings b11 = dq.c().b(optString4);
                    if (b11 != null) {
                        b11.setNativeAdPriority(i7);
                    }
                }
            }
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    private void s() {
        JSONObject jSONObject;
        Iterator<String> it;
        NetworkSettings networkSettings;
        try {
            this.f18233b = dq.c();
            JSONObject c4 = c(this.f18237f, "providerSettings");
            Iterator<String> keys = c4.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = c4.optJSONObject(next);
                if (optJSONObject != null) {
                    boolean optBoolean = optJSONObject.optBoolean("mpis", false);
                    String optString = optJSONObject.optString("spId", "0");
                    String optString2 = optJSONObject.optString("adSourceName", null);
                    String optString3 = optJSONObject.optString("providerNetworkKey", null);
                    String optString4 = optJSONObject.optString("providerLoadName", next);
                    String optString5 = optJSONObject.optString("providerDefaultInstance", optString4);
                    JSONObject c5 = c(optJSONObject, b());
                    JSONObject c6 = c(optJSONObject, "application");
                    JSONObject c7 = c(c5, l());
                    JSONObject c8 = c(c5, "interstitial");
                    JSONObject c9 = c(c5, "banner");
                    JSONObject c10 = c(c5, "nativeAd");
                    JSONObject mergeJsons = IronSourceUtils.mergeJsons(c7, c6);
                    JSONObject mergeJsons2 = IronSourceUtils.mergeJsons(c8, c6);
                    JSONObject mergeJsons3 = IronSourceUtils.mergeJsons(c9, c6);
                    JSONObject mergeJsons4 = IronSourceUtils.mergeJsons(c10, c6);
                    if (this.f18233b.a(next)) {
                        br.i().a(new zb(IronSourceConstants.TROUBLESHOOTING_MERGE_LOCAL_SETTINGS, null));
                        NetworkSettings b4 = this.f18233b.b(next);
                        JSONObject rewardedVideoSettings = b4.getRewardedVideoSettings();
                        JSONObject interstitialSettings = b4.getInterstitialSettings();
                        JSONObject bannerSettings = b4.getBannerSettings();
                        JSONObject nativeAdSettings = b4.getNativeAdSettings();
                        b4.setRewardedVideoSettings(IronSourceUtils.mergeJsons(rewardedVideoSettings, mergeJsons));
                        b4.setInterstitialSettings(IronSourceUtils.mergeJsons(interstitialSettings, mergeJsons2));
                        b4.setBannerSettings(IronSourceUtils.mergeJsons(bannerSettings, mergeJsons3));
                        b4.setNativeAdSettings(IronSourceUtils.mergeJsons(nativeAdSettings, mergeJsons4));
                        b4.setIsMultipleInstances(optBoolean);
                        b4.setSubProviderId(optString);
                        b4.setAdSourceNameForEvents(optString2);
                        b4.setProviderNetworkKey(optString3);
                    } else {
                        if (b(optString4)) {
                            jSONObject = c4;
                            NetworkSettings b5 = this.f18233b.b("Mediation");
                            JSONObject rewardedVideoSettings2 = b5.getRewardedVideoSettings();
                            JSONObject interstitialSettings2 = b5.getInterstitialSettings();
                            JSONObject bannerSettings2 = b5.getBannerSettings();
                            JSONObject nativeAdSettings2 = b5.getNativeAdSettings();
                            it = keys;
                            networkSettings = new NetworkSettings(next, optString4, optString5, optString3, c6, IronSourceUtils.mergeJsons(new JSONObject(rewardedVideoSettings2.toString()), mergeJsons), IronSourceUtils.mergeJsons(new JSONObject(interstitialSettings2.toString()), mergeJsons2), IronSourceUtils.mergeJsons(new JSONObject(bannerSettings2.toString()), mergeJsons3), IronSourceUtils.mergeJsons(new JSONObject(nativeAdSettings2.toString()), mergeJsons4));
                            networkSettings.setIsMultipleInstances(optBoolean);
                            networkSettings.setSubProviderId(optString);
                            networkSettings.setAdSourceNameForEvents(optString2);
                        } else {
                            jSONObject = c4;
                            it = keys;
                            networkSettings = new NetworkSettings(next, optString4, optString5, optString3, c6, mergeJsons, mergeJsons2, mergeJsons3, mergeJsons4);
                            networkSettings.setIsMultipleInstances(optBoolean);
                            networkSettings.setSubProviderId(optString);
                            networkSettings.setAdSourceNameForEvents(optString2);
                        }
                        this.f18233b.a(networkSettings);
                        c4 = jSONObject;
                        keys = it;
                    }
                }
            }
            this.f18233b.b();
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    public mc e() {
        return this.f18242k;
    }

    public a h() {
        return this.f18239h;
    }

    public JSONObject i() {
        return this.f18237f;
    }

    public bq j() {
        return this.f18232a;
    }

    public dq k() {
        return this.f18233b;
    }

    public boolean o() {
        return !TextUtils.isEmpty(c().g().b());
    }

    public boolean p() {
        JSONObject jSONObject = this.f18237f;
        return (jSONObject == null || jSONObject.has("error") || this.f18232a == null || this.f18233b == null || this.f18234c == null || !m()) ? false : true;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appKey", this.f18235d);
            jSONObject.put("userId", this.f18236e);
            jSONObject.put(f18193n, this.f18237f);
        } catch (JSONException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
        return jSONObject.toString();
    }

    public ms(ms msVar) {
        this.f18239h = a.NOT_SET;
        this.f18241j = false;
        try {
            this.f18238g = msVar.d();
            this.f18237f = new JSONObject(msVar.f18237f.toString());
            this.f18235d = msVar.f18235d;
            this.f18236e = msVar.f18236e;
            this.f18241j = msVar.f18241j;
            this.f18232a = msVar.j();
            this.f18233b = msVar.k();
            this.f18234c = msVar.c();
            this.f18239h = msVar.h();
            this.f18240i = nm.M().m();
            b(this.f18237f);
        } catch (Exception e4) {
            o9.d().a(e4);
            a();
        }
    }

    private long a(JSONObject jSONObject, JSONObject jSONObject2, String str, long j4) {
        long optLong = jSONObject.has(str) ? jSONObject.optLong(str, 0L) : jSONObject2.has(str) ? jSONObject2.optLong(str, 0L) : 0L;
        return optLong == 0 ? j4 : optLong;
    }

    private String b() {
        return this.f18241j ? "adFormats" : C1597y2.f20367c;
    }

    private h7 d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("placementId", -1);
        String optString = jSONObject.optString("placementName", "");
        boolean optBoolean = jSONObject.optBoolean(f18173g1, false);
        mp a4 = a(jSONObject);
        if (optInt < 0 || TextUtils.isEmpty(optString)) {
            return null;
        }
        h7 h7Var = new h7(optInt, optString, optBoolean, a4);
        if (a4 != null) {
            this.f18240i.c(this.f18238g, h7Var, IronSource.AD_UNIT.BANNER);
        }
        return h7Var;
    }

    private InterstitialPlacement e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("placementId", -1);
        String optString = jSONObject.optString("placementName", "");
        boolean optBoolean = jSONObject.optBoolean(f18173g1, false);
        mp a4 = a(jSONObject);
        if (optInt < 0 || TextUtils.isEmpty(optString)) {
            return null;
        }
        InterstitialPlacement interstitialPlacement = new InterstitialPlacement(optInt, optString, optBoolean, a4);
        if (a4 != null) {
            this.f18240i.c(this.f18238g, interstitialPlacement, IronSource.AD_UNIT.INTERSTITIAL);
        }
        return interstitialPlacement;
    }

    private qu h(JSONObject jSONObject) {
        qu quVar = new qu();
        JSONObject c4 = c(jSONObject, "testSuite");
        if (c4 != null) {
            quVar.b(c4.optString("controllerUrl"));
        }
        return quVar;
    }

    public s8 c() {
        return this.f18234c;
    }

    public mi f() {
        return new mi(this.f18235d, this.f18236e);
    }

    public List<IronSource.AD_UNIT> g() {
        bq bqVar;
        bq bqVar2;
        bq bqVar3;
        bq bqVar4;
        if (this.f18237f == null || this.f18234c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f18234c.f() != null && (bqVar4 = this.f18232a) != null && !bqVar4.d().isEmpty()) {
            arrayList.add(IronSource.AD_UNIT.REWARDED_VIDEO);
        }
        if (this.f18234c.d() != null && (bqVar3 = this.f18232a) != null && !bqVar3.b().isEmpty()) {
            arrayList.add(IronSource.AD_UNIT.INTERSTITIAL);
        }
        if (this.f18234c.c() != null && (bqVar2 = this.f18232a) != null && !bqVar2.a().isEmpty()) {
            arrayList.add(IronSource.AD_UNIT.BANNER);
        }
        if (this.f18234c.e() != null && (bqVar = this.f18232a) != null && !bqVar.c().isEmpty()) {
            arrayList.add(IronSource.AD_UNIT.NATIVE_AD);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r7.toString().equals(r6) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private mp a(JSONObject jSONObject) {
        qp qpVar = null;
        if (jSONObject == null) {
            return null;
        }
        mp.b bVar = new mp.b();
        bVar.a(jSONObject.optBoolean("delivery", true));
        JSONObject optJSONObject = jSONObject.optJSONObject("capping");
        if (optJSONObject != null) {
            String optString = optJSONObject.optString(f18192m1);
            if (!TextUtils.isEmpty(optString)) {
                qp qpVar2 = qp.PER_DAY;
                if (!qpVar2.toString().equals(optString)) {
                    qpVar2 = qp.PER_HOUR;
                }
                qpVar = qpVar2;
            }
            int optInt = optJSONObject.optInt(f18185k1, 0);
            bVar.a(optJSONObject.optBoolean("enabled", false) && optInt > 0, qpVar, optInt);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("pacing");
        if (optJSONObject2 != null) {
            int optInt2 = optJSONObject2.optInt(f18189l1, 0);
            bVar.a(optJSONObject2.optBoolean("enabled", false) && optInt2 > 0, optInt2);
        }
        return bVar.a();
    }

    private JSONArray b(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        if (!this.f18241j) {
            return jSONObject.optJSONArray(str);
        }
        JSONObject c4 = c(jSONObject, str);
        String a4 = a(str);
        if (c4 == null || a4 == null) {
            return null;
        }
        return c4.optJSONArray(a4);
    }

    @Nullable
    private JSONObject c(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    @NotNull
    private JSONObject d(JSONObject jSONObject, String str) {
        JSONObject c4 = c(jSONObject, str);
        return c4 != null ? c4 : new JSONObject();
    }

    public static a a(ms msVar) {
        return msVar != null ? msVar.h() : a.NOT_SET;
    }

    private void b(@NotNull JSONObject jSONObject) {
        this.f18242k = new mc(jSONObject.optJSONObject(ur.f19945d));
    }

    private String a(String str) {
        try {
            JSONObject c4 = c(c(c(c(this.f18237f, "configurations"), "adFormats"), str), C1597y2.f20367c);
            if (c4 == null) {
                return null;
            }
            Iterator<String> keys = c4.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject c5 = c(c4, next);
                if (c5 != null && c5.optBoolean(f18173g1)) {
                    return next;
                }
            }
            return null;
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            return null;
        }
    }

    private boolean b(String str) {
        return this.f18233b.a("Mediation") && StringUtils.toLowerCase("IronSource").equals(StringUtils.toLowerCase(str));
    }

    private void a() {
        this.f18237f = new JSONObject();
        this.f18235d = "";
        this.f18236e = "";
        this.f18232a = new bq();
        this.f18233b = dq.c();
        this.f18234c = new s8.a().a();
        this.f18240i = nm.M().m();
        b(this.f18237f);
    }

    public void a(a aVar) {
        this.f18239h = aVar;
    }

    private boolean a(JSONObject jSONObject, JSONObject jSONObject2, String str, boolean z4) {
        return jSONObject.has(str) ? jSONObject.optBoolean(str, z4) : jSONObject2.has(str) ? jSONObject2.optBoolean(str, z4) : z4;
    }

    private int[] a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        int[] iArr = new int[optJSONArray.length()];
        for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
            iArr[i4] = optJSONArray.optInt(i4);
        }
        return iArr;
    }
}
