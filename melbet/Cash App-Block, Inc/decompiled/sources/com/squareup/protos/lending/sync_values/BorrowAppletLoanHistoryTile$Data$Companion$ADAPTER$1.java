package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowAppletLoanHistoryTile$Data$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BorrowAppletLoanHistoryTile.Data((LocalizedString) obj, m, (BorrowAppletLoanHistoryTile.Data.ExpandedLoanListViewData) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                m.add(BorrowAppletLoanHistoryTile.Data.Loan.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(BorrowAppletLoanHistoryTile.Data.ExpandedLoanListViewData.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowAppletLoanHistoryTile.Data data = (BorrowAppletLoanHistoryTile.Data) obj;
        reverseProtoWriter.getClass();
        data.getClass();
        reverseProtoWriter.writeBytes(data.unknownFields());
        BorrowAppletLoanHistoryTile.Data.ExpandedLoanListViewData.ADAPTER.encodeWithTag(reverseProtoWriter, 3, data.expanded_loan_list_view_data);
        BorrowAppletLoanHistoryTile.Data.Loan.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, data.loans);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, data.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowAppletLoanHistoryTile.Data data = (BorrowAppletLoanHistoryTile.Data) obj;
        data.getClass();
        return BorrowAppletLoanHistoryTile.Data.ExpandedLoanListViewData.ADAPTER.encodedSizeWithTag(3, data.expanded_loan_list_view_data) + BorrowAppletLoanHistoryTile.Data.Loan.ADAPTER.asRepeated().encodedSizeWithTag(2, data.loans) + LocalizedString.ADAPTER.encodedSizeWithTag(1, data.title) + data.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowAppletLoanHistoryTile.Data data = (BorrowAppletLoanHistoryTile.Data) obj;
        data.getClass();
        LocalizedString localizedString = data.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(data.loans, BorrowAppletLoanHistoryTile.Data.Loan.ADAPTER);
        BorrowAppletLoanHistoryTile.Data.ExpandedLoanListViewData expandedLoanListViewData = data.expanded_loan_list_view_data;
        BorrowAppletLoanHistoryTile.Data.ExpandedLoanListViewData expandedLoanListViewData2 = expandedLoanListViewData != null ? (BorrowAppletLoanHistoryTile.Data.ExpandedLoanListViewData) BorrowAppletLoanHistoryTile.Data.ExpandedLoanListViewData.ADAPTER.redact(expandedLoanListViewData) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BorrowAppletLoanHistoryTile.Data(localizedString2, m1169redactElements, expandedLoanListViewData2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowAppletLoanHistoryTile.Data data = (BorrowAppletLoanHistoryTile.Data) obj;
        data.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, data.title);
        BorrowAppletLoanHistoryTile.Data.Loan.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, data.loans);
        BorrowAppletLoanHistoryTile.Data.ExpandedLoanListViewData.ADAPTER.encodeWithTag(protoWriter, 3, data.expanded_loan_list_view_data);
        protoWriter.writeBytes(data.unknownFields());
    }
}
