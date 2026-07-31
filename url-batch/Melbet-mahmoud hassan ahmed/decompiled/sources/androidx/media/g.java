package androidx.media;

import android.media.session.MediaSessionManager;

/* loaded from: classes.dex */
final class g extends h {

    /* renamed from: d, reason: collision with root package name */
    final MediaSessionManager.RemoteUserInfo f1088d;

    g(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
        this.f1088d = remoteUserInfo;
    }

    g(String str, int i7, int i8) {
        super(str, i7, i8);
        this.f1088d = new MediaSessionManager.RemoteUserInfo(str, i7, i8);
    }

    static String a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        return remoteUserInfo.getPackageName();
    }
}
