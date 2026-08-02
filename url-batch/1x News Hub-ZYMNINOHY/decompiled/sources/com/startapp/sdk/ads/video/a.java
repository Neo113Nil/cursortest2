package com.startapp.sdk.ads.video;

import android.widget.ProgressBar;
import com.startapp.sdk.ads.video.tracking.ActionTrackingLink;
import com.startapp.sdk.ads.video.tracking.VideoTrackingParams;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f3152a;

    public a(c cVar) {
        this.f3152a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c cVar = this.f3152a;
        if (cVar.L == null) {
            return;
        }
        ProgressBar progressBar = cVar.f3159P;
        if (progressBar != null && progressBar.isShown()) {
            cVar.I();
        }
        cVar.a(VideoMode$VideoFinishedReason.SKIPPED);
        ActionTrackingLink[] p3 = cVar.x().getVideoTrackingDetails().p();
        cVar.a(cVar.f3176g0, new VideoTrackingParams(cVar.a(cVar.f3176g0), cVar.f4675A, cVar.f4530n, cVar.f3178i0), "skipped", p3);
    }
}
