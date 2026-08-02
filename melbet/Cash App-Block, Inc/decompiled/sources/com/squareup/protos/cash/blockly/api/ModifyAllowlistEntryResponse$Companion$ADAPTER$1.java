package com.squareup.protos.cash.blockly.api;

import com.squareup.protos.cash.blockly.api.ModifyAllowlistEntryResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ModifyAllowlistEntryResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ModifyAllowlistEntryResponse((ModifyAllowlistEntryResponse.FailureReason) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = ModifyAllowlistEntryResponse.FailureReason.ADAPTER.decode(protoReader);
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
        ModifyAllowlistEntryResponse modifyAllowlistEntryResponse = (ModifyAllowlistEntryResponse) obj;
        reverseProtoWriter.getClass();
        modifyAllowlistEntryResponse.getClass();
        reverseProtoWriter.writeBytes(modifyAllowlistEntryResponse.unknownFields());
        ModifyAllowlistEntryResponse.FailureReason.ADAPTER.encodeWithTag(reverseProtoWriter, 1, modifyAllowlistEntryResponse.failureReason);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ModifyAllowlistEntryResponse modifyAllowlistEntryResponse = (ModifyAllowlistEntryResponse) obj;
        modifyAllowlistEntryResponse.getClass();
        return ModifyAllowlistEntryResponse.FailureReason.ADAPTER.encodedSizeWithTag(1, modifyAllowlistEntryResponse.failureReason) + modifyAllowlistEntryResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ModifyAllowlistEntryResponse modifyAllowlistEntryResponse = (ModifyAllowlistEntryResponse) obj;
        modifyAllowlistEntryResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        ModifyAllowlistEntryResponse.FailureReason failureReason = modifyAllowlistEntryResponse.failureReason;
        byteString.getClass();
        return new ModifyAllowlistEntryResponse(failureReason, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ModifyAllowlistEntryResponse modifyAllowlistEntryResponse = (ModifyAllowlistEntryResponse) obj;
        modifyAllowlistEntryResponse.getClass();
        ModifyAllowlistEntryResponse.FailureReason.ADAPTER.encodeWithTag(protoWriter, 1, modifyAllowlistEntryResponse.failureReason);
        protoWriter.writeBytes(modifyAllowlistEntryResponse.unknownFields());
    }
}
