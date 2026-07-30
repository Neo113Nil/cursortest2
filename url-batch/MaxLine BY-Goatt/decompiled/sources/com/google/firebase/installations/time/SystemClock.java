package com.google.firebase.installations.time;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class SystemClock implements Clock {
    private static SystemClock singleton;

    private SystemClock() {
    }

    public static SystemClock getInstance() {
        if (singleton == null) {
            singleton = new SystemClock();
        }
        return singleton;
    }

    @Override // com.google.firebase.installations.time.Clock
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
