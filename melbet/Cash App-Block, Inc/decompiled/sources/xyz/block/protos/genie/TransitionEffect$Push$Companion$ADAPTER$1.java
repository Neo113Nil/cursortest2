package xyz.block.protos.genie;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class TransitionEffect$Push$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TransitionEffect$Push(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TransitionEffect$Push transitionEffect$Push = (TransitionEffect$Push) obj;
        reverseProtoWriter.getClass();
        transitionEffect$Push.getClass();
        reverseProtoWriter.writeBytes(transitionEffect$Push.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TransitionEffect$Push transitionEffect$Push = (TransitionEffect$Push) obj;
        transitionEffect$Push.getClass();
        return transitionEffect$Push.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((TransitionEffect$Push) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new TransitionEffect$Push(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TransitionEffect$Push transitionEffect$Push = (TransitionEffect$Push) obj;
        transitionEffect$Push.getClass();
        protoWriter.writeBytes(transitionEffect$Push.unknownFields());
    }
}
