package com.squareup.protos.cash.discover.api.app.v1.model;

import androidx.room.TransactorKt;
import coil3.Uri_androidKt;
import com.squareup.protos.cash.discover.api.app.v1.model.Section;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Section$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        ?? decode;
        Object obj4;
        Uri_androidKt section$Content$AvatarSection;
        Uri_androidKt section$Content$EmbeddedImageSection;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        String str = null;
        Object obj5 = null;
        Object obj6 = null;
        Uri_androidKt uri_androidKt = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Section.Layout layout = null;
        String str2 = null;
        Object obj12 = null;
        Boolean bool = null;
        Integer num = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Section(str, uri_androidKt, num, (Text) obj6, (Text) obj7, (Text) obj8, (Button) obj9, (Text) obj10, (TapAction) obj11, layout, str2, (Color) obj12, (Button) obj5, bool, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj4 = obj5;
                    section$Content$AvatarSection = new Section$Content$AvatarSection((AvatarSection) AvatarSection.ADAPTER.decode(protoReader));
                    uri_androidKt = section$Content$AvatarSection;
                    obj5 = obj4;
                    decode = str;
                    break;
                case 3:
                    obj4 = obj5;
                    section$Content$AvatarSection = new Section$Content$RowSection((RowSection) RowSection.ADAPTER.decode(protoReader));
                    uri_androidKt = section$Content$AvatarSection;
                    obj5 = obj4;
                    decode = str;
                    break;
                case 4:
                    obj4 = obj5;
                    section$Content$AvatarSection = new Section$Content$PlaceholderSection((PlaceholderSection) PlaceholderSection.ADAPTER.decode(protoReader));
                    uri_androidKt = section$Content$AvatarSection;
                    obj5 = obj4;
                    decode = str;
                    break;
                case 5:
                    num = ProtoAdapter.INT32.decode(protoReader);
                    decode = str;
                    break;
                case 6:
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj5;
                    obj2 = obj10;
                    obj3 = obj11;
                    decode = str;
                    obj5 = obj;
                    obj11 = obj3;
                    obj10 = obj2;
                    break;
                case 7:
                    obj4 = obj5;
                    section$Content$AvatarSection = new Section$Content$CardSection((CardSection) CardSection.ADAPTER.decode(protoReader));
                    uri_androidKt = section$Content$AvatarSection;
                    obj5 = obj4;
                    decode = str;
                    break;
                case 8:
                    obj6 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj6);
                    decode = str;
                    break;
                case 9:
                    obj7 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj7);
                    decode = str;
                    break;
                case 10:
                    obj9 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj9);
                    decode = str;
                    break;
                case 11:
                    try {
                        layout = Section.Layout.ADAPTER.decode(protoReader);
                        decode = str;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj5;
                        obj2 = obj10;
                        obj3 = obj11;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 12:
                    section$Content$EmbeddedImageSection = new Section$Content$EmbeddedImageSection((EmbeddedImageSection) EmbeddedImageSection.ADAPTER.decode(protoReader));
                    uri_androidKt = section$Content$EmbeddedImageSection;
                    decode = str;
                    break;
                case 13:
                    obj10 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj10);
                    decode = str;
                    break;
                case 14:
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 15:
                    section$Content$EmbeddedImageSection = new Section$Content$AvatarOverlayCardSection((AvatarOverlayCardSection) AvatarOverlayCardSection.ADAPTER.decode(protoReader));
                    uri_androidKt = section$Content$EmbeddedImageSection;
                    decode = str;
                    break;
                case 16:
                    section$Content$EmbeddedImageSection = new Section$Content$TileSection((TileSection) TileSection.ADAPTER.decode(protoReader));
                    uri_androidKt = section$Content$EmbeddedImageSection;
                    decode = str;
                    break;
                case 17:
                    obj11 = TransactorKt.decodeMessageOrMerge(TapAction.ADAPTER, protoReader, obj11);
                    decode = str;
                    break;
                case 18:
                    section$Content$EmbeddedImageSection = new Section$Content$GraphSection((GraphSection) GraphSection.ADAPTER.decode(protoReader));
                    uri_androidKt = section$Content$EmbeddedImageSection;
                    decode = str;
                    break;
                case 19:
                    section$Content$EmbeddedImageSection = new Section$Content$TextCardSection((TextCardSection) TextCardSection.ADAPTER.decode(protoReader));
                    uri_androidKt = section$Content$EmbeddedImageSection;
                    decode = str;
                    break;
                case 20:
                    obj12 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj12);
                    decode = str;
                    break;
                case 21:
                    section$Content$EmbeddedImageSection = new Section$Content$CaptionSection((CaptionSection) CaptionSection.ADAPTER.decode(protoReader));
                    uri_androidKt = section$Content$EmbeddedImageSection;
                    decode = str;
                    break;
                case 22:
                    obj8 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj8);
                    decode = str;
                    break;
                case 23:
                    obj5 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj5);
                    decode = str;
                    break;
                case 24:
                    bool = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str;
                    break;
            }
            str = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Section section = (Section) obj;
        reverseProtoWriter.getClass();
        section.getClass();
        reverseProtoWriter.writeBytes(section.unknownFields());
        Uri_androidKt uri_androidKt = section.content;
        if (uri_androidKt instanceof Section$Content$AvatarSection) {
            AvatarSection.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((Section$Content$AvatarSection) uri_androidKt).value);
        } else if (uri_androidKt instanceof Section$Content$RowSection) {
            RowSection.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((Section$Content$RowSection) uri_androidKt).value);
        } else if (uri_androidKt instanceof Section$Content$PlaceholderSection) {
            PlaceholderSection.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((Section$Content$PlaceholderSection) uri_androidKt).value);
        } else if (uri_androidKt instanceof Section$Content$CardSection) {
            CardSection.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((Section$Content$CardSection) uri_androidKt).value);
        } else if (uri_androidKt instanceof Section$Content$EmbeddedImageSection) {
            EmbeddedImageSection.ADAPTER.encodeWithTag(reverseProtoWriter, 12, ((Section$Content$EmbeddedImageSection) uri_androidKt).value);
        } else if (uri_androidKt instanceof Section$Content$AvatarOverlayCardSection) {
            AvatarOverlayCardSection.ADAPTER.encodeWithTag(reverseProtoWriter, 15, ((Section$Content$AvatarOverlayCardSection) uri_androidKt).value);
        } else if (uri_androidKt instanceof Section$Content$TileSection) {
            TileSection.ADAPTER.encodeWithTag(reverseProtoWriter, 16, ((Section$Content$TileSection) uri_androidKt).value);
        } else if (uri_androidKt instanceof Section$Content$GraphSection) {
            GraphSection.ADAPTER.encodeWithTag(reverseProtoWriter, 18, ((Section$Content$GraphSection) uri_androidKt).value);
        } else if (uri_androidKt instanceof Section$Content$TextCardSection) {
            TextCardSection.ADAPTER.encodeWithTag(reverseProtoWriter, 19, ((Section$Content$TextCardSection) uri_androidKt).value);
        } else if (uri_androidKt instanceof Section$Content$CaptionSection) {
            CaptionSection.ADAPTER.encodeWithTag(reverseProtoWriter, 21, ((Section$Content$CaptionSection) uri_androidKt).value);
        } else if (uri_androidKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 24, section.render_section_divider);
        ProtoAdapter protoAdapter = Button.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 23, section.section_footer_button);
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 20, section.background_color);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 14, section.section_id);
        Section.Layout.ADAPTER.encodeWithTag(reverseProtoWriter, 11, section.layout);
        TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 17, section.tap_action);
        ProtoAdapter protoAdapter3 = Text.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 13, section.section_header);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, section.section_action_button);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 22, section.section_eyebrow);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 9, section.section_subtitle);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 8, section.section_title);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 5, section.default_max_items);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, section.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        Section section = (Section) obj;
        section.getClass();
        int size$okio = section.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(1, section.title) + size$okio;
        Uri_androidKt uri_androidKt = section.content;
        if (uri_androidKt instanceof Section$Content$AvatarSection) {
            encodedSizeWithTag = AvatarSection.ADAPTER.encodedSizeWithTag(2, ((Section$Content$AvatarSection) uri_androidKt).value);
        } else if (uri_androidKt instanceof Section$Content$RowSection) {
            encodedSizeWithTag = RowSection.ADAPTER.encodedSizeWithTag(3, ((Section$Content$RowSection) uri_androidKt).value);
        } else if (uri_androidKt instanceof Section$Content$PlaceholderSection) {
            encodedSizeWithTag = PlaceholderSection.ADAPTER.encodedSizeWithTag(4, ((Section$Content$PlaceholderSection) uri_androidKt).value);
        } else if (uri_androidKt instanceof Section$Content$CardSection) {
            encodedSizeWithTag = CardSection.ADAPTER.encodedSizeWithTag(7, ((Section$Content$CardSection) uri_androidKt).value);
        } else if (uri_androidKt instanceof Section$Content$EmbeddedImageSection) {
            encodedSizeWithTag = EmbeddedImageSection.ADAPTER.encodedSizeWithTag(12, ((Section$Content$EmbeddedImageSection) uri_androidKt).value);
        } else if (uri_androidKt instanceof Section$Content$AvatarOverlayCardSection) {
            encodedSizeWithTag = AvatarOverlayCardSection.ADAPTER.encodedSizeWithTag(15, ((Section$Content$AvatarOverlayCardSection) uri_androidKt).value);
        } else if (uri_androidKt instanceof Section$Content$TileSection) {
            encodedSizeWithTag = TileSection.ADAPTER.encodedSizeWithTag(16, ((Section$Content$TileSection) uri_androidKt).value);
        } else if (uri_androidKt instanceof Section$Content$GraphSection) {
            encodedSizeWithTag = GraphSection.ADAPTER.encodedSizeWithTag(18, ((Section$Content$GraphSection) uri_androidKt).value);
        } else if (uri_androidKt instanceof Section$Content$TextCardSection) {
            encodedSizeWithTag = TextCardSection.ADAPTER.encodedSizeWithTag(19, ((Section$Content$TextCardSection) uri_androidKt).value);
        } else {
            if (!(uri_androidKt instanceof Section$Content$CaptionSection)) {
                if (uri_androidKt != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                int encodedSizeWithTag3 = ProtoAdapter.INT32.encodedSizeWithTag(5, section.default_max_items) + encodedSizeWithTag2;
                ProtoAdapter protoAdapter2 = Text.ADAPTER;
                int encodedSizeWithTag4 = protoAdapter2.encodedSizeWithTag(22, section.section_eyebrow) + protoAdapter2.encodedSizeWithTag(9, section.section_subtitle) + protoAdapter2.encodedSizeWithTag(8, section.section_title) + encodedSizeWithTag3;
                ProtoAdapter protoAdapter3 = Button.ADAPTER;
                return ProtoAdapter.BOOL.encodedSizeWithTag(24, section.render_section_divider) + protoAdapter3.encodedSizeWithTag(23, section.section_footer_button) + Color.ADAPTER.encodedSizeWithTag(20, section.background_color) + protoAdapter.encodedSizeWithTag(14, section.section_id) + Section.Layout.ADAPTER.encodedSizeWithTag(11, section.layout) + TapAction.ADAPTER.encodedSizeWithTag(17, section.tap_action) + protoAdapter2.encodedSizeWithTag(13, section.section_header) + protoAdapter3.encodedSizeWithTag(10, section.section_action_button) + encodedSizeWithTag4;
            }
            encodedSizeWithTag = CaptionSection.ADAPTER.encodedSizeWithTag(21, ((Section$Content$CaptionSection) uri_androidKt).value);
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        int encodedSizeWithTag32 = ProtoAdapter.INT32.encodedSizeWithTag(5, section.default_max_items) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter22 = Text.ADAPTER;
        int encodedSizeWithTag42 = protoAdapter22.encodedSizeWithTag(22, section.section_eyebrow) + protoAdapter22.encodedSizeWithTag(9, section.section_subtitle) + protoAdapter22.encodedSizeWithTag(8, section.section_title) + encodedSizeWithTag32;
        ProtoAdapter protoAdapter32 = Button.ADAPTER;
        return ProtoAdapter.BOOL.encodedSizeWithTag(24, section.render_section_divider) + protoAdapter32.encodedSizeWithTag(23, section.section_footer_button) + Color.ADAPTER.encodedSizeWithTag(20, section.background_color) + protoAdapter.encodedSizeWithTag(14, section.section_id) + Section.Layout.ADAPTER.encodedSizeWithTag(11, section.layout) + TapAction.ADAPTER.encodedSizeWithTag(17, section.tap_action) + protoAdapter22.encodedSizeWithTag(13, section.section_header) + protoAdapter32.encodedSizeWithTag(10, section.section_action_button) + encodedSizeWithTag42;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Section section = (Section) obj;
        section.getClass();
        Text text = section.section_title;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        Text text3 = section.section_subtitle;
        Text text4 = text3 != null ? (Text) Text.ADAPTER.redact(text3) : null;
        Text text5 = section.section_eyebrow;
        Text text6 = text5 != null ? (Text) Text.ADAPTER.redact(text5) : null;
        Button button = section.section_action_button;
        Button button2 = button != null ? (Button) Button.ADAPTER.redact(button) : null;
        Text text7 = section.section_header;
        Text text8 = text7 != null ? (Text) Text.ADAPTER.redact(text7) : null;
        TapAction tapAction = section.tap_action;
        TapAction tapAction2 = tapAction != null ? (TapAction) TapAction.ADAPTER.redact(tapAction) : null;
        Color color = section.background_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        Button button3 = section.section_footer_button;
        Button button4 = button3 != null ? (Button) Button.ADAPTER.redact(button3) : null;
        ByteString byteString = ByteString.EMPTY;
        Uri_androidKt uri_androidKt = section.content;
        Integer num = section.default_max_items;
        Section.Layout layout = section.layout;
        String str = section.section_id;
        Boolean bool = section.render_section_divider;
        byteString.getClass();
        return new Section(null, uri_androidKt, num, text2, text4, text6, button2, text8, tapAction2, layout, str, color2, button4, bool, byteString);
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
        protoAdapter2.encodeWithTag(protoWriter, 22, section.section_eyebrow);
        ProtoAdapter protoAdapter3 = Button.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 10, section.section_action_button);
        protoAdapter2.encodeWithTag(protoWriter, 13, section.section_header);
        TapAction.ADAPTER.encodeWithTag(protoWriter, 17, section.tap_action);
        Section.Layout.ADAPTER.encodeWithTag(protoWriter, 11, section.layout);
        protoAdapter.encodeWithTag(protoWriter, 14, section.section_id);
        Color.ADAPTER.encodeWithTag(protoWriter, 20, section.background_color);
        protoAdapter3.encodeWithTag(protoWriter, 23, section.section_footer_button);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 24, section.render_section_divider);
        Uri_androidKt uri_androidKt = section.content;
        if (uri_androidKt instanceof Section$Content$AvatarSection) {
            AvatarSection.ADAPTER.encodeWithTag(protoWriter, 2, ((Section$Content$AvatarSection) uri_androidKt).value);
        } else if (uri_androidKt instanceof Section$Content$RowSection) {
            RowSection.ADAPTER.encodeWithTag(protoWriter, 3, ((Section$Content$RowSection) uri_androidKt).value);
        } else if (uri_androidKt instanceof Section$Content$PlaceholderSection) {
            PlaceholderSection.ADAPTER.encodeWithTag(protoWriter, 4, ((Section$Content$PlaceholderSection) uri_androidKt).value);
        } else if (uri_androidKt instanceof Section$Content$CardSection) {
            CardSection.ADAPTER.encodeWithTag(protoWriter, 7, ((Section$Content$CardSection) uri_androidKt).value);
        } else if (uri_androidKt instanceof Section$Content$EmbeddedImageSection) {
            EmbeddedImageSection.ADAPTER.encodeWithTag(protoWriter, 12, ((Section$Content$EmbeddedImageSection) uri_androidKt).value);
        } else if (uri_androidKt instanceof Section$Content$AvatarOverlayCardSection) {
            AvatarOverlayCardSection.ADAPTER.encodeWithTag(protoWriter, 15, ((Section$Content$AvatarOverlayCardSection) uri_androidKt).value);
        } else if (uri_androidKt instanceof Section$Content$TileSection) {
            TileSection.ADAPTER.encodeWithTag(protoWriter, 16, ((Section$Content$TileSection) uri_androidKt).value);
        } else if (uri_androidKt instanceof Section$Content$GraphSection) {
            GraphSection.ADAPTER.encodeWithTag(protoWriter, 18, ((Section$Content$GraphSection) uri_androidKt).value);
        } else if (uri_androidKt instanceof Section$Content$TextCardSection) {
            TextCardSection.ADAPTER.encodeWithTag(protoWriter, 19, ((Section$Content$TextCardSection) uri_androidKt).value);
        } else if (uri_androidKt instanceof Section$Content$CaptionSection) {
            CaptionSection.ADAPTER.encodeWithTag(protoWriter, 21, ((Section$Content$CaptionSection) uri_androidKt).value);
        } else if (uri_androidKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(section.unknownFields());
    }
}
