package com.squareup.protos.cash.cashapproxy.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ChangeApPaymentMethodResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ChangeApPaymentMethodResponse((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ChangeApPaymentMethodResponse changeApPaymentMethodResponse = (ChangeApPaymentMethodResponse) obj;
        reverseProtoWriter.getClass();
        changeApPaymentMethodResponse.getClass();
        reverseProtoWriter.writeBytes(changeApPaymentMethodResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, changeApPaymentMethodResponse.not_changeable_reason);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, changeApPaymentMethodResponse.payment_method_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, changeApPaymentMethodResponse.order_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ChangeApPaymentMethodResponse changeApPaymentMethodResponse = (ChangeApPaymentMethodResponse) obj;
        changeApPaymentMethodResponse.getClass();
        int size$okio = changeApPaymentMethodResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, changeApPaymentMethodResponse.not_changeable_reason) + protoAdapter.encodedSizeWithTag(2, changeApPaymentMethodResponse.payment_method_id) + protoAdapter.encodedSizeWithTag(1, changeApPaymentMethodResponse.order_id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ChangeApPaymentMethodResponse changeApPaymentMethodResponse = (ChangeApPaymentMethodResponse) obj;
        changeApPaymentMethodResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = changeApPaymentMethodResponse.order_id;
        String str2 = changeApPaymentMethodResponse.payment_method_id;
        String str3 = changeApPaymentMethodResponse.not_changeable_reason;
        byteString.getClass();
        return new ChangeApPaymentMethodResponse(str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ChangeApPaymentMethodResponse changeApPaymentMethodResponse = (ChangeApPaymentMethodResponse) obj;
        changeApPaymentMethodResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, changeApPaymentMethodResponse.order_id);
        protoAdapter.encodeWithTag(protoWriter, 2, changeApPaymentMethodResponse.payment_method_id);
        protoAdapter.encodeWithTag(protoWriter, 3, changeApPaymentMethodResponse.not_changeable_reason);
        protoWriter.writeBytes(changeApPaymentMethodResponse.unknownFields());
    }
}
