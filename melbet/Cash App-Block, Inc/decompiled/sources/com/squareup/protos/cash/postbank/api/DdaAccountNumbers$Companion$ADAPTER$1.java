package com.squareup.protos.cash.postbank.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DdaAccountNumbers$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DdaAccountNumbers((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        DdaAccountNumbers ddaAccountNumbers = (DdaAccountNumbers) obj;
        reverseProtoWriter.getClass();
        ddaAccountNumbers.getClass();
        reverseProtoWriter.writeBytes(ddaAccountNumbers.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, ddaAccountNumbers.routing_number);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, ddaAccountNumbers.account_number);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DdaAccountNumbers ddaAccountNumbers = (DdaAccountNumbers) obj;
        ddaAccountNumbers.getClass();
        int size$okio = ddaAccountNumbers.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, ddaAccountNumbers.routing_number) + protoAdapter.encodedSizeWithTag(1, ddaAccountNumbers.account_number) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((DdaAccountNumbers) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new DdaAccountNumbers(null, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DdaAccountNumbers ddaAccountNumbers = (DdaAccountNumbers) obj;
        ddaAccountNumbers.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, ddaAccountNumbers.account_number);
        protoAdapter.encodeWithTag(protoWriter, 2, ddaAccountNumbers.routing_number);
        protoWriter.writeBytes(ddaAccountNumbers.unknownFields());
    }
}
