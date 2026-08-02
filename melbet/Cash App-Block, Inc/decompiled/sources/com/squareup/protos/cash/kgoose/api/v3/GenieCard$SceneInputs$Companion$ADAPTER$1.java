package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.kgoose.api.v3.GenieCard;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;
import xyz.block.protos.genie.KeyValueMap;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/GenieCard$SceneInputs$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/GenieCard$SceneInputs;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GenieCard$SceneInputs$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GenieCard.SceneInputs((ByteString) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage), (KeyValueMap) obj);
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(KeyValueMap.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BYTES.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GenieCard.SceneInputs sceneInputs = (GenieCard.SceneInputs) obj;
        reverseProtoWriter.getClass();
        sceneInputs.getClass();
        reverseProtoWriter.writeBytes(sceneInputs.unknownFields());
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 2, sceneInputs.scene_inputs);
        KeyValueMap.ADAPTER.encodeWithTag(reverseProtoWriter, 1, sceneInputs.inputs);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GenieCard.SceneInputs sceneInputs = (GenieCard.SceneInputs) obj;
        sceneInputs.getClass();
        return ProtoAdapter.BYTES.encodedSizeWithTag(2, sceneInputs.scene_inputs) + KeyValueMap.ADAPTER.encodedSizeWithTag(1, sceneInputs.inputs) + sceneInputs.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GenieCard.SceneInputs sceneInputs = (GenieCard.SceneInputs) obj;
        sceneInputs.getClass();
        KeyValueMap keyValueMap = sceneInputs.inputs;
        KeyValueMap keyValueMap2 = keyValueMap != null ? (KeyValueMap) KeyValueMap.ADAPTER.redact(keyValueMap) : null;
        ByteString byteString = ByteString.EMPTY;
        ByteString byteString2 = sceneInputs.scene_inputs;
        byteString.getClass();
        return new GenieCard.SceneInputs(byteString2, byteString, keyValueMap2);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenieCard.SceneInputs sceneInputs = (GenieCard.SceneInputs) obj;
        sceneInputs.getClass();
        KeyValueMap.ADAPTER.encodeWithTag(protoWriter, 1, sceneInputs.inputs);
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, sceneInputs.scene_inputs);
        protoWriter.writeBytes(sceneInputs.unknownFields());
    }
}
