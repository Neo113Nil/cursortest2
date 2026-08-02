package com.squareup.protos.cash.paymenttemplate.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.nearby.api.v1.ConnectionData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreatePaymentTemplateResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CreatePaymentTemplateResponse((String) obj, (ConnectionData) obj2, (Long) obj3, (String) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(ConnectionData.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreatePaymentTemplateResponse createPaymentTemplateResponse = (CreatePaymentTemplateResponse) obj;
        reverseProtoWriter.getClass();
        createPaymentTemplateResponse.getClass();
        reverseProtoWriter.writeBytes(createPaymentTemplateResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, createPaymentTemplateResponse.payment_link_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, createPaymentTemplateResponse.whatsapp_share_url);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 3, createPaymentTemplateResponse.expired_at_millis);
        ConnectionData.ADAPTER.encodeWithTag(reverseProtoWriter, 2, createPaymentTemplateResponse.connection_data);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, createPaymentTemplateResponse.payment_template_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreatePaymentTemplateResponse createPaymentTemplateResponse = (CreatePaymentTemplateResponse) obj;
        createPaymentTemplateResponse.getClass();
        int size$okio = createPaymentTemplateResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, createPaymentTemplateResponse.payment_link_url) + protoAdapter.encodedSizeWithTag(4, createPaymentTemplateResponse.whatsapp_share_url) + ProtoAdapter.INT64.encodedSizeWithTag(3, createPaymentTemplateResponse.expired_at_millis) + ConnectionData.ADAPTER.encodedSizeWithTag(2, createPaymentTemplateResponse.connection_data) + protoAdapter.encodedSizeWithTag(1, createPaymentTemplateResponse.payment_template_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreatePaymentTemplateResponse createPaymentTemplateResponse = (CreatePaymentTemplateResponse) obj;
        createPaymentTemplateResponse.getClass();
        ConnectionData connectionData = createPaymentTemplateResponse.connection_data;
        ConnectionData connectionData2 = connectionData != null ? (ConnectionData) ConnectionData.ADAPTER.redact(connectionData) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = createPaymentTemplateResponse.payment_template_token;
        Long l = createPaymentTemplateResponse.expired_at_millis;
        byteString.getClass();
        return new CreatePaymentTemplateResponse(str, connectionData2, l, null, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreatePaymentTemplateResponse createPaymentTemplateResponse = (CreatePaymentTemplateResponse) obj;
        createPaymentTemplateResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, createPaymentTemplateResponse.payment_template_token);
        ConnectionData.ADAPTER.encodeWithTag(protoWriter, 2, createPaymentTemplateResponse.connection_data);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, createPaymentTemplateResponse.expired_at_millis);
        protoAdapter.encodeWithTag(protoWriter, 4, createPaymentTemplateResponse.whatsapp_share_url);
        protoAdapter.encodeWithTag(protoWriter, 5, createPaymentTemplateResponse.payment_link_url);
        protoWriter.writeBytes(createPaymentTemplateResponse.unknownFields());
    }
}
