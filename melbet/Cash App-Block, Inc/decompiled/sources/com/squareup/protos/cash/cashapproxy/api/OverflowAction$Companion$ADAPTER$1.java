package com.squareup.protos.cash.cashapproxy.api;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class OverflowAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OverflowAction((Text) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OverflowAction overflowAction = (OverflowAction) obj;
        reverseProtoWriter.getClass();
        overflowAction.getClass();
        reverseProtoWriter.writeBytes(overflowAction.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, overflowAction.client_route_url);
        Text.ADAPTER.encodeWithTag(reverseProtoWriter, 1, overflowAction.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OverflowAction overflowAction = (OverflowAction) obj;
        overflowAction.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, overflowAction.client_route_url) + Text.ADAPTER.encodedSizeWithTag(1, overflowAction.title) + overflowAction.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OverflowAction overflowAction = (OverflowAction) obj;
        overflowAction.getClass();
        Text text = overflowAction.title;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new OverflowAction(text2, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OverflowAction overflowAction = (OverflowAction) obj;
        overflowAction.getClass();
        Text.ADAPTER.encodeWithTag(protoWriter, 1, overflowAction.title);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, overflowAction.client_route_url);
        protoWriter.writeBytes(overflowAction.unknownFields());
    }
}
