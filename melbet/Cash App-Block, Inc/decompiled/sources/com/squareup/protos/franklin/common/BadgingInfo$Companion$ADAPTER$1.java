package com.squareup.protos.franklin.common;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BadgingInfo$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BadgingInfo((Boolean) obj, (Long) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BadgingInfo badgingInfo = (BadgingInfo) obj;
        reverseProtoWriter.getClass();
        badgingInfo.getClass();
        reverseProtoWriter.writeBytes(badgingInfo.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, badgingInfo.badging_version);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, badgingInfo.is_badged);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BadgingInfo badgingInfo = (BadgingInfo) obj;
        badgingInfo.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(2, badgingInfo.badging_version) + ProtoAdapter.BOOL.encodedSizeWithTag(1, badgingInfo.is_badged) + badgingInfo.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BadgingInfo badgingInfo = (BadgingInfo) obj;
        badgingInfo.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = badgingInfo.is_badged;
        Long l = badgingInfo.badging_version;
        byteString.getClass();
        return new BadgingInfo(bool, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BadgingInfo badgingInfo = (BadgingInfo) obj;
        badgingInfo.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, badgingInfo.is_badged);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, badgingInfo.badging_version);
        protoWriter.writeBytes(badgingInfo.unknownFields());
    }
}
