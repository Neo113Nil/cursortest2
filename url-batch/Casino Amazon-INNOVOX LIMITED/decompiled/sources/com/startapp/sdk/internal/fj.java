package com.startapp.sdk.internal;

import android.view.View;
import android.widget.VideoView;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class fj implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.a f241a;

    public fj(com.startapp.sdk.ads.video.a aVar) {
        this.f241a = aVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        xc xcVar;
        VideoView videoView;
        com.startapp.sdk.ads.video.a aVar = this.f241a;
        aVar.T = true;
        if (!aVar.S || (xcVar = aVar.L) == null || xcVar.g == null || !aVar.Y || (videoView = aVar.M) == null) {
            return;
        }
        zh.a(aVar.t, true, "videoApi.setVideoFrame", Integer.valueOf(ph.b(aVar.f248a, videoView.getLeft())), Integer.valueOf(ph.b(aVar.f248a, videoView.getTop())), Integer.valueOf(ph.b(aVar.f248a, videoView.getWidth())), Integer.valueOf(ph.b(aVar.f248a, videoView.getHeight())));
    }
}
