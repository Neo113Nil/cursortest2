package androidx.media2.session;

/* loaded from: classes.dex */
public final class SessionCommandGroupParcelizer {
    public static SessionCommandGroup read(androidx.versionedparcelable.a aVar) {
        SessionCommandGroup sessionCommandGroup = new SessionCommandGroup();
        sessionCommandGroup.f1201a = aVar.C(sessionCommandGroup.f1201a, 1);
        return sessionCommandGroup;
    }

    public static void write(SessionCommandGroup sessionCommandGroup, androidx.versionedparcelable.a aVar) {
        aVar.K(false, false);
        aVar.f0(sessionCommandGroup.f1201a, 1);
    }
}
