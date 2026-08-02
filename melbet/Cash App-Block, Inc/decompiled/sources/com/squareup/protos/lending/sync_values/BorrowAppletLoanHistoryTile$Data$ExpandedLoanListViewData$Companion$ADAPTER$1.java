package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowAppletLoanHistoryTile$Data$ExpandedLoanListViewData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BorrowAppletLoanHistoryTile.Data.ExpandedLoanListViewData((LocalizedString) obj, (LocalizedString) obj2, (LocalizedString) obj3, (LocalizedString) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowAppletLoanHistoryTile.Data.ExpandedLoanListViewData expandedLoanListViewData = (BorrowAppletLoanHistoryTile.Data.ExpandedLoanListViewData) obj;
        reverseProtoWriter.getClass();
        expandedLoanListViewData.getClass();
        reverseProtoWriter.writeBytes(expandedLoanListViewData.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, expandedLoanListViewData.history_tile_expand_button_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, expandedLoanListViewData.list_header);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, expandedLoanListViewData.title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, expandedLoanListViewData.expand_button_title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowAppletLoanHistoryTile.Data.ExpandedLoanListViewData expandedLoanListViewData = (BorrowAppletLoanHistoryTile.Data.ExpandedLoanListViewData) obj;
        expandedLoanListViewData.getClass();
        int size$okio = expandedLoanListViewData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(4, expandedLoanListViewData.history_tile_expand_button_title) + protoAdapter.encodedSizeWithTag(3, expandedLoanListViewData.list_header) + protoAdapter.encodedSizeWithTag(2, expandedLoanListViewData.title) + protoAdapter.encodedSizeWithTag(1, expandedLoanListViewData.expand_button_title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowAppletLoanHistoryTile.Data.ExpandedLoanListViewData expandedLoanListViewData = (BorrowAppletLoanHistoryTile.Data.ExpandedLoanListViewData) obj;
        expandedLoanListViewData.getClass();
        LocalizedString localizedString = expandedLoanListViewData.expand_button_title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = expandedLoanListViewData.title;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizedString localizedString5 = expandedLoanListViewData.list_header;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        LocalizedString localizedString7 = expandedLoanListViewData.history_tile_expand_button_title;
        LocalizedString localizedString8 = localizedString7 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString7) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BorrowAppletLoanHistoryTile.Data.ExpandedLoanListViewData(localizedString2, localizedString4, localizedString6, localizedString8, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowAppletLoanHistoryTile.Data.ExpandedLoanListViewData expandedLoanListViewData = (BorrowAppletLoanHistoryTile.Data.ExpandedLoanListViewData) obj;
        expandedLoanListViewData.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, expandedLoanListViewData.expand_button_title);
        protoAdapter.encodeWithTag(protoWriter, 2, expandedLoanListViewData.title);
        protoAdapter.encodeWithTag(protoWriter, 3, expandedLoanListViewData.list_header);
        protoAdapter.encodeWithTag(protoWriter, 4, expandedLoanListViewData.history_tile_expand_button_title);
        protoWriter.writeBytes(expandedLoanListViewData.unknownFields());
    }
}
