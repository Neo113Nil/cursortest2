package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreateReceiptResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreateReceiptResponse((String) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreateReceiptResponse createReceiptResponse = (CreateReceiptResponse) obj;
        reverseProtoWriter.getClass();
        createReceiptResponse.getClass();
        reverseProtoWriter.writeBytes(createReceiptResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, createReceiptResponse.receipt_sent_to);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, createReceiptResponse.receipt_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreateReceiptResponse createReceiptResponse = (CreateReceiptResponse) obj;
        createReceiptResponse.getClass();
        int size$okio = createReceiptResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.asRepeated().encodedSizeWithTag(2, createReceiptResponse.receipt_sent_to) + protoAdapter.encodedSizeWithTag(1, createReceiptResponse.receipt_url) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateReceiptResponse createReceiptResponse = (CreateReceiptResponse) obj;
        createReceiptResponse.getClass();
        EmptyList emptyList = EmptyList.INSTANCE;
        ByteString byteString = ByteString.EMPTY;
        String str = createReceiptResponse.receipt_url;
        emptyList.getClass();
        byteString.getClass();
        return new CreateReceiptResponse(str, emptyList, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateReceiptResponse createReceiptResponse = (CreateReceiptResponse) obj;
        createReceiptResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, createReceiptResponse.receipt_url);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, createReceiptResponse.receipt_sent_to);
        protoWriter.writeBytes(createReceiptResponse.unknownFields());
    }
}
