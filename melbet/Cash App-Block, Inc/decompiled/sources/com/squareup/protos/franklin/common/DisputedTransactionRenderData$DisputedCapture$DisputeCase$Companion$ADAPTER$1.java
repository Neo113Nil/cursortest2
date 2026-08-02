package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.disputron.core.DisputeClaim$Reason;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.DisputedTransactionRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class DisputedTransactionRenderData$DisputedCapture$DisputeCase$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        DisputeClaim$Reason disputeClaim$Reason;
        Long l;
        Long l2;
        ?? decode;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Long l3 = null;
        Object obj = null;
        DisputeClaim$Reason disputeClaim$Reason2 = null;
        Long l4 = null;
        Long l5 = null;
        Object obj2 = null;
        Long l6 = null;
        Object obj3 = null;
        Long l7 = null;
        Object obj4 = null;
        Long l8 = null;
        String str = null;
        DisputedTransactionRenderData.DisputedCapture.DisputeCase.State state = null;
        DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason denialReason = null;
        DisputedTransactionRenderData.DisputedCapture.DisputeCase.WithdrawalReason withdrawalReason = null;
        Long l9 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DisputedTransactionRenderData.DisputedCapture.DisputeCase(l3, (Money) obj, disputeClaim$Reason2, l4, l5, (Money) obj2, l6, (Money) obj3, l7, (Money) obj4, l8, str, state, denialReason, withdrawalReason, l9, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.UINT64.decode(protoReader);
                    break;
                case 2:
                    obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
                    decode = l3;
                    break;
                case 3:
                    disputeClaim$Reason = disputeClaim$Reason2;
                    l = l4;
                    l2 = l5;
                    try {
                        disputeClaim$Reason2 = DisputeClaim$Reason.ADAPTER.decode(protoReader);
                        l4 = l;
                        l5 = l2;
                        decode = l3;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 4:
                    l4 = ProtoAdapter.INT64.decode(protoReader);
                    decode = l3;
                    break;
                case 5:
                    l5 = ProtoAdapter.INT64.decode(protoReader);
                    decode = l3;
                    break;
                case 6:
                    obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
                    decode = l3;
                    break;
                case 7:
                    l6 = ProtoAdapter.INT64.decode(protoReader);
                    decode = l3;
                    break;
                case 8:
                    obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
                    decode = l3;
                    break;
                case 9:
                    l7 = ProtoAdapter.INT64.decode(protoReader);
                    decode = l3;
                    break;
                case 10:
                    obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                    decode = l3;
                    break;
                case 11:
                    l8 = ProtoAdapter.INT64.decode(protoReader);
                    decode = l3;
                    break;
                case 12:
                    str = ProtoAdapter.STRING.decode(protoReader);
                    decode = l3;
                    break;
                case 13:
                    disputeClaim$Reason = disputeClaim$Reason2;
                    l = l4;
                    l2 = l5;
                    try {
                        state = DisputedTransactionRenderData.DisputedCapture.DisputeCase.State.ADAPTER.decode(protoReader);
                        disputeClaim$Reason2 = disputeClaim$Reason;
                        l4 = l;
                        l5 = l2;
                        decode = l3;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 14:
                    disputeClaim$Reason = disputeClaim$Reason2;
                    l = l4;
                    l2 = l5;
                    try {
                        denialReason = DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.ADAPTER.decode(protoReader);
                        disputeClaim$Reason2 = disputeClaim$Reason;
                        l4 = l;
                        l5 = l2;
                        decode = l3;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 15:
                    try {
                        withdrawalReason = DisputedTransactionRenderData.DisputedCapture.DisputeCase.WithdrawalReason.ADAPTER.decode(protoReader);
                        decode = l3;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                        disputeClaim$Reason = disputeClaim$Reason2;
                        l = l4;
                        l2 = l5;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                        break;
                    }
                case 16:
                    l9 = ProtoAdapter.INT64.decode(protoReader);
                    decode = l3;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    disputeClaim$Reason = disputeClaim$Reason2;
                    l = l4;
                    l2 = l5;
                    decode = l3;
                    disputeClaim$Reason2 = disputeClaim$Reason;
                    l4 = l;
                    l5 = l2;
                    break;
            }
            l3 = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DisputedTransactionRenderData.DisputedCapture.DisputeCase disputeCase = (DisputedTransactionRenderData.DisputedCapture.DisputeCase) obj;
        reverseProtoWriter.getClass();
        disputeCase.getClass();
        reverseProtoWriter.writeBytes(disputeCase.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 16, disputeCase.provisional_credit_will_be_withdrawn_at);
        DisputedTransactionRenderData.DisputedCapture.DisputeCase.WithdrawalReason.ADAPTER.encodeWithTag(reverseProtoWriter, 15, disputeCase.withdrawal_reason);
        DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.ADAPTER.encodeWithTag(reverseProtoWriter, 14, disputeCase.denial_reason);
        DisputedTransactionRenderData.DisputedCapture.DisputeCase.State.ADAPTER.encodeWithTag(reverseProtoWriter, 13, disputeCase.state);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 12, disputeCase.salesforce_case_number);
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, disputeCase.finalized_at);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, disputeCase.permanent_credit_issued);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, disputeCase.provisional_credit_withdrawn_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, disputeCase.provisional_credit_withdrawn);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, disputeCase.provisional_credit_issued_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, disputeCase.provisional_credit_issued);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, disputeCase.review_completed_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, disputeCase.review_initiated_at);
        DisputeClaim$Reason.ADAPTER.encodeWithTag(reverseProtoWriter, 3, disputeCase.reason);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, disputeCase.disputed_amount);
        ProtoAdapter.UINT64.encodeWithTag(reverseProtoWriter, 1, disputeCase.disputed_at);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DisputedTransactionRenderData.DisputedCapture.DisputeCase disputeCase = (DisputedTransactionRenderData.DisputedCapture.DisputeCase) obj;
        disputeCase.getClass();
        int encodedSizeWithTag = ProtoAdapter.UINT64.encodedSizeWithTag(1, disputeCase.disputed_at) + disputeCase.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        int encodedSizeWithTag2 = DisputeClaim$Reason.ADAPTER.encodedSizeWithTag(3, disputeCase.reason) + protoAdapter.encodedSizeWithTag(2, disputeCase.disputed_amount) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        return protoAdapter2.encodedSizeWithTag(16, disputeCase.provisional_credit_will_be_withdrawn_at) + DisputedTransactionRenderData.DisputedCapture.DisputeCase.WithdrawalReason.ADAPTER.encodedSizeWithTag(15, disputeCase.withdrawal_reason) + DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.ADAPTER.encodedSizeWithTag(14, disputeCase.denial_reason) + DisputedTransactionRenderData.DisputedCapture.DisputeCase.State.ADAPTER.encodedSizeWithTag(13, disputeCase.state) + ProtoAdapter.STRING.encodedSizeWithTag(12, disputeCase.salesforce_case_number) + protoAdapter2.encodedSizeWithTag(11, disputeCase.finalized_at) + protoAdapter.encodedSizeWithTag(10, disputeCase.permanent_credit_issued) + protoAdapter2.encodedSizeWithTag(9, disputeCase.provisional_credit_withdrawn_at) + protoAdapter.encodedSizeWithTag(8, disputeCase.provisional_credit_withdrawn) + protoAdapter2.encodedSizeWithTag(7, disputeCase.provisional_credit_issued_at) + protoAdapter.encodedSizeWithTag(6, disputeCase.provisional_credit_issued) + protoAdapter2.encodedSizeWithTag(5, disputeCase.review_completed_at) + protoAdapter2.encodedSizeWithTag(4, disputeCase.review_initiated_at) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DisputedTransactionRenderData.DisputedCapture.DisputeCase disputeCase = (DisputedTransactionRenderData.DisputedCapture.DisputeCase) obj;
        disputeCase.getClass();
        Money money = disputeCase.disputed_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = disputeCase.provisional_credit_issued;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Money money5 = disputeCase.provisional_credit_withdrawn;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        Money money7 = disputeCase.permanent_credit_issued;
        Money money8 = money7 != null ? (Money) Money.ADAPTER.redact(money7) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = disputeCase.disputed_at;
        DisputeClaim$Reason disputeClaim$Reason = disputeCase.reason;
        Long l2 = disputeCase.review_initiated_at;
        Long l3 = disputeCase.review_completed_at;
        Long l4 = disputeCase.provisional_credit_issued_at;
        Long l5 = disputeCase.provisional_credit_withdrawn_at;
        Long l6 = disputeCase.finalized_at;
        String str = disputeCase.salesforce_case_number;
        DisputedTransactionRenderData.DisputedCapture.DisputeCase.State state = disputeCase.state;
        DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason denialReason = disputeCase.denial_reason;
        DisputedTransactionRenderData.DisputedCapture.DisputeCase.WithdrawalReason withdrawalReason = disputeCase.withdrawal_reason;
        Long l7 = disputeCase.provisional_credit_will_be_withdrawn_at;
        byteString.getClass();
        return new DisputedTransactionRenderData.DisputedCapture.DisputeCase(l, money2, disputeClaim$Reason, l2, l3, money4, l4, money6, l5, money8, l6, str, state, denialReason, withdrawalReason, l7, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DisputedTransactionRenderData.DisputedCapture.DisputeCase disputeCase = (DisputedTransactionRenderData.DisputedCapture.DisputeCase) obj;
        disputeCase.getClass();
        ProtoAdapter.UINT64.encodeWithTag(protoWriter, 1, disputeCase.disputed_at);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, disputeCase.disputed_amount);
        DisputeClaim$Reason.ADAPTER.encodeWithTag(protoWriter, 3, disputeCase.reason);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 4, disputeCase.review_initiated_at);
        protoAdapter2.encodeWithTag(protoWriter, 5, disputeCase.review_completed_at);
        protoAdapter.encodeWithTag(protoWriter, 6, disputeCase.provisional_credit_issued);
        protoAdapter2.encodeWithTag(protoWriter, 7, disputeCase.provisional_credit_issued_at);
        protoAdapter.encodeWithTag(protoWriter, 8, disputeCase.provisional_credit_withdrawn);
        protoAdapter2.encodeWithTag(protoWriter, 9, disputeCase.provisional_credit_withdrawn_at);
        protoAdapter.encodeWithTag(protoWriter, 10, disputeCase.permanent_credit_issued);
        protoAdapter2.encodeWithTag(protoWriter, 11, disputeCase.finalized_at);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, disputeCase.salesforce_case_number);
        DisputedTransactionRenderData.DisputedCapture.DisputeCase.State.ADAPTER.encodeWithTag(protoWriter, 13, disputeCase.state);
        DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.ADAPTER.encodeWithTag(protoWriter, 14, disputeCase.denial_reason);
        DisputedTransactionRenderData.DisputedCapture.DisputeCase.WithdrawalReason.ADAPTER.encodeWithTag(protoWriter, 15, disputeCase.withdrawal_reason);
        protoAdapter2.encodeWithTag(protoWriter, 16, disputeCase.provisional_credit_will_be_withdrawn_at);
        protoWriter.writeBytes(disputeCase.unknownFields());
    }
}
