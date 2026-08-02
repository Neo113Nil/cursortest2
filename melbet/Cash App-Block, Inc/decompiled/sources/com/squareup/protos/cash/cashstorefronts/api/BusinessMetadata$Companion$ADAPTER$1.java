package com.squareup.protos.cash.cashstorefronts.api;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BusinessMetadata$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new BusinessMetadata((CashAppGenericBusinessMetadata) obj, (AfterpayAppMetadata) obj2, (CashAppAfterpayMetadata) obj3, (CashAppPayLaterMetadata) obj4, (CashAppPayLaterMetadata) obj5, (AfterpayAppMetadata) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj4 = TransactorKt.decodeMessageOrMerge(CashAppPayLaterMetadata.ADAPTER, protoReader, obj4);
                    break;
                case 2:
                    obj5 = TransactorKt.decodeMessageOrMerge(CashAppPayLaterMetadata.ADAPTER, protoReader, obj5);
                    break;
                case 3:
                    obj2 = TransactorKt.decodeMessageOrMerge(AfterpayAppMetadata.ADAPTER, protoReader, obj2);
                    break;
                case 4:
                    obj6 = TransactorKt.decodeMessageOrMerge(AfterpayAppMetadata.ADAPTER, protoReader, obj6);
                    break;
                case 5:
                    obj = TransactorKt.decodeMessageOrMerge(CashAppGenericBusinessMetadata.ADAPTER, protoReader, obj);
                    break;
                case 6:
                    obj3 = TransactorKt.decodeMessageOrMerge(CashAppAfterpayMetadata.ADAPTER, protoReader, obj3);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BusinessMetadata businessMetadata = (BusinessMetadata) obj;
        reverseProtoWriter.getClass();
        businessMetadata.getClass();
        reverseProtoWriter.writeBytes(businessMetadata.unknownFields());
        ProtoAdapter protoAdapter = AfterpayAppMetadata.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, businessMetadata.afterpay_app_sup_metadata);
        ProtoAdapter protoAdapter2 = CashAppPayLaterMetadata.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, businessMetadata.cash_app_sup_metadata);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, businessMetadata.cash_app_pay_later_metadata);
        CashAppAfterpayMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 6, businessMetadata.cash_app_afterpay_metadata);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, businessMetadata.afterpay_app_metadata);
        CashAppGenericBusinessMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 5, businessMetadata.cash_app_generic_business_metadata);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BusinessMetadata businessMetadata = (BusinessMetadata) obj;
        businessMetadata.getClass();
        int encodedSizeWithTag = CashAppGenericBusinessMetadata.ADAPTER.encodedSizeWithTag(5, businessMetadata.cash_app_generic_business_metadata) + businessMetadata.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = AfterpayAppMetadata.ADAPTER;
        int encodedSizeWithTag2 = CashAppAfterpayMetadata.ADAPTER.encodedSizeWithTag(6, businessMetadata.cash_app_afterpay_metadata) + protoAdapter.encodedSizeWithTag(3, businessMetadata.afterpay_app_metadata) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = CashAppPayLaterMetadata.ADAPTER;
        return protoAdapter.encodedSizeWithTag(4, businessMetadata.afterpay_app_sup_metadata) + protoAdapter2.encodedSizeWithTag(2, businessMetadata.cash_app_sup_metadata) + protoAdapter2.encodedSizeWithTag(1, businessMetadata.cash_app_pay_later_metadata) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BusinessMetadata businessMetadata = (BusinessMetadata) obj;
        businessMetadata.getClass();
        CashAppGenericBusinessMetadata cashAppGenericBusinessMetadata = businessMetadata.cash_app_generic_business_metadata;
        CashAppGenericBusinessMetadata cashAppGenericBusinessMetadata2 = cashAppGenericBusinessMetadata != null ? (CashAppGenericBusinessMetadata) CashAppGenericBusinessMetadata.ADAPTER.redact(cashAppGenericBusinessMetadata) : null;
        AfterpayAppMetadata afterpayAppMetadata = businessMetadata.afterpay_app_metadata;
        AfterpayAppMetadata afterpayAppMetadata2 = afterpayAppMetadata != null ? (AfterpayAppMetadata) AfterpayAppMetadata.ADAPTER.redact(afterpayAppMetadata) : null;
        CashAppAfterpayMetadata cashAppAfterpayMetadata = businessMetadata.cash_app_afterpay_metadata;
        CashAppAfterpayMetadata cashAppAfterpayMetadata2 = cashAppAfterpayMetadata != null ? (CashAppAfterpayMetadata) CashAppAfterpayMetadata.ADAPTER.redact(cashAppAfterpayMetadata) : null;
        CashAppPayLaterMetadata cashAppPayLaterMetadata = businessMetadata.cash_app_pay_later_metadata;
        CashAppPayLaterMetadata cashAppPayLaterMetadata2 = cashAppPayLaterMetadata != null ? (CashAppPayLaterMetadata) CashAppPayLaterMetadata.ADAPTER.redact(cashAppPayLaterMetadata) : null;
        CashAppPayLaterMetadata cashAppPayLaterMetadata3 = businessMetadata.cash_app_sup_metadata;
        CashAppPayLaterMetadata cashAppPayLaterMetadata4 = cashAppPayLaterMetadata3 != null ? (CashAppPayLaterMetadata) CashAppPayLaterMetadata.ADAPTER.redact(cashAppPayLaterMetadata3) : null;
        AfterpayAppMetadata afterpayAppMetadata3 = businessMetadata.afterpay_app_sup_metadata;
        AfterpayAppMetadata afterpayAppMetadata4 = afterpayAppMetadata3 != null ? (AfterpayAppMetadata) AfterpayAppMetadata.ADAPTER.redact(afterpayAppMetadata3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BusinessMetadata(cashAppGenericBusinessMetadata2, afterpayAppMetadata2, cashAppAfterpayMetadata2, cashAppPayLaterMetadata2, cashAppPayLaterMetadata4, afterpayAppMetadata4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BusinessMetadata businessMetadata = (BusinessMetadata) obj;
        businessMetadata.getClass();
        CashAppGenericBusinessMetadata.ADAPTER.encodeWithTag(protoWriter, 5, businessMetadata.cash_app_generic_business_metadata);
        ProtoAdapter protoAdapter = AfterpayAppMetadata.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 3, businessMetadata.afterpay_app_metadata);
        CashAppAfterpayMetadata.ADAPTER.encodeWithTag(protoWriter, 6, businessMetadata.cash_app_afterpay_metadata);
        ProtoAdapter protoAdapter2 = CashAppPayLaterMetadata.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 1, businessMetadata.cash_app_pay_later_metadata);
        protoAdapter2.encodeWithTag(protoWriter, 2, businessMetadata.cash_app_sup_metadata);
        protoAdapter.encodeWithTag(protoWriter, 4, businessMetadata.afterpay_app_sup_metadata);
        protoWriter.writeBytes(businessMetadata.unknownFields());
    }
}
