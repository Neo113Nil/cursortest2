package com.startapp.sdk.internal;

import android.view.View;
import android.widget.VideoView;

/* loaded from: classes.dex */
public final class nj implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.c f4214a;

    public nj(com.startapp.sdk.ads.video.c cVar) {
        this.f4214a = cVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        VideoView videoView;
        com.startapp.sdk.ads.video.c cVar = this.f4214a;
        cVar.f3163T = true;
        if (cVar.f3162S && cVar.C()) {
            com.startapp.sdk.ads.video.c cVar2 = this.f4214a;
            if (!cVar2.f3170a0 || (videoView = cVar2.f3156M) == null) {
                return;
            }
            cVar2.a(videoView);
        }
    }
}
