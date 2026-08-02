package com.squareup.protos.cash.notificationsettings.api.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class UpdateCategoryNotificationSettingsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UpdateCategoryNotificationSettingsResponse((ResponseContext) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(FailedCategoryPreferenceUpdate.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UpdateCategoryNotificationSettingsResponse updateCategoryNotificationSettingsResponse = (UpdateCategoryNotificationSettingsResponse) obj;
        reverseProtoWriter.getClass();
        updateCategoryNotificationSettingsResponse.getClass();
        reverseProtoWriter.writeBytes(updateCategoryNotificationSettingsResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, updateCategoryNotificationSettingsResponse.response_context);
        FailedCategoryPreferenceUpdate.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, updateCategoryNotificationSettingsResponse.failed_updates);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UpdateCategoryNotificationSettingsResponse updateCategoryNotificationSettingsResponse = (UpdateCategoryNotificationSettingsResponse) obj;
        updateCategoryNotificationSettingsResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(2, updateCategoryNotificationSettingsResponse.response_context) + FailedCategoryPreferenceUpdate.ADAPTER.asRepeated().encodedSizeWithTag(1, updateCategoryNotificationSettingsResponse.failed_updates) + updateCategoryNotificationSettingsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UpdateCategoryNotificationSettingsResponse updateCategoryNotificationSettingsResponse = (UpdateCategoryNotificationSettingsResponse) obj;
        updateCategoryNotificationSettingsResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(updateCategoryNotificationSettingsResponse.failed_updates, FailedCategoryPreferenceUpdate.ADAPTER);
        ResponseContext responseContext = updateCategoryNotificationSettingsResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UpdateCategoryNotificationSettingsResponse(responseContext2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UpdateCategoryNotificationSettingsResponse updateCategoryNotificationSettingsResponse = (UpdateCategoryNotificationSettingsResponse) obj;
        updateCategoryNotificationSettingsResponse.getClass();
        FailedCategoryPreferenceUpdate.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, updateCategoryNotificationSettingsResponse.failed_updates);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 2, updateCategoryNotificationSettingsResponse.response_context);
        protoWriter.writeBytes(updateCategoryNotificationSettingsResponse.unknownFields());
    }
}
