package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import com.squareup.protos.lending.sync_values.BorrowLimitHubData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowLimitHubData$LimitProgressSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BorrowLimitHubData.LimitProgressSection((BorrowLimitHubData.LimitProgressSection.TextStack) obj, (BorrowLimitHubData.LimitProgressSection.TextStack) obj2, (BorrowLimitHubData.LimitProgressSection.SegmentedProgressBar) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(BorrowLimitHubData.LimitProgressSection.TextStack.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(BorrowLimitHubData.LimitProgressSection.TextStack.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(BorrowLimitHubData.LimitProgressSection.SegmentedProgressBar.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowLimitHubData.LimitProgressSection limitProgressSection = (BorrowLimitHubData.LimitProgressSection) obj;
        reverseProtoWriter.getClass();
        limitProgressSection.getClass();
        reverseProtoWriter.writeBytes(limitProgressSection.unknownFields());
        BorrowLimitHubData.LimitProgressSection.SegmentedProgressBar.ADAPTER.encodeWithTag(reverseProtoWriter, 3, limitProgressSection.progress_bar);
        ProtoAdapter protoAdapter = BorrowLimitHubData.LimitProgressSection.TextStack.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, limitProgressSection.trailing_text_stack);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, limitProgressSection.leading_text_stack);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowLimitHubData.LimitProgressSection limitProgressSection = (BorrowLimitHubData.LimitProgressSection) obj;
        limitProgressSection.getClass();
        int size$okio = limitProgressSection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = BorrowLimitHubData.LimitProgressSection.TextStack.ADAPTER;
        return BorrowLimitHubData.LimitProgressSection.SegmentedProgressBar.ADAPTER.encodedSizeWithTag(3, limitProgressSection.progress_bar) + protoAdapter.encodedSizeWithTag(2, limitProgressSection.trailing_text_stack) + protoAdapter.encodedSizeWithTag(1, limitProgressSection.leading_text_stack) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowLimitHubData.LimitProgressSection limitProgressSection = (BorrowLimitHubData.LimitProgressSection) obj;
        limitProgressSection.getClass();
        BorrowLimitHubData.LimitProgressSection.TextStack textStack = limitProgressSection.leading_text_stack;
        BorrowLimitHubData.LimitProgressSection.TextStack textStack2 = textStack != null ? (BorrowLimitHubData.LimitProgressSection.TextStack) BorrowLimitHubData.LimitProgressSection.TextStack.ADAPTER.redact(textStack) : null;
        BorrowLimitHubData.LimitProgressSection.TextStack textStack3 = limitProgressSection.trailing_text_stack;
        BorrowLimitHubData.LimitProgressSection.TextStack textStack4 = textStack3 != null ? (BorrowLimitHubData.LimitProgressSection.TextStack) BorrowLimitHubData.LimitProgressSection.TextStack.ADAPTER.redact(textStack3) : null;
        BorrowLimitHubData.LimitProgressSection.SegmentedProgressBar segmentedProgressBar = limitProgressSection.progress_bar;
        BorrowLimitHubData.LimitProgressSection.SegmentedProgressBar segmentedProgressBar2 = segmentedProgressBar != null ? (BorrowLimitHubData.LimitProgressSection.SegmentedProgressBar) BorrowLimitHubData.LimitProgressSection.SegmentedProgressBar.ADAPTER.redact(segmentedProgressBar) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BorrowLimitHubData.LimitProgressSection(textStack2, textStack4, segmentedProgressBar2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowLimitHubData.LimitProgressSection limitProgressSection = (BorrowLimitHubData.LimitProgressSection) obj;
        limitProgressSection.getClass();
        ProtoAdapter protoAdapter = BorrowLimitHubData.LimitProgressSection.TextStack.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, limitProgressSection.leading_text_stack);
        protoAdapter.encodeWithTag(protoWriter, 2, limitProgressSection.trailing_text_stack);
        BorrowLimitHubData.LimitProgressSection.SegmentedProgressBar.ADAPTER.encodeWithTag(protoWriter, 3, limitProgressSection.progress_bar);
        protoWriter.writeBytes(limitProgressSection.unknownFields());
    }
}
