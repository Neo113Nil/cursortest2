package androidx.media2.common;

import androidx.versionedparcelable.a;

/* loaded from: classes.dex */
public final class MediaMetadataParcelizer {
    public static MediaMetadata read(a aVar) {
        MediaMetadata mediaMetadata = new MediaMetadata();
        mediaMetadata.f1120b = aVar.k(mediaMetadata.f1120b, 1);
        mediaMetadata.f1121c = (ParcelImplListSlice) aVar.A(mediaMetadata.f1121c, 2);
        mediaMetadata.c();
        return mediaMetadata;
    }

    public static void write(MediaMetadata mediaMetadata, a aVar) {
        aVar.K(false, false);
        mediaMetadata.d(aVar.g());
        aVar.O(mediaMetadata.f1120b, 1);
        aVar.d0(mediaMetadata.f1121c, 2);
    }
}
