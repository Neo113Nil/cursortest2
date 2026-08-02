package com.squareup.protos.wire.roster.mds;

import androidx.room.TransactorKt;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ScriptAddress$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ScriptAddress((GlobalAddress) obj, (ScriptScope$Script) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(GlobalAddress.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = ScriptScope$Script.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ScriptAddress scriptAddress = (ScriptAddress) obj;
        reverseProtoWriter.getClass();
        scriptAddress.getClass();
        reverseProtoWriter.writeBytes(scriptAddress.unknownFields());
        ScriptScope$Script.ADAPTER.encodeWithTag(reverseProtoWriter, 2, scriptAddress.script);
        GlobalAddress.ADAPTER.encodeWithTag(reverseProtoWriter, 1, scriptAddress.address);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ScriptAddress scriptAddress = (ScriptAddress) obj;
        scriptAddress.getClass();
        return ScriptScope$Script.ADAPTER.encodedSizeWithTag(2, scriptAddress.script) + GlobalAddress.ADAPTER.encodedSizeWithTag(1, scriptAddress.address) + scriptAddress.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ScriptAddress scriptAddress = (ScriptAddress) obj;
        scriptAddress.getClass();
        GlobalAddress globalAddress = scriptAddress.address;
        GlobalAddress globalAddress2 = globalAddress != null ? (GlobalAddress) GlobalAddress.ADAPTER.redact(globalAddress) : null;
        ByteString byteString = ByteString.EMPTY;
        ScriptScope$Script scriptScope$Script = scriptAddress.script;
        byteString.getClass();
        return new ScriptAddress(globalAddress2, scriptScope$Script, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ScriptAddress scriptAddress = (ScriptAddress) obj;
        scriptAddress.getClass();
        GlobalAddress.ADAPTER.encodeWithTag(protoWriter, 1, scriptAddress.address);
        ScriptScope$Script.ADAPTER.encodeWithTag(protoWriter, 2, scriptAddress.script);
        protoWriter.writeBytes(scriptAddress.unknownFields());
    }
}
