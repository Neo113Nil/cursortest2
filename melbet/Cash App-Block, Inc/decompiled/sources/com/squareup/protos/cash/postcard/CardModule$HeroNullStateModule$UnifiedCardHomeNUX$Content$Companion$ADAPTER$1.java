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
public final class CardModule$HeroNullStateModule$UnifiedCardHomeNUX$Content$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content((LocalizedString) obj, (LocalizedString) obj2, (CardModule.Button) obj3, (CardModule.Button) obj4, m, (ListUnordered) obj5, (Boolean) obj6, (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.GreenContent) obj7, (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.ParentAsKidContent) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(CardModule.Button.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(CardModule.Button.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    m.add(BookletTile.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    obj5 = TransactorKt.decodeMessageOrMerge(ListUnordered.ADAPTER, protoReader, obj5);
                    break;
                case 7:
                    obj6 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 8:
                    obj7 = TransactorKt.decodeMessageOrMerge(CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.GreenContent.ADAPTER, protoReader, obj7);
                    break;
                case 9:
                    obj8 = TransactorKt.decodeMessageOrMerge(CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.ParentAsKidContent.ADAPTER, protoReader, obj8);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content content = (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content) obj;
        reverseProtoWriter.getClass();
        content.getClass();
        reverseProtoWriter.writeBytes(content.unknownFields());
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.ParentAsKidContent.ADAPTER.encodeWithTag(reverseProtoWriter, 9, content.parent_as_kid_content);
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.GreenContent.ADAPTER.encodeWithTag(reverseProtoWriter, 8, content.green_content);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 7, content.show_disclosures);
        ListUnordered.ADAPTER.encodeWithTag(reverseProtoWriter, 6, content.benefits_list);
        BookletTile.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 5, content.booklet_tiles);
        ProtoAdapter protoAdapter = CardModule.Button.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, content.secondary_button);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, content.primary_button);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, content.body);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, content.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content content = (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content) obj;
        content.getClass();
        int size$okio = content.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, content.body) + protoAdapter.encodedSizeWithTag(1, content.title) + size$okio;
        ProtoAdapter protoAdapter2 = CardModule.Button.ADAPTER;
        return CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.ParentAsKidContent.ADAPTER.encodedSizeWithTag(9, content.parent_as_kid_content) + CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.GreenContent.ADAPTER.encodedSizeWithTag(8, content.green_content) + ProtoAdapter.BOOL.encodedSizeWithTag(7, content.show_disclosures) + ListUnordered.ADAPTER.encodedSizeWithTag(6, content.benefits_list) + BookletTile.ADAPTER.asRepeated().encodedSizeWithTag(5, content.booklet_tiles) + protoAdapter2.encodedSizeWithTag(4, content.secondary_button) + protoAdapter2.encodedSizeWithTag(3, content.primary_button) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content content = (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content) obj;
        content.getClass();
        LocalizedString localizedString = content.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = content.body;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        CardModule.Button button = content.primary_button;
        CardModule.Button button2 = button != null ? (CardModule.Button) CardModule.Button.ADAPTER.redact(button) : null;
        CardModule.Button button3 = content.secondary_button;
        CardModule.Button button4 = button3 != null ? (CardModule.Button) CardModule.Button.ADAPTER.redact(button3) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(content.booklet_tiles, BookletTile.ADAPTER);
        ListUnordered listUnordered = content.benefits_list;
        ListUnordered listUnordered2 = listUnordered != null ? (ListUnordered) ListUnordered.ADAPTER.redact(listUnordered) : null;
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.GreenContent greenContent = content.green_content;
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.GreenContent greenContent2 = greenContent != null ? (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.GreenContent) CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.GreenContent.ADAPTER.redact(greenContent) : null;
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.ParentAsKidContent parentAsKidContent = content.parent_as_kid_content;
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.ParentAsKidContent parentAsKidContent2 = parentAsKidContent != null ? (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.ParentAsKidContent) CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.ParentAsKidContent.ADAPTER.redact(parentAsKidContent) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = content.show_disclosures;
        byteString.getClass();
        return new CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content(localizedString2, localizedString4, button2, button4, m1169redactElements, listUnordered2, bool, greenContent2, parentAsKidContent2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content content = (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content) obj;
        content.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, content.title);
        protoAdapter.encodeWithTag(protoWriter, 2, content.body);
        ProtoAdapter protoAdapter2 = CardModule.Button.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, content.primary_button);
        protoAdapter2.encodeWithTag(protoWriter, 4, content.secondary_button);
        BookletTile.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, content.booklet_tiles);
        ListUnordered.ADAPTER.encodeWithTag(protoWriter, 6, content.benefits_list);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, content.show_disclosures);
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.GreenContent.ADAPTER.encodeWithTag(protoWriter, 8, content.green_content);
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.ParentAsKidContent.ADAPTER.encodeWithTag(protoWriter, 9, content.parent_as_kid_content);
        protoWriter.writeBytes(content.unknownFields());
    }
}
