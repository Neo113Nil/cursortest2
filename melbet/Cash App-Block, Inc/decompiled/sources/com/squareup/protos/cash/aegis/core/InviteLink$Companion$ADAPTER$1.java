package com.squareup.protos.cash.aegis.core;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InviteLink$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InviteLink((String) obj, (BlockerAction.ShareTextAction) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(BlockerAction.ShareTextAction.ADAPTER, protoReader, obj2);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InviteLink inviteLink = (InviteLink) obj;
        reverseProtoWriter.getClass();
        inviteLink.getClass();
        reverseProtoWriter.writeBytes(inviteLink.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, inviteLink.url);
        BlockerAction.ShareTextAction.ADAPTER.encodeWithTag(reverseProtoWriter, 2, inviteLink.share_action);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, inviteLink.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InviteLink inviteLink = (InviteLink) obj;
        inviteLink.getClass();
        int size$okio = inviteLink.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, inviteLink.url) + BlockerAction.ShareTextAction.ADAPTER.encodedSizeWithTag(2, inviteLink.share_action) + protoAdapter.encodedSizeWithTag(1, inviteLink.text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InviteLink inviteLink = (InviteLink) obj;
        inviteLink.getClass();
        BlockerAction.ShareTextAction shareTextAction = inviteLink.share_action;
        BlockerAction.ShareTextAction shareTextAction2 = shareTextAction != null ? (BlockerAction.ShareTextAction) BlockerAction.ShareTextAction.ADAPTER.redact(shareTextAction) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = inviteLink.text;
        String str2 = inviteLink.url;
        byteString.getClass();
        return new InviteLink(str, shareTextAction2, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InviteLink inviteLink = (InviteLink) obj;
        inviteLink.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, inviteLink.text);
        BlockerAction.ShareTextAction.ADAPTER.encodeWithTag(protoWriter, 2, inviteLink.share_action);
        protoAdapter.encodeWithTag(protoWriter, 4, inviteLink.url);
        protoWriter.writeBytes(inviteLink.unknownFields());
    }
}
