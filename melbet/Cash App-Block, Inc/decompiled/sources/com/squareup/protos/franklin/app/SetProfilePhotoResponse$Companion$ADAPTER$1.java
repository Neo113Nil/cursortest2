package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.SetProfilePhotoResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SetProfilePhotoResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SetProfilePhotoResponse((SetProfilePhotoResponse.Status) obj, (String) obj2, (ResponseContext) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = SetProfilePhotoResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetProfilePhotoResponse setProfilePhotoResponse = (SetProfilePhotoResponse) obj;
        reverseProtoWriter.getClass();
        setProfilePhotoResponse.getClass();
        reverseProtoWriter.writeBytes(setProfilePhotoResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, setProfilePhotoResponse.response_context);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, setProfilePhotoResponse.image_url);
        SetProfilePhotoResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setProfilePhotoResponse.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetProfilePhotoResponse setProfilePhotoResponse = (SetProfilePhotoResponse) obj;
        setProfilePhotoResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(3, setProfilePhotoResponse.response_context) + ProtoAdapter.STRING.encodedSizeWithTag(2, setProfilePhotoResponse.image_url) + SetProfilePhotoResponse.Status.ADAPTER.encodedSizeWithTag(1, setProfilePhotoResponse.status) + setProfilePhotoResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetProfilePhotoResponse setProfilePhotoResponse = (SetProfilePhotoResponse) obj;
        setProfilePhotoResponse.getClass();
        ResponseContext responseContext = setProfilePhotoResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        SetProfilePhotoResponse.Status status = setProfilePhotoResponse.status;
        String str = setProfilePhotoResponse.image_url;
        byteString.getClass();
        return new SetProfilePhotoResponse(status, str, responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetProfilePhotoResponse setProfilePhotoResponse = (SetProfilePhotoResponse) obj;
        setProfilePhotoResponse.getClass();
        SetProfilePhotoResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, setProfilePhotoResponse.status);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, setProfilePhotoResponse.image_url);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 3, setProfilePhotoResponse.response_context);
        protoWriter.writeBytes(setProfilePhotoResponse.unknownFields());
    }
}
