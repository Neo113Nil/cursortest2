package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.P2pPoolRenderData;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class P2pPoolRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new P2pPoolRenderData((String) obj, (String) obj2, (String) obj3, (Avatar) obj4, (Money) obj5, (Money) obj6, (P2pPoolRenderData.PoolState) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(Avatar.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    try {
                        obj7 = P2pPoolRenderData.PoolState.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        P2pPoolRenderData p2pPoolRenderData = (P2pPoolRenderData) obj;
        reverseProtoWriter.getClass();
        p2pPoolRenderData.getClass();
        reverseProtoWriter.writeBytes(p2pPoolRenderData.unknownFields());
        P2pPoolRenderData.PoolState.ADAPTER.encodeWithTag(reverseProtoWriter, 7, p2pPoolRenderData.state);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, p2pPoolRenderData.contributed_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, p2pPoolRenderData.goal_amount);
        Avatar.ADAPTER.encodeWithTag(reverseProtoWriter, 4, p2pPoolRenderData.avatar);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, p2pPoolRenderData.pool_name);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, p2pPoolRenderData.pool_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, p2pPoolRenderData.owner_customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        P2pPoolRenderData p2pPoolRenderData = (P2pPoolRenderData) obj;
        p2pPoolRenderData.getClass();
        int size$okio = p2pPoolRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = Avatar.ADAPTER.encodedSizeWithTag(4, p2pPoolRenderData.avatar) + protoAdapter.encodedSizeWithTag(3, p2pPoolRenderData.pool_name) + protoAdapter.encodedSizeWithTag(2, p2pPoolRenderData.pool_token) + protoAdapter.encodedSizeWithTag(1, p2pPoolRenderData.owner_customer_token) + size$okio;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        return P2pPoolRenderData.PoolState.ADAPTER.encodedSizeWithTag(7, p2pPoolRenderData.state) + protoAdapter2.encodedSizeWithTag(6, p2pPoolRenderData.contributed_amount) + protoAdapter2.encodedSizeWithTag(5, p2pPoolRenderData.goal_amount) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        P2pPoolRenderData p2pPoolRenderData = (P2pPoolRenderData) obj;
        p2pPoolRenderData.getClass();
        Avatar avatar = p2pPoolRenderData.avatar;
        Avatar avatar2 = avatar != null ? (Avatar) Avatar.ADAPTER.redact(avatar) : null;
        Money money = p2pPoolRenderData.goal_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = p2pPoolRenderData.contributed_amount;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = p2pPoolRenderData.owner_customer_token;
        String str2 = p2pPoolRenderData.pool_token;
        String str3 = p2pPoolRenderData.pool_name;
        P2pPoolRenderData.PoolState poolState = p2pPoolRenderData.state;
        byteString.getClass();
        return new P2pPoolRenderData(str, str2, str3, avatar2, money2, money4, poolState, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        P2pPoolRenderData p2pPoolRenderData = (P2pPoolRenderData) obj;
        p2pPoolRenderData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, p2pPoolRenderData.owner_customer_token);
        protoAdapter.encodeWithTag(protoWriter, 2, p2pPoolRenderData.pool_token);
        protoAdapter.encodeWithTag(protoWriter, 3, p2pPoolRenderData.pool_name);
        Avatar.ADAPTER.encodeWithTag(protoWriter, 4, p2pPoolRenderData.avatar);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 5, p2pPoolRenderData.goal_amount);
        protoAdapter2.encodeWithTag(protoWriter, 6, p2pPoolRenderData.contributed_amount);
        P2pPoolRenderData.PoolState.ADAPTER.encodeWithTag(protoWriter, 7, p2pPoolRenderData.state);
        protoWriter.writeBytes(p2pPoolRenderData.unknownFields());
    }
}
