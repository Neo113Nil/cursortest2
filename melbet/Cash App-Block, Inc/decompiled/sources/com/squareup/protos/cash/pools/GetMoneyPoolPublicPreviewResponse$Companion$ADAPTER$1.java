package com.squareup.protos.cash.pools;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.pools.GetMoneyPoolPublicPreviewResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetMoneyPoolPublicPreviewResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetMoneyPoolPublicPreviewResponse((GetMoneyPoolPublicPreviewResponse.FailureReason) obj, (MoneyPool) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = GetMoneyPoolPublicPreviewResponse.FailureReason.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(MoneyPool.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetMoneyPoolPublicPreviewResponse getMoneyPoolPublicPreviewResponse = (GetMoneyPoolPublicPreviewResponse) obj;
        reverseProtoWriter.getClass();
        getMoneyPoolPublicPreviewResponse.getClass();
        reverseProtoWriter.writeBytes(getMoneyPoolPublicPreviewResponse.unknownFields());
        MoneyPool.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getMoneyPoolPublicPreviewResponse.pool);
        GetMoneyPoolPublicPreviewResponse.FailureReason.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getMoneyPoolPublicPreviewResponse.failure_reason);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetMoneyPoolPublicPreviewResponse getMoneyPoolPublicPreviewResponse = (GetMoneyPoolPublicPreviewResponse) obj;
        getMoneyPoolPublicPreviewResponse.getClass();
        return MoneyPool.ADAPTER.encodedSizeWithTag(2, getMoneyPoolPublicPreviewResponse.pool) + GetMoneyPoolPublicPreviewResponse.FailureReason.ADAPTER.encodedSizeWithTag(1, getMoneyPoolPublicPreviewResponse.failure_reason) + getMoneyPoolPublicPreviewResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetMoneyPoolPublicPreviewResponse getMoneyPoolPublicPreviewResponse = (GetMoneyPoolPublicPreviewResponse) obj;
        getMoneyPoolPublicPreviewResponse.getClass();
        MoneyPool moneyPool = getMoneyPoolPublicPreviewResponse.pool;
        MoneyPool moneyPool2 = moneyPool != null ? (MoneyPool) MoneyPool.ADAPTER.redact(moneyPool) : null;
        ByteString byteString = ByteString.EMPTY;
        GetMoneyPoolPublicPreviewResponse.FailureReason failureReason = getMoneyPoolPublicPreviewResponse.failure_reason;
        byteString.getClass();
        return new GetMoneyPoolPublicPreviewResponse(failureReason, moneyPool2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetMoneyPoolPublicPreviewResponse getMoneyPoolPublicPreviewResponse = (GetMoneyPoolPublicPreviewResponse) obj;
        getMoneyPoolPublicPreviewResponse.getClass();
        GetMoneyPoolPublicPreviewResponse.FailureReason.ADAPTER.encodeWithTag(protoWriter, 1, getMoneyPoolPublicPreviewResponse.failure_reason);
        MoneyPool.ADAPTER.encodeWithTag(protoWriter, 2, getMoneyPoolPublicPreviewResponse.pool);
        protoWriter.writeBytes(getMoneyPoolPublicPreviewResponse.unknownFields());
    }
}
