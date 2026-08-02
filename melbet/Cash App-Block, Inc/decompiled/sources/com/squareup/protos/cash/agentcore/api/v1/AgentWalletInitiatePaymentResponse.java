package com.squareup.protos.cash.agentcore.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.idv.DisplayName;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/agentcore/api/v1/AgentWalletInitiatePaymentResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/idv/DisplayName$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AgentWalletInitiatePaymentResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AgentWalletInitiatePaymentResponse> CREATOR;
    public final String payment_id;

    static {
        AgentWalletInitiatePaymentResponse$Companion$ADAPTER$1 agentWalletInitiatePaymentResponse$Companion$ADAPTER$1 = new AgentWalletInitiatePaymentResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AgentWalletInitiatePaymentResponse.class), "type.googleapis.com/squareup.cash.agentcore.api.v1beta1.AgentWalletInitiatePaymentResponse", Syntax.PROTO_2, null, "squareup/cash/agentcore/api/v1beta1/agent_wallet_initiate_payment_messages.proto");
        ADAPTER = agentWalletInitiatePaymentResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(agentWalletInitiatePaymentResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentWalletInitiatePaymentResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.payment_id = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AgentWalletInitiatePaymentResponse)) {
            return false;
        }
        AgentWalletInitiatePaymentResponse agentWalletInitiatePaymentResponse = (AgentWalletInitiatePaymentResponse) obj;
        return Intrinsics.areEqual(unknownFields(), agentWalletInitiatePaymentResponse.unknownFields()) && Intrinsics.areEqual(this.payment_id, agentWalletInitiatePaymentResponse.payment_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.payment_id;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DisplayName.Builder builder = new DisplayName.Builder(16);
        builder.display_name = this.payment_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.payment_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "payment_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AgentWalletInitiatePaymentResponse{", "}", 0, null, null, 56);
    }
}
