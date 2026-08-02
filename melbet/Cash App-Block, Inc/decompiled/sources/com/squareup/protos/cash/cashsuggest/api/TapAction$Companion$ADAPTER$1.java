package com.squareup.protos.cash.cashsuggest.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class TapAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TapAction((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        TapAction tapAction = (TapAction) obj;
        reverseProtoWriter.getClass();
        tapAction.getClass();
        reverseProtoWriter.writeBytes(tapAction.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, tapAction.action_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TapAction tapAction = (TapAction) obj;
        tapAction.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, tapAction.action_url) + tapAction.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TapAction tapAction = (TapAction) obj;
        tapAction.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = tapAction.action_url;
        byteString.getClass();
        return new TapAction(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TapAction tapAction = (TapAction) obj;
        tapAction.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, tapAction.action_url);
        protoWriter.writeBytes(tapAction.unknownFields());
    }
}
