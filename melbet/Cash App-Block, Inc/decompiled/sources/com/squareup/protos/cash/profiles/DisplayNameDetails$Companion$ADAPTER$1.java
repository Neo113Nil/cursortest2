package com.squareup.protos.cash.profiles;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DisplayNameDetails$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DisplayNameDetails((Long) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DisplayNameDetails displayNameDetails = (DisplayNameDetails) obj;
        reverseProtoWriter.getClass();
        displayNameDetails.getClass();
        reverseProtoWriter.writeBytes(displayNameDetails.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, displayNameDetails.remaining_display_name_change_limit);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DisplayNameDetails displayNameDetails = (DisplayNameDetails) obj;
        displayNameDetails.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(1, displayNameDetails.remaining_display_name_change_limit) + displayNameDetails.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DisplayNameDetails displayNameDetails = (DisplayNameDetails) obj;
        displayNameDetails.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = displayNameDetails.remaining_display_name_change_limit;
        byteString.getClass();
        return new DisplayNameDetails(l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DisplayNameDetails displayNameDetails = (DisplayNameDetails) obj;
        displayNameDetails.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, displayNameDetails.remaining_display_name_change_limit);
        protoWriter.writeBytes(displayNameDetails.unknownFields());
    }
}
