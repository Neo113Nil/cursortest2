package com.moyoung.lib.ai.oauth;

/* loaded from: classes4.dex */
public class a {
    private String appVersion;
    private String deviceId;
    private String deviceName;
    private String mac;
    private String softVersion;
    private String timestamp;

    /* renamed from: com.moyoung.lib.ai.oauth.a$a, reason: collision with other inner class name */
    public static class C0311a {
        private String appVersion;
        private String deviceId;
        private String deviceName;
        private String mac;
        private String softVersion;

        public a build() {
            return new a(this.softVersion, this.mac, this.deviceId, this.deviceName, this.appVersion);
        }

        public C0311a setAppVersion(String str) {
            this.appVersion = str;
            return this;
        }

        public C0311a setDeviceId(String str) {
            this.deviceId = str;
            return this;
        }

        public C0311a setDeviceName(String str) {
            this.deviceName = str;
            return this;
        }

        public C0311a setMac(String str) {
            this.mac = str;
            return this;
        }

        public C0311a setSoftVersion(String str) {
            this.softVersion = str;
            return this;
        }
    }

    private a() {
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public String getMac() {
        return this.mac;
    }

    public String getSoftVersion() {
        return this.softVersion;
    }

    public String getTimestamp() {
        return (System.currentTimeMillis() / 1000) + "";
    }

    public a(String str, String str2, String str3, String str4, String str5) {
        this.softVersion = str;
        this.mac = str2;
        this.deviceId = str3;
        this.deviceName = str4;
        this.appVersion = str5;
    }
}
