package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashsuggest.api.Section;
import com.squareup.protos.cash.p2p.profile_directory.ui.Button;
import com.squareup.protos.cash.p2p.profile_directory.ui.Text;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Section$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        Section.Content avatarSection;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Section.Content content = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Section((String) obj4, content, (Integer) obj5, (Text) obj6, (Text) obj7, (Button) obj8, (Text) obj9, (TapAction) obj10, (Section.Layout) obj11, (String) obj12, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj3 = obj4;
                    avatarSection = new Section.Content.AvatarSection((AvatarSection) AvatarSection.ADAPTER.decode(protoReader));
                    obj4 = obj3;
                    content = avatarSection;
                    break;
                case 3:
                    obj3 = obj4;
                    avatarSection = new Section.Content.RowSection((RowSection) RowSection.ADAPTER.decode(protoReader));
                    obj4 = obj3;
                    content = avatarSection;
                    break;
                case 4:
                    obj3 = obj4;
                    avatarSection = new Section.Content.PlaceholderSection((PlaceholderSection) PlaceholderSection.ADAPTER.decode(protoReader));
                    obj4 = obj3;
                    content = avatarSection;
                    break;
                case 5:
                    obj5 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 6:
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj4;
                    obj2 = obj5;
                    obj4 = obj;
                    obj5 = obj2;
                    break;
                case 7:
                    obj3 = obj4;
                    avatarSection = new Section.Content.CardSection((CardSection) CardSection.ADAPTER.decode(protoReader));
                    obj4 = obj3;
                    content = avatarSection;
                    break;
                case 8:
                    obj6 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj6);
                    break;
                case 9:
                    obj7 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj7);
                    break;
                case 10:
                    obj8 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj8);
                    break;
                case 11:
                    try {
                        obj11 = Section.Layout.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj4;
                        obj2 = obj5;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 12:
                    avatarSection = new Section.Content.EmbeddedImageSection((EmbeddedImageSection) EmbeddedImageSection.ADAPTER.decode(protoReader));
                    content = avatarSection;
                    break;
                case 13:
                    obj9 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj9);
                    break;
                case 14:
                    obj12 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 15:
                    avatarSection = new Section.Content.AvatarOverlayCardSection((AvatarOverlayCardSection) AvatarOverlayCardSection.ADAPTER.decode(protoReader));
                    content = avatarSection;
                    break;
                case 16:
                    avatarSection = new Section.Content.TileSection((TileSection) TileSection.ADAPTER.decode(protoReader));
                    content = avatarSection;
                    break;
                case 17:
                    obj10 = TransactorKt.decodeMessageOrMerge(TapAction.ADAPTER, protoReader, obj10);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Section section = (Section) obj;
        reverseProtoWriter.getClass();
        section.getClass();
        reverseProtoWriter.writeBytes(section.unknownFields());
        Section.Content content = section.content;
        if (content instanceof Section.Content.AvatarSection) {
            AvatarSection.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((Section.Content.AvatarSection) content).value);
        } else if (content instanceof Section.Content.RowSection) {
            RowSection.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((Section.Content.RowSection) content).value);
        } else if (content instanceof Section.Content.PlaceholderSection) {
            PlaceholderSection.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((Section.Content.PlaceholderSection) content).value);
        } else if (content instanceof Section.Content.CardSection) {
            CardSection.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((Section.Content.CardSection) content).value);
        } else if (content instanceof Section.Content.EmbeddedImageSection) {
            EmbeddedImageSection.ADAPTER.encodeWithTag(reverseProtoWriter, 12, ((Section.Content.EmbeddedImageSection) content).value);
        } else if (content instanceof Section.Content.AvatarOverlayCardSection) {
            AvatarOverlayCardSection.ADAPTER.encodeWithTag(reverseProtoWriter, 15, ((Section.Content.AvatarOverlayCardSection) content).value);
        } else if (content instanceof Section.Content.TileSection) {
            TileSection.ADAPTER.encodeWithTag(reverseProtoWriter, 16, ((Section.Content.TileSection) content).value);
        } else if (content != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 14, section.section_id);
        Section.Layout.ADAPTER.encodeWithTag(reverseProtoWriter, 11, section.layout);
        TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 17, section.tap_action);
        ProtoAdapter protoAdapter2 = Text.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 13, section.section_header);
        Button.ADAPTER.encodeWithTag(reverseProtoWriter, 10, section.section_action_button);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, section.section_subtitle);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, section.section_title);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 5, section.default_max_items);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, section.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        Section section = (Section) obj;
        section.getClass();
        int size$okio = section.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(1, section.title) + size$okio;
        Section.Content content = section.content;
        if (content instanceof Section.Content.AvatarSection) {
            encodedSizeWithTag = AvatarSection.ADAPTER.encodedSizeWithTag(2, ((Section.Content.AvatarSection) content).value);
        } else if (content instanceof Section.Content.RowSection) {
            encodedSizeWithTag = RowSection.ADAPTER.encodedSizeWithTag(3, ((Section.Content.RowSection) content).value);
        } else if (content instanceof Section.Content.PlaceholderSection) {
            encodedSizeWithTag = PlaceholderSection.ADAPTER.encodedSizeWithTag(4, ((Section.Content.PlaceholderSection) content).value);
        } else if (content instanceof Section.Content.CardSection) {
            encodedSizeWithTag = CardSection.ADAPTER.encodedSizeWithTag(7, ((Section.Content.CardSection) content).value);
        } else if (content instanceof Section.Content.EmbeddedImageSection) {
            encodedSizeWithTag = EmbeddedImageSection.ADAPTER.encodedSizeWithTag(12, ((Section.Content.EmbeddedImageSection) content).value);
        } else if (content instanceof Section.Content.AvatarOverlayCardSection) {
            encodedSizeWithTag = AvatarOverlayCardSection.ADAPTER.encodedSizeWithTag(15, ((Section.Content.AvatarOverlayCardSection) content).value);
        } else {
            if (!(content instanceof Section.Content.TileSection)) {
                if (content != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                int encodedSizeWithTag3 = ProtoAdapter.INT32.encodedSizeWithTag(5, section.default_max_items) + encodedSizeWithTag2;
                ProtoAdapter protoAdapter2 = Text.ADAPTER;
                return protoAdapter.encodedSizeWithTag(14, section.section_id) + Section.Layout.ADAPTER.encodedSizeWithTag(11, section.layout) + TapAction.ADAPTER.encodedSizeWithTag(17, section.tap_action) + protoAdapter2.encodedSizeWithTag(13, section.section_header) + Button.ADAPTER.encodedSizeWithTag(10, section.section_action_button) + protoAdapter2.encodedSizeWithTag(9, section.section_subtitle) + protoAdapter2.encodedSizeWithTag(8, section.section_title) + encodedSizeWithTag3;
            }
            encodedSizeWithTag = TileSection.ADAPTER.encodedSizeWithTag(16, ((Section.Content.TileSection) content).value);
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        int encodedSizeWithTag32 = ProtoAdapter.INT32.encodedSizeWithTag(5, section.default_max_items) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter22 = Text.ADAPTER;
        return protoAdapter.encodedSizeWithTag(14, section.section_id) + Section.Layout.ADAPTER.encodedSizeWithTag(11, section.layout) + TapAction.ADAPTER.encodedSizeWithTag(17, section.tap_action) + protoAdapter22.encodedSizeWithTag(13, section.section_header) + Button.ADAPTER.encodedSizeWithTag(10, section.section_action_button) + protoAdapter22.encodedSizeWithTag(9, section.section_subtitle) + protoAdapter22.encodedSizeWithTag(8, section.section_title) + encodedSizeWithTag32;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Section section = (Section) obj;
        section.getClass();
        Text text = section.section_title;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        Text text3 = section.section_subtitle;
        Text text4 = text3 != null ? (Text) Text.ADAPTER.redact(text3) : null;
        Button button = section.section_action_button;
        Button button2 = button != null ? (Button) Button.ADAPTER.redact(button) : null;
        Text text5 = section.section_header;
        Text text6 = text5 != null ? (Text) Text.ADAPTER.redact(text5) : null;
        TapAction tapAction = section.tap_action;
        TapAction tapAction2 = tapAction != null ? (TapAction) TapAction.ADAPTER.redact(tapAction) : null;
        ByteString byteString = ByteString.EMPTY;
        Section.Content content = section.content;
        Integer num = section.default_max_items;
        Section.Layout layout = section.layout;
        String str = section.section_id;
        byteString.getClass();
        return new Section(null, content, num, text2, text4, button2, text6, tapAction2, layout, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Section section = (Section) obj;
        section.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, section.title);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, section.default_max_items);
        ProtoAdapter protoAdapter2 = Text.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 8, section.section_title);
        protoAdapter2.encodeWithTag(protoWriter, 9, section.section_subtitle);
        Button.ADAPTER.encodeWithTag(protoWriter, 10, section.section_action_button);
        protoAdapter2.encodeWithTag(protoWriter, 13, section.section_header);
        TapAction.ADAPTER.encodeWithTag(protoWriter, 17, section.tap_action);
        Section.Layout.ADAPTER.encodeWithTag(protoWriter, 11, section.layout);
        protoAdapter.encodeWithTag(protoWriter, 14, section.section_id);
        Section.Content content = section.content;
        if (content instanceof Section.Content.AvatarSection) {
            AvatarSection.ADAPTER.encodeWithTag(protoWriter, 2, ((Section.Content.AvatarSection) content).value);
        } else if (content instanceof Section.Content.RowSection) {
            RowSection.ADAPTER.encodeWithTag(protoWriter, 3, ((Section.Content.RowSection) content).value);
        } else if (content instanceof Section.Content.PlaceholderSection) {
            PlaceholderSection.ADAPTER.encodeWithTag(protoWriter, 4, ((Section.Content.PlaceholderSection) content).value);
        } else if (content instanceof Section.Content.CardSection) {
            CardSection.ADAPTER.encodeWithTag(protoWriter, 7, ((Section.Content.CardSection) content).value);
        } else if (content instanceof Section.Content.EmbeddedImageSection) {
            EmbeddedImageSection.ADAPTER.encodeWithTag(protoWriter, 12, ((Section.Content.EmbeddedImageSection) content).value);
        } else if (content instanceof Section.Content.AvatarOverlayCardSection) {
            AvatarOverlayCardSection.ADAPTER.encodeWithTag(protoWriter, 15, ((Section.Content.AvatarOverlayCardSection) content).value);
        } else if (content instanceof Section.Content.TileSection) {
            TileSection.ADAPTER.encodeWithTag(protoWriter, 16, ((Section.Content.TileSection) content).value);
        } else if (content != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(section.unknownFields());
    }
}
