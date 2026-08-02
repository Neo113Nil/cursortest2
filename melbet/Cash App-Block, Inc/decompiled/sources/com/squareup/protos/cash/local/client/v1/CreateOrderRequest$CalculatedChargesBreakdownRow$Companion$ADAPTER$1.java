package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.CreateOrderRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreateOrderRequest$CalculatedChargesBreakdownRow$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreateOrderRequest.CalculatedChargesBreakdownRow((String) obj, (LocalMoney) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreateOrderRequest.CalculatedChargesBreakdownRow calculatedChargesBreakdownRow = (CreateOrderRequest.CalculatedChargesBreakdownRow) obj;
        reverseProtoWriter.getClass();
        calculatedChargesBreakdownRow.getClass();
        reverseProtoWriter.writeBytes(calculatedChargesBreakdownRow.unknownFields());
        LocalMoney.ADAPTER.encodeWithTag(reverseProtoWriter, 2, calculatedChargesBreakdownRow.amount);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, calculatedChargesBreakdownRow.identifier);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreateOrderRequest.CalculatedChargesBreakdownRow calculatedChargesBreakdownRow = (CreateOrderRequest.CalculatedChargesBreakdownRow) obj;
        calculatedChargesBreakdownRow.getClass();
        return LocalMoney.ADAPTER.encodedSizeWithTag(2, calculatedChargesBreakdownRow.amount) + ProtoAdapter.STRING.encodedSizeWithTag(1, calculatedChargesBreakdownRow.identifier) + calculatedChargesBreakdownRow.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateOrderRequest.CalculatedChargesBreakdownRow calculatedChargesBreakdownRow = (CreateOrderRequest.CalculatedChargesBreakdownRow) obj;
        calculatedChargesBreakdownRow.getClass();
        LocalMoney localMoney = calculatedChargesBreakdownRow.amount;
        LocalMoney localMoney2 = localMoney != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = calculatedChargesBreakdownRow.identifier;
        byteString.getClass();
        return new CreateOrderRequest.CalculatedChargesBreakdownRow(str, localMoney2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateOrderRequest.CalculatedChargesBreakdownRow calculatedChargesBreakdownRow = (CreateOrderRequest.CalculatedChargesBreakdownRow) obj;
        calculatedChargesBreakdownRow.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, calculatedChargesBreakdownRow.identifier);
        LocalMoney.ADAPTER.encodeWithTag(protoWriter, 2, calculatedChargesBreakdownRow.amount);
        protoWriter.writeBytes(calculatedChargesBreakdownRow.unknownFields());
    }
}
