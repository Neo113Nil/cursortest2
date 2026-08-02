package com.squareup.protos.cash.discover.api.app.v1.model;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.discover.api.app.v1.model.AvatarOverlayCardSection;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AvatarOverlayCardSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AvatarOverlayCardSection(m, (ImageLayout) obj, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(AvatarOverlayCardSection.AvatarOverlayCardItem.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                try {
                    obj = ImageLayout.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList.add(AvatarOverlayCardSection.OverlayCardItem.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AvatarOverlayCardSection avatarOverlayCardSection = (AvatarOverlayCardSection) obj;
        reverseProtoWriter.getClass();
        avatarOverlayCardSection.getClass();
        reverseProtoWriter.writeBytes(avatarOverlayCardSection.unknownFields());
        AvatarOverlayCardSection.OverlayCardItem.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, avatarOverlayCardSection.overlay_items);
        ImageLayout.ADAPTER.encodeWithTag(reverseProtoWriter, 2, avatarOverlayCardSection.image_layout);
        AvatarOverlayCardSection.AvatarOverlayCardItem.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, avatarOverlayCardSection.items);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AvatarOverlayCardSection avatarOverlayCardSection = (AvatarOverlayCardSection) obj;
        avatarOverlayCardSection.getClass();
        return AvatarOverlayCardSection.OverlayCardItem.ADAPTER.asRepeated().encodedSizeWithTag(3, avatarOverlayCardSection.overlay_items) + ImageLayout.ADAPTER.encodedSizeWithTag(2, avatarOverlayCardSection.image_layout) + AvatarOverlayCardSection.AvatarOverlayCardItem.ADAPTER.asRepeated().encodedSizeWithTag(1, avatarOverlayCardSection.items) + avatarOverlayCardSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AvatarOverlayCardSection avatarOverlayCardSection = (AvatarOverlayCardSection) obj;
        avatarOverlayCardSection.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(avatarOverlayCardSection.items, AvatarOverlayCardSection.AvatarOverlayCardItem.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(avatarOverlayCardSection.overlay_items, AvatarOverlayCardSection.OverlayCardItem.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        ImageLayout imageLayout = avatarOverlayCardSection.image_layout;
        byteString.getClass();
        return new AvatarOverlayCardSection(m1169redactElements, imageLayout, m1169redactElements2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AvatarOverlayCardSection avatarOverlayCardSection = (AvatarOverlayCardSection) obj;
        avatarOverlayCardSection.getClass();
        AvatarOverlayCardSection.AvatarOverlayCardItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, avatarOverlayCardSection.items);
        ImageLayout.ADAPTER.encodeWithTag(protoWriter, 2, avatarOverlayCardSection.image_layout);
        AvatarOverlayCardSection.OverlayCardItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, avatarOverlayCardSection.overlay_items);
        protoWriter.writeBytes(avatarOverlayCardSection.unknownFields());
    }
}
