package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.stripe.android.stripe3ds2.init.AppInfo;
import com.stripe.android.stripe3ds2.security.DefaultMessageTransformer;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.utils.ObjectUtils;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ChallengeRequestExecutor$Config implements Serializable, Parcelable {
    public static final Parcelable.Creator<ChallengeRequestExecutor$Config> CREATOR = new AppInfo.Creator(25);
    public final String acsUrl;
    public final ChallengeRequestData creqData;
    public final Keys keys;
    public final DefaultMessageTransformer messageTransformer;
    public final String sdkReferenceId;

    public final class Keys implements Serializable, Parcelable {
        public static final Parcelable.Creator<Keys> CREATOR = new AppInfo.Creator(26);
        public final byte[] acsPublicKeyEncoded;
        public final byte[] sdkPrivateKeyEncoded;

        public Keys(byte[] bArr, byte[] bArr2) {
            bArr.getClass();
            bArr2.getClass();
            this.sdkPrivateKeyEncoded = bArr;
            this.acsPublicKeyEncoded = bArr2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Keys) {
                Keys keys = (Keys) obj;
                if (Arrays.equals(this.sdkPrivateKeyEncoded, keys.sdkPrivateKeyEncoded) && Arrays.equals(this.acsPublicKeyEncoded, keys.acsPublicKeyEncoded)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ObjectUtils.hash(this.sdkPrivateKeyEncoded, this.acsPublicKeyEncoded);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Keys(sdkPrivateKeyEncoded=", Arrays.toString(this.sdkPrivateKeyEncoded), ", acsPublicKeyEncoded=", Arrays.toString(this.acsPublicKeyEncoded), ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeByteArray(this.sdkPrivateKeyEncoded);
            parcel.writeByteArray(this.acsPublicKeyEncoded);
        }
    }

    public ChallengeRequestExecutor$Config(DefaultMessageTransformer defaultMessageTransformer, String str, ChallengeRequestData challengeRequestData, String str2, Keys keys) {
        defaultMessageTransformer.getClass();
        str.getClass();
        challengeRequestData.getClass();
        str2.getClass();
        keys.getClass();
        this.messageTransformer = defaultMessageTransformer;
        this.sdkReferenceId = str;
        this.creqData = challengeRequestData;
        this.acsUrl = str2;
        this.keys = keys;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeRequestExecutor$Config)) {
            return false;
        }
        ChallengeRequestExecutor$Config challengeRequestExecutor$Config = (ChallengeRequestExecutor$Config) obj;
        return Intrinsics.areEqual(this.messageTransformer, challengeRequestExecutor$Config.messageTransformer) && Intrinsics.areEqual(this.sdkReferenceId, challengeRequestExecutor$Config.sdkReferenceId) && Intrinsics.areEqual(this.creqData, challengeRequestExecutor$Config.creqData) && Intrinsics.areEqual(this.acsUrl, challengeRequestExecutor$Config.acsUrl) && Intrinsics.areEqual(this.keys, challengeRequestExecutor$Config.keys);
    }

    public final int hashCode() {
        return this.keys.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.creqData.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.messageTransformer.hashCode() * 31, 31, this.sdkReferenceId)) * 31, 31, this.acsUrl);
    }

    public final String toString() {
        return "Config(messageTransformer=" + this.messageTransformer + ", sdkReferenceId=" + this.sdkReferenceId + ", creqData=" + this.creqData + ", acsUrl=" + this.acsUrl + ", keys=" + this.keys + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeSerializable(this.messageTransformer);
        parcel.writeString(this.sdkReferenceId);
        this.creqData.writeToParcel(parcel, i);
        parcel.writeString(this.acsUrl);
        this.keys.writeToParcel(parcel, i);
    }
}
