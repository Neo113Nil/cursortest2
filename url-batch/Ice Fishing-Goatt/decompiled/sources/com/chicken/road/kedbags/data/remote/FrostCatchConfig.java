package com.chicken.road.kedbags.data.remote;

import kotlin.Metadata;

/* compiled from: FrostCatchConfig.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/chicken/road/kedbags/data/remote/FrostCatchConfig;", "", "<init>", "()V", "BASE_URL", "", "ENDPOINT_PATH", "ENDPOINT_URL", "getENDPOINT_URL", "()Ljava/lang/String;", "KEY_AD_ID", "KEY_INSTALL_REFERRER", "KEY_ANDROID_ID", "CONNECT_TIMEOUT_MS", "", "READ_TIMEOUT_MS", "PING_INTERVAL_MS", "RESPONSE_TIMEOUT_MS", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FrostCatchConfig {
    public static final int $stable = 0;
    public static final String BASE_URL = "https://acedfishappi.space";
    public static final long CONNECT_TIMEOUT_MS = 64000;
    public static final String ENDPOINT_PATH = "/api/frostCatch";
    public static final String KEY_AD_ID = "hookRune";
    public static final String KEY_ANDROID_ID = "perchWhisper";
    public static final String KEY_INSTALL_REFERRER = "iceLantern";
    public static final long PING_INTERVAL_MS = 20000;
    public static final long READ_TIMEOUT_MS = 64000;
    public static final long RESPONSE_TIMEOUT_MS = 64000;
    public static final FrostCatchConfig INSTANCE = new FrostCatchConfig();
    private static final String ENDPOINT_URL = "https://acedfishappi.space/api/frostCatch";

    private FrostCatchConfig() {
    }

    public final String getENDPOINT_URL() {
        return ENDPOINT_URL;
    }
}
