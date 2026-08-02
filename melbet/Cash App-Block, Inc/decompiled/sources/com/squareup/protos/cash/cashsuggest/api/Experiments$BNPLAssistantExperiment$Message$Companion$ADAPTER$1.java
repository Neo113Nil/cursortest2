package com.squareup.protos.cash.cashsuggest.api;

import com.squareup.protos.cash.cashsuggest.api.Experiments;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Experiments$BNPLAssistantExperiment$Message$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Experiments.BNPLAssistantExperiment.Message((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        Experiments.BNPLAssistantExperiment.Message message = (Experiments.BNPLAssistantExperiment.Message) obj;
        reverseProtoWriter.getClass();
        message.getClass();
        reverseProtoWriter.writeBytes(message.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, message.response);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, message.query);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Experiments.BNPLAssistantExperiment.Message message = (Experiments.BNPLAssistantExperiment.Message) obj;
        message.getClass();
        int size$okio = message.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, message.response) + protoAdapter.encodedSizeWithTag(1, message.query) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Experiments.BNPLAssistantExperiment.Message message = (Experiments.BNPLAssistantExperiment.Message) obj;
        message.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = message.query;
        String str2 = message.response;
        byteString.getClass();
        return new Experiments.BNPLAssistantExperiment.Message(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Experiments.BNPLAssistantExperiment.Message message = (Experiments.BNPLAssistantExperiment.Message) obj;
        message.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, message.query);
        protoAdapter.encodeWithTag(protoWriter, 2, message.response);
        protoWriter.writeBytes(message.unknownFields());
    }
}
