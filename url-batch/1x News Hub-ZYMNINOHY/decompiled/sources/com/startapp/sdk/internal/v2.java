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
    public boolean f4598a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4599b = false;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w2 f4600c;

    public v2(w2 w2Var) {
        this.f4600c = w2Var;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        ConcurrentHashMap concurrentHashMap;
        List<StartAppAd> list;
        if (this.f4599b) {
            concurrentHashMap = null;
        } else {
            synchronized (this.f4600c.v) {
                concurrentHashMap = new ConcurrentHashMap(this.f4600c.v);
                w2 w2Var = this.f4600c;
                w2Var.o = null;
                w2Var.v.clear();
            }
        }
        this.f4599b = true;
        this.f4600c.f4664u.d();
        this.f4600c.f4663t.e();
        this.f4600c.f4659p.set(false);
        if (concurrentHashMap != null) {
            for (AdEventListener adEventListener : concurrentHashMap.keySet()) {
                if (adEventListener != null) {
                    this.f4600c.getClass();
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
        ?? r02 = this.f4600c.o;
        boolean z = r02 != 0 && r02.getVideoCancelCallBack();
        this.f4600c.f4663t.d();
        n2 n2Var = this.f4600c.f4664u;
        n2Var.e();
        n2Var.f = 0;
        n2Var.f4182g = false;
        this.f4600c.f4659p.set(false);
        if (this.f4598a || z) {
            return;
        }
        this.f4598a = true;
        synchronized (this.f4600c.v) {
            try {
                for (AdEventListener adEventListener : this.f4600c.v.keySet()) {
                    if (adEventListener != null) {
                        try {
                            list = (List) this.f4600c.v.get(adEventListener);
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
                this.f4600c.v.clear();
            } finally {
            }
        }
    }
}
