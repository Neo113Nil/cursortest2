package com.startapp.sdk.internal;

import android.widget.VideoView;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class yi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.a f513a;

    public yi(com.startapp.sdk.ads.video.a aVar) {
        this.f513a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoView videoView;
        com.startapp.sdk.ads.video.a aVar = this.f513a;
        if (aVar.L == null || (videoView = aVar.M) == null) {
            return;
        }
        aVar.A++;
        videoView.setVisibility(0);
        com.startapp.sdk.ads.video.a aVar2 = this.f513a;
        aVar2.a0 = false;
        zh.a(aVar2.t, true, "videoApi.setVideoCurrentPosition", 0);
        zh.a(aVar2.t, true, "videoApi.setSkipTimer", 0);
        com.startapp.sdk.ads.video.a aVar3 = this.f513a;
        aVar3.a(aVar3.L);
    }
}
