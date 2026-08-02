package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AndroidCardData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new AndroidCardData((ByteString) obj, (ByteString) obj2, (ByteString) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BYTES.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BYTES.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.BYTES.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AndroidCardData androidCardData = (AndroidCardData) obj;
        reverseProtoWriter.getClass();
        androidCardData.getClass();
        reverseProtoWriter.writeBytes(androidCardData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, androidCardData.hmac_pan);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, androidCardData.encryption_iv);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, androidCardData.encrypted_pan_data);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AndroidCardData androidCardData = (AndroidCardData) obj;
        androidCardData.getClass();
        int size$okio = androidCardData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
        return protoAdapter.encodedSizeWithTag(3, androidCardData.hmac_pan) + protoAdapter.encodedSizeWithTag(2, androidCardData.encryption_iv) + protoAdapter.encodedSizeWithTag(1, androidCardData.encrypted_pan_data) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((AndroidCardData) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AndroidCardData(null, null, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AndroidCardData androidCardData = (AndroidCardData) obj;
        androidCardData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
        protoAdapter.encodeWithTag(protoWriter, 1, androidCardData.encrypted_pan_data);
        protoAdapter.encodeWithTag(protoWriter, 2, androidCardData.encryption_iv);
        protoAdapter.encodeWithTag(protoWriter, 3, androidCardData.hmac_pan);
        protoWriter.writeBytes(androidCardData.unknownFields());
    }
}
