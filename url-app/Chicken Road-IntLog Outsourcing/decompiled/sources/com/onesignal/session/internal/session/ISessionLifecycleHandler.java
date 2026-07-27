package com.onesignal.session.internal.session;

/* loaded from: classes.dex */
public interface ISessionLifecycleHandler {
    void onSessionActive();

    void onSessionEnded(long j2);

    void onSessionStarted();
}
