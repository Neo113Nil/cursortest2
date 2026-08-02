package xyz.block.protos.genie;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;
import xyz.block.protos.genie.CollectionMutation;

/* loaded from: classes10.dex */
public final class CollectionMutation$AppendItem$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CollectionMutation.AppendItem((CollectionItem) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = CollectionItem.ADAPTER.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(CollectionMutation.SetItemField.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CollectionMutation.AppendItem appendItem = (CollectionMutation.AppendItem) obj;
        reverseProtoWriter.getClass();
        appendItem.getClass();
        reverseProtoWriter.writeBytes(appendItem.unknownFields());
        CollectionMutation.SetItemField.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, appendItem.fields);
        CollectionItem.ADAPTER.encodeWithTag(reverseProtoWriter, 1, appendItem.item);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CollectionMutation.AppendItem appendItem = (CollectionMutation.AppendItem) obj;
        appendItem.getClass();
        return CollectionMutation.SetItemField.ADAPTER.asRepeated().encodedSizeWithTag(2, appendItem.fields) + CollectionItem.ADAPTER.encodedSizeWithTag(1, appendItem.item) + appendItem.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CollectionMutation.AppendItem appendItem = (CollectionMutation.AppendItem) obj;
        appendItem.getClass();
        CollectionItem collectionItem = appendItem.item;
        CollectionItem collectionItem2 = collectionItem != null ? (CollectionItem) CollectionItem.ADAPTER.redact(collectionItem) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(appendItem.fields, CollectionMutation.SetItemField.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CollectionMutation.AppendItem(collectionItem2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CollectionMutation.AppendItem appendItem = (CollectionMutation.AppendItem) obj;
        appendItem.getClass();
        CollectionItem.ADAPTER.encodeWithTag(protoWriter, 1, appendItem.item);
        CollectionMutation.SetItemField.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, appendItem.fields);
        protoWriter.writeBytes(appendItem.unknownFields());
    }
}
