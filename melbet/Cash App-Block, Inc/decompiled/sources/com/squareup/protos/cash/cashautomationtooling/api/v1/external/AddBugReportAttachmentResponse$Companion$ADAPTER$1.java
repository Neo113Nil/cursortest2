package com.squareup.protos.cash.cashautomationtooling.api.v1.external;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AddBugReportAttachmentResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AddBugReportAttachmentResponse(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AddBugReportAttachmentResponse addBugReportAttachmentResponse = (AddBugReportAttachmentResponse) obj;
        reverseProtoWriter.getClass();
        addBugReportAttachmentResponse.getClass();
        reverseProtoWriter.writeBytes(addBugReportAttachmentResponse.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AddBugReportAttachmentResponse addBugReportAttachmentResponse = (AddBugReportAttachmentResponse) obj;
        addBugReportAttachmentResponse.getClass();
        return addBugReportAttachmentResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((AddBugReportAttachmentResponse) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AddBugReportAttachmentResponse(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AddBugReportAttachmentResponse addBugReportAttachmentResponse = (AddBugReportAttachmentResponse) obj;
        addBugReportAttachmentResponse.getClass();
        protoWriter.writeBytes(addBugReportAttachmentResponse.unknownFields());
    }
}
