package com.squareup.protos.cash.local.client.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalMenuItemOptionValue$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new LocalMenuItemOptionValue((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalMenuItemOptionValue localMenuItemOptionValue = (LocalMenuItemOptionValue) obj;
        reverseProtoWriter.getClass();
        localMenuItemOptionValue.getClass();
        reverseProtoWriter.writeBytes(localMenuItemOptionValue.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, localMenuItemOptionValue.option_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, localMenuItemOptionValue.option_value_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, localMenuItemOptionValue.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalMenuItemOptionValue localMenuItemOptionValue = (LocalMenuItemOptionValue) obj;
        localMenuItemOptionValue.getClass();
        int size$okio = localMenuItemOptionValue.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, localMenuItemOptionValue.option_name) + protoAdapter.encodedSizeWithTag(4, localMenuItemOptionValue.option_value_name) + protoAdapter.encodedSizeWithTag(1, localMenuItemOptionValue.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalMenuItemOptionValue localMenuItemOptionValue = (LocalMenuItemOptionValue) obj;
        localMenuItemOptionValue.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = localMenuItemOptionValue.token;
        String str2 = localMenuItemOptionValue.option_value_name;
        String str3 = localMenuItemOptionValue.option_name;
        byteString.getClass();
        return new LocalMenuItemOptionValue(str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalMenuItemOptionValue localMenuItemOptionValue = (LocalMenuItemOptionValue) obj;
        localMenuItemOptionValue.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, localMenuItemOptionValue.token);
        protoAdapter.encodeWithTag(protoWriter, 4, localMenuItemOptionValue.option_value_name);
        protoAdapter.encodeWithTag(protoWriter, 5, localMenuItemOptionValue.option_name);
        protoWriter.writeBytes(localMenuItemOptionValue.unknownFields());
    }
}
