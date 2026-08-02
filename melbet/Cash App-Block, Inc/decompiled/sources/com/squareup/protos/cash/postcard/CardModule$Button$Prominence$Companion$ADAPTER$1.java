package com.squareup.protos.cash.postcard;

import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardModule$Button$Prominence$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule.Button.Prominence((CardModule.Button.Prominence.Type) obj, (Boolean) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = CardModule.Button.Prominence.Type.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.Button.Prominence prominence = (CardModule.Button.Prominence) obj;
        reverseProtoWriter.getClass();
        prominence.getClass();
        reverseProtoWriter.writeBytes(prominence.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, prominence.is_destructive);
        CardModule.Button.Prominence.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 1, prominence.f1330type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardModule.Button.Prominence prominence = (CardModule.Button.Prominence) obj;
        prominence.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(2, prominence.is_destructive) + CardModule.Button.Prominence.Type.ADAPTER.encodedSizeWithTag(1, prominence.f1330type) + prominence.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.Button.Prominence prominence = (CardModule.Button.Prominence) obj;
        prominence.getClass();
        ByteString byteString = ByteString.EMPTY;
        CardModule.Button.Prominence.Type type2 = prominence.f1330type;
        Boolean bool = prominence.is_destructive;
        byteString.getClass();
        return new CardModule.Button.Prominence(type2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.Button.Prominence prominence = (CardModule.Button.Prominence) obj;
        prominence.getClass();
        CardModule.Button.Prominence.Type.ADAPTER.encodeWithTag(protoWriter, 1, prominence.f1330type);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, prominence.is_destructive);
        protoWriter.writeBytes(prominence.unknownFields());
    }
}
