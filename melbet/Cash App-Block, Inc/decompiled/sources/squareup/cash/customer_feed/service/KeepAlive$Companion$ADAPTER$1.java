package squareup.cash.customer_feed.service;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class KeepAlive$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new KeepAlive((Long) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        KeepAlive keepAlive = (KeepAlive) obj;
        reverseProtoWriter.getClass();
        keepAlive.getClass();
        reverseProtoWriter.writeBytes(keepAlive.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, keepAlive.timestamp);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        KeepAlive keepAlive = (KeepAlive) obj;
        keepAlive.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(1, keepAlive.timestamp) + keepAlive.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        KeepAlive keepAlive = (KeepAlive) obj;
        keepAlive.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = keepAlive.timestamp;
        byteString.getClass();
        return new KeepAlive(l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        KeepAlive keepAlive = (KeepAlive) obj;
        keepAlive.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, keepAlive.timestamp);
        protoWriter.writeBytes(keepAlive.unknownFields());
    }
}
