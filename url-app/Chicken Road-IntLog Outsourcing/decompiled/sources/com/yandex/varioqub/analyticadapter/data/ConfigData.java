package com.yandex.varioqub.analyticadapter.data;

/* loaded from: classes.dex */
public final class ConfigData {

    /* renamed from: a, reason: collision with root package name */
    private final String f5354a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5355b;

    /* renamed from: c, reason: collision with root package name */
    private final long f5356c;

    public ConfigData(String str, String str2, long j2) {
        this.f5354a = str;
        this.f5355b = str2;
        this.f5356c = j2;
    }

    public final long getConfigLoadTimestamp() {
        return this.f5356c;
    }

    public final String getNewConfigVersion() {
        return this.f5355b;
    }

    public final String getOldConfigVersion() {
        return this.f5354a;
    }
}
