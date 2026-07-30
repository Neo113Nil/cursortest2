package com.anythink.core.common.d;

import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATCustomContentResult;
import com.anythink.core.api.ATRewardInfo;
import com.anythink.core.api.BaseAd;
import com.anythink.core.basead.adx.api.IATAdxHandler;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.aa;
import com.anythink.core.common.h.ad;
import com.anythink.core.d.l;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l extends ATAdInfo {

    /* renamed from: C, reason: collision with root package name */
    private Map<String, Object> f12826C;

    /* renamed from: H, reason: collision with root package name */
    private Map<String, Object> f12831H;

    /* renamed from: K, reason: collision with root package name */
    private double f12833K;

    /* renamed from: a, reason: collision with root package name */
    private ATBaseAdAdapter f12843a;

    /* renamed from: f, reason: collision with root package name */
    private double f12848f;

    /* renamed from: g, reason: collision with root package name */
    private String f12849g;

    /* renamed from: h, reason: collision with root package name */
    private String f12850h;
    private int i;

    /* renamed from: m, reason: collision with root package name */
    private Double f12854m;

    /* renamed from: b, reason: collision with root package name */
    private int f12844b = -1;

    /* renamed from: c, reason: collision with root package name */
    private String f12845c = "";

    /* renamed from: d, reason: collision with root package name */
    private int f12846d = -1;

    /* renamed from: e, reason: collision with root package name */
    private double f12847e = 0.0d;

    /* renamed from: j, reason: collision with root package name */
    private int f12851j = 0;

    /* renamed from: k, reason: collision with root package name */
    private String f12852k = "";

    /* renamed from: l, reason: collision with root package name */
    private Double f12853l = Double.valueOf(0.0d);

    /* renamed from: n, reason: collision with root package name */
    private String f12855n = "";

    /* renamed from: o, reason: collision with root package name */
    private String f12856o = "";

    /* renamed from: p, reason: collision with root package name */
    private String f12857p = "";

    /* renamed from: q, reason: collision with root package name */
    private String f12858q = "";

    /* renamed from: r, reason: collision with root package name */
    private String f12859r = "unknow";

    /* renamed from: s, reason: collision with root package name */
    private String f12860s = "Network";

    /* renamed from: t, reason: collision with root package name */
    private String f12861t = "";

    /* renamed from: u, reason: collision with root package name */
    private int f12862u = 1;

    /* renamed from: v, reason: collision with root package name */
    private int f12863v = 0;

    /* renamed from: w, reason: collision with root package name */
    private String f12864w = "";

    /* renamed from: x, reason: collision with root package name */
    private String f12865x = "";

    /* renamed from: y, reason: collision with root package name */
    private int f12866y = 0;

    /* renamed from: z, reason: collision with root package name */
    private String f12867z = "";

    /* renamed from: A, reason: collision with root package name */
    private String f12824A = "";

    /* renamed from: B, reason: collision with root package name */
    private Map<String, Object> f12825B = null;

    /* renamed from: D, reason: collision with root package name */
    private String f12827D = "";

    /* renamed from: E, reason: collision with root package name */
    private int f12828E = 0;

    /* renamed from: F, reason: collision with root package name */
    private String f12829F = "";

    /* renamed from: G, reason: collision with root package name */
    private int f12830G = 0;

    /* renamed from: I, reason: collision with root package name */
    private int f12832I = 1;
    private String J = "";

    /* renamed from: L, reason: collision with root package name */
    private IATAdxHandler f12834L = null;

    /* renamed from: M, reason: collision with root package name */
    private int f12835M = -1;

    /* renamed from: N, reason: collision with root package name */
    private String f12836N = "";

    /* renamed from: P, reason: collision with root package name */
    private String f12838P = "";

    /* renamed from: Q, reason: collision with root package name */
    private String f12839Q = "";

    /* renamed from: O, reason: collision with root package name */
    private Map<String, String> f12837O = new HashMap();

    /* renamed from: R, reason: collision with root package name */
    private String f12840R = "";

    /* renamed from: T, reason: collision with root package name */
    private ATCustomContentResult f12842T = null;

    /* renamed from: S, reason: collision with root package name */
    private int f12841S = 0;

    /* renamed from: com.anythink.core.common.d.l$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12868a;

        static {
            int[] iArr = new int[ATAdConst.CURRENCY.values().length];
            f12868a = iArr;
            try {
                iArr[ATAdConst.CURRENCY.RMB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12868a[ATAdConst.CURRENCY.RMB_CENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12868a[ATAdConst.CURRENCY.USD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r10 != 5) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (r1.f13516g == 3) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        r9.M();
        r8.f12847e = 0.0d;
        r8.f12848f = 0.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r1.f13515f == 3) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r1.f13514e == 3) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (r1.f13513d == 3) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        if (r1.f13517h == 3) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0105, code lost:
    
        if (r10.equals(com.anythink.core.common.h.ad.f13557y) == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static l a(l lVar, com.anythink.core.common.h.n nVar, int i) {
        String str;
        ATRewardInfo F8;
        ATRewardInfo aTRewardInfo;
        char c4 = 2;
        lVar.f12844b = nVar.Y();
        lVar.f12845c = nVar.M();
        lVar.f12846d = nVar.P();
        lVar.f12851j = nVar.J();
        lVar.f12847e = nVar.p();
        lVar.f12848f = nVar.q();
        if (nVar.J() == 1) {
            aa ap = nVar.ap();
            Objects.toString(ap);
            if (ap != null) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                }
                            }
                        }
                    }
                }
            }
            nVar.M();
        }
        lVar.f12849g = nVar.r();
        lVar.f12850h = nVar.s();
        lVar.i = nVar.t();
        lVar.f12833K = nVar.e();
        lVar.f12855n = nVar.v();
        lVar.f12852k = nVar.z();
        lVar.f12853l = Double.valueOf(lVar.f12847e / 1000.0d);
        lVar.f12854m = Double.valueOf(lVar.f12848f / 1000.0d);
        lVar.f12856o = nVar.C();
        lVar.f12858q = com.anythink.core.common.v.p.f(nVar.aK());
        String aI = nVar.aI();
        String g9 = nVar.g();
        if (TextUtils.isEmpty(g9) || TextUtils.equals(aI, g9)) {
            str = "";
        } else {
            str = aI;
            aI = g9;
        }
        lVar.f12857p = aI;
        lVar.J = str;
        lVar.f12859r = nVar.B();
        if (nVar.Y() == 35) {
            lVar.f12860s = "Cross_Promotion";
        } else if (nVar.Y() == 66) {
            String au = nVar.au();
            au.getClass();
            switch (au.hashCode()) {
                case 2545:
                    if (au.equals(ad.f13551A)) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 2548:
                    if (au.equals(ad.f13558z)) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 79054:
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            switch (c4) {
                case 0:
                    lVar.f12860s = "Adx_pa";
                    break;
                case 1:
                    lVar.f12860s = "Adx_pd";
                    break;
                case 2:
                    lVar.f12860s = "Adx_pdb";
                    break;
                default:
                    lVar.f12860s = "Adx";
                    break;
            }
        } else {
            lVar.f12860s = "Network";
        }
        lVar.f12861t = nVar.y();
        lVar.f12862u = nVar.A();
        lVar.f12863v = nVar.Z();
        lVar.f12864w = nVar.f14168F;
        if (TextUtils.equals(j.n.f12663b, lVar.f12858q)) {
            Map<String, ATRewardInfo> E8 = nVar.E();
            if (E8 != null && E8.containsKey(lVar.f12864w) && (aTRewardInfo = E8.get(lVar.f12864w)) != null) {
                lVar.f12865x = aTRewardInfo.rewardName;
                lVar.f12866y = aTRewardInfo.rewardNumber;
            }
            if ((TextUtils.isEmpty(lVar.f12865x) || lVar.f12866y == 0) && (F8 = nVar.F()) != null) {
                lVar.f12865x = F8.rewardName;
                lVar.f12866y = F8.rewardNumber;
            }
        }
        lVar.f12824A = t.b().n();
        lVar.f12867z = t.b().o();
        lVar.f12825B = nVar.G();
        lVar.f12827D = nVar.o();
        lVar.f12828E = nVar.ae();
        lVar.f12829F = nVar.aB();
        lVar.f12830G = nVar.aG();
        Map<String, Object> j9 = nVar.j();
        if (j9 != null) {
            lVar.f12831H = new HashMap(j9);
        }
        lVar.f12832I = nVar.i();
        Map<String, String> al = nVar.al();
        if (al != null) {
            lVar.f12837O = new HashMap(al);
        }
        lVar.f12838P = nVar.aF();
        lVar.f12839Q = nVar.ak();
        lVar.f12840R = nVar.aJ();
        lVar.f12842T = nVar.aq();
        lVar.f12841S = com.anythink.core.common.v.p.e(nVar.k());
        return lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r5 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r0.f13516g == 3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r4.M();
        r3.f12847e = 0.0d;
        r3.f12848f = 0.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        if (r0.f13515f == 3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
    
        if (r0.f13514e == 3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
    
        if (r0.f13513d == 3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
    
        if (r0.f13517h == 3) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(l lVar, com.anythink.core.common.h.n nVar, int i) {
        lVar.f12847e = nVar.p();
        lVar.f12848f = nVar.q();
        if (nVar.J() != 1) {
            return;
        }
        aa ap = nVar.ap();
        Objects.toString(ap);
        if (ap != null) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                            }
                        }
                    }
                }
            }
        }
        nVar.M();
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getABTestId() {
        return this.f12830G;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getAdNetworkType() {
        return this.f12860s;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getAdSourceAdType() {
        return this.f12835M;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getAdSourceCustomExt() {
        return this.f12836N;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getAdsourceId() {
        return this.f12845c;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getAdsourceIndex() {
        return this.f12846d;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final IATAdxHandler getAdxHandler() {
        return this.f12834L;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final double getBidFloor() {
        return this.f12833K;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getBidType() {
        return this.f12841S;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getChannel() {
        return this.f12824A;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getCountry() {
        return this.f12856o;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getCurrency() {
        return this.f12855n;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final ATCustomContentResult getCustomContentResult() {
        return this.f12842T;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getCustomRule() {
        return this.f12825B != null ? new JSONObject(this.f12825B).toString() : "";
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getDismissType() {
        return this.f12828E;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final double getEcpm() {
        return this.f12847e;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getEcpmLevel() {
        return this.f12862u;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getEcpmPrecision() {
        return this.f12859r;
    }

    @Override // com.anythink.core.api.ATAdInfo
    @Deprecated
    public final double getEcpmWithCurrency(ATAdConst.CURRENCY currency) {
        return com.anythink.core.common.v.t.a(this.f12847e, com.anythink.core.common.v.t.a(this.f12855n), currency);
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getEncEcpmInfo() {
        return this.f12849g;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final Map<String, Object> getExtInfoMap() {
        return this.f12826C;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getFormat() {
        return this.f12858q;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final Map<String, Object> getLocalExtra() {
        return this.f12831H;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getNetworkFirmId() {
        return this.f12844b;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getNetworkName() {
        return this.f12838P;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getNetworkPlacementId() {
        return this.f12861t;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getPlacementId() {
        return this.f12857p;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getPlacementType() {
        return this.f12832I;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final Double getPublisherRevenue() {
        return this.f12853l;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getRequestId() {
        return this.f12840R;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getRewardUserCustomData() {
        ATBaseAdAdapter aTBaseAdAdapter = this.f12843a;
        return aTBaseAdAdapter != null ? aTBaseAdAdapter.getUserCustomData() : "";
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getRmbEncEcpmInfo() {
        return this.f12850h;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getScenarioId() {
        return this.f12864w;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getScenarioRewardName() {
        return this.f12865x;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getScenarioRewardNumber() {
        return this.f12866y;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getSecretId() {
        return this.i;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getSegmentId() {
        return this.f12863v;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getSharedPlacementId() {
        return this.J;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getShowCustomExt() {
        return this.f12839Q;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getShowId() {
        return this.f12852k;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getSubChannel() {
        return this.f12867z;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getTopOnAdFormat() {
        return this.f12858q;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getTopOnPlacementId() {
        return this.f12857p;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getTpBidId() {
        return this.f12827D;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final Map<String, String> getUrlTagParams() {
        return this.f12837O;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getWaterfallId() {
        return this.f12829F;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int isHeaderBiddingAdsource() {
        return this.f12851j;
    }

    public final String toString() {
        return a().toString();
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final double getEcpm(ATAdConst.CURRENCY currency) {
        int i = AnonymousClass1.f12868a[currency.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? getEcpmWithCurrency(currency) : this.f12847e : this.f12848f * 100.0d : this.f12848f;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final Double getPublisherRevenue(ATAdConst.CURRENCY currency) {
        int i = AnonymousClass1.f12868a[currency.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? getPublisherRevenue() : this.f12853l : Double.valueOf(this.f12854m.doubleValue() * 100.0d) : this.f12854m;
    }

    public final void b(double d2) {
        this.f12848f = d2;
        this.f12854m = Double.valueOf(d2 / 1000.0d);
    }

    public static l a(BaseAd baseAd, ATBaseAdAdapter aTBaseAdAdapter) {
        return a(baseAd, aTBaseAdAdapter, 0);
    }

    public static l a(BaseAd baseAd, ATBaseAdAdapter aTBaseAdAdapter, int i) {
        if (baseAd != null) {
            l a9 = a(a(baseAd.getDetail(), i), aTBaseAdAdapter);
            a9.f12826C = baseAd.getNetworkInfoMap();
            return a9;
        }
        return new l();
    }

    private static l a(l lVar, f fVar) {
        if (fVar != null && (fVar instanceof ATBaseAdAdapter)) {
            ATBaseAdAdapter aTBaseAdAdapter = (ATBaseAdAdapter) fVar;
            lVar.f12843a = aTBaseAdAdapter;
            lVar.f12826C = aTBaseAdAdapter.getInternalNetworkInfoMap();
            lVar.f12835M = lVar.f12843a.getTrackingInfo().ad();
            lVar.f12836N = aTBaseAdAdapter.getAdCustomExt();
            try {
                if (lVar.f12843a.getTrackingInfo().ah()) {
                    lVar.f12834L = lVar.f12843a.getUnitGroupInfo().R().i();
                    return lVar;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return lVar;
    }

    public static l a(f fVar) {
        return a(fVar, 0);
    }

    public static l a(f fVar, int i) {
        if (fVar != null) {
            return a(a(fVar.getTrackingInfo(), i), fVar);
        }
        return new l();
    }

    public static l a(com.anythink.core.common.h.n nVar, f fVar, int i) {
        return a(a(nVar, i), fVar);
    }

    public static l a(com.anythink.core.common.h.n nVar, f fVar) {
        return a(nVar, fVar, 0);
    }

    private static l a(com.anythink.core.common.h.n nVar, int i) {
        l lVar = new l();
        return nVar != null ? a(lVar, nVar, i) : lVar;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f12852k);
            jSONObject.put("publisher_revenue", this.f12853l);
            jSONObject.put("publisher_revenue_cny", this.f12854m);
            jSONObject.put("currency", this.f12855n);
            jSONObject.put("country", this.f12856o);
            jSONObject.put("adunit_id", this.f12857p);
            jSONObject.put("adunit_format", this.f12858q);
            jSONObject.put(com.anythink.core.common.k.f14453T, this.f12859r);
            jSONObject.put("network_type", this.f12860s);
            jSONObject.put("network_placement_id", this.f12861t);
            jSONObject.put(com.anythink.core.common.k.f14452S, this.f12862u);
            jSONObject.put("segment_id", this.f12863v);
            if (!TextUtils.isEmpty(this.f12864w)) {
                jSONObject.put("scenario_id", this.f12864w);
            }
            if (!TextUtils.isEmpty(this.f12865x) && this.f12866y != 0) {
                jSONObject.put("scenario_reward_name", this.f12865x);
                jSONObject.put("scenario_reward_number", this.f12866y);
            }
            if (!TextUtils.isEmpty(this.f12824A)) {
                jSONObject.put("channel", this.f12824A);
            }
            if (!TextUtils.isEmpty(this.f12867z)) {
                jSONObject.put("sub_channel", this.f12867z);
            }
            Map<String, Object> map = this.f12825B;
            if (map != null && map.size() > 0) {
                jSONObject.put("custom_rule", new JSONObject(this.f12825B));
            }
            jSONObject.put("network_firm_id", this.f12844b);
            jSONObject.put("adsource_id", this.f12845c);
            jSONObject.put("adsource_index", this.f12846d);
            jSONObject.put("adsource_price", this.f12847e);
            jSONObject.put("adsource_price_cny", this.f12848f);
            jSONObject.put("adsource_isheaderbidding", this.f12851j);
            Map<String, Object> map2 = this.f12826C;
            if (map2 != null && map2.size() > 0) {
                jSONObject.put("ext_info", new JSONObject(this.f12826C));
            }
            ATBaseAdAdapter aTBaseAdAdapter = this.f12843a;
            if (aTBaseAdAdapter != null) {
                jSONObject.put("reward_custom_data", aTBaseAdAdapter.getUserCustomData());
            }
            if (!TextUtils.isEmpty(this.f12827D)) {
                jSONObject.put("tp_bid_id", this.f12827D);
            }
            int i = this.f12828E;
            if (i != 0) {
                jSONObject.put("dismiss_type", i);
            }
            if (!TextUtils.isEmpty(this.f12829F)) {
                jSONObject.put(l.a.f17559T, this.f12829F);
            }
            jSONObject.put(com.anythink.core.common.m.e.J, this.f12830G);
            Map<String, Object> map3 = this.f12831H;
            if (map3 != null && map3.size() > 0) {
                jSONObject.put("user_load_extra_data", new JSONObject(this.f12831H));
            }
            jSONObject.put("placement_type", this.f12832I);
            if (!TextUtils.isEmpty(this.J)) {
                jSONObject.put("shared_placement_id", this.J);
            }
            jSONObject.put("bid_floor", this.f12833K);
            jSONObject.put("ad_source_type", this.f12835M);
            jSONObject.put("ad_source_custom_ext", this.f12836N);
            jSONObject.put("url_tag_params", this.f12837O);
            jSONObject.put(ATAdConst.NETWORK_CUSTOM_KEY.NETWORK_NAME, this.f12838P);
            jSONObject.put("show_custom_ext", this.f12839Q);
            if (!TextUtils.isEmpty(this.f12849g)) {
                jSONObject.put(com.anythink.core.common.k.aS, this.f12849g);
            }
            if (!TextUtils.isEmpty(this.f12850h)) {
                jSONObject.put(com.anythink.core.common.k.aT, this.f12850h);
            }
            jSONObject.put(l.a.aD, this.i);
            jSONObject.put("req_id", this.f12840R);
            jSONObject.put(com.anythink.core.common.k.J, this.f12841S);
            return jSONObject;
        } catch (Throwable th) {
            th.printStackTrace();
            return jSONObject;
        }
    }

    public final void a(double d2) {
        this.f12847e = d2;
        this.f12853l = Double.valueOf(d2 / 1000.0d);
    }
}
