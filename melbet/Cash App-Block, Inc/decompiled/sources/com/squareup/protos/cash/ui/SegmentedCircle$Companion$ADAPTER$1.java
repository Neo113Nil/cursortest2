package com.squareup.protos.cash.ui;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.SegmentedCircle;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SegmentedCircle$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SegmentedCircle((LocalizedString) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(SegmentedCircle.Segment.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SegmentedCircle segmentedCircle = (SegmentedCircle) obj;
        reverseProtoWriter.getClass();
        segmentedCircle.getClass();
        reverseProtoWriter.writeBytes(segmentedCircle.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, segmentedCircle.accessibility_description);
        SegmentedCircle.Segment.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, segmentedCircle.segments);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SegmentedCircle segmentedCircle = (SegmentedCircle) obj;
        segmentedCircle.getClass();
        return LocalizedString.ADAPTER.encodedSizeWithTag(2, segmentedCircle.accessibility_description) + SegmentedCircle.Segment.ADAPTER.asRepeated().encodedSizeWithTag(1, segmentedCircle.segments) + segmentedCircle.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SegmentedCircle segmentedCircle = (SegmentedCircle) obj;
        segmentedCircle.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(segmentedCircle.segments, SegmentedCircle.Segment.ADAPTER);
        LocalizedString localizedString = segmentedCircle.accessibility_description;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SegmentedCircle(localizedString2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SegmentedCircle segmentedCircle = (SegmentedCircle) obj;
        segmentedCircle.getClass();
        SegmentedCircle.Segment.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, segmentedCircle.segments);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 2, segmentedCircle.accessibility_description);
        protoWriter.writeBytes(segmentedCircle.unknownFields());
    }
}
