package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.lending.sync_values.BorrowLimitHubData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowLimitHubData$LimitProgressSection$SegmentedProgressBar$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BorrowLimitHubData.LimitProgressSection.SegmentedProgressBar((LocalizedString) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(BorrowLimitHubData.LimitProgressSection.SegmentedProgressBar.Segment.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowLimitHubData.LimitProgressSection.SegmentedProgressBar segmentedProgressBar = (BorrowLimitHubData.LimitProgressSection.SegmentedProgressBar) obj;
        reverseProtoWriter.getClass();
        segmentedProgressBar.getClass();
        reverseProtoWriter.writeBytes(segmentedProgressBar.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, segmentedProgressBar.accessibility_description);
        BorrowLimitHubData.LimitProgressSection.SegmentedProgressBar.Segment.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, segmentedProgressBar.segments);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowLimitHubData.LimitProgressSection.SegmentedProgressBar segmentedProgressBar = (BorrowLimitHubData.LimitProgressSection.SegmentedProgressBar) obj;
        segmentedProgressBar.getClass();
        return LocalizedString.ADAPTER.encodedSizeWithTag(2, segmentedProgressBar.accessibility_description) + BorrowLimitHubData.LimitProgressSection.SegmentedProgressBar.Segment.ADAPTER.asRepeated().encodedSizeWithTag(1, segmentedProgressBar.segments) + segmentedProgressBar.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowLimitHubData.LimitProgressSection.SegmentedProgressBar segmentedProgressBar = (BorrowLimitHubData.LimitProgressSection.SegmentedProgressBar) obj;
        segmentedProgressBar.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(segmentedProgressBar.segments, BorrowLimitHubData.LimitProgressSection.SegmentedProgressBar.Segment.ADAPTER);
        LocalizedString localizedString = segmentedProgressBar.accessibility_description;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BorrowLimitHubData.LimitProgressSection.SegmentedProgressBar(localizedString2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowLimitHubData.LimitProgressSection.SegmentedProgressBar segmentedProgressBar = (BorrowLimitHubData.LimitProgressSection.SegmentedProgressBar) obj;
        segmentedProgressBar.getClass();
        BorrowLimitHubData.LimitProgressSection.SegmentedProgressBar.Segment.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, segmentedProgressBar.segments);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 2, segmentedProgressBar.accessibility_description);
        protoWriter.writeBytes(segmentedProgressBar.unknownFields());
    }
}
