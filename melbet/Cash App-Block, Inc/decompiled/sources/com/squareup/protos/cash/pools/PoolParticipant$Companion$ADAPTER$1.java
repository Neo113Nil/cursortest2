package com.squareup.protos.cash.pools;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PoolParticipant$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PoolParticipant((String) obj, (Long) obj2, (String) obj3, (String) obj4, (PoolParticipantType) obj5, (String) obj6, (Money) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    try {
                        obj5 = PoolParticipantType.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj7);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PoolParticipant poolParticipant = (PoolParticipant) obj;
        reverseProtoWriter.getClass();
        poolParticipant.getClass();
        reverseProtoWriter.writeBytes(poolParticipant.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 7, poolParticipant.aggregated_contribution_amount);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, poolParticipant.cashtag);
        PoolParticipantType.ADAPTER.encodeWithTag(reverseProtoWriter, 5, poolParticipant.participant_type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, poolParticipant.profile_photo_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, poolParticipant.full_name);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, poolParticipant.added_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, poolParticipant.customer_identifier);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PoolParticipant poolParticipant = (PoolParticipant) obj;
        poolParticipant.getClass();
        int size$okio = poolParticipant.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Money.ADAPTER.encodedSizeWithTag(7, poolParticipant.aggregated_contribution_amount) + protoAdapter.encodedSizeWithTag(6, poolParticipant.cashtag) + PoolParticipantType.ADAPTER.encodedSizeWithTag(5, poolParticipant.participant_type) + protoAdapter.encodedSizeWithTag(4, poolParticipant.profile_photo_url) + protoAdapter.encodedSizeWithTag(3, poolParticipant.full_name) + ProtoAdapter.INT64.encodedSizeWithTag(2, poolParticipant.added_at) + protoAdapter.encodedSizeWithTag(1, poolParticipant.customer_identifier) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PoolParticipant poolParticipant = (PoolParticipant) obj;
        poolParticipant.getClass();
        Money money = poolParticipant.aggregated_contribution_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = poolParticipant.customer_identifier;
        Long l = poolParticipant.added_at;
        PoolParticipantType poolParticipantType = poolParticipant.participant_type;
        byteString.getClass();
        return new PoolParticipant(str, l, null, null, poolParticipantType, null, money2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PoolParticipant poolParticipant = (PoolParticipant) obj;
        poolParticipant.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, poolParticipant.customer_identifier);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, poolParticipant.added_at);
        protoAdapter.encodeWithTag(protoWriter, 3, poolParticipant.full_name);
        protoAdapter.encodeWithTag(protoWriter, 4, poolParticipant.profile_photo_url);
        PoolParticipantType.ADAPTER.encodeWithTag(protoWriter, 5, poolParticipant.participant_type);
        protoAdapter.encodeWithTag(protoWriter, 6, poolParticipant.cashtag);
        Money.ADAPTER.encodeWithTag(protoWriter, 7, poolParticipant.aggregated_contribution_amount);
        protoWriter.writeBytes(poolParticipant.unknownFields());
    }
}
