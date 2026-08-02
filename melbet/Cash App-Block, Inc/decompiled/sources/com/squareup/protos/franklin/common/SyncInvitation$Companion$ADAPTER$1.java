package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.ui.UiInvitation;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncInvitation$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SyncInvitation((UiInvitation) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(UiInvitation.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncInvitation syncInvitation = (SyncInvitation) obj;
        reverseProtoWriter.getClass();
        syncInvitation.getClass();
        reverseProtoWriter.writeBytes(syncInvitation.unknownFields());
        UiInvitation.ADAPTER.encodeWithTag(reverseProtoWriter, 1, syncInvitation.invitation);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncInvitation syncInvitation = (SyncInvitation) obj;
        syncInvitation.getClass();
        return UiInvitation.ADAPTER.encodedSizeWithTag(1, syncInvitation.invitation) + syncInvitation.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncInvitation syncInvitation = (SyncInvitation) obj;
        syncInvitation.getClass();
        UiInvitation uiInvitation = syncInvitation.invitation;
        UiInvitation uiInvitation2 = uiInvitation != null ? (UiInvitation) UiInvitation.ADAPTER.redact(uiInvitation) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SyncInvitation(uiInvitation2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncInvitation syncInvitation = (SyncInvitation) obj;
        syncInvitation.getClass();
        UiInvitation.ADAPTER.encodeWithTag(protoWriter, 1, syncInvitation.invitation);
        protoWriter.writeBytes(syncInvitation.unknownFields());
    }
}
