package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;

/* loaded from: classes.dex */
public final class ee0 implements c3.i, c3.n, c3.p {

    /* renamed from: a, reason: collision with root package name */
    private final jd0 f4571a;

    /* renamed from: b, reason: collision with root package name */
    private c3.v f4572b;

    /* renamed from: c, reason: collision with root package name */
    private u2.f f4573c;

    public ee0(jd0 jd0Var) {
        this.f4571a = jd0Var;
    }

    @Override // c3.i
    public final void a(MediationBannerAdapter mediationBannerAdapter) {
        r3.o.e("#008 Must be called on the main UI thread.");
        io0.b("Adapter called onAdClosed.");
        try {
            this.f4571a.d();
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // c3.p
    public final void b(MediationNativeAdapter mediationNativeAdapter) {
        r3.o.e("#008 Must be called on the main UI thread.");
        io0.b("Adapter called onAdOpened.");
        try {
            this.f4571a.l();
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // c3.n
    public final void c(MediationInterstitialAdapter mediationInterstitialAdapter, int i7) {
        r3.o.e("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i7);
        sb.append(".");
        io0.b(sb.toString());
        try {
            this.f4571a.A(i7);
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // c3.i
    public final void d(MediationBannerAdapter mediationBannerAdapter, r2.a aVar) {
        r3.o.e("#008 Must be called on the main UI thread.");
        int a7 = aVar.a();
        String c7 = aVar.c();
        String b7 = aVar.b();
        StringBuilder sb = new StringBuilder(String.valueOf(c7).length() + 97 + String.valueOf(b7).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(a7);
        sb.append(". ErrorMessage: ");
        sb.append(c7);
        sb.append(". ErrorDomain: ");
        sb.append(b7);
        io0.b(sb.toString());
        try {
            this.f4571a.T3(aVar.d());
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // c3.i
    public final void e(MediationBannerAdapter mediationBannerAdapter) {
        r3.o.e("#008 Must be called on the main UI thread.");
        io0.b("Adapter called onAdClicked.");
        try {
            this.f4571a.b();
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // c3.n
    public final void f(MediationInterstitialAdapter mediationInterstitialAdapter, r2.a aVar) {
        r3.o.e("#008 Must be called on the main UI thread.");
        int a7 = aVar.a();
        String c7 = aVar.c();
        String b7 = aVar.b();
        StringBuilder sb = new StringBuilder(String.valueOf(c7).length() + 97 + String.valueOf(b7).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(a7);
        sb.append(". ErrorMessage: ");
        sb.append(c7);
        sb.append(". ErrorDomain: ");
        sb.append(b7);
        io0.b(sb.toString());
        try {
            this.f4571a.T3(aVar.d());
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // c3.p
    public final void g(MediationNativeAdapter mediationNativeAdapter, u2.f fVar) {
        r3.o.e("#008 Must be called on the main UI thread.");
        String valueOf = String.valueOf(fVar.a());
        io0.b(valueOf.length() != 0 ? "Adapter called onAdLoaded with template id ".concat(valueOf) : new String("Adapter called onAdLoaded with template id "));
        this.f4573c = fVar;
        try {
            this.f4571a.n();
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // c3.p
    public final void h(MediationNativeAdapter mediationNativeAdapter) {
        r3.o.e("#008 Must be called on the main UI thread.");
        io0.b("Adapter called onAdClosed.");
        try {
            this.f4571a.d();
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // c3.i
    public final void i(MediationBannerAdapter mediationBannerAdapter) {
        r3.o.e("#008 Must be called on the main UI thread.");
        io0.b("Adapter called onAdLoaded.");
        try {
            this.f4571a.n();
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // c3.p
    public final void j(MediationNativeAdapter mediationNativeAdapter) {
        r3.o.e("#008 Must be called on the main UI thread.");
        c3.v vVar = this.f4572b;
        if (this.f4573c == null) {
            if (vVar == null) {
                io0.i("#007 Could not call remote method.", null);
                return;
            } else if (!vVar.l()) {
                io0.b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        io0.b("Adapter called onAdClicked.");
        try {
            this.f4571a.b();
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // c3.n
    public final void k(MediationInterstitialAdapter mediationInterstitialAdapter) {
        r3.o.e("#008 Must be called on the main UI thread.");
        io0.b("Adapter called onAdLoaded.");
        try {
            this.f4571a.n();
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // c3.i
    public final void l(MediationBannerAdapter mediationBannerAdapter) {
        r3.o.e("#008 Must be called on the main UI thread.");
        io0.b("Adapter called onAdOpened.");
        try {
            this.f4571a.l();
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // c3.n
    public final void m(MediationInterstitialAdapter mediationInterstitialAdapter) {
        r3.o.e("#008 Must be called on the main UI thread.");
        io0.b("Adapter called onAdClosed.");
        try {
            this.f4571a.d();
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // c3.p
    public final void n(MediationNativeAdapter mediationNativeAdapter, r2.a aVar) {
        r3.o.e("#008 Must be called on the main UI thread.");
        int a7 = aVar.a();
        String c7 = aVar.c();
        String b7 = aVar.b();
        StringBuilder sb = new StringBuilder(String.valueOf(c7).length() + 97 + String.valueOf(b7).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(a7);
        sb.append(". ErrorMessage: ");
        sb.append(c7);
        sb.append(". ErrorDomain: ");
        sb.append(b7);
        io0.b(sb.toString());
        try {
            this.f4571a.T3(aVar.d());
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // c3.i
    public final void o(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        r3.o.e("#008 Must be called on the main UI thread.");
        io0.b("Adapter called onAppEvent.");
        try {
            this.f4571a.l3(str, str2);
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // c3.p
    public final void p(MediationNativeAdapter mediationNativeAdapter) {
        r3.o.e("#008 Must be called on the main UI thread.");
        c3.v vVar = this.f4572b;
        if (this.f4573c == null) {
            if (vVar == null) {
                io0.i("#007 Could not call remote method.", null);
                return;
            } else if (!vVar.m()) {
                io0.b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        io0.b("Adapter called onAdImpression.");
        try {
            this.f4571a.o();
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // c3.n
    public final void q(MediationInterstitialAdapter mediationInterstitialAdapter) {
        r3.o.e("#008 Must be called on the main UI thread.");
        io0.b("Adapter called onAdOpened.");
        try {
            this.f4571a.l();
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // c3.p
    public final void r(MediationNativeAdapter mediationNativeAdapter, c3.v vVar) {
        r3.o.e("#008 Must be called on the main UI thread.");
        io0.b("Adapter called onAdLoaded.");
        this.f4572b = vVar;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            r2.w wVar = new r2.w();
            wVar.c(new td0());
            if (vVar != null && vVar.r()) {
                vVar.K(wVar);
            }
        }
        try {
            this.f4571a.n();
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // c3.p
    public final void s(MediationNativeAdapter mediationNativeAdapter, u2.f fVar, String str) {
        if (!(fVar instanceof f50)) {
            io0.g("Unexpected native custom template ad type.");
            return;
        }
        try {
            this.f4571a.M2(((f50) fVar).b(), str);
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    public final u2.f t() {
        return this.f4573c;
    }

    public final c3.v u() {
        return this.f4572b;
    }
}
