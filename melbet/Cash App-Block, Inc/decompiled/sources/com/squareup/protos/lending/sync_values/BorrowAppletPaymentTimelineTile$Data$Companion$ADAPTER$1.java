package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.ui.Timeline;
import com.squareup.protos.lending.LoanRepaymentSelectionData;
import com.squareup.protos.lending.sync_values.BorrowAppletPaymentTimelineTile;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowAppletPaymentTimelineTile$Data$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BorrowAppletPaymentTimelineTile.Data((LocalizedString) obj, (Timeline) obj2, (BorrowAppletPaymentTimelineTile.Data.Button) obj3, (LoanRepaymentSelectionData) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 3) {
                obj2 = TransactorKt.decodeMessageOrMerge(Timeline.ADAPTER, protoReader, obj2);
            } else if (nextTag == 4) {
                obj3 = TransactorKt.decodeMessageOrMerge(BorrowAppletPaymentTimelineTile.Data.Button.ADAPTER, protoReader, obj3);
            } else if (nextTag == 5) {
                obj4 = TransactorKt.decodeMessageOrMerge(LoanRepaymentSelectionData.ADAPTER, protoReader, obj4);
            } else if (nextTag != 6) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowAppletPaymentTimelineTile.Data data = (BorrowAppletPaymentTimelineTile.Data) obj;
        reverseProtoWriter.getClass();
        data.getClass();
        reverseProtoWriter.writeBytes(data.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 6, data.identifier);
        LoanRepaymentSelectionData.ADAPTER.encodeWithTag(reverseProtoWriter, 5, data.repayment_selection);
        BorrowAppletPaymentTimelineTile.Data.Button.ADAPTER.encodeWithTag(reverseProtoWriter, 4, data.button);
        Timeline.ADAPTER.encodeWithTag(reverseProtoWriter, 3, data.timeline);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, data.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowAppletPaymentTimelineTile.Data data = (BorrowAppletPaymentTimelineTile.Data) obj;
        data.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(6, data.identifier) + LoanRepaymentSelectionData.ADAPTER.encodedSizeWithTag(5, data.repayment_selection) + BorrowAppletPaymentTimelineTile.Data.Button.ADAPTER.encodedSizeWithTag(4, data.button) + Timeline.ADAPTER.encodedSizeWithTag(3, data.timeline) + LocalizedString.ADAPTER.encodedSizeWithTag(1, data.title) + data.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowAppletPaymentTimelineTile.Data data = (BorrowAppletPaymentTimelineTile.Data) obj;
        data.getClass();
        LocalizedString localizedString = data.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        Timeline timeline = data.timeline;
        Timeline timeline2 = timeline != null ? (Timeline) Timeline.ADAPTER.redact(timeline) : null;
        BorrowAppletPaymentTimelineTile.Data.Button button = data.button;
        BorrowAppletPaymentTimelineTile.Data.Button button2 = button != null ? (BorrowAppletPaymentTimelineTile.Data.Button) BorrowAppletPaymentTimelineTile.Data.Button.ADAPTER.redact(button) : null;
        LoanRepaymentSelectionData loanRepaymentSelectionData = data.repayment_selection;
        LoanRepaymentSelectionData loanRepaymentSelectionData2 = loanRepaymentSelectionData != null ? (LoanRepaymentSelectionData) LoanRepaymentSelectionData.ADAPTER.redact(loanRepaymentSelectionData) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = data.identifier;
        byteString.getClass();
        return new BorrowAppletPaymentTimelineTile.Data(localizedString2, timeline2, button2, loanRepaymentSelectionData2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowAppletPaymentTimelineTile.Data data = (BorrowAppletPaymentTimelineTile.Data) obj;
        data.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, data.title);
        Timeline.ADAPTER.encodeWithTag(protoWriter, 3, data.timeline);
        BorrowAppletPaymentTimelineTile.Data.Button.ADAPTER.encodeWithTag(protoWriter, 4, data.button);
        LoanRepaymentSelectionData.ADAPTER.encodeWithTag(protoWriter, 5, data.repayment_selection);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, data.identifier);
        protoWriter.writeBytes(data.unknownFields());
    }
}
