package xyz.block.protos.genie;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class ViewSpec$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ViewSpec((ByteString) obj, protoReader.endMessageAndGetUnknownFields(beginMessage), (KeyValueMap) obj2);
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BYTES.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = KeyValueMap.ADAPTER.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ViewSpec viewSpec = (ViewSpec) obj;
        reverseProtoWriter.getClass();
        viewSpec.getClass();
        reverseProtoWriter.writeBytes(viewSpec.unknownFields());
        KeyValueMap.ADAPTER.encodeWithTag(reverseProtoWriter, 2, viewSpec.view_state);
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 1, viewSpec.view_node);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ViewSpec viewSpec = (ViewSpec) obj;
        viewSpec.getClass();
        return KeyValueMap.ADAPTER.encodedSizeWithTag(2, viewSpec.view_state) + ProtoAdapter.BYTES.encodedSizeWithTag(1, viewSpec.view_node) + viewSpec.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ViewSpec viewSpec = (ViewSpec) obj;
        viewSpec.getClass();
        KeyValueMap keyValueMap = viewSpec.view_state;
        KeyValueMap keyValueMap2 = keyValueMap != null ? (KeyValueMap) KeyValueMap.ADAPTER.redact(keyValueMap) : null;
        ByteString byteString = ByteString.EMPTY;
        ByteString byteString2 = viewSpec.view_node;
        byteString.getClass();
        return new ViewSpec(byteString2, byteString, keyValueMap2);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ViewSpec viewSpec = (ViewSpec) obj;
        viewSpec.getClass();
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, viewSpec.view_node);
        KeyValueMap.ADAPTER.encodeWithTag(protoWriter, 2, viewSpec.view_state);
        protoWriter.writeBytes(viewSpec.unknownFields());
    }
}
