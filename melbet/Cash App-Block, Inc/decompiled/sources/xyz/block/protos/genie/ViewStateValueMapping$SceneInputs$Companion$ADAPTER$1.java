package xyz.block.protos.genie;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.ViewStateValueMapping;

/* loaded from: classes10.dex */
public final class ViewStateValueMapping$SceneInputs$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ViewStateValueMapping.SceneInputs(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ViewStateValueMapping.SceneInputs sceneInputs = (ViewStateValueMapping.SceneInputs) obj;
        reverseProtoWriter.getClass();
        sceneInputs.getClass();
        reverseProtoWriter.writeBytes(sceneInputs.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ViewStateValueMapping.SceneInputs sceneInputs = (ViewStateValueMapping.SceneInputs) obj;
        sceneInputs.getClass();
        return sceneInputs.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((ViewStateValueMapping.SceneInputs) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ViewStateValueMapping.SceneInputs(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ViewStateValueMapping.SceneInputs sceneInputs = (ViewStateValueMapping.SceneInputs) obj;
        sceneInputs.getClass();
        protoWriter.writeBytes(sceneInputs.unknownFields());
    }
}
