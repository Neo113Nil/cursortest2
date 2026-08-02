package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.LocalStoredInstrument;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalStoredInstrument$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new LocalStoredInstrument((String) obj, (LocalStoredInstrument.Type) obj2, (String) obj3, (String) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = LocalStoredInstrument.Type.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
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
        LocalStoredInstrument localStoredInstrument = (LocalStoredInstrument) obj;
        reverseProtoWriter.getClass();
        localStoredInstrument.getClass();
        reverseProtoWriter.writeBytes(localStoredInstrument.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, localStoredInstrument.finplat_instrument_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, localStoredInstrument.display_brand);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, localStoredInstrument.display_name);
        LocalStoredInstrument.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 2, localStoredInstrument.f1314type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, localStoredInstrument.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalStoredInstrument localStoredInstrument = (LocalStoredInstrument) obj;
        localStoredInstrument.getClass();
        int size$okio = localStoredInstrument.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, localStoredInstrument.finplat_instrument_token) + protoAdapter.encodedSizeWithTag(4, localStoredInstrument.display_brand) + protoAdapter.encodedSizeWithTag(3, localStoredInstrument.display_name) + LocalStoredInstrument.Type.ADAPTER.encodedSizeWithTag(2, localStoredInstrument.f1314type) + protoAdapter.encodedSizeWithTag(1, localStoredInstrument.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalStoredInstrument localStoredInstrument = (LocalStoredInstrument) obj;
        localStoredInstrument.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = localStoredInstrument.token;
        LocalStoredInstrument.Type type2 = localStoredInstrument.f1314type;
        String str2 = localStoredInstrument.display_name;
        String str3 = localStoredInstrument.display_brand;
        String str4 = localStoredInstrument.finplat_instrument_token;
        byteString.getClass();
        return new LocalStoredInstrument(str, type2, str2, str3, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalStoredInstrument localStoredInstrument = (LocalStoredInstrument) obj;
        localStoredInstrument.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, localStoredInstrument.token);
        LocalStoredInstrument.Type.ADAPTER.encodeWithTag(protoWriter, 2, localStoredInstrument.f1314type);
        protoAdapter.encodeWithTag(protoWriter, 3, localStoredInstrument.display_name);
        protoAdapter.encodeWithTag(protoWriter, 4, localStoredInstrument.display_brand);
        protoAdapter.encodeWithTag(protoWriter, 5, localStoredInstrument.finplat_instrument_token);
        protoWriter.writeBytes(localStoredInstrument.unknownFields());
    }
}
