package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashsuggest.api.HeroBalanceSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class HeroBalanceSection$NoBalance$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new HeroBalanceSection.NoBalance((HeroBalanceSection.SectionCTA) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(HeroBalanceSection.SectionCTA.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        HeroBalanceSection.NoBalance noBalance = (HeroBalanceSection.NoBalance) obj;
        reverseProtoWriter.getClass();
        noBalance.getClass();
        reverseProtoWriter.writeBytes(noBalance.unknownFields());
        HeroBalanceSection.SectionCTA.ADAPTER.encodeWithTag(reverseProtoWriter, 2, noBalance.cta);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        HeroBalanceSection.NoBalance noBalance = (HeroBalanceSection.NoBalance) obj;
        noBalance.getClass();
        return HeroBalanceSection.SectionCTA.ADAPTER.encodedSizeWithTag(2, noBalance.cta) + noBalance.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        HeroBalanceSection.NoBalance noBalance = (HeroBalanceSection.NoBalance) obj;
        noBalance.getClass();
        HeroBalanceSection.SectionCTA sectionCTA = noBalance.cta;
        HeroBalanceSection.SectionCTA sectionCTA2 = sectionCTA != null ? (HeroBalanceSection.SectionCTA) HeroBalanceSection.SectionCTA.ADAPTER.redact(sectionCTA) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new HeroBalanceSection.NoBalance(sectionCTA2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        HeroBalanceSection.NoBalance noBalance = (HeroBalanceSection.NoBalance) obj;
        noBalance.getClass();
        HeroBalanceSection.SectionCTA.ADAPTER.encodeWithTag(protoWriter, 2, noBalance.cta);
        protoWriter.writeBytes(noBalance.unknownFields());
    }
}
