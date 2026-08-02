package com.squareup.protos.cash.blockly.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.blockly.api.ReportAbuseResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ReportAbuseResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ReportAbuseResponse((ResponseContext) obj, (ReportAbuseResponse.Status) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = ReportAbuseResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ReportAbuseResponse reportAbuseResponse = (ReportAbuseResponse) obj;
        reverseProtoWriter.getClass();
        reportAbuseResponse.getClass();
        reverseProtoWriter.writeBytes(reportAbuseResponse.unknownFields());
        ReportAbuseResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 2, reportAbuseResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, reportAbuseResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ReportAbuseResponse reportAbuseResponse = (ReportAbuseResponse) obj;
        reportAbuseResponse.getClass();
        return ReportAbuseResponse.Status.ADAPTER.encodedSizeWithTag(2, reportAbuseResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(1, reportAbuseResponse.response_context) + reportAbuseResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ReportAbuseResponse reportAbuseResponse = (ReportAbuseResponse) obj;
        reportAbuseResponse.getClass();
        ResponseContext responseContext = reportAbuseResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        ReportAbuseResponse.Status status = reportAbuseResponse.status;
        byteString.getClass();
        return new ReportAbuseResponse(responseContext2, status, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ReportAbuseResponse reportAbuseResponse = (ReportAbuseResponse) obj;
        reportAbuseResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, reportAbuseResponse.response_context);
        ReportAbuseResponse.Status.ADAPTER.encodeWithTag(protoWriter, 2, reportAbuseResponse.status);
        protoWriter.writeBytes(reportAbuseResponse.unknownFields());
    }
}
