package com.linecorp.linesdk.internal.pkce;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.linecorp.linesdk.utils.StringUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes2.dex */
public class PKCECode implements Parcelable {
    public static final Parcelable.Creator<PKCECode> CREATOR = new Parcelable.Creator<PKCECode>() { // from class: com.linecorp.linesdk.internal.pkce.PKCECode.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PKCECode createFromParcel(Parcel parcel) {
            return new PKCECode(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PKCECode[] newArray(int i4) {
            return new PKCECode[i4];
        }
    };
    private static final int LENGTH_VERIFIER = 64;

    @NonNull
    private final String challenge;

    @NonNull
    private final String verifier;

    @NonNull
    private static String generateChallenge(@NonNull String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException e4) {
            throw new RuntimeException(e4);
        }
    }

    private static String generateVerifier() {
        return StringUtils.createRandomAlphaNumeric(64);
    }

    public static PKCECode newCode() {
        return new PKCECode(generateVerifier());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PKCECode)) {
            return false;
        }
        PKCECode pKCECode = (PKCECode) obj;
        if (this.verifier.equals(pKCECode.verifier)) {
            return this.challenge.equals(pKCECode.challenge);
        }
        return false;
    }

    @NonNull
    public String getChallenge() {
        return this.challenge;
    }

    @NonNull
    public String getVerifier() {
        return this.verifier;
    }

    public int hashCode() {
        return (this.verifier.hashCode() * 31) + this.challenge.hashCode();
    }

    public String toString() {
        return "PKCECode{verifier='" + this.verifier + "', challenge='" + this.challenge + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.verifier);
    }

    private PKCECode(@NonNull String str) {
        this.verifier = str;
        this.challenge = generateChallenge(str);
    }

    private PKCECode(Parcel parcel) {
        String readString = parcel.readString();
        this.verifier = readString;
        this.challenge = generateChallenge(readString);
    }
}
