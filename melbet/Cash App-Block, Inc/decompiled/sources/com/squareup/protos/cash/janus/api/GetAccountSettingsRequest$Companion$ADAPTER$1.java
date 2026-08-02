package com.squareup.protos.cash.janus.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetAccountSettingsRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetAccountSettingsRequest(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetAccountSettingsRequest getAccountSettingsRequest = (GetAccountSettingsRequest) obj;
        reverseProtoWriter.getClass();
        getAccountSettingsRequest.getClass();
        reverseProtoWriter.writeBytes(getAccountSettingsRequest.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetAccountSettingsRequest getAccountSettingsRequest = (GetAccountSettingsRequest) obj;
        getAccountSettingsRequest.getClass();
        return getAccountSettingsRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((GetAccountSettingsRequest) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetAccountSettingsRequest(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetAccountSettingsRequest getAccountSettingsRequest = (GetAccountSettingsRequest) obj;
        getAccountSettingsRequest.getClass();
        protoWriter.writeBytes(getAccountSettingsRequest.unknownFields());
    }
}
