package com.squareup.protos.cash.local.client.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InvokeClientRoute$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InvokeClientRoute((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        InvokeClientRoute invokeClientRoute = (InvokeClientRoute) obj;
        reverseProtoWriter.getClass();
        invokeClientRoute.getClass();
        reverseProtoWriter.writeBytes(invokeClientRoute.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, invokeClientRoute.client_route);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InvokeClientRoute invokeClientRoute = (InvokeClientRoute) obj;
        invokeClientRoute.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, invokeClientRoute.client_route) + invokeClientRoute.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InvokeClientRoute invokeClientRoute = (InvokeClientRoute) obj;
        invokeClientRoute.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = invokeClientRoute.client_route;
        byteString.getClass();
        return new InvokeClientRoute(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InvokeClientRoute invokeClientRoute = (InvokeClientRoute) obj;
        invokeClientRoute.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, invokeClientRoute.client_route);
        protoWriter.writeBytes(invokeClientRoute.unknownFields());
    }
}
