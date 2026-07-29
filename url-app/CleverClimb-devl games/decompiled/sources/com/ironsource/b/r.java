package com.ironsource.b;

import android.app.Activity;
import com.ironsource.b.c;
import com.ironsource.b.d.c;
import com.ironsource.b.f.t;
import com.ironsource.b.f.u;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* compiled from: RewardedVideoSmash.java */
/* loaded from: classes2.dex */
public class r extends c implements u {
    private JSONObject v;
    private t w;
    private String x;
    private int y;
    private final String z;

    @Override // com.ironsource.b.c
    void j() {
    }

    @Override // com.ironsource.b.c
    protected String u() {
        return "rewardedvideo";
    }

    r(com.ironsource.b.e.o oVar, int i) {
        super(oVar);
        this.z = "requestUrl";
        this.v = oVar.b();
        this.n = this.v.optInt("maxAdsPerIteration", 99);
        this.o = this.v.optInt("maxAdsPerSession", 99);
        this.p = this.v.optInt("maxAdsPerDay", 99);
        this.x = this.v.optString("requestUrl");
        this.y = i;
    }

    @Override // com.ironsource.b.c
    void h() {
        this.k = 0;
        a(x() ? c.a.AVAILABLE : c.a.NOT_AVAILABLE);
    }

    @Override // com.ironsource.b.c
    void i() {
        try {
            this.l = new TimerTask() { // from class: com.ironsource.b.r.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    if (r.this.w != null) {
                        r.this.r.a(c.a.NATIVE, "Timeout for " + r.this.m(), 0);
                        r.this.a(c.a.NOT_AVAILABLE);
                        r.this.w.a(false, r.this);
                    }
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

    public void a(Activity activity, String str, String str2) {
        i();
        if (this.f6749b != null) {
            this.f6749b.addRewardedVideoListener(this);
            this.r.a(c.a.ADAPTER_API, m() + ":initRewardedVideo()", 1);
            this.f6749b.initRewardedVideo(activity, str, str2, this.v, this);
        }
    }

    public void v() {
        if (this.f6749b != null) {
            this.r.a(c.a.ADAPTER_API, m() + ":fetchRewardedVideo()", 1);
            this.f6749b.fetchRewardedVideo(this.v);
        }
    }

    public void w() {
        if (this.f6749b != null) {
            this.r.a(c.a.ADAPTER_API, m() + ":showRewardedVideo()", 1);
            e();
            this.f6749b.showRewardedVideo(this.v, this);
        }
    }

    public boolean x() {
        if (this.f6749b == null) {
            return false;
        }
        this.r.a(c.a.ADAPTER_API, m() + ":isRewardedVideoAvailable()", 1);
        return this.f6749b.isRewardedVideoAvailable(this.v);
    }

    public void a(t tVar) {
        this.w = tVar;
    }

    @Override // com.ironsource.b.f.u
    public void a(com.ironsource.b.d.b bVar) {
        if (this.w != null) {
            this.w.a(bVar, this);
        }
    }

    @Override // com.ironsource.b.f.u
    public void y() {
        if (this.w != null) {
            this.w.a(this);
        }
    }

    @Override // com.ironsource.b.f.u
    public void z() {
        if (this.w != null) {
            this.w.b(this);
        }
        v();
    }

    @Override // com.ironsource.b.f.u
    public void b(boolean z) {
        f();
        if (d()) {
            if ((!z || this.f6748a == c.a.AVAILABLE) && (z || this.f6748a == c.a.NOT_AVAILABLE)) {
                return;
            }
            a(z ? c.a.AVAILABLE : c.a.NOT_AVAILABLE);
            if (this.w != null) {
                this.w.a(z, this);
            }
        }
    }

    @Override // com.ironsource.b.f.u
    public void A() {
        if (this.w != null) {
            this.w.c(this);
        }
    }

    @Override // com.ironsource.b.f.u
    public void B() {
        if (this.w != null) {
            this.w.d(this);
        }
    }

    @Override // com.ironsource.b.f.u
    public void C() {
        if (this.w != null) {
            this.w.e(this);
        }
    }

    String D() {
        return this.x;
    }
}
