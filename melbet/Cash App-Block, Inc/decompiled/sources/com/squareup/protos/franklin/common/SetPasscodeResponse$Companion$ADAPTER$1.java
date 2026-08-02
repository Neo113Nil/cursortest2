package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.SetPasscodeResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SetPasscodeResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SetPasscodeResponse((ResponseContext) obj, (SetPasscodeResponse.Status) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj2 = SetPasscodeResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 10) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetPasscodeResponse setPasscodeResponse = (SetPasscodeResponse) obj;
        reverseProtoWriter.getClass();
        setPasscodeResponse.getClass();
        reverseProtoWriter.writeBytes(setPasscodeResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, setPasscodeResponse.passcode_token);
        SetPasscodeResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setPasscodeResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 10, setPasscodeResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetPasscodeResponse setPasscodeResponse = (SetPasscodeResponse) obj;
        setPasscodeResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(3, setPasscodeResponse.passcode_token) + SetPasscodeResponse.Status.ADAPTER.encodedSizeWithTag(1, setPasscodeResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(10, setPasscodeResponse.response_context) + setPasscodeResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetPasscodeResponse setPasscodeResponse = (SetPasscodeResponse) obj;
        setPasscodeResponse.getClass();
        ResponseContext responseContext = setPasscodeResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        SetPasscodeResponse.Status status = setPasscodeResponse.status;
        byteString.getClass();
        return new SetPasscodeResponse(responseContext2, status, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetPasscodeResponse setPasscodeResponse = (SetPasscodeResponse) obj;
        setPasscodeResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 10, setPasscodeResponse.response_context);
        SetPasscodeResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, setPasscodeResponse.status);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, setPasscodeResponse.passcode_token);
        protoWriter.writeBytes(setPasscodeResponse.unknownFields());
    }
}
