package com.anythink.core.common.v;

import android.text.TextUtils;
import com.anythink.core.api.ATAdMixBidInfo;
import com.anythink.core.common.h.aw;
import com.anythink.core.common.h.bu;
import com.anythink.core.common.h.bv;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16880a = "anythink_event_listener";

    /* renamed from: b, reason: collision with root package name */
    private static volatile c f16881b;

    private c() {
    }

    public static c a() {
        if (f16881b == null) {
            synchronized (c.class) {
                try {
                    if (f16881b == null) {
                        f16881b = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16881b;
    }

    public final void b(com.anythink.core.common.d.f fVar) {
        if (fVar != null) {
            b(fVar, fVar.getTrackingInfo());
        }
    }

    public final void b(com.anythink.core.common.d.f fVar, com.anythink.core.common.h.n nVar) {
        if (fVar != null) {
            a(nVar, fVar.getUnitGroupInfo(), fVar, 1);
        }
    }

    public final void a(com.anythink.core.common.d.f fVar) {
        if (fVar != null) {
            a(fVar, fVar.getTrackingInfo());
        }
    }

    public final void a(com.anythink.core.common.d.f fVar, com.anythink.core.common.h.n nVar) {
        if (fVar != null) {
            a(nVar, fVar.getUnitGroupInfo(), fVar, 0);
        }
    }

    private void a(final bu buVar, bv bvVar, final com.anythink.core.common.d.f fVar, final int i) {
        if (buVar == null || bvVar == null || bvVar.g() == 8) {
            return;
        }
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.v.c.1
            @Override // java.lang.Runnable
            public final void run() {
                ATAdMixBidInfo.XBiddingInfo xBiddingInfo;
                ATAdMixBidInfo.BidEntity biddingInfo;
                try {
                    com.anythink.core.d.b b9 = com.anythink.core.d.d.a(com.anythink.core.common.d.t.b().g()).b(com.anythink.core.common.d.t.b().p());
                    if (b9 == null || b9.c() == null || !b9.c().contains(28) || (xBiddingInfo = ATAdMixBidInfo.getInstance().getXBiddingInfo()) == null || (biddingInfo = xBiddingInfo.getBiddingInfo(com.anythink.core.common.d.l.a(fVar))) == null) {
                        return;
                    }
                    String adTittle = biddingInfo.getAdTittle();
                    String adUserName = biddingInfo.getAdUserName();
                    if (TextUtils.isEmpty(adTittle) && TextUtils.isEmpty(adUserName)) {
                        return;
                    }
                    List<com.anythink.core.common.h.c> a9 = com.anythink.core.common.a.a().a(buVar.aI());
                    if (a9 != null) {
                        a9.size();
                        for (com.anythink.core.common.h.c cVar : a9) {
                            if (cVar != null && cVar.c() == 0) {
                                com.anythink.core.common.h.n i4 = cVar.i();
                                bv unitGroupInfo = cVar.e().getUnitGroupInfo();
                                if (unitGroupInfo != null && unitGroupInfo.g() == 28 && unitGroupInfo.o()) {
                                    com.anythink.core.common.h.ad R8 = unitGroupInfo.R();
                                    Objects.toString(R8);
                                    if (R8 != null) {
                                        aw awVar = new aw(8, unitGroupInfo, i4, p.a(unitGroupInfo));
                                        awVar.a(biddingInfo);
                                        awVar.a(i);
                                        com.anythink.core.b.d.c.a(R8, awVar, true, 32);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }, 2);
    }
}
