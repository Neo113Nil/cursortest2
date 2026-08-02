package xyz.block.protos.genie;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class TransitionEffect$Instant$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TransitionEffect$Instant(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TransitionEffect$Instant transitionEffect$Instant = (TransitionEffect$Instant) obj;
        reverseProtoWriter.getClass();
        transitionEffect$Instant.getClass();
        reverseProtoWriter.writeBytes(transitionEffect$Instant.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TransitionEffect$Instant transitionEffect$Instant = (TransitionEffect$Instant) obj;
        transitionEffect$Instant.getClass();
        return transitionEffect$Instant.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((TransitionEffect$Instant) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new TransitionEffect$Instant(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TransitionEffect$Instant transitionEffect$Instant = (TransitionEffect$Instant) obj;
        transitionEffect$Instant.getClass();
        protoWriter.writeBytes(transitionEffect$Instant.unknownFields());
    }
}
