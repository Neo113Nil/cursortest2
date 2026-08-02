package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.groups.Group;
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
public final class LocalActions extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalActions> CREATOR;
    public final LocalActionOrdering ordering;
    public final LocalActionP2P p2p;
    public final LocalActionRedemption redemption;

    static {
        LocalActions$Companion$ADAPTER$1 localActions$Companion$ADAPTER$1 = new LocalActions$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalActions.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalActions", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_actions.proto");
        ADAPTER = localActions$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localActions$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalActions(LocalActionOrdering localActionOrdering, LocalActionP2P localActionP2P, LocalActionRedemption localActionRedemption, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.ordering = localActionOrdering;
        this.p2p = localActionP2P;
        this.redemption = localActionRedemption;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalActions)) {
            return false;
        }
        LocalActions localActions = (LocalActions) obj;
        return Intrinsics.areEqual(unknownFields(), localActions.unknownFields()) && Intrinsics.areEqual(this.ordering, localActions.ordering) && Intrinsics.areEqual(this.p2p, localActions.p2p) && Intrinsics.areEqual(this.redemption, localActions.redemption);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalActionOrdering localActionOrdering = this.ordering;
        int hashCode2 = (hashCode + (localActionOrdering != null ? localActionOrdering.hashCode() : 0)) * 37;
        LocalActionP2P localActionP2P = this.p2p;
        int hashCode3 = (hashCode2 + (localActionP2P != null ? localActionP2P.hashCode() : 0)) * 37;
        LocalActionRedemption localActionRedemption = this.redemption;
        int hashCode4 = hashCode3 + (localActionRedemption != null ? localActionRedemption.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Group.Builder builder = new Group.Builder(22);
        builder.name = this.ordering;
        builder.group_image = this.p2p;
        builder.participants = this.redemption;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalActionOrdering localActionOrdering = this.ordering;
        if (localActionOrdering != null) {
            arrayList.add("ordering=" + localActionOrdering);
        }
        LocalActionP2P localActionP2P = this.p2p;
        if (localActionP2P != null) {
            arrayList.add("p2p=" + localActionP2P);
        }
        LocalActionRedemption localActionRedemption = this.redemption;
        if (localActionRedemption != null) {
            arrayList.add("redemption=" + localActionRedemption);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalActions{", "}", 0, null, null, 56);
    }
}
