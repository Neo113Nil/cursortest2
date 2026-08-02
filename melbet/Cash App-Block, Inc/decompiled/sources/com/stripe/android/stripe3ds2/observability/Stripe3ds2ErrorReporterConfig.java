package com.stripe.android.stripe3ds2.observability;

import android.os.Parcel;
import android.os.Parcelable;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import java.util.Map;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class Stripe3ds2ErrorReporterConfig implements DefaultErrorReporter.Config, Parcelable {
    public static final Parcelable.Creator<Stripe3ds2ErrorReporterConfig> CREATOR = new Creator();
    public final SdkTransactionId sdkTransactionId;

    public final class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Stripe3ds2ErrorReporterConfig(parcel.readInt() == 0 ? null : SdkTransactionId.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Stripe3ds2ErrorReporterConfig[i];
        }
    }

    public Stripe3ds2ErrorReporterConfig(SdkTransactionId sdkTransactionId) {
        this.sdkTransactionId = sdkTransactionId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Stripe3ds2ErrorReporterConfig) && Intrinsics.areEqual(this.sdkTransactionId, ((Stripe3ds2ErrorReporterConfig) obj).sdkTransactionId);
    }

    @Override // com.stripe.android.stripe3ds2.observability.DefaultErrorReporter.Config
    public final Map getCustomTags() {
        SdkTransactionId sdkTransactionId = this.sdkTransactionId;
        Map m = sdkTransactionId != null ? Thread$State$EnumUnboxingLocalUtility.m("sdk_transaction_id", sdkTransactionId.value) : null;
        if (m != null) {
            return m;
        }
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        return emptyMap;
    }

    public final int hashCode() {
        SdkTransactionId sdkTransactionId = this.sdkTransactionId;
        if (sdkTransactionId == null) {
            return 0;
        }
        return sdkTransactionId.value.hashCode();
    }

    public final String toString() {
        return "Stripe3ds2ErrorReporterConfig(sdkTransactionId=" + this.sdkTransactionId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        SdkTransactionId sdkTransactionId = this.sdkTransactionId;
        if (sdkTransactionId == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(sdkTransactionId.value);
        }
    }
}
