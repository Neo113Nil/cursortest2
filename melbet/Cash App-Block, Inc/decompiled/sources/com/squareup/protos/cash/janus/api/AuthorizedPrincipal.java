package com.squareup.protos.cash.janus.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.FullName;
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
public final class AuthorizedPrincipal extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AuthorizedPrincipal> CREATOR;
    public final String customer_token;
    public final String switching_identifier;

    static {
        AuthorizedPrincipal$Companion$ADAPTER$1 authorizedPrincipal$Companion$ADAPTER$1 = new AuthorizedPrincipal$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AuthorizedPrincipal.class), "type.googleapis.com/squareup.cash.janus.api.AuthorizedPrincipal", Syntax.PROTO_2, null, "squareup/cash/janus/api/AccountHolder.proto");
        ADAPTER = authorizedPrincipal$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(authorizedPrincipal$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorizedPrincipal(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer_token = str;
        this.switching_identifier = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AuthorizedPrincipal)) {
            return false;
        }
        AuthorizedPrincipal authorizedPrincipal = (AuthorizedPrincipal) obj;
        return Intrinsics.areEqual(unknownFields(), authorizedPrincipal.unknownFields()) && Intrinsics.areEqual(this.customer_token, authorizedPrincipal.customer_token) && Intrinsics.areEqual(this.switching_identifier, authorizedPrincipal.switching_identifier);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.switching_identifier;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        FullName.Builder builder = new FullName.Builder(10);
        builder.given_name = this.customer_token;
        builder.family_name = this.switching_identifier;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        String str2 = this.switching_identifier;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "switching_identifier=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AuthorizedPrincipal{", "}", 0, null, null, 56);
    }
}
