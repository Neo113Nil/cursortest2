package com.squareup.protos.cash.woodrow.syncvalues;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PerformanceDetailsUi$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PerformanceDetailsUi((PerformanceDetailsUiSections) obj, (PerformanceDetailsUiFooter) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(PerformanceDetailsUiSections.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(PerformanceDetailsUiFooter.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PerformanceDetailsUi performanceDetailsUi = (PerformanceDetailsUi) obj;
        reverseProtoWriter.getClass();
        performanceDetailsUi.getClass();
        reverseProtoWriter.writeBytes(performanceDetailsUi.unknownFields());
        PerformanceDetailsUiFooter performanceDetailsUiFooter = performanceDetailsUi.footer;
        if (performanceDetailsUiFooter != null) {
            PerformanceDetailsUiFooter.ADAPTER.encodeWithTag(reverseProtoWriter, 2, performanceDetailsUiFooter);
        }
        PerformanceDetailsUiSections performanceDetailsUiSections = performanceDetailsUi.sections;
        if (performanceDetailsUiSections != null) {
            PerformanceDetailsUiSections.ADAPTER.encodeWithTag(reverseProtoWriter, 1, performanceDetailsUiSections);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PerformanceDetailsUi performanceDetailsUi = (PerformanceDetailsUi) obj;
        performanceDetailsUi.getClass();
        int size$okio = performanceDetailsUi.unknownFields().getSize$okio();
        PerformanceDetailsUiSections performanceDetailsUiSections = performanceDetailsUi.sections;
        if (performanceDetailsUiSections != null) {
            size$okio += PerformanceDetailsUiSections.ADAPTER.encodedSizeWithTag(1, performanceDetailsUiSections);
        }
        PerformanceDetailsUiFooter performanceDetailsUiFooter = performanceDetailsUi.footer;
        return performanceDetailsUiFooter != null ? PerformanceDetailsUiFooter.ADAPTER.encodedSizeWithTag(2, performanceDetailsUiFooter) + size$okio : size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PerformanceDetailsUi performanceDetailsUi = (PerformanceDetailsUi) obj;
        performanceDetailsUi.getClass();
        PerformanceDetailsUiSections performanceDetailsUiSections = performanceDetailsUi.sections;
        PerformanceDetailsUiSections performanceDetailsUiSections2 = performanceDetailsUiSections != null ? (PerformanceDetailsUiSections) PerformanceDetailsUiSections.ADAPTER.redact(performanceDetailsUiSections) : null;
        PerformanceDetailsUiFooter performanceDetailsUiFooter = performanceDetailsUi.footer;
        PerformanceDetailsUiFooter performanceDetailsUiFooter2 = performanceDetailsUiFooter != null ? (PerformanceDetailsUiFooter) PerformanceDetailsUiFooter.ADAPTER.redact(performanceDetailsUiFooter) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new PerformanceDetailsUi(performanceDetailsUiSections2, performanceDetailsUiFooter2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PerformanceDetailsUi performanceDetailsUi = (PerformanceDetailsUi) obj;
        performanceDetailsUi.getClass();
        PerformanceDetailsUiSections performanceDetailsUiSections = performanceDetailsUi.sections;
        if (performanceDetailsUiSections != null) {
            PerformanceDetailsUiSections.ADAPTER.encodeWithTag(protoWriter, 1, performanceDetailsUiSections);
        }
        PerformanceDetailsUiFooter performanceDetailsUiFooter = performanceDetailsUi.footer;
        if (performanceDetailsUiFooter != null) {
            PerformanceDetailsUiFooter.ADAPTER.encodeWithTag(protoWriter, 2, performanceDetailsUiFooter);
        }
        protoWriter.writeBytes(performanceDetailsUi.unknownFields());
    }
}
