package com.squareup.protos.cash.local.client.app.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.badging.api.BadgeCounts;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ReportMarketingMessageViewedResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ReportMarketingMessageViewedResponse(m, (BadgeCounts) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(BadgeCounts.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ReportMarketingMessageViewedResponse reportMarketingMessageViewedResponse = (ReportMarketingMessageViewedResponse) obj;
        reverseProtoWriter.getClass();
        reportMarketingMessageViewedResponse.getClass();
        reverseProtoWriter.writeBytes(reportMarketingMessageViewedResponse.unknownFields());
        BadgeCounts.ADAPTER.encodeWithTag(reverseProtoWriter, 2, reportMarketingMessageViewedResponse.badge_counts);
        ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 1, reportMarketingMessageViewedResponse.successfully_viewed_tokens);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ReportMarketingMessageViewedResponse reportMarketingMessageViewedResponse = (ReportMarketingMessageViewedResponse) obj;
        reportMarketingMessageViewedResponse.getClass();
        return BadgeCounts.ADAPTER.encodedSizeWithTag(2, reportMarketingMessageViewedResponse.badge_counts) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, reportMarketingMessageViewedResponse.successfully_viewed_tokens) + reportMarketingMessageViewedResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ReportMarketingMessageViewedResponse reportMarketingMessageViewedResponse = (ReportMarketingMessageViewedResponse) obj;
        reportMarketingMessageViewedResponse.getClass();
        BadgeCounts badgeCounts = reportMarketingMessageViewedResponse.badge_counts;
        BadgeCounts badgeCounts2 = badgeCounts != null ? (BadgeCounts) BadgeCounts.ADAPTER.redact(badgeCounts) : null;
        ByteString byteString = ByteString.EMPTY;
        List list = reportMarketingMessageViewedResponse.successfully_viewed_tokens;
        list.getClass();
        byteString.getClass();
        return new ReportMarketingMessageViewedResponse(list, badgeCounts2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ReportMarketingMessageViewedResponse reportMarketingMessageViewedResponse = (ReportMarketingMessageViewedResponse) obj;
        reportMarketingMessageViewedResponse.getClass();
        ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, reportMarketingMessageViewedResponse.successfully_viewed_tokens);
        BadgeCounts.ADAPTER.encodeWithTag(protoWriter, 2, reportMarketingMessageViewedResponse.badge_counts);
        protoWriter.writeBytes(reportMarketingMessageViewedResponse.unknownFields());
    }
}
