package com.squareup.protos.cash.blockly.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.Error;
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
public final class AllowlistCustomer extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AllowlistCustomer> CREATOR;
    public final Long created_at;
    public final Boolean is_in_allowlist;
    public final BlocklyCustomerMetadata metadata;
    public final Long updated_at;
    public final String updated_by_customer_token;
    public final Long version;

    static {
        AllowlistCustomer$Companion$ADAPTER$1 allowlistCustomer$Companion$ADAPTER$1 = new AllowlistCustomer$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AllowlistCustomer.class), "type.googleapis.com/squareup.cash.blockly.api.AllowlistCustomer", Syntax.PROTO_2, null, "squareup/cash/blockly/api/AllowlistCustomer.proto");
        ADAPTER = allowlistCustomer$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(allowlistCustomer$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllowlistCustomer(BlocklyCustomerMetadata blocklyCustomerMetadata, Boolean bool, String str, Long l, Long l2, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.metadata = blocklyCustomerMetadata;
        this.is_in_allowlist = bool;
        this.updated_by_customer_token = str;
        this.created_at = l;
        this.updated_at = l2;
        this.version = l3;
    }

    public static AllowlistCustomer copy$default(AllowlistCustomer allowlistCustomer, BlocklyCustomerMetadata blocklyCustomerMetadata, Boolean bool, ByteString byteString, int i) {
        if ((i & 1) != 0) {
            blocklyCustomerMetadata = allowlistCustomer.metadata;
        }
        BlocklyCustomerMetadata blocklyCustomerMetadata2 = blocklyCustomerMetadata;
        if ((i & 2) != 0) {
            bool = allowlistCustomer.is_in_allowlist;
        }
        Boolean bool2 = bool;
        String str = allowlistCustomer.updated_by_customer_token;
        Long l = allowlistCustomer.created_at;
        Long l2 = allowlistCustomer.updated_at;
        Long l3 = allowlistCustomer.version;
        if ((i & 64) != 0) {
            byteString = allowlistCustomer.unknownFields();
        }
        ByteString byteString2 = byteString;
        allowlistCustomer.getClass();
        byteString2.getClass();
        return new AllowlistCustomer(blocklyCustomerMetadata2, bool2, str, l, l2, l3, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AllowlistCustomer)) {
            return false;
        }
        AllowlistCustomer allowlistCustomer = (AllowlistCustomer) obj;
        return Intrinsics.areEqual(unknownFields(), allowlistCustomer.unknownFields()) && Intrinsics.areEqual(this.metadata, allowlistCustomer.metadata) && Intrinsics.areEqual(this.is_in_allowlist, allowlistCustomer.is_in_allowlist) && Intrinsics.areEqual(this.updated_by_customer_token, allowlistCustomer.updated_by_customer_token) && Intrinsics.areEqual(this.created_at, allowlistCustomer.created_at) && Intrinsics.areEqual(this.updated_at, allowlistCustomer.updated_at) && Intrinsics.areEqual(this.version, allowlistCustomer.version);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        BlocklyCustomerMetadata blocklyCustomerMetadata = this.metadata;
        int hashCode2 = (hashCode + (blocklyCustomerMetadata != null ? blocklyCustomerMetadata.hashCode() : 0)) * 37;
        Boolean bool = this.is_in_allowlist;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str = this.updated_by_customer_token;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.created_at;
        int hashCode5 = (hashCode4 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.updated_at;
        int hashCode6 = (hashCode5 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.version;
        int hashCode7 = hashCode6 + (l3 != null ? Long.hashCode(l3.longValue()) : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Error.Builder builder = new Error.Builder(10, false);
        builder.category = this.metadata;
        builder.retryable = this.is_in_allowlist;
        builder.description = this.updated_by_customer_token;
        builder.code = this.created_at;
        builder.field = this.updated_at;
        builder.metadata = this.version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BlocklyCustomerMetadata blocklyCustomerMetadata = this.metadata;
        if (blocklyCustomerMetadata != null) {
            arrayList.add("metadata=" + blocklyCustomerMetadata);
        }
        Boolean bool = this.is_in_allowlist;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_in_allowlist=", bool, arrayList);
        }
        String str = this.updated_by_customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "updated_by_customer_token=", arrayList);
        }
        Long l = this.created_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at=", l, arrayList);
        }
        Long l2 = this.updated_at;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("updated_at=", l2, arrayList);
        }
        Long l3 = this.version;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("version=", l3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AllowlistCustomer{", "}", 0, null, null, 56);
    }
}
