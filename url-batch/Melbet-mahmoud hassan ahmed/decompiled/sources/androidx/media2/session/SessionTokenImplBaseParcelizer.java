package androidx.media2.session;

import android.content.ComponentName;

/* loaded from: classes.dex */
public final class SessionTokenImplBaseParcelizer {
    public static SessionTokenImplBase read(androidx.versionedparcelable.a aVar) {
        SessionTokenImplBase sessionTokenImplBase = new SessionTokenImplBase();
        sessionTokenImplBase.f1208a = aVar.v(sessionTokenImplBase.f1208a, 1);
        sessionTokenImplBase.f1209b = aVar.v(sessionTokenImplBase.f1209b, 2);
        sessionTokenImplBase.f1210c = aVar.E(sessionTokenImplBase.f1210c, 3);
        sessionTokenImplBase.f1211d = aVar.E(sessionTokenImplBase.f1211d, 4);
        sessionTokenImplBase.f1212e = aVar.G(sessionTokenImplBase.f1212e, 5);
        sessionTokenImplBase.f1213f = (ComponentName) aVar.A(sessionTokenImplBase.f1213f, 6);
        sessionTokenImplBase.f1214g = aVar.k(sessionTokenImplBase.f1214g, 7);
        return sessionTokenImplBase;
    }

    public static void write(SessionTokenImplBase sessionTokenImplBase, androidx.versionedparcelable.a aVar) {
        aVar.K(false, false);
        aVar.Y(sessionTokenImplBase.f1208a, 1);
        aVar.Y(sessionTokenImplBase.f1209b, 2);
        aVar.h0(sessionTokenImplBase.f1210c, 3);
        aVar.h0(sessionTokenImplBase.f1211d, 4);
        aVar.j0(sessionTokenImplBase.f1212e, 5);
        aVar.d0(sessionTokenImplBase.f1213f, 6);
        aVar.O(sessionTokenImplBase.f1214g, 7);
    }
}
