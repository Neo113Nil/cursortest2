package com.linecorp.linesdk.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.linecorp.linesdk.internal.pkce.PKCECode;

/* loaded from: classes2.dex */
class LineAuthenticationStatus implements Parcelable {
    public static final Parcelable.Creator<LineAuthenticationStatus> CREATOR = new Parcelable.Creator<LineAuthenticationStatus>() { // from class: com.linecorp.linesdk.auth.internal.LineAuthenticationStatus.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LineAuthenticationStatus createFromParcel(Parcel parcel) {
            return new LineAuthenticationStatus(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LineAuthenticationStatus[] newArray(int i4) {
            return new LineAuthenticationStatus[i4];
        }
    };
    private String oAuthState;
    private String openIdNonce;
    private PKCECode pkceCode;
    private String sentRedirectUri;
    private Status status;

    enum Status {
        INIT,
        STARTED,
        INTENT_RECEIVED,
        INTENT_HANDLED
    }

    void authenticationIntentHandled() {
        this.status = Status.INTENT_HANDLED;
    }

    void authenticationIntentReceived() {
        this.status = Status.INTENT_RECEIVED;
    }

    public void authenticationStarted() {
        this.status = Status.STARTED;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getOAuthState() {
        return this.oAuthState;
    }

    public String getOpenIdNonce() {
        return this.openIdNonce;
    }

    PKCECode getPKCECode() {
        return this.pkceCode;
    }

    String getSentRedirectUri() {
        return this.sentRedirectUri;
    }

    @NonNull
    public Status getStatus() {
        return this.status;
    }

    public void setOAuthState(String str) {
        this.oAuthState = str;
    }

    public void setOpenIdNonce(String str) {
        this.openIdNonce = str;
    }

    void setPKCECode(PKCECode pKCECode) {
        this.pkceCode = pKCECode;
    }

    void setSentRedirectUri(String str) {
        this.sentRedirectUri = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.pkceCode, i4);
        parcel.writeString(this.sentRedirectUri);
        parcel.writeByte((byte) this.status.ordinal());
        parcel.writeString(this.oAuthState);
        parcel.writeString(this.openIdNonce);
    }

    LineAuthenticationStatus() {
        this.status = Status.INIT;
    }

    private LineAuthenticationStatus(@NonNull Parcel parcel) {
        this.status = Status.INIT;
        this.pkceCode = (PKCECode) parcel.readParcelable(PKCECode.class.getClassLoader());
        this.sentRedirectUri = parcel.readString();
        this.status = Status.values()[parcel.readByte()];
        this.oAuthState = parcel.readString();
        this.openIdNonce = parcel.readString();
    }
}
