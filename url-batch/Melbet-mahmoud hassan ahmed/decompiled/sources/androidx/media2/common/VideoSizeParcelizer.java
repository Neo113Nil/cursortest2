package androidx.media2.common;

import androidx.versionedparcelable.a;

/* loaded from: classes.dex */
public final class VideoSizeParcelizer {
    public static VideoSize read(a aVar) {
        VideoSize videoSize = new VideoSize();
        videoSize.f1137a = aVar.v(videoSize.f1137a, 1);
        videoSize.f1138b = aVar.v(videoSize.f1138b, 2);
        return videoSize;
    }

    public static void write(VideoSize videoSize, a aVar) {
        aVar.K(false, false);
        aVar.Y(videoSize.f1137a, 1);
        aVar.Y(videoSize.f1138b, 2);
    }
}
