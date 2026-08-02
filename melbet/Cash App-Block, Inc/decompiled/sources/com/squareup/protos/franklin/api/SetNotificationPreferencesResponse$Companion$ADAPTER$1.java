package com.squareup.protos.franklin.api;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.api.SetNotificationPreferencesResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SetNotificationPreferencesResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetNotificationPreferencesResponse((SetNotificationPreferencesResponse.Status) obj, (ResponseContext) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = SetNotificationPreferencesResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetNotificationPreferencesResponse setNotificationPreferencesResponse = (SetNotificationPreferencesResponse) obj;
        reverseProtoWriter.getClass();
        setNotificationPreferencesResponse.getClass();
        reverseProtoWriter.writeBytes(setNotificationPreferencesResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, setNotificationPreferencesResponse.response_context);
        SetNotificationPreferencesResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setNotificationPreferencesResponse.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetNotificationPreferencesResponse setNotificationPreferencesResponse = (SetNotificationPreferencesResponse) obj;
        setNotificationPreferencesResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(2, setNotificationPreferencesResponse.response_context) + SetNotificationPreferencesResponse.Status.ADAPTER.encodedSizeWithTag(1, setNotificationPreferencesResponse.status) + setNotificationPreferencesResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetNotificationPreferencesResponse setNotificationPreferencesResponse = (SetNotificationPreferencesResponse) obj;
        setNotificationPreferencesResponse.getClass();
        ResponseContext responseContext = setNotificationPreferencesResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        SetNotificationPreferencesResponse.Status status = setNotificationPreferencesResponse.status;
        byteString.getClass();
        return new SetNotificationPreferencesResponse(status, responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetNotificationPreferencesResponse setNotificationPreferencesResponse = (SetNotificationPreferencesResponse) obj;
        setNotificationPreferencesResponse.getClass();
        SetNotificationPreferencesResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, setNotificationPreferencesResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 2, setNotificationPreferencesResponse.response_context);
        protoWriter.writeBytes(setNotificationPreferencesResponse.unknownFields());
    }
}
