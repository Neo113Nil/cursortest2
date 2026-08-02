package com.squareup.protos.cash.local.common.values;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalCash$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        Long l = (Long) obj;
        if (l != null) {
            return new LocalCash(l.longValue(), endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "amount");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalCash localCash = (LocalCash) obj;
        reverseProtoWriter.getClass();
        localCash.getClass();
        reverseProtoWriter.writeBytes(localCash.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, Long.valueOf(localCash.amount));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalCash localCash = (LocalCash) obj;
        localCash.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(localCash.amount)) + localCash.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalCash localCash = (LocalCash) obj;
        localCash.getClass();
        ByteString byteString = ByteString.EMPTY;
        long j = localCash.amount;
        byteString.getClass();
        return new LocalCash(j, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalCash localCash = (LocalCash) obj;
        localCash.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, Long.valueOf(localCash.amount));
        protoWriter.writeBytes(localCash.unknownFields());
    }
}
