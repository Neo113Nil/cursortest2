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
public final class CollectionLiteralItem$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CollectionLiteralItem(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(CollectionLiteralField.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CollectionLiteralItem collectionLiteralItem = (CollectionLiteralItem) obj;
        reverseProtoWriter.getClass();
        collectionLiteralItem.getClass();
        reverseProtoWriter.writeBytes(collectionLiteralItem.unknownFields());
        CollectionLiteralField.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, collectionLiteralItem.fields);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CollectionLiteralItem collectionLiteralItem = (CollectionLiteralItem) obj;
        collectionLiteralItem.getClass();
        return CollectionLiteralField.ADAPTER.asRepeated().encodedSizeWithTag(1, collectionLiteralItem.fields) + collectionLiteralItem.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CollectionLiteralItem collectionLiteralItem = (CollectionLiteralItem) obj;
        collectionLiteralItem.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(collectionLiteralItem.fields, CollectionLiteralField.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CollectionLiteralItem(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CollectionLiteralItem collectionLiteralItem = (CollectionLiteralItem) obj;
        collectionLiteralItem.getClass();
        CollectionLiteralField.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, collectionLiteralItem.fields);
        protoWriter.writeBytes(collectionLiteralItem.unknownFields());
    }
}
