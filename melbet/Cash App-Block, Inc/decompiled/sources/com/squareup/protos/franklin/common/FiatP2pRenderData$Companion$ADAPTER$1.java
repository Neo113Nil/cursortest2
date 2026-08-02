package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.cash.p2p.engine.api.v1.PaymentSponsorApprovalStatus;
import com.squareup.cash.p2p.engine.api.v1.PaymentType;
import com.squareup.protos.franklin.common.FiatP2pRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class FiatP2pRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001f. Please report as an issue. */
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new FiatP2pRenderData((FiatP2pRenderData.PaymentSource) obj5, (AllowanceRenderData) obj6, (FiatP2pRenderData.CustomerRequiredAction) obj7, (String) obj8, (String) obj9, (String) obj10, (SquarePayrollRenderData) obj11, (String) obj12, (Boolean) obj13, (PaymentSponsorApprovalStatus) obj14, (PaymentType) obj15, (RecurringPaymentRenderData) obj16, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = obj7;
                    obj2 = obj8;
                    obj3 = obj9;
                    try {
                        obj4 = FiatP2pRenderData.PaymentSource.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                    obj7 = obj;
                    obj8 = obj2;
                    obj9 = obj3;
                    break;
                case 2:
                    obj6 = TransactorKt.decodeMessageOrMerge(AllowanceRenderData.ADAPTER, protoReader, obj6);
                    obj4 = obj5;
                    break;
                case 3:
                    obj = obj7;
                    obj2 = obj8;
                    obj3 = obj9;
                    try {
                        obj7 = FiatP2pRenderData.CustomerRequiredAction.ADAPTER.decode(protoReader);
                        obj8 = obj2;
                        obj9 = obj3;
                        obj4 = obj5;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 4:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    obj4 = obj5;
                    break;
                case 5:
                    obj9 = ProtoAdapter.STRING.decode(protoReader);
                    obj4 = obj5;
                    break;
                case 6:
                    obj10 = ProtoAdapter.STRING.decode(protoReader);
                    obj4 = obj5;
                    break;
                case 7:
                    obj11 = TransactorKt.decodeMessageOrMerge(SquarePayrollRenderData.ADAPTER, protoReader, obj11);
                    obj4 = obj5;
                    break;
                case 8:
                    obj12 = ProtoAdapter.STRING.decode(protoReader);
                    obj4 = obj5;
                    break;
                case 9:
                    obj13 = ProtoAdapter.BOOL.decode(protoReader);
                    obj4 = obj5;
                    break;
                case 10:
                    obj = obj7;
                    obj2 = obj8;
                    obj3 = obj9;
                    try {
                        obj14 = PaymentSponsorApprovalStatus.ADAPTER.decode(protoReader);
                        obj7 = obj;
                        obj8 = obj2;
                        obj9 = obj3;
                        obj4 = obj5;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 11:
                    try {
                        obj15 = PaymentType.ADAPTER.decode(protoReader);
                        obj4 = obj5;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                        obj = obj7;
                        obj2 = obj8;
                        obj3 = obj9;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                        break;
                    }
                case 12:
                    obj16 = TransactorKt.decodeMessageOrMerge(RecurringPaymentRenderData.ADAPTER, protoReader, obj16);
                    obj4 = obj5;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj7;
                    obj2 = obj8;
                    obj3 = obj9;
                    obj4 = obj5;
                    obj7 = obj;
                    obj8 = obj2;
                    obj9 = obj3;
                    break;
            }
            obj5 = obj4;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FiatP2pRenderData fiatP2pRenderData = (FiatP2pRenderData) obj;
        reverseProtoWriter.getClass();
        fiatP2pRenderData.getClass();
        reverseProtoWriter.writeBytes(fiatP2pRenderData.unknownFields());
        RecurringPaymentRenderData.ADAPTER.encodeWithTag(reverseProtoWriter, 12, fiatP2pRenderData.recurring_payment_data);
        PaymentType.ADAPTER.encodeWithTag(reverseProtoWriter, 11, fiatP2pRenderData.payment_type);
        PaymentSponsorApprovalStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 10, fiatP2pRenderData.payment_sponsor_approval_status);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 9, fiatP2pRenderData.is_cash_for_business);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, fiatP2pRenderData.raw_p2p_engine_payment_state_code);
        SquarePayrollRenderData.ADAPTER.encodeWithTag(reverseProtoWriter, 7, fiatP2pRenderData.square_payroll_data);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, fiatP2pRenderData.resume_payment_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, fiatP2pRenderData.refund_payment_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, fiatP2pRenderData.cancel_payment_url);
        FiatP2pRenderData.CustomerRequiredAction.ADAPTER.encodeWithTag(reverseProtoWriter, 3, fiatP2pRenderData.customer_required_action);
        AllowanceRenderData.ADAPTER.encodeWithTag(reverseProtoWriter, 2, fiatP2pRenderData.allowance_data);
        FiatP2pRenderData.PaymentSource.ADAPTER.encodeWithTag(reverseProtoWriter, 1, fiatP2pRenderData.payment_source);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FiatP2pRenderData fiatP2pRenderData = (FiatP2pRenderData) obj;
        fiatP2pRenderData.getClass();
        int encodedSizeWithTag = FiatP2pRenderData.CustomerRequiredAction.ADAPTER.encodedSizeWithTag(3, fiatP2pRenderData.customer_required_action) + AllowanceRenderData.ADAPTER.encodedSizeWithTag(2, fiatP2pRenderData.allowance_data) + FiatP2pRenderData.PaymentSource.ADAPTER.encodedSizeWithTag(1, fiatP2pRenderData.payment_source) + fiatP2pRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return RecurringPaymentRenderData.ADAPTER.encodedSizeWithTag(12, fiatP2pRenderData.recurring_payment_data) + PaymentType.ADAPTER.encodedSizeWithTag(11, fiatP2pRenderData.payment_type) + PaymentSponsorApprovalStatus.ADAPTER.encodedSizeWithTag(10, fiatP2pRenderData.payment_sponsor_approval_status) + ProtoAdapter.BOOL.encodedSizeWithTag(9, fiatP2pRenderData.is_cash_for_business) + protoAdapter.encodedSizeWithTag(8, fiatP2pRenderData.raw_p2p_engine_payment_state_code) + SquarePayrollRenderData.ADAPTER.encodedSizeWithTag(7, fiatP2pRenderData.square_payroll_data) + protoAdapter.encodedSizeWithTag(6, fiatP2pRenderData.resume_payment_url) + protoAdapter.encodedSizeWithTag(5, fiatP2pRenderData.refund_payment_url) + protoAdapter.encodedSizeWithTag(4, fiatP2pRenderData.cancel_payment_url) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FiatP2pRenderData fiatP2pRenderData = (FiatP2pRenderData) obj;
        fiatP2pRenderData.getClass();
        AllowanceRenderData allowanceRenderData = fiatP2pRenderData.allowance_data;
        AllowanceRenderData allowanceRenderData2 = allowanceRenderData != null ? (AllowanceRenderData) AllowanceRenderData.ADAPTER.redact(allowanceRenderData) : null;
        SquarePayrollRenderData squarePayrollRenderData = fiatP2pRenderData.square_payroll_data;
        SquarePayrollRenderData squarePayrollRenderData2 = squarePayrollRenderData != null ? (SquarePayrollRenderData) SquarePayrollRenderData.ADAPTER.redact(squarePayrollRenderData) : null;
        RecurringPaymentRenderData recurringPaymentRenderData = fiatP2pRenderData.recurring_payment_data;
        RecurringPaymentRenderData recurringPaymentRenderData2 = recurringPaymentRenderData != null ? (RecurringPaymentRenderData) RecurringPaymentRenderData.ADAPTER.redact(recurringPaymentRenderData) : null;
        ByteString byteString = ByteString.EMPTY;
        FiatP2pRenderData.PaymentSource paymentSource = fiatP2pRenderData.payment_source;
        FiatP2pRenderData.CustomerRequiredAction customerRequiredAction = fiatP2pRenderData.customer_required_action;
        String str = fiatP2pRenderData.cancel_payment_url;
        String str2 = fiatP2pRenderData.refund_payment_url;
        String str3 = fiatP2pRenderData.resume_payment_url;
        String str4 = fiatP2pRenderData.raw_p2p_engine_payment_state_code;
        Boolean bool = fiatP2pRenderData.is_cash_for_business;
        PaymentSponsorApprovalStatus paymentSponsorApprovalStatus = fiatP2pRenderData.payment_sponsor_approval_status;
        PaymentType paymentType = fiatP2pRenderData.payment_type;
        byteString.getClass();
        return new FiatP2pRenderData(paymentSource, allowanceRenderData2, customerRequiredAction, str, str2, str3, squarePayrollRenderData2, str4, bool, paymentSponsorApprovalStatus, paymentType, recurringPaymentRenderData2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FiatP2pRenderData fiatP2pRenderData = (FiatP2pRenderData) obj;
        fiatP2pRenderData.getClass();
        FiatP2pRenderData.PaymentSource.ADAPTER.encodeWithTag(protoWriter, 1, fiatP2pRenderData.payment_source);
        AllowanceRenderData.ADAPTER.encodeWithTag(protoWriter, 2, fiatP2pRenderData.allowance_data);
        FiatP2pRenderData.CustomerRequiredAction.ADAPTER.encodeWithTag(protoWriter, 3, fiatP2pRenderData.customer_required_action);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 4, fiatP2pRenderData.cancel_payment_url);
        protoAdapter.encodeWithTag(protoWriter, 5, fiatP2pRenderData.refund_payment_url);
        protoAdapter.encodeWithTag(protoWriter, 6, fiatP2pRenderData.resume_payment_url);
        SquarePayrollRenderData.ADAPTER.encodeWithTag(protoWriter, 7, fiatP2pRenderData.square_payroll_data);
        protoAdapter.encodeWithTag(protoWriter, 8, fiatP2pRenderData.raw_p2p_engine_payment_state_code);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, fiatP2pRenderData.is_cash_for_business);
        PaymentSponsorApprovalStatus.ADAPTER.encodeWithTag(protoWriter, 10, fiatP2pRenderData.payment_sponsor_approval_status);
        PaymentType.ADAPTER.encodeWithTag(protoWriter, 11, fiatP2pRenderData.payment_type);
        RecurringPaymentRenderData.ADAPTER.encodeWithTag(protoWriter, 12, fiatP2pRenderData.recurring_payment_data);
        protoWriter.writeBytes(fiatP2pRenderData.unknownFields());
    }
}
