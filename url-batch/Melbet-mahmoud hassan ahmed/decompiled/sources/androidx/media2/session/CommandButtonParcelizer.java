package androidx.media2.session;

/* loaded from: classes.dex */
public final class CommandButtonParcelizer {
    public static MediaSession$CommandButton read(androidx.versionedparcelable.a aVar) {
        MediaSession$CommandButton mediaSession$CommandButton = new MediaSession$CommandButton();
        mediaSession$CommandButton.f1187a = (SessionCommand) aVar.I(mediaSession$CommandButton.f1187a, 1);
        mediaSession$CommandButton.f1188b = aVar.v(mediaSession$CommandButton.f1188b, 2);
        mediaSession$CommandButton.f1189c = aVar.o(mediaSession$CommandButton.f1189c, 3);
        mediaSession$CommandButton.f1190d = aVar.k(mediaSession$CommandButton.f1190d, 4);
        mediaSession$CommandButton.f1191e = aVar.i(mediaSession$CommandButton.f1191e, 5);
        return mediaSession$CommandButton;
    }

    public static void write(MediaSession$CommandButton mediaSession$CommandButton, androidx.versionedparcelable.a aVar) {
        aVar.K(false, false);
        aVar.m0(mediaSession$CommandButton.f1187a, 1);
        aVar.Y(mediaSession$CommandButton.f1188b, 2);
        aVar.S(mediaSession$CommandButton.f1189c, 3);
        aVar.O(mediaSession$CommandButton.f1190d, 4);
        aVar.M(mediaSession$CommandButton.f1191e, 5);
    }
}
