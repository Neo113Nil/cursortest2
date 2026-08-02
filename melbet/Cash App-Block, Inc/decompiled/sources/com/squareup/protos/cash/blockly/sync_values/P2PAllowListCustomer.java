package com.squareup.protos.cash.blockly.sync_values;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.idv.DisplayName;
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
public final class P2PAllowListCustomer extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<P2PAllowListCustomer> CREATOR;
    public final String allowlist_customer_token;

    static {
        P2PAllowListCustomer$Companion$ADAPTER$1 p2PAllowListCustomer$Companion$ADAPTER$1 = new P2PAllowListCustomer$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(P2PAllowListCustomer.class), "type.googleapis.com/squareup.cash.blockly.sync_values.P2PAllowListCustomer", Syntax.PROTO_2, null, "squareup/cash/blockly/sync_values/P2PAllowListCustomer.proto");
        ADAPTER = p2PAllowListCustomer$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(p2PAllowListCustomer$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2PAllowListCustomer(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.allowlist_customer_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof P2PAllowListCustomer)) {
            return false;
        }
        P2PAllowListCustomer p2PAllowListCustomer = (P2PAllowListCustomer) obj;
        return Intrinsics.areEqual(unknownFields(), p2PAllowListCustomer.unknownFields()) && Intrinsics.areEqual(this.allowlist_customer_token, p2PAllowListCustomer.allowlist_customer_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.allowlist_customer_token;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DisplayName.Builder builder = new DisplayName.Builder(22);
        builder.display_name = this.allowlist_customer_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.allowlist_customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "allowlist_customer_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "P2PAllowListCustomer{", "}", 0, null, null, 56);
    }
}
