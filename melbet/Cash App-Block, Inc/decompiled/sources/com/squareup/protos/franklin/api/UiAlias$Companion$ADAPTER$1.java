package com.squareup.protos.franklin.api;

import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiAlias$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new UiAlias((UiAlias.Type) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = UiAlias.Type.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
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
        UiAlias uiAlias = (UiAlias) obj;
        reverseProtoWriter.getClass();
        uiAlias.getClass();
        reverseProtoWriter.writeBytes(uiAlias.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, uiAlias.formatted);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, uiAlias.canonical_text);
        UiAlias.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 1, uiAlias.f1363type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiAlias uiAlias = (UiAlias) obj;
        uiAlias.getClass();
        int encodedSizeWithTag = UiAlias.Type.ADAPTER.encodedSizeWithTag(1, uiAlias.f1363type) + uiAlias.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, uiAlias.formatted) + protoAdapter.encodedSizeWithTag(2, uiAlias.canonical_text) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiAlias uiAlias = (UiAlias) obj;
        uiAlias.getClass();
        ByteString byteString = ByteString.EMPTY;
        UiAlias.Type type2 = uiAlias.f1363type;
        byteString.getClass();
        return new UiAlias(type2, null, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiAlias uiAlias = (UiAlias) obj;
        uiAlias.getClass();
        UiAlias.Type.ADAPTER.encodeWithTag(protoWriter, 1, uiAlias.f1363type);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, uiAlias.canonical_text);
        protoAdapter.encodeWithTag(protoWriter, 3, uiAlias.formatted);
        protoWriter.writeBytes(uiAlias.unknownFields());
    }
}
