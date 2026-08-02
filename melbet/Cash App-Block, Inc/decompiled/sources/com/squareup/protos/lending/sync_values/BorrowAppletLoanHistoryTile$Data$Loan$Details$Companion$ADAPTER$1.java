package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.ui.Timeline;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowAppletLoanHistoryTile$Data$Loan$Details$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BorrowAppletLoanHistoryTile.Data.Loan.Details((LocalizedString) obj, (LocalizedString) obj2, m, (Timeline) obj3, (LocalizedString) obj4, (LocalizedString) obj5, (BorrowAppletLoanHistoryTile.Data.Loan.Details.ButtonData) obj6, (Color) obj7, (String) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    m.add(BorrowAppletLoanHistoryTile.Data.Loan.Details.Row.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    obj3 = TransactorKt.decodeMessageOrMerge(Timeline.ADAPTER, protoReader, obj3);
                    break;
                case 5:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
                    break;
                case 6:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
                    break;
                case 7:
                    obj6 = TransactorKt.decodeMessageOrMerge(BorrowAppletLoanHistoryTile.Data.Loan.Details.ButtonData.ADAPTER, protoReader, obj6);
                    break;
                case 8:
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
                case 9:
                    obj7 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj7);
                    break;
                case 10:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowAppletLoanHistoryTile.Data.Loan.Details details = (BorrowAppletLoanHistoryTile.Data.Loan.Details) obj;
        reverseProtoWriter.getClass();
        details.getClass();
        reverseProtoWriter.writeBytes(details.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 10, details.cdf_variant);
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 9, details.secondary_text_tint_color);
        BorrowAppletLoanHistoryTile.Data.Loan.Details.ButtonData.ADAPTER.encodeWithTag(reverseProtoWriter, 7, details.repayment_button_data);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, details.details_button_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, details.timeline_button_title);
        Timeline.ADAPTER.encodeWithTag(reverseProtoWriter, 4, details.timeline);
        BorrowAppletLoanHistoryTile.Data.Loan.Details.Row.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, details.rows);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, details.secondary_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, details.primary_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowAppletLoanHistoryTile.Data.Loan.Details details = (BorrowAppletLoanHistoryTile.Data.Loan.Details) obj;
        details.getClass();
        int size$okio = details.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return ProtoAdapter.STRING.encodedSizeWithTag(10, details.cdf_variant) + Color.ADAPTER.encodedSizeWithTag(9, details.secondary_text_tint_color) + BorrowAppletLoanHistoryTile.Data.Loan.Details.ButtonData.ADAPTER.encodedSizeWithTag(7, details.repayment_button_data) + protoAdapter.encodedSizeWithTag(6, details.details_button_title) + protoAdapter.encodedSizeWithTag(5, details.timeline_button_title) + Timeline.ADAPTER.encodedSizeWithTag(4, details.timeline) + BorrowAppletLoanHistoryTile.Data.Loan.Details.Row.ADAPTER.asRepeated().encodedSizeWithTag(3, details.rows) + protoAdapter.encodedSizeWithTag(2, details.secondary_text) + protoAdapter.encodedSizeWithTag(1, details.primary_text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowAppletLoanHistoryTile.Data.Loan.Details details = (BorrowAppletLoanHistoryTile.Data.Loan.Details) obj;
        details.getClass();
        LocalizedString localizedString = details.primary_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = details.secondary_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(details.rows, BorrowAppletLoanHistoryTile.Data.Loan.Details.Row.ADAPTER);
        Timeline timeline = details.timeline;
        Timeline timeline2 = timeline != null ? (Timeline) Timeline.ADAPTER.redact(timeline) : null;
        LocalizedString localizedString5 = details.timeline_button_title;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        LocalizedString localizedString7 = details.details_button_title;
        LocalizedString localizedString8 = localizedString7 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString7) : null;
        BorrowAppletLoanHistoryTile.Data.Loan.Details.ButtonData buttonData = details.repayment_button_data;
        BorrowAppletLoanHistoryTile.Data.Loan.Details.ButtonData buttonData2 = buttonData != null ? (BorrowAppletLoanHistoryTile.Data.Loan.Details.ButtonData) BorrowAppletLoanHistoryTile.Data.Loan.Details.ButtonData.ADAPTER.redact(buttonData) : null;
        Color color = details.secondary_text_tint_color;
        return BorrowAppletLoanHistoryTile.Data.Loan.Details.copy$default(details, localizedString2, localizedString4, m1169redactElements, timeline2, localizedString6, localizedString8, buttonData2, color != null ? (Color) Color.ADAPTER.redact(color) : null, ByteString.EMPTY, 256);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowAppletLoanHistoryTile.Data.Loan.Details details = (BorrowAppletLoanHistoryTile.Data.Loan.Details) obj;
        details.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, details.primary_text);
        protoAdapter.encodeWithTag(protoWriter, 2, details.secondary_text);
        BorrowAppletLoanHistoryTile.Data.Loan.Details.Row.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, details.rows);
        Timeline.ADAPTER.encodeWithTag(protoWriter, 4, details.timeline);
        protoAdapter.encodeWithTag(protoWriter, 5, details.timeline_button_title);
        protoAdapter.encodeWithTag(protoWriter, 6, details.details_button_title);
        BorrowAppletLoanHistoryTile.Data.Loan.Details.ButtonData.ADAPTER.encodeWithTag(protoWriter, 7, details.repayment_button_data);
        Color.ADAPTER.encodeWithTag(protoWriter, 9, details.secondary_text_tint_color);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, details.cdf_variant);
        protoWriter.writeBytes(details.unknownFields());
    }
}
