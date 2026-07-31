package com.linecorp.linesdk.internal;

import android.text.TextUtils;
import java.util.List;

/* loaded from: classes2.dex */
public class JWKSet {
    private final List<JWK> keys;

    public static final class Builder {
        private List<JWK> keys;

        public JWKSet build() {
            return new JWKSet(this);
        }

        public Builder keys(List<JWK> list) {
            this.keys = list;
            return this;
        }
    }

    public static class JWK {
        private final String algorithm;
        private final String curve;
        private final String keyId;
        private final String keyType;
        private final String use;

        /* renamed from: x, reason: collision with root package name */
        private final String f20649x;

        /* renamed from: y, reason: collision with root package name */
        private final String f20650y;

        public static final class Builder {
            private String algorithm;
            private String curve;
            private String keyId;
            private String keyType;
            private String use;

            /* renamed from: x, reason: collision with root package name */
            private String f20651x;

            /* renamed from: y, reason: collision with root package name */
            private String f20652y;

            public Builder algorithm(String str) {
                this.algorithm = str;
                return this;
            }

            public JWK build() {
                return new JWK(this);
            }

            public Builder curve(String str) {
                this.curve = str;
                return this;
            }

            public Builder keyId(String str) {
                this.keyId = str;
                return this;
            }

            public Builder keyType(String str) {
                this.keyType = str;
                return this;
            }

            public Builder use(String str) {
                this.use = str;
                return this;
            }

            public Builder x(String str) {
                this.f20651x = str;
                return this;
            }

            public Builder y(String str) {
                this.f20652y = str;
                return this;
            }
        }

        public String getAlgorithm() {
            return this.algorithm;
        }

        public String getCurve() {
            return this.curve;
        }

        public String getKeyId() {
            return this.keyId;
        }

        public String getKeyType() {
            return this.keyType;
        }

        public String getUse() {
            return this.use;
        }

        public String getX() {
            return this.f20649x;
        }

        public String getY() {
            return this.f20650y;
        }

        public String toString() {
            return "JWK{keyType='" + this.keyType + "', algorithm='" + this.algorithm + "', use='" + this.use + "', keyId='" + this.keyId + "', curve='" + this.curve + "', x='" + this.f20649x + "', y='" + this.f20650y + "'}";
        }

        private JWK(Builder builder) {
            this.keyType = builder.keyType;
            this.algorithm = builder.algorithm;
            this.use = builder.use;
            this.keyId = builder.keyId;
            this.curve = builder.curve;
            this.f20649x = builder.f20651x;
            this.f20650y = builder.f20652y;
        }
    }

    public JWK getJWK(String str) {
        for (JWK jwk : this.keys) {
            if (TextUtils.equals(jwk.getKeyId(), str)) {
                return jwk;
            }
        }
        return null;
    }

    public List<JWK> getKeys() {
        return this.keys;
    }

    public String toString() {
        return "JWKSet{keys=" + this.keys + '}';
    }

    private JWKSet(Builder builder) {
        this.keys = builder.keys;
    }
}
