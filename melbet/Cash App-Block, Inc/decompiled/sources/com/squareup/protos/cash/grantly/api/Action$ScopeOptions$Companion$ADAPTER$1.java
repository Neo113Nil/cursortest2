package com.squareup.protos.cash.grantly.api;

import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Action$ScopeOptions$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Action.ScopeOptions((Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Action.ScopeOptions scopeOptions = (Action.ScopeOptions) obj;
        reverseProtoWriter.getClass();
        scopeOptions.getClass();
        reverseProtoWriter.writeBytes(scopeOptions.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, scopeOptions.risky);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Action.ScopeOptions scopeOptions = (Action.ScopeOptions) obj;
        scopeOptions.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(1, scopeOptions.risky) + scopeOptions.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Action.ScopeOptions scopeOptions = (Action.ScopeOptions) obj;
        scopeOptions.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = scopeOptions.risky;
        byteString.getClass();
        return new Action.ScopeOptions(bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Action.ScopeOptions scopeOptions = (Action.ScopeOptions) obj;
        scopeOptions.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, scopeOptions.risky);
        protoWriter.writeBytes(scopeOptions.unknownFields());
    }
}
