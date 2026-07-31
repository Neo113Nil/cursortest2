package com.linecorp.linesdk.auth;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.linecorp.linesdk.ManifestParser;
import com.linecorp.linesdk.api.LineDefaultEnvConfig;
import com.linecorp.linesdk.api.LineEnvConfig;

/* loaded from: classes2.dex */
public class LineAuthenticationConfig implements Parcelable {

    @NonNull
    private final Uri apiBaseUrl;

    @NonNull
    private final String channelId;
    private final boolean isEncryptorPreparationDisabled;
    private final boolean isLineAppAuthenticationDisabled;

    @NonNull
    private final Uri openidDiscoveryDocumentUrl;

    @NonNull
    private final Uri webLoginPageUrl;
    public static final Parcelable.Creator<LineAuthenticationConfig> CREATOR = new Parcelable.Creator<LineAuthenticationConfig>() { // from class: com.linecorp.linesdk.auth.LineAuthenticationConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LineAuthenticationConfig createFromParcel(Parcel parcel) {
            return new LineAuthenticationConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LineAuthenticationConfig[] newArray(int i4) {
            return new LineAuthenticationConfig[i4];
        }
    };
    private static int FLAGS_LINE_APP_AUTHENTICATION_DISABLED = 1;
    private static int FLAGS_ENCRYPTOR_PREPARATION_DISABLED = 2;

    public static class Builder {

        @NonNull
        private Uri apiBaseUrl;

        @NonNull
        private final String channelId;
        private boolean isEncryptorPreparationDisabled;
        private boolean isLineAppAuthenticationDisabled;

        @NonNull
        private Uri openidDiscoveryDocumentUrl;

        @NonNull
        private Uri webLoginPageUrl;

        public Builder(@NonNull String str) {
            this(str, null);
        }

        @NonNull
        @Deprecated
        Builder apiBaseUrl(Uri uri) {
            if (uri != null) {
                this.apiBaseUrl = uri;
            }
            return this;
        }

        @NonNull
        public LineAuthenticationConfig build() {
            return new LineAuthenticationConfig(this);
        }

        @NonNull
        public Builder disableEncryptorPreparation() {
            this.isEncryptorPreparationDisabled = true;
            return this;
        }

        @NonNull
        public Builder disableLineAppAuthentication() {
            this.isLineAppAuthenticationDisabled = true;
            return this;
        }

        @NonNull
        @Deprecated
        Builder openidDiscoveryDocumentUrl(Uri uri) {
            if (uri != null) {
                this.openidDiscoveryDocumentUrl = uri;
            }
            return this;
        }

        @NonNull
        @Deprecated
        Builder webLoginPageUrl(Uri uri) {
            if (uri != null) {
                this.webLoginPageUrl = uri;
            }
            return this;
        }

        public Builder(@NonNull String str, Context context) {
            this(str, context, new ManifestParser());
        }

        Builder(@NonNull String str, Context context, @NonNull ManifestParser manifestParser) {
            if (!TextUtils.isEmpty(str)) {
                this.channelId = str;
                LineEnvConfig parse = context != null ? manifestParser.parse(context) : null;
                parse = parse == null ? new LineDefaultEnvConfig() : parse;
                this.openidDiscoveryDocumentUrl = Uri.parse(parse.getOpenIdDiscoveryDocumentUrl());
                this.apiBaseUrl = Uri.parse(parse.getApiServerBaseUri());
                this.webLoginPageUrl = Uri.parse(parse.getWebLoginPageUrl());
                return;
            }
            throw new IllegalArgumentException("channelId is empty.");
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineAuthenticationConfig lineAuthenticationConfig = (LineAuthenticationConfig) obj;
        if (this.isLineAppAuthenticationDisabled == lineAuthenticationConfig.isLineAppAuthenticationDisabled && this.isEncryptorPreparationDisabled == lineAuthenticationConfig.isEncryptorPreparationDisabled && this.channelId.equals(lineAuthenticationConfig.channelId) && this.openidDiscoveryDocumentUrl.equals(lineAuthenticationConfig.openidDiscoveryDocumentUrl) && this.apiBaseUrl.equals(lineAuthenticationConfig.apiBaseUrl)) {
            return this.webLoginPageUrl.equals(lineAuthenticationConfig.webLoginPageUrl);
        }
        return false;
    }

    @NonNull
    public Uri getApiBaseUrl() {
        return this.apiBaseUrl;
    }

    @NonNull
    public String getChannelId() {
        return this.channelId;
    }

    @NonNull
    public Uri getOpenidDiscoveryDocumentUrl() {
        return this.openidDiscoveryDocumentUrl;
    }

    @NonNull
    public Uri getWebLoginPageUrl() {
        return this.webLoginPageUrl;
    }

    public int hashCode() {
        return (((((((((this.channelId.hashCode() * 31) + this.openidDiscoveryDocumentUrl.hashCode()) * 31) + this.apiBaseUrl.hashCode()) * 31) + this.webLoginPageUrl.hashCode()) * 31) + (this.isLineAppAuthenticationDisabled ? 1 : 0)) * 31) + (this.isEncryptorPreparationDisabled ? 1 : 0);
    }

    public boolean isEncryptorPreparationDisabled() {
        return this.isEncryptorPreparationDisabled;
    }

    public boolean isLineAppAuthenticationDisabled() {
        return this.isLineAppAuthenticationDisabled;
    }

    public String toString() {
        return "LineAuthenticationConfig{channelId='" + this.channelId + "', openidDiscoveryDocumentUrl=" + this.openidDiscoveryDocumentUrl + ", apiBaseUrl=" + this.apiBaseUrl + ", webLoginPageUrl=" + this.webLoginPageUrl + ", isLineAppAuthenticationDisabled=" + this.isLineAppAuthenticationDisabled + ", isEncryptorPreparationDisabled=" + this.isEncryptorPreparationDisabled + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.channelId);
        parcel.writeParcelable(this.openidDiscoveryDocumentUrl, i4);
        parcel.writeParcelable(this.apiBaseUrl, i4);
        parcel.writeParcelable(this.webLoginPageUrl, i4);
        parcel.writeInt((this.isLineAppAuthenticationDisabled ? FLAGS_LINE_APP_AUTHENTICATION_DISABLED : 0) | (this.isEncryptorPreparationDisabled ? FLAGS_ENCRYPTOR_PREPARATION_DISABLED : 0));
    }

    private LineAuthenticationConfig(@NonNull Builder builder) {
        this.channelId = builder.channelId;
        this.openidDiscoveryDocumentUrl = builder.openidDiscoveryDocumentUrl;
        this.apiBaseUrl = builder.apiBaseUrl;
        this.webLoginPageUrl = builder.webLoginPageUrl;
        this.isLineAppAuthenticationDisabled = builder.isLineAppAuthenticationDisabled;
        this.isEncryptorPreparationDisabled = builder.isEncryptorPreparationDisabled;
    }

    private LineAuthenticationConfig(@NonNull Parcel parcel) {
        this.channelId = parcel.readString();
        this.openidDiscoveryDocumentUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.apiBaseUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.webLoginPageUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        int readInt = parcel.readInt();
        this.isLineAppAuthenticationDisabled = (FLAGS_LINE_APP_AUTHENTICATION_DISABLED & readInt) > 0;
        this.isEncryptorPreparationDisabled = (readInt & FLAGS_ENCRYPTOR_PREPARATION_DISABLED) > 0;
    }
}
