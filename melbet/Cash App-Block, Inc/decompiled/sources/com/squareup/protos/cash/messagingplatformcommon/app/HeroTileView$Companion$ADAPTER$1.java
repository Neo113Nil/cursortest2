package com.squareup.protos.cash.messagingplatformcommon.app;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class HeroTileView$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new HeroTileView((Image) obj, (Double) obj2, (AppMessageAction) obj3, (Text) obj4, (Text) obj5, (Text) obj6, (DetailsPageView) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = ProtoAdapter.DOUBLE.decode(protoReader);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(AppMessageAction.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(DetailsPageView.ADAPTER, protoReader, obj7);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        HeroTileView heroTileView = (HeroTileView) obj;
        reverseProtoWriter.getClass();
        heroTileView.getClass();
        reverseProtoWriter.writeBytes(heroTileView.unknownFields());
        DetailsPageView.ADAPTER.encodeWithTag(reverseProtoWriter, 7, heroTileView.details_page);
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, heroTileView.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, heroTileView.title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, heroTileView.eyebrow);
        AppMessageAction.ADAPTER.encodeWithTag(reverseProtoWriter, 3, heroTileView.tap_action);
        ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 2, heroTileView.tile_ratio);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, heroTileView.image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        HeroTileView heroTileView = (HeroTileView) obj;
        heroTileView.getClass();
        int encodedSizeWithTag = AppMessageAction.ADAPTER.encodedSizeWithTag(3, heroTileView.tap_action) + ProtoAdapter.DOUBLE.encodedSizeWithTag(2, heroTileView.tile_ratio) + Image.ADAPTER.encodedSizeWithTag(1, heroTileView.image) + heroTileView.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Text.ADAPTER;
        return DetailsPageView.ADAPTER.encodedSizeWithTag(7, heroTileView.details_page) + protoAdapter.encodedSizeWithTag(6, heroTileView.subtitle) + protoAdapter.encodedSizeWithTag(5, heroTileView.title) + protoAdapter.encodedSizeWithTag(4, heroTileView.eyebrow) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        HeroTileView heroTileView = (HeroTileView) obj;
        heroTileView.getClass();
        Image image = heroTileView.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        AppMessageAction appMessageAction = heroTileView.tap_action;
        AppMessageAction appMessageAction2 = appMessageAction != null ? (AppMessageAction) AppMessageAction.ADAPTER.redact(appMessageAction) : null;
        Text text = heroTileView.eyebrow;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        Text text3 = heroTileView.title;
        Text text4 = text3 != null ? (Text) Text.ADAPTER.redact(text3) : null;
        Text text5 = heroTileView.subtitle;
        Text text6 = text5 != null ? (Text) Text.ADAPTER.redact(text5) : null;
        DetailsPageView detailsPageView = heroTileView.details_page;
        DetailsPageView detailsPageView2 = detailsPageView != null ? (DetailsPageView) DetailsPageView.ADAPTER.redact(detailsPageView) : null;
        ByteString byteString = ByteString.EMPTY;
        Double d = heroTileView.tile_ratio;
        byteString.getClass();
        return new HeroTileView(image2, d, appMessageAction2, text2, text4, text6, detailsPageView2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        HeroTileView heroTileView = (HeroTileView) obj;
        heroTileView.getClass();
        Image.ADAPTER.encodeWithTag(protoWriter, 1, heroTileView.image);
        ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 2, heroTileView.tile_ratio);
        AppMessageAction.ADAPTER.encodeWithTag(protoWriter, 3, heroTileView.tap_action);
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 4, heroTileView.eyebrow);
        protoAdapter.encodeWithTag(protoWriter, 5, heroTileView.title);
        protoAdapter.encodeWithTag(protoWriter, 6, heroTileView.subtitle);
        DetailsPageView.ADAPTER.encodeWithTag(protoWriter, 7, heroTileView.details_page);
        protoWriter.writeBytes(heroTileView.unknownFields());
    }
}
