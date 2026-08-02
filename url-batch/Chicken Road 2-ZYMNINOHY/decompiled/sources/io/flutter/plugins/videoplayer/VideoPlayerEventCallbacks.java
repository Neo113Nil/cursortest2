package io.flutter.plugins.videoplayer;

import io.flutter.plugin.common.BinaryMessenger;

/* loaded from: classes.dex */
final class VideoPlayerEventCallbacks implements VideoPlayerCallbacks {
    private final QueuingEventSink eventSink;

    private VideoPlayerEventCallbacks(QueuingEventSink queuingEventSink) {
        this.eventSink = queuingEventSink;
    }

    public static VideoPlayerEventCallbacks bindTo(BinaryMessenger binaryMessenger, String str) {
        final QueuingEventSink queuingEventSink = new QueuingEventSink();
        VideoEventsStreamHandler.Companion.register(binaryMessenger, new VideoEventsStreamHandler() { // from class: io.flutter.plugins.videoplayer.VideoPlayerEventCallbacks.1
            @Override // io.flutter.plugins.videoplayer.VideoEventsStreamHandler, io.flutter.plugins.videoplayer.MessagesPigeonEventChannelWrapper
            public void onCancel(Object obj) {
                QueuingEventSink.this.setDelegate(null);
            }

            @Override // io.flutter.plugins.videoplayer.VideoEventsStreamHandler, io.flutter.plugins.videoplayer.MessagesPigeonEventChannelWrapper
            public void onListen(Object obj, PigeonEventSink<PlatformVideoEvent> pigeonEventSink) {
                QueuingEventSink.this.setDelegate(pigeonEventSink);
            }
        }, str);
        return withSink(queuingEventSink);
    }

    public static VideoPlayerEventCallbacks withSink(QueuingEventSink queuingEventSink) {
        return new VideoPlayerEventCallbacks(queuingEventSink);
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerCallbacks
    public void onAudioTrackChanged(String str) {
        this.eventSink.success(new AudioTrackChangedEvent(str));
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerCallbacks
    public void onError(String str, String str2, Object obj) {
        this.eventSink.error(str, str2, obj);
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerCallbacks
    public void onInitialized(int i4, int i5, long j4, int i6) {
        this.eventSink.success(new InitializationEvent(j4, i4, i5, i6));
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerCallbacks
    public void onIsPlayingStateUpdate(boolean z) {
        this.eventSink.success(new IsPlayingStateEvent(z));
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerCallbacks
    public void onPlaybackStateChanged(PlatformPlaybackState platformPlaybackState) {
        this.eventSink.success(new PlaybackStateChangeEvent(platformPlaybackState));
    }
}
