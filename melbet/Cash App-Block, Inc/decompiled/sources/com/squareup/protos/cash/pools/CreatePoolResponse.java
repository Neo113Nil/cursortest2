package com.squareup.protos.cash.pools;

import android.os.Parcelable;
import com.squareup.protos.cash.pools.PoolVisibility;
import com.squareup.protos.cash.postcard.CardModule;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/cash/pools/CreatePoolResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/postcard/CardModule$Builder;", "Builder", "FailureReason", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CreatePoolResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreatePoolResponse> CREATOR;
    public final FailureReason failure_reason;
    public final MoneyPool pool;

    public enum FailureReason implements WireEnum {
        FAILURE_REASON_DEFAULT_UNSPECIFIED(0),
        FAILURE_REASON_INVALID_GOAL_AMOUNT(1),
        FAILURE_REASON_ALREADY_CREATED(2),
        FAILURE_REASON_MAX_OPEN_POOL_LIMIT_REACHED(3),
        FAILURE_REASON_INVALID_POOL_NAME(4),
        FAILURE_REASON_MAX_POOL_NAME_LENGTH(5),
        FAILURE_REASON_INELIGIBLE_CUSTOMER(6),
        FAILURE_REASON_IDEMPOTENCY_KEY_ALREADY_USED(7),
        FAILURE_REASON_RISK_BLOCKED(8),
        FAILURE_REASON_RISK_BLOCKED_ELIGIBILITY(9);

        public static final CreatePoolResponse$FailureReason$Companion$ADAPTER$1 ADAPTER;
        public static final PoolVisibility.Companion Companion;
        public final int value;

        static {
            FailureReason failureReason = FAILURE_REASON_DEFAULT_UNSPECIFIED;
            Companion = new PoolVisibility.Companion();
            ADAPTER = new CreatePoolResponse$FailureReason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(FailureReason.class), Syntax.PROTO_2, failureReason);
        }

        FailureReason(int i) {
            this.value = i;
        }

        public static final FailureReason fromValue(int i) {
            Companion.getClass();
            return PoolVisibility.Companion.fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        CreatePoolResponse$Companion$ADAPTER$1 createPoolResponse$Companion$ADAPTER$1 = new CreatePoolResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CreatePoolResponse.class), "type.googleapis.com/squareup.cash.pools.v1beta.CreatePoolResponse", Syntax.PROTO_2, null, "squareup/cash/pools/v1beta/pools.proto");
        ADAPTER = createPoolResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(createPoolResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatePoolResponse(FailureReason failureReason, MoneyPool moneyPool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.failure_reason = failureReason;
        this.pool = moneyPool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreatePoolResponse)) {
            return false;
        }
        CreatePoolResponse createPoolResponse = (CreatePoolResponse) obj;
        return Intrinsics.areEqual(unknownFields(), createPoolResponse.unknownFields()) && this.failure_reason == createPoolResponse.failure_reason && Intrinsics.areEqual(this.pool, createPoolResponse.pool);
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
        int hashCode3 = hashCode2 + (moneyPool != null ? moneyPool.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardModule.Builder builder = new CardModule.Builder(17);
        builder.f1329type = this.failure_reason;
        builder.use_case = this.pool;
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreatePoolResponse{", "}", 0, null, null, 56);
    }
}
