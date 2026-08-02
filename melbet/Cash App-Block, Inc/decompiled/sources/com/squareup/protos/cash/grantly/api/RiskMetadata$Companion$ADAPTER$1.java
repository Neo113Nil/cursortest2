package com.squareup.protos.cash.grantly.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RiskMetadata$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RiskMetadata((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        RiskMetadata riskMetadata = (RiskMetadata) obj;
        reverseProtoWriter.getClass();
        riskMetadata.getClass();
        reverseProtoWriter.writeBytes(riskMetadata.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, riskMetadata.browser_interaction_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RiskMetadata riskMetadata = (RiskMetadata) obj;
        riskMetadata.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, riskMetadata.browser_interaction_token) + riskMetadata.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RiskMetadata riskMetadata = (RiskMetadata) obj;
        riskMetadata.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = riskMetadata.browser_interaction_token;
        byteString.getClass();
        return new RiskMetadata(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RiskMetadata riskMetadata = (RiskMetadata) obj;
        riskMetadata.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, riskMetadata.browser_interaction_token);
        protoWriter.writeBytes(riskMetadata.unknownFields());
    }
}
