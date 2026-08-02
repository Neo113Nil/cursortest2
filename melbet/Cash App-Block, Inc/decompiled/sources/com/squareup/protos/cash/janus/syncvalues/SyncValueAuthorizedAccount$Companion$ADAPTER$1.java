package com.squareup.protos.cash.janus.syncvalues;

import androidx.room.TransactorKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SyncValueAuthorizedAccount$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SyncValueAuthorizedAccount((AuthorizedPrincipal) obj, (AuthorizedRelationship) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(AuthorizedPrincipal.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = AuthorizedRelationship.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncValueAuthorizedAccount syncValueAuthorizedAccount = (SyncValueAuthorizedAccount) obj;
        reverseProtoWriter.getClass();
        syncValueAuthorizedAccount.getClass();
        reverseProtoWriter.writeBytes(syncValueAuthorizedAccount.unknownFields());
        AuthorizedRelationship.ADAPTER.encodeWithTag(reverseProtoWriter, 2, syncValueAuthorizedAccount.authorized_relationship);
        AuthorizedPrincipal.ADAPTER.encodeWithTag(reverseProtoWriter, 1, syncValueAuthorizedAccount.authorized_principal);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncValueAuthorizedAccount syncValueAuthorizedAccount = (SyncValueAuthorizedAccount) obj;
        syncValueAuthorizedAccount.getClass();
        return AuthorizedRelationship.ADAPTER.encodedSizeWithTag(2, syncValueAuthorizedAccount.authorized_relationship) + AuthorizedPrincipal.ADAPTER.encodedSizeWithTag(1, syncValueAuthorizedAccount.authorized_principal) + syncValueAuthorizedAccount.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncValueAuthorizedAccount syncValueAuthorizedAccount = (SyncValueAuthorizedAccount) obj;
        syncValueAuthorizedAccount.getClass();
        AuthorizedPrincipal authorizedPrincipal = syncValueAuthorizedAccount.authorized_principal;
        AuthorizedPrincipal authorizedPrincipal2 = authorizedPrincipal != null ? (AuthorizedPrincipal) AuthorizedPrincipal.ADAPTER.redact(authorizedPrincipal) : null;
        ByteString byteString = ByteString.EMPTY;
        AuthorizedRelationship authorizedRelationship = syncValueAuthorizedAccount.authorized_relationship;
        byteString.getClass();
        return new SyncValueAuthorizedAccount(authorizedPrincipal2, authorizedRelationship, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncValueAuthorizedAccount syncValueAuthorizedAccount = (SyncValueAuthorizedAccount) obj;
        syncValueAuthorizedAccount.getClass();
        AuthorizedPrincipal.ADAPTER.encodeWithTag(protoWriter, 1, syncValueAuthorizedAccount.authorized_principal);
        AuthorizedRelationship.ADAPTER.encodeWithTag(protoWriter, 2, syncValueAuthorizedAccount.authorized_relationship);
        protoWriter.writeBytes(syncValueAuthorizedAccount.unknownFields());
    }
}
