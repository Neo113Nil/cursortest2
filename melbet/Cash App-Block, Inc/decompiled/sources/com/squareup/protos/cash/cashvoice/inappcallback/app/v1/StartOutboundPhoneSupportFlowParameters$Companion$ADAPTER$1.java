package com.squareup.protos.cash.cashvoice.inappcallback.app.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class StartOutboundPhoneSupportFlowParameters$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new StartOutboundPhoneSupportFlowParameters((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        StartOutboundPhoneSupportFlowParameters startOutboundPhoneSupportFlowParameters = (StartOutboundPhoneSupportFlowParameters) obj;
        reverseProtoWriter.getClass();
        startOutboundPhoneSupportFlowParameters.getClass();
        reverseProtoWriter.writeBytes(startOutboundPhoneSupportFlowParameters.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, startOutboundPhoneSupportFlowParameters.node_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, startOutboundPhoneSupportFlowParameters.entity_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StartOutboundPhoneSupportFlowParameters startOutboundPhoneSupportFlowParameters = (StartOutboundPhoneSupportFlowParameters) obj;
        startOutboundPhoneSupportFlowParameters.getClass();
        int size$okio = startOutboundPhoneSupportFlowParameters.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, startOutboundPhoneSupportFlowParameters.node_token) + protoAdapter.encodedSizeWithTag(1, startOutboundPhoneSupportFlowParameters.entity_id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StartOutboundPhoneSupportFlowParameters startOutboundPhoneSupportFlowParameters = (StartOutboundPhoneSupportFlowParameters) obj;
        startOutboundPhoneSupportFlowParameters.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = startOutboundPhoneSupportFlowParameters.entity_id;
        String str2 = startOutboundPhoneSupportFlowParameters.node_token;
        byteString.getClass();
        return new StartOutboundPhoneSupportFlowParameters(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StartOutboundPhoneSupportFlowParameters startOutboundPhoneSupportFlowParameters = (StartOutboundPhoneSupportFlowParameters) obj;
        startOutboundPhoneSupportFlowParameters.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, startOutboundPhoneSupportFlowParameters.entity_id);
        protoAdapter.encodeWithTag(protoWriter, 2, startOutboundPhoneSupportFlowParameters.node_token);
        protoWriter.writeBytes(startOutboundPhoneSupportFlowParameters.unknownFields());
    }
}
