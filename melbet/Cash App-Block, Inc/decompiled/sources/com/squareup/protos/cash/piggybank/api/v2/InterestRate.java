package com.squareup.protos.cash.piggybank.api.v2;

import android.os.Parcelable;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.nearby.api.v1.BLEPayload;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InterestRate extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InterestRate> CREATOR;
    public final Double apy_rate;
    public final InterestTiersApyRates interest_tiers_apy_rates;
    public final InterestYieldStatus interest_yield_status;

    static {
        InterestRate$Companion$ADAPTER$1 interestRate$Companion$ADAPTER$1 = new InterestRate$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InterestRate.class), "type.googleapis.com/squareup.cash.piggybank.api.v2.InterestRate", Syntax.PROTO_2, null, "squareup/cash/piggybank/api/v2/models.proto");
        ADAPTER = interestRate$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(interestRate$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestRate(Double d, InterestYieldStatus interestYieldStatus, InterestTiersApyRates interestTiersApyRates, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.apy_rate = d;
        this.interest_yield_status = interestYieldStatus;
        this.interest_tiers_apy_rates = interestTiersApyRates;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterestRate)) {
            return false;
        }
        InterestRate interestRate = (InterestRate) obj;
        return Intrinsics.areEqual(unknownFields(), interestRate.unknownFields()) && Intrinsics.areEqual(this.apy_rate, interestRate.apy_rate) && this.interest_yield_status == interestRate.interest_yield_status && Intrinsics.areEqual(this.interest_tiers_apy_rates, interestRate.interest_tiers_apy_rates);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Double d = this.apy_rate;
        int hashCode2 = (hashCode + (d != null ? Double.hashCode(d.doubleValue()) : 0)) * 37;
        InterestYieldStatus interestYieldStatus = this.interest_yield_status;
        int hashCode3 = (hashCode2 + (interestYieldStatus != null ? interestYieldStatus.hashCode() : 0)) * 37;
        InterestTiersApyRates interestTiersApyRates = this.interest_tiers_apy_rates;
        int hashCode4 = hashCode3 + (interestTiersApyRates != null ? interestTiersApyRates.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BLEPayload.Builder builder = new BLEPayload.Builder(25, false);
        builder.advertisement_data = this.apy_rate;
        builder.transmission_level = this.interest_yield_status;
        builder.frequency = this.interest_tiers_apy_rates;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Double d = this.apy_rate;
        if (d != null) {
            SizeMode$EnumUnboxingLocalUtility.m("apy_rate=", d, arrayList);
        }
        InterestYieldStatus interestYieldStatus = this.interest_yield_status;
        if (interestYieldStatus != null) {
            arrayList.add("interest_yield_status=" + interestYieldStatus);
        }
        InterestTiersApyRates interestTiersApyRates = this.interest_tiers_apy_rates;
        if (interestTiersApyRates != null) {
            arrayList.add("interest_tiers_apy_rates=" + interestTiersApyRates);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InterestRate{", "}", 0, null, null, 56);
    }
}
