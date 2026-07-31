package com.linecorp.linesdk;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class LineFriendProfile extends LineProfile {
    public static final Parcelable.Creator<LineFriendProfile> CREATOR = new Parcelable.Creator<LineFriendProfile>() { // from class: com.linecorp.linesdk.LineFriendProfile.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LineFriendProfile createFromParcel(Parcel parcel) {
            return new LineFriendProfile(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LineFriendProfile[] newArray(int i4) {
            return new LineFriendProfile[i4];
        }
    };
    private final String overriddenDisplayName;

    public LineFriendProfile(@NonNull String str, @NonNull String str2, Uri uri, String str3, @NonNull String str4) {
        super(str, str2, uri, str3);
        this.overriddenDisplayName = str4;
    }

    @Override // com.linecorp.linesdk.LineProfile
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineFriendProfile) || !super.equals(obj)) {
            return false;
        }
        LineFriendProfile lineFriendProfile = (LineFriendProfile) obj;
        String str = this.overriddenDisplayName;
        return str != null ? str.equals(lineFriendProfile.overriddenDisplayName) : lineFriendProfile.overriddenDisplayName == null;
    }

    @NonNull
    public String getAvailableDisplayName() {
        return !TextUtils.isEmpty(this.overriddenDisplayName) ? this.overriddenDisplayName : getDisplayName();
    }

    public String getOverriddenDisplayName() {
        return this.overriddenDisplayName;
    }

    @Override // com.linecorp.linesdk.LineProfile
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.overriddenDisplayName;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // com.linecorp.linesdk.LineProfile
    public String toString() {
        return "LineFriendProfile{userId='" + getUserId() + "', displayName='" + getDisplayName() + "', pictureUrl=" + getPictureUrl() + ", statusMessage='" + getStatusMessage() + "', overriddenDisplayName='" + this.overriddenDisplayName + "'}";
    }

    @Override // com.linecorp.linesdk.LineProfile, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeString(this.overriddenDisplayName);
    }

    protected LineFriendProfile(@NonNull Parcel parcel) {
        super(parcel);
        this.overriddenDisplayName = parcel.readString();
    }
}
