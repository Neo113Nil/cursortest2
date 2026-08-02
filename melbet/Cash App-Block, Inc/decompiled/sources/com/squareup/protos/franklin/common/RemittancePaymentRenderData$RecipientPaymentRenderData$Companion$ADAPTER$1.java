package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.common.RemittancePaymentRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class RemittancePaymentRenderData$RecipientPaymentRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RemittancePaymentRenderData.RecipientPaymentRenderData((String) obj, (GlobalAddress) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(GlobalAddress.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RemittancePaymentRenderData.RecipientPaymentRenderData recipientPaymentRenderData = (RemittancePaymentRenderData.RecipientPaymentRenderData) obj;
        reverseProtoWriter.getClass();
        recipientPaymentRenderData.getClass();
        reverseProtoWriter.writeBytes(recipientPaymentRenderData.unknownFields());
        GlobalAddress.ADAPTER.encodeWithTag(reverseProtoWriter, 2, recipientPaymentRenderData.address);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, recipientPaymentRenderData.phone_number);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RemittancePaymentRenderData.RecipientPaymentRenderData recipientPaymentRenderData = (RemittancePaymentRenderData.RecipientPaymentRenderData) obj;
        recipientPaymentRenderData.getClass();
        return GlobalAddress.ADAPTER.encodedSizeWithTag(2, recipientPaymentRenderData.address) + ProtoAdapter.STRING.encodedSizeWithTag(1, recipientPaymentRenderData.phone_number) + recipientPaymentRenderData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RemittancePaymentRenderData.RecipientPaymentRenderData recipientPaymentRenderData = (RemittancePaymentRenderData.RecipientPaymentRenderData) obj;
        recipientPaymentRenderData.getClass();
        GlobalAddress globalAddress = recipientPaymentRenderData.address;
        GlobalAddress globalAddress2 = globalAddress != null ? (GlobalAddress) GlobalAddress.ADAPTER.redact(globalAddress) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RemittancePaymentRenderData.RecipientPaymentRenderData(null, globalAddress2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RemittancePaymentRenderData.RecipientPaymentRenderData recipientPaymentRenderData = (RemittancePaymentRenderData.RecipientPaymentRenderData) obj;
        recipientPaymentRenderData.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, recipientPaymentRenderData.phone_number);
        GlobalAddress.ADAPTER.encodeWithTag(protoWriter, 2, recipientPaymentRenderData.address);
        protoWriter.writeBytes(recipientPaymentRenderData.unknownFields());
    }
}
