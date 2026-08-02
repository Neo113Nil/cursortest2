package io.flutter.plugins.videoplayer.platformview;

import android.content.Context;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;
import io.flutter.plugins.videoplayer.AndroidVideoPlayerApi;
import io.flutter.plugins.videoplayer.PlatformVideoViewCreationParams;
import io.flutter.plugins.videoplayer.VideoPlayer;
import java.util.Objects;

/* loaded from: classes.dex */
public class PlatformVideoViewFactory extends PlatformViewFactory {
    private final VideoPlayerProvider videoPlayerProvider;

    @FunctionalInterface
    public interface VideoPlayerProvider {
        VideoPlayer getVideoPlayer(Long l4);
    }

    public PlatformVideoViewFactory(VideoPlayerProvider videoPlayerProvider) {
        super(AndroidVideoPlayerApi.Companion.getCodec());
        this.videoPlayerProvider = videoPlayerProvider;
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    public PlatformView create(Context context, int i4, Object obj) {
        PlatformVideoViewCreationParams platformVideoViewCreationParams = (PlatformVideoViewCreationParams) obj;
        Objects.requireNonNull(platformVideoViewCreationParams);
        return new PlatformVideoView(context, this.videoPlayerProvider.getVideoPlayer(Long.valueOf(platformVideoViewCreationParams.getPlayerId())).getExoPlayer());
    }
}
