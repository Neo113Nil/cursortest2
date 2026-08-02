package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashsuggest.api.HeroUpsellSection;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class HeroUpsellSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new HeroUpsellSection((LocalizedString) obj, (LocalizedString) obj2, (Image) obj3, (LocalizedString) obj4, (HeroUpsellSection.SectionCTA) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(HeroUpsellSection.SectionCTA.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        HeroUpsellSection heroUpsellSection = (HeroUpsellSection) obj;
        reverseProtoWriter.getClass();
        heroUpsellSection.getClass();
        reverseProtoWriter.writeBytes(heroUpsellSection.unknownFields());
        HeroUpsellSection.SectionCTA.ADAPTER.encodeWithTag(reverseProtoWriter, 5, heroUpsellSection.section_cta);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, heroUpsellSection.footer);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 3, heroUpsellSection.image);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, heroUpsellSection.body);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, heroUpsellSection.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        HeroUpsellSection heroUpsellSection = (HeroUpsellSection) obj;
        heroUpsellSection.getClass();
        int size$okio = heroUpsellSection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return HeroUpsellSection.SectionCTA.ADAPTER.encodedSizeWithTag(5, heroUpsellSection.section_cta) + protoAdapter.encodedSizeWithTag(4, heroUpsellSection.footer) + Image.ADAPTER.encodedSizeWithTag(3, heroUpsellSection.image) + protoAdapter.encodedSizeWithTag(2, heroUpsellSection.body) + protoAdapter.encodedSizeWithTag(1, heroUpsellSection.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        HeroUpsellSection heroUpsellSection = (HeroUpsellSection) obj;
        heroUpsellSection.getClass();
        LocalizedString localizedString = heroUpsellSection.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = heroUpsellSection.body;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        Image image = heroUpsellSection.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        LocalizedString localizedString5 = heroUpsellSection.footer;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        HeroUpsellSection.SectionCTA sectionCTA = heroUpsellSection.section_cta;
        HeroUpsellSection.SectionCTA sectionCTA2 = sectionCTA != null ? (HeroUpsellSection.SectionCTA) HeroUpsellSection.SectionCTA.ADAPTER.redact(sectionCTA) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new HeroUpsellSection(localizedString2, localizedString4, image2, localizedString6, sectionCTA2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        HeroUpsellSection heroUpsellSection = (HeroUpsellSection) obj;
        heroUpsellSection.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, heroUpsellSection.title);
        protoAdapter.encodeWithTag(protoWriter, 2, heroUpsellSection.body);
        Image.ADAPTER.encodeWithTag(protoWriter, 3, heroUpsellSection.image);
        protoAdapter.encodeWithTag(protoWriter, 4, heroUpsellSection.footer);
        HeroUpsellSection.SectionCTA.ADAPTER.encodeWithTag(protoWriter, 5, heroUpsellSection.section_cta);
        protoWriter.writeBytes(heroUpsellSection.unknownFields());
    }
}
