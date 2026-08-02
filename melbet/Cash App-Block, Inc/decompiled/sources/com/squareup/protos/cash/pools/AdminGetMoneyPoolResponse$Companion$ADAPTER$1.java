package com.squareup.protos.cash.pools;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AdminGetMoneyPoolResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AdminGetMoneyPoolResponse((MoneyPool) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(MoneyPool.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AdminGetMoneyPoolResponse adminGetMoneyPoolResponse = (AdminGetMoneyPoolResponse) obj;
        reverseProtoWriter.getClass();
        adminGetMoneyPoolResponse.getClass();
        reverseProtoWriter.writeBytes(adminGetMoneyPoolResponse.unknownFields());
        MoneyPool.ADAPTER.encodeWithTag(reverseProtoWriter, 1, adminGetMoneyPoolResponse.pool);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AdminGetMoneyPoolResponse adminGetMoneyPoolResponse = (AdminGetMoneyPoolResponse) obj;
        adminGetMoneyPoolResponse.getClass();
        return MoneyPool.ADAPTER.encodedSizeWithTag(1, adminGetMoneyPoolResponse.pool) + adminGetMoneyPoolResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AdminGetMoneyPoolResponse adminGetMoneyPoolResponse = (AdminGetMoneyPoolResponse) obj;
        adminGetMoneyPoolResponse.getClass();
        MoneyPool moneyPool = adminGetMoneyPoolResponse.pool;
        MoneyPool moneyPool2 = moneyPool != null ? (MoneyPool) MoneyPool.ADAPTER.redact(moneyPool) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AdminGetMoneyPoolResponse(moneyPool2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AdminGetMoneyPoolResponse adminGetMoneyPoolResponse = (AdminGetMoneyPoolResponse) obj;
        adminGetMoneyPoolResponse.getClass();
        MoneyPool.ADAPTER.encodeWithTag(protoWriter, 1, adminGetMoneyPoolResponse.pool);
        protoWriter.writeBytes(adminGetMoneyPoolResponse.unknownFields());
    }
}
