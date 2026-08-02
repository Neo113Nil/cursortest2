package com.squareup.protos.cash.unicorn.dismiss_badge;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class DismissBadgeResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DismissBadgeResponse(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DismissBadgeResponse dismissBadgeResponse = (DismissBadgeResponse) obj;
        reverseProtoWriter.getClass();
        dismissBadgeResponse.getClass();
        reverseProtoWriter.writeBytes(dismissBadgeResponse.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DismissBadgeResponse dismissBadgeResponse = (DismissBadgeResponse) obj;
        dismissBadgeResponse.getClass();
        return dismissBadgeResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((DismissBadgeResponse) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new DismissBadgeResponse(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DismissBadgeResponse dismissBadgeResponse = (DismissBadgeResponse) obj;
        dismissBadgeResponse.getClass();
        protoWriter.writeBytes(dismissBadgeResponse.unknownFields());
    }
}
