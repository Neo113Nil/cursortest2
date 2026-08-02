package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.kgoose.api.v3.CompositionChart;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/CompositionChart$Segment$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/CompositionChart$Segment;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CompositionChart$Segment$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CompositionChart.Segment((Color) obj2, (Float) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.FLOAT.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CompositionChart.Segment segment = (CompositionChart.Segment) obj;
        reverseProtoWriter.getClass();
        segment.getClass();
        reverseProtoWriter.writeBytes(segment.unknownFields());
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 2, segment.color);
        ProtoAdapter.FLOAT.encodeWithTag(reverseProtoWriter, 1, segment.fraction);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CompositionChart.Segment segment = (CompositionChart.Segment) obj;
        segment.getClass();
        return Color.ADAPTER.encodedSizeWithTag(2, segment.color) + ProtoAdapter.FLOAT.encodedSizeWithTag(1, segment.fraction) + segment.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CompositionChart.Segment segment = (CompositionChart.Segment) obj;
        segment.getClass();
        Color color = segment.color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        Float f = segment.fraction;
        byteString.getClass();
        return new CompositionChart.Segment(color2, f, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CompositionChart.Segment segment = (CompositionChart.Segment) obj;
        segment.getClass();
        ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 1, segment.fraction);
        Color.ADAPTER.encodeWithTag(protoWriter, 2, segment.color);
        protoWriter.writeBytes(segment.unknownFields());
    }
}
