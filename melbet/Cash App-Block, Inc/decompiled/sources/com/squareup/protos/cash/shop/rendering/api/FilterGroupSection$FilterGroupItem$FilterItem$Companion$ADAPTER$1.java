package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class FilterGroupSection$FilterGroupItem$FilterItem$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new FilterGroupSection.FilterGroupItem.FilterItem((String) obj, (TapAction) obj2, (Icon) obj3, (LocalizedString) obj4, (LocalizedString) obj5, (String) obj6, (Image) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj7 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj7);
                    break;
                case 4:
                    obj2 = TransactorKt.decodeMessageOrMerge(TapAction.ADAPTER, protoReader, obj2);
                    break;
                case 5:
                    obj3 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj3);
                    break;
                case 6:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
                    break;
                case 7:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FilterGroupSection.FilterGroupItem.FilterItem filterItem = (FilterGroupSection.FilterGroupItem.FilterItem) obj;
        reverseProtoWriter.getClass();
        filterItem.getClass();
        reverseProtoWriter.writeBytes(filterItem.unknownFields());
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 3, filterItem.image);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, filterItem.name);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, filterItem.subtitle);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, filterItem.l_name);
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 5, filterItem.arcade_icon);
        TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 4, filterItem.tap_action);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, filterItem.filter_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FilterGroupSection.FilterGroupItem.FilterItem filterItem = (FilterGroupSection.FilterGroupItem.FilterItem) obj;
        filterItem.getClass();
        int size$okio = filterItem.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = Icon.ADAPTER.encodedSizeWithTag(5, filterItem.arcade_icon) + TapAction.ADAPTER.encodedSizeWithTag(4, filterItem.tap_action) + protoAdapter.encodedSizeWithTag(1, filterItem.filter_token) + size$okio;
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        return Image.ADAPTER.encodedSizeWithTag(3, filterItem.image) + protoAdapter.encodedSizeWithTag(2, filterItem.name) + protoAdapter2.encodedSizeWithTag(7, filterItem.subtitle) + protoAdapter2.encodedSizeWithTag(6, filterItem.l_name) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FilterGroupSection.FilterGroupItem.FilterItem filterItem = (FilterGroupSection.FilterGroupItem.FilterItem) obj;
        filterItem.getClass();
        TapAction tapAction = filterItem.tap_action;
        TapAction tapAction2 = tapAction != null ? (TapAction) TapAction.ADAPTER.redact(tapAction) : null;
        Icon icon = filterItem.arcade_icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        LocalizedString localizedString = filterItem.l_name;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = filterItem.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        Image image = filterItem.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = filterItem.filter_token;
        String str2 = filterItem.name;
        byteString.getClass();
        return new FilterGroupSection.FilterGroupItem.FilterItem(str, tapAction2, icon2, localizedString2, localizedString4, str2, image2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FilterGroupSection.FilterGroupItem.FilterItem filterItem = (FilterGroupSection.FilterGroupItem.FilterItem) obj;
        filterItem.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, filterItem.filter_token);
        TapAction.ADAPTER.encodeWithTag(protoWriter, 4, filterItem.tap_action);
        Icon.ADAPTER.encodeWithTag(protoWriter, 5, filterItem.arcade_icon);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 6, filterItem.l_name);
        protoAdapter2.encodeWithTag(protoWriter, 7, filterItem.subtitle);
        protoAdapter.encodeWithTag(protoWriter, 2, filterItem.name);
        Image.ADAPTER.encodeWithTag(protoWriter, 3, filterItem.image);
        protoWriter.writeBytes(filterItem.unknownFields());
    }
}
