package com.squareup.protos.franklin.loyalty;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PointsReward$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PointsReward((Long) obj, (String) obj2, (String) obj3, (Money) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PointsReward pointsReward = (PointsReward) obj;
        reverseProtoWriter.getClass();
        pointsReward.getClass();
        reverseProtoWriter.writeBytes(pointsReward.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 4, pointsReward.max_discount);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, pointsReward.token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, pointsReward.display_name);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, pointsReward.points_required);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PointsReward pointsReward = (PointsReward) obj;
        pointsReward.getClass();
        int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, pointsReward.points_required) + pointsReward.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Money.ADAPTER.encodedSizeWithTag(4, pointsReward.max_discount) + protoAdapter.encodedSizeWithTag(3, pointsReward.token) + protoAdapter.encodedSizeWithTag(2, pointsReward.display_name) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PointsReward pointsReward = (PointsReward) obj;
        pointsReward.getClass();
        Money money = pointsReward.max_discount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = pointsReward.points_required;
        String str = pointsReward.display_name;
        String str2 = pointsReward.token;
        byteString.getClass();
        return new PointsReward(l, str, str2, money2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PointsReward pointsReward = (PointsReward) obj;
        pointsReward.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, pointsReward.points_required);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, pointsReward.display_name);
        protoAdapter.encodeWithTag(protoWriter, 3, pointsReward.token);
        Money.ADAPTER.encodeWithTag(protoWriter, 4, pointsReward.max_discount);
        protoWriter.writeBytes(pointsReward.unknownFields());
    }
}
