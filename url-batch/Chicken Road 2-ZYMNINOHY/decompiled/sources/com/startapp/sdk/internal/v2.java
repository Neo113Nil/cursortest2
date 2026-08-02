package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class v2 implements AdEventListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7740a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7741b = false;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w2 f7742c;

    public v2(w2 w2Var) {
        this.f7742c = w2Var;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        ConcurrentHashMap concurrentHashMap;
        List<StartAppAd> list;
        if (this.f7741b) {
            concurrentHashMap = null;
        } else {
            synchronized (this.f7742c.v) {
                concurrentHashMap = new ConcurrentHashMap(this.f7742c.v);
                w2 w2Var = this.f7742c;
                w2Var.o = null;
                w2Var.v.clear();
            }
        }
        this.f7741b = true;
        this.f7742c.f7809u.d();
        this.f7742c.f7808t.e();
        this.f7742c.f7804p.set(false);
        if (concurrentHashMap != null) {
            for (AdEventListener adEventListener : concurrentHashMap.keySet()) {
                if (adEventListener != null) {
                    this.f7742c.getClass();
                    try {
                        list = (List) concurrentHashMap.get(adEventListener);
                    } catch (Throwable th) {
                        d9.a(th);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        List list;
        ?? r02 = this.f7742c.o;
        boolean z = r02 != 0 && r02.getVideoCancelCallBack();
        this.f7742c.f7808t.d();
        n2 n2Var = this.f7742c.f7809u;
        n2Var.e();
        n2Var.f7313f = 0;
        n2Var.f7314g = false;
        this.f7742c.f7804p.set(false);
        if (this.f7740a || z) {
            return;
        }
        this.f7740a = true;
        synchronized (this.f7742c.v) {
            try {
                for (AdEventListener adEventListener : this.f7742c.v.keySet()) {
                    if (adEventListener != null) {
                        try {
                            list = (List) this.f7742c.v.get(adEventListener);
                        } catch (Throwable th) {
                            d9.a(th);
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
                this.f7742c.v.clear();
            } finally {
            }
        }
    }
}
