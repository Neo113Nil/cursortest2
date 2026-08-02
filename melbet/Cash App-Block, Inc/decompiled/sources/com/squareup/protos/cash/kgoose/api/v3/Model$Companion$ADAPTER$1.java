package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.Map;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/Model$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/Model;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Model$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Model((ModelProvider) obj, (String) obj2, (Map) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = ModelProvider.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(ProtoAdapter.STRUCT_MAP, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Model model = (Model) obj;
        reverseProtoWriter.getClass();
        model.getClass();
        reverseProtoWriter.writeBytes(model.unknownFields());
        ProtoAdapter.STRUCT_MAP.encodeWithTag(reverseProtoWriter, 3, model.extra_args);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, model.name);
        ModelProvider.ADAPTER.encodeWithTag(reverseProtoWriter, 1, model.provider);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Model model = (Model) obj;
        model.getClass();
        return ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(3, model.extra_args) + ProtoAdapter.STRING.encodedSizeWithTag(2, model.name) + ModelProvider.ADAPTER.encodedSizeWithTag(1, model.provider) + model.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Model model = (Model) obj;
        model.getClass();
        Map<String, ?> map = model.extra_args;
        Map map2 = map != null ? (Map) ProtoAdapter.STRUCT_MAP.redact(map) : null;
        ByteString byteString = ByteString.EMPTY;
        ModelProvider modelProvider = model.provider;
        String str = model.name;
        byteString.getClass();
        return new Model(modelProvider, str, map2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Model model = (Model) obj;
        model.getClass();
        ModelProvider.ADAPTER.encodeWithTag(protoWriter, 1, model.provider);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, model.name);
        ProtoAdapter.STRUCT_MAP.encodeWithTag(protoWriter, 3, model.extra_args);
        protoWriter.writeBytes(model.unknownFields());
    }
}
