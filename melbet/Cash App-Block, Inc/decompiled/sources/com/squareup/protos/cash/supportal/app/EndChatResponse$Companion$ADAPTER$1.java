package com.squareup.protos.cash.supportal.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class EndChatResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EndChatResponse((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EndChatResponse endChatResponse = (EndChatResponse) obj;
        reverseProtoWriter.getClass();
        endChatResponse.getClass();
        reverseProtoWriter.writeBytes(endChatResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, endChatResponse.survey_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EndChatResponse endChatResponse = (EndChatResponse) obj;
        endChatResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, endChatResponse.survey_token) + endChatResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EndChatResponse endChatResponse = (EndChatResponse) obj;
        endChatResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = endChatResponse.survey_token;
        byteString.getClass();
        return new EndChatResponse(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EndChatResponse endChatResponse = (EndChatResponse) obj;
        endChatResponse.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, endChatResponse.survey_token);
        protoWriter.writeBytes(endChatResponse.unknownFields());
    }
}
