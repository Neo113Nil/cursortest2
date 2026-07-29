package com.ironsource.b;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.b.c;
import com.ironsource.b.d.c;
import com.ironsource.b.f.s;
import com.ironsource.b.f.t;
import com.ironsource.environment.NetworkStateReceiver;
import com.mopub.common.AdType;
import com.mopub.mobileads.resource.DrawableConstants;
import com.youappi.sdk.mediation.admob.ParamNames;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RewardedVideoManager.java */
/* loaded from: classes2.dex */
class q extends a implements t, com.ironsource.b.h.b, NetworkStateReceiver.a {
    private s v;
    private com.ironsource.b.f.g w;
    private com.ironsource.b.e.k z;
    private final String s = getClass().getSimpleName();
    private final int t = 2;
    private final int u = 6;
    private boolean x = false;
    private boolean y = false;
    private List<c.a> A = Arrays.asList(c.a.INIT_FAILED, c.a.CAPPED_PER_SESSION, c.a.EXHAUSTED, c.a.CAPPED_PER_DAY);

    q() {
        this.g = new com.ironsource.b.h.c(AdType.REWARDED_VIDEO, this);
    }

    public void a(s sVar) {
        this.v = sVar;
    }

    public synchronized void a(Activity activity, String str, String str2) {
        this.m.a(c.a.API, this.s + ":initRewardedVideo(appKey: " + str + ", userId: " + str2 + ")", 1);
        this.l = str;
        this.k = str2;
        this.j = activity;
        if (this.r) {
            this.h = this.i.size();
            Iterator<c> it = this.i.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (f((r) next) == null) {
                    next.a(c.a.INIT_FAILED);
                }
            }
        } else {
            this.g.a(this.j);
            Iterator<c> it2 = this.i.iterator();
            int i = 0;
            while (it2.hasNext()) {
                c next2 = it2.next();
                if (this.g.c(next2)) {
                    a(DrawableConstants.CtaButton.WIDTH_DIPS, next2, new Object[][]{new Object[]{"status", "false"}});
                }
                if (this.g.d(next2)) {
                    next2.a(c.a.CAPPED_PER_DAY);
                    i++;
                }
            }
            if (i == this.i.size()) {
                this.v.b(false);
                return;
            }
            for (int i2 = 0; i2 < this.h && i2 < this.i.size() && g() != null; i2++) {
            }
        }
    }

    public synchronized void a(String str) {
        this.m.a(c.a.API, this.s + ":showRewardedVideo(placementName: " + str + ")", 1);
        if (!com.ironsource.b.h.g.c(this.j)) {
            this.v.d(com.ironsource.b.h.d.c("Rewarded Video"));
            return;
        }
        c(str);
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.i.size(); i3++) {
            c cVar = this.i.get(i3);
            if (cVar.k() == c.a.AVAILABLE) {
                if (((r) cVar).x()) {
                    a(cVar, i3);
                    if (this.q && !cVar.equals(b())) {
                        d();
                    }
                    if (cVar.b()) {
                        cVar.a(c.a.CAPPED_PER_SESSION);
                        a(7, cVar, new Object[][]{new Object[]{"status", "false"}, new Object[]{"reason", 2}});
                        m();
                    } else if (this.g.d(cVar)) {
                        cVar.a(c.a.CAPPED_PER_DAY);
                        a(7, cVar, new Object[][]{new Object[]{"status", "false"}, new Object[]{"reason", 6}});
                        a(DrawableConstants.CtaButton.WIDTH_DIPS, cVar, new Object[][]{new Object[]{"status", "true"}});
                        m();
                    } else if (cVar.a()) {
                        g();
                        n();
                    }
                    return;
                }
                a(false, (r) cVar);
                Exception exc = new Exception("FailedToShowVideoException");
                this.m.a(c.a.INTERNAL, cVar.m() + " Failed to show video", exc);
            } else {
                if (cVar.k() != c.a.CAPPED_PER_SESSION && cVar.k() != c.a.CAPPED_PER_DAY) {
                    if (cVar.k() == c.a.NOT_AVAILABLE) {
                        i2++;
                    }
                }
                i++;
            }
        }
        if (k()) {
            a(a(), this.i.size());
        } else if (i + i2 == this.i.size()) {
            this.v.d(com.ironsource.b.h.d.a("Rewarded Video"));
        }
    }

    public synchronized boolean e() {
        this.m.a(c.a.API, this.s + ":isRewardedVideoAvailable()", 1);
        if (this.x) {
            return false;
        }
        Iterator<c> it = this.i.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.d() && ((r) next).x()) {
                return true;
            }
        }
        return false;
    }

    public void a(com.ironsource.b.f.g gVar) {
        this.w = gVar;
    }

    public synchronized void a(String str, String str2) {
        this.m.a(c.a.API, this.s + ":showRewardedVideo(instanceId: " + str + ", placementName: " + str2 + ")", 1);
        if (!com.ironsource.b.h.g.c(this.j)) {
            this.w.onRewardedVideoAdShowFailed(str, com.ironsource.b.h.d.c("Rewarded Video"));
            return;
        }
        c(str2);
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= this.i.size()) {
                break;
            }
            c cVar = this.i.get(i);
            if (!cVar.o().equals(str)) {
                i++;
            } else {
                if (cVar.k() == c.a.AVAILABLE) {
                    if (((r) cVar).x()) {
                        com.ironsource.b.h.a.c(this.j, this.z);
                        a(2, cVar, new Object[][]{new Object[]{"placement", this.z.b()}});
                        a(cVar, i, this.z.b());
                        ((r) cVar).w();
                        if (cVar.b()) {
                            a(7, cVar, new Object[][]{new Object[]{"status", "false"}, new Object[]{"reason", 2}});
                            a(false, (r) cVar);
                        } else if (this.g.d(cVar)) {
                            cVar.a(c.a.CAPPED_PER_DAY);
                            a(DrawableConstants.CtaButton.WIDTH_DIPS, cVar, new Object[][]{new Object[]{"status", "true"}});
                            a(false, (r) cVar);
                        }
                    } else {
                        a(false, (r) cVar);
                        Exception exc = new Exception("FailedToShowVideoException");
                        this.m.a(c.a.INTERNAL, cVar.m() + " Failed to show video", exc);
                    }
                    return;
                }
                if (cVar.k() == c.a.CAPPED_PER_SESSION) {
                    this.v.d(new com.ironsource.b.d.b(526, "Instance has reached its cap per session"));
                    return;
                }
                z = true;
            }
        }
        if (!z) {
            this.w.onRewardedVideoAdShowFailed(str, com.ironsource.b.h.d.d("Rewarded Video"));
        } else {
            this.w.onRewardedVideoAdShowFailed(str, com.ironsource.b.h.d.a("Rewarded Video"));
        }
    }

    public synchronized boolean b(String str) {
        this.m.a(c.a.API, this.s + ":isRewardedVideoAvailable(instanceId: " + str + ")", 1);
        if (this.x) {
            return false;
        }
        Iterator<c> it = this.i.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.o().equals(str)) {
                return ((r) next).x();
            }
        }
        return false;
    }

    @Override // com.ironsource.b.f.t
    public void a(com.ironsource.b.d.b bVar, r rVar) {
        this.m.a(c.a.ADAPTER_CALLBACK, rVar.m() + ":onRewardedVideoAdShowFailed(" + bVar + ")", 1);
        if (this.r) {
            this.w.onRewardedVideoAdShowFailed(rVar.o(), bVar);
        } else {
            this.v.d(bVar);
        }
    }

    @Override // com.ironsource.b.f.t
    public void a(r rVar) {
        this.m.a(c.a.ADAPTER_CALLBACK, rVar.m() + ":onRewardedVideoAdOpened()", 1);
        a(5, rVar, (Object[][]) null);
        if (this.r) {
            this.w.onRewardedVideoAdOpened(rVar.o());
        } else {
            this.v.c();
        }
    }

    @Override // com.ironsource.b.f.t
    public void b(r rVar) {
        this.m.a(c.a.ADAPTER_CALLBACK, rVar.m() + ":onRewardedVideoAdClosed()", 1);
        a(6, rVar, (Object[][]) null);
        h();
        if (this.r) {
            this.w.onRewardedVideoAdClosed(rVar.o());
            return;
        }
        this.v.d();
        Iterator<c> it = this.i.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.k() == c.a.NOT_AVAILABLE) {
                try {
                    if (!next.m().equals(rVar.m())) {
                        this.m.a(c.a.INTERNAL, next.m() + ":reload smash", 1);
                        ((r) next).v();
                    }
                } catch (Throwable th) {
                    this.m.a(c.a.NATIVE, next.m() + " Failed to call fetchVideo(), " + th.getLocalizedMessage(), 1);
                }
            }
        }
    }

    @Override // com.ironsource.b.f.t
    public synchronized void a(boolean z, r rVar) {
        if (!this.x) {
            try {
                this.m.a(c.a.ADAPTER_CALLBACK, rVar.m() + ":onRewardedVideoAvailabilityChanged(available:" + z + ")", 1);
                a(7, rVar, new Object[][]{new Object[]{"status", String.valueOf(z)}});
                if (this.r) {
                    this.w.onRewardedVideoAvailabilityChanged(rVar.o(), z);
                    if (e(z)) {
                        a(7, new Object[][]{new Object[]{"status", String.valueOf(z)}});
                    }
                } else {
                    if (rVar.equals(a())) {
                        if (e(z)) {
                            this.v.b(this.o.booleanValue());
                        }
                        return;
                    }
                    if (rVar.equals(b())) {
                        this.m.a(c.a.ADAPTER_CALLBACK, rVar.m() + " is a Premium adapter, canShowPremium: " + c(), 1);
                        if (!c()) {
                            rVar.a(c.a.CAPPED_PER_SESSION);
                            if (e(false)) {
                                this.v.b(this.o.booleanValue());
                            }
                            return;
                        }
                    }
                    if (rVar.d() && !this.g.d(rVar)) {
                        if (z) {
                            if (e(true)) {
                                this.v.b(this.o.booleanValue());
                            }
                        } else {
                            if (e(false)) {
                                l();
                            }
                            g();
                            n();
                        }
                    }
                }
            } catch (Throwable th) {
                this.m.a(c.a.ADAPTER_CALLBACK, "onRewardedVideoAvailabilityChanged(available:" + z + ", provider:" + rVar.n() + ")", th);
            }
        }
    }

    @Override // com.ironsource.b.f.t
    public void c(r rVar) {
        this.m.a(c.a.ADAPTER_CALLBACK, rVar.m() + ":onRewardedVideoAdRewarded()", 1);
        JSONObject a2 = com.ironsource.b.h.g.a(rVar, this.r);
        try {
            a2.put("placement", this.z.b());
            a2.put("rewardName", this.z.c());
            a2.put(ParamNames.REWARD_AMOUNT, this.z.d());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        com.ironsource.a.b bVar = new com.ironsource.a.b(10, a2);
        if (!TextUtils.isEmpty(this.l)) {
            bVar.a("transId", com.ironsource.b.h.g.c("" + Long.toString(bVar.b()) + this.l + rVar.n()));
            if (!TextUtils.isEmpty(m.a().f())) {
                bVar.a("dynamicUserId", m.a().f());
            }
            Map<String, String> g = m.a().g();
            if (g != null) {
                for (String str : g.keySet()) {
                    bVar.a("custom_" + str, g.get(str));
                }
            }
        }
        com.ironsource.b.b.g.c().a(bVar);
        if (this.r) {
            this.w.onRewardedVideoAdRewarded(rVar.o(), this.z);
        } else {
            this.v.a(this.z);
        }
    }

    @Override // com.ironsource.b.f.t
    public void d(r rVar) {
        this.m.a(c.a.ADAPTER_CALLBACK, rVar.m() + ":onRewardedVideoAdClicked()", 1);
        a(128, rVar, new Object[][]{new Object[]{"placement", this.z.b()}});
        if (this.r) {
            this.w.onRewardedVideoAdClicked(rVar.o(), this.z);
        } else {
            this.v.b(this.z);
        }
    }

    @Override // com.ironsource.b.f.t
    public void e(r rVar) {
        this.m.a(c.a.ADAPTER_CALLBACK, rVar.m() + ":onRewardedVideoAdVisible()", 1);
        a(11, rVar, new Object[][]{new Object[]{"placement", this.z.b()}});
    }

    @Override // com.ironsource.environment.NetworkStateReceiver.a
    public void a(boolean z) {
        if (this.n) {
            this.m.a(c.a.INTERNAL, "Network Availability Changed To: " + z, 0);
            if (d(z)) {
                this.x = !z;
                this.v.b(z);
            }
        }
    }

    private boolean d(boolean z) {
        if (this.o == null) {
            return false;
        }
        if (z && !this.o.booleanValue() && j()) {
            this.o = true;
            return true;
        }
        if (z || !this.o.booleanValue()) {
            return false;
        }
        this.o = false;
        return true;
    }

    void c(boolean z) {
        this.y = z;
    }

    private void a(int i, int i2) {
        for (int i3 = 0; i3 < i && i3 < this.i.size(); i3++) {
            if (!this.A.contains(this.i.get(i3).k())) {
                a(((r) this.i.get(i3)).D(), false, i2);
            }
        }
    }

    private synchronized void a(String str, boolean z, int i) {
        Throwable th;
        String str2;
        String str3 = "";
        try {
            str2 = "" + str;
            try {
                str3 = str2 + "&sdkVersion=" + com.ironsource.b.h.g.d();
                com.ironsource.b.g.b.a(str3, z, i);
            } catch (Throwable th2) {
                th = th2;
                this.m.a(c.a.NETWORK, "reportImpression:(providerURL:" + str2 + ", hit:" + z + ")", th);
            }
        } catch (Throwable th3) {
            th = th3;
            str2 = str3;
        }
    }

    void a(com.ironsource.b.e.k kVar) {
        this.z = kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        r1.a(com.ironsource.b.c.a.CAPPED_PER_SESSION);
        g();
     */
    @Override // com.ironsource.b.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected synchronized void d() {
        super.d();
        Iterator<c> it = this.i.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            c next = it.next();
            if (next.equals(b())) {
                break;
            }
        }
    }

    private synchronized b f(r rVar) {
        this.m.a(c.a.NATIVE, this.s + ":startAdapter(" + rVar.m() + ")", 1);
        try {
            b e = e((c) rVar);
            if (e == null) {
                return null;
            }
            m.a().a(e);
            e.setLogListener(this.m);
            rVar.a(e);
            rVar.a(c.a.INITIATED);
            d((c) rVar);
            rVar.a(this.j, this.l, this.k);
            return e;
        } catch (Throwable th) {
            this.m.a(c.a.API, this.s + ":startAdapter(" + rVar.n() + ")", th);
            rVar.a(c.a.INIT_FAILED);
            if (e(false)) {
                this.v.b(this.o.booleanValue());
            }
            this.m.a(c.a.API, com.ironsource.b.h.d.b(rVar.n() + " initialization failed - please verify that required dependencies are in you build path.", "Rewarded Video").toString(), 2);
            return null;
        }
    }

    private b g() {
        b bVar = null;
        int i = 0;
        for (int i2 = 0; i2 < this.i.size() && bVar == null; i2++) {
            if (this.i.get(i2).k() == c.a.AVAILABLE || this.i.get(i2).k() == c.a.INITIATED) {
                i++;
                if (i >= this.h) {
                    break;
                }
            } else if (this.i.get(i2).k() == c.a.NOT_INITIATED && (bVar = f((r) this.i.get(i2))) == null) {
                this.i.get(i2).a(c.a.INIT_FAILED);
            }
        }
        return bVar;
    }

    private synchronized void a(c cVar, int i) {
        com.ironsource.b.h.a.c(this.j, this.z);
        this.g.b(cVar);
        if (this.y) {
            a(((r) cVar).D(), true, this.z.a());
            a(i, this.z.a());
        }
        a(2, cVar, new Object[][]{new Object[]{"placement", this.z.b()}});
        a(cVar, i, this.z.b());
        ((r) cVar).w();
    }

    private synchronized void h() {
        boolean z;
        Iterator<c> it = this.i.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (it.next().k() == c.a.AVAILABLE) {
                z = true;
                break;
            }
        }
        a(3, new Object[][]{new Object[]{"status", String.valueOf(z)}});
        Iterator<c> it2 = this.i.iterator();
        while (it2.hasNext()) {
            c next = it2.next();
            if (next.k() == c.a.AVAILABLE) {
                a(3, next, new Object[][]{new Object[]{"status", "true"}});
            } else if (next.k() == c.a.NOT_AVAILABLE || next.k() == c.a.INITIATED) {
                a(3, next, new Object[][]{new Object[]{"status", "false"}});
            }
        }
        if (a() != null && a().s() != null) {
            c a2 = a();
            Object[][] objArr = new Object[1][];
            Object[] objArr2 = new Object[2];
            objArr2[0] = "status";
            objArr2[1] = k() ? "true" : "false";
            objArr[0] = objArr2;
            a(3, a2, objArr);
        }
    }

    private synchronized boolean e(boolean z) {
        boolean z2;
        z2 = true;
        if (this.o == null) {
            if (z) {
                this.o = true;
            } else {
                if (!k() && i()) {
                    this.o = false;
                }
                z2 = false;
            }
        } else if (z && !this.o.booleanValue()) {
            this.o = true;
        } else {
            if (!z && this.o.booleanValue() && !j() && !k()) {
                this.o = false;
            }
            z2 = false;
        }
        return z2;
    }

    private synchronized boolean i() {
        boolean z;
        z = true;
        Iterator<c> it = this.i.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (it.next().k() == c.a.NOT_INITIATED) {
                z = false;
                break;
            }
        }
        return z;
    }

    private synchronized boolean j() {
        boolean z;
        z = false;
        Iterator<c> it = this.i.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (it.next().k() == c.a.AVAILABLE) {
                z = true;
                break;
            }
        }
        return z;
    }

    private synchronized boolean k() {
        if (a() == null) {
            return false;
        }
        return ((r) a()).x();
    }

    private void c(String str) {
        for (int i = 0; i < this.i.size(); i++) {
            if (this.i.get(i).k() == c.a.AVAILABLE) {
                a(this.i.get(i), str, true);
            } else if (this.i.get(i).k() == c.a.NOT_AVAILABLE) {
                a(this.i.get(i), str, false);
            }
        }
        if (a() == null || a().s() == null) {
            return;
        }
        a(a(), str, k());
    }

    private void a(c cVar, int i, String str) {
        b(cVar, str, true);
        if (this.r) {
            return;
        }
        for (int i2 = 0; i2 < this.i.size() && i2 < i; i2++) {
            c cVar2 = this.i.get(i2);
            if (cVar2.k() == c.a.NOT_AVAILABLE) {
                b(cVar2, str, false);
            }
        }
    }

    private void a(c cVar, String str, boolean z) {
        Object[][] objArr = new Object[2][];
        objArr[0] = new Object[]{"placement", str};
        Object[] objArr2 = new Object[2];
        objArr2[0] = "status";
        objArr2[1] = z ? "true" : "false";
        objArr[1] = objArr2;
        a(19, cVar, objArr);
    }

    private void b(c cVar, String str, boolean z) {
        Object[][] objArr = new Object[2][];
        objArr[0] = new Object[]{"placement", str};
        Object[] objArr2 = new Object[2];
        objArr2[0] = "status";
        objArr2[1] = z ? "true" : "false";
        objArr[1] = objArr2;
        a(119, cVar, objArr);
    }

    private synchronized void l() {
        if (a() != null && !this.p) {
            this.p = true;
            if (f((r) a()) == null) {
                this.v.b(this.o.booleanValue());
            }
        } else if (k()) {
            if (e(true)) {
                this.v.b(this.o.booleanValue());
            }
        } else {
            this.v.b(this.o.booleanValue());
        }
    }

    private synchronized void m() {
        if (g() != null) {
            return;
        }
        if (a(c.a.NOT_AVAILABLE, c.a.CAPPED_PER_SESSION, c.a.CAPPED_PER_DAY) < this.i.size()) {
            n();
        } else {
            if (e(false)) {
                l();
            }
        }
    }

    private synchronized void n() {
        if (o()) {
            this.m.a(c.a.INTERNAL, "Reset Iteration", 0);
            Iterator<c> it = this.i.iterator();
            boolean z = false;
            while (it.hasNext()) {
                c next = it.next();
                if (next.k() == c.a.EXHAUSTED) {
                    next.h();
                }
                if (next.k() == c.a.AVAILABLE) {
                    z = true;
                }
            }
            this.m.a(c.a.INTERNAL, "End of Reset Iteration", 0);
            if (e(z)) {
                this.v.b(this.o.booleanValue());
            }
        }
    }

    private synchronized boolean o() {
        Iterator<c> it = this.i.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.k() == c.a.NOT_INITIATED || next.k() == c.a.INITIATED || next.k() == c.a.AVAILABLE) {
                return false;
            }
        }
        return true;
    }

    private void a(int i, Object[][] objArr) {
        JSONObject a2 = com.ironsource.b.h.g.a(this.r);
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    a2.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                this.m.a(c.a.INTERNAL, "RewardedVideoManager logMediationEvent " + Log.getStackTraceString(e), 3);
            }
        }
        com.ironsource.b.b.g.c().a(new com.ironsource.a.b(i, a2));
    }

    private void a(int i, c cVar, Object[][] objArr) {
        JSONObject a2 = com.ironsource.b.h.g.a(cVar, this.r);
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    a2.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                this.m.a(c.a.INTERNAL, "RewardedVideoManager logProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        com.ironsource.b.b.g.c().a(new com.ironsource.a.b(i, a2));
    }

    private int a(c.a... aVarArr) {
        int i;
        synchronized (this.i) {
            Iterator<c> it = this.i.iterator();
            i = 0;
            while (it.hasNext()) {
                c next = it.next();
                int i2 = i;
                for (c.a aVar : aVarArr) {
                    if (next.k() == aVar) {
                        i2++;
                    }
                }
                i = i2;
            }
        }
        return i;
    }

    @Override // com.ironsource.b.h.b
    public void f() {
        Iterator<c> it = this.i.iterator();
        boolean z = false;
        while (it.hasNext()) {
            c next = it.next();
            if (next.k() == c.a.CAPPED_PER_DAY) {
                a(DrawableConstants.CtaButton.WIDTH_DIPS, next, new Object[][]{new Object[]{"status", "false"}});
                next.a(c.a.NOT_AVAILABLE);
                if (((r) next).x() && next.d()) {
                    next.a(c.a.AVAILABLE);
                    z = true;
                }
            }
        }
        if (z && e(true)) {
            this.v.b(true);
        }
    }
}
