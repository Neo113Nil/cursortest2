package com.squareup.protos.cash.investcrypto.server;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.banklin.data.StoredValueBalance;
import com.squareup.protos.cash.groups.Group;
import com.squareup.protos.cash.investcrypto.event.CryptoOrderEvent;
import com.squareup.protos.cash.investcrypto.resources.OrderRejectionReason$Reason;
import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.protos.franklin.common.ResponseContext;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/investcrypto/server/CancelOrderResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/groups/Group$Builder;", "Builder", "InternalResponse", "Result", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CancelOrderResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CancelOrderResponse> CREATOR;
    public final InternalResponse internal_response;
    public final ResponseContext response_context;
    public final Result result;

    public final class InternalResponse extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<InternalResponse> CREATOR;
        public final StoredValueBalance balance;
        public final CryptoOrderEvent crypto_order_event;
        public final OrderRejectionReason$Reason rejection_reason;

        static {
            CancelOrderResponse$InternalResponse$Companion$ADAPTER$1 cancelOrderResponse$InternalResponse$Companion$ADAPTER$1 = new CancelOrderResponse$InternalResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InternalResponse.class), "type.googleapis.com/squareup.cash.investcrypto.server.CancelOrderResponse.InternalResponse", Syntax.PROTO_2, null, "squareup/cash/investcrypto/server/service.proto");
            ADAPTER = cancelOrderResponse$InternalResponse$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cancelOrderResponse$InternalResponse$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InternalResponse(StoredValueBalance storedValueBalance, OrderRejectionReason$Reason orderRejectionReason$Reason, CryptoOrderEvent cryptoOrderEvent, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.balance = storedValueBalance;
            this.rejection_reason = orderRejectionReason$Reason;
            this.crypto_order_event = cryptoOrderEvent;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InternalResponse)) {
                return false;
            }
            InternalResponse internalResponse = (InternalResponse) obj;
            return Intrinsics.areEqual(unknownFields(), internalResponse.unknownFields()) && Intrinsics.areEqual(this.balance, internalResponse.balance) && this.rejection_reason == internalResponse.rejection_reason && Intrinsics.areEqual(this.crypto_order_event, internalResponse.crypto_order_event);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            StoredValueBalance storedValueBalance = this.balance;
            int hashCode2 = (hashCode + (storedValueBalance != null ? storedValueBalance.hashCode() : 0)) * 37;
            OrderRejectionReason$Reason orderRejectionReason$Reason = this.rejection_reason;
            int hashCode3 = (hashCode2 + (orderRejectionReason$Reason != null ? orderRejectionReason$Reason.hashCode() : 0)) * 37;
            CryptoOrderEvent cryptoOrderEvent = this.crypto_order_event;
            int hashCode4 = hashCode3 + (cryptoOrderEvent != null ? cryptoOrderEvent.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Group.Builder builder = new Group.Builder(4);
            builder.name = this.balance;
            builder.group_image = this.rejection_reason;
            builder.participants = this.crypto_order_event;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            StoredValueBalance storedValueBalance = this.balance;
            if (storedValueBalance != null) {
                arrayList.add("balance=" + storedValueBalance);
            }
            OrderRejectionReason$Reason orderRejectionReason$Reason = this.rejection_reason;
            if (orderRejectionReason$Reason != null) {
                arrayList.add("rejection_reason=" + orderRejectionReason$Reason);
            }
            CryptoOrderEvent cryptoOrderEvent = this.crypto_order_event;
            if (cryptoOrderEvent != null) {
                arrayList.add("crypto_order_event=" + cryptoOrderEvent);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "InternalResponse{", "}", 0, null, null, 56);
        }
    }

    public enum Result implements WireEnum {
        SUCCESS(1),
        FAILURE(2);

        public final int value;
        public static final RetailerType.Companion Companion = new RetailerType.Companion();
        public static final CancelOrderResponse$Result$Companion$ADAPTER$1 ADAPTER = new CancelOrderResponse$Result$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Result.class), Syntax.PROTO_2, null);

        Result(int i) {
            this.value = i;
        }

        public static final Result fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return SUCCESS;
            }
            if (i != 2) {
                return null;
            }
            return FAILURE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        CancelOrderResponse$Companion$ADAPTER$1 cancelOrderResponse$Companion$ADAPTER$1 = new CancelOrderResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CancelOrderResponse.class), "type.googleapis.com/squareup.cash.investcrypto.server.CancelOrderResponse", Syntax.PROTO_2, null, "squareup/cash/investcrypto/server/service.proto");
        ADAPTER = cancelOrderResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cancelOrderResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelOrderResponse(Result result, ResponseContext responseContext, InternalResponse internalResponse, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.result = result;
        this.response_context = responseContext;
        this.internal_response = internalResponse;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CancelOrderResponse)) {
            return false;
        }
        CancelOrderResponse cancelOrderResponse = (CancelOrderResponse) obj;
        return Intrinsics.areEqual(unknownFields(), cancelOrderResponse.unknownFields()) && this.result == cancelOrderResponse.result && Intrinsics.areEqual(this.response_context, cancelOrderResponse.response_context) && Intrinsics.areEqual(this.internal_response, cancelOrderResponse.internal_response);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Result result = this.result;
        int hashCode2 = (hashCode + (result != null ? result.hashCode() : 0)) * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode3 = (hashCode2 + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        InternalResponse internalResponse = this.internal_response;
        int hashCode4 = hashCode3 + (internalResponse != null ? internalResponse.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Group.Builder builder = new Group.Builder(3);
        builder.name = this.result;
        builder.group_image = this.response_context;
        builder.participants = this.internal_response;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Result result = this.result;
        if (result != null) {
            arrayList.add("result=" + result);
        }
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        InternalResponse internalResponse = this.internal_response;
        if (internalResponse != null) {
            arrayList.add("internal_response=" + internalResponse);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CancelOrderResponse{", "}", 0, null, null, 56);
    }
}
