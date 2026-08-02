package com.squareup.protos.cash.local.client.app.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ReportPresenceResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ReportPresenceResponse(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ReportPresenceResponse reportPresenceResponse = (ReportPresenceResponse) obj;
        reverseProtoWriter.getClass();
        reportPresenceResponse.getClass();
        reverseProtoWriter.writeBytes(reportPresenceResponse.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ReportPresenceResponse reportPresenceResponse = (ReportPresenceResponse) obj;
        reportPresenceResponse.getClass();
        return reportPresenceResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((ReportPresenceResponse) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ReportPresenceResponse(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ReportPresenceResponse reportPresenceResponse = (ReportPresenceResponse) obj;
        reportPresenceResponse.getClass();
        protoWriter.writeBytes(reportPresenceResponse.unknownFields());
    }
}
