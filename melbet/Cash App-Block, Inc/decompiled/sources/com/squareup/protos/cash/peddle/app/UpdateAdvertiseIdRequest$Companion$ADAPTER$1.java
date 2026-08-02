package com.squareup.protos.cash.peddle.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class UpdateAdvertiseIdRequest$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new UpdateAdvertiseIdRequest((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UpdateAdvertiseIdRequest updateAdvertiseIdRequest = (UpdateAdvertiseIdRequest) obj;
        reverseProtoWriter.getClass();
        updateAdvertiseIdRequest.getClass();
        reverseProtoWriter.writeBytes(updateAdvertiseIdRequest.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, updateAdvertiseIdRequest.apps_flyer_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, updateAdvertiseIdRequest.android_aaid);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, updateAdvertiseIdRequest.app_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UpdateAdvertiseIdRequest updateAdvertiseIdRequest = (UpdateAdvertiseIdRequest) obj;
        updateAdvertiseIdRequest.getClass();
        int size$okio = updateAdvertiseIdRequest.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, updateAdvertiseIdRequest.apps_flyer_id) + protoAdapter.encodedSizeWithTag(2, updateAdvertiseIdRequest.android_aaid) + protoAdapter.encodedSizeWithTag(1, updateAdvertiseIdRequest.app_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UpdateAdvertiseIdRequest updateAdvertiseIdRequest = (UpdateAdvertiseIdRequest) obj;
        updateAdvertiseIdRequest.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = updateAdvertiseIdRequest.app_token;
        String str2 = updateAdvertiseIdRequest.android_aaid;
        String str3 = updateAdvertiseIdRequest.apps_flyer_id;
        byteString.getClass();
        return new UpdateAdvertiseIdRequest(str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UpdateAdvertiseIdRequest updateAdvertiseIdRequest = (UpdateAdvertiseIdRequest) obj;
        updateAdvertiseIdRequest.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, updateAdvertiseIdRequest.app_token);
        protoAdapter.encodeWithTag(protoWriter, 2, updateAdvertiseIdRequest.android_aaid);
        protoAdapter.encodeWithTag(protoWriter, 4, updateAdvertiseIdRequest.apps_flyer_id);
        protoWriter.writeBytes(updateAdvertiseIdRequest.unknownFields());
    }
}
