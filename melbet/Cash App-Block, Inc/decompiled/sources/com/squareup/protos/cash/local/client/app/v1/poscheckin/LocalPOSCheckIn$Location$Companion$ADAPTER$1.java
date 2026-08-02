package com.squareup.protos.cash.local.client.app.v1.poscheckin;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.app.v1.poscheckin.LocalPOSCheckIn;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalPOSCheckIn$Location$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalPOSCheckIn.Location((String) obj, (String) obj2, (LocalPOSCheckIn.MiniCard) obj3, (LocalPOSCheckIn.Color) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalPOSCheckIn.MiniCard.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalPOSCheckIn.Color.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalPOSCheckIn.Location location = (LocalPOSCheckIn.Location) obj;
        reverseProtoWriter.getClass();
        location.getClass();
        reverseProtoWriter.writeBytes(location.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, location.cashtag);
        LocalPOSCheckIn.Color.ADAPTER.encodeWithTag(reverseProtoWriter, 4, location.foreground_color);
        LocalPOSCheckIn.MiniCard.ADAPTER.encodeWithTag(reverseProtoWriter, 3, location.mini_card);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, location.brand_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, location.location_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalPOSCheckIn.Location location = (LocalPOSCheckIn.Location) obj;
        location.getClass();
        int size$okio = location.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, location.cashtag) + LocalPOSCheckIn.Color.ADAPTER.encodedSizeWithTag(4, location.foreground_color) + LocalPOSCheckIn.MiniCard.ADAPTER.encodedSizeWithTag(3, location.mini_card) + protoAdapter.encodedSizeWithTag(2, location.brand_name) + protoAdapter.encodedSizeWithTag(1, location.location_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalPOSCheckIn.Location location = (LocalPOSCheckIn.Location) obj;
        location.getClass();
        LocalPOSCheckIn.MiniCard miniCard = location.mini_card;
        LocalPOSCheckIn.MiniCard miniCard2 = miniCard != null ? (LocalPOSCheckIn.MiniCard) LocalPOSCheckIn.MiniCard.ADAPTER.redact(miniCard) : null;
        LocalPOSCheckIn.Color color = location.foreground_color;
        LocalPOSCheckIn.Color color2 = color != null ? (LocalPOSCheckIn.Color) LocalPOSCheckIn.Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = location.location_token;
        String str2 = location.brand_name;
        byteString.getClass();
        return new LocalPOSCheckIn.Location(str, str2, miniCard2, color2, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalPOSCheckIn.Location location = (LocalPOSCheckIn.Location) obj;
        location.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, location.location_token);
        protoAdapter.encodeWithTag(protoWriter, 2, location.brand_name);
        LocalPOSCheckIn.MiniCard.ADAPTER.encodeWithTag(protoWriter, 3, location.mini_card);
        LocalPOSCheckIn.Color.ADAPTER.encodeWithTag(protoWriter, 4, location.foreground_color);
        protoAdapter.encodeWithTag(protoWriter, 5, location.cashtag);
        protoWriter.writeBytes(location.unknownFields());
    }
}
