package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AvatarCarousel$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AvatarCarousel(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(AvatarItem.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AvatarCarousel avatarCarousel = (AvatarCarousel) obj;
        reverseProtoWriter.getClass();
        avatarCarousel.getClass();
        reverseProtoWriter.writeBytes(avatarCarousel.unknownFields());
        AvatarItem.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, avatarCarousel.items);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AvatarCarousel avatarCarousel = (AvatarCarousel) obj;
        avatarCarousel.getClass();
        return AvatarItem.ADAPTER.asRepeated().encodedSizeWithTag(1, avatarCarousel.items) + avatarCarousel.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AvatarCarousel avatarCarousel = (AvatarCarousel) obj;
        avatarCarousel.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(avatarCarousel.items, AvatarItem.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AvatarCarousel(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AvatarCarousel avatarCarousel = (AvatarCarousel) obj;
        avatarCarousel.getClass();
        AvatarItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, avatarCarousel.items);
        protoWriter.writeBytes(avatarCarousel.unknownFields());
    }
}
