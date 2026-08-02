package io.flutter.plugins.videoplayer.platformview;

import T.C0107z;
import a.AbstractC0124a;
import a0.C0130F;
import a0.C0147m;
import a0.C0149o;
import a0.InterfaceC0151q;
import android.content.Context;
import io.flutter.plugins.videoplayer.ExoPlayerEventListener;
import io.flutter.plugins.videoplayer.VideoAsset;
import io.flutter.plugins.videoplayer.VideoPlayer;
import io.flutter.plugins.videoplayer.VideoPlayerCallbacks;
import io.flutter.plugins.videoplayer.VideoPlayerOptions;
import io.flutter.view.TextureRegistry;
import q0.InterfaceC1352A;
import t0.r;

/* loaded from: classes.dex */
public class PlatformViewVideoPlayer extends VideoPlayer {
    public PlatformViewVideoPlayer(VideoPlayerCallbacks videoPlayerCallbacks, C0107z c0107z, VideoPlayerOptions videoPlayerOptions, VideoPlayer.ExoPlayerProvider exoPlayerProvider) {
        super(videoPlayerCallbacks, c0107z, videoPlayerOptions, null, exoPlayerProvider);
    }

    public static PlatformViewVideoPlayer create(Context context, VideoPlayerCallbacks videoPlayerCallbacks, VideoAsset videoAsset, VideoPlayerOptions videoPlayerOptions) {
        return new PlatformViewVideoPlayer(videoPlayerCallbacks, videoAsset.getMediaItem(), videoPlayerOptions, new a(context, videoAsset, 0));
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
        return new PlatformViewExoPlayerEventListener(interfaceC0151q, this.videoPlayerEvents);
    }
}
