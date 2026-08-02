package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class StatusResult$SupportAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new StatusResult.SupportAction((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StatusResult.SupportAction supportAction = (StatusResult.SupportAction) obj;
        reverseProtoWriter.getClass();
        supportAction.getClass();
        reverseProtoWriter.writeBytes(supportAction.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, supportAction.entity_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, supportAction.support_flow_node);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StatusResult.SupportAction supportAction = (StatusResult.SupportAction) obj;
        supportAction.getClass();
        int size$okio = supportAction.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, supportAction.entity_id) + protoAdapter.encodedSizeWithTag(1, supportAction.support_flow_node) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StatusResult.SupportAction supportAction = (StatusResult.SupportAction) obj;
        supportAction.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = supportAction.support_flow_node;
        String str2 = supportAction.entity_id;
        byteString.getClass();
        return new StatusResult.SupportAction(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StatusResult.SupportAction supportAction = (StatusResult.SupportAction) obj;
        supportAction.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, supportAction.support_flow_node);
        protoAdapter.encodeWithTag(protoWriter, 2, supportAction.entity_id);
        protoWriter.writeBytes(supportAction.unknownFields());
    }
}
