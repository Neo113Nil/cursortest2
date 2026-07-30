package com.android.installreferrer.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface InstallReferrerClientImpl$ClientState {
    public static final int CLOSED = 3;
    public static final int CONNECTED = 2;
    public static final int CONNECTING = 1;
    public static final int DISCONNECTED = 0;
}
