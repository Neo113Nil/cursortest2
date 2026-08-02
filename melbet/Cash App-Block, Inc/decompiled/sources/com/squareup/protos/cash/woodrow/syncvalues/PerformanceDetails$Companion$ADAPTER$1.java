package com.squareup.protos.cash.woodrow.syncvalues;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.time.Instant;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PerformanceDetails$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PerformanceDetails(m, arrayList, (Instant) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(AcquisitionSummary.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                arrayList.add(DispositionSummary.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(ProtoAdapter.INSTANT, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PerformanceDetails performanceDetails = (PerformanceDetails) obj;
        reverseProtoWriter.getClass();
        performanceDetails.getClass();
        reverseProtoWriter.writeBytes(performanceDetails.unknownFields());
        Instant instant = performanceDetails.version;
        if (instant != null) {
            ProtoAdapter.INSTANT.encodeWithTag(reverseProtoWriter, 4, instant);
        }
        DispositionSummary.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, performanceDetails.disposition_summaries);
        AcquisitionSummary.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, performanceDetails.acquisition_summaries);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PerformanceDetails performanceDetails = (PerformanceDetails) obj;
        performanceDetails.getClass();
        int encodedSizeWithTag = DispositionSummary.ADAPTER.asRepeated().encodedSizeWithTag(2, performanceDetails.disposition_summaries) + AcquisitionSummary.ADAPTER.asRepeated().encodedSizeWithTag(1, performanceDetails.acquisition_summaries) + performanceDetails.unknownFields().getSize$okio();
        Instant instant = performanceDetails.version;
        return instant != null ? ProtoAdapter.INSTANT.encodedSizeWithTag(4, instant) + encodedSizeWithTag : encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PerformanceDetails performanceDetails = (PerformanceDetails) obj;
        performanceDetails.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(performanceDetails.acquisition_summaries, AcquisitionSummary.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(performanceDetails.disposition_summaries, DispositionSummary.ADAPTER);
        Instant instant = performanceDetails.version;
        Instant instant2 = instant != null ? (Instant) ProtoAdapter.INSTANT.redact(instant) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new PerformanceDetails(m1169redactElements, m1169redactElements2, instant2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PerformanceDetails performanceDetails = (PerformanceDetails) obj;
        performanceDetails.getClass();
        AcquisitionSummary.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, performanceDetails.acquisition_summaries);
        DispositionSummary.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, performanceDetails.disposition_summaries);
        Instant instant = performanceDetails.version;
        if (instant != null) {
            ProtoAdapter.INSTANT.encodeWithTag(protoWriter, 4, instant);
        }
        protoWriter.writeBytes(performanceDetails.unknownFields());
    }
}
