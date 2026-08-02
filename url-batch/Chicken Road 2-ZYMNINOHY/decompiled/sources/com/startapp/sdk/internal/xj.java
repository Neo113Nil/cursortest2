package com.startapp.sdk.internal;

import android.widget.ProgressBar;
import com.startapp.sdk.adsbase.AdsCommonMetaData;

/* loaded from: classes.dex */
public final class xj {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.c f7883a;

    public xj(com.startapp.sdk.ads.video.c cVar) {
        this.f7883a = cVar;
    }

    public final void a(int i4) {
        com.startapp.sdk.ads.video.c cVar;
        pd pdVar;
        pd pdVar2 = this.f7883a.L;
        int duration = pdVar2 != null ? pdVar2.f7445h.getDuration() : 0;
        com.startapp.sdk.ads.video.c cVar2 = this.f7883a;
        if (cVar2.f6252Z && duration > 0 && cVar2.C()) {
            com.startapp.sdk.ads.video.c cVar3 = this.f7883a;
            cVar3.f6251Y = i4;
            int currentPosition = (cVar3.L.f7445h.getCurrentPosition() * 100) / duration;
            ProgressBar progressBar = this.f7883a.f6242P;
            if (progressBar == null || !progressBar.isShown()) {
                int i5 = this.f7883a.f6251Y;
                if (i5 >= 100 || i5 - currentPosition > AdsCommonMetaData.k().F().j() || (pdVar = (cVar = this.f7883a).L) == null) {
                    return;
                }
                pdVar.f7445h.pause();
                if (cVar.f6258f0) {
                    return;
                }
                ProgressBar progressBar2 = cVar.f6242P;
                if (progressBar2 == null || !progressBar2.isShown()) {
                    cVar.f6262j0.postDelayed(new pj(cVar), AdsCommonMetaData.k().F().h());
                    return;
                }
                return;
            }
            com.startapp.sdk.ads.video.c cVar4 = this.f7883a;
            if (!cVar4.f6253a0 && cVar4.B()) {
                this.f7883a.H();
                return;
            }
            int i6 = this.f7883a.f6251Y;
            if (i6 == 100 || i6 - currentPosition > AdsCommonMetaData.k().F().i()) {
                com.startapp.sdk.ads.video.c cVar5 = this.f7883a;
                pd pdVar3 = cVar5.L;
                if (pdVar3 != null) {
                    pdVar3.f7445h.start();
                    cVar5.f7830t.setBackgroundColor(33554431);
                }
                cVar5.I();
            }
        }
    }
}
