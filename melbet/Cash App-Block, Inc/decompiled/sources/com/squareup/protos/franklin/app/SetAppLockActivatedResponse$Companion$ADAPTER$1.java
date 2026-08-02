package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.SetAppLockActivatedResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SetAppLockActivatedResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetAppLockActivatedResponse((ResponseContext) obj, (SetAppLockActivatedResponse.Status) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                try {
                    obj2 = SetAppLockActivatedResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetAppLockActivatedResponse setAppLockActivatedResponse = (SetAppLockActivatedResponse) obj;
        reverseProtoWriter.getClass();
        setAppLockActivatedResponse.getClass();
        reverseProtoWriter.writeBytes(setAppLockActivatedResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, setAppLockActivatedResponse.passcode_token);
        SetAppLockActivatedResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 2, setAppLockActivatedResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setAppLockActivatedResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetAppLockActivatedResponse setAppLockActivatedResponse = (SetAppLockActivatedResponse) obj;
        setAppLockActivatedResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(3, setAppLockActivatedResponse.passcode_token) + SetAppLockActivatedResponse.Status.ADAPTER.encodedSizeWithTag(2, setAppLockActivatedResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(1, setAppLockActivatedResponse.response_context) + setAppLockActivatedResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetAppLockActivatedResponse setAppLockActivatedResponse = (SetAppLockActivatedResponse) obj;
        setAppLockActivatedResponse.getClass();
        ResponseContext responseContext = setAppLockActivatedResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        SetAppLockActivatedResponse.Status status = setAppLockActivatedResponse.status;
        byteString.getClass();
        return new SetAppLockActivatedResponse(responseContext2, status, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetAppLockActivatedResponse setAppLockActivatedResponse = (SetAppLockActivatedResponse) obj;
        setAppLockActivatedResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, setAppLockActivatedResponse.response_context);
        SetAppLockActivatedResponse.Status.ADAPTER.encodeWithTag(protoWriter, 2, setAppLockActivatedResponse.status);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, setAppLockActivatedResponse.passcode_token);
        protoWriter.writeBytes(setAppLockActivatedResponse.unknownFields());
    }
}
