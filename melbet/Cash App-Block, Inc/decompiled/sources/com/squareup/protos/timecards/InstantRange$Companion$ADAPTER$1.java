package com.squareup.protos.timecards;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class InstantRange$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InstantRange((Long) obj, (Long) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.UINT64.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.UINT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InstantRange instantRange = (InstantRange) obj;
        reverseProtoWriter.getClass();
        instantRange.getClass();
        reverseProtoWriter.writeBytes(instantRange.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.UINT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, instantRange.stop_epoch_millisecond);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, instantRange.start_epoch_millisecond);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InstantRange instantRange = (InstantRange) obj;
        instantRange.getClass();
        int size$okio = instantRange.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.UINT64;
        return protoAdapter.encodedSizeWithTag(2, instantRange.stop_epoch_millisecond) + protoAdapter.encodedSizeWithTag(1, instantRange.start_epoch_millisecond) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InstantRange instantRange = (InstantRange) obj;
        instantRange.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = instantRange.start_epoch_millisecond;
        Long l2 = instantRange.stop_epoch_millisecond;
        byteString.getClass();
        return new InstantRange(l, l2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InstantRange instantRange = (InstantRange) obj;
        instantRange.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.UINT64;
        protoAdapter.encodeWithTag(protoWriter, 1, instantRange.start_epoch_millisecond);
        protoAdapter.encodeWithTag(protoWriter, 2, instantRange.stop_epoch_millisecond);
        protoWriter.writeBytes(instantRange.unknownFields());
    }
}
