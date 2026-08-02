package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.SetOrderLiveActivityTokenResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SetOrderLiveActivityTokenResponse$Success$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetOrderLiveActivityTokenResponse.Success(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetOrderLiveActivityTokenResponse.Success success = (SetOrderLiveActivityTokenResponse.Success) obj;
        reverseProtoWriter.getClass();
        success.getClass();
        reverseProtoWriter.writeBytes(success.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetOrderLiveActivityTokenResponse.Success success = (SetOrderLiveActivityTokenResponse.Success) obj;
        success.getClass();
        return success.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((SetOrderLiveActivityTokenResponse.Success) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SetOrderLiveActivityTokenResponse.Success(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetOrderLiveActivityTokenResponse.Success success = (SetOrderLiveActivityTokenResponse.Success) obj;
        success.getClass();
        protoWriter.writeBytes(success.unknownFields());
    }
}
