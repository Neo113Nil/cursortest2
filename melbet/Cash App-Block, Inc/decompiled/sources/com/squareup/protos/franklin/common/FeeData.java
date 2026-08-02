package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.out.sync_entity.MinFeeStep;
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

/* loaded from: classes8.dex */
public final class FeeData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FeeData> CREATOR;
    public final Long fee_bps;
    public final Long fee_fixed_amount_cents;
    public final Long maximum_fee_cents;
    public final Long minimum_fee_cents;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Long fee_bps;
        public Long fee_fixed_amount_cents;
        public Long maximum_fee_cents;
        public Long minimum_fee_cents;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new FeeData(this.fee_bps, this.minimum_fee_cents, this.fee_fixed_amount_cents, this.maximum_fee_cents, buildUnknownFields());
                default:
                    return new MinFeeStep(this.fee_bps, this.minimum_fee_cents, this.fee_fixed_amount_cents, this.maximum_fee_cents, buildUnknownFields());
            }
        }
    }

    static {
        FeeData$Companion$ADAPTER$1 feeData$Companion$ADAPTER$1 = new FeeData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FeeData.class), "type.googleapis.com/squareup.franklin.common.FeeData", Syntax.PROTO_2, null, "squareup/franklin/common/deposit_preference.proto");
        ADAPTER = feeData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(feeData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeeData(Long l, Long l2, Long l3, Long l4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.fee_bps = l;
        this.minimum_fee_cents = l2;
        this.fee_fixed_amount_cents = l3;
        this.maximum_fee_cents = l4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FeeData)) {
            return false;
        }
        FeeData feeData = (FeeData) obj;
        return Intrinsics.areEqual(unknownFields(), feeData.unknownFields()) && Intrinsics.areEqual(this.fee_bps, feeData.fee_bps) && Intrinsics.areEqual(this.minimum_fee_cents, feeData.minimum_fee_cents) && Intrinsics.areEqual(this.fee_fixed_amount_cents, feeData.fee_fixed_amount_cents) && Intrinsics.areEqual(this.maximum_fee_cents, feeData.maximum_fee_cents);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.fee_bps;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.minimum_fee_cents;
        int hashCode3 = (hashCode2 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.fee_fixed_amount_cents;
        int hashCode4 = (hashCode3 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        Long l4 = this.maximum_fee_cents;
        int hashCode5 = hashCode4 + (l4 != null ? Long.hashCode(l4.longValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.fee_bps = this.fee_bps;
        builder.minimum_fee_cents = this.minimum_fee_cents;
        builder.fee_fixed_amount_cents = this.fee_fixed_amount_cents;
        builder.maximum_fee_cents = this.maximum_fee_cents;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.fee_bps;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("fee_bps=", l, arrayList);
        }
        Long l2 = this.minimum_fee_cents;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("minimum_fee_cents=", l2, arrayList);
        }
        Long l3 = this.fee_fixed_amount_cents;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("fee_fixed_amount_cents=", l3, arrayList);
        }
        Long l4 = this.maximum_fee_cents;
        if (l4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("maximum_fee_cents=", l4, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FeeData{", "}", 0, null, null, 56);
    }
}
