package com.google.firebase.heartbeatinfo;

import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class HeartBeatResult {
    public static HeartBeatResult create(String str, List<String> list) {
        return new AutoValue_HeartBeatResult(str, list);
    }

    public abstract List<String> getUsedDates();

    public abstract String getUserAgent();
}
