package com.squareup.protos.cash.agentcore.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cropview.Edge;
import com.squareup.protos.cash.api.ResponseMetadata;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/cash/agentcore/api/v1/AgentWalletRetrievePaymentResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/api/ResponseMetadata$Builder;", "Builder", "Status", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AgentWalletRetrievePaymentResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AgentWalletRetrievePaymentResponse> CREATOR;
    public final String payment_id;
    public final Status status;

    public enum Status implements WireEnum {
        STATUS_UNSPECIFIED(0),
        STATUS_PENDING_APPROVAL(1),
        STATUS_COMPLETED(2),
        STATUS_DECLINED(3),
        STATUS_EXPIRED(4),
        STATUS_FAILED(5),
        STATUS_PROCESSING(6);

        public static final AgentWalletRetrievePaymentResponse$Status$Companion$ADAPTER$1 ADAPTER;
        public static final Edge.Companion Companion;
        public final int value;

        static {
            Status status = STATUS_UNSPECIFIED;
            Companion = new Edge.Companion(15);
            ADAPTER = new AgentWalletRetrievePaymentResponse$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
        }

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            switch (i) {
                case 0:
                    return STATUS_UNSPECIFIED;
                case 1:
                    return STATUS_PENDING_APPROVAL;
                case 2:
                    return STATUS_COMPLETED;
                case 3:
                    return STATUS_DECLINED;
                case 4:
                    return STATUS_EXPIRED;
                case 5:
                    return STATUS_FAILED;
                case 6:
                    return STATUS_PROCESSING;
                default:
                    return null;
            }
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        AgentWalletRetrievePaymentResponse$Companion$ADAPTER$1 agentWalletRetrievePaymentResponse$Companion$ADAPTER$1 = new AgentWalletRetrievePaymentResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AgentWalletRetrievePaymentResponse.class), "type.googleapis.com/squareup.cash.agentcore.api.v1beta1.AgentWalletRetrievePaymentResponse", Syntax.PROTO_2, null, "squareup/cash/agentcore/api/v1beta1/agent_wallet_retrieve_payment_messages.proto");
        ADAPTER = agentWalletRetrievePaymentResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(agentWalletRetrievePaymentResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentWalletRetrievePaymentResponse(String str, Status status, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.payment_id = str;
        this.status = status;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AgentWalletRetrievePaymentResponse)) {
            return false;
        }
        AgentWalletRetrievePaymentResponse agentWalletRetrievePaymentResponse = (AgentWalletRetrievePaymentResponse) obj;
        return Intrinsics.areEqual(unknownFields(), agentWalletRetrievePaymentResponse.unknownFields()) && Intrinsics.areEqual(this.payment_id, agentWalletRetrievePaymentResponse.payment_id) && this.status == agentWalletRetrievePaymentResponse.status;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.payment_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Status status = this.status;
        int hashCode3 = hashCode2 + (status != null ? status.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ResponseMetadata.Builder builder = new ResponseMetadata.Builder(2);
        builder.errors = this.payment_id;
        builder.result = this.status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.payment_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "payment_id=", arrayList);
        }
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AgentWalletRetrievePaymentResponse{", "}", 0, null, null, 56);
    }
}
