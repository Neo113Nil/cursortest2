package z2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.pi1;
import com.google.android.gms.internal.ads.sw;
import com.google.android.gms.internal.ads.yg0;
import com.google.android.gms.internal.ads.yu;

/* loaded from: classes.dex */
public final class x extends yg0 {

    /* renamed from: f, reason: collision with root package name */
    private final AdOverlayInfoParcel f23685f;

    /* renamed from: g, reason: collision with root package name */
    private final Activity f23686g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f23687h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f23688i = false;

    public x(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f23685f = adOverlayInfoParcel;
        this.f23686g = activity;
    }

    private final synchronized void a() {
        if (this.f23688i) {
            return;
        }
        q qVar = this.f23685f.f2411h;
        if (qVar != null) {
            qVar.E(4);
        }
        this.f23688i = true;
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void L(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f23687h);
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final boolean M() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void P2(Bundle bundle) {
        q qVar;
        if (((Boolean) sw.c().b(m10.y6)).booleanValue()) {
            this.f23686g.requestWindowFeature(1);
        }
        boolean z6 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z6 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f23685f;
        if (adOverlayInfoParcel != null && !z6) {
            if (bundle == null) {
                yu yuVar = adOverlayInfoParcel.f2410g;
                if (yuVar != null) {
                    yuVar.M();
                }
                pi1 pi1Var = this.f23685f.D;
                if (pi1Var != null) {
                    pi1Var.r();
                }
                if (this.f23686g.getIntent() != null && this.f23686g.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (qVar = this.f23685f.f2411h) != null) {
                    qVar.a();
                }
            }
            y2.t.j();
            Activity activity = this.f23686g;
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f23685f;
            f fVar = adOverlayInfoParcel2.f2409f;
            if (a.b(activity, fVar, adOverlayInfoParcel2.f2417n, fVar.f23644n)) {
                return;
            }
        }
        this.f23686g.finish();
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void d0(x3.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void f() {
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void j5(int i7, int i8, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void k() {
        if (this.f23686g.isFinishing()) {
            a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void l() {
        if (this.f23687h) {
            this.f23686g.finish();
            return;
        }
        this.f23687h = true;
        q qVar = this.f23685f.f2411h;
        if (qVar != null) {
            qVar.o4();
        }
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void m() {
        q qVar = this.f23685f.f2411h;
        if (qVar != null) {
            qVar.k6();
        }
        if (this.f23686g.isFinishing()) {
            a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void n() {
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void p() {
        if (this.f23686g.isFinishing()) {
            a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void q() {
        q qVar = this.f23685f.f2411h;
        if (qVar != null) {
            qVar.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void t() {
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void x() {
    }
}
