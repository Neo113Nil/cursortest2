package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.common.Money;
import com.squareup.protos.lending.InitiateLoanData;
import com.squareup.protos.lending.sync_values.BorrowAppletCreditLimitAndBorrowButtonTile;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowAppletCreditLimitAndBorrowButtonTile$Data$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new BorrowAppletCreditLimitAndBorrowButtonTile.Data((Money) obj, (LocalizedString) obj2, (LocalizedString) obj3, (Boolean) obj4, (InitiateLoanData) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(InitiateLoanData.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowAppletCreditLimitAndBorrowButtonTile.Data data = (BorrowAppletCreditLimitAndBorrowButtonTile.Data) obj;
        reverseProtoWriter.getClass();
        data.getClass();
        reverseProtoWriter.writeBytes(data.unknownFields());
        InitiateLoanData.ADAPTER.encodeWithTag(reverseProtoWriter, 5, data.picker_data);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, data.button_enabled);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, data.button_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, data.credit_limit_subtitle);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 1, data.available_credit_amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowAppletCreditLimitAndBorrowButtonTile.Data data = (BorrowAppletCreditLimitAndBorrowButtonTile.Data) obj;
        data.getClass();
        int encodedSizeWithTag = Money.ADAPTER.encodedSizeWithTag(1, data.available_credit_amount) + data.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return InitiateLoanData.ADAPTER.encodedSizeWithTag(5, data.picker_data) + ProtoAdapter.BOOL.encodedSizeWithTag(4, data.button_enabled) + protoAdapter.encodedSizeWithTag(3, data.button_title) + protoAdapter.encodedSizeWithTag(2, data.credit_limit_subtitle) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowAppletCreditLimitAndBorrowButtonTile.Data data = (BorrowAppletCreditLimitAndBorrowButtonTile.Data) obj;
        data.getClass();
        Money money = data.available_credit_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        LocalizedString localizedString = data.credit_limit_subtitle;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = data.button_title;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        InitiateLoanData initiateLoanData = data.picker_data;
        InitiateLoanData initiateLoanData2 = initiateLoanData != null ? (InitiateLoanData) InitiateLoanData.ADAPTER.redact(initiateLoanData) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = data.button_enabled;
        byteString.getClass();
        return new BorrowAppletCreditLimitAndBorrowButtonTile.Data(money2, localizedString2, localizedString4, bool, initiateLoanData2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowAppletCreditLimitAndBorrowButtonTile.Data data = (BorrowAppletCreditLimitAndBorrowButtonTile.Data) obj;
        data.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 1, data.available_credit_amount);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, data.credit_limit_subtitle);
        protoAdapter.encodeWithTag(protoWriter, 3, data.button_title);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, data.button_enabled);
        InitiateLoanData.ADAPTER.encodeWithTag(protoWriter, 5, data.picker_data);
        protoWriter.writeBytes(data.unknownFields());
    }
}
