package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.shop.rendering.api.HeroSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class HeroSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new HeroSection(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(HeroSection.HeroTile.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        HeroSection heroSection = (HeroSection) obj;
        reverseProtoWriter.getClass();
        heroSection.getClass();
        reverseProtoWriter.writeBytes(heroSection.unknownFields());
        HeroSection.HeroTile.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, heroSection.hero_tiles);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        HeroSection heroSection = (HeroSection) obj;
        heroSection.getClass();
        return HeroSection.HeroTile.ADAPTER.asRepeated().encodedSizeWithTag(1, heroSection.hero_tiles) + heroSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        HeroSection heroSection = (HeroSection) obj;
        heroSection.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(heroSection.hero_tiles, HeroSection.HeroTile.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new HeroSection(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        HeroSection heroSection = (HeroSection) obj;
        heroSection.getClass();
        HeroSection.HeroTile.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, heroSection.hero_tiles);
        protoWriter.writeBytes(heroSection.unknownFields());
    }
}
