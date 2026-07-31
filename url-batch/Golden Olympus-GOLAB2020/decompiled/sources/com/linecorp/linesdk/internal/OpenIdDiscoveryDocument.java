package com.linecorp.linesdk.internal;

import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes2.dex */
public class OpenIdDiscoveryDocument {

    @NonNull
    private final String authorizationEndpoint;

    @NonNull
    private final List<String> idTokenSigningAlgValuesSupported;

    @NonNull
    private final String issuer;

    @NonNull
    private final String jwksUri;

    @NonNull
    private final List<String> responseTypesSupported;

    @NonNull
    private final List<String> subjectTypesSupported;

    @NonNull
    private final String tokenEndpoint;

    public static final class Builder {
        private String authorizationEndpoint;
        private List<String> idTokenSigningAlgValuesSupported;
        private String issuer;
        private String jwksUri;
        private List<String> responseTypesSupported;
        private List<String> subjectTypesSupported;
        private String tokenEndpoint;

        public Builder authorizationEndpoint(String str) {
            this.authorizationEndpoint = str;
            return this;
        }

        public OpenIdDiscoveryDocument build() {
            return new OpenIdDiscoveryDocument(this);
        }

        public Builder idTokenSigningAlgValuesSupported(List<String> list) {
            this.idTokenSigningAlgValuesSupported = list;
            return this;
        }

        public Builder issuer(String str) {
            this.issuer = str;
            return this;
        }

        public Builder jwksUri(String str) {
            this.jwksUri = str;
            return this;
        }

        public Builder responseTypesSupported(List<String> list) {
            this.responseTypesSupported = list;
            return this;
        }

        public Builder subjectTypesSupported(List<String> list) {
            this.subjectTypesSupported = list;
            return this;
        }

        public Builder tokenEndpoint(String str) {
            this.tokenEndpoint = str;
            return this;
        }
    }

    @NonNull
    public String getAuthorizationEndpoint() {
        return this.authorizationEndpoint;
    }

    @NonNull
    public List<String> getIdTokenSigningAlgValuesSupported() {
        return this.idTokenSigningAlgValuesSupported;
    }

    @NonNull
    public String getIssuer() {
        return this.issuer;
    }

    @NonNull
    public String getJwksUri() {
        return this.jwksUri;
    }

    @NonNull
    public List<String> getResponseTypesSupported() {
        return this.responseTypesSupported;
    }

    @NonNull
    public List<String> getSubjectTypesSupported() {
        return this.subjectTypesSupported;
    }

    @NonNull
    public String getTokenEndpoint() {
        return this.tokenEndpoint;
    }

    public String toString() {
        return "OpenIdDiscoveryDocument{issuer='" + this.issuer + "', authorizationEndpoint='" + this.authorizationEndpoint + "', tokenEndpoint='" + this.tokenEndpoint + "', jwksUri='" + this.jwksUri + "', responseTypesSupported=" + this.responseTypesSupported + ", subjectTypesSupported=" + this.subjectTypesSupported + ", idTokenSigningAlgValuesSupported=" + this.idTokenSigningAlgValuesSupported + '}';
    }

    private OpenIdDiscoveryDocument(Builder builder) {
        this.issuer = builder.issuer;
        this.authorizationEndpoint = builder.authorizationEndpoint;
        this.tokenEndpoint = builder.tokenEndpoint;
        this.jwksUri = builder.jwksUri;
        this.responseTypesSupported = builder.responseTypesSupported;
        this.subjectTypesSupported = builder.subjectTypesSupported;
        this.idTokenSigningAlgValuesSupported = builder.idTokenSigningAlgValuesSupported;
    }
}
