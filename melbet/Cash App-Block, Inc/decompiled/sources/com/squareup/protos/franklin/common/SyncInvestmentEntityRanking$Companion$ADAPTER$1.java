package com.squareup.protos.franklin.common;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.SyncInvestmentEntityRanking;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncInvestmentEntityRanking$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SyncInvestmentEntityRanking((SyncInvestmentEntityRanking.RankingType) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = SyncInvestmentEntityRanking.RankingType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncInvestmentEntityRanking syncInvestmentEntityRanking = (SyncInvestmentEntityRanking) obj;
        reverseProtoWriter.getClass();
        syncInvestmentEntityRanking.getClass();
        reverseProtoWriter.writeBytes(syncInvestmentEntityRanking.unknownFields());
        ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 2, syncInvestmentEntityRanking.investment_entity_tokens);
        SyncInvestmentEntityRanking.RankingType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, syncInvestmentEntityRanking.ranking_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncInvestmentEntityRanking syncInvestmentEntityRanking = (SyncInvestmentEntityRanking) obj;
        syncInvestmentEntityRanking.getClass();
        return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, syncInvestmentEntityRanking.investment_entity_tokens) + SyncInvestmentEntityRanking.RankingType.ADAPTER.encodedSizeWithTag(1, syncInvestmentEntityRanking.ranking_type) + syncInvestmentEntityRanking.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncInvestmentEntityRanking syncInvestmentEntityRanking = (SyncInvestmentEntityRanking) obj;
        syncInvestmentEntityRanking.getClass();
        ByteString byteString = ByteString.EMPTY;
        SyncInvestmentEntityRanking.RankingType rankingType = syncInvestmentEntityRanking.ranking_type;
        List list = syncInvestmentEntityRanking.investment_entity_tokens;
        list.getClass();
        byteString.getClass();
        return new SyncInvestmentEntityRanking(rankingType, list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncInvestmentEntityRanking syncInvestmentEntityRanking = (SyncInvestmentEntityRanking) obj;
        syncInvestmentEntityRanking.getClass();
        SyncInvestmentEntityRanking.RankingType.ADAPTER.encodeWithTag(protoWriter, 1, syncInvestmentEntityRanking.ranking_type);
        ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, syncInvestmentEntityRanking.investment_entity_tokens);
        protoWriter.writeBytes(syncInvestmentEntityRanking.unknownFields());
    }
}
