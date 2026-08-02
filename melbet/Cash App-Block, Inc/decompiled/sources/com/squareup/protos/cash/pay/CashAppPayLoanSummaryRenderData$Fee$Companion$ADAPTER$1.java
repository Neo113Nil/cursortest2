package com.squareup.protos.cash.pay;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.pay.CashAppPayLoanSummaryRenderData;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppPayLoanSummaryRenderData$Fee$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CashAppPayLoanSummaryRenderData.Fee((Money) obj, (Long) obj2, (Long) obj3, (CashAppPayLoanSummaryRenderData.Fee.FeeType) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj4 = CashAppPayLoanSummaryRenderData.Fee.FeeType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppPayLoanSummaryRenderData.Fee fee = (CashAppPayLoanSummaryRenderData.Fee) obj;
        reverseProtoWriter.getClass();
        fee.getClass();
        reverseProtoWriter.writeBytes(fee.unknownFields());
        CashAppPayLoanSummaryRenderData.Fee.FeeType.ADAPTER.encodeWithTag(reverseProtoWriter, 4, fee.fee_type);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, fee.installment_incurred_on);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, fee.incurred_at);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 1, fee.fee_money);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppPayLoanSummaryRenderData.Fee fee = (CashAppPayLoanSummaryRenderData.Fee) obj;
        fee.getClass();
        int encodedSizeWithTag = Money.ADAPTER.encodedSizeWithTag(1, fee.fee_money) + fee.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        return CashAppPayLoanSummaryRenderData.Fee.FeeType.ADAPTER.encodedSizeWithTag(4, fee.fee_type) + protoAdapter.encodedSizeWithTag(3, fee.installment_incurred_on) + protoAdapter.encodedSizeWithTag(2, fee.incurred_at) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppPayLoanSummaryRenderData.Fee fee = (CashAppPayLoanSummaryRenderData.Fee) obj;
        fee.getClass();
        Money money = fee.fee_money;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = fee.incurred_at;
        Long l2 = fee.installment_incurred_on;
        CashAppPayLoanSummaryRenderData.Fee.FeeType feeType = fee.fee_type;
        byteString.getClass();
        return new CashAppPayLoanSummaryRenderData.Fee(money2, l, l2, feeType, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppPayLoanSummaryRenderData.Fee fee = (CashAppPayLoanSummaryRenderData.Fee) obj;
        fee.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 1, fee.fee_money);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 2, fee.incurred_at);
        protoAdapter.encodeWithTag(protoWriter, 3, fee.installment_incurred_on);
        CashAppPayLoanSummaryRenderData.Fee.FeeType.ADAPTER.encodeWithTag(protoWriter, 4, fee.fee_type);
        protoWriter.writeBytes(fee.unknownFields());
    }
}
