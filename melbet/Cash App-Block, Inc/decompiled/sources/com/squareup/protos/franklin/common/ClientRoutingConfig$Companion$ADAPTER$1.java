package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.ClientRoutingConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ClientRoutingConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ClientRoutingConfig(m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ClientRoutingConfig.ClientRouteRule.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList.add(ClientRoutingConfig.DeepLinkRule.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ClientRoutingConfig clientRoutingConfig = (ClientRoutingConfig) obj;
        reverseProtoWriter.getClass();
        clientRoutingConfig.getClass();
        reverseProtoWriter.writeBytes(clientRoutingConfig.unknownFields());
        ClientRoutingConfig.DeepLinkRule.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, clientRoutingConfig.deep_links);
        ClientRoutingConfig.ClientRouteRule.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, clientRoutingConfig.client_routes);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ClientRoutingConfig clientRoutingConfig = (ClientRoutingConfig) obj;
        clientRoutingConfig.getClass();
        return ClientRoutingConfig.DeepLinkRule.ADAPTER.asRepeated().encodedSizeWithTag(2, clientRoutingConfig.deep_links) + ClientRoutingConfig.ClientRouteRule.ADAPTER.asRepeated().encodedSizeWithTag(1, clientRoutingConfig.client_routes) + clientRoutingConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ClientRoutingConfig clientRoutingConfig = (ClientRoutingConfig) obj;
        clientRoutingConfig.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(clientRoutingConfig.client_routes, ClientRoutingConfig.ClientRouteRule.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(clientRoutingConfig.deep_links, ClientRoutingConfig.DeepLinkRule.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ClientRoutingConfig(m1169redactElements, m1169redactElements2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ClientRoutingConfig clientRoutingConfig = (ClientRoutingConfig) obj;
        clientRoutingConfig.getClass();
        ClientRoutingConfig.ClientRouteRule.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, clientRoutingConfig.client_routes);
        ClientRoutingConfig.DeepLinkRule.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, clientRoutingConfig.deep_links);
        protoWriter.writeBytes(clientRoutingConfig.unknownFields());
    }
}
