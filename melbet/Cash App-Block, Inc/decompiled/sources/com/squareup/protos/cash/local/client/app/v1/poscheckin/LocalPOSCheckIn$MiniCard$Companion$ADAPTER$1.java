package com.squareup.protos.cash.local.client.app.v1.poscheckin;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.app.v1.poscheckin.LocalPOSCheckIn;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalPOSCheckIn$MiniCard$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalPOSCheckIn.MiniCard((LocalPOSCheckIn.Color) obj, (LocalPOSCheckIn.Image) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalPOSCheckIn.Color.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalPOSCheckIn.Image.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalPOSCheckIn.MiniCard miniCard = (LocalPOSCheckIn.MiniCard) obj;
        reverseProtoWriter.getClass();
        miniCard.getClass();
        reverseProtoWriter.writeBytes(miniCard.unknownFields());
        LocalPOSCheckIn.Image.ADAPTER.encodeWithTag(reverseProtoWriter, 2, miniCard.icon);
        LocalPOSCheckIn.Color.ADAPTER.encodeWithTag(reverseProtoWriter, 1, miniCard.background_color);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalPOSCheckIn.MiniCard miniCard = (LocalPOSCheckIn.MiniCard) obj;
        miniCard.getClass();
        return LocalPOSCheckIn.Image.ADAPTER.encodedSizeWithTag(2, miniCard.icon) + LocalPOSCheckIn.Color.ADAPTER.encodedSizeWithTag(1, miniCard.background_color) + miniCard.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalPOSCheckIn.MiniCard miniCard = (LocalPOSCheckIn.MiniCard) obj;
        miniCard.getClass();
        LocalPOSCheckIn.Color color = miniCard.background_color;
        LocalPOSCheckIn.Color color2 = color != null ? (LocalPOSCheckIn.Color) LocalPOSCheckIn.Color.ADAPTER.redact(color) : null;
        LocalPOSCheckIn.Image image = miniCard.icon;
        LocalPOSCheckIn.Image image2 = image != null ? (LocalPOSCheckIn.Image) LocalPOSCheckIn.Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LocalPOSCheckIn.MiniCard(color2, image2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalPOSCheckIn.MiniCard miniCard = (LocalPOSCheckIn.MiniCard) obj;
        miniCard.getClass();
        LocalPOSCheckIn.Color.ADAPTER.encodeWithTag(protoWriter, 1, miniCard.background_color);
        LocalPOSCheckIn.Image.ADAPTER.encodeWithTag(protoWriter, 2, miniCard.icon);
        protoWriter.writeBytes(miniCard.unknownFields());
    }
}
