package io.flutter.plugins.videoplayer;

/* loaded from: classes.dex */
public interface VideoPlayerCallbacks {
    void onAudioTrackChanged(String str);

    void onError(String str, String str2, Object obj);

    void onInitialized(int i4, int i5, long j4, int i6);

    void onIsPlayingStateUpdate(boolean z);

    void onPlaybackStateChanged(PlatformPlaybackState platformPlaybackState);
}
