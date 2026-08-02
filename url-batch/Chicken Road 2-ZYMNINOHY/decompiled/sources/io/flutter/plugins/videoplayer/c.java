package io.flutter.plugins.videoplayer;

import android.util.LongSparseArray;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.plugins.videoplayer.VideoPlayerPlugin;
import io.flutter.plugins.videoplayer.platformview.PlatformVideoViewFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements VideoPlayerPlugin.KeyForAssetFn, VideoPlayerPlugin.KeyForAssetAndPackageName, PlatformVideoViewFactory.VideoPlayerProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f13593a;

    public /* synthetic */ c(Object obj) {
        this.f13593a = obj;
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerPlugin.KeyForAssetFn
    public String get(String str) {
        return ((FlutterLoader) this.f13593a).getLookupKeyForAsset(str);
    }

    @Override // io.flutter.plugins.videoplayer.platformview.PlatformVideoViewFactory.VideoPlayerProvider
    public VideoPlayer getVideoPlayer(Long l4) {
        return (VideoPlayer) ((LongSparseArray) this.f13593a).get(l4.longValue());
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerPlugin.KeyForAssetAndPackageName
    public String get(String str, String str2) {
        return ((FlutterLoader) this.f13593a).getLookupKeyForAsset(str, str2);
    }
}
