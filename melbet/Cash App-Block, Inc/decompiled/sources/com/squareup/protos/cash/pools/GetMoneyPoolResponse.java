package com.squareup.protos.cash.pools;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.postcard.CardScheme;
import com.squareup.protos.cash.spendinginsights.TextSize;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/cash/pools/GetMoneyPoolResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/postcard/CardScheme$Builder;", "Builder", "FailureReason", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetMoneyPoolResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetMoneyPoolResponse> CREATOR;
    public final FailureReason failure_reason;
    public final MoneyPool pool;
    public final Boolean viewer_eligible_to_leave_pool;

    public enum FailureReason implements WireEnum {
        FAILURE_REASON_DEFAULT_UNSPECIFIED(0),
        FAILURE_REASON_FORBIDDEN_POOL_MEMBERSHIP(1);

        public static final GetMoneyPoolResponse$FailureReason$Companion$ADAPTER$1 ADAPTER;
        public static final TextSize.Companion Companion;
        public final int value;

        static {
            FailureReason failureReason = FAILURE_REASON_DEFAULT_UNSPECIFIED;
            Companion = new TextSize.Companion();
            ADAPTER = new GetMoneyPoolResponse$FailureReason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(FailureReason.class), Syntax.PROTO_2, failureReason);
        }

        FailureReason(int i) {
            this.value = i;
        }

        public static final FailureReason fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return FAILURE_REASON_DEFAULT_UNSPECIFIED;
            }
            if (i != 1) {
                return null;
            }
            return FAILURE_REASON_FORBIDDEN_POOL_MEMBERSHIP;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        GetMoneyPoolResponse$Companion$ADAPTER$1 getMoneyPoolResponse$Companion$ADAPTER$1 = new GetMoneyPoolResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetMoneyPoolResponse.class), "type.googleapis.com/squareup.cash.pools.v1beta.GetMoneyPoolResponse", Syntax.PROTO_2, null, "squareup/cash/pools/v1beta/pools.proto");
        ADAPTER = getMoneyPoolResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getMoneyPoolResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMoneyPoolResponse(FailureReason failureReason, MoneyPool moneyPool, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.failure_reason = failureReason;
        this.pool = moneyPool;
        this.viewer_eligible_to_leave_pool = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetMoneyPoolResponse)) {
            return false;
        }
        GetMoneyPoolResponse getMoneyPoolResponse = (GetMoneyPoolResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getMoneyPoolResponse.unknownFields()) && this.failure_reason == getMoneyPoolResponse.failure_reason && Intrinsics.areEqual(this.pool, getMoneyPoolResponse.pool) && Intrinsics.areEqual(this.viewer_eligible_to_leave_pool, getMoneyPoolResponse.viewer_eligible_to_leave_pool);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        FailureReason failureReason = this.failure_reason;
        int hashCode2 = (hashCode + (failureReason != null ? failureReason.hashCode() : 0)) * 37;
        MoneyPool moneyPool = this.pool;
        int hashCode3 = (hashCode2 + (moneyPool != null ? moneyPool.hashCode() : 0)) * 37;
        Boolean bool = this.viewer_eligible_to_leave_pool;
        int hashCode4 = hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardScheme.Builder builder = new CardScheme.Builder(3);
        builder.modules = this.failure_reason;
        builder.overflow_modules = this.pool;
        builder.card_home_actions = this.viewer_eligible_to_leave_pool;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        FailureReason failureReason = this.failure_reason;
        if (failureReason != null) {
            arrayList.add("failure_reason=" + failureReason);
        }
        MoneyPool moneyPool = this.pool;
        if (moneyPool != null) {
            arrayList.add("pool=" + moneyPool);
        }
        Boolean bool = this.viewer_eligible_to_leave_pool;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("viewer_eligible_to_leave_pool=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetMoneyPoolResponse{", "}", 0, null, null, 56);
    }
}
