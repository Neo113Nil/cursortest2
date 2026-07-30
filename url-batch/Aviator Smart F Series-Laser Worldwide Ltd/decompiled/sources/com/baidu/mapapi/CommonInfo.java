package com.baidu.mapapi;

/* loaded from: classes2.dex */
public class CommonInfo {

    /* renamed from: a, reason: collision with root package name */
    private String f5300a;

    /* renamed from: b, reason: collision with root package name */
    private String f5301b;

    /* renamed from: c, reason: collision with root package name */
    private String f5302c;

    /* renamed from: d, reason: collision with root package name */
    private String f5303d;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f5304a = "";

        /* renamed from: b, reason: collision with root package name */
        private String f5305b = "";

        /* renamed from: c, reason: collision with root package name */
        private String f5306c = "";

        /* renamed from: d, reason: collision with root package name */
        private String f5307d = "";

        public Builder androidId(String str) {
            this.f5305b = str;
            return this;
        }

        public CommonInfo build() {
            return new CommonInfo(this.f5305b, this.f5304a, this.f5306c, this.f5307d);
        }

        public Builder channel(String str) {
            this.f5306c = str;
            return this;
        }

        public Builder oaid(String str) {
            this.f5304a = str;
            return this;
        }

        public Builder shareDeviceId(String str) {
            this.f5307d = str;
            return this;
        }
    }

    public String getAndroidID() {
        return this.f5301b;
    }

    public String getChannel() {
        return this.f5302c;
    }

    public String getOAID() {
        return this.f5300a;
    }

    public String getShareDeviceId() {
        return this.f5303d;
    }

    public void updateShareDeviceId(String str) {
        this.f5303d = str;
    }

    private CommonInfo(String str, String str2, String str3, String str4) {
        this.f5301b = str;
        this.f5300a = str2;
        this.f5302c = str3;
        this.f5303d = str4;
    }
}
