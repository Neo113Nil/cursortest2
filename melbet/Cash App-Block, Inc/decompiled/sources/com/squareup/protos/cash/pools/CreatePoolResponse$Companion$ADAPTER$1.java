package com.squareup.protos.cash.pools;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.pools.CreatePoolResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreatePoolResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreatePoolResponse((CreatePoolResponse.FailureReason) obj, (MoneyPool) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = CreatePoolResponse.FailureReason.ADAPTER.decode(protoReader);
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
        CreatePoolResponse createPoolResponse = (CreatePoolResponse) obj;
        reverseProtoWriter.getClass();
        createPoolResponse.getClass();
        reverseProtoWriter.writeBytes(createPoolResponse.unknownFields());
        MoneyPool.ADAPTER.encodeWithTag(reverseProtoWriter, 2, createPoolResponse.pool);
        CreatePoolResponse.FailureReason.ADAPTER.encodeWithTag(reverseProtoWriter, 1, createPoolResponse.failure_reason);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreatePoolResponse createPoolResponse = (CreatePoolResponse) obj;
        createPoolResponse.getClass();
        return MoneyPool.ADAPTER.encodedSizeWithTag(2, createPoolResponse.pool) + CreatePoolResponse.FailureReason.ADAPTER.encodedSizeWithTag(1, createPoolResponse.failure_reason) + createPoolResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreatePoolResponse createPoolResponse = (CreatePoolResponse) obj;
        createPoolResponse.getClass();
        MoneyPool moneyPool = createPoolResponse.pool;
        MoneyPool moneyPool2 = moneyPool != null ? (MoneyPool) MoneyPool.ADAPTER.redact(moneyPool) : null;
        ByteString byteString = ByteString.EMPTY;
        CreatePoolResponse.FailureReason failureReason = createPoolResponse.failure_reason;
        byteString.getClass();
        return new CreatePoolResponse(failureReason, moneyPool2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreatePoolResponse createPoolResponse = (CreatePoolResponse) obj;
        createPoolResponse.getClass();
        CreatePoolResponse.FailureReason.ADAPTER.encodeWithTag(protoWriter, 1, createPoolResponse.failure_reason);
        MoneyPool.ADAPTER.encodeWithTag(protoWriter, 2, createPoolResponse.pool);
        protoWriter.writeBytes(createPoolResponse.unknownFields());
    }
}
