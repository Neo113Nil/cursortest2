package squareup.cash.customer_feed.service;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class SubscribeRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SubscribeRequest(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SubscribeRequest subscribeRequest = (SubscribeRequest) obj;
        reverseProtoWriter.getClass();
        subscribeRequest.getClass();
        reverseProtoWriter.writeBytes(subscribeRequest.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SubscribeRequest subscribeRequest = (SubscribeRequest) obj;
        subscribeRequest.getClass();
        return subscribeRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((SubscribeRequest) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SubscribeRequest(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubscribeRequest subscribeRequest = (SubscribeRequest) obj;
        subscribeRequest.getClass();
        protoWriter.writeBytes(subscribeRequest.unknownFields());
    }
}
