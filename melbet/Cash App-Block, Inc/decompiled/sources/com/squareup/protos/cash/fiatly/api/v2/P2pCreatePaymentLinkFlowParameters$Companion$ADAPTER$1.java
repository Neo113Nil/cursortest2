package com.squareup.protos.cash.fiatly.api.v2;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.paymenttemplate.v1.CreationChannel;
import com.squareup.protos.cash.paymenttemplate.v1.TransactionCategory;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class P2pCreatePaymentLinkFlowParameters$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new P2pCreatePaymentLinkFlowParameters((Money) obj, (String) obj2, (TransactionCategory) obj3, (CreationChannel) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                try {
                    obj3 = TransactionCategory.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 4) {
                try {
                    obj4 = CreationChannel.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        P2pCreatePaymentLinkFlowParameters p2pCreatePaymentLinkFlowParameters = (P2pCreatePaymentLinkFlowParameters) obj;
        reverseProtoWriter.getClass();
        p2pCreatePaymentLinkFlowParameters.getClass();
        reverseProtoWriter.writeBytes(p2pCreatePaymentLinkFlowParameters.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, p2pCreatePaymentLinkFlowParameters.payment_getter_phone_number);
        CreationChannel.ADAPTER.encodeWithTag(reverseProtoWriter, 4, p2pCreatePaymentLinkFlowParameters.creation_channel);
        TransactionCategory.ADAPTER.encodeWithTag(reverseProtoWriter, 3, p2pCreatePaymentLinkFlowParameters.transaction_category);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, p2pCreatePaymentLinkFlowParameters.initiator_note);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 1, p2pCreatePaymentLinkFlowParameters.amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        P2pCreatePaymentLinkFlowParameters p2pCreatePaymentLinkFlowParameters = (P2pCreatePaymentLinkFlowParameters) obj;
        p2pCreatePaymentLinkFlowParameters.getClass();
        int encodedSizeWithTag = Money.ADAPTER.encodedSizeWithTag(1, p2pCreatePaymentLinkFlowParameters.amount) + p2pCreatePaymentLinkFlowParameters.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, p2pCreatePaymentLinkFlowParameters.payment_getter_phone_number) + CreationChannel.ADAPTER.encodedSizeWithTag(4, p2pCreatePaymentLinkFlowParameters.creation_channel) + TransactionCategory.ADAPTER.encodedSizeWithTag(3, p2pCreatePaymentLinkFlowParameters.transaction_category) + protoAdapter.encodedSizeWithTag(2, p2pCreatePaymentLinkFlowParameters.initiator_note) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        P2pCreatePaymentLinkFlowParameters p2pCreatePaymentLinkFlowParameters = (P2pCreatePaymentLinkFlowParameters) obj;
        p2pCreatePaymentLinkFlowParameters.getClass();
        Money money = p2pCreatePaymentLinkFlowParameters.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        TransactionCategory transactionCategory = p2pCreatePaymentLinkFlowParameters.transaction_category;
        CreationChannel creationChannel = p2pCreatePaymentLinkFlowParameters.creation_channel;
        byteString.getClass();
        return new P2pCreatePaymentLinkFlowParameters(money2, null, transactionCategory, creationChannel, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        P2pCreatePaymentLinkFlowParameters p2pCreatePaymentLinkFlowParameters = (P2pCreatePaymentLinkFlowParameters) obj;
        p2pCreatePaymentLinkFlowParameters.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 1, p2pCreatePaymentLinkFlowParameters.amount);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, p2pCreatePaymentLinkFlowParameters.initiator_note);
        TransactionCategory.ADAPTER.encodeWithTag(protoWriter, 3, p2pCreatePaymentLinkFlowParameters.transaction_category);
        CreationChannel.ADAPTER.encodeWithTag(protoWriter, 4, p2pCreatePaymentLinkFlowParameters.creation_channel);
        protoAdapter.encodeWithTag(protoWriter, 5, p2pCreatePaymentLinkFlowParameters.payment_getter_phone_number);
        protoWriter.writeBytes(p2pCreatePaymentLinkFlowParameters.unknownFields());
    }
}
