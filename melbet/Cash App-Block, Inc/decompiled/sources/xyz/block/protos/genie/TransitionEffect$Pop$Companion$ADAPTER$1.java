package xyz.block.protos.genie;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class TransitionEffect$Pop$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TransitionEffect$Pop(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TransitionEffect$Pop transitionEffect$Pop = (TransitionEffect$Pop) obj;
        reverseProtoWriter.getClass();
        transitionEffect$Pop.getClass();
        reverseProtoWriter.writeBytes(transitionEffect$Pop.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TransitionEffect$Pop transitionEffect$Pop = (TransitionEffect$Pop) obj;
        transitionEffect$Pop.getClass();
        return transitionEffect$Pop.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((TransitionEffect$Pop) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new TransitionEffect$Pop(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TransitionEffect$Pop transitionEffect$Pop = (TransitionEffect$Pop) obj;
        transitionEffect$Pop.getClass();
        protoWriter.writeBytes(transitionEffect$Pop.unknownFields());
    }
}
