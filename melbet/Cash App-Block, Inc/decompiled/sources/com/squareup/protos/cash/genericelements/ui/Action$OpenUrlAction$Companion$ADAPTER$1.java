package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.genericelements.ui.Action;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Action$OpenUrlAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Action.OpenUrlAction((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        Action.OpenUrlAction openUrlAction = (Action.OpenUrlAction) obj;
        reverseProtoWriter.getClass();
        openUrlAction.getClass();
        reverseProtoWriter.writeBytes(openUrlAction.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, openUrlAction.url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Action.OpenUrlAction openUrlAction = (Action.OpenUrlAction) obj;
        openUrlAction.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, openUrlAction.url) + openUrlAction.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Action.OpenUrlAction openUrlAction = (Action.OpenUrlAction) obj;
        openUrlAction.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = openUrlAction.url;
        byteString.getClass();
        return new Action.OpenUrlAction(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Action.OpenUrlAction openUrlAction = (Action.OpenUrlAction) obj;
        openUrlAction.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, openUrlAction.url);
        protoWriter.writeBytes(openUrlAction.unknownFields());
    }
}
