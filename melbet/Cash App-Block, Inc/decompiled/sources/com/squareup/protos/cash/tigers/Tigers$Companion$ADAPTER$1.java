package com.squareup.protos.cash.tigers;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Tigers$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Tigers((Long) obj, (Long) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Tigers tigers = (Tigers) obj;
        reverseProtoWriter.getClass();
        tigers.getClass();
        reverseProtoWriter.writeBytes(tigers.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, tigers.fetch_version);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, tigers.tiger_count);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Tigers tigers = (Tigers) obj;
        tigers.getClass();
        int size$okio = tigers.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        return protoAdapter.encodedSizeWithTag(2, tigers.fetch_version) + protoAdapter.encodedSizeWithTag(1, tigers.tiger_count) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Tigers tigers = (Tigers) obj;
        tigers.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = tigers.tiger_count;
        Long l2 = tigers.fetch_version;
        byteString.getClass();
        return new Tigers(l, l2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Tigers tigers = (Tigers) obj;
        tigers.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, tigers.tiger_count);
        protoAdapter.encodeWithTag(protoWriter, 2, tigers.fetch_version);
        protoWriter.writeBytes(tigers.unknownFields());
    }
}
