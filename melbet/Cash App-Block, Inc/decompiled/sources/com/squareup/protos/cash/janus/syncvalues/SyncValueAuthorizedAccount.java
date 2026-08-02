package com.squareup.protos.cash.janus.syncvalues;

import android.os.Parcelable;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SyncValueAuthorizedAccount extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncValueAuthorizedAccount> CREATOR;
    public final AuthorizedPrincipal authorized_principal;
    public final AuthorizedRelationship authorized_relationship;

    static {
        SyncValueAuthorizedAccount$Companion$ADAPTER$1 syncValueAuthorizedAccount$Companion$ADAPTER$1 = new SyncValueAuthorizedAccount$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncValueAuthorizedAccount.class), "type.googleapis.com/squareup.cash.janus.syncvalues.SyncValueAuthorizedAccount", Syntax.PROTO_2, null, "squareup/cash/janus/syncvalues/SyncValueAuthorizedAccount.proto");
        ADAPTER = syncValueAuthorizedAccount$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncValueAuthorizedAccount$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncValueAuthorizedAccount(AuthorizedPrincipal authorizedPrincipal, AuthorizedRelationship authorizedRelationship, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.authorized_principal = authorizedPrincipal;
        this.authorized_relationship = authorizedRelationship;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncValueAuthorizedAccount)) {
            return false;
        }
        SyncValueAuthorizedAccount syncValueAuthorizedAccount = (SyncValueAuthorizedAccount) obj;
        return Intrinsics.areEqual(unknownFields(), syncValueAuthorizedAccount.unknownFields()) && Intrinsics.areEqual(this.authorized_principal, syncValueAuthorizedAccount.authorized_principal) && this.authorized_relationship == syncValueAuthorizedAccount.authorized_relationship;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        AuthorizedPrincipal authorizedPrincipal = this.authorized_principal;
        int hashCode2 = (hashCode + (authorizedPrincipal != null ? authorizedPrincipal.hashCode() : 0)) * 37;
        AuthorizedRelationship authorizedRelationship = this.authorized_relationship;
        int hashCode3 = hashCode2 + (authorizedRelationship != null ? authorizedRelationship.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(19);
        builder.card_type = this.authorized_principal;
        builder.card_pii = this.authorized_relationship;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AuthorizedPrincipal authorizedPrincipal = this.authorized_principal;
        if (authorizedPrincipal != null) {
            arrayList.add("authorized_principal=" + authorizedPrincipal);
        }
        AuthorizedRelationship authorizedRelationship = this.authorized_relationship;
        if (authorizedRelationship != null) {
            arrayList.add("authorized_relationship=" + authorizedRelationship);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncValueAuthorizedAccount{", "}", 0, null, null, 56);
    }
}
