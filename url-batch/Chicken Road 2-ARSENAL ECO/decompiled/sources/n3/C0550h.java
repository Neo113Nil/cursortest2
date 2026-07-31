package n3;

/* renamed from: n3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0550h {
    private final String appVersion;
    private final String carrier;
    private final String deviceModel;
    private final String deviceOS;
    private final Boolean enabled;
    private final String id;
    private final Integer netType;
    private final Integer notificationTypes;
    private final Boolean rooted;
    private final String sdk;
    private final String token;
    private final EnumC0552j type;

    public C0550h() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
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
        return this.id;
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

    public final EnumC0552j getType() {
        return this.type;
    }

    public C0550h(String str, EnumC0552j enumC0552j, String str2, Boolean bool, Integer num, String str3, String str4, String str5, Boolean bool2, Integer num2, String str6, String str7) {
        this.id = str;
        this.type = enumC0552j;
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

    public /* synthetic */ C0550h(String str, EnumC0552j enumC0552j, String str2, Boolean bool, Integer num, String str3, String str4, String str5, Boolean bool2, Integer num2, String str6, String str7, int i7, kotlin.jvm.internal.e eVar) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : enumC0552j, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? null : bool, (i7 & 16) != 0 ? null : num, (i7 & 32) != 0 ? null : str3, (i7 & 64) != 0 ? null : str4, (i7 & 128) != 0 ? null : str5, (i7 & 256) != 0 ? null : bool2, (i7 & 512) != 0 ? null : num2, (i7 & 1024) != 0 ? null : str6, (i7 & 2048) != 0 ? null : str7);
    }
}
