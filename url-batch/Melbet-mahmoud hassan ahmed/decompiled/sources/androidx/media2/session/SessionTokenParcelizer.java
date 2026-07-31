package androidx.media2.session;

import androidx.media2.session.SessionToken;

/* loaded from: classes.dex */
public final class SessionTokenParcelizer {
    public static SessionToken read(androidx.versionedparcelable.a aVar) {
        SessionToken sessionToken = new SessionToken();
        sessionToken.f1207a = (SessionToken.SessionTokenImpl) aVar.I(sessionToken.f1207a, 1);
        return sessionToken;
    }

    public static void write(SessionToken sessionToken, androidx.versionedparcelable.a aVar) {
        aVar.K(false, false);
        aVar.m0(sessionToken.f1207a, 1);
    }
}
