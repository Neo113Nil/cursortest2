package squareup.cash.customer_feed.service;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class Subscription$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Subscription(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Subscription subscription = (Subscription) obj;
        reverseProtoWriter.getClass();
        subscription.getClass();
        reverseProtoWriter.writeBytes(subscription.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Subscription subscription = (Subscription) obj;
        subscription.getClass();
        return subscription.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((Subscription) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Subscription(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Subscription subscription = (Subscription) obj;
        subscription.getClass();
        protoWriter.writeBytes(subscription.unknownFields());
    }
}
