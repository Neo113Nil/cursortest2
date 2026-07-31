package androidx.media2.session;

import android.content.ComponentName;

/* loaded from: classes.dex */
public final class SessionTokenImplLegacyParcelizer {
    public static SessionTokenImplLegacy read(androidx.versionedparcelable.a aVar) {
        SessionTokenImplLegacy sessionTokenImplLegacy = new SessionTokenImplLegacy();
        sessionTokenImplLegacy.f1216b = aVar.k(sessionTokenImplLegacy.f1216b, 1);
        sessionTokenImplLegacy.f1217c = aVar.v(sessionTokenImplLegacy.f1217c, 2);
        sessionTokenImplLegacy.f1218d = aVar.v(sessionTokenImplLegacy.f1218d, 3);
        sessionTokenImplLegacy.f1219e = (ComponentName) aVar.A(sessionTokenImplLegacy.f1219e, 4);
        sessionTokenImplLegacy.f1220f = aVar.E(sessionTokenImplLegacy.f1220f, 5);
        sessionTokenImplLegacy.f1221g = aVar.k(sessionTokenImplLegacy.f1221g, 6);
        sessionTokenImplLegacy.c();
        return sessionTokenImplLegacy;
    }

    public static void write(SessionTokenImplLegacy sessionTokenImplLegacy, androidx.versionedparcelable.a aVar) {
        aVar.K(false, false);
        sessionTokenImplLegacy.d(aVar.g());
        aVar.O(sessionTokenImplLegacy.f1216b, 1);
        aVar.Y(sessionTokenImplLegacy.f1217c, 2);
        aVar.Y(sessionTokenImplLegacy.f1218d, 3);
        aVar.d0(sessionTokenImplLegacy.f1219e, 4);
        aVar.h0(sessionTokenImplLegacy.f1220f, 5);
        aVar.O(sessionTokenImplLegacy.f1221g, 6);
    }
}
