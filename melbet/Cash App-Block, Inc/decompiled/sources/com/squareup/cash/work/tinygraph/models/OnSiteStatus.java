package com.squareup.cash.work.tinygraph.models;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class OnSiteStatus {
    public static final /* synthetic */ OnSiteStatus[] $VALUES = {new OnSiteStatus("ON_SITE", 0), new OnSiteStatus("OFF_SITE", 1), new OnSiteStatus("UNKNOWN", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    OnSiteStatus EF5;

    public static OnSiteStatus valueOf(String str) {
        return (OnSiteStatus) Enum.valueOf(OnSiteStatus.class, str);
    }

    public static OnSiteStatus[] values() {
        return (OnSiteStatus[]) $VALUES.clone();
    }
}
