package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.stripe.android.financialconnections.model.Cta;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes8.dex */
public final class GetFinancialConnectionsAcccountsParams implements Parcelable {
    public final String clientSecret;
    public final String startingAfterAccountId;
    private static final Companion Companion = new Companion();
    public static final Parcelable.Creator<GetFinancialConnectionsAcccountsParams> CREATOR = new Cta.Creator(24);

    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"com/stripe/android/financialconnections/model/GetFinancialConnectionsAcccountsParams$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/GetFinancialConnectionsAcccountsParams;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "PARAM_CLIENT_SECRET", "Ljava/lang/String;", "PARAM_STARTING_AFTER", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    final class Companion {
        public final KSerializer serializer() {
            return GetFinancialConnectionsAcccountsParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetFinancialConnectionsAcccountsParams(int i, String str, String str2) {
        if (3 != (i & 3)) {
            TuplesKt.throwMissingFieldException(i, 3, GetFinancialConnectionsAcccountsParams$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.clientSecret = str;
        this.startingAfterAccountId = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetFinancialConnectionsAcccountsParams)) {
            return false;
        }
        GetFinancialConnectionsAcccountsParams getFinancialConnectionsAcccountsParams = (GetFinancialConnectionsAcccountsParams) obj;
        return Intrinsics.areEqual(this.clientSecret, getFinancialConnectionsAcccountsParams.clientSecret) && Intrinsics.areEqual(this.startingAfterAccountId, getFinancialConnectionsAcccountsParams.startingAfterAccountId);
    }

    public final int hashCode() {
        int hashCode = this.clientSecret.hashCode() * 31;
        String str = this.startingAfterAccountId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("GetFinancialConnectionsAcccountsParams(clientSecret=", this.clientSecret, ", startingAfterAccountId=", this.startingAfterAccountId, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.clientSecret);
        parcel.writeString(this.startingAfterAccountId);
    }

    public GetFinancialConnectionsAcccountsParams(String str, String str2) {
        str.getClass();
        this.clientSecret = str;
        this.startingAfterAccountId = str2;
    }
}
