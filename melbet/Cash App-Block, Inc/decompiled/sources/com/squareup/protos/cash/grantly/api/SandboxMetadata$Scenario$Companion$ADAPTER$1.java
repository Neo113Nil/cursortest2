package com.squareup.protos.cash.grantly.api;

import com.squareup.protos.cash.api.sandbox.MagicValue;
import com.squareup.protos.cash.grantly.api.SandboxMetadata;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SandboxMetadata$Scenario$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SandboxMetadata.Scenario((MagicValue) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = MagicValue.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SandboxMetadata.Scenario scenario = (SandboxMetadata.Scenario) obj;
        reverseProtoWriter.getClass();
        scenario.getClass();
        reverseProtoWriter.writeBytes(scenario.unknownFields());
        MagicValue.ADAPTER.encodeWithTag(reverseProtoWriter, 1, scenario.magic_value);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SandboxMetadata.Scenario scenario = (SandboxMetadata.Scenario) obj;
        scenario.getClass();
        return MagicValue.ADAPTER.encodedSizeWithTag(1, scenario.magic_value) + scenario.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SandboxMetadata.Scenario scenario = (SandboxMetadata.Scenario) obj;
        scenario.getClass();
        ByteString byteString = ByteString.EMPTY;
        MagicValue magicValue = scenario.magic_value;
        byteString.getClass();
        return new SandboxMetadata.Scenario(magicValue, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SandboxMetadata.Scenario scenario = (SandboxMetadata.Scenario) obj;
        scenario.getClass();
        MagicValue.ADAPTER.encodeWithTag(protoWriter, 1, scenario.magic_value);
        protoWriter.writeBytes(scenario.unknownFields());
    }
}
