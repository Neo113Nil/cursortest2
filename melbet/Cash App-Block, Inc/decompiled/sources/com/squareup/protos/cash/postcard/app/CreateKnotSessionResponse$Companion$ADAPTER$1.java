package com.squareup.protos.cash.postcard.app;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreateKnotSessionResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CreateKnotSessionResponse((String) obj, (KnotSdkConfig) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(KnotSdkConfig.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreateKnotSessionResponse createKnotSessionResponse = (CreateKnotSessionResponse) obj;
        reverseProtoWriter.getClass();
        createKnotSessionResponse.getClass();
        reverseProtoWriter.writeBytes(createKnotSessionResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, createKnotSessionResponse.client_id);
        KnotSdkConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 2, createKnotSessionResponse.sdk_config);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, createKnotSessionResponse.session_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreateKnotSessionResponse createKnotSessionResponse = (CreateKnotSessionResponse) obj;
        createKnotSessionResponse.getClass();
        int size$okio = createKnotSessionResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, createKnotSessionResponse.client_id) + KnotSdkConfig.ADAPTER.encodedSizeWithTag(2, createKnotSessionResponse.sdk_config) + protoAdapter.encodedSizeWithTag(1, createKnotSessionResponse.session_id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateKnotSessionResponse createKnotSessionResponse = (CreateKnotSessionResponse) obj;
        createKnotSessionResponse.getClass();
        KnotSdkConfig knotSdkConfig = createKnotSessionResponse.sdk_config;
        KnotSdkConfig knotSdkConfig2 = knotSdkConfig != null ? (KnotSdkConfig) KnotSdkConfig.ADAPTER.redact(knotSdkConfig) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = createKnotSessionResponse.session_id;
        String str2 = createKnotSessionResponse.client_id;
        byteString.getClass();
        return new CreateKnotSessionResponse(str, knotSdkConfig2, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateKnotSessionResponse createKnotSessionResponse = (CreateKnotSessionResponse) obj;
        createKnotSessionResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, createKnotSessionResponse.session_id);
        KnotSdkConfig.ADAPTER.encodeWithTag(protoWriter, 2, createKnotSessionResponse.sdk_config);
        protoAdapter.encodeWithTag(protoWriter, 3, createKnotSessionResponse.client_id);
        protoWriter.writeBytes(createKnotSessionResponse.unknownFields());
    }
}
