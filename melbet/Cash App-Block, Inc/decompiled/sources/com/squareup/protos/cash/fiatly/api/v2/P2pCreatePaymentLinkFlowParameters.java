package com.squareup.protos.cash.fiatly.api.v2;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.paymenttemplate.v1.CreationChannel;
import com.squareup.protos.cash.paymenttemplate.v1.TransactionCategory;
import com.squareup.protos.common.Money;
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
public final class P2pCreatePaymentLinkFlowParameters extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<P2pCreatePaymentLinkFlowParameters> CREATOR;
    public final Money amount;
    public final CreationChannel creation_channel;
    public final String initiator_note;
    public final String payment_getter_phone_number;
    public final TransactionCategory transaction_category;

    static {
        P2pCreatePaymentLinkFlowParameters$Companion$ADAPTER$1 p2pCreatePaymentLinkFlowParameters$Companion$ADAPTER$1 = new P2pCreatePaymentLinkFlowParameters$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(P2pCreatePaymentLinkFlowParameters.class), "type.googleapis.com/squareup.cash.fiatly.api.v2beta.P2pCreatePaymentLinkFlowParameters", Syntax.PROTO_2, null, "squareup/cash/fiatly/api/v2beta/p2p_create_payment_link_flow.proto");
        ADAPTER = p2pCreatePaymentLinkFlowParameters$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(p2pCreatePaymentLinkFlowParameters$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2pCreatePaymentLinkFlowParameters(Money money, String str, TransactionCategory transactionCategory, CreationChannel creationChannel, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.amount = money;
        this.initiator_note = str;
        this.transaction_category = transactionCategory;
        this.creation_channel = creationChannel;
        this.payment_getter_phone_number = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof P2pCreatePaymentLinkFlowParameters)) {
            return false;
        }
        P2pCreatePaymentLinkFlowParameters p2pCreatePaymentLinkFlowParameters = (P2pCreatePaymentLinkFlowParameters) obj;
        return Intrinsics.areEqual(unknownFields(), p2pCreatePaymentLinkFlowParameters.unknownFields()) && Intrinsics.areEqual(this.amount, p2pCreatePaymentLinkFlowParameters.amount) && Intrinsics.areEqual(this.initiator_note, p2pCreatePaymentLinkFlowParameters.initiator_note) && this.transaction_category == p2pCreatePaymentLinkFlowParameters.transaction_category && this.creation_channel == p2pCreatePaymentLinkFlowParameters.creation_channel && Intrinsics.areEqual(this.payment_getter_phone_number, p2pCreatePaymentLinkFlowParameters.payment_getter_phone_number);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Money money = this.amount;
        int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
        String str = this.initiator_note;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        TransactionCategory transactionCategory = this.transaction_category;
        int hashCode4 = (hashCode3 + (transactionCategory != null ? transactionCategory.hashCode() : 0)) * 37;
        CreationChannel creationChannel = this.creation_channel;
        int hashCode5 = (hashCode4 + (creationChannel != null ? creationChannel.hashCode() : 0)) * 37;
        String str2 = this.payment_getter_phone_number;
        int hashCode6 = hashCode5 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Text.Builder builder = new Text.Builder(6);
        builder.text_style = this.amount;
        builder.text = this.initiator_note;
        builder.text_decoration = this.transaction_category;
        builder.text_color = this.creation_channel;
        builder.icon = this.payment_getter_phone_number;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        if (this.initiator_note != null) {
            arrayList.add("initiator_note=██");
        }
        TransactionCategory transactionCategory = this.transaction_category;
        if (transactionCategory != null) {
            arrayList.add("transaction_category=" + transactionCategory);
        }
        CreationChannel creationChannel = this.creation_channel;
        if (creationChannel != null) {
            arrayList.add("creation_channel=" + creationChannel);
        }
        if (this.payment_getter_phone_number != null) {
            arrayList.add("payment_getter_phone_number=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "P2pCreatePaymentLinkFlowParameters{", "}", 0, null, null, 56);
    }
}
