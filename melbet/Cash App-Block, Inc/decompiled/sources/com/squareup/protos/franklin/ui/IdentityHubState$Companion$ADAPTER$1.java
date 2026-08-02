package com.squareup.protos.franklin.ui;

import com.squareup.protos.franklin.ui.IdentityHubState;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class IdentityHubState$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new IdentityHubState((IdentityHubState.EntrypointStatus) obj, (Boolean) obj2, (Long) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = IdentityHubState.EntrypointStatus.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        IdentityHubState identityHubState = (IdentityHubState) obj;
        reverseProtoWriter.getClass();
        identityHubState.getClass();
        reverseProtoWriter.writeBytes(identityHubState.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 3, identityHubState.version);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, identityHubState.should_show_badge);
        IdentityHubState.EntrypointStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 1, identityHubState.entrypoint_status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        IdentityHubState identityHubState = (IdentityHubState) obj;
        identityHubState.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(3, identityHubState.version) + ProtoAdapter.BOOL.encodedSizeWithTag(2, identityHubState.should_show_badge) + IdentityHubState.EntrypointStatus.ADAPTER.encodedSizeWithTag(1, identityHubState.entrypoint_status) + identityHubState.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        IdentityHubState identityHubState = (IdentityHubState) obj;
        identityHubState.getClass();
        ByteString byteString = ByteString.EMPTY;
        IdentityHubState.EntrypointStatus entrypointStatus = identityHubState.entrypoint_status;
        Boolean bool = identityHubState.should_show_badge;
        Long l = identityHubState.version;
        byteString.getClass();
        return new IdentityHubState(entrypointStatus, bool, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        IdentityHubState identityHubState = (IdentityHubState) obj;
        identityHubState.getClass();
        IdentityHubState.EntrypointStatus.ADAPTER.encodeWithTag(protoWriter, 1, identityHubState.entrypoint_status);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, identityHubState.should_show_badge);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, identityHubState.version);
        protoWriter.writeBytes(identityHubState.unknownFields());
    }
}
