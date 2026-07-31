package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.e;
import com.google.ads.mediation.f;

/* loaded from: classes.dex */
public final class ke0<NETWORK_EXTRAS extends com.google.ads.mediation.f, SERVER_PARAMETERS extends com.google.ads.mediation.e> implements com.google.ads.mediation.c, com.google.ads.mediation.d {

    /* renamed from: a, reason: collision with root package name */
    private final jd0 f7479a;

    public ke0(jd0 jd0Var) {
        this.f7479a = jd0Var;
    }

    @Override // com.google.ads.mediation.d
    public final void a(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, p0.a aVar) {
        String valueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(valueOf.length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error ");
        sb.append(valueOf);
        sb.append(".");
        io0.b(sb.toString());
        qw.b();
        if (!bo0.p()) {
            io0.i("#008 Must be called on the main UI thread.", null);
            bo0.f3473b.post(new je0(this, aVar));
        } else {
            try {
                this.f7479a.A(le0.a(aVar));
            } catch (RemoteException e7) {
                io0.i("#007 Could not call remote method.", e7);
            }
        }
    }

    @Override // com.google.ads.mediation.c
    public final void b(MediationBannerAdapter<?, ?> mediationBannerAdapter, p0.a aVar) {
        io0.b("Adapter called onFailedToReceiveAd with error. ".concat(String.valueOf(aVar)));
        qw.b();
        if (!bo0.p()) {
            io0.i("#008 Must be called on the main UI thread.", null);
            bo0.f3473b.post(new ie0(this, aVar));
        } else {
            try {
                this.f7479a.A(le0.a(aVar));
            } catch (RemoteException e7) {
                io0.i("#007 Could not call remote method.", e7);
            }
        }
    }
}
