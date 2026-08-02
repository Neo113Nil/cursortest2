package com.squareup.protos.cash.local.client.app.v1.poscheckin;

import com.squareup.protos.cash.local.client.app.v1.poscheckin.LocalPOSCheckIn;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalPOSCheckIn$Image$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalPOSCheckIn.Image((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        LocalPOSCheckIn.Image image = (LocalPOSCheckIn.Image) obj;
        reverseProtoWriter.getClass();
        image.getClass();
        reverseProtoWriter.writeBytes(image.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, image.dark_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, image.light_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalPOSCheckIn.Image image = (LocalPOSCheckIn.Image) obj;
        image.getClass();
        int size$okio = image.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, image.dark_url) + protoAdapter.encodedSizeWithTag(1, image.light_url) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalPOSCheckIn.Image image = (LocalPOSCheckIn.Image) obj;
        image.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = image.light_url;
        String str2 = image.dark_url;
        byteString.getClass();
        return new LocalPOSCheckIn.Image(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalPOSCheckIn.Image image = (LocalPOSCheckIn.Image) obj;
        image.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, image.light_url);
        protoAdapter.encodeWithTag(protoWriter, 2, image.dark_url);
        protoWriter.writeBytes(image.unknownFields());
    }
}
