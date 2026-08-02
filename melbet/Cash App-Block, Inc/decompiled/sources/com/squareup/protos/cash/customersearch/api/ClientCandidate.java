package com.squareup.protos.cash.customersearch.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.api.Trust;
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
public final class ClientCandidate extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ClientCandidate> CREATOR;
    public final String customer_token;
    public final Boolean is_contact;
    public final Boolean is_favorite;
    public final Long previously_paid_at;

    static {
        ClientCandidate$Companion$ADAPTER$1 clientCandidate$Companion$ADAPTER$1 = new ClientCandidate$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ClientCandidate.class), "type.googleapis.com/squareup.cash.customersearch.api.ClientCandidate", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/RecipientSelectorSearch.proto");
        ADAPTER = clientCandidate$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(clientCandidate$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientCandidate(String str, Boolean bool, Long l, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer_token = str;
        this.is_favorite = bool;
        this.previously_paid_at = l;
        this.is_contact = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientCandidate)) {
            return false;
        }
        ClientCandidate clientCandidate = (ClientCandidate) obj;
        return Intrinsics.areEqual(unknownFields(), clientCandidate.unknownFields()) && Intrinsics.areEqual(this.customer_token, clientCandidate.customer_token) && Intrinsics.areEqual(this.is_favorite, clientCandidate.is_favorite) && Intrinsics.areEqual(this.previously_paid_at, clientCandidate.previously_paid_at) && Intrinsics.areEqual(this.is_contact, clientCandidate.is_contact);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.is_favorite;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Long l = this.previously_paid_at;
        int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Boolean bool2 = this.is_contact;
        int hashCode5 = hashCode4 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Trust.Builder builder = new Trust.Builder(27, false);
        builder.title = this.customer_token;
        builder.enabled = this.is_favorite;
        builder.icon = this.previously_paid_at;
        builder.id = this.is_contact;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        Boolean bool = this.is_favorite;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_favorite=", bool, arrayList);
        }
        Long l = this.previously_paid_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("previously_paid_at=", l, arrayList);
        }
        Boolean bool2 = this.is_contact;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_contact=", bool2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientCandidate{", "}", 0, null, null, 56);
    }
}
