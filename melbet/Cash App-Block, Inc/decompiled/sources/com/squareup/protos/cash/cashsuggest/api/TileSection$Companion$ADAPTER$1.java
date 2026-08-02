package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashsuggest.api.TileSection;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class TileSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TileSection((Image) obj, (Double) obj2, (TileSection.Composition) obj3, (TileSection.SubtitlePlacement) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.DOUBLE.decode(protoReader);
            } else if (nextTag == 3) {
                try {
                    obj3 = TileSection.Composition.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj4 = TileSection.SubtitlePlacement.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TileSection tileSection = (TileSection) obj;
        reverseProtoWriter.getClass();
        tileSection.getClass();
        reverseProtoWriter.writeBytes(tileSection.unknownFields());
        TileSection.SubtitlePlacement.ADAPTER.encodeWithTag(reverseProtoWriter, 4, tileSection.subtitle_placement);
        TileSection.Composition.ADAPTER.encodeWithTag(reverseProtoWriter, 3, tileSection.composition);
        ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 2, tileSection.tile_ratio);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, tileSection.image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TileSection tileSection = (TileSection) obj;
        tileSection.getClass();
        return TileSection.SubtitlePlacement.ADAPTER.encodedSizeWithTag(4, tileSection.subtitle_placement) + TileSection.Composition.ADAPTER.encodedSizeWithTag(3, tileSection.composition) + ProtoAdapter.DOUBLE.encodedSizeWithTag(2, tileSection.tile_ratio) + Image.ADAPTER.encodedSizeWithTag(1, tileSection.image) + tileSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TileSection tileSection = (TileSection) obj;
        tileSection.getClass();
        Image image = tileSection.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        Double d = tileSection.tile_ratio;
        TileSection.Composition composition = tileSection.composition;
        TileSection.SubtitlePlacement subtitlePlacement = tileSection.subtitle_placement;
        byteString.getClass();
        return new TileSection(image2, d, composition, subtitlePlacement, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TileSection tileSection = (TileSection) obj;
        tileSection.getClass();
        Image.ADAPTER.encodeWithTag(protoWriter, 1, tileSection.image);
        ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 2, tileSection.tile_ratio);
        TileSection.Composition.ADAPTER.encodeWithTag(protoWriter, 3, tileSection.composition);
        TileSection.SubtitlePlacement.ADAPTER.encodeWithTag(protoWriter, 4, tileSection.subtitle_placement);
        protoWriter.writeBytes(tileSection.unknownFields());
    }
}
