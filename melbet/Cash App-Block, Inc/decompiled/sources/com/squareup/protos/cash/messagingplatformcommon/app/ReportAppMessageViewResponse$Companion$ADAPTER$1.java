package com.squareup.protos.cash.messagingplatformcommon.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ReportAppMessageViewResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ReportAppMessageViewResponse(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ReportAppMessageViewResponse reportAppMessageViewResponse = (ReportAppMessageViewResponse) obj;
        reverseProtoWriter.getClass();
        reportAppMessageViewResponse.getClass();
        reverseProtoWriter.writeBytes(reportAppMessageViewResponse.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ReportAppMessageViewResponse reportAppMessageViewResponse = (ReportAppMessageViewResponse) obj;
        reportAppMessageViewResponse.getClass();
        return reportAppMessageViewResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((ReportAppMessageViewResponse) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ReportAppMessageViewResponse(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ReportAppMessageViewResponse reportAppMessageViewResponse = (ReportAppMessageViewResponse) obj;
        reportAppMessageViewResponse.getClass();
        protoWriter.writeBytes(reportAppMessageViewResponse.unknownFields());
    }
}
