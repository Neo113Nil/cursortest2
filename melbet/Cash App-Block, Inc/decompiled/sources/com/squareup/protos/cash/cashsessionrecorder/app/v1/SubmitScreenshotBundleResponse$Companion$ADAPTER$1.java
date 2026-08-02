package com.squareup.protos.cash.cashsessionrecorder.app.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SubmitScreenshotBundleResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SubmitScreenshotBundleResponse(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SubmitScreenshotBundleResponse submitScreenshotBundleResponse = (SubmitScreenshotBundleResponse) obj;
        reverseProtoWriter.getClass();
        submitScreenshotBundleResponse.getClass();
        reverseProtoWriter.writeBytes(submitScreenshotBundleResponse.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SubmitScreenshotBundleResponse submitScreenshotBundleResponse = (SubmitScreenshotBundleResponse) obj;
        submitScreenshotBundleResponse.getClass();
        return submitScreenshotBundleResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((SubmitScreenshotBundleResponse) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SubmitScreenshotBundleResponse(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubmitScreenshotBundleResponse submitScreenshotBundleResponse = (SubmitScreenshotBundleResponse) obj;
        submitScreenshotBundleResponse.getClass();
        protoWriter.writeBytes(submitScreenshotBundleResponse.unknownFields());
    }
}
