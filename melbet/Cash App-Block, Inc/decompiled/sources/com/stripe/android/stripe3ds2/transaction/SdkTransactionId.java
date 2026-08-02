package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.hcaptcha.HCaptchaStateListener;
import java.io.Serializable;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SdkTransactionId implements Parcelable, Serializable {
    public static final Parcelable.Creator<SdkTransactionId> CREATOR = new HCaptchaStateListener.Creator(12);
    public final String value;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SdkTransactionId(UUID uuid) {
        this(r1);
        uuid.getClass();
        String uuid2 = uuid.toString();
        uuid2.getClass();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SdkTransactionId) && Intrinsics.areEqual(this.value, ((SdkTransactionId) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.value);
    }

    public SdkTransactionId(String str) {
        str.getClass();
        this.value = str;
    }
}
