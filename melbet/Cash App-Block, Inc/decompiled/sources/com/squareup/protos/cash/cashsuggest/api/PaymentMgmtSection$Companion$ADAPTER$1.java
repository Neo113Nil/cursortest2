package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashsuggest.api.PaymentMgmtSection;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PaymentMgmtSection$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new PaymentMgmtSection((PaymentMgmtSection.BalanceRow) obj, (PaymentMgmtSection.BalanceRow) obj2, (PaymentMgmtSection.BalanceRow) obj3, (Button) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 3) {
                obj4 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj4);
            } else if (nextTag == 4) {
                obj = TransactorKt.decodeMessageOrMerge(PaymentMgmtSection.BalanceRow.ADAPTER, protoReader, obj);
            } else if (nextTag == 5) {
                obj2 = TransactorKt.decodeMessageOrMerge(PaymentMgmtSection.BalanceRow.ADAPTER, protoReader, obj2);
            } else if (nextTag != 6) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(PaymentMgmtSection.BalanceRow.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaymentMgmtSection paymentMgmtSection = (PaymentMgmtSection) obj;
        reverseProtoWriter.getClass();
        paymentMgmtSection.getClass();
        reverseProtoWriter.writeBytes(paymentMgmtSection.unknownFields());
        Button.ADAPTER.encodeWithTag(reverseProtoWriter, 3, paymentMgmtSection.cta_button);
        ProtoAdapter protoAdapter = PaymentMgmtSection.BalanceRow.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, paymentMgmtSection.over_due);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, paymentMgmtSection.next_due);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, paymentMgmtSection.total_owed);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaymentMgmtSection paymentMgmtSection = (PaymentMgmtSection) obj;
        paymentMgmtSection.getClass();
        int size$okio = paymentMgmtSection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = PaymentMgmtSection.BalanceRow.ADAPTER;
        return Button.ADAPTER.encodedSizeWithTag(3, paymentMgmtSection.cta_button) + protoAdapter.encodedSizeWithTag(6, paymentMgmtSection.over_due) + protoAdapter.encodedSizeWithTag(5, paymentMgmtSection.next_due) + protoAdapter.encodedSizeWithTag(4, paymentMgmtSection.total_owed) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaymentMgmtSection paymentMgmtSection = (PaymentMgmtSection) obj;
        paymentMgmtSection.getClass();
        PaymentMgmtSection.BalanceRow balanceRow = paymentMgmtSection.total_owed;
        PaymentMgmtSection.BalanceRow balanceRow2 = balanceRow != null ? (PaymentMgmtSection.BalanceRow) PaymentMgmtSection.BalanceRow.ADAPTER.redact(balanceRow) : null;
        PaymentMgmtSection.BalanceRow balanceRow3 = paymentMgmtSection.next_due;
        PaymentMgmtSection.BalanceRow balanceRow4 = balanceRow3 != null ? (PaymentMgmtSection.BalanceRow) PaymentMgmtSection.BalanceRow.ADAPTER.redact(balanceRow3) : null;
        PaymentMgmtSection.BalanceRow balanceRow5 = paymentMgmtSection.over_due;
        PaymentMgmtSection.BalanceRow balanceRow6 = balanceRow5 != null ? (PaymentMgmtSection.BalanceRow) PaymentMgmtSection.BalanceRow.ADAPTER.redact(balanceRow5) : null;
        Button button = paymentMgmtSection.cta_button;
        Button button2 = button != null ? (Button) Button.ADAPTER.redact(button) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new PaymentMgmtSection(balanceRow2, balanceRow4, balanceRow6, button2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaymentMgmtSection paymentMgmtSection = (PaymentMgmtSection) obj;
        paymentMgmtSection.getClass();
        ProtoAdapter protoAdapter = PaymentMgmtSection.BalanceRow.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 4, paymentMgmtSection.total_owed);
        protoAdapter.encodeWithTag(protoWriter, 5, paymentMgmtSection.next_due);
        protoAdapter.encodeWithTag(protoWriter, 6, paymentMgmtSection.over_due);
        Button.ADAPTER.encodeWithTag(protoWriter, 3, paymentMgmtSection.cta_button);
        protoWriter.writeBytes(paymentMgmtSection.unknownFields());
    }
}
