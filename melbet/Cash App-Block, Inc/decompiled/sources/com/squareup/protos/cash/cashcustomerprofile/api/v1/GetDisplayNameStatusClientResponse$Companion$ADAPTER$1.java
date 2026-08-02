package com.squareup.protos.cash.cashcustomerprofile.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetDisplayNameStatusClientResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetDisplayNameStatusClientResponse((Long) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        GetDisplayNameStatusClientResponse getDisplayNameStatusClientResponse = (GetDisplayNameStatusClientResponse) obj;
        reverseProtoWriter.getClass();
        getDisplayNameStatusClientResponse.getClass();
        reverseProtoWriter.writeBytes(getDisplayNameStatusClientResponse.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, getDisplayNameStatusClientResponse.remaining_limit);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetDisplayNameStatusClientResponse getDisplayNameStatusClientResponse = (GetDisplayNameStatusClientResponse) obj;
        getDisplayNameStatusClientResponse.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(1, getDisplayNameStatusClientResponse.remaining_limit) + getDisplayNameStatusClientResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetDisplayNameStatusClientResponse getDisplayNameStatusClientResponse = (GetDisplayNameStatusClientResponse) obj;
        getDisplayNameStatusClientResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = getDisplayNameStatusClientResponse.remaining_limit;
        byteString.getClass();
        return new GetDisplayNameStatusClientResponse(l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetDisplayNameStatusClientResponse getDisplayNameStatusClientResponse = (GetDisplayNameStatusClientResponse) obj;
        getDisplayNameStatusClientResponse.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getDisplayNameStatusClientResponse.remaining_limit);
        protoWriter.writeBytes(getDisplayNameStatusClientResponse.unknownFields());
    }
}
