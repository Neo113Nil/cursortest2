package com.squareup.protos.cash.plasma.callcontext;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.Instrument;
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

    static {
        AuthorizedPrincipal$Companion$ADAPTER$1 authorizedPrincipal$Companion$ADAPTER$1 = new AuthorizedPrincipal$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AuthorizedPrincipal.class), "type.googleapis.com/squareup.cash.plasma.callcontext.AuthorizedPrincipal", Syntax.PROTO_2, null, "squareup/cash/plasma/callcontext/ForwardedCallContext.proto");
        ADAPTER = authorizedPrincipal$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(authorizedPrincipal$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorizedPrincipal(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AuthorizedPrincipal)) {
            return false;
        }
        AuthorizedPrincipal authorizedPrincipal = (AuthorizedPrincipal) obj;
        return Intrinsics.areEqual(unknownFields(), authorizedPrincipal.unknownFields()) && Intrinsics.areEqual(this.customer_token, authorizedPrincipal.customer_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Instrument.Builder builder = new Instrument.Builder(26);
        builder.token = this.customer_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AuthorizedPrincipal{", "}", 0, null, null, 56);
    }
}
