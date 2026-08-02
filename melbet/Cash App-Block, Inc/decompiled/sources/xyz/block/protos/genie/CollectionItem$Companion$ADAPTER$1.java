package xyz.block.protos.genie;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class CollectionItem$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CollectionItem((KeyValueMap) obj, (IdValue) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = KeyValueMap.ADAPTER.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = IdValue.ADAPTER.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CollectionItem collectionItem = (CollectionItem) obj;
        reverseProtoWriter.getClass();
        collectionItem.getClass();
        reverseProtoWriter.writeBytes(collectionItem.unknownFields());
        IdValue.ADAPTER.encodeWithTag(reverseProtoWriter, 2, collectionItem.identity);
        KeyValueMap.ADAPTER.encodeWithTag(reverseProtoWriter, 1, collectionItem.fields);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CollectionItem collectionItem = (CollectionItem) obj;
        collectionItem.getClass();
        return IdValue.ADAPTER.encodedSizeWithTag(2, collectionItem.identity) + KeyValueMap.ADAPTER.encodedSizeWithTag(1, collectionItem.fields) + collectionItem.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CollectionItem collectionItem = (CollectionItem) obj;
        collectionItem.getClass();
        KeyValueMap keyValueMap = collectionItem.fields;
        KeyValueMap keyValueMap2 = keyValueMap != null ? (KeyValueMap) KeyValueMap.ADAPTER.redact(keyValueMap) : null;
        IdValue idValue = collectionItem.identity;
        IdValue idValue2 = idValue != null ? (IdValue) IdValue.ADAPTER.redact(idValue) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CollectionItem(keyValueMap2, idValue2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CollectionItem collectionItem = (CollectionItem) obj;
        collectionItem.getClass();
        KeyValueMap.ADAPTER.encodeWithTag(protoWriter, 1, collectionItem.fields);
        IdValue.ADAPTER.encodeWithTag(protoWriter, 2, collectionItem.identity);
        protoWriter.writeBytes(collectionItem.unknownFields());
    }
}
