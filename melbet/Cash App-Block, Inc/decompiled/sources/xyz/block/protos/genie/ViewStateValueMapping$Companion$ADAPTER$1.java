package xyz.block.protos.genie;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.ViewStateValueMapping;

/* loaded from: classes10.dex */
public final class ViewStateValueMapping$Companion$ADAPTER$1 extends ProtoAdapter {
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
                obj = ViewStateValueMapping.ViewOutputs.ADAPTER.decode(protoReader);
            } else if (nextTag == 2) {
                obj3 = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag == 3) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj5 = KeyPath.ADAPTER.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ViewStateValueMapping.SceneInputs.ADAPTER.decode(protoReader);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        ViewStateValueMapping.ViewOutputs viewOutputs = (ViewStateValueMapping.ViewOutputs) obj;
        ViewStateValueMapping.SceneInputs sceneInputs = (ViewStateValueMapping.SceneInputs) obj2;
        Expression expression = (Expression) obj3;
        if (expression == null) {
            TransactorKt.missingRequiredFields(obj3, "source_value");
            throw null;
        }
        String str = (String) obj4;
        KeyPath keyPath = (KeyPath) obj5;
        if (keyPath != null) {
            return new ViewStateValueMapping(viewOutputs, sceneInputs, expression, str, keyPath, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj5, "destination_key_path");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ViewStateValueMapping viewStateValueMapping = (ViewStateValueMapping) obj;
        reverseProtoWriter.getClass();
        viewStateValueMapping.getClass();
        reverseProtoWriter.writeBytes(viewStateValueMapping.unknownFields());
        ViewStateValueMapping.SceneInputs.ADAPTER.encodeWithTag(reverseProtoWriter, 5, viewStateValueMapping.scene_inputs);
        ViewStateValueMapping.ViewOutputs.ADAPTER.encodeWithTag(reverseProtoWriter, 1, viewStateValueMapping.view_outputs);
        KeyPath.ADAPTER.encodeWithTag(reverseProtoWriter, 4, viewStateValueMapping.destination_key_path);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, viewStateValueMapping.destination_view_slug);
        Expression.ADAPTER.encodeWithTag(reverseProtoWriter, 2, viewStateValueMapping.source_value);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ViewStateValueMapping viewStateValueMapping = (ViewStateValueMapping) obj;
        viewStateValueMapping.getClass();
        return KeyPath.ADAPTER.encodedSizeWithTag(4, viewStateValueMapping.destination_key_path) + ProtoAdapter.STRING.encodedSizeWithTag(3, viewStateValueMapping.destination_view_slug) + Expression.ADAPTER.encodedSizeWithTag(2, viewStateValueMapping.source_value) + ViewStateValueMapping.SceneInputs.ADAPTER.encodedSizeWithTag(5, viewStateValueMapping.scene_inputs) + ViewStateValueMapping.ViewOutputs.ADAPTER.encodedSizeWithTag(1, viewStateValueMapping.view_outputs) + viewStateValueMapping.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ViewStateValueMapping viewStateValueMapping = (ViewStateValueMapping) obj;
        viewStateValueMapping.getClass();
        ViewStateValueMapping.ViewOutputs viewOutputs = viewStateValueMapping.view_outputs;
        ViewStateValueMapping.ViewOutputs viewOutputs2 = viewOutputs != null ? (ViewStateValueMapping.ViewOutputs) ViewStateValueMapping.ViewOutputs.ADAPTER.redact(viewOutputs) : null;
        ViewStateValueMapping.SceneInputs sceneInputs = viewStateValueMapping.scene_inputs;
        ViewStateValueMapping.SceneInputs sceneInputs2 = sceneInputs != null ? (ViewStateValueMapping.SceneInputs) ViewStateValueMapping.SceneInputs.ADAPTER.redact(sceneInputs) : null;
        Expression expression = (Expression) Expression.ADAPTER.redact(viewStateValueMapping.source_value);
        KeyPath keyPath = (KeyPath) KeyPath.ADAPTER.redact(viewStateValueMapping.destination_key_path);
        ByteString byteString = ByteString.EMPTY;
        String str = viewStateValueMapping.destination_view_slug;
        expression.getClass();
        keyPath.getClass();
        byteString.getClass();
        return new ViewStateValueMapping(viewOutputs2, sceneInputs2, expression, str, keyPath, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ViewStateValueMapping viewStateValueMapping = (ViewStateValueMapping) obj;
        viewStateValueMapping.getClass();
        Expression.ADAPTER.encodeWithTag(protoWriter, 2, viewStateValueMapping.source_value);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, viewStateValueMapping.destination_view_slug);
        KeyPath.ADAPTER.encodeWithTag(protoWriter, 4, viewStateValueMapping.destination_key_path);
        ViewStateValueMapping.ViewOutputs.ADAPTER.encodeWithTag(protoWriter, 1, viewStateValueMapping.view_outputs);
        ViewStateValueMapping.SceneInputs.ADAPTER.encodeWithTag(protoWriter, 5, viewStateValueMapping.scene_inputs);
        protoWriter.writeBytes(viewStateValueMapping.unknownFields());
    }
}
