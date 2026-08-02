package xyz.block.protos.genie;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.KeyValueMap;

/* loaded from: classes10.dex */
public final class KeyValueMap$Entry$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new KeyValueMap.Entry((String) obj, (String) obj2, (Long) obj3, (Double) obj4, (Boolean) obj5, (ByteString) obj6, (KeyValueMap) obj7, (Collection) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.DOUBLE.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.BYTES.decode(protoReader);
                    break;
                case 7:
                    obj7 = KeyValueMap.ADAPTER.decode(protoReader);
                    break;
                case 8:
                    obj8 = Collection.ADAPTER.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        KeyValueMap.Entry entry = (KeyValueMap.Entry) obj;
        reverseProtoWriter.getClass();
        entry.getClass();
        reverseProtoWriter.writeBytes(entry.unknownFields());
        Collection.ADAPTER.encodeWithTag(reverseProtoWriter, 8, entry.collection);
        KeyValueMap.ADAPTER.encodeWithTag(reverseProtoWriter, 7, entry.group);
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 6, entry.blob_value);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 5, entry.bool_value);
        ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 4, entry.float_value);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 3, entry.int_value);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, entry.string_value);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, entry.key);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        KeyValueMap.Entry entry = (KeyValueMap.Entry) obj;
        entry.getClass();
        int size$okio = entry.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Collection.ADAPTER.encodedSizeWithTag(8, entry.collection) + KeyValueMap.ADAPTER.encodedSizeWithTag(7, entry.group) + ProtoAdapter.BYTES.encodedSizeWithTag(6, entry.blob_value) + ProtoAdapter.BOOL.encodedSizeWithTag(5, entry.bool_value) + ProtoAdapter.DOUBLE.encodedSizeWithTag(4, entry.float_value) + ProtoAdapter.INT64.encodedSizeWithTag(3, entry.int_value) + protoAdapter.encodedSizeWithTag(2, entry.string_value) + protoAdapter.encodedSizeWithTag(1, entry.key) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        KeyValueMap.Entry entry = (KeyValueMap.Entry) obj;
        entry.getClass();
        KeyValueMap keyValueMap = entry.group;
        KeyValueMap keyValueMap2 = keyValueMap != null ? (KeyValueMap) KeyValueMap.ADAPTER.redact(keyValueMap) : null;
        Collection collection = entry.collection;
        Collection collection2 = collection != null ? (Collection) Collection.ADAPTER.redact(collection) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = entry.key;
        String str2 = entry.string_value;
        Long l = entry.int_value;
        Double d = entry.float_value;
        Boolean bool = entry.bool_value;
        ByteString byteString2 = entry.blob_value;
        byteString.getClass();
        return new KeyValueMap.Entry(str, str2, l, d, bool, byteString2, keyValueMap2, collection2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        KeyValueMap.Entry entry = (KeyValueMap.Entry) obj;
        entry.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, entry.key);
        protoAdapter.encodeWithTag(protoWriter, 2, entry.string_value);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, entry.int_value);
        ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 4, entry.float_value);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, entry.bool_value);
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 6, entry.blob_value);
        KeyValueMap.ADAPTER.encodeWithTag(protoWriter, 7, entry.group);
        Collection.ADAPTER.encodeWithTag(protoWriter, 8, entry.collection);
        protoWriter.writeBytes(entry.unknownFields());
    }
}
