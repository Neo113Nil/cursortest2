package xyz.block.protos.genie;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class TransitionEffect$Slide$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TransitionEffect$Slide(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TransitionEffect$Slide transitionEffect$Slide = (TransitionEffect$Slide) obj;
        reverseProtoWriter.getClass();
        transitionEffect$Slide.getClass();
        reverseProtoWriter.writeBytes(transitionEffect$Slide.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TransitionEffect$Slide transitionEffect$Slide = (TransitionEffect$Slide) obj;
        transitionEffect$Slide.getClass();
        return transitionEffect$Slide.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((TransitionEffect$Slide) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new TransitionEffect$Slide(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TransitionEffect$Slide transitionEffect$Slide = (TransitionEffect$Slide) obj;
        transitionEffect$Slide.getClass();
        protoWriter.writeBytes(transitionEffect$Slide.unknownFields());
    }
}
