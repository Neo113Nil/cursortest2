package com.squareup.protos.cash.whimsicard.syncentity;

import com.squareup.protos.cash.whimsicard.syncentity.Action;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Action$ClientRouteAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Action.ClientRouteAction((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Action.ClientRouteAction clientRouteAction = (Action.ClientRouteAction) obj;
        reverseProtoWriter.getClass();
        clientRouteAction.getClass();
        reverseProtoWriter.writeBytes(clientRouteAction.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, clientRouteAction.client_route_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Action.ClientRouteAction clientRouteAction = (Action.ClientRouteAction) obj;
        clientRouteAction.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, clientRouteAction.client_route_url) + clientRouteAction.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Action.ClientRouteAction clientRouteAction = (Action.ClientRouteAction) obj;
        clientRouteAction.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = clientRouteAction.client_route_url;
        byteString.getClass();
        return new Action.ClientRouteAction(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Action.ClientRouteAction clientRouteAction = (Action.ClientRouteAction) obj;
        clientRouteAction.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, clientRouteAction.client_route_url);
        protoWriter.writeBytes(clientRouteAction.unknownFields());
    }
}
