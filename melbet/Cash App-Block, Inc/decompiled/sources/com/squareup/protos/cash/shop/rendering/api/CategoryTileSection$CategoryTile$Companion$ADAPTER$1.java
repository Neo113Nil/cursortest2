package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_common.zzkq;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.CategoryTileSection;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CategoryTileSection$CategoryTile$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        zzkq categoryTileSection$CategoryTile$Style$ImageStyle;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        zzkq zzkqVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CategoryTileSection.CategoryTile((AnalyticsEvent) obj, (TapAction) obj2, (LocalizedString) obj3, zzkqVar, (StyledText) obj4, (Image) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj);
                    continue;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(TapAction.ADAPTER, protoReader, obj2);
                    continue;
                case 3:
                    obj5 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj5);
                    continue;
                case 4:
                default:
                    protoReader.readUnknownField(nextTag);
                    continue;
                case 5:
                    obj4 = TransactorKt.decodeMessageOrMerge(StyledText.ADAPTER, protoReader, obj4);
                    continue;
                case 6:
                    categoryTileSection$CategoryTile$Style$ImageStyle = new CategoryTileSection$CategoryTile$Style$ImageStyle((CategoryTileSection.CategoryTile.ImageStyle) CategoryTileSection.CategoryTile.ImageStyle.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    categoryTileSection$CategoryTile$Style$ImageStyle = new CategoryTileSection$CategoryTile$Style$IconStyle((CategoryTileSection.CategoryTile.IconStyle) CategoryTileSection.CategoryTile.IconStyle.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
                    continue;
            }
            zzkqVar = categoryTileSection$CategoryTile$Style$ImageStyle;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CategoryTileSection.CategoryTile categoryTile = (CategoryTileSection.CategoryTile) obj;
        reverseProtoWriter.getClass();
        categoryTile.getClass();
        reverseProtoWriter.writeBytes(categoryTile.unknownFields());
        zzkq zzkqVar = categoryTile.style;
        if (zzkqVar instanceof CategoryTileSection$CategoryTile$Style$ImageStyle) {
            CategoryTileSection.CategoryTile.ImageStyle.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((CategoryTileSection$CategoryTile$Style$ImageStyle) zzkqVar).value);
        } else if (zzkqVar instanceof CategoryTileSection$CategoryTile$Style$IconStyle) {
            CategoryTileSection.CategoryTile.IconStyle.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((CategoryTileSection$CategoryTile$Style$IconStyle) zzkqVar).value);
        } else if (zzkqVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 3, categoryTile.picture);
        StyledText.ADAPTER.encodeWithTag(reverseProtoWriter, 5, categoryTile.title);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 8, categoryTile.l_title);
        TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 2, categoryTile.tap_action);
        AnalyticsEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 1, categoryTile.analytics_view_event);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        CategoryTileSection.CategoryTile categoryTile = (CategoryTileSection.CategoryTile) obj;
        categoryTile.getClass();
        int encodedSizeWithTag2 = LocalizedString.ADAPTER.encodedSizeWithTag(8, categoryTile.l_title) + TapAction.ADAPTER.encodedSizeWithTag(2, categoryTile.tap_action) + AnalyticsEvent.ADAPTER.encodedSizeWithTag(1, categoryTile.analytics_view_event) + categoryTile.unknownFields().getSize$okio();
        zzkq zzkqVar = categoryTile.style;
        if (zzkqVar instanceof CategoryTileSection$CategoryTile$Style$ImageStyle) {
            encodedSizeWithTag = CategoryTileSection.CategoryTile.ImageStyle.ADAPTER.encodedSizeWithTag(6, ((CategoryTileSection$CategoryTile$Style$ImageStyle) zzkqVar).value);
        } else {
            if (!(zzkqVar instanceof CategoryTileSection$CategoryTile$Style$IconStyle)) {
                if (zzkqVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return Image.ADAPTER.encodedSizeWithTag(3, categoryTile.picture) + StyledText.ADAPTER.encodedSizeWithTag(5, categoryTile.title) + encodedSizeWithTag2;
            }
            encodedSizeWithTag = CategoryTileSection.CategoryTile.IconStyle.ADAPTER.encodedSizeWithTag(7, ((CategoryTileSection$CategoryTile$Style$IconStyle) zzkqVar).value);
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        return Image.ADAPTER.encodedSizeWithTag(3, categoryTile.picture) + StyledText.ADAPTER.encodedSizeWithTag(5, categoryTile.title) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CategoryTileSection.CategoryTile categoryTile = (CategoryTileSection.CategoryTile) obj;
        categoryTile.getClass();
        AnalyticsEvent analyticsEvent = categoryTile.analytics_view_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        TapAction tapAction = categoryTile.tap_action;
        TapAction tapAction2 = tapAction != null ? (TapAction) TapAction.ADAPTER.redact(tapAction) : null;
        LocalizedString localizedString = categoryTile.l_title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        StyledText styledText = categoryTile.title;
        StyledText styledText2 = styledText != null ? (StyledText) StyledText.ADAPTER.redact(styledText) : null;
        Image image = categoryTile.picture;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        zzkq zzkqVar = categoryTile.style;
        byteString.getClass();
        return new CategoryTileSection.CategoryTile(analyticsEvent2, tapAction2, localizedString2, zzkqVar, styledText2, image2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CategoryTileSection.CategoryTile categoryTile = (CategoryTileSection.CategoryTile) obj;
        categoryTile.getClass();
        AnalyticsEvent.ADAPTER.encodeWithTag(protoWriter, 1, categoryTile.analytics_view_event);
        TapAction.ADAPTER.encodeWithTag(protoWriter, 2, categoryTile.tap_action);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 8, categoryTile.l_title);
        StyledText.ADAPTER.encodeWithTag(protoWriter, 5, categoryTile.title);
        Image.ADAPTER.encodeWithTag(protoWriter, 3, categoryTile.picture);
        zzkq zzkqVar = categoryTile.style;
        if (zzkqVar instanceof CategoryTileSection$CategoryTile$Style$ImageStyle) {
            CategoryTileSection.CategoryTile.ImageStyle.ADAPTER.encodeWithTag(protoWriter, 6, ((CategoryTileSection$CategoryTile$Style$ImageStyle) zzkqVar).value);
        } else if (zzkqVar instanceof CategoryTileSection$CategoryTile$Style$IconStyle) {
            CategoryTileSection.CategoryTile.IconStyle.ADAPTER.encodeWithTag(protoWriter, 7, ((CategoryTileSection$CategoryTile$Style$IconStyle) zzkqVar).value);
        } else if (zzkqVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(categoryTile.unknownFields());
    }
}
