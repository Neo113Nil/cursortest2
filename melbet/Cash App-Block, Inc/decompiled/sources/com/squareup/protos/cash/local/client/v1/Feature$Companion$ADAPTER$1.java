package com.squareup.protos.cash.local.client.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Feature$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Feature((Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Feature feature = (Feature) obj;
        reverseProtoWriter.getClass();
        feature.getClass();
        reverseProtoWriter.writeBytes(feature.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, feature.enabled);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Feature feature = (Feature) obj;
        feature.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(1, feature.enabled) + feature.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Feature feature = (Feature) obj;
        feature.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = feature.enabled;
        byteString.getClass();
        return new Feature(bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Feature feature = (Feature) obj;
        feature.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, feature.enabled);
        protoWriter.writeBytes(feature.unknownFields());
    }
}
