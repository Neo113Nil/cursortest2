package com.linecorp.linesdk.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineApiResponse;
import com.linecorp.linesdk.LineApiResponseCode;
import com.linecorp.linesdk.LineCredential;
import com.linecorp.linesdk.LineIdToken;
import com.linecorp.linesdk.LineProfile;
import com.linecorp.linesdk.utils.ParcelUtils;
import java.util.Objects;

/* loaded from: classes2.dex */
public class LineLoginResult implements Parcelable {
    public static final Parcelable.Creator<LineLoginResult> CREATOR = new Parcelable.Creator<LineLoginResult>() { // from class: com.linecorp.linesdk.auth.LineLoginResult.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LineLoginResult createFromParcel(Parcel parcel) {
            return new LineLoginResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LineLoginResult[] newArray(int i4) {
            return new LineLoginResult[i4];
        }
    };

    @NonNull
    private final LineApiError errorData;
    private final Boolean friendshipStatusChanged;
    private final LineCredential lineCredential;
    private final LineIdToken lineIdToken;
    private final LineProfile lineProfile;
    private final String nonce;

    @NonNull
    private final LineApiResponseCode responseCode;

    public static final class Builder {
        private Boolean friendshipStatusChanged;
        private LineCredential lineCredential;
        private LineIdToken lineIdToken;
        private LineProfile lineProfile;
        private String nonce;
        private LineApiResponseCode responseCode = LineApiResponseCode.SUCCESS;
        private LineApiError errorData = LineApiError.DEFAULT;

        public LineLoginResult build() {
            return new LineLoginResult(this);
        }

        public Builder errorData(LineApiError lineApiError) {
            this.errorData = lineApiError;
            return this;
        }

        public Builder friendshipStatusChanged(Boolean bool) {
            this.friendshipStatusChanged = bool;
            return this;
        }

        public Builder lineCredential(LineCredential lineCredential) {
            this.lineCredential = lineCredential;
            return this;
        }

        public Builder lineIdToken(LineIdToken lineIdToken) {
            this.lineIdToken = lineIdToken;
            return this;
        }

        public Builder lineProfile(LineProfile lineProfile) {
            this.lineProfile = lineProfile;
            return this;
        }

        public Builder nonce(String str) {
            this.nonce = str;
            return this;
        }

        public Builder responseCode(LineApiResponseCode lineApiResponseCode) {
            this.responseCode = lineApiResponseCode;
            return this;
        }
    }

    public static LineLoginResult authenticationAgentError(@NonNull LineApiError lineApiError) {
        return error(LineApiResponseCode.AUTHENTICATION_AGENT_ERROR, lineApiError);
    }

    public static LineLoginResult canceledError() {
        return error(LineApiResponseCode.CANCEL, LineApiError.DEFAULT);
    }

    public static LineLoginResult error(@NonNull LineApiResponseCode lineApiResponseCode, @NonNull LineApiError lineApiError) {
        return new Builder().responseCode(lineApiResponseCode).errorData(lineApiError).build();
    }

    public static LineLoginResult internalError(@NonNull LineApiError lineApiError) {
        return error(LineApiResponseCode.INTERNAL_ERROR, lineApiError);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineLoginResult)) {
            return false;
        }
        LineLoginResult lineLoginResult = (LineLoginResult) obj;
        return getResponseCode() == lineLoginResult.getResponseCode() && Objects.equals(getNonce(), lineLoginResult.getNonce()) && Objects.equals(getLineProfile(), lineLoginResult.getLineProfile()) && Objects.equals(getLineIdToken(), lineLoginResult.getLineIdToken()) && Objects.equals(getFriendshipStatusChanged(), lineLoginResult.getFriendshipStatusChanged()) && Objects.equals(getLineCredential(), lineLoginResult.getLineCredential()) && getErrorData().equals(lineLoginResult.getErrorData());
    }

    @NonNull
    public LineApiError getErrorData() {
        return this.errorData;
    }

    @NonNull
    public Boolean getFriendshipStatusChanged() {
        Boolean bool = this.friendshipStatusChanged;
        return bool == null ? Boolean.FALSE : bool;
    }

    public LineCredential getLineCredential() {
        return this.lineCredential;
    }

    public LineIdToken getLineIdToken() {
        return this.lineIdToken;
    }

    public LineProfile getLineProfile() {
        return this.lineProfile;
    }

    public String getNonce() {
        return this.nonce;
    }

    @NonNull
    public LineApiResponseCode getResponseCode() {
        return this.responseCode;
    }

    public int hashCode() {
        return Objects.hash(getResponseCode(), getNonce(), getLineProfile(), getLineIdToken(), getFriendshipStatusChanged(), getLineCredential(), getErrorData());
    }

    public boolean isSuccess() {
        return this.responseCode == LineApiResponseCode.SUCCESS;
    }

    public String toString() {
        return "LineLoginResult{responseCode=" + this.responseCode + ", nonce='" + this.nonce + "', lineProfile=" + this.lineProfile + ", lineIdToken=" + this.lineIdToken + ", friendshipStatusChanged=" + this.friendshipStatusChanged + ", lineCredential=" + this.lineCredential + ", errorData=" + this.errorData + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        ParcelUtils.writeEnum(parcel, this.responseCode);
        parcel.writeString(this.nonce);
        parcel.writeParcelable(this.lineProfile, i4);
        parcel.writeParcelable(this.lineIdToken, i4);
        parcel.writeValue(this.friendshipStatusChanged);
        parcel.writeParcelable(this.lineCredential, i4);
        parcel.writeParcelable(this.errorData, i4);
    }

    public static LineLoginResult internalError(@NonNull String str) {
        return internalError(new LineApiError(str));
    }

    private LineLoginResult(Builder builder) {
        this.responseCode = builder.responseCode;
        this.nonce = builder.nonce;
        this.lineProfile = builder.lineProfile;
        this.lineIdToken = builder.lineIdToken;
        this.friendshipStatusChanged = builder.friendshipStatusChanged;
        this.lineCredential = builder.lineCredential;
        this.errorData = builder.errorData;
    }

    public static LineLoginResult internalError(@NonNull Exception exc) {
        return internalError(new LineApiError(exc));
    }

    public static LineLoginResult error(@NonNull LineApiResponse<?> lineApiResponse) {
        return error(lineApiResponse.getResponseCode(), lineApiResponse.getErrorData());
    }

    private LineLoginResult(@NonNull Parcel parcel) {
        this.responseCode = (LineApiResponseCode) ParcelUtils.readEnum(parcel, LineApiResponseCode.class);
        this.nonce = parcel.readString();
        this.lineProfile = (LineProfile) parcel.readParcelable(LineProfile.class.getClassLoader());
        this.lineIdToken = (LineIdToken) parcel.readParcelable(LineIdToken.class.getClassLoader());
        this.friendshipStatusChanged = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.lineCredential = (LineCredential) parcel.readParcelable(LineCredential.class.getClassLoader());
        this.errorData = (LineApiError) parcel.readParcelable(LineApiError.class.getClassLoader());
    }
}
