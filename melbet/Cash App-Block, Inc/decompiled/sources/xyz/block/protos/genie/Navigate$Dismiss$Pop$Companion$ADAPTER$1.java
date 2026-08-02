package xyz.block.protos.genie;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.Navigate;

/* loaded from: classes10.dex */
public final class Navigate$Dismiss$Pop$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Navigate.Dismiss.Pop(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Navigate.Dismiss.Pop pop = (Navigate.Dismiss.Pop) obj;
        reverseProtoWriter.getClass();
        pop.getClass();
        reverseProtoWriter.writeBytes(pop.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Navigate.Dismiss.Pop pop = (Navigate.Dismiss.Pop) obj;
        pop.getClass();
        return pop.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((Navigate.Dismiss.Pop) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Navigate.Dismiss.Pop(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Navigate.Dismiss.Pop pop = (Navigate.Dismiss.Pop) obj;
        pop.getClass();
        protoWriter.writeBytes(pop.unknownFields());
    }
}
