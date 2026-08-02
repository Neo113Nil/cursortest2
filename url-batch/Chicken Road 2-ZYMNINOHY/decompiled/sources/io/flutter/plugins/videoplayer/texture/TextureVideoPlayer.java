package io.flutter.plugins.videoplayer.texture;

import T.C0107z;
import a.AbstractC0124a;
import a0.C0130F;
import a0.C0147m;
import a0.C0149o;
import a0.InterfaceC0151q;
import android.content.Context;
import android.view.Surface;
import io.flutter.plugins.videoplayer.ExoPlayerEventListener;
import io.flutter.plugins.videoplayer.VideoAsset;
import io.flutter.plugins.videoplayer.VideoPlayer;
import io.flutter.plugins.videoplayer.VideoPlayerCallbacks;
import io.flutter.plugins.videoplayer.VideoPlayerOptions;
import io.flutter.plugins.videoplayer.platformview.a;
import io.flutter.view.TextureRegistry;
import q0.InterfaceC1352A;
import t0.r;

/* loaded from: classes.dex */
public final class TextureVideoPlayer extends VideoPlayer implements TextureRegistry.SurfaceProducer.Callback {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private boolean needsSurface;

    public TextureVideoPlayer(VideoPlayerCallbacks videoPlayerCallbacks, TextureRegistry.SurfaceProducer surfaceProducer, C0107z c0107z, VideoPlayerOptions videoPlayerOptions, VideoPlayer.ExoPlayerProvider exoPlayerProvider) {
        super(videoPlayerCallbacks, c0107z, videoPlayerOptions, surfaceProducer, exoPlayerProvider);
        this.needsSurface = true;
        surfaceProducer.setCallback(this);
        Surface surface = surfaceProducer.getSurface();
        ((C0130F) this.exoPlayer).F(surface);
        this.needsSurface = surface == null;
    }

    public static TextureVideoPlayer create(Context context, VideoPlayerCallbacks videoPlayerCallbacks, TextureRegistry.SurfaceProducer surfaceProducer, VideoAsset videoAsset, VideoPlayerOptions videoPlayerOptions) {
        return new TextureVideoPlayer(videoPlayerCallbacks, surfaceProducer, videoAsset.getMediaItem(), videoPlayerOptions, new a(context, videoAsset, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC0151q lambda$create$0(Context context, VideoAsset videoAsset) {
        r rVar = new r(context);
        C0149o c0149o = new C0149o(context);
        AbstractC0124a.t(!c0149o.v);
        c0149o.f4208e = new C0147m(0, rVar);
        InterfaceC1352A mediaSourceFactory = videoAsset.getMediaSourceFactory(context);
        AbstractC0124a.t(!c0149o.v);
        mediaSourceFactory.getClass();
        c0149o.f4207d = new C0147m(1, mediaSourceFactory);
        AbstractC0124a.t(!c0149o.v);
        c0149o.v = true;
        return new C0130F(c0149o);
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayer
    public ExoPlayerEventListener createExoPlayerEventListener(InterfaceC0151q interfaceC0151q, TextureRegistry.SurfaceProducer surfaceProducer) {
        if (surfaceProducer == null) {
            throw new IllegalArgumentException("surfaceProducer cannot be null to create an ExoPlayerEventListener for TextureVideoPlayer.");
        }
        return new TextureExoPlayerEventListener(interfaceC0151q, this.videoPlayerEvents, surfaceProducer.handlesCropAndRotation());
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayer
    public void dispose() {
        super.dispose();
        this.surfaceProducer.release();
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer.Callback
    public void onSurfaceAvailable() {
        if (this.needsSurface) {
            ((C0130F) this.exoPlayer).F(this.surfaceProducer.getSurface());
            this.needsSurface = false;
        }
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer.Callback
    public void onSurfaceCleanup() {
        ((C0130F) this.exoPlayer).F(null);
        this.needsSurface = true;
    }
}
