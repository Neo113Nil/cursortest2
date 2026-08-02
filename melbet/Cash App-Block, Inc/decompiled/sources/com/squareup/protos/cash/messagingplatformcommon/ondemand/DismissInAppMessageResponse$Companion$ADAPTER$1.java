package com.squareup.protos.cash.messagingplatformcommon.ondemand;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DismissInAppMessageResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DismissInAppMessageResponse(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DismissInAppMessageResponse dismissInAppMessageResponse = (DismissInAppMessageResponse) obj;
        reverseProtoWriter.getClass();
        dismissInAppMessageResponse.getClass();
        reverseProtoWriter.writeBytes(dismissInAppMessageResponse.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DismissInAppMessageResponse dismissInAppMessageResponse = (DismissInAppMessageResponse) obj;
        dismissInAppMessageResponse.getClass();
        return dismissInAppMessageResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((DismissInAppMessageResponse) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new DismissInAppMessageResponse(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DismissInAppMessageResponse dismissInAppMessageResponse = (DismissInAppMessageResponse) obj;
        dismissInAppMessageResponse.getClass();
        protoWriter.writeBytes(dismissInAppMessageResponse.unknownFields());
    }
}
