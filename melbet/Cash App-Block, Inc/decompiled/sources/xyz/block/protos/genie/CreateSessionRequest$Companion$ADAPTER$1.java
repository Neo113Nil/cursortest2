package xyz.block.protos.genie;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.CreateSessionRequest;

/* loaded from: classes10.dex */
public final class CreateSessionRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreateSessionRequest((String) obj, (CreateSessionRequest.Platform) obj2, (String) obj3, (String) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = CreateSessionRequest.Platform.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreateSessionRequest createSessionRequest = (CreateSessionRequest) obj;
        reverseProtoWriter.getClass();
        createSessionRequest.getClass();
        reverseProtoWriter.writeBytes(createSessionRequest.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, createSessionRequest.proto_bundle_hash);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, createSessionRequest.app_version);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, createSessionRequest.app_identifier);
        CreateSessionRequest.Platform.ADAPTER.encodeWithTag(reverseProtoWriter, 2, createSessionRequest.platform);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, createSessionRequest.app_slug);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreateSessionRequest createSessionRequest = (CreateSessionRequest) obj;
        createSessionRequest.getClass();
        int size$okio = createSessionRequest.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, createSessionRequest.proto_bundle_hash) + protoAdapter.encodedSizeWithTag(4, createSessionRequest.app_version) + protoAdapter.encodedSizeWithTag(3, createSessionRequest.app_identifier) + CreateSessionRequest.Platform.ADAPTER.encodedSizeWithTag(2, createSessionRequest.platform) + protoAdapter.encodedSizeWithTag(1, createSessionRequest.app_slug) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateSessionRequest createSessionRequest = (CreateSessionRequest) obj;
        createSessionRequest.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = createSessionRequest.app_slug;
        CreateSessionRequest.Platform platform = createSessionRequest.platform;
        String str2 = createSessionRequest.app_identifier;
        String str3 = createSessionRequest.app_version;
        String str4 = createSessionRequest.proto_bundle_hash;
        byteString.getClass();
        return new CreateSessionRequest(str, platform, str2, str3, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateSessionRequest createSessionRequest = (CreateSessionRequest) obj;
        createSessionRequest.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, createSessionRequest.app_slug);
        CreateSessionRequest.Platform.ADAPTER.encodeWithTag(protoWriter, 2, createSessionRequest.platform);
        protoAdapter.encodeWithTag(protoWriter, 3, createSessionRequest.app_identifier);
        protoAdapter.encodeWithTag(protoWriter, 4, createSessionRequest.app_version);
        protoAdapter.encodeWithTag(protoWriter, 5, createSessionRequest.proto_bundle_hash);
        protoWriter.writeBytes(createSessionRequest.unknownFields());
    }
}
