package com.baidu.mapapi.tts;

import android.content.Context;

/* loaded from: classes2.dex */
public class WNTTsInitConfig {
    public String appKey;
    public String authsn;
    public Context context;
    public String secretKey;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private Context f7514a;

        /* renamed from: b, reason: collision with root package name */
        private String f7515b;

        /* renamed from: c, reason: collision with root package name */
        private String f7516c;

        /* renamed from: d, reason: collision with root package name */
        private String f7517d;

        public Builder appKey(String str) {
            this.f7515b = str;
            return this;
        }

        public Builder authSn(String str) {
            this.f7517d = str;
            return this;
        }

        public WNTTsInitConfig build() {
            return new WNTTsInitConfig(this.f7514a, this.f7515b, this.f7516c, this.f7517d);
        }

        public Builder context(Context context) {
            this.f7514a = context;
            return this;
        }

        public Builder secretKey(String str) {
            this.f7516c = str;
            return this;
        }
    }

    private WNTTsInitConfig(Context context, String str, String str2, String str3) {
        this.context = context;
        this.appKey = str;
        this.secretKey = str2;
        this.authsn = str3;
    }
}
