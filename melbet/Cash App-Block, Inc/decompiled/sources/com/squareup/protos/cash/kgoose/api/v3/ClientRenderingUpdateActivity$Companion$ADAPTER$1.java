package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ClientRenderingUpdateActivity$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderingUpdateActivity;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ClientRenderingUpdateActivity$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ClientRenderingUpdateActivity((String) obj, (ClientRenderable) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(ClientRenderable.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ClientRenderingUpdateActivity clientRenderingUpdateActivity = (ClientRenderingUpdateActivity) obj;
        reverseProtoWriter.getClass();
        clientRenderingUpdateActivity.getClass();
        reverseProtoWriter.writeBytes(clientRenderingUpdateActivity.unknownFields());
        ClientRenderable.ADAPTER.encodeWithTag(reverseProtoWriter, 2, clientRenderingUpdateActivity.client_renderable);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, clientRenderingUpdateActivity.tool_request_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ClientRenderingUpdateActivity clientRenderingUpdateActivity = (ClientRenderingUpdateActivity) obj;
        clientRenderingUpdateActivity.getClass();
        return ClientRenderable.ADAPTER.encodedSizeWithTag(2, clientRenderingUpdateActivity.client_renderable) + ProtoAdapter.STRING.encodedSizeWithTag(1, clientRenderingUpdateActivity.tool_request_id) + clientRenderingUpdateActivity.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ClientRenderingUpdateActivity clientRenderingUpdateActivity = (ClientRenderingUpdateActivity) obj;
        clientRenderingUpdateActivity.getClass();
        ClientRenderable clientRenderable = clientRenderingUpdateActivity.client_renderable;
        ClientRenderable clientRenderable2 = clientRenderable != null ? (ClientRenderable) ClientRenderable.ADAPTER.redact(clientRenderable) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = clientRenderingUpdateActivity.tool_request_id;
        byteString.getClass();
        return new ClientRenderingUpdateActivity(str, clientRenderable2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ClientRenderingUpdateActivity clientRenderingUpdateActivity = (ClientRenderingUpdateActivity) obj;
        clientRenderingUpdateActivity.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, clientRenderingUpdateActivity.tool_request_id);
        ClientRenderable.ADAPTER.encodeWithTag(protoWriter, 2, clientRenderingUpdateActivity.client_renderable);
        protoWriter.writeBytes(clientRenderingUpdateActivity.unknownFields());
    }
}
