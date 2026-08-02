package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashsuggest.api.HeroBalanceSection;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class HeroBalanceSection$SectionCTA$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new HeroBalanceSection.SectionCTA((LocalizedString) obj, (com.squareup.protos.cash.shop.rendering.api.TapAction) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        HeroBalanceSection.SectionCTA sectionCTA = (HeroBalanceSection.SectionCTA) obj;
        reverseProtoWriter.getClass();
        sectionCTA.getClass();
        reverseProtoWriter.writeBytes(sectionCTA.unknownFields());
        com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 2, sectionCTA.tap_action);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, sectionCTA.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        HeroBalanceSection.SectionCTA sectionCTA = (HeroBalanceSection.SectionCTA) obj;
        sectionCTA.getClass();
        return com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER.encodedSizeWithTag(2, sectionCTA.tap_action) + LocalizedString.ADAPTER.encodedSizeWithTag(1, sectionCTA.title) + sectionCTA.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        HeroBalanceSection.SectionCTA sectionCTA = (HeroBalanceSection.SectionCTA) obj;
        sectionCTA.getClass();
        LocalizedString localizedString = sectionCTA.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        com.squareup.protos.cash.shop.rendering.api.TapAction tapAction = sectionCTA.tap_action;
        com.squareup.protos.cash.shop.rendering.api.TapAction tapAction2 = tapAction != null ? (com.squareup.protos.cash.shop.rendering.api.TapAction) com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER.redact(tapAction) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new HeroBalanceSection.SectionCTA(localizedString2, tapAction2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        HeroBalanceSection.SectionCTA sectionCTA = (HeroBalanceSection.SectionCTA) obj;
        sectionCTA.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, sectionCTA.title);
        com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER.encodeWithTag(protoWriter, 2, sectionCTA.tap_action);
        protoWriter.writeBytes(sectionCTA.unknownFields());
    }
}
