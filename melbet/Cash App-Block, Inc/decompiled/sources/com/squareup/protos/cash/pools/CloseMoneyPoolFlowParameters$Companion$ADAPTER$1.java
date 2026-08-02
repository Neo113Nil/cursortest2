package com.squareup.protos.cash.pools;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CloseMoneyPoolFlowParameters$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CloseMoneyPoolFlowParameters((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        CloseMoneyPoolFlowParameters closeMoneyPoolFlowParameters = (CloseMoneyPoolFlowParameters) obj;
        reverseProtoWriter.getClass();
        closeMoneyPoolFlowParameters.getClass();
        reverseProtoWriter.writeBytes(closeMoneyPoolFlowParameters.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, closeMoneyPoolFlowParameters.pool_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CloseMoneyPoolFlowParameters closeMoneyPoolFlowParameters = (CloseMoneyPoolFlowParameters) obj;
        closeMoneyPoolFlowParameters.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, closeMoneyPoolFlowParameters.pool_token) + closeMoneyPoolFlowParameters.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CloseMoneyPoolFlowParameters closeMoneyPoolFlowParameters = (CloseMoneyPoolFlowParameters) obj;
        closeMoneyPoolFlowParameters.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = closeMoneyPoolFlowParameters.pool_token;
        byteString.getClass();
        return new CloseMoneyPoolFlowParameters(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CloseMoneyPoolFlowParameters closeMoneyPoolFlowParameters = (CloseMoneyPoolFlowParameters) obj;
        closeMoneyPoolFlowParameters.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, closeMoneyPoolFlowParameters.pool_token);
        protoWriter.writeBytes(closeMoneyPoolFlowParameters.unknownFields());
    }
}
