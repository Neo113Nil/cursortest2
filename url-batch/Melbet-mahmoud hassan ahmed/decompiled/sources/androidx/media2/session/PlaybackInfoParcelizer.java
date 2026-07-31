package androidx.media2.session;

import androidx.media.AudioAttributesCompat;

/* loaded from: classes.dex */
public final class PlaybackInfoParcelizer {
    public static MediaController$PlaybackInfo read(androidx.versionedparcelable.a aVar) {
        MediaController$PlaybackInfo mediaController$PlaybackInfo = new MediaController$PlaybackInfo();
        mediaController$PlaybackInfo.f1178a = aVar.v(mediaController$PlaybackInfo.f1178a, 1);
        mediaController$PlaybackInfo.f1179b = aVar.v(mediaController$PlaybackInfo.f1179b, 2);
        mediaController$PlaybackInfo.f1180c = aVar.v(mediaController$PlaybackInfo.f1180c, 3);
        mediaController$PlaybackInfo.f1181d = aVar.v(mediaController$PlaybackInfo.f1181d, 4);
        mediaController$PlaybackInfo.f1182e = (AudioAttributesCompat) aVar.I(mediaController$PlaybackInfo.f1182e, 5);
        return mediaController$PlaybackInfo;
    }

    public static void write(MediaController$PlaybackInfo mediaController$PlaybackInfo, androidx.versionedparcelable.a aVar) {
        aVar.K(false, false);
        aVar.Y(mediaController$PlaybackInfo.f1178a, 1);
        aVar.Y(mediaController$PlaybackInfo.f1179b, 2);
        aVar.Y(mediaController$PlaybackInfo.f1180c, 3);
        aVar.Y(mediaController$PlaybackInfo.f1181d, 4);
        aVar.m0(mediaController$PlaybackInfo.f1182e, 5);
    }
}
