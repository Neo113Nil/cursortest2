package com.squareup.protos.cash.aegis.core;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.aegis.core.CustomLimit;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CustomLimit$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CustomLimit((CustomLimit.LimitType) obj, (Money) obj2, (Money) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = CustomLimit.LimitType.ADAPTER.decode(protoReader);
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
        CustomLimit customLimit = (CustomLimit) obj;
        reverseProtoWriter.getClass();
        customLimit.getClass();
        reverseProtoWriter.writeBytes(customLimit.unknownFields());
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, customLimit.remaining_usage);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, customLimit.max);
        CustomLimit.LimitType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, customLimit.f1242type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CustomLimit customLimit = (CustomLimit) obj;
        customLimit.getClass();
        int encodedSizeWithTag = CustomLimit.LimitType.ADAPTER.encodedSizeWithTag(1, customLimit.f1242type) + customLimit.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, customLimit.remaining_usage) + protoAdapter.encodedSizeWithTag(2, customLimit.max) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CustomLimit customLimit = (CustomLimit) obj;
        customLimit.getClass();
        Money money = customLimit.max;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = customLimit.remaining_usage;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        CustomLimit.LimitType limitType = customLimit.f1242type;
        byteString.getClass();
        return new CustomLimit(limitType, money2, money4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CustomLimit customLimit = (CustomLimit) obj;
        customLimit.getClass();
        CustomLimit.LimitType.ADAPTER.encodeWithTag(protoWriter, 1, customLimit.f1242type);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, customLimit.max);
        protoAdapter.encodeWithTag(protoWriter, 3, customLimit.remaining_usage);
        protoWriter.writeBytes(customLimit.unknownFields());
    }
}
