package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.InvestPaymentRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class InvestPaymentRenderData$SenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InvestPaymentRenderData.SenderData((InvestPaymentRenderData.SenderData.Status) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = InvestPaymentRenderData.SenderData.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InvestPaymentRenderData.SenderData senderData = (InvestPaymentRenderData.SenderData) obj;
        reverseProtoWriter.getClass();
        senderData.getClass();
        reverseProtoWriter.writeBytes(senderData.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, senderData.shares);
        InvestPaymentRenderData.SenderData.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, senderData.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InvestPaymentRenderData.SenderData senderData = (InvestPaymentRenderData.SenderData) obj;
        senderData.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, senderData.shares) + InvestPaymentRenderData.SenderData.Status.ADAPTER.encodedSizeWithTag(1, senderData.status) + senderData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InvestPaymentRenderData.SenderData senderData = (InvestPaymentRenderData.SenderData) obj;
        senderData.getClass();
        ByteString byteString = ByteString.EMPTY;
        InvestPaymentRenderData.SenderData.Status status = senderData.status;
        String str = senderData.shares;
        byteString.getClass();
        return new InvestPaymentRenderData.SenderData(status, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InvestPaymentRenderData.SenderData senderData = (InvestPaymentRenderData.SenderData) obj;
        senderData.getClass();
        InvestPaymentRenderData.SenderData.Status.ADAPTER.encodeWithTag(protoWriter, 1, senderData.status);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, senderData.shares);
        protoWriter.writeBytes(senderData.unknownFields());
    }
}
