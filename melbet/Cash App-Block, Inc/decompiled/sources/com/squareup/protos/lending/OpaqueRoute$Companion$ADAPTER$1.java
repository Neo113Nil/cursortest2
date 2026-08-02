package com.squareup.protos.lending;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OpaqueRoute$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OpaqueRoute((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        OpaqueRoute opaqueRoute = (OpaqueRoute) obj;
        reverseProtoWriter.getClass();
        opaqueRoute.getClass();
        reverseProtoWriter.writeBytes(opaqueRoute.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, opaqueRoute.client_route);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OpaqueRoute opaqueRoute = (OpaqueRoute) obj;
        opaqueRoute.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, opaqueRoute.client_route) + opaqueRoute.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OpaqueRoute opaqueRoute = (OpaqueRoute) obj;
        opaqueRoute.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = opaqueRoute.client_route;
        byteString.getClass();
        return new OpaqueRoute(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OpaqueRoute opaqueRoute = (OpaqueRoute) obj;
        opaqueRoute.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, opaqueRoute.client_route);
        protoWriter.writeBytes(opaqueRoute.unknownFields());
    }
}
