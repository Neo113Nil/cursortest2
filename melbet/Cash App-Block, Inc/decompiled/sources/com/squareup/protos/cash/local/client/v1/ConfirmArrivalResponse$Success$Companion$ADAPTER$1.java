package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.ConfirmArrivalResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ConfirmArrivalResponse$Success$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ConfirmArrivalResponse.Success((LocalOrder) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalOrder.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ConfirmArrivalResponse.Success success = (ConfirmArrivalResponse.Success) obj;
        reverseProtoWriter.getClass();
        success.getClass();
        reverseProtoWriter.writeBytes(success.unknownFields());
        LocalOrder.ADAPTER.encodeWithTag(reverseProtoWriter, 1, success.order);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ConfirmArrivalResponse.Success success = (ConfirmArrivalResponse.Success) obj;
        success.getClass();
        return LocalOrder.ADAPTER.encodedSizeWithTag(1, success.order) + success.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ConfirmArrivalResponse.Success success = (ConfirmArrivalResponse.Success) obj;
        success.getClass();
        LocalOrder localOrder = success.order;
        LocalOrder localOrder2 = localOrder != null ? (LocalOrder) LocalOrder.ADAPTER.redact(localOrder) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ConfirmArrivalResponse.Success(localOrder2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ConfirmArrivalResponse.Success success = (ConfirmArrivalResponse.Success) obj;
        success.getClass();
        LocalOrder.ADAPTER.encodeWithTag(protoWriter, 1, success.order);
        protoWriter.writeBytes(success.unknownFields());
    }
}
