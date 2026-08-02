package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.SetCardCustomizationResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SetCardCustomizationResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetCardCustomizationResponse((ResponseContext) obj, (SetCardCustomizationResponse.Status) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj2 = SetCardCustomizationResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 6) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetCardCustomizationResponse setCardCustomizationResponse = (SetCardCustomizationResponse) obj;
        reverseProtoWriter.getClass();
        setCardCustomizationResponse.getClass();
        reverseProtoWriter.writeBytes(setCardCustomizationResponse.unknownFields());
        SetCardCustomizationResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setCardCustomizationResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 6, setCardCustomizationResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetCardCustomizationResponse setCardCustomizationResponse = (SetCardCustomizationResponse) obj;
        setCardCustomizationResponse.getClass();
        return SetCardCustomizationResponse.Status.ADAPTER.encodedSizeWithTag(1, setCardCustomizationResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(6, setCardCustomizationResponse.response_context) + setCardCustomizationResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetCardCustomizationResponse setCardCustomizationResponse = (SetCardCustomizationResponse) obj;
        setCardCustomizationResponse.getClass();
        ResponseContext responseContext = setCardCustomizationResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        SetCardCustomizationResponse.Status status = setCardCustomizationResponse.status;
        byteString.getClass();
        return new SetCardCustomizationResponse(responseContext2, status, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetCardCustomizationResponse setCardCustomizationResponse = (SetCardCustomizationResponse) obj;
        setCardCustomizationResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 6, setCardCustomizationResponse.response_context);
        SetCardCustomizationResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, setCardCustomizationResponse.status);
        protoWriter.writeBytes(setCardCustomizationResponse.unknownFields());
    }
}
