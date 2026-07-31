package com.startapp.sdk.internal;

import android.widget.ProgressBar;
import com.startapp.sdk.ads.video.VideoMode$VideoFinishedReason;
import com.startapp.sdk.ads.video.tracking.VideoTrackingParams;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class xi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.a f501a;

    public xi(com.startapp.sdk.ads.video.a aVar) {
        this.f501a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ProgressBar progressBar;
        com.startapp.sdk.ads.video.a aVar = this.f501a;
        if (aVar.L == null) {
            return;
        }
        ProgressBar progressBar2 = aVar.P;
        if (progressBar2 != null && progressBar2.isShown()) {
            aVar.d0.removeCallbacksAndMessages(null);
            ProgressBar progressBar3 = aVar.P;
            if (progressBar3 != null && progressBar3.isShown() && (progressBar = aVar.P) != null) {
                progressBar.setVisibility(8);
            }
        }
        aVar.a(VideoMode$VideoFinishedReason.SKIPPED);
        aVar.a(aVar.b0, new VideoTrackingParams(aVar.n, aVar.a(aVar.b0), aVar.A), "skipped", aVar.y().getVideoTrackingDetails().p());
    }
}
