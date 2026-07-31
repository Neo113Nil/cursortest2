package androidx.media2.session;

/* loaded from: classes.dex */
public final class SessionCommandParcelizer {
    public static SessionCommand read(androidx.versionedparcelable.a aVar) {
        SessionCommand sessionCommand = new SessionCommand();
        sessionCommand.f1198a = aVar.v(sessionCommand.f1198a, 1);
        sessionCommand.f1199b = aVar.E(sessionCommand.f1199b, 2);
        sessionCommand.f1200c = aVar.k(sessionCommand.f1200c, 3);
        return sessionCommand;
    }

    public static void write(SessionCommand sessionCommand, androidx.versionedparcelable.a aVar) {
        aVar.K(false, false);
        aVar.Y(sessionCommand.f1198a, 1);
        aVar.h0(sessionCommand.f1199b, 2);
        aVar.O(sessionCommand.f1200c, 3);
    }
}
