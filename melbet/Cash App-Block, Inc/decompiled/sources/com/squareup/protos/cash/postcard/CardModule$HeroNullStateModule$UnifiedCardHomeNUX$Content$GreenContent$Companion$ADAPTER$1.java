package com.squareup.protos.cash.postcard;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.money.elements.BookletTile;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;
import squareup.cash.ui.arcade.elements.ListUnordered;

/* loaded from: classes7.dex */
public final class CardModule$HeroNullStateModule$UnifiedCardHomeNUX$Content$GreenContent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.GreenContent((LocalizedString) obj, (ListUnordered) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(ListUnordered.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(BookletTile.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.GreenContent greenContent = (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.GreenContent) obj;
        reverseProtoWriter.getClass();
        greenContent.getClass();
        reverseProtoWriter.writeBytes(greenContent.unknownFields());
        BookletTile.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, greenContent.booklet_tiles);
        ListUnordered.ADAPTER.encodeWithTag(reverseProtoWriter, 2, greenContent.benefits_list);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, greenContent.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.GreenContent greenContent = (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.GreenContent) obj;
        greenContent.getClass();
        return BookletTile.ADAPTER.asRepeated().encodedSizeWithTag(3, greenContent.booklet_tiles) + ListUnordered.ADAPTER.encodedSizeWithTag(2, greenContent.benefits_list) + LocalizedString.ADAPTER.encodedSizeWithTag(1, greenContent.title) + greenContent.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.GreenContent greenContent = (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.GreenContent) obj;
        greenContent.getClass();
        LocalizedString localizedString = greenContent.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ListUnordered listUnordered = greenContent.benefits_list;
        ListUnordered listUnordered2 = listUnordered != null ? (ListUnordered) ListUnordered.ADAPTER.redact(listUnordered) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(greenContent.booklet_tiles, BookletTile.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.GreenContent(localizedString2, listUnordered2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.GreenContent greenContent = (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.GreenContent) obj;
        greenContent.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, greenContent.title);
        ListUnordered.ADAPTER.encodeWithTag(protoWriter, 2, greenContent.benefits_list);
        BookletTile.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, greenContent.booklet_tiles);
        protoWriter.writeBytes(greenContent.unknownFields());
    }
}
