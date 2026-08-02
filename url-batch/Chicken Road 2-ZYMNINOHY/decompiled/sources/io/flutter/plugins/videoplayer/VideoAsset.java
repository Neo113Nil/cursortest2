package io.flutter.plugins.videoplayer;

import T.C0107z;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import q0.InterfaceC1352A;

/* loaded from: classes.dex */
public abstract class VideoAsset {
    protected final String assetUrl;

    public enum StreamingFormat {
        UNKNOWN,
        SMOOTH,
        DYNAMIC_ADAPTIVE,
        HTTP_LIVE
    }

    public VideoAsset(String str) {
        this.assetUrl = str;
    }

    public static VideoAsset fromAssetUrl(String str) {
        if (str.startsWith("asset:///")) {
            return new LocalVideoAsset(str);
        }
        throw new IllegalArgumentException("assetUrl must start with 'asset:///'");
    }

    public static VideoAsset fromRemoteUrl(String str, StreamingFormat streamingFormat, Map<String, String> map, String str2) {
        return new HttpVideoAsset(str, streamingFormat, new HashMap(map), str2);
    }

    public static VideoAsset fromRtspUrl(String str) {
        if (str.startsWith("rtsp://")) {
            return new RtspVideoAsset(str);
        }
        throw new IllegalArgumentException("rtspUrl must start with 'rtsp://'");
    }

    public abstract C0107z getMediaItem();

    public abstract InterfaceC1352A getMediaSourceFactory(Context context);
}
