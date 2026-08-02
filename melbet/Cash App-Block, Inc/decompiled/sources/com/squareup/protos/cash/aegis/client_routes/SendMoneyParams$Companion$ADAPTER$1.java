package com.squareup.protos.cash.aegis.client_routes;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SendMoneyParams$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SendMoneyParams((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        SendMoneyParams sendMoneyParams = (SendMoneyParams) obj;
        reverseProtoWriter.getClass();
        sendMoneyParams.getClass();
        reverseProtoWriter.writeBytes(sendMoneyParams.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, sendMoneyParams.exit_route);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SendMoneyParams sendMoneyParams = (SendMoneyParams) obj;
        sendMoneyParams.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, sendMoneyParams.exit_route) + sendMoneyParams.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SendMoneyParams sendMoneyParams = (SendMoneyParams) obj;
        sendMoneyParams.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = sendMoneyParams.exit_route;
        byteString.getClass();
        return new SendMoneyParams(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SendMoneyParams sendMoneyParams = (SendMoneyParams) obj;
        sendMoneyParams.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sendMoneyParams.exit_route);
        protoWriter.writeBytes(sendMoneyParams.unknownFields());
    }
}
