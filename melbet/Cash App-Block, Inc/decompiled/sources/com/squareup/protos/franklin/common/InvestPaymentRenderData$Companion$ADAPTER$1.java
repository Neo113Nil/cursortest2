package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.InvestPaymentRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class InvestPaymentRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InvestPaymentRenderData((InvestmentEntityRenderData) obj, (String) obj2, (InvestPaymentRenderData.RecipientData) obj3, (InvestPaymentRenderData.SenderData) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(InvestmentEntityRenderData.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj3 = TransactorKt.decodeMessageOrMerge(InvestPaymentRenderData.RecipientData.ADAPTER, protoReader, obj3);
            } else if (nextTag == 3) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(InvestPaymentRenderData.SenderData.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InvestPaymentRenderData investPaymentRenderData = (InvestPaymentRenderData) obj;
        reverseProtoWriter.getClass();
        investPaymentRenderData.getClass();
        reverseProtoWriter.writeBytes(investPaymentRenderData.unknownFields());
        InvestPaymentRenderData.SenderData.ADAPTER.encodeWithTag(reverseProtoWriter, 4, investPaymentRenderData.sender_data);
        InvestPaymentRenderData.RecipientData.ADAPTER.encodeWithTag(reverseProtoWriter, 2, investPaymentRenderData.recipient_data);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, investPaymentRenderData.invest_payment_identifier);
        InvestmentEntityRenderData.ADAPTER.encodeWithTag(reverseProtoWriter, 1, investPaymentRenderData.investment_entity_render_data);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InvestPaymentRenderData investPaymentRenderData = (InvestPaymentRenderData) obj;
        investPaymentRenderData.getClass();
        return InvestPaymentRenderData.SenderData.ADAPTER.encodedSizeWithTag(4, investPaymentRenderData.sender_data) + InvestPaymentRenderData.RecipientData.ADAPTER.encodedSizeWithTag(2, investPaymentRenderData.recipient_data) + ProtoAdapter.STRING.encodedSizeWithTag(3, investPaymentRenderData.invest_payment_identifier) + InvestmentEntityRenderData.ADAPTER.encodedSizeWithTag(1, investPaymentRenderData.investment_entity_render_data) + investPaymentRenderData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InvestPaymentRenderData investPaymentRenderData = (InvestPaymentRenderData) obj;
        investPaymentRenderData.getClass();
        InvestmentEntityRenderData investmentEntityRenderData = investPaymentRenderData.investment_entity_render_data;
        InvestmentEntityRenderData investmentEntityRenderData2 = investmentEntityRenderData != null ? (InvestmentEntityRenderData) InvestmentEntityRenderData.ADAPTER.redact(investmentEntityRenderData) : null;
        InvestPaymentRenderData.RecipientData recipientData = investPaymentRenderData.recipient_data;
        InvestPaymentRenderData.RecipientData recipientData2 = recipientData != null ? (InvestPaymentRenderData.RecipientData) InvestPaymentRenderData.RecipientData.ADAPTER.redact(recipientData) : null;
        InvestPaymentRenderData.SenderData senderData = investPaymentRenderData.sender_data;
        InvestPaymentRenderData.SenderData senderData2 = senderData != null ? (InvestPaymentRenderData.SenderData) InvestPaymentRenderData.SenderData.ADAPTER.redact(senderData) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = investPaymentRenderData.invest_payment_identifier;
        byteString.getClass();
        return new InvestPaymentRenderData(investmentEntityRenderData2, str, recipientData2, senderData2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InvestPaymentRenderData investPaymentRenderData = (InvestPaymentRenderData) obj;
        investPaymentRenderData.getClass();
        InvestmentEntityRenderData.ADAPTER.encodeWithTag(protoWriter, 1, investPaymentRenderData.investment_entity_render_data);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, investPaymentRenderData.invest_payment_identifier);
        InvestPaymentRenderData.RecipientData.ADAPTER.encodeWithTag(protoWriter, 2, investPaymentRenderData.recipient_data);
        InvestPaymentRenderData.SenderData.ADAPTER.encodeWithTag(protoWriter, 4, investPaymentRenderData.sender_data);
        protoWriter.writeBytes(investPaymentRenderData.unknownFields());
    }
}
