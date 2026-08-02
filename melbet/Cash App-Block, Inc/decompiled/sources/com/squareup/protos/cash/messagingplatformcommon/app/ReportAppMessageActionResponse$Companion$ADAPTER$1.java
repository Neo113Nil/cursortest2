package com.squareup.protos.cash.messagingplatformcommon.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ReportAppMessageActionResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ReportAppMessageActionResponse(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ReportAppMessageActionResponse reportAppMessageActionResponse = (ReportAppMessageActionResponse) obj;
        reverseProtoWriter.getClass();
        reportAppMessageActionResponse.getClass();
        reverseProtoWriter.writeBytes(reportAppMessageActionResponse.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ReportAppMessageActionResponse reportAppMessageActionResponse = (ReportAppMessageActionResponse) obj;
        reportAppMessageActionResponse.getClass();
        return reportAppMessageActionResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((ReportAppMessageActionResponse) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ReportAppMessageActionResponse(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ReportAppMessageActionResponse reportAppMessageActionResponse = (ReportAppMessageActionResponse) obj;
        reportAppMessageActionResponse.getClass();
        protoWriter.writeBytes(reportAppMessageActionResponse.unknownFields());
    }
}
