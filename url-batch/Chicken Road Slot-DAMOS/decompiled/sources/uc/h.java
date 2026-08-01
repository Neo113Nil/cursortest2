package uc;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h {
    private final String appVersion;
    private final String carrier;
    private final String deviceModel;
    private final String deviceOS;
    private final Boolean enabled;

    /* renamed from: id, reason: collision with root package name */
    private final String f9715id;
    private final Integer netType;
    private final Integer notificationTypes;
    private final Boolean rooted;
    private final String sdk;
    private final String token;
    private final j type;

    public /* synthetic */ h(String str, j jVar, String str2, Boolean bool, Integer num, String str3, String str4, String str5, Boolean bool2, Integer num2, String str6, String str7, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : jVar, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? null : bool, (i3 & 16) != 0 ? null : num, (i3 & 32) != 0 ? null : str3, (i3 & 64) != 0 ? null : str4, (i3 & 128) != 0 ? null : str5, (i3 & 256) != 0 ? null : bool2, (i3 & 512) != 0 ? null : num2, (i3 & 1024) != 0 ? null : str6, (i3 & 2048) != 0 ? null : str7);
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getCarrier() {
        return this.carrier;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final String getDeviceOS() {
        return this.deviceOS;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final String getId() {
        return this.f9715id;
    }

    public final Integer getNetType() {
        return this.netType;
    }

    public final Integer getNotificationTypes() {
        return this.notificationTypes;
    }

    public final Boolean getRooted() {
        return this.rooted;
    }

    public final String getSdk() {
        return this.sdk;
    }

    public final String getToken() {
        return this.token;
    }

    public final j getType() {
        return this.type;
    }

    public h(String str, j jVar, String str2, Boolean bool, Integer num, String str3, String str4, String str5, Boolean bool2, Integer num2, String str6, String str7) {
        this.f9715id = str;
        this.type = jVar;
        this.token = str2;
        this.enabled = bool;
        this.notificationTypes = num;
        this.sdk = str3;
        this.deviceModel = str4;
        this.deviceOS = str5;
        this.rooted = bool2;
        this.netType = num2;
        this.carrier = str6;
        this.appVersion = str7;
    }

    public h() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }
}
