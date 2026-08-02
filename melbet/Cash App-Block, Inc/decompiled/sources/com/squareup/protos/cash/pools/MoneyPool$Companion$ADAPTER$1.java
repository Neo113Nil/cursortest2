package com.squareup.protos.cash.pools;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class MoneyPool$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        PoolState poolState;
        Long l;
        ?? decode;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        String str = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        PoolState poolState2 = null;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        Long l5 = null;
        PoolVisibility poolVisibility = null;
        String str2 = null;
        PoolGoalState poolGoalState = null;
        Long l6 = null;
        Integer num = null;
        String str3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MoneyPool(str, str3, (Money) obj3, (PoolOwner) obj4, m, (Money) obj5, poolState2, l2, l3, l4, l5, poolVisibility, str2, poolGoalState, l6, num, (PoolSurcharge) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
                    decode = str;
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(PoolOwner.ADAPTER, protoReader, obj4);
                    decode = str;
                    break;
                case 5:
                    obj = obj2;
                    poolState = poolState2;
                    l = l2;
                    m.add(PoolParticipant.ADAPTER.decode(protoReader));
                    decode = str;
                    obj2 = obj;
                    poolState2 = poolState;
                    l2 = l;
                    break;
                case 6:
                    obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj5);
                    decode = str;
                    break;
                case 7:
                    obj = obj2;
                    poolState = poolState2;
                    l = l2;
                    try {
                        poolState2 = PoolState.ADAPTER.decode(protoReader);
                        obj2 = obj;
                        l2 = l;
                        decode = str;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 8:
                    l2 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str;
                    break;
                case 9:
                    l3 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str;
                    break;
                case 10:
                    l4 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str;
                    break;
                case 11:
                    l5 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str;
                    break;
                case 12:
                    obj = obj2;
                    poolState = poolState2;
                    l = l2;
                    try {
                        poolVisibility = PoolVisibility.ADAPTER.decode(protoReader);
                        obj2 = obj;
                        poolState2 = poolState;
                        l2 = l;
                        decode = str;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 13:
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 14:
                    try {
                        poolGoalState = PoolGoalState.ADAPTER.decode(protoReader);
                        decode = str;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        obj = obj2;
                        poolState = poolState2;
                        l = l2;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 15:
                    l6 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str;
                    break;
                case 16:
                    num = ProtoAdapter.INT32.decode(protoReader);
                    decode = str;
                    break;
                case 17:
                    obj2 = TransactorKt.decodeMessageOrMerge(PoolSurcharge.ADAPTER, protoReader, obj2);
                    decode = str;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj2;
                    poolState = poolState2;
                    l = l2;
                    decode = str;
                    obj2 = obj;
                    poolState2 = poolState;
                    l2 = l;
                    break;
            }
            str = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MoneyPool moneyPool = (MoneyPool) obj;
        reverseProtoWriter.getClass();
        moneyPool.getClass();
        reverseProtoWriter.writeBytes(moneyPool.unknownFields());
        PoolSurcharge.ADAPTER.encodeWithTag(reverseProtoWriter, 17, moneyPool.surcharge);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 16, moneyPool.participants_count);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 15, moneyPool.goal_reached_at);
        PoolGoalState.ADAPTER.encodeWithTag(reverseProtoWriter, 14, moneyPool.goal_state);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 13, moneyPool.share_link);
        PoolVisibility.ADAPTER.encodeWithTag(reverseProtoWriter, 12, moneyPool.pool_visibility);
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, moneyPool.latest_contribution_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, moneyPool.contributions_count);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, moneyPool.closed_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, moneyPool.created_at);
        PoolState.ADAPTER.encodeWithTag(reverseProtoWriter, 7, moneyPool.status);
        ProtoAdapter protoAdapter3 = Money.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 6, moneyPool.balance);
        PoolParticipant.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 5, moneyPool.participants);
        PoolOwner.ADAPTER.encodeWithTag(reverseProtoWriter, 4, moneyPool.owner);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 3, moneyPool.target);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, moneyPool.name);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, moneyPool.pool_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MoneyPool moneyPool = (MoneyPool) obj;
        moneyPool.getClass();
        int size$okio = moneyPool.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, moneyPool.name) + protoAdapter.encodedSizeWithTag(1, moneyPool.pool_token) + size$okio;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        int encodedSizeWithTag2 = PoolState.ADAPTER.encodedSizeWithTag(7, moneyPool.status) + protoAdapter2.encodedSizeWithTag(6, moneyPool.balance) + PoolParticipant.ADAPTER.asRepeated().encodedSizeWithTag(5, moneyPool.participants) + PoolOwner.ADAPTER.encodedSizeWithTag(4, moneyPool.owner) + protoAdapter2.encodedSizeWithTag(3, moneyPool.target) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
        return PoolSurcharge.ADAPTER.encodedSizeWithTag(17, moneyPool.surcharge) + ProtoAdapter.INT32.encodedSizeWithTag(16, moneyPool.participants_count) + protoAdapter3.encodedSizeWithTag(15, moneyPool.goal_reached_at) + PoolGoalState.ADAPTER.encodedSizeWithTag(14, moneyPool.goal_state) + protoAdapter.encodedSizeWithTag(13, moneyPool.share_link) + PoolVisibility.ADAPTER.encodedSizeWithTag(12, moneyPool.pool_visibility) + protoAdapter3.encodedSizeWithTag(11, moneyPool.latest_contribution_at) + protoAdapter3.encodedSizeWithTag(10, moneyPool.contributions_count) + protoAdapter3.encodedSizeWithTag(9, moneyPool.closed_at) + protoAdapter3.encodedSizeWithTag(8, moneyPool.created_at) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MoneyPool moneyPool = (MoneyPool) obj;
        moneyPool.getClass();
        Money money = moneyPool.target;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        PoolOwner poolOwner = moneyPool.owner;
        PoolOwner poolOwner2 = poolOwner != null ? (PoolOwner) PoolOwner.ADAPTER.redact(poolOwner) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(moneyPool.participants, PoolParticipant.ADAPTER);
        PoolSurcharge poolSurcharge = moneyPool.surcharge;
        PoolSurcharge poolSurcharge2 = poolSurcharge != null ? (PoolSurcharge) PoolSurcharge.ADAPTER.redact(poolSurcharge) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = moneyPool.pool_token;
        PoolState poolState = moneyPool.status;
        Long l = moneyPool.created_at;
        Long l2 = moneyPool.closed_at;
        Long l3 = moneyPool.contributions_count;
        Long l4 = moneyPool.latest_contribution_at;
        PoolVisibility poolVisibility = moneyPool.pool_visibility;
        String str2 = moneyPool.share_link;
        PoolGoalState poolGoalState = moneyPool.goal_state;
        Long l5 = moneyPool.goal_reached_at;
        Integer num = moneyPool.participants_count;
        byteString.getClass();
        return new MoneyPool(str, null, money2, poolOwner2, m1169redactElements, null, poolState, l, l2, l3, l4, poolVisibility, str2, poolGoalState, l5, num, poolSurcharge2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MoneyPool moneyPool = (MoneyPool) obj;
        moneyPool.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, moneyPool.pool_token);
        protoAdapter.encodeWithTag(protoWriter, 2, moneyPool.name);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, moneyPool.target);
        PoolOwner.ADAPTER.encodeWithTag(protoWriter, 4, moneyPool.owner);
        PoolParticipant.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, moneyPool.participants);
        protoAdapter2.encodeWithTag(protoWriter, 6, moneyPool.balance);
        PoolState.ADAPTER.encodeWithTag(protoWriter, 7, moneyPool.status);
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
        protoAdapter3.encodeWithTag(protoWriter, 8, moneyPool.created_at);
        protoAdapter3.encodeWithTag(protoWriter, 9, moneyPool.closed_at);
        protoAdapter3.encodeWithTag(protoWriter, 10, moneyPool.contributions_count);
        protoAdapter3.encodeWithTag(protoWriter, 11, moneyPool.latest_contribution_at);
        PoolVisibility.ADAPTER.encodeWithTag(protoWriter, 12, moneyPool.pool_visibility);
        protoAdapter.encodeWithTag(protoWriter, 13, moneyPool.share_link);
        PoolGoalState.ADAPTER.encodeWithTag(protoWriter, 14, moneyPool.goal_state);
        protoAdapter3.encodeWithTag(protoWriter, 15, moneyPool.goal_reached_at);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 16, moneyPool.participants_count);
        PoolSurcharge.ADAPTER.encodeWithTag(protoWriter, 17, moneyPool.surcharge);
        protoWriter.writeBytes(moneyPool.unknownFields());
    }
}
