package com.anythink.core.b;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBidRequestInfo;
import com.anythink.core.api.ATBiddingResult;
import com.anythink.core.api.AdError;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.ad;
import com.anythink.core.common.h.ap;
import com.anythink.core.common.h.ar;
import com.anythink.core.common.h.aw;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.p;
import com.anythink.core.common.h.z;
import com.anythink.core.common.v.ab;
import com.anythink.core.common.v.ae;
import com.anythink.core.common.v.aj;
import com.anythink.core.common.v.u;
import com.anythink.core.d.l;
import com.anythink.core.d.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a extends d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11765a = "a";

    /* renamed from: b, reason: collision with root package name */
    private List<bv> f11766b;

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.core.b.b.b f11767c;

    /* renamed from: d, reason: collision with root package name */
    private long f11768d;

    /* renamed from: e, reason: collision with root package name */
    private List<ATBaseAdAdapter> f11769e;

    /* renamed from: j, reason: collision with root package name */
    private l f11770j;

    /* renamed from: com.anythink.core.b.a$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11783a;

        static {
            int[] iArr = new int[ATAdConst.CURRENCY.values().length];
            f11783a = iArr;
            try {
                iArr[ATAdConst.CURRENCY.RMB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11783a[ATAdConst.CURRENCY.RMB_CENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11783a[ATAdConst.CURRENCY.USD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public a(com.anythink.core.common.h.a aVar) {
        super(aVar);
        this.f11766b = Collections.synchronizedList(new ArrayList(this.f11893f.f13491j));
        this.f11769e = Collections.synchronizedList(new ArrayList());
    }

    private static int b(ATBiddingResult aTBiddingResult) {
        if (aTBiddingResult.isSuccessWithUseType()) {
            return 0;
        }
        return TextUtils.equals(aTBiddingResult.errorMsg, ATBidRequestInfo.BID_TYPE_ERROR_TYPE) ? -10 : -1;
    }

    private static boolean b(double d2, bv bvVar) {
        double aP = bvVar.aP();
        return aP <= 0.0d || d2 <= aP;
    }

    @Override // com.anythink.core.b.d
    public final void a(final com.anythink.core.b.b.b bVar) {
        this.f11767c = bVar;
        List<bv> list = this.f11893f.f13491j;
        this.f11768d = SystemClock.elapsedRealtime();
        for (int i = 0; i < list.size(); i++) {
            final bv bvVar = list.get(i);
            if (bvVar != null) {
                long bq = bvVar.bq();
                if (bq > 0) {
                    com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.b.a.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (a.this.f11895h.get()) {
                                bvVar.z();
                            } else {
                                a.this.a(bvVar, bVar);
                            }
                        }
                    }, bq);
                } else {
                    a(bvVar, bVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final bv bvVar, com.anythink.core.b.b.b bVar) {
        p a9 = u.a(bvVar);
        ATBaseAdAdapter aTBaseAdAdapter = a9 != null ? a9.f14192a : null;
        if (aTBaseAdAdapter == null) {
            String str = bvVar.m() + " not exist!";
            if (a9 != null) {
                str = a9.a(str);
            }
            a(false, ATBiddingResult.fail(str), bvVar, -9, (com.anythink.core.b.c.b) null, (com.anythink.core.b.c.a) null);
            return;
        }
        this.f11769e.add(aTBaseAdAdapter);
        try {
            com.anythink.core.b.b.c cVar = new com.anythink.core.b.b.c(aTBaseAdAdapter) { // from class: com.anythink.core.b.a.2
                private void a(final ATBiddingResult aTBiddingResult, final com.anythink.core.b.c.b bVar2, final com.anythink.core.b.c.a aVar) {
                    com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.b.a.2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.this.a(aTBiddingResult.isSuccessWithUseType(), aTBiddingResult, bvVar, a.a(aTBiddingResult), bVar2, aVar);
                        }
                    });
                }

                @Override // com.anythink.core.api.ATBiddingListener
                public final void onC2SBidResult(ATBiddingResult aTBiddingResult) {
                    ATBaseAdAdapter aTBaseAdAdapter2 = this.f11883c;
                    String str2 = "";
                    if (aTBaseAdAdapter2 != null) {
                        try {
                            str2 = aTBaseAdAdapter2.getInternalNetworkSDKVersion();
                        } catch (Throwable unused) {
                        }
                        a.this.f11769e.remove(this.f11883c);
                        this.f11883c.releaseLoadResource();
                    }
                    a(aTBiddingResult, null, new com.anythink.core.b.c.a(str2));
                }

                @Override // com.anythink.core.api.ATBiddingListener
                public final void onC2SBiddingResultWithCache(ATBiddingResult aTBiddingResult, BaseAd baseAd) {
                    ATBaseAdAdapter aTBaseAdAdapter2 = this.f11883c;
                    String str2 = "";
                    if (aTBaseAdAdapter2 != null) {
                        try {
                            str2 = aTBaseAdAdapter2.getInternalNetworkSDKVersion();
                        } catch (Throwable unused) {
                        }
                        a.this.f11769e.remove(this.f11883c);
                        this.f11883c.releaseLoadResource();
                    }
                    a(aTBiddingResult, new com.anythink.core.b.c.b(this.f11883c, baseAd), new com.anythink.core.b.c.a(str2));
                }
            };
            aTBaseAdAdapter.getInternalNetworkName();
            this.f11770j = n.a(this.f11893f.f13484b).a(this.f11893f.f13487e);
            ar arVar = this.f11893f.f13485c;
            ATAdRequest b9 = arVar != null ? arVar.b() : null;
            l lVar = this.f11770j;
            com.anythink.core.common.h.a aVar = this.f11893f;
            Map<String, Object> a10 = lVar.a(aVar.f13487e, aVar.f13486d, bvVar, b9);
            try {
                double a11 = com.anythink.core.b.d.b.a(this.f11893f, bvVar);
                if (a11 > 0.0d) {
                    a10.put("bid_floor", Double.valueOf(a11 * a(bvVar)));
                }
            } catch (Throwable th) {
                Log.w(ab.f16779a, "C2S startBidRequest with exception:" + th.getMessage());
            }
            com.anythink.core.common.h.n af = this.f11893f.f13500s.af();
            aj.a(af, bvVar, 0, false);
            com.anythink.core.common.v.p.a(a10, af);
            if (bvVar.g() == 22) {
                com.anythink.core.common.v.f.a(this.f11770j, a10, bvVar, this.f11893f.f13505x);
            }
            ar arVar2 = this.f11893f.f13485c;
            Context a12 = arVar2 != null ? arVar2.a() : null;
            if (a12 == null) {
                a12 = this.f11893f.f13484b;
            }
            com.anythink.core.common.h.a aVar2 = this.f11893f;
            boolean internalStartBiddingRequest = aTBaseAdAdapter.internalStartBiddingRequest(a12, a10, aVar2.f13498q, new com.anythink.core.b.b.a(aVar2.f13500s, bvVar.z(), a10, cVar));
            if (bVar != null) {
                bVar.a(bvVar, aTBaseAdAdapter);
            }
            if (internalStartBiddingRequest) {
                return;
            }
            a(ATBiddingResult.fail("This network don't support head bidding in current TopOn's version."), bvVar);
        } catch (Throwable th2) {
            th2.printStackTrace();
            a(ATBiddingResult.fail(th2.getMessage()), bvVar);
        }
    }

    private boolean a(final bv bvVar, z zVar, long j9, int i, com.anythink.core.b.c.b bVar, com.anythink.core.b.c.a aVar) {
        int i4;
        final ATBaseAdAdapter a9;
        boolean isSuccessWithUseType = zVar.isSuccessWithUseType();
        ad a10 = a(bvVar, zVar, j9, bVar, aVar);
        double price = isSuccessWithUseType ? a10.getPrice() : 0.0d;
        boolean a11 = d.a(isSuccessWithUseType, bvVar, a10);
        double aP = bvVar.aP();
        boolean z8 = aP <= 0.0d || price <= aP;
        AdError a12 = ae.a(0, this.f11893f.f13500s, bvVar, a10);
        boolean z9 = a12 != null;
        if (isSuccessWithUseType && !a11 && z8 && !z9) {
            bvVar.z();
            bvVar.g();
            zVar.getPrice();
            zVar.getSortPrice();
            zVar.currency.toString();
            a(bvVar, a10);
            String str = j.r.f12697m;
            com.anythink.core.common.h.a aVar2 = this.f11893f;
            ab.a(str, aVar2.f13487e, com.anythink.core.common.v.p.f(String.valueOf(aVar2.f13488f)), bvVar);
            return true;
        }
        if (a11) {
            d.a(bvVar, ATBidRequestInfo.LESS_THAN_BID_FLOOR_TYPE, j9, -11);
            bvVar.b(price);
            bvVar.e(a10.getSortPrice());
            a(a10, bvVar);
        } else if (z9) {
            d.a(bvVar, a12.getPlatformMSG(), j9, -13);
            bvVar.b(price);
            bvVar.e(a10.getSortPrice());
            b(a10, bvVar);
        } else {
            if (z8 || bvVar.g() != 72) {
                i4 = i;
            } else {
                zVar.errorMsg = ATBidRequestInfo.JAD_PRICE_EXCEPTION_TYPE;
                i4 = -12;
            }
            d.a(bvVar, zVar.errorMsg, j9, i4);
            a10.errorMsg = zVar.getErrorMsg();
            bvVar.a(a10);
        }
        if (bVar != null && (a9 = bVar.a()) != null) {
            t.b().b(new Runnable() { // from class: com.anythink.core.b.a.3
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        Objects.toString(a9);
                        Objects.toString(bvVar);
                        ATBaseAdAdapter aTBaseAdAdapter = a9;
                        if (aTBaseAdAdapter != null) {
                            aTBaseAdAdapter.internalDestory();
                        }
                    } catch (Throwable th) {
                        Log.e("anythink", "destroy error:" + a9, th);
                    }
                }
            });
        }
        String str2 = j.r.f12698n;
        com.anythink.core.common.h.a aVar3 = this.f11893f;
        ab.a(str2, aVar3.f13487e, com.anythink.core.common.v.p.f(String.valueOf(aVar3.f13488f)), bvVar);
        return false;
    }

    private static void a(bv bvVar, z zVar) {
        if (bvVar.g() == 75) {
            bvVar.z();
            Object extra = zVar.getExtra();
            if (extra == null) {
                bvVar.z();
                return;
            }
            String str = (String) extra;
            JSONObject aR = bvVar.aR();
            if (aR != null && !TextUtils.isEmpty(str)) {
                double optDouble = aR.optDouble(str, 0.0d);
                if (optDouble > 0.0d) {
                    bvVar.z();
                    zVar.setSortPrice(optDouble);
                    zVar.setPrice(optDouble);
                    return;
                }
                bvVar.z();
                return;
            }
            Objects.toString(aR);
            bvVar.z();
        }
    }

    private ad a(bv bvVar, z zVar, long j9, com.anythink.core.b.c.b bVar, com.anythink.core.b.c.a aVar) {
        double d2;
        double d3;
        Double d9;
        a(bvVar, zVar);
        bvVar.c(j9);
        bvVar.a(zVar.currency);
        double a9 = a(zVar.getSortPrice(), bvVar);
        boolean isSamePrice = zVar.isSamePrice();
        double a10 = isSamePrice ? a9 : a(zVar.getPrice(), bvVar);
        Double d10 = null;
        if (a9 <= 0.0d) {
            StringBuilder sb = new StringBuilder("NetworkName:");
            d2 = 0.0d;
            sb.append(bvVar.h());
            sb.append(",AdSourceId:");
            sb.append(bvVar.z());
            sb.append(" c2s sort price return 0,please check network placement c2s config");
            Log.w(ab.f16779a, sb.toString());
            d9 = Double.valueOf(a9);
            d3 = com.anythink.core.common.v.p.a(bvVar);
        } else {
            d2 = 0.0d;
            d3 = a9;
            d9 = null;
        }
        if (a10 <= d2) {
            Log.w(ab.f16779a, "NetworkName:" + bvVar.h() + ",AdSourceId:" + bvVar.z() + " c2s real price return 0,please check network placement c2s config");
            d10 = Double.valueOf(a10);
            a10 = com.anythink.core.common.v.p.a(bvVar);
        }
        double d11 = a10;
        Double d12 = d10;
        if (d9 != null || d12 != null) {
            com.anythink.core.common.h.a aVar2 = this.f11893f;
            com.anythink.core.common.u.e.a(aVar2.f13486d, aVar2.f13487e, bvVar, d9, d12, aVar);
        }
        ad adVar = new ad(zVar.isSuccessWithUseType(), d3, d11, zVar.token, zVar.winNoticeUrl, zVar.loseNoticeUrl, zVar.displayNoticeUrl, "");
        adVar.f13586l = a(bvVar);
        ATAdConst.CURRENCY currency = zVar.currency;
        if (currency != null) {
            adVar.f13577b = currency.toString();
        }
        adVar.setExtra(zVar.getExtra());
        adVar.setBiddingNotice(zVar.biddingNotice);
        adVar.f13581f = System.currentTimeMillis() + bvVar.s();
        adVar.f13580e = bvVar.s();
        adVar.f13585k = bvVar.z();
        adVar.f13579d = bvVar.g();
        adVar.f13593s = bVar;
        adVar.f13594t = bVar != null;
        double d13 = zVar.originPrice;
        int i = AnonymousClass4.f11783a[zVar.currency.ordinal()];
        if (i == 1) {
            d13 = zVar.originPrice;
        } else if (i == 2) {
            d13 = zVar.originPrice / 100.0d;
        } else if (i == 3) {
            d13 = zVar.originPrice * com.anythink.core.common.v.t.a();
        }
        adVar.rmbPrice = d13;
        a(bvVar.g(), adVar, 0.0d, isSamePrice);
        a((z) adVar, bvVar);
        return adVar;
    }

    @Override // com.anythink.core.b.d
    public final void a(bv bvVar, z zVar, long j9) {
        a(bvVar, zVar, j9, -1, (com.anythink.core.b.c.b) null, (com.anythink.core.b.c.a) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(boolean z8, ATBiddingResult aTBiddingResult, bv bvVar, int i, com.anythink.core.b.c.b bVar, com.anythink.core.b.c.a aVar) {
        boolean z9;
        ap aW;
        ap bi;
        if (z8) {
            try {
                f a9 = f.a();
                String z10 = bvVar.z();
                ConcurrentHashMap<String, Integer> concurrentHashMap = a9.f12000b;
                if (concurrentHashMap != null) {
                    if (concurrentHashMap.get(z10 + "_c2sfirstStatus") != null) {
                        z9 = false;
                        com.anythink.core.common.u.e.a(this.f11893f.f13487e, bvVar, z9, SystemClock.elapsedRealtime() - this.f11768d, this.f11893f);
                    }
                }
                z9 = true;
                com.anythink.core.common.u.e.a(this.f11893f.f13487e, bvVar, z9, SystemClock.elapsedRealtime() - this.f11768d, this.f11893f);
            } catch (Throwable th) {
                throw th;
            }
        }
        f a10 = f.a();
        String z11 = bvVar.z();
        if (a10.f12000b == null) {
            a10.f12000b = new ConcurrentHashMap<>();
        }
        a10.f12000b.put(z11 + "_c2sfirstStatus", 1);
        if (!this.f11895h.get()) {
            boolean a11 = a(bvVar, aTBiddingResult, SystemClock.elapsedRealtime() - this.f11768d, i, bVar, aVar);
            List<bv> synchronizedList = Collections.synchronizedList(new ArrayList(1));
            synchronizedList.add(bvVar);
            this.f11766b.remove(bvVar);
            if (this.f11766b.size() == 0) {
                this.f11895h.set(true);
            }
            if (this.f11767c != null) {
                if (!a11) {
                    a11 = a(bvVar, aTBiddingResult.errorMsg, -1);
                }
                if (a11) {
                    l lVar = this.f11770j;
                    if (lVar != null && (aW = bvVar.aW()) != null && (bi = lVar.bi()) != null) {
                        String c4 = bi.c();
                        aW.c(c4);
                        if (!TextUtils.isEmpty(c4)) {
                            String z12 = bvVar.z();
                            com.anythink.core.common.q.b b9 = com.anythink.core.common.q.a.b(c4, z12 + "_" + bvVar.D() + "_" + this.f11893f.f13486d);
                            b9.b();
                            aW.b(b9.a());
                            com.anythink.core.common.q.b b10 = com.anythink.core.common.q.a.b(c4, z12 + "_" + bvVar.c() + "_" + this.f11893f.f13486d);
                            b10.b();
                            aW.d(b10.a());
                        }
                    }
                    this.f11767c.a(synchronizedList, (List<bv>) null);
                    return;
                }
                this.f11767c.a((List<bv>) null, synchronizedList);
            }
            return;
        }
        ad a12 = a(bvVar, aTBiddingResult, SystemClock.elapsedRealtime() - this.f11768d, bVar, aVar);
        com.anythink.core.b.d.c.a(a12, new aw(4, bvVar, this.f11893f.f13500s, a12.getPrice()), true, 29);
    }

    private synchronized void a(ATBiddingResult aTBiddingResult, bv bvVar) {
        a(false, aTBiddingResult, bvVar, -1, (com.anythink.core.b.c.b) null, (com.anythink.core.b.c.a) null);
    }

    private static ATBiddingResult a(String str) {
        return ATBiddingResult.fail(str);
    }

    @Override // com.anythink.core.b.d
    public final synchronized void a() {
        try {
            try {
                if (!this.f11895h.get()) {
                    this.f11895h.set(true);
                    ArrayList arrayList = new ArrayList(3);
                    ArrayList arrayList2 = new ArrayList(3);
                    for (bv bvVar : this.f11766b) {
                        if (a(bvVar, "bid timeout", -3)) {
                            arrayList.add(bvVar);
                        } else {
                            a(bvVar, ATBiddingResult.fail("bid timeout!"), SystemClock.elapsedRealtime() - this.f11768d, -3, (com.anythink.core.b.c.b) null, (com.anythink.core.b.c.a) null);
                            arrayList2.add(bvVar);
                        }
                    }
                    this.f11766b.clear();
                    com.anythink.core.b.b.b bVar = this.f11767c;
                    if (bVar != null) {
                        bVar.a(arrayList, arrayList2);
                    }
                    this.f11767c = null;
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    private static void a(z zVar, bv bvVar) {
        double aQ = bvVar.aQ();
        double d2 = zVar.originPrice;
        if (aQ > 0.0d) {
            double d3 = (1.0d - aQ) * zVar.originPrice;
            zVar.setPrice(d3);
            zVar.setSortPrice(d3);
        }
    }

    private void a(l lVar, bv bvVar) {
        ap aW;
        ap bi;
        if (lVar == null || bvVar == null || (aW = bvVar.aW()) == null || (bi = lVar.bi()) == null) {
            return;
        }
        String c4 = bi.c();
        aW.c(c4);
        if (TextUtils.isEmpty(c4)) {
            return;
        }
        String z8 = bvVar.z();
        com.anythink.core.common.q.b b9 = com.anythink.core.common.q.a.b(c4, z8 + "_" + bvVar.D() + "_" + this.f11893f.f13486d);
        b9.b();
        aW.b(b9.a());
        com.anythink.core.common.q.b b10 = com.anythink.core.common.q.a.b(c4, z8 + "_" + bvVar.c() + "_" + this.f11893f.f13486d);
        b10.b();
        aW.d(b10.a());
    }

    public static /* synthetic */ int a(ATBiddingResult aTBiddingResult) {
        if (aTBiddingResult.isSuccessWithUseType()) {
            return 0;
        }
        return TextUtils.equals(aTBiddingResult.errorMsg, ATBidRequestInfo.BID_TYPE_ERROR_TYPE) ? -10 : -1;
    }
}
