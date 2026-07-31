package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class p2 implements AdEventListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f373a = false;
    public boolean b = false;
    public final /* synthetic */ q2 c;

    public p2(q2 q2Var) {
        this.c = q2Var;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        ConcurrentHashMap concurrentHashMap;
        List<StartAppAd> list;
        if (this.b) {
            concurrentHashMap = null;
        } else {
            synchronized (this.c.v) {
                concurrentHashMap = new ConcurrentHashMap(this.c.v);
                q2 q2Var = this.c;
                q2Var.o = null;
                q2Var.v.clear();
            }
        }
        this.b = true;
        this.c.u.d();
        this.c.t.e();
        this.c.p.set(false);
        if (concurrentHashMap != null) {
            for (AdEventListener adEventListener : concurrentHashMap.keySet()) {
                if (adEventListener != null) {
                    try {
                        list = (List) concurrentHashMap.get(adEventListener);
                    } catch (Throwable th) {
                        n8.a(th);
                        list = null;
                    }
                    if (list != null) {
                        for (StartAppAd startAppAd : list) {
                            if (ad != null) {
                                startAppAd.setErrorMessage(ad.getErrorMessage());
                            }
                            adEventListener.onFailedToReceiveAd(startAppAd);
                        }
                    }
                }
            }
        }
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        List list;
        com.startapp.sdk.adsbase.f fVar = this.c.o;
        boolean z = fVar != null && fVar.getVideoCancelCallBack();
        this.c.t.d();
        h2 h2Var = this.c.u;
        h2Var.e();
        h2Var.f = 0;
        h2Var.g = false;
        this.c.p.set(false);
        if (this.f373a || z) {
            return;
        }
        this.f373a = true;
        synchronized (this.c.v) {
            for (AdEventListener adEventListener : this.c.v.keySet()) {
                if (adEventListener != null) {
                    try {
                        list = (List) this.c.v.get(adEventListener);
                    } catch (Throwable th) {
                        n8.a(th);
                        list = null;
                    }
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((StartAppAd) it.next()).setErrorMessage(ad.getErrorMessage());
                            adEventListener.onReceiveAd(ad);
                        }
                    }
                }
            }
            this.c.v.clear();
        }
    }
}
