package com.squareup.protos.cash.shop.rendering.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ScrollToAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ScrollToAction((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        ScrollToAction scrollToAction = (ScrollToAction) obj;
        reverseProtoWriter.getClass();
        scrollToAction.getClass();
        reverseProtoWriter.writeBytes(scrollToAction.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, scrollToAction.target_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ScrollToAction scrollToAction = (ScrollToAction) obj;
        scrollToAction.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, scrollToAction.target_id) + scrollToAction.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ScrollToAction scrollToAction = (ScrollToAction) obj;
        scrollToAction.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = scrollToAction.target_id;
        byteString.getClass();
        return new ScrollToAction(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ScrollToAction scrollToAction = (ScrollToAction) obj;
        scrollToAction.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, scrollToAction.target_id);
        protoWriter.writeBytes(scrollToAction.unknownFields());
    }
}
