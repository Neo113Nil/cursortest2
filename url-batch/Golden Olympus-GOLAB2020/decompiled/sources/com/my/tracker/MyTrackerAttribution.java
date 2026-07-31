package com.my.tracker;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public final class MyTrackerAttribution {

    @NonNull
    private final String deeplink;

    private MyTrackerAttribution(@NonNull String str) {
        this.deeplink = str;
    }

    @NonNull
    public static MyTrackerAttribution newAttribution(@NonNull String str) {
        return new MyTrackerAttribution(str);
    }

    @NonNull
    public String getDeeplink() {
        return this.deeplink;
    }
}
