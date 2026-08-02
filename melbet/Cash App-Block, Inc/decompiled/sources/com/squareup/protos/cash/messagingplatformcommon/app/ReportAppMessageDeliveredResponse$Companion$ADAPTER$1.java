package com.squareup.protos.cash.messagingplatformcommon.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ReportAppMessageDeliveredResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ReportAppMessageDeliveredResponse(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ReportAppMessageDeliveredResponse reportAppMessageDeliveredResponse = (ReportAppMessageDeliveredResponse) obj;
        reverseProtoWriter.getClass();
        reportAppMessageDeliveredResponse.getClass();
        reverseProtoWriter.writeBytes(reportAppMessageDeliveredResponse.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ReportAppMessageDeliveredResponse reportAppMessageDeliveredResponse = (ReportAppMessageDeliveredResponse) obj;
        reportAppMessageDeliveredResponse.getClass();
        return reportAppMessageDeliveredResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((ReportAppMessageDeliveredResponse) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ReportAppMessageDeliveredResponse(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ReportAppMessageDeliveredResponse reportAppMessageDeliveredResponse = (ReportAppMessageDeliveredResponse) obj;
        reportAppMessageDeliveredResponse.getClass();
        protoWriter.writeBytes(reportAppMessageDeliveredResponse.unknownFields());
    }
}
