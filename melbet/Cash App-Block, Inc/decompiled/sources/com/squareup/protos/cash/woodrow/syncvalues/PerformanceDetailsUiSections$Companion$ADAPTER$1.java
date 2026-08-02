package com.squareup.protos.cash.woodrow.syncvalues;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PerformanceDetailsUiSections$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PerformanceDetailsUiSections(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(PerformanceDetailsUiSection.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PerformanceDetailsUiSections performanceDetailsUiSections = (PerformanceDetailsUiSections) obj;
        reverseProtoWriter.getClass();
        performanceDetailsUiSections.getClass();
        reverseProtoWriter.writeBytes(performanceDetailsUiSections.unknownFields());
        PerformanceDetailsUiSection.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, performanceDetailsUiSections.sections);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PerformanceDetailsUiSections performanceDetailsUiSections = (PerformanceDetailsUiSections) obj;
        performanceDetailsUiSections.getClass();
        return PerformanceDetailsUiSection.ADAPTER.asRepeated().encodedSizeWithTag(1, performanceDetailsUiSections.sections) + performanceDetailsUiSections.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PerformanceDetailsUiSections performanceDetailsUiSections = (PerformanceDetailsUiSections) obj;
        performanceDetailsUiSections.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(performanceDetailsUiSections.sections, PerformanceDetailsUiSection.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new PerformanceDetailsUiSections(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PerformanceDetailsUiSections performanceDetailsUiSections = (PerformanceDetailsUiSections) obj;
        performanceDetailsUiSections.getClass();
        PerformanceDetailsUiSection.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, performanceDetailsUiSections.sections);
        protoWriter.writeBytes(performanceDetailsUiSections.unknownFields());
    }
}
