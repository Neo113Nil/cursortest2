package io.flutter.plugins.videoplayer.platformview;

import a0.InterfaceC0151q;
import android.content.Context;
import io.flutter.plugins.videoplayer.VideoAsset;
import io.flutter.plugins.videoplayer.VideoPlayer;
import io.flutter.plugins.videoplayer.texture.TextureVideoPlayer;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements VideoPlayer.ExoPlayerProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f13595b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VideoAsset f13596c;

    public /* synthetic */ a(Context context, VideoAsset videoAsset, int i4) {
        this.f13594a = i4;
        this.f13595b = context;
        this.f13596c = videoAsset;
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayer.ExoPlayerProvider
    public final InterfaceC0151q get() {
        InterfaceC0151q lambda$create$0;
        InterfaceC0151q lambda$create$02;
        switch (this.f13594a) {
            case 0:
                lambda$create$0 = PlatformViewVideoPlayer.lambda$create$0(this.f13595b, this.f13596c);
                return lambda$create$0;
            default:
                lambda$create$02 = TextureVideoPlayer.lambda$create$0(this.f13595b, this.f13596c);
                return lambda$create$02;
        }
    }
}
