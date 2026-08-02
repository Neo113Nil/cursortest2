package com.squareup.protos.cash.local.client.app.v1.poscheckin;

import com.squareup.protos.cash.local.client.app.v1.poscheckin.LocalPOSCheckIn;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalPOSCheckIn$Color$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalPOSCheckIn.Color((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalPOSCheckIn.Color color = (LocalPOSCheckIn.Color) obj;
        reverseProtoWriter.getClass();
        color.getClass();
        reverseProtoWriter.writeBytes(color.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, color.dark_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, color.light_color);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalPOSCheckIn.Color color = (LocalPOSCheckIn.Color) obj;
        color.getClass();
        int size$okio = color.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, color.dark_color) + protoAdapter.encodedSizeWithTag(1, color.light_color) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalPOSCheckIn.Color color = (LocalPOSCheckIn.Color) obj;
        color.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = color.light_color;
        String str2 = color.dark_color;
        byteString.getClass();
        return new LocalPOSCheckIn.Color(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalPOSCheckIn.Color color = (LocalPOSCheckIn.Color) obj;
        color.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, color.light_color);
        protoAdapter.encodeWithTag(protoWriter, 2, color.dark_color);
        protoWriter.writeBytes(color.unknownFields());
    }
}
