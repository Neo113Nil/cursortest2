package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ClientCardUpdateActivity$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientCardUpdateActivity;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ClientCardUpdateActivity$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ClientCardUpdateActivity((String) obj, (String) obj2, (ClientCardUpdateStatus) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = ClientCardUpdateStatus.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ClientCardUpdateActivity clientCardUpdateActivity = (ClientCardUpdateActivity) obj;
        reverseProtoWriter.getClass();
        clientCardUpdateActivity.getClass();
        reverseProtoWriter.writeBytes(clientCardUpdateActivity.unknownFields());
        ClientCardUpdateStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 3, clientCardUpdateActivity.status);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, clientCardUpdateActivity.summary);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, clientCardUpdateActivity.tool_request_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ClientCardUpdateActivity clientCardUpdateActivity = (ClientCardUpdateActivity) obj;
        clientCardUpdateActivity.getClass();
        int size$okio = clientCardUpdateActivity.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ClientCardUpdateStatus.ADAPTER.encodedSizeWithTag(3, clientCardUpdateActivity.status) + protoAdapter.encodedSizeWithTag(2, clientCardUpdateActivity.summary) + protoAdapter.encodedSizeWithTag(1, clientCardUpdateActivity.tool_request_id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ClientCardUpdateActivity clientCardUpdateActivity = (ClientCardUpdateActivity) obj;
        clientCardUpdateActivity.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = clientCardUpdateActivity.tool_request_id;
        String str2 = clientCardUpdateActivity.summary;
        ClientCardUpdateStatus clientCardUpdateStatus = clientCardUpdateActivity.status;
        byteString.getClass();
        return new ClientCardUpdateActivity(str, str2, clientCardUpdateStatus, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ClientCardUpdateActivity clientCardUpdateActivity = (ClientCardUpdateActivity) obj;
        clientCardUpdateActivity.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, clientCardUpdateActivity.tool_request_id);
        protoAdapter.encodeWithTag(protoWriter, 2, clientCardUpdateActivity.summary);
        ClientCardUpdateStatus.ADAPTER.encodeWithTag(protoWriter, 3, clientCardUpdateActivity.status);
        protoWriter.writeBytes(clientCardUpdateActivity.unknownFields());
    }
}
