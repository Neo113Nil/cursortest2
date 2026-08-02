package com.squareup.protos.cash.cashface.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ActivityClassic$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ActivityClassic(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActivityClassic activityClassic = (ActivityClassic) obj;
        reverseProtoWriter.getClass();
        activityClassic.getClass();
        reverseProtoWriter.writeBytes(activityClassic.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ActivityClassic activityClassic = (ActivityClassic) obj;
        activityClassic.getClass();
        return activityClassic.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((ActivityClassic) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ActivityClassic(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActivityClassic activityClassic = (ActivityClassic) obj;
        activityClassic.getClass();
        protoWriter.writeBytes(activityClassic.unknownFields());
    }
}
