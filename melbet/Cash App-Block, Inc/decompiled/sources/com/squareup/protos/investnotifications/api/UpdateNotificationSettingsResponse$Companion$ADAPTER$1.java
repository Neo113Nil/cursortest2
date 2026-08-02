package com.squareup.protos.investnotifications.api;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UpdateNotificationSettingsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UpdateNotificationSettingsResponse((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UpdateNotificationSettingsResponse updateNotificationSettingsResponse = (UpdateNotificationSettingsResponse) obj;
        reverseProtoWriter.getClass();
        updateNotificationSettingsResponse.getClass();
        reverseProtoWriter.writeBytes(updateNotificationSettingsResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, updateNotificationSettingsResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UpdateNotificationSettingsResponse updateNotificationSettingsResponse = (UpdateNotificationSettingsResponse) obj;
        updateNotificationSettingsResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(1, updateNotificationSettingsResponse.response_context) + updateNotificationSettingsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UpdateNotificationSettingsResponse updateNotificationSettingsResponse = (UpdateNotificationSettingsResponse) obj;
        updateNotificationSettingsResponse.getClass();
        ResponseContext responseContext = updateNotificationSettingsResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UpdateNotificationSettingsResponse(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UpdateNotificationSettingsResponse updateNotificationSettingsResponse = (UpdateNotificationSettingsResponse) obj;
        updateNotificationSettingsResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, updateNotificationSettingsResponse.response_context);
        protoWriter.writeBytes(updateNotificationSettingsResponse.unknownFields());
    }
}
