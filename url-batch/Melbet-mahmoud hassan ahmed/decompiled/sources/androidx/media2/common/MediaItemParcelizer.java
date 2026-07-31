package androidx.media2.common;

import androidx.versionedparcelable.a;

/* loaded from: classes.dex */
public final class MediaItemParcelizer {
    public static MediaItem read(a aVar) {
        MediaItem mediaItem = new MediaItem();
        mediaItem.f1111b = (MediaMetadata) aVar.I(mediaItem.f1111b, 1);
        mediaItem.f1112c = aVar.y(mediaItem.f1112c, 2);
        mediaItem.f1113d = aVar.y(mediaItem.f1113d, 3);
        mediaItem.c();
        return mediaItem;
    }

    public static void write(MediaItem mediaItem, a aVar) {
        aVar.K(false, false);
        mediaItem.d(aVar.g());
        aVar.m0(mediaItem.f1111b, 1);
        aVar.b0(mediaItem.f1112c, 2);
        aVar.b0(mediaItem.f1113d, 3);
    }
}
