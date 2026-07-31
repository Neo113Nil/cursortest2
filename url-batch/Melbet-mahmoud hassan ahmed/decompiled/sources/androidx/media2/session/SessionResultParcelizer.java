package androidx.media2.session;

import androidx.media2.common.MediaItem;

/* loaded from: classes.dex */
public final class SessionResultParcelizer {
    public static SessionResult read(androidx.versionedparcelable.a aVar) {
        SessionResult sessionResult = new SessionResult();
        sessionResult.f1202a = aVar.v(sessionResult.f1202a, 1);
        sessionResult.f1203b = aVar.y(sessionResult.f1203b, 2);
        sessionResult.f1204c = aVar.k(sessionResult.f1204c, 3);
        sessionResult.f1206e = (MediaItem) aVar.I(sessionResult.f1206e, 4);
        sessionResult.c();
        return sessionResult;
    }

    public static void write(SessionResult sessionResult, androidx.versionedparcelable.a aVar) {
        aVar.K(false, false);
        sessionResult.d(aVar.g());
        aVar.Y(sessionResult.f1202a, 1);
        aVar.b0(sessionResult.f1203b, 2);
        aVar.O(sessionResult.f1204c, 3);
        aVar.m0(sessionResult.f1206e, 4);
    }
}
