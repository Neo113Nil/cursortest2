package com.squareup.protos.cash.piggybank.api.v2;

import android.os.Parcelable;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.discover.api.app.v1.model.GraphSection;
import com.squareup.protos.cash.moneymap.app.GetRetailerLocationsRequest;
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
public final class InterestTiersApyRates extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InterestTiersApyRates> CREATOR;
    public final Double enhanced_interest_apy_rate;
    public final Double standard_interest_apy_rate;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Double enhanced_interest_apy_rate;
        public Double standard_interest_apy_rate;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new InterestTiersApyRates(this.standard_interest_apy_rate, this.enhanced_interest_apy_rate, buildUnknownFields());
                case 1:
                    return new GraphSection.Point(this.standard_interest_apy_rate, this.enhanced_interest_apy_rate, buildUnknownFields());
                default:
                    return new GetRetailerLocationsRequest.LatLongQuery(this.standard_interest_apy_rate, this.enhanced_interest_apy_rate, buildUnknownFields());
            }
        }
    }

    static {
        InterestTiersApyRates$Companion$ADAPTER$1 interestTiersApyRates$Companion$ADAPTER$1 = new InterestTiersApyRates$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InterestTiersApyRates.class), "type.googleapis.com/squareup.cash.piggybank.api.v2.InterestTiersApyRates", Syntax.PROTO_2, null, "squareup/cash/piggybank/api/v2/models.proto");
        ADAPTER = interestTiersApyRates$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(interestTiersApyRates$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestTiersApyRates(Double d, Double d2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.standard_interest_apy_rate = d;
        this.enhanced_interest_apy_rate = d2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterestTiersApyRates)) {
            return false;
        }
        InterestTiersApyRates interestTiersApyRates = (InterestTiersApyRates) obj;
        return Intrinsics.areEqual(unknownFields(), interestTiersApyRates.unknownFields()) && Intrinsics.areEqual(this.standard_interest_apy_rate, interestTiersApyRates.standard_interest_apy_rate) && Intrinsics.areEqual(this.enhanced_interest_apy_rate, interestTiersApyRates.enhanced_interest_apy_rate);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Double d = this.standard_interest_apy_rate;
        int hashCode2 = (hashCode + (d != null ? Double.hashCode(d.doubleValue()) : 0)) * 37;
        Double d2 = this.enhanced_interest_apy_rate;
        int hashCode3 = hashCode2 + (d2 != null ? Double.hashCode(d2.doubleValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.standard_interest_apy_rate = this.standard_interest_apy_rate;
        builder.enhanced_interest_apy_rate = this.enhanced_interest_apy_rate;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Double d = this.standard_interest_apy_rate;
        if (d != null) {
            SizeMode$EnumUnboxingLocalUtility.m("standard_interest_apy_rate=", d, arrayList);
        }
        Double d2 = this.enhanced_interest_apy_rate;
        if (d2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("enhanced_interest_apy_rate=", d2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InterestTiersApyRates{", "}", 0, null, null, 56);
    }
}
