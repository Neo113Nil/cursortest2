package com.squareup.protos.cash.customersearch.api;

import androidx.room.TransactorKt;
import app.cash.zipline.loader.LoaderAndroidKt;
import com.squareup.protos.cash.customersearch.api.SearchCommonSection;
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
public final class SearchCommonSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        LoaderAndroidKt searchCommonSection$Content$RowSection;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        LoaderAndroidKt loaderAndroidKt = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SearchCommonSection(loaderAndroidKt, (Integer) obj, (Text) obj2, (Text) obj3, (Button) obj4, (SearchCommonSection.Layout) obj5, (Button) obj6, (TapAction) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    searchCommonSection$Content$RowSection = new SearchCommonSection$Content$RowSection((SearchCommonRowSection) SearchCommonRowSection.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    searchCommonSection$Content$RowSection = new SearchCommonSection$Content$TextRowSection((SearchCommonTextRowSection) SearchCommonTextRowSection.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    searchCommonSection$Content$RowSection = new SearchCommonSection$Content$PlaceholderSection((SearchCommonPlaceholderSection) SearchCommonPlaceholderSection.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    obj = ProtoAdapter.INT32.decode(protoReader);
                    continue;
                case 5:
                    obj2 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj2);
                    continue;
                case 6:
                    obj3 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj3);
                    continue;
                case 7:
                    obj4 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj4);
                    continue;
                case 8:
                    searchCommonSection$Content$RowSection = new SearchCommonSection$Content$AvatarSection((SearchCommonAvatarSection) SearchCommonAvatarSection.ADAPTER.decode(protoReader));
                    break;
                case 9:
                    searchCommonSection$Content$RowSection = new SearchCommonSection$Content$CardSection((SearchCommonCardSection) SearchCommonCardSection.ADAPTER.decode(protoReader));
                    break;
                case 10:
                    try {
                        obj5 = SearchCommonSection.Layout.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 11:
                    obj6 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj6);
                    continue;
                case 12:
                    searchCommonSection$Content$RowSection = new SearchCommonSection$Content$MessageSection((SearchCommonMessageSection) SearchCommonMessageSection.ADAPTER.decode(protoReader));
                    break;
                case 13:
                    obj7 = TransactorKt.decodeMessageOrMerge(TapAction.ADAPTER, protoReader, obj7);
                    continue;
                default:
                    protoReader.readUnknownField(nextTag);
                    continue;
            }
            loaderAndroidKt = searchCommonSection$Content$RowSection;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SearchCommonSection searchCommonSection = (SearchCommonSection) obj;
        reverseProtoWriter.getClass();
        searchCommonSection.getClass();
        reverseProtoWriter.writeBytes(searchCommonSection.unknownFields());
        LoaderAndroidKt loaderAndroidKt = searchCommonSection.content;
        if (loaderAndroidKt instanceof SearchCommonSection$Content$RowSection) {
            SearchCommonRowSection.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((SearchCommonSection$Content$RowSection) loaderAndroidKt).value);
        } else if (loaderAndroidKt instanceof SearchCommonSection$Content$TextRowSection) {
            SearchCommonTextRowSection.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((SearchCommonSection$Content$TextRowSection) loaderAndroidKt).value);
        } else if (loaderAndroidKt instanceof SearchCommonSection$Content$PlaceholderSection) {
            SearchCommonPlaceholderSection.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((SearchCommonSection$Content$PlaceholderSection) loaderAndroidKt).value);
        } else if (loaderAndroidKt instanceof SearchCommonSection$Content$AvatarSection) {
            SearchCommonAvatarSection.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((SearchCommonSection$Content$AvatarSection) loaderAndroidKt).value);
        } else if (loaderAndroidKt instanceof SearchCommonSection$Content$CardSection) {
            SearchCommonCardSection.ADAPTER.encodeWithTag(reverseProtoWriter, 9, ((SearchCommonSection$Content$CardSection) loaderAndroidKt).value);
        } else if (loaderAndroidKt instanceof SearchCommonSection$Content$MessageSection) {
            SearchCommonMessageSection.ADAPTER.encodeWithTag(reverseProtoWriter, 12, ((SearchCommonSection$Content$MessageSection) loaderAndroidKt).value);
        } else if (loaderAndroidKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 13, searchCommonSection.tap_action);
        ProtoAdapter protoAdapter = Button.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, searchCommonSection.section_footer_action_button);
        SearchCommonSection.Layout.ADAPTER.encodeWithTag(reverseProtoWriter, 10, searchCommonSection.layout);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, searchCommonSection.section_action_button);
        ProtoAdapter protoAdapter2 = Text.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, searchCommonSection.section_subtitle);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, searchCommonSection.section_title);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 4, searchCommonSection.default_max_items);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        SearchCommonSection searchCommonSection = (SearchCommonSection) obj;
        searchCommonSection.getClass();
        int size$okio = searchCommonSection.unknownFields().getSize$okio();
        LoaderAndroidKt loaderAndroidKt = searchCommonSection.content;
        if (loaderAndroidKt instanceof SearchCommonSection$Content$RowSection) {
            encodedSizeWithTag = SearchCommonRowSection.ADAPTER.encodedSizeWithTag(1, ((SearchCommonSection$Content$RowSection) loaderAndroidKt).value);
        } else if (loaderAndroidKt instanceof SearchCommonSection$Content$TextRowSection) {
            encodedSizeWithTag = SearchCommonTextRowSection.ADAPTER.encodedSizeWithTag(2, ((SearchCommonSection$Content$TextRowSection) loaderAndroidKt).value);
        } else if (loaderAndroidKt instanceof SearchCommonSection$Content$PlaceholderSection) {
            encodedSizeWithTag = SearchCommonPlaceholderSection.ADAPTER.encodedSizeWithTag(3, ((SearchCommonSection$Content$PlaceholderSection) loaderAndroidKt).value);
        } else if (loaderAndroidKt instanceof SearchCommonSection$Content$AvatarSection) {
            encodedSizeWithTag = SearchCommonAvatarSection.ADAPTER.encodedSizeWithTag(8, ((SearchCommonSection$Content$AvatarSection) loaderAndroidKt).value);
        } else if (loaderAndroidKt instanceof SearchCommonSection$Content$CardSection) {
            encodedSizeWithTag = SearchCommonCardSection.ADAPTER.encodedSizeWithTag(9, ((SearchCommonSection$Content$CardSection) loaderAndroidKt).value);
        } else {
            if (!(loaderAndroidKt instanceof SearchCommonSection$Content$MessageSection)) {
                if (loaderAndroidKt != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                int encodedSizeWithTag2 = ProtoAdapter.INT32.encodedSizeWithTag(4, searchCommonSection.default_max_items) + size$okio;
                ProtoAdapter protoAdapter = Text.ADAPTER;
                int encodedSizeWithTag3 = protoAdapter.encodedSizeWithTag(6, searchCommonSection.section_subtitle) + protoAdapter.encodedSizeWithTag(5, searchCommonSection.section_title) + encodedSizeWithTag2;
                ProtoAdapter protoAdapter2 = Button.ADAPTER;
                return TapAction.ADAPTER.encodedSizeWithTag(13, searchCommonSection.tap_action) + protoAdapter2.encodedSizeWithTag(11, searchCommonSection.section_footer_action_button) + SearchCommonSection.Layout.ADAPTER.encodedSizeWithTag(10, searchCommonSection.layout) + protoAdapter2.encodedSizeWithTag(7, searchCommonSection.section_action_button) + encodedSizeWithTag3;
            }
            encodedSizeWithTag = SearchCommonMessageSection.ADAPTER.encodedSizeWithTag(12, ((SearchCommonSection$Content$MessageSection) loaderAndroidKt).value);
        }
        size$okio += encodedSizeWithTag;
        int encodedSizeWithTag22 = ProtoAdapter.INT32.encodedSizeWithTag(4, searchCommonSection.default_max_items) + size$okio;
        ProtoAdapter protoAdapter3 = Text.ADAPTER;
        int encodedSizeWithTag32 = protoAdapter3.encodedSizeWithTag(6, searchCommonSection.section_subtitle) + protoAdapter3.encodedSizeWithTag(5, searchCommonSection.section_title) + encodedSizeWithTag22;
        ProtoAdapter protoAdapter22 = Button.ADAPTER;
        return TapAction.ADAPTER.encodedSizeWithTag(13, searchCommonSection.tap_action) + protoAdapter22.encodedSizeWithTag(11, searchCommonSection.section_footer_action_button) + SearchCommonSection.Layout.ADAPTER.encodedSizeWithTag(10, searchCommonSection.layout) + protoAdapter22.encodedSizeWithTag(7, searchCommonSection.section_action_button) + encodedSizeWithTag32;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SearchCommonSection searchCommonSection = (SearchCommonSection) obj;
        searchCommonSection.getClass();
        Text text = searchCommonSection.section_title;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        Text text3 = searchCommonSection.section_subtitle;
        Text text4 = text3 != null ? (Text) Text.ADAPTER.redact(text3) : null;
        Button button = searchCommonSection.section_action_button;
        Button button2 = button != null ? (Button) Button.ADAPTER.redact(button) : null;
        Button button3 = searchCommonSection.section_footer_action_button;
        Button button4 = button3 != null ? (Button) Button.ADAPTER.redact(button3) : null;
        TapAction tapAction = searchCommonSection.tap_action;
        TapAction tapAction2 = tapAction != null ? (TapAction) TapAction.ADAPTER.redact(tapAction) : null;
        ByteString byteString = ByteString.EMPTY;
        LoaderAndroidKt loaderAndroidKt = searchCommonSection.content;
        Integer num = searchCommonSection.default_max_items;
        SearchCommonSection.Layout layout = searchCommonSection.layout;
        byteString.getClass();
        return new SearchCommonSection(loaderAndroidKt, num, text2, text4, button2, layout, button4, tapAction2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SearchCommonSection searchCommonSection = (SearchCommonSection) obj;
        searchCommonSection.getClass();
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, searchCommonSection.default_max_items);
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 5, searchCommonSection.section_title);
        protoAdapter.encodeWithTag(protoWriter, 6, searchCommonSection.section_subtitle);
        ProtoAdapter protoAdapter2 = Button.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 7, searchCommonSection.section_action_button);
        SearchCommonSection.Layout.ADAPTER.encodeWithTag(protoWriter, 10, searchCommonSection.layout);
        protoAdapter2.encodeWithTag(protoWriter, 11, searchCommonSection.section_footer_action_button);
        TapAction.ADAPTER.encodeWithTag(protoWriter, 13, searchCommonSection.tap_action);
        LoaderAndroidKt loaderAndroidKt = searchCommonSection.content;
        if (loaderAndroidKt instanceof SearchCommonSection$Content$RowSection) {
            SearchCommonRowSection.ADAPTER.encodeWithTag(protoWriter, 1, ((SearchCommonSection$Content$RowSection) loaderAndroidKt).value);
        } else if (loaderAndroidKt instanceof SearchCommonSection$Content$TextRowSection) {
            SearchCommonTextRowSection.ADAPTER.encodeWithTag(protoWriter, 2, ((SearchCommonSection$Content$TextRowSection) loaderAndroidKt).value);
        } else if (loaderAndroidKt instanceof SearchCommonSection$Content$PlaceholderSection) {
            SearchCommonPlaceholderSection.ADAPTER.encodeWithTag(protoWriter, 3, ((SearchCommonSection$Content$PlaceholderSection) loaderAndroidKt).value);
        } else if (loaderAndroidKt instanceof SearchCommonSection$Content$AvatarSection) {
            SearchCommonAvatarSection.ADAPTER.encodeWithTag(protoWriter, 8, ((SearchCommonSection$Content$AvatarSection) loaderAndroidKt).value);
        } else if (loaderAndroidKt instanceof SearchCommonSection$Content$CardSection) {
            SearchCommonCardSection.ADAPTER.encodeWithTag(protoWriter, 9, ((SearchCommonSection$Content$CardSection) loaderAndroidKt).value);
        } else if (loaderAndroidKt instanceof SearchCommonSection$Content$MessageSection) {
            SearchCommonMessageSection.ADAPTER.encodeWithTag(protoWriter, 12, ((SearchCommonSection$Content$MessageSection) loaderAndroidKt).value);
        } else if (loaderAndroidKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(searchCommonSection.unknownFields());
    }
}
