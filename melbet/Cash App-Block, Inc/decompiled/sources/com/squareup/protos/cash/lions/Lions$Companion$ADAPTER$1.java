package com.squareup.protos.cash.lions;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Lions$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Lions((Long) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        Lions lions = (Lions) obj;
        reverseProtoWriter.getClass();
        lions.getClass();
        reverseProtoWriter.writeBytes(lions.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, lions.lion_count);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Lions lions = (Lions) obj;
        lions.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(1, lions.lion_count) + lions.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Lions lions = (Lions) obj;
        lions.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = lions.lion_count;
        byteString.getClass();
        return new Lions(l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Lions lions = (Lions) obj;
        lions.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, lions.lion_count);
        protoWriter.writeBytes(lions.unknownFields());
    }
}
