package com.squareup.protos.cash.p2p.profile_directory.ui;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Range$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        Integer num = (Integer) obj;
        if (num == null) {
            TransactorKt.missingRequiredFields(obj, "start");
            throw null;
        }
        int intValue = num.intValue();
        Integer num2 = (Integer) obj2;
        if (num2 != null) {
            return new Range(intValue, num2.intValue(), endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj2, "end");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Range range = (Range) obj;
        reverseProtoWriter.getClass();
        range.getClass();
        reverseProtoWriter.writeBytes(range.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, Integer.valueOf(range.end));
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, Integer.valueOf(range.start));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Range range = (Range) obj;
        range.getClass();
        int size$okio = range.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        return protoAdapter.encodedSizeWithTag(2, Integer.valueOf(range.end)) + protoAdapter.encodedSizeWithTag(1, Integer.valueOf(range.start)) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Range range = (Range) obj;
        range.getClass();
        ByteString byteString = ByteString.EMPTY;
        int i = range.start;
        int i2 = range.end;
        byteString.getClass();
        return new Range(i, i2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Range range = (Range) obj;
        range.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, Integer.valueOf(range.start));
        protoAdapter.encodeWithTag(protoWriter, 2, Integer.valueOf(range.end));
        protoWriter.writeBytes(range.unknownFields());
    }
}
