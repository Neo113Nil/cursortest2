package com.squareup.protos.cash.discover.api.app.v1.model;

import com.squareup.protos.cash.discover.api.app.v1.model.GraphSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GraphSection$Point$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GraphSection.Point((Double) obj, (Double) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.DOUBLE.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.DOUBLE.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GraphSection.Point point = (GraphSection.Point) obj;
        reverseProtoWriter.getClass();
        point.getClass();
        reverseProtoWriter.writeBytes(point.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.DOUBLE;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, point.y_value);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, point.x_value);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GraphSection.Point point = (GraphSection.Point) obj;
        point.getClass();
        int size$okio = point.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.DOUBLE;
        return protoAdapter.encodedSizeWithTag(2, point.y_value) + protoAdapter.encodedSizeWithTag(1, point.x_value) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GraphSection.Point point = (GraphSection.Point) obj;
        point.getClass();
        ByteString byteString = ByteString.EMPTY;
        Double d = point.x_value;
        Double d2 = point.y_value;
        byteString.getClass();
        return new GraphSection.Point(d, d2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GraphSection.Point point = (GraphSection.Point) obj;
        point.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.DOUBLE;
        protoAdapter.encodeWithTag(protoWriter, 1, point.x_value);
        protoAdapter.encodeWithTag(protoWriter, 2, point.y_value);
        protoWriter.writeBytes(point.unknownFields());
    }
}
