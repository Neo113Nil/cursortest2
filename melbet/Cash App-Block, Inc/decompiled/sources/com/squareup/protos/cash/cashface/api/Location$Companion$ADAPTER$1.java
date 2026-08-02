package com.squareup.protos.cash.cashface.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Location$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Location((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Location location = (Location) obj;
        reverseProtoWriter.getClass();
        location.getClass();
        reverseProtoWriter.writeBytes(location.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, location.display_location);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Location location = (Location) obj;
        location.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, location.display_location) + location.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((Location) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Location(null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Location location = (Location) obj;
        location.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, location.display_location);
        protoWriter.writeBytes(location.unknownFields());
    }
}
