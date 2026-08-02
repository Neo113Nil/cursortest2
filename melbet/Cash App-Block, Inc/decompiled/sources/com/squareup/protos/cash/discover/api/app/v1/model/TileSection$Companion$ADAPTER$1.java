package com.squareup.protos.cash.discover.api.app.v1.model;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.discover.api.app.v1.model.TileSection;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class TileSection$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new TileSection((Image) obj, (Double) obj2, (TileSection.Composition) obj3, (TileSection.ElementPlacement) obj4, (TileSection.ElementPlacement) obj5, (TileSection.SubtitlePlacement) obj6, (DetailsPage) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = ProtoAdapter.DOUBLE.decode(protoReader);
                    break;
                case 3:
                    try {
                        obj3 = TileSection.Composition.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 4:
                    try {
                        obj6 = TileSection.SubtitlePlacement.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 5:
                    obj7 = TransactorKt.decodeMessageOrMerge(DetailsPage.ADAPTER, protoReader, obj7);
                    break;
                case 6:
                    try {
                        obj4 = TileSection.ElementPlacement.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 7:
                    try {
                        obj5 = TileSection.ElementPlacement.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TileSection tileSection = (TileSection) obj;
        reverseProtoWriter.getClass();
        tileSection.getClass();
        reverseProtoWriter.writeBytes(tileSection.unknownFields());
        DetailsPage.ADAPTER.encodeWithTag(reverseProtoWriter, 5, tileSection.details_page);
        TileSection.SubtitlePlacement.ADAPTER.encodeWithTag(reverseProtoWriter, 4, tileSection.subtitle_placement);
        TileSection$ElementPlacement$Companion$ADAPTER$1 tileSection$ElementPlacement$Companion$ADAPTER$1 = TileSection.ElementPlacement.ADAPTER;
        tileSection$ElementPlacement$Companion$ADAPTER$1.encodeWithTag(reverseProtoWriter, 7, tileSection.button_placement);
        tileSection$ElementPlacement$Companion$ADAPTER$1.encodeWithTag(reverseProtoWriter, 6, tileSection.text_placement);
        TileSection.Composition.ADAPTER.encodeWithTag(reverseProtoWriter, 3, tileSection.composition);
        ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 2, tileSection.tile_ratio);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, tileSection.image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TileSection tileSection = (TileSection) obj;
        tileSection.getClass();
        int encodedSizeWithTag = TileSection.Composition.ADAPTER.encodedSizeWithTag(3, tileSection.composition) + ProtoAdapter.DOUBLE.encodedSizeWithTag(2, tileSection.tile_ratio) + Image.ADAPTER.encodedSizeWithTag(1, tileSection.image) + tileSection.unknownFields().getSize$okio();
        TileSection$ElementPlacement$Companion$ADAPTER$1 tileSection$ElementPlacement$Companion$ADAPTER$1 = TileSection.ElementPlacement.ADAPTER;
        return DetailsPage.ADAPTER.encodedSizeWithTag(5, tileSection.details_page) + TileSection.SubtitlePlacement.ADAPTER.encodedSizeWithTag(4, tileSection.subtitle_placement) + tileSection$ElementPlacement$Companion$ADAPTER$1.encodedSizeWithTag(7, tileSection.button_placement) + tileSection$ElementPlacement$Companion$ADAPTER$1.encodedSizeWithTag(6, tileSection.text_placement) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TileSection tileSection = (TileSection) obj;
        tileSection.getClass();
        Image image = tileSection.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        DetailsPage detailsPage = tileSection.details_page;
        DetailsPage detailsPage2 = detailsPage != null ? (DetailsPage) DetailsPage.ADAPTER.redact(detailsPage) : null;
        ByteString byteString = ByteString.EMPTY;
        Double d = tileSection.tile_ratio;
        TileSection.Composition composition = tileSection.composition;
        TileSection.ElementPlacement elementPlacement = tileSection.text_placement;
        TileSection.ElementPlacement elementPlacement2 = tileSection.button_placement;
        TileSection.SubtitlePlacement subtitlePlacement = tileSection.subtitle_placement;
        byteString.getClass();
        return new TileSection(image2, d, composition, elementPlacement, elementPlacement2, subtitlePlacement, detailsPage2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TileSection tileSection = (TileSection) obj;
        tileSection.getClass();
        Image.ADAPTER.encodeWithTag(protoWriter, 1, tileSection.image);
        ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 2, tileSection.tile_ratio);
        TileSection.Composition.ADAPTER.encodeWithTag(protoWriter, 3, tileSection.composition);
        TileSection$ElementPlacement$Companion$ADAPTER$1 tileSection$ElementPlacement$Companion$ADAPTER$1 = TileSection.ElementPlacement.ADAPTER;
        tileSection$ElementPlacement$Companion$ADAPTER$1.encodeWithTag(protoWriter, 6, tileSection.text_placement);
        tileSection$ElementPlacement$Companion$ADAPTER$1.encodeWithTag(protoWriter, 7, tileSection.button_placement);
        TileSection.SubtitlePlacement.ADAPTER.encodeWithTag(protoWriter, 4, tileSection.subtitle_placement);
        DetailsPage.ADAPTER.encodeWithTag(protoWriter, 5, tileSection.details_page);
        protoWriter.writeBytes(tileSection.unknownFields());
    }
}
