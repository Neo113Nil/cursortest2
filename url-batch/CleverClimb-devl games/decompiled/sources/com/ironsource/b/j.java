package com.ironsource.b;

import android.app.Activity;
import com.aiming.mdt.utils.Constants;
import com.ironsource.b.c;
import com.ironsource.b.d.c;
import com.mopub.common.AdType;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* compiled from: InterstitialSmash.java */
/* loaded from: classes2.dex */
public class j extends c implements com.ironsource.b.f.l, com.ironsource.b.f.p {
    private JSONObject v;
    private com.ironsource.b.f.k w;
    private com.ironsource.b.f.q x;
    private int y;

    @Override // com.ironsource.b.c
    protected String u() {
        return AdType.INTERSTITIAL;
    }

    j(com.ironsource.b.e.o oVar, int i) {
        super(oVar);
        this.v = oVar.d();
        this.n = this.v.optInt("maxAdsPerIteration", 99);
        this.o = this.v.optInt("maxAdsPerSession", 99);
        this.p = this.v.optInt("maxAdsPerDay", 99);
        this.g = oVar.g();
        this.i = oVar.f();
        this.y = i;
    }

    @Override // com.ironsource.b.c
    void h() {
        this.k = 0;
        a(c.a.INITIATED);
    }

    @Override // com.ironsource.b.c
    void i() {
        try {
            this.l = new TimerTask() { // from class: com.ironsource.b.j.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    if (j.this.f6748a != c.a.INIT_PENDING || j.this.w == null) {
                        return;
                    }
                    j.this.a(c.a.INIT_FAILED);
                    j.this.w.a(com.ironsource.b.h.d.b("Timeout", Constants.ADTYPE_INTERSTITIAL), j.this);
                }
            };
            Timer timer = new Timer();
            if (this.l != null) {
                timer.schedule(this.l, this.y * 1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.ironsource.b.c
    void j() {
        try {
            this.m = new TimerTask() { // from class: com.ironsource.b.j.2
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    if (j.this.f6748a != c.a.LOAD_PENDING || j.this.w == null) {
                        return;
                    }
                    j.this.a(c.a.NOT_AVAILABLE);
                    j.this.w.b(com.ironsource.b.h.d.e("Timeout"), j.this);
                }
            };
            Timer timer = new Timer();
            if (this.m != null) {
                timer.schedule(this.m, this.y * 1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void a(Activity activity, String str, String str2) {
        i();
        if (this.f6749b != null) {
            this.f6749b.addInterstitialListener(this);
            if (this.x != null) {
                this.f6749b.setRewardedInterstitialListener(this);
            }
            this.r.a(c.a.ADAPTER_API, m() + ":initInterstitial()", 1);
            this.f6749b.initInterstitial(activity, str, str2, this.v, this);
        }
    }

    public void v() {
        j();
        if (this.f6749b != null) {
            this.r.a(c.a.ADAPTER_API, m() + ":loadInterstitial()", 1);
            this.f6749b.loadInterstitial(this.v, this);
        }
    }

    public void w() {
        if (this.f6749b != null) {
            this.r.a(c.a.ADAPTER_API, m() + ":showInterstitial()", 1);
            e();
            this.f6749b.showInterstitial(this.v, this);
        }
    }

    public boolean x() {
        if (this.f6749b == null) {
            return false;
        }
        this.r.a(c.a.ADAPTER_API, m() + ":isInterstitialReady()", 1);
        return this.f6749b.isInterstitialReady(this.v);
    }

    public void a(com.ironsource.b.f.k kVar) {
        this.w = kVar;
    }

    public void a(com.ironsource.b.f.q qVar) {
        this.x = qVar;
    }

    @Override // com.ironsource.b.f.l
    public void y() {
        f();
        if (this.f6748a == c.a.INIT_PENDING) {
            a(c.a.INITIATED);
            if (this.w != null) {
                this.w.a(this);
            }
        }
    }

    @Override // com.ironsource.b.f.l
    public void a(com.ironsource.b.d.b bVar) {
        f();
        if (this.f6748a == c.a.INIT_PENDING) {
            a(c.a.INIT_FAILED);
            if (this.w != null) {
                this.w.a(bVar, this);
            }
        }
    }

    @Override // com.ironsource.b.f.j
    public void z() {
        g();
        if (this.f6748a != c.a.LOAD_PENDING || this.w == null) {
            return;
        }
        this.w.b(this);
    }

    @Override // com.ironsource.b.f.j
    public void a_(com.ironsource.b.d.b bVar) {
        g();
        if (this.f6748a != c.a.LOAD_PENDING || this.w == null) {
            return;
        }
        this.w.b(bVar, this);
    }

    @Override // com.ironsource.b.f.j
    public void A() {
        if (this.w != null) {
            this.w.c(this);
        }
    }

    @Override // com.ironsource.b.f.j
    public void B() {
        if (this.w != null) {
            this.w.d(this);
        }
    }

    @Override // com.ironsource.b.f.j
    public void C() {
        if (this.w != null) {
            this.w.e(this);
        }
    }

    @Override // com.ironsource.b.f.j
    public void c(com.ironsource.b.d.b bVar) {
        if (this.w != null) {
            this.w.c(bVar, this);
        }
    }

    @Override // com.ironsource.b.f.j
    public void D() {
        if (this.w != null) {
            this.w.f(this);
        }
    }

    @Override // com.ironsource.b.f.l
    public void E() {
        if (this.w != null) {
            this.w.g(this);
        }
    }

    @Override // com.ironsource.b.f.p
    public void F() {
        if (this.x != null) {
            this.x.h(this);
        }
    }
}
