package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashsuggest.api.HeroUpsellSection;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class HeroUpsellSection$SectionCTA$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new HeroUpsellSection.SectionCTA((LocalizedString) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        HeroUpsellSection.SectionCTA sectionCTA = (HeroUpsellSection.SectionCTA) obj;
        reverseProtoWriter.getClass();
        sectionCTA.getClass();
        reverseProtoWriter.writeBytes(sectionCTA.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, sectionCTA.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        HeroUpsellSection.SectionCTA sectionCTA = (HeroUpsellSection.SectionCTA) obj;
        sectionCTA.getClass();
        return LocalizedString.ADAPTER.encodedSizeWithTag(1, sectionCTA.title) + sectionCTA.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        HeroUpsellSection.SectionCTA sectionCTA = (HeroUpsellSection.SectionCTA) obj;
        sectionCTA.getClass();
        LocalizedString localizedString = sectionCTA.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new HeroUpsellSection.SectionCTA(localizedString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        HeroUpsellSection.SectionCTA sectionCTA = (HeroUpsellSection.SectionCTA) obj;
        sectionCTA.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, sectionCTA.title);
        protoWriter.writeBytes(sectionCTA.unknownFields());
    }
}
