package com.squareup.protos.cash.portfolios;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BalanceTick$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BalanceTick((Long) obj, (BalanceEventList) obj2, (Long) obj3, (Long) obj4, (Long) obj5, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(BalanceEventList.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BalanceTick balanceTick = (BalanceTick) obj;
        reverseProtoWriter.getClass();
        balanceTick.getClass();
        reverseProtoWriter.writeBytes(balanceTick.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 6, balanceTick.display_text);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, balanceTick.gain_bps);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, balanceTick.gain_amount_cents);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, balanceTick.time_sec);
        BalanceEventList.ADAPTER.encodeWithTag(reverseProtoWriter, 2, balanceTick.balanceEventList);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, balanceTick.amount_cents);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BalanceTick balanceTick = (BalanceTick) obj;
        balanceTick.getClass();
        int size$okio = balanceTick.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        return ProtoAdapter.STRING.encodedSizeWithTag(6, balanceTick.display_text) + protoAdapter.encodedSizeWithTag(5, balanceTick.gain_bps) + protoAdapter.encodedSizeWithTag(4, balanceTick.gain_amount_cents) + protoAdapter.encodedSizeWithTag(3, balanceTick.time_sec) + BalanceEventList.ADAPTER.encodedSizeWithTag(2, balanceTick.balanceEventList) + protoAdapter.encodedSizeWithTag(1, balanceTick.amount_cents) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BalanceTick balanceTick = (BalanceTick) obj;
        balanceTick.getClass();
        BalanceEventList balanceEventList = balanceTick.balanceEventList;
        BalanceEventList balanceEventList2 = balanceEventList != null ? (BalanceEventList) BalanceEventList.ADAPTER.redact(balanceEventList) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = balanceTick.time_sec;
        Long l2 = balanceTick.gain_bps;
        String str = balanceTick.display_text;
        byteString.getClass();
        return new BalanceTick((Long) null, balanceEventList2, l, (Long) null, l2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BalanceTick balanceTick = (BalanceTick) obj;
        balanceTick.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, balanceTick.amount_cents);
        BalanceEventList.ADAPTER.encodeWithTag(protoWriter, 2, balanceTick.balanceEventList);
        protoAdapter.encodeWithTag(protoWriter, 3, balanceTick.time_sec);
        protoAdapter.encodeWithTag(protoWriter, 4, balanceTick.gain_amount_cents);
        protoAdapter.encodeWithTag(protoWriter, 5, balanceTick.gain_bps);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, balanceTick.display_text);
        protoWriter.writeBytes(balanceTick.unknownFields());
    }
}
