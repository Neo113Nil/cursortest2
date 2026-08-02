package xyz.block.protos.genie;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.CollectionMutation;

/* loaded from: classes10.dex */
public final class CollectionMutation$RemoveAll$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CollectionMutation.RemoveAll(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CollectionMutation.RemoveAll removeAll = (CollectionMutation.RemoveAll) obj;
        reverseProtoWriter.getClass();
        removeAll.getClass();
        reverseProtoWriter.writeBytes(removeAll.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CollectionMutation.RemoveAll removeAll = (CollectionMutation.RemoveAll) obj;
        removeAll.getClass();
        return removeAll.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((CollectionMutation.RemoveAll) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CollectionMutation.RemoveAll(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CollectionMutation.RemoveAll removeAll = (CollectionMutation.RemoveAll) obj;
        removeAll.getClass();
        protoWriter.writeBytes(removeAll.unknownFields());
    }
}
