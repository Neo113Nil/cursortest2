package com.linecorp.linesdk;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.linecorp.linesdk.utils.DebugUtils;

/* loaded from: classes2.dex */
public class LineAccessToken implements Parcelable {
    public static final Parcelable.Creator<LineAccessToken> CREATOR = new Parcelable.Creator<LineAccessToken>() { // from class: com.linecorp.linesdk.LineAccessToken.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LineAccessToken createFromParcel(Parcel parcel) {
            return new LineAccessToken(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LineAccessToken[] newArray(int i4) {
            return new LineAccessToken[i4];
        }
    };

    @NonNull
    private final String accessToken;
    private final long expiresInMillis;
    private final long issuedClientTimeMillis;

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
        LineAccessToken lineAccessToken = (LineAccessToken) obj;
        if (this.expiresInMillis == lineAccessToken.expiresInMillis && this.issuedClientTimeMillis == lineAccessToken.issuedClientTimeMillis) {
            return this.accessToken.equals(lineAccessToken.accessToken);
        }
        return false;
    }

    public long getEstimatedExpirationTimeMillis() {
        return getIssuedClientTimeMillis() + getExpiresInMillis();
    }

    public long getExpiresInMillis() {
        return this.expiresInMillis;
    }

    public long getIssuedClientTimeMillis() {
        return this.issuedClientTimeMillis;
    }

    @NonNull
    public String getTokenString() {
        return this.accessToken;
    }

    public int hashCode() {
        int hashCode = this.accessToken.hashCode() * 31;
        long j4 = this.expiresInMillis;
        int i4 = (hashCode + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.issuedClientTimeMillis;
        return i4 + ((int) (j5 ^ (j5 >>> 32)));
    }

    public String toString() {
        return "LineAccessToken{accessToken='" + DebugUtils.hideIfNotDebug(this.accessToken) + "', expiresInMillis=" + this.expiresInMillis + ", issuedClientTimeMillis=" + this.issuedClientTimeMillis + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.accessToken);
        parcel.writeLong(this.expiresInMillis);
        parcel.writeLong(this.issuedClientTimeMillis);
    }

    public LineAccessToken(@NonNull String str, long j4, long j5) {
        this.accessToken = str;
        this.expiresInMillis = j4;
        this.issuedClientTimeMillis = j5;
    }

    private LineAccessToken(@NonNull Parcel parcel) {
        this.accessToken = parcel.readString();
        this.expiresInMillis = parcel.readLong();
        this.issuedClientTimeMillis = parcel.readLong();
    }
}
