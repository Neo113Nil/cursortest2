package com.anythink.rewardvideo.a;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.basead.b.c.i;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.a.b;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.l;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.ar;
import com.anythink.core.common.h.bc;
import com.anythink.core.common.h.n;
import com.anythink.core.common.u;
import com.anythink.core.common.u.h;
import com.anythink.core.common.v.ab;
import com.anythink.core.common.v.d;
import com.anythink.core.common.v.p;
import com.anythink.rewardvideo.api.ATRewardVideoExListener;
import com.anythink.rewardvideo.api.ATRewardVideoListener;
import com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener;
import java.util.Map;

/* loaded from: classes.dex */
public final class f implements CustomRewardedVideoEventListener {

    /* renamed from: b, reason: collision with root package name */
    long f23458b;

    /* renamed from: c, reason: collision with root package name */
    boolean f23459c;

    /* renamed from: d, reason: collision with root package name */
    boolean f23460d;

    /* renamed from: e, reason: collision with root package name */
    n f23461e;

    /* renamed from: f, reason: collision with root package name */
    boolean f23462f;

    /* renamed from: g, reason: collision with root package name */
    long f23463g;

    /* renamed from: h, reason: collision with root package name */
    long f23464h;
    boolean i;

    /* renamed from: l, reason: collision with root package name */
    boolean f23467l;

    /* renamed from: m, reason: collision with root package name */
    boolean f23468m;

    /* renamed from: n, reason: collision with root package name */
    private ATRewardVideoListener f23469n;

    /* renamed from: o, reason: collision with root package name */
    private CustomRewardVideoAdapter f23470o;

    /* renamed from: p, reason: collision with root package name */
    private com.anythink.core.common.k.e f23471p;

    /* renamed from: q, reason: collision with root package name */
    private long f23472q;

    /* renamed from: r, reason: collision with root package name */
    private long f23473r;

    /* renamed from: j, reason: collision with root package name */
    int f23465j = 0;

    /* renamed from: a, reason: collision with root package name */
    long f23457a = 0;

    /* renamed from: k, reason: collision with root package name */
    boolean f23466k = true;

    public f(CustomRewardVideoAdapter customRewardVideoAdapter, com.anythink.core.common.k.e eVar, ATRewardVideoListener aTRewardVideoListener) {
        this.f23469n = aTRewardVideoListener;
        this.f23470o = customRewardVideoAdapter;
        this.f23471p = eVar;
    }

    private static void b(n nVar) {
        ab.a(nVar, j.r.f12692g, j.r.f12697m, "");
        com.anythink.core.common.u.c.a(t.b().g()).a(9, nVar);
    }

    private boolean c(n nVar) {
        com.anythink.core.common.u.c.a(t.b().g()).a(6, nVar);
        if (nVar != null ? nVar.aw() : false) {
            return false;
        }
        com.anythink.core.common.v.c.a().b(this.f23470o);
        ab.a(nVar, j.r.f12689d, j.r.f12697m, "");
        return true;
    }

    private void d(n nVar) {
        com.anythink.core.common.u.c.a(t.b().g()).a(13, nVar, this.f23470o.getUnitGroupInfo());
        com.anythink.core.common.v.d.a().a(nVar, this.f23470o.getUnitGroupInfo(), com.anythink.core.common.v.d.f16887b);
        a(nVar);
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onAgainReward() {
        com.anythink.core.common.k.e eVar;
        if (this.f23470o == null || com.anythink.core.common.v.d.a().c(this.f23470o)) {
            n a9 = a();
            if (!this.f23462f && (eVar = this.f23471p) != null) {
                a(eVar, a9, true, true);
                this.f23471p.a(this.f23463g, this.f23464h, this.f23470o, a9);
            }
            this.f23462f = true;
            ATRewardVideoListener aTRewardVideoListener = this.f23469n;
            if (aTRewardVideoListener != null && (aTRewardVideoListener instanceof ATRewardVideoExListener)) {
                ((ATRewardVideoExListener) aTRewardVideoListener).onAgainReward(l.a(a9, this.f23470o));
            }
            if (this.f23470o != null) {
                ab.a(a9, j.r.i, j.r.f12697m, "");
            }
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onAgainRewardFailed() {
        try {
            if (this.f23462f) {
                return;
            }
            this.f23462f = true;
            n a9 = a();
            a(this.f23471p, a9, false, true);
            ATRewardVideoListener aTRewardVideoListener = this.f23469n;
            if (aTRewardVideoListener != null && (aTRewardVideoListener instanceof ATRewardVideoExListener)) {
                ((ATRewardVideoExListener) aTRewardVideoListener).onAgainRewardFailed(l.a(a9, this.f23470o));
            }
            if (this.f23470o != null) {
                ab.a(a9, j.r.i, j.r.f12698n, "");
            }
        } catch (Throwable th) {
            i.v("onAgainRewardFailed error", th.getMessage());
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onDeeplinkCallback(boolean z8) {
        ATRewardVideoListener aTRewardVideoListener = this.f23469n;
        if (aTRewardVideoListener != null && (aTRewardVideoListener instanceof ATRewardVideoExListener)) {
            ((ATRewardVideoExListener) aTRewardVideoListener).onDeeplinkCallback(l.a(this.f23470o), z8);
        }
        CustomRewardVideoAdapter customRewardVideoAdapter = this.f23470o;
        if (customRewardVideoAdapter != null) {
            ab.a(customRewardVideoAdapter.getTrackingInfo(), j.r.f12694j, z8 ? j.r.f12697m : j.r.f12698n, "");
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onDownloadConfirm(Context context, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        ATRewardVideoListener aTRewardVideoListener = this.f23469n;
        if (aTRewardVideoListener != null && (aTRewardVideoListener instanceof ATRewardVideoExListener)) {
            ((ATRewardVideoExListener) aTRewardVideoListener).onDownloadConfirm(context, l.a(this.f23470o), aTNetworkConfirmInfo);
        }
        CustomRewardVideoAdapter customRewardVideoAdapter = this.f23470o;
        if (customRewardVideoAdapter != null) {
            ab.a(customRewardVideoAdapter.getTrackingInfo(), j.r.f12695k, j.r.f12697m, "");
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onReward() {
        if ((this.f23470o == null || com.anythink.core.common.v.d.a().c(this.f23470o)) && !this.f23460d) {
            this.f23460d = true;
            if (!this.f23459c && this.f23471p != null) {
                n trackingInfo = this.f23470o.getTrackingInfo();
                a(this.f23471p, trackingInfo, true, false);
                this.f23471p.a(this.f23472q, this.f23473r, this.f23470o, trackingInfo);
            }
            this.f23459c = true;
            ATRewardVideoListener aTRewardVideoListener = this.f23469n;
            if (aTRewardVideoListener != null) {
                aTRewardVideoListener.onReward(l.a(this.f23470o));
            }
            CustomRewardVideoAdapter customRewardVideoAdapter = this.f23470o;
            if (customRewardVideoAdapter != null) {
                ab.a(customRewardVideoAdapter.getTrackingInfo(), j.r.i, j.r.f12697m, "");
            }
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardFailed() {
        try {
            if (this.f23460d) {
                return;
            }
            this.f23460d = true;
            n trackingInfo = this.f23470o.getTrackingInfo();
            a(this.f23471p, trackingInfo, false, false);
            ATRewardVideoListener aTRewardVideoListener = this.f23469n;
            if (aTRewardVideoListener != null && (aTRewardVideoListener instanceof ATRewardVideoExListener)) {
                ((ATRewardVideoExListener) aTRewardVideoListener).onRewardFailed(l.a(this.f23470o));
            }
            if (this.f23470o != null) {
                ab.a(trackingInfo, j.r.i, j.r.f12698n, "");
            }
        } catch (Throwable th) {
            i.v("onRewardFailed error", th.getMessage());
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdAgainPlayClicked() {
        ATRewardVideoListener aTRewardVideoListener;
        n a9 = a();
        if (((this.f23470o == null || a9 == null) ? true : c(a9)) && (aTRewardVideoListener = this.f23469n) != null && (aTRewardVideoListener instanceof ATRewardVideoExListener)) {
            ((ATRewardVideoExListener) aTRewardVideoListener).onRewardedVideoAdAgainPlayClicked(l.a(a9, this.f23470o));
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdAgainPlayEnd() {
        if (this.i) {
            return;
        }
        this.i = true;
        if (this.f23464h == 0) {
            this.f23464h = SystemClock.elapsedRealtime();
        }
        n a9 = a();
        if (this.f23470o != null && a9 != null) {
            b(a9);
        }
        ATRewardVideoListener aTRewardVideoListener = this.f23469n;
        if (aTRewardVideoListener == null || !(aTRewardVideoListener instanceof ATRewardVideoExListener)) {
            return;
        }
        ((ATRewardVideoExListener) aTRewardVideoListener).onRewardedVideoAdAgainPlayEnd(l.a(a9, this.f23470o));
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdAgainPlayFailed(String str, String str2) {
        this.f23465j = 99;
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.adShowError, str, str2);
        n a9 = a();
        if (this.f23470o != null && a9 != null) {
            a(errorCode, a9);
        }
        ATRewardVideoListener aTRewardVideoListener = this.f23469n;
        if (aTRewardVideoListener == null || !(aTRewardVideoListener instanceof ATRewardVideoExListener)) {
            return;
        }
        ((ATRewardVideoExListener) aTRewardVideoListener).onRewardedVideoAdAgainPlayFailed(errorCode, l.a(a9, this.f23470o));
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdAgainPlayStart() {
        if (this.f23470o == null || (com.anythink.core.common.v.d.a().a(this.f23470o) && com.anythink.core.common.v.d.a().b(this.f23470o))) {
            this.f23465j = 0;
            if (this.f23463g == 0) {
                this.f23463g = SystemClock.elapsedRealtime();
            }
            this.f23464h = 0L;
            n a9 = a();
            if (this.f23470o != null && a9 != null) {
                com.anythink.core.common.v.d.a().a(a9, this.f23470o.getUnitGroupInfo(), 6);
                com.anythink.core.common.u.c.a(t.b().g()).a(13, a9, this.f23470o.getUnitGroupInfo());
                com.anythink.core.common.v.d.a().a(a9, this.f23470o.getUnitGroupInfo(), com.anythink.core.common.v.d.f16887b);
                a(a9);
                com.anythink.core.common.k.e eVar = this.f23471p;
                if (eVar != null) {
                    eVar.a(this.f23458b, this.f23470o, a9);
                }
            }
            ATRewardVideoListener aTRewardVideoListener = this.f23469n;
            if (aTRewardVideoListener == null || !(aTRewardVideoListener instanceof ATRewardVideoExListener)) {
                return;
            }
            ((ATRewardVideoExListener) aTRewardVideoListener).onRewardedVideoAdAgainPlayStart(l.a(a9, this.f23470o));
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdClosed() {
        CustomRewardVideoAdapter customRewardVideoAdapter = this.f23470o;
        if (customRewardVideoAdapter != null) {
            n trackingInfo = customRewardVideoAdapter.getTrackingInfo();
            int i = this.f23465j;
            if (i == 0) {
                i = this.f23470o.getDismissType();
            }
            if (i == 0) {
                i = 1;
            }
            trackingInfo.K(i);
            ab.a(trackingInfo, j.r.f12690e, j.r.f12697m, this.f23459c ? "" : "onReward() is not fired");
            long j9 = this.f23457a;
            if (j9 != 0) {
                com.anythink.core.common.u.e.a(trackingInfo, this.f23459c, j9, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.f23458b);
            }
            Map<String, Object> adExtraInfoMap = this.f23470o.getAdExtraInfoMap();
            if (adExtraInfoMap != null) {
                Object obj = adExtraInfoMap.get(b.C0073b.f12265a);
                if (obj instanceof Integer) {
                    trackingInfo.R(((Integer) obj).intValue());
                }
            }
            com.anythink.core.common.u.e.a(trackingInfo, this.f23459c);
            if (this.f23460d) {
                try {
                    com.anythink.core.common.v.d.a().d(this.f23470o);
                    this.f23470o.clearImpressionListener();
                    this.f23470o.internalDestory();
                } catch (Throwable unused) {
                }
            } else {
                t.b().a(new Runnable() { // from class: com.anythink.rewardvideo.a.f.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            com.anythink.core.common.v.d.a().d(f.this.f23470o);
                            f.this.f23470o.clearImpressionListener();
                            f.this.f23470o.internalDestory();
                        } catch (Throwable unused2) {
                        }
                    }
                }, com.anythink.basead.exoplayer.f.f7344a);
            }
            a(trackingInfo.aI());
            ATRewardVideoListener aTRewardVideoListener = this.f23469n;
            if (aTRewardVideoListener != null) {
                aTRewardVideoListener.onRewardedVideoAdClosed(l.a(trackingInfo, this.f23470o));
            }
            a(trackingInfo.aI(), 18);
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdPlayClicked() {
        ATRewardVideoListener aTRewardVideoListener;
        CustomRewardVideoAdapter customRewardVideoAdapter = this.f23470o;
        if (!(customRewardVideoAdapter != null ? c(customRewardVideoAdapter.getTrackingInfo()) : true) || (aTRewardVideoListener = this.f23469n) == null) {
            return;
        }
        aTRewardVideoListener.onRewardedVideoAdPlayClicked(l.a(this.f23470o));
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdPlayEnd() {
        if (this.f23468m) {
            return;
        }
        this.f23468m = true;
        if (this.f23473r == 0) {
            this.f23473r = SystemClock.elapsedRealtime();
        }
        CustomRewardVideoAdapter customRewardVideoAdapter = this.f23470o;
        if (customRewardVideoAdapter != null) {
            if (customRewardVideoAdapter.getDismissType() == 0) {
                this.f23465j = 3;
            }
            b(this.f23470o.getTrackingInfo());
        }
        ATRewardVideoListener aTRewardVideoListener = this.f23469n;
        if (aTRewardVideoListener != null) {
            aTRewardVideoListener.onRewardedVideoAdPlayEnd(l.a(this.f23470o));
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdPlayFailed(String str, String str2) {
        this.f23465j = 99;
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.adShowError, str, str2);
        CustomRewardVideoAdapter customRewardVideoAdapter = this.f23470o;
        if (customRewardVideoAdapter != null) {
            n trackingInfo = customRewardVideoAdapter.getTrackingInfo();
            if (trackingInfo.Y() == 66) {
                this.f23466k = false;
            }
            String aI = trackingInfo.aI();
            a(errorCode, trackingInfo);
            a(trackingInfo.aI());
            a(aI, 7);
        }
        ATRewardVideoListener aTRewardVideoListener = this.f23469n;
        if (aTRewardVideoListener != null) {
            aTRewardVideoListener.onRewardedVideoAdPlayFailed(errorCode, l.a(this.f23470o));
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdPlayStart() {
        if ((this.f23470o == null || (com.anythink.core.common.v.d.a().a(this.f23470o) && com.anythink.core.common.v.d.a().b(this.f23470o))) && !this.f23467l) {
            this.f23467l = true;
            this.f23457a = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f23458b = elapsedRealtime;
            if (this.f23472q == 0) {
                this.f23472q = elapsedRealtime;
            }
            l a9 = l.a(this.f23470o);
            CustomRewardVideoAdapter customRewardVideoAdapter = this.f23470o;
            if (customRewardVideoAdapter != null) {
                n trackingInfo = customRewardVideoAdapter.getTrackingInfo();
                trackingInfo.a(this.f23470o.getInternalNetworkInfoMap());
                com.anythink.core.common.v.d.a().a(trackingInfo, this.f23470o.getUnitGroupInfo(), 6);
                a(trackingInfo);
                com.anythink.core.common.k.e eVar = this.f23471p;
                if (eVar != null) {
                    eVar.a(this.f23458b, this.f23470o, trackingInfo);
                }
                String aI = trackingInfo.aI();
                u.a().a(aI, a9);
                a(aI, 6);
            }
            if (!this.f23466k || this.f23469n == null) {
                return;
            }
            if (a9.getNetworkFirmId() == -1) {
                h.a(j.n.f12663b, this.f23470o, null);
            }
            this.f23469n.onRewardedVideoAdPlayStart(a9);
        }
    }

    private n a() {
        CustomRewardVideoAdapter customRewardVideoAdapter;
        if (this.f23461e == null && (customRewardVideoAdapter = this.f23470o) != null) {
            n af = customRewardVideoAdapter.getTrackingInfo().af();
            this.f23461e = af;
            af.f14182t = 6;
            this.f23461e.n(p.b(af.aJ(), this.f23461e.M(), System.currentTimeMillis()));
        }
        return this.f23461e;
    }

    private void a(final n nVar) {
        com.anythink.core.common.v.c.a().a(this.f23470o);
        String ilrd = this.f23470o.getILRD();
        if (!TextUtils.isEmpty(ilrd)) {
            nVar.d(ilrd);
        }
        com.anythink.core.common.v.d.a().a(this.f23470o, new d.a() { // from class: com.anythink.rewardvideo.a.f.2
            @Override // com.anythink.core.common.v.d.a
            public final void a() {
                com.anythink.core.common.u.c.a(t.b().g()).a(4, nVar, f.this.f23470o.getUnitGroupInfo());
            }

            @Override // com.anythink.core.common.v.d.a
            public final void b() {
            }
        });
        if (this.f23466k) {
            com.anythink.core.common.u.c.a(t.b().g()).a(8, nVar);
        }
        ab.a(nVar, j.r.f12688c, j.r.f12697m, "");
    }

    private void a(AdError adError, n nVar) {
        ab.a(nVar, j.r.f12688c, j.r.f12698n, adError.printStackTrace());
        CustomRewardVideoAdapter customRewardVideoAdapter = this.f23470o;
        com.anythink.core.common.u.e.a(nVar, adError, customRewardVideoAdapter != null ? customRewardVideoAdapter.getInternalNetworkInfoMap() : null);
    }

    private void a(com.anythink.core.common.k.e eVar, n nVar, boolean z8, boolean z9) {
        long elapsedRealtime;
        long j9;
        boolean z10 = z9 ? this.i : this.f23468m;
        com.anythink.core.common.i.a();
        String g9 = com.anythink.core.common.i.g();
        nVar.a(bc.a(z10, g9, z8));
        com.anythink.core.common.u.c.a(t.b().g()).a(25, nVar);
        if (z9) {
            elapsedRealtime = SystemClock.elapsedRealtime();
            j9 = this.f23463g;
        } else {
            elapsedRealtime = SystemClock.elapsedRealtime();
            j9 = this.f23472q;
        }
        com.anythink.core.common.u.e.a(eVar, z8, nVar, elapsedRealtime - j9, z10, g9, this.f23470o);
    }

    private static void a(String str) {
        com.anythink.core.common.h.i c4;
        if (TextUtils.isEmpty(str) || (c4 = u.a().c(str)) == null) {
            return;
        }
        u.a().d(str);
        com.anythink.core.common.f.a(t.b().g(), str, "1").c(u.a().b(str, c4.a()));
    }

    private static void a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.anythink.core.common.f a9 = com.anythink.core.common.f.a(t.b().M(), str, "1");
        if (a9.a((ATAdStatusInfo) null, i)) {
            ar arVar = new ar();
            arVar.a(t.b().M());
            arVar.f13704c = i;
            if (a9.i() != null) {
                arVar.a(a9.i());
            }
            a9.b(t.b().M(), "1", str, arVar, null);
        }
    }
}
