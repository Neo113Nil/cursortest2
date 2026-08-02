package com.squareup.protos.wire.roster.mds;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Name$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Name((ScriptScope$Script) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = ScriptScope$Script.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Name name = (Name) obj;
        reverseProtoWriter.getClass();
        name.getClass();
        reverseProtoWriter.writeBytes(name.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, name.value);
        ScriptScope$Script.ADAPTER.encodeWithTag(reverseProtoWriter, 1, name.script);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Name name = (Name) obj;
        name.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, name.value) + ScriptScope$Script.ADAPTER.encodedSizeWithTag(1, name.script) + name.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Name name = (Name) obj;
        name.getClass();
        ByteString byteString = ByteString.EMPTY;
        ScriptScope$Script scriptScope$Script = name.script;
        byteString.getClass();
        return new Name(scriptScope$Script, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Name name = (Name) obj;
        name.getClass();
        ScriptScope$Script.ADAPTER.encodeWithTag(protoWriter, 1, name.script);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, name.value);
        protoWriter.writeBytes(name.unknownFields());
    }
}
