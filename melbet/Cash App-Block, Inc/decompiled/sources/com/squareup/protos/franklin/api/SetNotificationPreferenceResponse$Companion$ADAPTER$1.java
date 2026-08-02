package com.squareup.protos.franklin.api;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.api.SetNotificationPreferenceResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SetNotificationPreferenceResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetNotificationPreferenceResponse((SetNotificationPreferenceResponse.Status) obj, (ResponseContext) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = SetNotificationPreferenceResponse.Status.ADAPTER.decode(protoReader);
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
        SetNotificationPreferenceResponse setNotificationPreferenceResponse = (SetNotificationPreferenceResponse) obj;
        reverseProtoWriter.getClass();
        setNotificationPreferenceResponse.getClass();
        reverseProtoWriter.writeBytes(setNotificationPreferenceResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, setNotificationPreferenceResponse.response_context);
        SetNotificationPreferenceResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setNotificationPreferenceResponse.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetNotificationPreferenceResponse setNotificationPreferenceResponse = (SetNotificationPreferenceResponse) obj;
        setNotificationPreferenceResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(2, setNotificationPreferenceResponse.response_context) + SetNotificationPreferenceResponse.Status.ADAPTER.encodedSizeWithTag(1, setNotificationPreferenceResponse.status) + setNotificationPreferenceResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetNotificationPreferenceResponse setNotificationPreferenceResponse = (SetNotificationPreferenceResponse) obj;
        setNotificationPreferenceResponse.getClass();
        ResponseContext responseContext = setNotificationPreferenceResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        SetNotificationPreferenceResponse.Status status = setNotificationPreferenceResponse.status;
        byteString.getClass();
        return new SetNotificationPreferenceResponse(status, responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetNotificationPreferenceResponse setNotificationPreferenceResponse = (SetNotificationPreferenceResponse) obj;
        setNotificationPreferenceResponse.getClass();
        SetNotificationPreferenceResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, setNotificationPreferenceResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 2, setNotificationPreferenceResponse.response_context);
        protoWriter.writeBytes(setNotificationPreferenceResponse.unknownFields());
    }
}
