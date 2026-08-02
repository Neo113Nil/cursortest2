package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.protos.franklin.app.BankingConfig;
import com.squareup.protos.franklin.common.PaymentRewardStatus;
import com.squareup.protos.franklin.common.RewardStatus;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/franklin/app/GetPaymentRewardStatusResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/app/BankingConfig$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GetPaymentRewardStatusResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetPaymentRewardStatusResponse> CREATOR;
    public final PaymentRewardStatus payment_reward_status;
    public final RewardStatus reward_status;

    static {
        GetPaymentRewardStatusResponse$Companion$ADAPTER$1 getPaymentRewardStatusResponse$Companion$ADAPTER$1 = new GetPaymentRewardStatusResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetPaymentRewardStatusResponse.class), "type.googleapis.com/squareup.franklin.app.GetPaymentRewardStatusResponse", Syntax.PROTO_2, null, "squareup/franklin/app/reward_status.proto");
        ADAPTER = getPaymentRewardStatusResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getPaymentRewardStatusResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPaymentRewardStatusResponse(PaymentRewardStatus paymentRewardStatus, RewardStatus rewardStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.payment_reward_status = paymentRewardStatus;
        this.reward_status = rewardStatus;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetPaymentRewardStatusResponse)) {
            return false;
        }
        GetPaymentRewardStatusResponse getPaymentRewardStatusResponse = (GetPaymentRewardStatusResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getPaymentRewardStatusResponse.unknownFields()) && Intrinsics.areEqual(this.payment_reward_status, getPaymentRewardStatusResponse.payment_reward_status) && Intrinsics.areEqual(this.reward_status, getPaymentRewardStatusResponse.reward_status);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        PaymentRewardStatus paymentRewardStatus = this.payment_reward_status;
        int hashCode2 = (hashCode + (paymentRewardStatus != null ? paymentRewardStatus.hashCode() : 0)) * 37;
        RewardStatus rewardStatus = this.reward_status;
        int hashCode3 = hashCode2 + (rewardStatus != null ? rewardStatus.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BankingConfig.Builder builder = new BankingConfig.Builder(17);
        builder.strings = this.payment_reward_status;
        builder.recurring_deposits_dda_upsell = this.reward_status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        PaymentRewardStatus paymentRewardStatus = this.payment_reward_status;
        if (paymentRewardStatus != null) {
            arrayList.add("payment_reward_status=" + paymentRewardStatus);
        }
        RewardStatus rewardStatus = this.reward_status;
        if (rewardStatus != null) {
            arrayList.add("reward_status=" + rewardStatus);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetPaymentRewardStatusResponse{", "}", 0, null, null, 56);
    }
}
