package com.squareup.protos.franklin.ui;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiInvitation$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiInvitation((ByteString) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BYTES.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiInvitation uiInvitation = (UiInvitation) obj;
        reverseProtoWriter.getClass();
        uiInvitation.getClass();
        reverseProtoWriter.writeBytes(uiInvitation.unknownFields());
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 1, uiInvitation.hashed_alias);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiInvitation uiInvitation = (UiInvitation) obj;
        uiInvitation.getClass();
        return ProtoAdapter.BYTES.encodedSizeWithTag(1, uiInvitation.hashed_alias) + uiInvitation.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((UiInvitation) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UiInvitation(null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiInvitation uiInvitation = (UiInvitation) obj;
        uiInvitation.getClass();
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, uiInvitation.hashed_alias);
        protoWriter.writeBytes(uiInvitation.unknownFields());
    }
}
