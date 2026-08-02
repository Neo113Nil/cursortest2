package com.squareup.protos.cash.marketdata.model;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class OpenUrlAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OpenUrlAction((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        OpenUrlAction openUrlAction = (OpenUrlAction) obj;
        reverseProtoWriter.getClass();
        openUrlAction.getClass();
        reverseProtoWriter.writeBytes(openUrlAction.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, openUrlAction.news_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OpenUrlAction openUrlAction = (OpenUrlAction) obj;
        openUrlAction.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, openUrlAction.news_url) + openUrlAction.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OpenUrlAction openUrlAction = (OpenUrlAction) obj;
        openUrlAction.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = openUrlAction.news_url;
        byteString.getClass();
        return new OpenUrlAction(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OpenUrlAction openUrlAction = (OpenUrlAction) obj;
        openUrlAction.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, openUrlAction.news_url);
        protoWriter.writeBytes(openUrlAction.unknownFields());
    }
}
