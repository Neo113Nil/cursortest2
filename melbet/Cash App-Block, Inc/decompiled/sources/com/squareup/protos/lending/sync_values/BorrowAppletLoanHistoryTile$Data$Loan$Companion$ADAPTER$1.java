package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowAppletLoanHistoryTile$Data$Loan$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BorrowAppletLoanHistoryTile.Data.Loan((LocalizedString) obj, (LocalizedString) obj2, (LocalizedString) obj3, (BorrowAppletLoanHistoryTile.Data.Loan.Details) obj4, (String) obj5, (Color) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(BorrowAppletLoanHistoryTile.Data.Loan.Details.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowAppletLoanHistoryTile.Data.Loan loan = (BorrowAppletLoanHistoryTile.Data.Loan) obj;
        reverseProtoWriter.getClass();
        loan.getClass();
        reverseProtoWriter.writeBytes(loan.unknownFields());
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 6, loan.secondary_text_tint_color);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 5, loan.legacy_reference_token);
        BorrowAppletLoanHistoryTile.Data.Loan.Details.ADAPTER.encodeWithTag(reverseProtoWriter, 4, loan.loan_details);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, loan.right_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, loan.secondary_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, loan.primary_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowAppletLoanHistoryTile.Data.Loan loan = (BorrowAppletLoanHistoryTile.Data.Loan) obj;
        loan.getClass();
        int size$okio = loan.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return Color.ADAPTER.encodedSizeWithTag(6, loan.secondary_text_tint_color) + ProtoAdapter.STRING.encodedSizeWithTag(5, loan.legacy_reference_token) + BorrowAppletLoanHistoryTile.Data.Loan.Details.ADAPTER.encodedSizeWithTag(4, loan.loan_details) + protoAdapter.encodedSizeWithTag(3, loan.right_text) + protoAdapter.encodedSizeWithTag(2, loan.secondary_text) + protoAdapter.encodedSizeWithTag(1, loan.primary_text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowAppletLoanHistoryTile.Data.Loan loan = (BorrowAppletLoanHistoryTile.Data.Loan) obj;
        loan.getClass();
        LocalizedString localizedString = loan.primary_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = loan.secondary_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizedString localizedString5 = loan.right_text;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        BorrowAppletLoanHistoryTile.Data.Loan.Details details = loan.loan_details;
        BorrowAppletLoanHistoryTile.Data.Loan.Details details2 = details != null ? (BorrowAppletLoanHistoryTile.Data.Loan.Details) BorrowAppletLoanHistoryTile.Data.Loan.Details.ADAPTER.redact(details) : null;
        Color color = loan.secondary_text_tint_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = loan.legacy_reference_token;
        byteString.getClass();
        return new BorrowAppletLoanHistoryTile.Data.Loan(localizedString2, localizedString4, localizedString6, details2, str, color2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowAppletLoanHistoryTile.Data.Loan loan = (BorrowAppletLoanHistoryTile.Data.Loan) obj;
        loan.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, loan.primary_text);
        protoAdapter.encodeWithTag(protoWriter, 2, loan.secondary_text);
        protoAdapter.encodeWithTag(protoWriter, 3, loan.right_text);
        BorrowAppletLoanHistoryTile.Data.Loan.Details.ADAPTER.encodeWithTag(protoWriter, 4, loan.loan_details);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, loan.legacy_reference_token);
        Color.ADAPTER.encodeWithTag(protoWriter, 6, loan.secondary_text_tint_color);
        protoWriter.writeBytes(loan.unknownFields());
    }
}
