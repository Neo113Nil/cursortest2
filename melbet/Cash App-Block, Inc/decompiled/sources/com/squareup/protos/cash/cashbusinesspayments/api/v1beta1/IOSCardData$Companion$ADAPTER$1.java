package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class IOSCardData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new IOSCardData((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        IOSCardData iOSCardData = (IOSCardData) obj;
        reverseProtoWriter.getClass();
        iOSCardData.getClass();
        reverseProtoWriter.writeBytes(iOSCardData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, iOSCardData.payment_card_data);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, iOSCardData.general_card_data);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        IOSCardData iOSCardData = (IOSCardData) obj;
        iOSCardData.getClass();
        int size$okio = iOSCardData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, iOSCardData.payment_card_data) + protoAdapter.encodedSizeWithTag(1, iOSCardData.general_card_data) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((IOSCardData) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new IOSCardData(null, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        IOSCardData iOSCardData = (IOSCardData) obj;
        iOSCardData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, iOSCardData.general_card_data);
        protoAdapter.encodeWithTag(protoWriter, 2, iOSCardData.payment_card_data);
        protoWriter.writeBytes(iOSCardData.unknownFields());
    }
}
