package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.ui.Timeline;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class TimelineRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TimelineRenderData((Timeline) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Timeline.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TimelineRenderData timelineRenderData = (TimelineRenderData) obj;
        reverseProtoWriter.getClass();
        timelineRenderData.getClass();
        reverseProtoWriter.writeBytes(timelineRenderData.unknownFields());
        Timeline.ADAPTER.encodeWithTag(reverseProtoWriter, 1, timelineRenderData.timeline);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TimelineRenderData timelineRenderData = (TimelineRenderData) obj;
        timelineRenderData.getClass();
        return Timeline.ADAPTER.encodedSizeWithTag(1, timelineRenderData.timeline) + timelineRenderData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TimelineRenderData timelineRenderData = (TimelineRenderData) obj;
        timelineRenderData.getClass();
        Timeline timeline = timelineRenderData.timeline;
        Timeline timeline2 = timeline != null ? (Timeline) Timeline.ADAPTER.redact(timeline) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new TimelineRenderData(timeline2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TimelineRenderData timelineRenderData = (TimelineRenderData) obj;
        timelineRenderData.getClass();
        Timeline.ADAPTER.encodeWithTag(protoWriter, 1, timelineRenderData.timeline);
        protoWriter.writeBytes(timelineRenderData.unknownFields());
    }
}
