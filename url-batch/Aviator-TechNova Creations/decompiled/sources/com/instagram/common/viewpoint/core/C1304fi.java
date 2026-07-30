package com.instagram.common.viewpoint.core;

import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.MediaViewVideoRenderer;

/* renamed from: com.facebook.ads.redexgen.X.fi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1304fi implements Y1 {
    public final /* synthetic */ MediaViewListener A00;
    public final /* synthetic */ C1303fh A01;

    public C1304fi(C1303fh c1303fh, MediaViewListener mediaViewListener) {
        this.A01 = c1303fh;
        this.A00 = mediaViewListener;
    }

    @Override // com.instagram.common.viewpoint.core.Y1
    public final void ACn() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A03;
        mediaViewListener.onComplete(mediaView);
    }

    @Override // com.instagram.common.viewpoint.core.Y1
    public final void AD9() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A03;
        mediaViewListener.onEnterFullscreen(mediaView);
    }

    @Override // com.instagram.common.viewpoint.core.Y1
    public final void ADF() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A03;
        mediaViewListener.onExitFullscreen(mediaView);
    }

    @Override // com.instagram.common.viewpoint.core.Y1
    public final void ADN() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A03;
        mediaViewListener.onFullscreenBackground(mediaView);
    }

    @Override // com.instagram.common.viewpoint.core.Y1
    public final void ADP() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A03;
        mediaViewListener.onFullscreenForeground(mediaView);
    }

    @Override // com.instagram.common.viewpoint.core.Y1
    public final void AEX() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A03;
        mediaViewListener.onPlay(mediaView);
    }

    @Override // com.instagram.common.viewpoint.core.Y1
    public final void AFu() {
        MediaView mediaView;
        MediaViewVideoRenderer mediaViewVideoRenderer;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A03;
        mediaViewVideoRenderer = this.A01.A05;
        mediaViewListener.onVolumeChange(mediaView, mediaViewVideoRenderer.getVolume());
    }

    @Override // com.instagram.common.viewpoint.core.Y1
    public final void onPause() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A03;
        mediaViewListener.onPause(mediaView);
    }
}
