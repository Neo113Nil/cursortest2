package xyz.block.protos.genie;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class GetSceneRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetSceneRequest((String) obj, (KeyValueMap) obj2, (ByteString) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = KeyValueMap.ADAPTER.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.BYTES.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetSceneRequest getSceneRequest = (GetSceneRequest) obj;
        reverseProtoWriter.getClass();
        getSceneRequest.getClass();
        reverseProtoWriter.writeBytes(getSceneRequest.unknownFields());
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 3, getSceneRequest.scene_inputs);
        KeyValueMap.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getSceneRequest.inputs);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, getSceneRequest.scene_slug);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetSceneRequest getSceneRequest = (GetSceneRequest) obj;
        getSceneRequest.getClass();
        return ProtoAdapter.BYTES.encodedSizeWithTag(3, getSceneRequest.scene_inputs) + KeyValueMap.ADAPTER.encodedSizeWithTag(2, getSceneRequest.inputs) + ProtoAdapter.STRING.encodedSizeWithTag(1, getSceneRequest.scene_slug) + getSceneRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetSceneRequest getSceneRequest = (GetSceneRequest) obj;
        getSceneRequest.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = getSceneRequest.scene_slug;
        byteString.getClass();
        return new GetSceneRequest(str, null, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetSceneRequest getSceneRequest = (GetSceneRequest) obj;
        getSceneRequest.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getSceneRequest.scene_slug);
        KeyValueMap.ADAPTER.encodeWithTag(protoWriter, 2, getSceneRequest.inputs);
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 3, getSceneRequest.scene_inputs);
        protoWriter.writeBytes(getSceneRequest.unknownFields());
    }
}
