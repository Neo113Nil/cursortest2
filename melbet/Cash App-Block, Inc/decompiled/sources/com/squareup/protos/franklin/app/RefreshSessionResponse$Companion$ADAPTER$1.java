package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.RefreshSessionResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class RefreshSessionResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RefreshSessionResponse((RefreshSessionResponse.Status) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (String) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = RefreshSessionResponse.Status.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RefreshSessionResponse refreshSessionResponse = (RefreshSessionResponse) obj;
        reverseProtoWriter.getClass();
        refreshSessionResponse.getClass();
        reverseProtoWriter.writeBytes(refreshSessionResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, refreshSessionResponse.app_attest_challenge);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, refreshSessionResponse.play_integrity_nonce);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, refreshSessionResponse.safety_net_api_key);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, refreshSessionResponse.safety_net_nonce);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, refreshSessionResponse.backup_tag);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, refreshSessionResponse.session_token);
        RefreshSessionResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, refreshSessionResponse.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RefreshSessionResponse refreshSessionResponse = (RefreshSessionResponse) obj;
        refreshSessionResponse.getClass();
        int encodedSizeWithTag = RefreshSessionResponse.Status.ADAPTER.encodedSizeWithTag(1, refreshSessionResponse.status) + refreshSessionResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(7, refreshSessionResponse.app_attest_challenge) + protoAdapter.encodedSizeWithTag(6, refreshSessionResponse.play_integrity_nonce) + protoAdapter.encodedSizeWithTag(5, refreshSessionResponse.safety_net_api_key) + protoAdapter.encodedSizeWithTag(4, refreshSessionResponse.safety_net_nonce) + protoAdapter.encodedSizeWithTag(3, refreshSessionResponse.backup_tag) + protoAdapter.encodedSizeWithTag(2, refreshSessionResponse.session_token) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RefreshSessionResponse refreshSessionResponse = (RefreshSessionResponse) obj;
        refreshSessionResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        RefreshSessionResponse.Status status = refreshSessionResponse.status;
        byteString.getClass();
        return new RefreshSessionResponse(status, null, null, null, null, null, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RefreshSessionResponse refreshSessionResponse = (RefreshSessionResponse) obj;
        refreshSessionResponse.getClass();
        RefreshSessionResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, refreshSessionResponse.status);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, refreshSessionResponse.session_token);
        protoAdapter.encodeWithTag(protoWriter, 3, refreshSessionResponse.backup_tag);
        protoAdapter.encodeWithTag(protoWriter, 4, refreshSessionResponse.safety_net_nonce);
        protoAdapter.encodeWithTag(protoWriter, 5, refreshSessionResponse.safety_net_api_key);
        protoAdapter.encodeWithTag(protoWriter, 6, refreshSessionResponse.play_integrity_nonce);
        protoAdapter.encodeWithTag(protoWriter, 7, refreshSessionResponse.app_attest_challenge);
        protoWriter.writeBytes(refreshSessionResponse.unknownFields());
    }
}
