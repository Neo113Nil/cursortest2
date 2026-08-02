package com.squareup.protos.franklin.lending;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.franklin.lending.LoanTransaction;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LoanTransaction$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0025. Please report as an issue. */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        Object obj14 = null;
        Object obj15 = null;
        Object obj16 = null;
        Object obj17 = null;
        Object obj18 = null;
        Object obj19 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LoanTransaction((LoanTransaction.Type) obj5, (String) obj19, (String) obj7, (String) obj8, (Long) obj9, (LendingProduct) obj10, (LoanTransaction.LoanPayment) obj11, (LoanTransaction.LoanDrawdown) obj12, (LoanTransaction.LoanCharge) obj13, (String) obj14, (LoanTransaction.LoanRefund) obj15, (LoanTransaction.LoanAdjustment) obj16, (String) obj17, (String) obj18, (LocalizableString) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = obj6;
                    obj2 = obj7;
                    obj3 = obj8;
                    try {
                        obj4 = LoanTransaction.Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                    obj6 = obj;
                    obj7 = obj2;
                    obj8 = obj3;
                    break;
                case 2:
                    obj19 = ProtoAdapter.STRING.decode(protoReader);
                    obj4 = obj5;
                    break;
                case 3:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    obj4 = obj5;
                    break;
                case 4:
                    obj11 = TransactorKt.decodeMessageOrMerge(LoanTransaction.LoanPayment.ADAPTER, protoReader, obj11);
                    obj4 = obj5;
                    break;
                case 5:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    obj4 = obj5;
                    break;
                case 6:
                    obj9 = ProtoAdapter.INT64.decode(protoReader);
                    obj4 = obj5;
                    break;
                case 7:
                    obj12 = TransactorKt.decodeMessageOrMerge(LoanTransaction.LoanDrawdown.ADAPTER, protoReader, obj12);
                    obj4 = obj5;
                    break;
                case 8:
                    obj13 = TransactorKt.decodeMessageOrMerge(LoanTransaction.LoanCharge.ADAPTER, protoReader, obj13);
                    obj4 = obj5;
                    break;
                case 9:
                    obj14 = ProtoAdapter.STRING.decode(protoReader);
                    obj4 = obj5;
                    break;
                case 10:
                    obj15 = TransactorKt.decodeMessageOrMerge(LoanTransaction.LoanRefund.ADAPTER, protoReader, obj15);
                    obj4 = obj5;
                    break;
                case 11:
                    obj16 = TransactorKt.decodeMessageOrMerge(LoanTransaction.LoanAdjustment.ADAPTER, protoReader, obj16);
                    obj4 = obj5;
                    break;
                case 12:
                    try {
                        obj10 = LendingProduct.ADAPTER.decode(protoReader);
                        obj4 = obj5;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        obj = obj6;
                        obj2 = obj7;
                        obj3 = obj8;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 13:
                    obj17 = ProtoAdapter.STRING.decode(protoReader);
                    obj4 = obj5;
                    break;
                case 14:
                    obj18 = ProtoAdapter.STRING.decode(protoReader);
                    obj4 = obj5;
                    break;
                case 15:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj6);
                    obj4 = obj5;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj6;
                    obj2 = obj7;
                    obj3 = obj8;
                    obj4 = obj5;
                    obj6 = obj;
                    obj7 = obj2;
                    obj8 = obj3;
                    break;
            }
            obj5 = obj4;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LoanTransaction loanTransaction = (LoanTransaction) obj;
        reverseProtoWriter.getClass();
        loanTransaction.getClass();
        reverseProtoWriter.writeBytes(loanTransaction.unknownFields());
        LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 15, loanTransaction.localizable_detailDescription);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 14, loanTransaction.detailDescription);
        protoAdapter.encodeWithTag(reverseProtoWriter, 13, loanTransaction.transaction_detail_text);
        LoanTransaction.LoanAdjustment.ADAPTER.encodeWithTag(reverseProtoWriter, 11, loanTransaction.loan_adjustment);
        LoanTransaction.LoanRefund.ADAPTER.encodeWithTag(reverseProtoWriter, 10, loanTransaction.loan_refund);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, loanTransaction.activity_token);
        LoanTransaction.LoanCharge.ADAPTER.encodeWithTag(reverseProtoWriter, 8, loanTransaction.loan_charge);
        LoanTransaction.LoanDrawdown.ADAPTER.encodeWithTag(reverseProtoWriter, 7, loanTransaction.loan_drawdown);
        LoanTransaction.LoanPayment.ADAPTER.encodeWithTag(reverseProtoWriter, 4, loanTransaction.loan_payment);
        LendingProduct.ADAPTER.encodeWithTag(reverseProtoWriter, 12, loanTransaction.lending_product);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 6, loanTransaction.date);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, loanTransaction.loan_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, loanTransaction.credit_line_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, loanTransaction.token);
        LoanTransaction.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 1, loanTransaction.f1395type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LoanTransaction loanTransaction = (LoanTransaction) obj;
        loanTransaction.getClass();
        int encodedSizeWithTag = LoanTransaction.Type.ADAPTER.encodedSizeWithTag(1, loanTransaction.f1395type) + loanTransaction.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LocalizableString.ADAPTER.encodedSizeWithTag(15, loanTransaction.localizable_detailDescription) + protoAdapter.encodedSizeWithTag(14, loanTransaction.detailDescription) + protoAdapter.encodedSizeWithTag(13, loanTransaction.transaction_detail_text) + LoanTransaction.LoanAdjustment.ADAPTER.encodedSizeWithTag(11, loanTransaction.loan_adjustment) + LoanTransaction.LoanRefund.ADAPTER.encodedSizeWithTag(10, loanTransaction.loan_refund) + protoAdapter.encodedSizeWithTag(9, loanTransaction.activity_token) + LoanTransaction.LoanCharge.ADAPTER.encodedSizeWithTag(8, loanTransaction.loan_charge) + LoanTransaction.LoanDrawdown.ADAPTER.encodedSizeWithTag(7, loanTransaction.loan_drawdown) + LoanTransaction.LoanPayment.ADAPTER.encodedSizeWithTag(4, loanTransaction.loan_payment) + LendingProduct.ADAPTER.encodedSizeWithTag(12, loanTransaction.lending_product) + ProtoAdapter.INT64.encodedSizeWithTag(6, loanTransaction.date) + protoAdapter.encodedSizeWithTag(3, loanTransaction.loan_token) + protoAdapter.encodedSizeWithTag(5, loanTransaction.credit_line_token) + protoAdapter.encodedSizeWithTag(2, loanTransaction.token) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LoanTransaction loanTransaction = (LoanTransaction) obj;
        loanTransaction.getClass();
        LoanTransaction.LoanPayment loanPayment = loanTransaction.loan_payment;
        LoanTransaction.LoanPayment loanPayment2 = loanPayment != null ? (LoanTransaction.LoanPayment) LoanTransaction.LoanPayment.ADAPTER.redact(loanPayment) : null;
        LoanTransaction.LoanDrawdown loanDrawdown = loanTransaction.loan_drawdown;
        LoanTransaction.LoanDrawdown loanDrawdown2 = loanDrawdown != null ? (LoanTransaction.LoanDrawdown) LoanTransaction.LoanDrawdown.ADAPTER.redact(loanDrawdown) : null;
        LoanTransaction.LoanCharge loanCharge = loanTransaction.loan_charge;
        LoanTransaction.LoanCharge loanCharge2 = loanCharge != null ? (LoanTransaction.LoanCharge) LoanTransaction.LoanCharge.ADAPTER.redact(loanCharge) : null;
        LoanTransaction.LoanRefund loanRefund = loanTransaction.loan_refund;
        LoanTransaction.LoanRefund loanRefund2 = loanRefund != null ? (LoanTransaction.LoanRefund) LoanTransaction.LoanRefund.ADAPTER.redact(loanRefund) : null;
        LoanTransaction.LoanAdjustment loanAdjustment = loanTransaction.loan_adjustment;
        LoanTransaction.LoanAdjustment loanAdjustment2 = loanAdjustment != null ? (LoanTransaction.LoanAdjustment) LoanTransaction.LoanAdjustment.ADAPTER.redact(loanAdjustment) : null;
        LocalizableString localizableString = loanTransaction.localizable_detailDescription;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        ByteString byteString = ByteString.EMPTY;
        LoanTransaction.Type type2 = loanTransaction.f1395type;
        String str = loanTransaction.token;
        String str2 = loanTransaction.credit_line_token;
        String str3 = loanTransaction.loan_token;
        Long l = loanTransaction.date;
        LendingProduct lendingProduct = loanTransaction.lending_product;
        String str4 = loanTransaction.activity_token;
        String str5 = loanTransaction.transaction_detail_text;
        String str6 = loanTransaction.detailDescription;
        byteString.getClass();
        return new LoanTransaction(type2, str, str2, str3, l, lendingProduct, loanPayment2, loanDrawdown2, loanCharge2, str4, loanRefund2, loanAdjustment2, str5, str6, localizableString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LoanTransaction loanTransaction = (LoanTransaction) obj;
        loanTransaction.getClass();
        LoanTransaction.Type.ADAPTER.encodeWithTag(protoWriter, 1, loanTransaction.f1395type);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, loanTransaction.token);
        protoAdapter.encodeWithTag(protoWriter, 5, loanTransaction.credit_line_token);
        protoAdapter.encodeWithTag(protoWriter, 3, loanTransaction.loan_token);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, loanTransaction.date);
        LendingProduct.ADAPTER.encodeWithTag(protoWriter, 12, loanTransaction.lending_product);
        LoanTransaction.LoanPayment.ADAPTER.encodeWithTag(protoWriter, 4, loanTransaction.loan_payment);
        LoanTransaction.LoanDrawdown.ADAPTER.encodeWithTag(protoWriter, 7, loanTransaction.loan_drawdown);
        LoanTransaction.LoanCharge.ADAPTER.encodeWithTag(protoWriter, 8, loanTransaction.loan_charge);
        protoAdapter.encodeWithTag(protoWriter, 9, loanTransaction.activity_token);
        LoanTransaction.LoanRefund.ADAPTER.encodeWithTag(protoWriter, 10, loanTransaction.loan_refund);
        LoanTransaction.LoanAdjustment.ADAPTER.encodeWithTag(protoWriter, 11, loanTransaction.loan_adjustment);
        protoAdapter.encodeWithTag(protoWriter, 13, loanTransaction.transaction_detail_text);
        protoAdapter.encodeWithTag(protoWriter, 14, loanTransaction.detailDescription);
        LocalizableString.ADAPTER.encodeWithTag(protoWriter, 15, loanTransaction.localizable_detailDescription);
        protoWriter.writeBytes(loanTransaction.unknownFields());
    }
}
