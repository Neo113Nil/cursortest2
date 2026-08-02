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
public final class BorrowAppletLoanHistoryTile$Data$Loan$Details$Row$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new BorrowAppletLoanHistoryTile.Data.Loan.Details.Row((LocalizedString) obj, (LocalizedString) obj2, (String) obj3, (Color) obj4, (Color) obj5, (Boolean) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowAppletLoanHistoryTile.Data.Loan.Details.Row row = (BorrowAppletLoanHistoryTile.Data.Loan.Details.Row) obj;
        reverseProtoWriter.getClass();
        row.getClass();
        reverseProtoWriter.writeBytes(row.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 6, row.right_toggle_value);
        ProtoAdapter protoAdapter = Color.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, row.right_text_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, row.left_text_color);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, row.client_route_action);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, row.right_text);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, row.left_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowAppletLoanHistoryTile.Data.Loan.Details.Row row = (BorrowAppletLoanHistoryTile.Data.Loan.Details.Row) obj;
        row.getClass();
        int size$okio = row.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(3, row.client_route_action) + protoAdapter.encodedSizeWithTag(2, row.right_text) + protoAdapter.encodedSizeWithTag(1, row.left_text) + size$okio;
        ProtoAdapter protoAdapter2 = Color.ADAPTER;
        return ProtoAdapter.BOOL.encodedSizeWithTag(6, row.right_toggle_value) + protoAdapter2.encodedSizeWithTag(5, row.right_text_color) + protoAdapter2.encodedSizeWithTag(4, row.left_text_color) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowAppletLoanHistoryTile.Data.Loan.Details.Row row = (BorrowAppletLoanHistoryTile.Data.Loan.Details.Row) obj;
        row.getClass();
        LocalizedString localizedString = row.left_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = row.right_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        Color color = row.left_text_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        Color color3 = row.right_text_color;
        Color color4 = color3 != null ? (Color) Color.ADAPTER.redact(color3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = row.client_route_action;
        Boolean bool = row.right_toggle_value;
        byteString.getClass();
        return new BorrowAppletLoanHistoryTile.Data.Loan.Details.Row(localizedString2, localizedString4, str, color2, color4, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowAppletLoanHistoryTile.Data.Loan.Details.Row row = (BorrowAppletLoanHistoryTile.Data.Loan.Details.Row) obj;
        row.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, row.left_text);
        protoAdapter.encodeWithTag(protoWriter, 2, row.right_text);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, row.client_route_action);
        ProtoAdapter protoAdapter2 = Color.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 4, row.left_text_color);
        protoAdapter2.encodeWithTag(protoWriter, 5, row.right_text_color);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, row.right_toggle_value);
        protoWriter.writeBytes(row.unknownFields());
    }
}
