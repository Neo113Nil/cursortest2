package com.squareup.protos.cash.local.client.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RedirectToWeb$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RedirectToWeb((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        RedirectToWeb redirectToWeb = (RedirectToWeb) obj;
        reverseProtoWriter.getClass();
        redirectToWeb.getClass();
        reverseProtoWriter.writeBytes(redirectToWeb.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, redirectToWeb.url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RedirectToWeb redirectToWeb = (RedirectToWeb) obj;
        redirectToWeb.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, redirectToWeb.url) + redirectToWeb.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RedirectToWeb redirectToWeb = (RedirectToWeb) obj;
        redirectToWeb.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = redirectToWeb.url;
        byteString.getClass();
        return new RedirectToWeb(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RedirectToWeb redirectToWeb = (RedirectToWeb) obj;
        redirectToWeb.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, redirectToWeb.url);
        protoWriter.writeBytes(redirectToWeb.unknownFields());
    }
}
