package com.startapp.sdk.internal;

import android.widget.VideoView;

/* loaded from: classes.dex */
public final class sj implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.c f7580a;

    public sj(com.startapp.sdk.ads.video.c cVar) {
        this.f7580a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoView videoView;
        com.startapp.sdk.ads.video.c cVar = this.f7580a;
        if (cVar.L == null || (videoView = cVar.f6239M) == null) {
            return;
        }
        cVar.f7820A++;
        videoView.setVisibility(0);
        com.startapp.sdk.ads.video.c cVar2 = this.f7580a;
        cVar2.f6258f0 = false;
        si.a(cVar2.f7830t, true, "videoApi.setVideoCurrentPosition", 0);
        si.a(cVar2.f7830t, true, "videoApi.setSkipTimer", 0);
        this.f7580a.G();
    }
}
