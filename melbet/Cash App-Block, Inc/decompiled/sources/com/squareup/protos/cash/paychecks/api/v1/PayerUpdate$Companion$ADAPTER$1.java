package com.squareup.protos.cash.paychecks.api.v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PayerUpdate$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PayerUpdate((String) obj, (PayerOperation) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = PayerOperation.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PayerUpdate payerUpdate = (PayerUpdate) obj;
        reverseProtoWriter.getClass();
        payerUpdate.getClass();
        reverseProtoWriter.writeBytes(payerUpdate.unknownFields());
        PayerOperation.ADAPTER.encodeWithTag(reverseProtoWriter, 2, payerUpdate.f1323operation);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, payerUpdate.payer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PayerUpdate payerUpdate = (PayerUpdate) obj;
        payerUpdate.getClass();
        return PayerOperation.ADAPTER.encodedSizeWithTag(2, payerUpdate.f1323operation) + ProtoAdapter.STRING.encodedSizeWithTag(1, payerUpdate.payer_token) + payerUpdate.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PayerUpdate payerUpdate = (PayerUpdate) obj;
        payerUpdate.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = payerUpdate.payer_token;
        PayerOperation payerOperation = payerUpdate.f1323operation;
        byteString.getClass();
        return new PayerUpdate(str, payerOperation, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PayerUpdate payerUpdate = (PayerUpdate) obj;
        payerUpdate.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, payerUpdate.payer_token);
        PayerOperation.ADAPTER.encodeWithTag(protoWriter, 2, payerUpdate.f1323operation);
        protoWriter.writeBytes(payerUpdate.unknownFields());
    }
}
