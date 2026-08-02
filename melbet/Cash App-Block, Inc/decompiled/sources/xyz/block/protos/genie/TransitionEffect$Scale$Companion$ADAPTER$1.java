package xyz.block.protos.genie;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class TransitionEffect$Scale$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TransitionEffect$Scale(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TransitionEffect$Scale transitionEffect$Scale = (TransitionEffect$Scale) obj;
        reverseProtoWriter.getClass();
        transitionEffect$Scale.getClass();
        reverseProtoWriter.writeBytes(transitionEffect$Scale.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TransitionEffect$Scale transitionEffect$Scale = (TransitionEffect$Scale) obj;
        transitionEffect$Scale.getClass();
        return transitionEffect$Scale.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((TransitionEffect$Scale) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new TransitionEffect$Scale(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TransitionEffect$Scale transitionEffect$Scale = (TransitionEffect$Scale) obj;
        transitionEffect$Scale.getClass();
        protoWriter.writeBytes(transitionEffect$Scale.unknownFields());
    }
}
