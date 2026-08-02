package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.DisputedTransactionRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class DisputedTransactionRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001b. Please report as an issue. */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        ArrayList arrayList;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DisputedTransactionRenderData((DisputedTransactionRenderData.DisputeStatus) obj2, (Money) obj3, m, (Long) obj4, (Long) obj5, (String) obj6, (Boolean) obj7, (String) obj8, (Boolean) obj9, (Boolean) obj10, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 3:
                    try {
                        obj2 = DisputedTransactionRenderData.DisputeStatus.ADAPTER.decode(protoReader);
                        arrayList = m;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj2;
                        arrayList = m;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 4:
                    obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
                    arrayList = m;
                    break;
                case 5:
                    m.add(DisputedTransactionRenderData.DisputedCapture.ADAPTER.decode(protoReader));
                    obj = obj2;
                    arrayList = m;
                    obj2 = obj;
                    break;
                case 6:
                    obj4 = ProtoAdapter.INT64.decode(protoReader);
                    arrayList = m;
                    break;
                case 7:
                    obj5 = ProtoAdapter.INT64.decode(protoReader);
                    arrayList = m;
                    break;
                case 8:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    break;
                case 9:
                    obj7 = ProtoAdapter.BOOL.decode(protoReader);
                    arrayList = m;
                    break;
                case 10:
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj2;
                    arrayList = m;
                    obj2 = obj;
                    break;
                case 11:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    break;
                case 12:
                    obj9 = ProtoAdapter.BOOL.decode(protoReader);
                    arrayList = m;
                    break;
                case 13:
                    obj10 = ProtoAdapter.BOOL.decode(protoReader);
                    arrayList = m;
                    break;
            }
            m = arrayList;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DisputedTransactionRenderData disputedTransactionRenderData = (DisputedTransactionRenderData) obj;
        reverseProtoWriter.getClass();
        disputedTransactionRenderData.getClass();
        reverseProtoWriter.writeBytes(disputedTransactionRenderData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 13, disputedTransactionRenderData.claim_withdrawn);
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, disputedTransactionRenderData.is_appeals_enabled);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 11, disputedTransactionRenderData.appealed_claim_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, disputedTransactionRenderData.has_dispute);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, disputedTransactionRenderData.customer_explanation);
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 7, disputedTransactionRenderData.first_credit_issued_at);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 6, disputedTransactionRenderData.dispute_deadline_at);
        DisputedTransactionRenderData.DisputedCapture.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 5, disputedTransactionRenderData.captures);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 4, disputedTransactionRenderData.total_credit_issued);
        DisputedTransactionRenderData.DisputeStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 3, disputedTransactionRenderData.transaction_dispute_status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DisputedTransactionRenderData disputedTransactionRenderData = (DisputedTransactionRenderData) obj;
        disputedTransactionRenderData.getClass();
        int encodedSizeWithTag = DisputedTransactionRenderData.DisputedCapture.ADAPTER.asRepeated().encodedSizeWithTag(5, disputedTransactionRenderData.captures) + Money.ADAPTER.encodedSizeWithTag(4, disputedTransactionRenderData.total_credit_issued) + DisputedTransactionRenderData.DisputeStatus.ADAPTER.encodedSizeWithTag(3, disputedTransactionRenderData.transaction_dispute_status) + disputedTransactionRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(7, disputedTransactionRenderData.first_credit_issued_at) + protoAdapter.encodedSizeWithTag(6, disputedTransactionRenderData.dispute_deadline_at) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        int encodedSizeWithTag3 = protoAdapter2.encodedSizeWithTag(8, disputedTransactionRenderData.customer_explanation) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        return protoAdapter3.encodedSizeWithTag(13, disputedTransactionRenderData.claim_withdrawn) + protoAdapter3.encodedSizeWithTag(12, disputedTransactionRenderData.is_appeals_enabled) + protoAdapter2.encodedSizeWithTag(11, disputedTransactionRenderData.appealed_claim_token) + protoAdapter3.encodedSizeWithTag(9, disputedTransactionRenderData.has_dispute) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DisputedTransactionRenderData disputedTransactionRenderData = (DisputedTransactionRenderData) obj;
        disputedTransactionRenderData.getClass();
        Money money = disputedTransactionRenderData.total_credit_issued;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(disputedTransactionRenderData.captures, DisputedTransactionRenderData.DisputedCapture.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        DisputedTransactionRenderData.DisputeStatus disputeStatus = disputedTransactionRenderData.transaction_dispute_status;
        Long l = disputedTransactionRenderData.dispute_deadline_at;
        Long l2 = disputedTransactionRenderData.first_credit_issued_at;
        String str = disputedTransactionRenderData.customer_explanation;
        Boolean bool = disputedTransactionRenderData.has_dispute;
        String str2 = disputedTransactionRenderData.appealed_claim_token;
        Boolean bool2 = disputedTransactionRenderData.is_appeals_enabled;
        Boolean bool3 = disputedTransactionRenderData.claim_withdrawn;
        byteString.getClass();
        return new DisputedTransactionRenderData(disputeStatus, money2, m1169redactElements, l, l2, str, bool, str2, bool2, bool3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DisputedTransactionRenderData disputedTransactionRenderData = (DisputedTransactionRenderData) obj;
        disputedTransactionRenderData.getClass();
        DisputedTransactionRenderData.DisputeStatus.ADAPTER.encodeWithTag(protoWriter, 3, disputedTransactionRenderData.transaction_dispute_status);
        Money.ADAPTER.encodeWithTag(protoWriter, 4, disputedTransactionRenderData.total_credit_issued);
        DisputedTransactionRenderData.DisputedCapture.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, disputedTransactionRenderData.captures);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 6, disputedTransactionRenderData.dispute_deadline_at);
        protoAdapter.encodeWithTag(protoWriter, 7, disputedTransactionRenderData.first_credit_issued_at);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 8, disputedTransactionRenderData.customer_explanation);
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        protoAdapter3.encodeWithTag(protoWriter, 9, disputedTransactionRenderData.has_dispute);
        protoAdapter2.encodeWithTag(protoWriter, 11, disputedTransactionRenderData.appealed_claim_token);
        protoAdapter3.encodeWithTag(protoWriter, 12, disputedTransactionRenderData.is_appeals_enabled);
        protoAdapter3.encodeWithTag(protoWriter, 13, disputedTransactionRenderData.claim_withdrawn);
        protoWriter.writeBytes(disputedTransactionRenderData.unknownFields());
    }
}
