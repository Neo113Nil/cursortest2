package com.ironsource.b;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.aiming.mdt.utils.Constants;
import com.ironsource.b.c;
import com.ironsource.b.d.c;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* compiled from: BannerSmash.java */
/* loaded from: classes2.dex */
public class e extends c implements com.ironsource.b.f.d {
    private boolean A;
    private Handler B;
    private a C;
    private l D;
    private long E;
    private g F;
    private final String v;
    private JSONObject w;
    private com.ironsource.b.f.c x;
    private com.ironsource.b.f.a y;
    private long z;

    @Override // com.ironsource.b.c
    boolean a() {
        return false;
    }

    @Override // com.ironsource.b.c
    boolean b() {
        return false;
    }

    @Override // com.ironsource.b.c
    void h() {
    }

    @Override // com.ironsource.b.c
    protected String u() {
        return "banner";
    }

    e(com.ironsource.b.e.o oVar, long j, int i) {
        super(oVar);
        this.v = getClass().getName();
        this.F = null;
        this.w = oVar.e();
        this.g = oVar.g();
        this.i = oVar.f();
        this.z = j;
        this.E = i * 1000;
        this.B = new Handler(Looper.getMainLooper());
        this.C = new a();
    }

    void a(Activity activity, String str, String str2) {
        i();
        if (this.f6749b != null) {
            this.f6749b.addBannerListener(this);
            this.f6749b.initBanners(activity, str, str2, this.w, this);
        }
    }

    @Override // com.ironsource.b.c
    void i() {
        try {
            this.l = new TimerTask() { // from class: com.ironsource.b.e.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    if (e.this.f6748a != c.a.INIT_PENDING || e.this.x == null) {
                        return;
                    }
                    e.this.b(com.ironsource.b.h.d.b("Timeout", Constants.ADTYPE_BANNER));
                }
            };
            Timer timer = new Timer();
            if (this.l != null) {
                timer.schedule(this.l, this.z);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.ironsource.b.c
    void j() {
        try {
            this.m = new TimerTask() { // from class: com.ironsource.b.e.2
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    if (e.this.f6748a != c.a.LOAD_PENDING || e.this.x == null) {
                        return;
                    }
                    e.this.a(new com.ironsource.b.d.b(603, "Timeout"));
                }
            };
            Timer timer = new Timer();
            if (this.m != null) {
                timer.schedule(this.m, this.z);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void a(l lVar) {
        if (lVar != null) {
            this.r.a(c.a.ADAPTER_API, m() + ":loadBanner()", 1);
            this.A = false;
            x();
            j();
            this.y = lVar;
            this.D = lVar;
            this.F = lVar.getSize();
            this.D.a(this);
            if (this.f6749b != null) {
                e();
                this.f6749b.loadBanner(lVar, this.w, this);
            }
        }
    }

    public void b(l lVar) {
        x();
        if (this.f6749b != null) {
            this.r.a(c.a.ADAPTER_API, m() + ":destroyBanner()", 1);
            this.f6749b.destroyBanner(lVar, this.w);
            return;
        }
        this.r.a(c.a.ADAPTER_API, m() + ":destroyBanner wasn't called. adapter is null", 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        this.A = true;
        if (this.f6749b != null) {
            this.r.a(c.a.ADAPTER_API, m() + ":reloadBanner()", 1);
            this.f6749b.reloadBanner(this.w);
            this.x.a(this);
        }
    }

    void a(com.ironsource.b.f.c cVar) {
        this.x = cVar;
    }

    @Override // com.ironsource.b.f.b
    public void a(com.ironsource.b.d.b bVar) {
        if (this.A && this.y != null) {
            this.r.a(c.a.ADAPTER_API, m() + ":onBannerAdReloadFailed()", 1);
            x();
            this.y.b(this);
            return;
        }
        this.r.a(c.a.ADAPTER_API, m() + ":onBannerAdLoadFailed()", 1);
        g();
        if (this.f6748a != c.a.LOAD_PENDING || this.y == null) {
            return;
        }
        this.y.a(bVar, this);
    }

    public void b(com.ironsource.b.d.b bVar) {
        f();
        if (this.f6748a == c.a.INIT_PENDING) {
            a(c.a.INIT_FAILED);
            if (this.x != null) {
                this.x.a(bVar, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j) {
        if (this.B != null) {
            this.r.a(c.a.NATIVE, this.v + ":refreshing banner in " + j + " milliseconds ", 1);
            this.C = new a();
            this.B.postDelayed(this.C, j);
        }
    }

    private void x() {
        if (this.B == null || this.C == null) {
            return;
        }
        this.B.removeCallbacks(this.C);
    }

    /* compiled from: BannerSmash.java */
    private class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.D != null) {
                if (!e.this.D.isShown() || !e.this.h) {
                    e.this.a(e.this.E);
                    return;
                }
                e.this.r.a(c.a.NATIVE, e.this.v + ": refreshing banner for : " + e.this.m(), 1);
                e.this.w();
            }
        }
    }

    public g v() {
        return this.F;
    }
}
