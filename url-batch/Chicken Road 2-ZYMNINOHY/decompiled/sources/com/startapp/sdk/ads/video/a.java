package com.startapp.sdk.ads.video;

import android.widget.ProgressBar;
import com.startapp.sdk.ads.video.tracking.ActionTrackingLink;
import com.startapp.sdk.ads.video.tracking.VideoTrackingParams;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f6235a;

    public a(c cVar) {
        this.f6235a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c cVar = this.f6235a;
        if (cVar.L == null) {
            return;
        }
        ProgressBar progressBar = cVar.f6242P;
        if (progressBar != null && progressBar.isShown()) {
            cVar.I();
        }
        cVar.a(VideoMode$VideoFinishedReason.SKIPPED);
        ActionTrackingLink[] p2 = cVar.x().getVideoTrackingDetails().p();
        cVar.a(cVar.f6259g0, new VideoTrackingParams(cVar.a(cVar.f6259g0), cVar.f7820A, cVar.n, cVar.f6261i0), "skipped", p2);
    }
}
