package com.squareup.protos.cash.messagingplatformcommon.app;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class HeroImage$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new HeroImage((Image) obj, (Double) obj2, (Color) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.DOUBLE.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        HeroImage heroImage = (HeroImage) obj;
        reverseProtoWriter.getClass();
        heroImage.getClass();
        reverseProtoWriter.writeBytes(heroImage.unknownFields());
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 4, heroImage.background_color);
        ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 2, heroImage.screen_fill_percent);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, heroImage.image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        HeroImage heroImage = (HeroImage) obj;
        heroImage.getClass();
        return Color.ADAPTER.encodedSizeWithTag(4, heroImage.background_color) + ProtoAdapter.DOUBLE.encodedSizeWithTag(2, heroImage.screen_fill_percent) + Image.ADAPTER.encodedSizeWithTag(1, heroImage.image) + heroImage.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        HeroImage heroImage = (HeroImage) obj;
        heroImage.getClass();
        Image image = heroImage.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        Color color = heroImage.background_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        Double d = heroImage.screen_fill_percent;
        byteString.getClass();
        return new HeroImage(image2, d, color2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        HeroImage heroImage = (HeroImage) obj;
        heroImage.getClass();
        Image.ADAPTER.encodeWithTag(protoWriter, 1, heroImage.image);
        ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 2, heroImage.screen_fill_percent);
        Color.ADAPTER.encodeWithTag(protoWriter, 4, heroImage.background_color);
        protoWriter.writeBytes(heroImage.unknownFields());
    }
}
