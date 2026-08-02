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
public final class CardModule$HeroNullStateModule$UnifiedCardHomeNUX$Content$ParentAsKidContent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.ParentAsKidContent((LocalizedString) obj, (ListUnordered) obj2, m, (LocalizedString) obj3, (CardModule.Button) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(ListUnordered.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                m.add(BookletTile.ADAPTER.decode(protoReader));
            } else if (nextTag == 4) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(CardModule.Button.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.ParentAsKidContent parentAsKidContent = (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.ParentAsKidContent) obj;
        reverseProtoWriter.getClass();
        parentAsKidContent.getClass();
        reverseProtoWriter.writeBytes(parentAsKidContent.unknownFields());
        CardModule.Button.ADAPTER.encodeWithTag(reverseProtoWriter, 5, parentAsKidContent.primary_button);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, parentAsKidContent.body);
        BookletTile.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, parentAsKidContent.booklet_tiles);
        ListUnordered.ADAPTER.encodeWithTag(reverseProtoWriter, 2, parentAsKidContent.benefits_list);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, parentAsKidContent.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.ParentAsKidContent parentAsKidContent = (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.ParentAsKidContent) obj;
        parentAsKidContent.getClass();
        int size$okio = parentAsKidContent.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return CardModule.Button.ADAPTER.encodedSizeWithTag(5, parentAsKidContent.primary_button) + protoAdapter.encodedSizeWithTag(4, parentAsKidContent.body) + BookletTile.ADAPTER.asRepeated().encodedSizeWithTag(3, parentAsKidContent.booklet_tiles) + ListUnordered.ADAPTER.encodedSizeWithTag(2, parentAsKidContent.benefits_list) + protoAdapter.encodedSizeWithTag(1, parentAsKidContent.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.ParentAsKidContent parentAsKidContent = (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.ParentAsKidContent) obj;
        parentAsKidContent.getClass();
        LocalizedString localizedString = parentAsKidContent.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ListUnordered listUnordered = parentAsKidContent.benefits_list;
        ListUnordered listUnordered2 = listUnordered != null ? (ListUnordered) ListUnordered.ADAPTER.redact(listUnordered) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(parentAsKidContent.booklet_tiles, BookletTile.ADAPTER);
        LocalizedString localizedString3 = parentAsKidContent.body;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        CardModule.Button button = parentAsKidContent.primary_button;
        CardModule.Button button2 = button != null ? (CardModule.Button) CardModule.Button.ADAPTER.redact(button) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.ParentAsKidContent(localizedString2, listUnordered2, m1169redactElements, localizedString4, button2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.ParentAsKidContent parentAsKidContent = (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.ParentAsKidContent) obj;
        parentAsKidContent.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, parentAsKidContent.title);
        ListUnordered.ADAPTER.encodeWithTag(protoWriter, 2, parentAsKidContent.benefits_list);
        BookletTile.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, parentAsKidContent.booklet_tiles);
        protoAdapter.encodeWithTag(protoWriter, 4, parentAsKidContent.body);
        CardModule.Button.ADAPTER.encodeWithTag(protoWriter, 5, parentAsKidContent.primary_button);
        protoWriter.writeBytes(parentAsKidContent.unknownFields());
    }
}
