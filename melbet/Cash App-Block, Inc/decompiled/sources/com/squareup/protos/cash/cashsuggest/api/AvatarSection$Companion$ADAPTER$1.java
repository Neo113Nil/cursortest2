package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.AvatarSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AvatarSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AvatarSection(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(AvatarSection.AvatarItem.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AvatarSection avatarSection = (AvatarSection) obj;
        reverseProtoWriter.getClass();
        avatarSection.getClass();
        reverseProtoWriter.writeBytes(avatarSection.unknownFields());
        AvatarSection.AvatarItem.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, avatarSection.items);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AvatarSection avatarSection = (AvatarSection) obj;
        avatarSection.getClass();
        return AvatarSection.AvatarItem.ADAPTER.asRepeated().encodedSizeWithTag(1, avatarSection.items) + avatarSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AvatarSection avatarSection = (AvatarSection) obj;
        avatarSection.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(avatarSection.items, AvatarSection.AvatarItem.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AvatarSection(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AvatarSection avatarSection = (AvatarSection) obj;
        avatarSection.getClass();
        AvatarSection.AvatarItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, avatarSection.items);
        protoWriter.writeBytes(avatarSection.unknownFields());
    }
}
