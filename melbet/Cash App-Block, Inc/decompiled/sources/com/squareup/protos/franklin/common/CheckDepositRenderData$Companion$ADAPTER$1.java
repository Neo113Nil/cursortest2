package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.gambit.api.v1.checkdeposit.DeclineReason;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.CheckDepositRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CheckDepositRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj7 = null;
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CheckDepositRenderData((String) obj, (String) obj2, (CheckDepositRenderData.Status) obj3, (DeclineReason) obj4, (CheckDepositRenderData.ReviewResult) obj5, (Long) obj6, (Money) obj7, (Long) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    try {
                        obj3 = CheckDepositRenderData.Status.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 4:
                    try {
                        obj4 = DeclineReason.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 5:
                    try {
                        obj5 = CheckDepositRenderData.ReviewResult.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 6:
                    obj6 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj7);
                    break;
                case 8:
                    obj8 = ProtoAdapter.UINT64.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CheckDepositRenderData checkDepositRenderData = (CheckDepositRenderData) obj;
        reverseProtoWriter.getClass();
        checkDepositRenderData.getClass();
        reverseProtoWriter.writeBytes(checkDepositRenderData.unknownFields());
        ProtoAdapter.UINT64.encodeWithTag(reverseProtoWriter, 8, checkDepositRenderData.funds_hold_business_days);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 7, checkDepositRenderData.past_amount);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 6, checkDepositRenderData.return_date);
        CheckDepositRenderData.ReviewResult.ADAPTER.encodeWithTag(reverseProtoWriter, 5, checkDepositRenderData.review_result);
        DeclineReason.ADAPTER.encodeWithTag(reverseProtoWriter, 4, checkDepositRenderData.decline_reason);
        CheckDepositRenderData.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 3, checkDepositRenderData.status);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, checkDepositRenderData.detail);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, checkDepositRenderData.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CheckDepositRenderData checkDepositRenderData = (CheckDepositRenderData) obj;
        checkDepositRenderData.getClass();
        int size$okio = checkDepositRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.UINT64.encodedSizeWithTag(8, checkDepositRenderData.funds_hold_business_days) + Money.ADAPTER.encodedSizeWithTag(7, checkDepositRenderData.past_amount) + ProtoAdapter.INT64.encodedSizeWithTag(6, checkDepositRenderData.return_date) + CheckDepositRenderData.ReviewResult.ADAPTER.encodedSizeWithTag(5, checkDepositRenderData.review_result) + DeclineReason.ADAPTER.encodedSizeWithTag(4, checkDepositRenderData.decline_reason) + CheckDepositRenderData.Status.ADAPTER.encodedSizeWithTag(3, checkDepositRenderData.status) + protoAdapter.encodedSizeWithTag(2, checkDepositRenderData.detail) + protoAdapter.encodedSizeWithTag(1, checkDepositRenderData.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CheckDepositRenderData checkDepositRenderData = (CheckDepositRenderData) obj;
        checkDepositRenderData.getClass();
        Money money = checkDepositRenderData.past_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = checkDepositRenderData.title;
        String str2 = checkDepositRenderData.detail;
        CheckDepositRenderData.Status status = checkDepositRenderData.status;
        DeclineReason declineReason = checkDepositRenderData.decline_reason;
        CheckDepositRenderData.ReviewResult reviewResult = checkDepositRenderData.review_result;
        Long l = checkDepositRenderData.return_date;
        Long l2 = checkDepositRenderData.funds_hold_business_days;
        byteString.getClass();
        return new CheckDepositRenderData(str, str2, status, declineReason, reviewResult, l, money2, l2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CheckDepositRenderData checkDepositRenderData = (CheckDepositRenderData) obj;
        checkDepositRenderData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, checkDepositRenderData.title);
        protoAdapter.encodeWithTag(protoWriter, 2, checkDepositRenderData.detail);
        CheckDepositRenderData.Status.ADAPTER.encodeWithTag(protoWriter, 3, checkDepositRenderData.status);
        DeclineReason.ADAPTER.encodeWithTag(protoWriter, 4, checkDepositRenderData.decline_reason);
        CheckDepositRenderData.ReviewResult.ADAPTER.encodeWithTag(protoWriter, 5, checkDepositRenderData.review_result);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, checkDepositRenderData.return_date);
        Money.ADAPTER.encodeWithTag(protoWriter, 7, checkDepositRenderData.past_amount);
        ProtoAdapter.UINT64.encodeWithTag(protoWriter, 8, checkDepositRenderData.funds_hold_business_days);
        protoWriter.writeBytes(checkDepositRenderData.unknownFields());
    }
}
