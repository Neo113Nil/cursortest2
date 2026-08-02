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
public final class CollectionLiteral$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CollectionLiteral(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(CollectionLiteralItem.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CollectionLiteral collectionLiteral = (CollectionLiteral) obj;
        reverseProtoWriter.getClass();
        collectionLiteral.getClass();
        reverseProtoWriter.writeBytes(collectionLiteral.unknownFields());
        CollectionLiteralItem.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, collectionLiteral.items);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CollectionLiteral collectionLiteral = (CollectionLiteral) obj;
        collectionLiteral.getClass();
        return CollectionLiteralItem.ADAPTER.asRepeated().encodedSizeWithTag(1, collectionLiteral.items) + collectionLiteral.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CollectionLiteral collectionLiteral = (CollectionLiteral) obj;
        collectionLiteral.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(collectionLiteral.items, CollectionLiteralItem.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CollectionLiteral(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CollectionLiteral collectionLiteral = (CollectionLiteral) obj;
        collectionLiteral.getClass();
        CollectionLiteralItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, collectionLiteral.items);
        protoWriter.writeBytes(collectionLiteral.unknownFields());
    }
}
