package com.squareup.protos.cash.kgoose.api.v3;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ResourceAnnotations$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ResourceAnnotations;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ResourceAnnotations$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ResourceAnnotations(m, (String) obj, (Double) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    Role.ADAPTER.tryDecode(protoReader, m);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.DOUBLE.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ResourceAnnotations resourceAnnotations = (ResourceAnnotations) obj;
        reverseProtoWriter.getClass();
        resourceAnnotations.getClass();
        reverseProtoWriter.writeBytes(resourceAnnotations.unknownFields());
        ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 3, resourceAnnotations.priority);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, resourceAnnotations.last_modified);
        Role.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, resourceAnnotations.audience);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ResourceAnnotations resourceAnnotations = (ResourceAnnotations) obj;
        resourceAnnotations.getClass();
        return ProtoAdapter.DOUBLE.encodedSizeWithTag(3, resourceAnnotations.priority) + ProtoAdapter.STRING.encodedSizeWithTag(2, resourceAnnotations.last_modified) + Role.ADAPTER.asRepeated().encodedSizeWithTag(1, resourceAnnotations.audience) + resourceAnnotations.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ResourceAnnotations resourceAnnotations = (ResourceAnnotations) obj;
        resourceAnnotations.getClass();
        ByteString byteString = ByteString.EMPTY;
        List<Role> list = resourceAnnotations.audience;
        String str = resourceAnnotations.last_modified;
        Double d = resourceAnnotations.priority;
        list.getClass();
        byteString.getClass();
        return new ResourceAnnotations(list, str, d, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ResourceAnnotations resourceAnnotations = (ResourceAnnotations) obj;
        resourceAnnotations.getClass();
        Role.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, resourceAnnotations.audience);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, resourceAnnotations.last_modified);
        ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 3, resourceAnnotations.priority);
        protoWriter.writeBytes(resourceAnnotations.unknownFields());
    }
}
