package com.squareup.protos.cash.orderly.app_data;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InternallyCreatedOrder$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        String str = (String) obj;
        if (str != null) {
            return new InternallyCreatedOrder(str, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "order_id");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InternallyCreatedOrder internallyCreatedOrder = (InternallyCreatedOrder) obj;
        reverseProtoWriter.getClass();
        internallyCreatedOrder.getClass();
        reverseProtoWriter.writeBytes(internallyCreatedOrder.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, internallyCreatedOrder.order_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InternallyCreatedOrder internallyCreatedOrder = (InternallyCreatedOrder) obj;
        internallyCreatedOrder.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, internallyCreatedOrder.order_id) + internallyCreatedOrder.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InternallyCreatedOrder internallyCreatedOrder = (InternallyCreatedOrder) obj;
        internallyCreatedOrder.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = internallyCreatedOrder.order_id;
        str.getClass();
        byteString.getClass();
        return new InternallyCreatedOrder(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InternallyCreatedOrder internallyCreatedOrder = (InternallyCreatedOrder) obj;
        internallyCreatedOrder.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, internallyCreatedOrder.order_id);
        protoWriter.writeBytes(internallyCreatedOrder.unknownFields());
    }
}
