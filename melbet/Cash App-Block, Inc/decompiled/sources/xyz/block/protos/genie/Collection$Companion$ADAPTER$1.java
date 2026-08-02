package xyz.block.protos.genie;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class Collection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Collection(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(CollectionItem.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Collection collection = (Collection) obj;
        reverseProtoWriter.getClass();
        collection.getClass();
        reverseProtoWriter.writeBytes(collection.unknownFields());
        CollectionItem.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, collection.items);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return CollectionItem.ADAPTER.asRepeated().encodedSizeWithTag(1, collection.items) + collection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(collection.items, CollectionItem.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Collection(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        CollectionItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, collection.items);
        protoWriter.writeBytes(collection.unknownFields());
    }
}
