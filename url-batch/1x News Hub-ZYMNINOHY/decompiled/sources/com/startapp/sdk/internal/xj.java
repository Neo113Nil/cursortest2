package com.startapp.sdk.internal;

import android.widget.ProgressBar;
import com.startapp.sdk.adsbase.AdsCommonMetaData;

/* loaded from: classes.dex */
public final class xj {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.c f4737a;

    public xj(com.startapp.sdk.ads.video.c cVar) {
        this.f4737a = cVar;
    }

    public final void a(int i3) {
        com.startapp.sdk.ads.video.c cVar;
        pd pdVar;
        pd pdVar2 = this.f4737a.L;
        int duration = pdVar2 != null ? pdVar2.f4310h.getDuration() : 0;
        com.startapp.sdk.ads.video.c cVar2 = this.f4737a;
        if (cVar2.f3169Z && duration > 0 && cVar2.C()) {
            com.startapp.sdk.ads.video.c cVar3 = this.f4737a;
            cVar3.f3168Y = i3;
            int currentPosition = (cVar3.L.f4310h.getCurrentPosition() * 100) / duration;
            ProgressBar progressBar = this.f4737a.f3159P;
            if (progressBar == null || !progressBar.isShown()) {
                int i4 = this.f4737a.f3168Y;
                if (i4 >= 100 || i4 - currentPosition > AdsCommonMetaData.k().F().j() || (pdVar = (cVar = this.f4737a).L) == null) {
                    return;
                }
                pdVar.f4310h.pause();
                if (cVar.f3175f0) {
                    return;
                }
                ProgressBar progressBar2 = cVar.f3159P;
                if (progressBar2 == null || !progressBar2.isShown()) {
                    cVar.f3179j0.postDelayed(new pj(cVar), AdsCommonMetaData.k().F().h());
                    return;
                }
                return;
            }
            com.startapp.sdk.ads.video.c cVar4 = this.f4737a;
            if (!cVar4.f3170a0 && cVar4.B()) {
                this.f4737a.H();
                return;
            }
            int i5 = this.f4737a.f3168Y;
            if (i5 == 100 || i5 - currentPosition > AdsCommonMetaData.k().F().i()) {
                com.startapp.sdk.ads.video.c cVar5 = this.f4737a;
                pd pdVar3 = cVar5.L;
                if (pdVar3 != null) {
                    pdVar3.f4310h.start();
                    cVar5.f4685t.setBackgroundColor(33554431);
                }
                cVar5.I();
            }
        }
    }
}
