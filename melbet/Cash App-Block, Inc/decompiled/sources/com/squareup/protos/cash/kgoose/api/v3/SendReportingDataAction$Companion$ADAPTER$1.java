package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/SendReportingDataAction$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/SendReportingDataAction;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SendReportingDataAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SendReportingDataAction((String) obj, (ScheduledReportEmailPolicy) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(ScheduledReportEmailPolicy.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SendReportingDataAction sendReportingDataAction = (SendReportingDataAction) obj;
        reverseProtoWriter.getClass();
        sendReportingDataAction.getClass();
        reverseProtoWriter.writeBytes(sendReportingDataAction.unknownFields());
        ScheduledReportEmailPolicy.ADAPTER.encodeWithTag(reverseProtoWriter, 2, sendReportingDataAction.email_report_policy);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, sendReportingDataAction.saved_report_uuid);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SendReportingDataAction sendReportingDataAction = (SendReportingDataAction) obj;
        sendReportingDataAction.getClass();
        return ScheduledReportEmailPolicy.ADAPTER.encodedSizeWithTag(2, sendReportingDataAction.email_report_policy) + ProtoAdapter.STRING.encodedSizeWithTag(1, sendReportingDataAction.saved_report_uuid) + sendReportingDataAction.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SendReportingDataAction sendReportingDataAction = (SendReportingDataAction) obj;
        sendReportingDataAction.getClass();
        ScheduledReportEmailPolicy scheduledReportEmailPolicy = sendReportingDataAction.email_report_policy;
        ScheduledReportEmailPolicy scheduledReportEmailPolicy2 = scheduledReportEmailPolicy != null ? (ScheduledReportEmailPolicy) ScheduledReportEmailPolicy.ADAPTER.redact(scheduledReportEmailPolicy) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = sendReportingDataAction.saved_report_uuid;
        byteString.getClass();
        return new SendReportingDataAction(str, scheduledReportEmailPolicy2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SendReportingDataAction sendReportingDataAction = (SendReportingDataAction) obj;
        sendReportingDataAction.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sendReportingDataAction.saved_report_uuid);
        ScheduledReportEmailPolicy.ADAPTER.encodeWithTag(protoWriter, 2, sendReportingDataAction.email_report_policy);
        protoWriter.writeBytes(sendReportingDataAction.unknownFields());
    }
}
