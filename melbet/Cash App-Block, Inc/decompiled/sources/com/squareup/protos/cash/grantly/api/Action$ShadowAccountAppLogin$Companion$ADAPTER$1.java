package com.squareup.protos.cash.grantly.api;

import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Action$ShadowAccountAppLogin$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Action.ShadowAccountAppLogin(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Action.ShadowAccountAppLogin shadowAccountAppLogin = (Action.ShadowAccountAppLogin) obj;
        reverseProtoWriter.getClass();
        shadowAccountAppLogin.getClass();
        reverseProtoWriter.writeBytes(shadowAccountAppLogin.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Action.ShadowAccountAppLogin shadowAccountAppLogin = (Action.ShadowAccountAppLogin) obj;
        shadowAccountAppLogin.getClass();
        return shadowAccountAppLogin.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((Action.ShadowAccountAppLogin) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Action.ShadowAccountAppLogin(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Action.ShadowAccountAppLogin shadowAccountAppLogin = (Action.ShadowAccountAppLogin) obj;
        shadowAccountAppLogin.getClass();
        protoWriter.writeBytes(shadowAccountAppLogin.unknownFields());
    }
}
