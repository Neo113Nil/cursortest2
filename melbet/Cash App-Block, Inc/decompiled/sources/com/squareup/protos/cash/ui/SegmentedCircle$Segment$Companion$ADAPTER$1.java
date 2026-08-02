package com.squareup.protos.cash.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.SegmentedCircle;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SegmentedCircle$Segment$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SegmentedCircle.Segment((Color) obj, (Float) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.FLOAT.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SegmentedCircle.Segment segment = (SegmentedCircle.Segment) obj;
        reverseProtoWriter.getClass();
        segment.getClass();
        reverseProtoWriter.writeBytes(segment.unknownFields());
        ProtoAdapter.FLOAT.encodeWithTag(reverseProtoWriter, 2, segment.percent);
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 1, segment.color);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SegmentedCircle.Segment segment = (SegmentedCircle.Segment) obj;
        segment.getClass();
        return ProtoAdapter.FLOAT.encodedSizeWithTag(2, segment.percent) + Color.ADAPTER.encodedSizeWithTag(1, segment.color) + segment.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SegmentedCircle.Segment segment = (SegmentedCircle.Segment) obj;
        segment.getClass();
        Color color = segment.color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        Float f = segment.percent;
        byteString.getClass();
        return new SegmentedCircle.Segment(color2, f, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SegmentedCircle.Segment segment = (SegmentedCircle.Segment) obj;
        segment.getClass();
        Color.ADAPTER.encodeWithTag(protoWriter, 1, segment.color);
        ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 2, segment.percent);
        protoWriter.writeBytes(segment.unknownFields());
    }
}
