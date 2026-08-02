package xyz.block.protos.genie;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.CollectionMutation;

/* loaded from: classes10.dex */
public final class CollectionMutation$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = KeyPath.ADAPTER.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = CollectionMutation.AppendItem.ADAPTER.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = CollectionMutation.RemoveItems.ADAPTER.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = CollectionMutation.RemoveAll.ADAPTER.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = CollectionMutation.UpdateItem.ADAPTER.decode(protoReader);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        KeyPath keyPath = (KeyPath) obj;
        if (keyPath != null) {
            return new CollectionMutation(keyPath, (CollectionMutation.AppendItem) obj2, (CollectionMutation.RemoveItems) obj3, (CollectionMutation.RemoveAll) obj4, (CollectionMutation.UpdateItem) obj5, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "target");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CollectionMutation collectionMutation = (CollectionMutation) obj;
        reverseProtoWriter.getClass();
        collectionMutation.getClass();
        reverseProtoWriter.writeBytes(collectionMutation.unknownFields());
        CollectionMutation.UpdateItem.ADAPTER.encodeWithTag(reverseProtoWriter, 5, collectionMutation.update);
        CollectionMutation.RemoveAll.ADAPTER.encodeWithTag(reverseProtoWriter, 4, collectionMutation.remove_all);
        CollectionMutation.RemoveItems.ADAPTER.encodeWithTag(reverseProtoWriter, 3, collectionMutation.remove);
        CollectionMutation.AppendItem.ADAPTER.encodeWithTag(reverseProtoWriter, 2, collectionMutation.append);
        KeyPath.ADAPTER.encodeWithTag(reverseProtoWriter, 1, collectionMutation.target);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CollectionMutation collectionMutation = (CollectionMutation) obj;
        collectionMutation.getClass();
        return CollectionMutation.UpdateItem.ADAPTER.encodedSizeWithTag(5, collectionMutation.update) + CollectionMutation.RemoveAll.ADAPTER.encodedSizeWithTag(4, collectionMutation.remove_all) + CollectionMutation.RemoveItems.ADAPTER.encodedSizeWithTag(3, collectionMutation.remove) + CollectionMutation.AppendItem.ADAPTER.encodedSizeWithTag(2, collectionMutation.append) + KeyPath.ADAPTER.encodedSizeWithTag(1, collectionMutation.target) + collectionMutation.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CollectionMutation collectionMutation = (CollectionMutation) obj;
        collectionMutation.getClass();
        KeyPath keyPath = (KeyPath) KeyPath.ADAPTER.redact(collectionMutation.target);
        CollectionMutation.AppendItem appendItem = collectionMutation.append;
        CollectionMutation.AppendItem appendItem2 = appendItem != null ? (CollectionMutation.AppendItem) CollectionMutation.AppendItem.ADAPTER.redact(appendItem) : null;
        CollectionMutation.RemoveItems removeItems = collectionMutation.remove;
        CollectionMutation.RemoveItems removeItems2 = removeItems != null ? (CollectionMutation.RemoveItems) CollectionMutation.RemoveItems.ADAPTER.redact(removeItems) : null;
        CollectionMutation.RemoveAll removeAll = collectionMutation.remove_all;
        CollectionMutation.RemoveAll removeAll2 = removeAll != null ? (CollectionMutation.RemoveAll) CollectionMutation.RemoveAll.ADAPTER.redact(removeAll) : null;
        CollectionMutation.UpdateItem updateItem = collectionMutation.update;
        CollectionMutation.UpdateItem updateItem2 = updateItem != null ? (CollectionMutation.UpdateItem) CollectionMutation.UpdateItem.ADAPTER.redact(updateItem) : null;
        ByteString byteString = ByteString.EMPTY;
        keyPath.getClass();
        byteString.getClass();
        return new CollectionMutation(keyPath, appendItem2, removeItems2, removeAll2, updateItem2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CollectionMutation collectionMutation = (CollectionMutation) obj;
        collectionMutation.getClass();
        KeyPath.ADAPTER.encodeWithTag(protoWriter, 1, collectionMutation.target);
        CollectionMutation.AppendItem.ADAPTER.encodeWithTag(protoWriter, 2, collectionMutation.append);
        CollectionMutation.RemoveItems.ADAPTER.encodeWithTag(protoWriter, 3, collectionMutation.remove);
        CollectionMutation.RemoveAll.ADAPTER.encodeWithTag(protoWriter, 4, collectionMutation.remove_all);
        CollectionMutation.UpdateItem.ADAPTER.encodeWithTag(protoWriter, 5, collectionMutation.update);
        protoWriter.writeBytes(collectionMutation.unknownFields());
    }
}
