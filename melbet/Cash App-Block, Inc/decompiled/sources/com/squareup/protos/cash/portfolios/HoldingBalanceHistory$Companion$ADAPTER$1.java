package com.squareup.protos.cash.portfolios;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class HoldingBalanceHistory$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new HoldingBalanceHistory((Long) obj3, (Long) obj4, (Long) obj5, (String) obj, (String) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
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
                    m.add(HoldingBalanceTick.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        HoldingBalanceHistory holdingBalanceHistory = (HoldingBalanceHistory) obj;
        reverseProtoWriter.getClass();
        holdingBalanceHistory.getClass();
        reverseProtoWriter.writeBytes(holdingBalanceHistory.unknownFields());
        HoldingBalanceTick.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 6, holdingBalanceHistory.balance_ticks);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, holdingBalanceHistory.tick_frequency_ms);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, holdingBalanceHistory.end_time);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, holdingBalanceHistory.start_time);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, holdingBalanceHistory.symbol);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, holdingBalanceHistory.investment_entity_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        HoldingBalanceHistory holdingBalanceHistory = (HoldingBalanceHistory) obj;
        holdingBalanceHistory.getClass();
        int size$okio = holdingBalanceHistory.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, holdingBalanceHistory.symbol) + protoAdapter.encodedSizeWithTag(1, holdingBalanceHistory.investment_entity_token) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        return HoldingBalanceTick.ADAPTER.asRepeated().encodedSizeWithTag(6, holdingBalanceHistory.balance_ticks) + protoAdapter2.encodedSizeWithTag(5, holdingBalanceHistory.tick_frequency_ms) + protoAdapter2.encodedSizeWithTag(4, holdingBalanceHistory.end_time) + protoAdapter2.encodedSizeWithTag(3, holdingBalanceHistory.start_time) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        HoldingBalanceHistory holdingBalanceHistory = (HoldingBalanceHistory) obj;
        holdingBalanceHistory.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(holdingBalanceHistory.balance_ticks, HoldingBalanceTick.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = holdingBalanceHistory.investment_entity_token;
        String str2 = holdingBalanceHistory.symbol;
        Long l = holdingBalanceHistory.start_time;
        Long l2 = holdingBalanceHistory.end_time;
        Long l3 = holdingBalanceHistory.tick_frequency_ms;
        byteString.getClass();
        return new HoldingBalanceHistory(l, l2, l3, str, str2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        HoldingBalanceHistory holdingBalanceHistory = (HoldingBalanceHistory) obj;
        holdingBalanceHistory.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, holdingBalanceHistory.investment_entity_token);
        protoAdapter.encodeWithTag(protoWriter, 2, holdingBalanceHistory.symbol);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 3, holdingBalanceHistory.start_time);
        protoAdapter2.encodeWithTag(protoWriter, 4, holdingBalanceHistory.end_time);
        protoAdapter2.encodeWithTag(protoWriter, 5, holdingBalanceHistory.tick_frequency_ms);
        HoldingBalanceTick.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, holdingBalanceHistory.balance_ticks);
        protoWriter.writeBytes(holdingBalanceHistory.unknownFields());
    }
}
