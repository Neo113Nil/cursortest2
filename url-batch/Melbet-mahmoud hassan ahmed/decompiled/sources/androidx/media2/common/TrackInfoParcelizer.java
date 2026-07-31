package androidx.media2.common;

import androidx.versionedparcelable.a;

/* loaded from: classes.dex */
public final class TrackInfoParcelizer {
    public static SessionPlayer$TrackInfo read(a aVar) {
        SessionPlayer$TrackInfo sessionPlayer$TrackInfo = new SessionPlayer$TrackInfo();
        sessionPlayer$TrackInfo.f1128a = aVar.v(sessionPlayer$TrackInfo.f1128a, 1);
        sessionPlayer$TrackInfo.f1129b = aVar.v(sessionPlayer$TrackInfo.f1129b, 3);
        sessionPlayer$TrackInfo.f1132e = aVar.k(sessionPlayer$TrackInfo.f1132e, 4);
        sessionPlayer$TrackInfo.c();
        return sessionPlayer$TrackInfo;
    }

    public static void write(SessionPlayer$TrackInfo sessionPlayer$TrackInfo, a aVar) {
        aVar.K(false, false);
        sessionPlayer$TrackInfo.d(aVar.g());
        aVar.Y(sessionPlayer$TrackInfo.f1128a, 1);
        aVar.Y(sessionPlayer$TrackInfo.f1129b, 3);
        aVar.O(sessionPlayer$TrackInfo.f1132e, 4);
    }
}
