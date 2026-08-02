package com.squareup.protos.cash.pools;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.pools.GetMoneyPoolResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetMoneyPoolResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetMoneyPoolResponse((GetMoneyPoolResponse.FailureReason) obj, (MoneyPool) obj2, (Boolean) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = GetMoneyPoolResponse.FailureReason.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(MoneyPool.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetMoneyPoolResponse getMoneyPoolResponse = (GetMoneyPoolResponse) obj;
        reverseProtoWriter.getClass();
        getMoneyPoolResponse.getClass();
        reverseProtoWriter.writeBytes(getMoneyPoolResponse.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, getMoneyPoolResponse.viewer_eligible_to_leave_pool);
        MoneyPool.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getMoneyPoolResponse.pool);
        GetMoneyPoolResponse.FailureReason.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getMoneyPoolResponse.failure_reason);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetMoneyPoolResponse getMoneyPoolResponse = (GetMoneyPoolResponse) obj;
        getMoneyPoolResponse.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(3, getMoneyPoolResponse.viewer_eligible_to_leave_pool) + MoneyPool.ADAPTER.encodedSizeWithTag(2, getMoneyPoolResponse.pool) + GetMoneyPoolResponse.FailureReason.ADAPTER.encodedSizeWithTag(1, getMoneyPoolResponse.failure_reason) + getMoneyPoolResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetMoneyPoolResponse getMoneyPoolResponse = (GetMoneyPoolResponse) obj;
        getMoneyPoolResponse.getClass();
        MoneyPool moneyPool = getMoneyPoolResponse.pool;
        MoneyPool moneyPool2 = moneyPool != null ? (MoneyPool) MoneyPool.ADAPTER.redact(moneyPool) : null;
        ByteString byteString = ByteString.EMPTY;
        GetMoneyPoolResponse.FailureReason failureReason = getMoneyPoolResponse.failure_reason;
        Boolean bool = getMoneyPoolResponse.viewer_eligible_to_leave_pool;
        byteString.getClass();
        return new GetMoneyPoolResponse(failureReason, moneyPool2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetMoneyPoolResponse getMoneyPoolResponse = (GetMoneyPoolResponse) obj;
        getMoneyPoolResponse.getClass();
        GetMoneyPoolResponse.FailureReason.ADAPTER.encodeWithTag(protoWriter, 1, getMoneyPoolResponse.failure_reason);
        MoneyPool.ADAPTER.encodeWithTag(protoWriter, 2, getMoneyPoolResponse.pool);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getMoneyPoolResponse.viewer_eligible_to_leave_pool);
        protoWriter.writeBytes(getMoneyPoolResponse.unknownFields());
    }
}
