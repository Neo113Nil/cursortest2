package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/GetSparkWalletBalanceResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/GetSparkWalletBalanceResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetSparkWalletBalanceResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetSparkWalletBalanceResponse> CREATOR;
    public final Long spendable_balance_sats;
    public final Long unclaimed_immature_deposit_balance_sats;
    public final Long unclaimed_mature_deposit_balance_sats;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Long spendable_balance_sats;
        public Long unclaimed_immature_deposit_balance_sats;
        public Long unclaimed_mature_deposit_balance_sats;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new GetSparkWalletBalanceResponse(this.spendable_balance_sats, this.unclaimed_immature_deposit_balance_sats, this.unclaimed_mature_deposit_balance_sats, buildUnknownFields());
                case 1:
                    return new GetCustomerLimitsResponse.FlatLimits.LimitUsage.CountLimit(this.spendable_balance_sats, this.unclaimed_immature_deposit_balance_sats, this.unclaimed_mature_deposit_balance_sats, buildUnknownFields());
                default:
                    return new GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage.CountLimit(this.spendable_balance_sats, this.unclaimed_immature_deposit_balance_sats, this.unclaimed_mature_deposit_balance_sats, buildUnknownFields());
            }
        }
    }

    static {
        GetSparkWalletBalanceResponse$Companion$ADAPTER$1 getSparkWalletBalanceResponse$Companion$ADAPTER$1 = new GetSparkWalletBalanceResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetSparkWalletBalanceResponse.class), "type.googleapis.com/squareup.cash.cashliteorchestrator.api.v1beta1.GetSparkWalletBalanceResponse", Syntax.PROTO_2, null, "squareup/cash/cashliteorchestrator/api/v1beta1/orchestrator.proto");
        ADAPTER = getSparkWalletBalanceResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getSparkWalletBalanceResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSparkWalletBalanceResponse(Long l, Long l2, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.spendable_balance_sats = l;
        this.unclaimed_immature_deposit_balance_sats = l2;
        this.unclaimed_mature_deposit_balance_sats = l3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetSparkWalletBalanceResponse)) {
            return false;
        }
        GetSparkWalletBalanceResponse getSparkWalletBalanceResponse = (GetSparkWalletBalanceResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getSparkWalletBalanceResponse.unknownFields()) && Intrinsics.areEqual(this.spendable_balance_sats, getSparkWalletBalanceResponse.spendable_balance_sats) && Intrinsics.areEqual(this.unclaimed_immature_deposit_balance_sats, getSparkWalletBalanceResponse.unclaimed_immature_deposit_balance_sats) && Intrinsics.areEqual(this.unclaimed_mature_deposit_balance_sats, getSparkWalletBalanceResponse.unclaimed_mature_deposit_balance_sats);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.spendable_balance_sats;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.unclaimed_immature_deposit_balance_sats;
        int hashCode3 = (hashCode2 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.unclaimed_mature_deposit_balance_sats;
        int hashCode4 = hashCode3 + (l3 != null ? Long.hashCode(l3.longValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.spendable_balance_sats = this.spendable_balance_sats;
        builder.unclaimed_immature_deposit_balance_sats = this.unclaimed_immature_deposit_balance_sats;
        builder.unclaimed_mature_deposit_balance_sats = this.unclaimed_mature_deposit_balance_sats;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.spendable_balance_sats;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("spendable_balance_sats=", l, arrayList);
        }
        Long l2 = this.unclaimed_immature_deposit_balance_sats;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("unclaimed_immature_deposit_balance_sats=", l2, arrayList);
        }
        Long l3 = this.unclaimed_mature_deposit_balance_sats;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("unclaimed_mature_deposit_balance_sats=", l3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetSparkWalletBalanceResponse{", "}", 0, null, null, 56);
    }
}
