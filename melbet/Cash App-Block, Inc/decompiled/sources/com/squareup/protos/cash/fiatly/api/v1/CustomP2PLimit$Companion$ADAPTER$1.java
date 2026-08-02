package com.squareup.protos.cash.fiatly.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.fiatly.api.v1.CustomP2PLimit;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CustomP2PLimit$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CustomP2PLimit((CustomP2PLimit.LimitType) obj, (Money) obj2, (Money) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = CustomP2PLimit.LimitType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CustomP2PLimit customP2PLimit = (CustomP2PLimit) obj;
        reverseProtoWriter.getClass();
        customP2PLimit.getClass();
        reverseProtoWriter.writeBytes(customP2PLimit.unknownFields());
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, customP2PLimit.remaining_usage);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, customP2PLimit.max);
        CustomP2PLimit.LimitType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, customP2PLimit.f1261type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CustomP2PLimit customP2PLimit = (CustomP2PLimit) obj;
        customP2PLimit.getClass();
        int encodedSizeWithTag = CustomP2PLimit.LimitType.ADAPTER.encodedSizeWithTag(1, customP2PLimit.f1261type) + customP2PLimit.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, customP2PLimit.remaining_usage) + protoAdapter.encodedSizeWithTag(2, customP2PLimit.max) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CustomP2PLimit customP2PLimit = (CustomP2PLimit) obj;
        customP2PLimit.getClass();
        Money money = customP2PLimit.max;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = customP2PLimit.remaining_usage;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        CustomP2PLimit.LimitType limitType = customP2PLimit.f1261type;
        byteString.getClass();
        return new CustomP2PLimit(limitType, money2, money4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CustomP2PLimit customP2PLimit = (CustomP2PLimit) obj;
        customP2PLimit.getClass();
        CustomP2PLimit.LimitType.ADAPTER.encodeWithTag(protoWriter, 1, customP2PLimit.f1261type);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, customP2PLimit.max);
        protoAdapter.encodeWithTag(protoWriter, 3, customP2PLimit.remaining_usage);
        protoWriter.writeBytes(customP2PLimit.unknownFields());
    }
}
