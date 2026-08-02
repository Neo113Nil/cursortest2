package com.squareup.protos.cash.janus.api;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreateSecondaryPersonalAccountFlowParams$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreateSecondaryPersonalAccountFlowParams((CreateSecondaryPersonalAccountEntryPoint) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = CreateSecondaryPersonalAccountEntryPoint.ADAPTER.decode(protoReader);
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
        CreateSecondaryPersonalAccountFlowParams createSecondaryPersonalAccountFlowParams = (CreateSecondaryPersonalAccountFlowParams) obj;
        reverseProtoWriter.getClass();
        createSecondaryPersonalAccountFlowParams.getClass();
        reverseProtoWriter.writeBytes(createSecondaryPersonalAccountFlowParams.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, createSecondaryPersonalAccountFlowParams.flow_token);
        CreateSecondaryPersonalAccountEntryPoint.ADAPTER.encodeWithTag(reverseProtoWriter, 1, createSecondaryPersonalAccountFlowParams.entry_point);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreateSecondaryPersonalAccountFlowParams createSecondaryPersonalAccountFlowParams = (CreateSecondaryPersonalAccountFlowParams) obj;
        createSecondaryPersonalAccountFlowParams.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, createSecondaryPersonalAccountFlowParams.flow_token) + CreateSecondaryPersonalAccountEntryPoint.ADAPTER.encodedSizeWithTag(1, createSecondaryPersonalAccountFlowParams.entry_point) + createSecondaryPersonalAccountFlowParams.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateSecondaryPersonalAccountFlowParams createSecondaryPersonalAccountFlowParams = (CreateSecondaryPersonalAccountFlowParams) obj;
        createSecondaryPersonalAccountFlowParams.getClass();
        ByteString byteString = ByteString.EMPTY;
        CreateSecondaryPersonalAccountEntryPoint createSecondaryPersonalAccountEntryPoint = createSecondaryPersonalAccountFlowParams.entry_point;
        String str = createSecondaryPersonalAccountFlowParams.flow_token;
        byteString.getClass();
        return new CreateSecondaryPersonalAccountFlowParams(createSecondaryPersonalAccountEntryPoint, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateSecondaryPersonalAccountFlowParams createSecondaryPersonalAccountFlowParams = (CreateSecondaryPersonalAccountFlowParams) obj;
        createSecondaryPersonalAccountFlowParams.getClass();
        CreateSecondaryPersonalAccountEntryPoint.ADAPTER.encodeWithTag(protoWriter, 1, createSecondaryPersonalAccountFlowParams.entry_point);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, createSecondaryPersonalAccountFlowParams.flow_token);
        protoWriter.writeBytes(createSecondaryPersonalAccountFlowParams.unknownFields());
    }
}
