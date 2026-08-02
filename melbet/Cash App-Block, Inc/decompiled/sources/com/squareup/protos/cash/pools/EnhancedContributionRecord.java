package com.squareup.protos.cash.pools;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.moneta.api.v1_0.CashInRequest;
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
public final class EnhancedContributionRecord extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EnhancedContributionRecord> CREATOR;
    public final Long amount_cents;
    public final String contributor_comment;
    public final String contributor_identifier;
    public final Long created_at;
    public final String owner_token;
    public final String pool_name;
    public final String pool_token;
    public final PoolContributionStatus status;
    public final String transaction_token;
    public final TransactionType transaction_type;

    static {
        EnhancedContributionRecord$Companion$ADAPTER$1 enhancedContributionRecord$Companion$ADAPTER$1 = new EnhancedContributionRecord$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EnhancedContributionRecord.class), "type.googleapis.com/squareup.cash.pools.v1beta.EnhancedContributionRecord", Syntax.PROTO_2, null, "squareup/cash/pools/v1beta/pools.proto");
        ADAPTER = enhancedContributionRecord$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(enhancedContributionRecord$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnhancedContributionRecord(String str, Long l, Long l2, String str2, TransactionType transactionType, PoolContributionStatus poolContributionStatus, String str3, String str4, String str5, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.transaction_token = str;
        this.created_at = l;
        this.amount_cents = l2;
        this.contributor_identifier = str2;
        this.transaction_type = transactionType;
        this.status = poolContributionStatus;
        this.contributor_comment = str3;
        this.pool_token = str4;
        this.pool_name = str5;
        this.owner_token = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EnhancedContributionRecord)) {
            return false;
        }
        EnhancedContributionRecord enhancedContributionRecord = (EnhancedContributionRecord) obj;
        return Intrinsics.areEqual(unknownFields(), enhancedContributionRecord.unknownFields()) && Intrinsics.areEqual(this.transaction_token, enhancedContributionRecord.transaction_token) && Intrinsics.areEqual(this.created_at, enhancedContributionRecord.created_at) && Intrinsics.areEqual(this.amount_cents, enhancedContributionRecord.amount_cents) && Intrinsics.areEqual(this.contributor_identifier, enhancedContributionRecord.contributor_identifier) && this.transaction_type == enhancedContributionRecord.transaction_type && this.status == enhancedContributionRecord.status && Intrinsics.areEqual(this.contributor_comment, enhancedContributionRecord.contributor_comment) && Intrinsics.areEqual(this.pool_token, enhancedContributionRecord.pool_token) && Intrinsics.areEqual(this.pool_name, enhancedContributionRecord.pool_name) && Intrinsics.areEqual(this.owner_token, enhancedContributionRecord.owner_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.transaction_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.created_at;
        int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.amount_cents;
        int hashCode4 = (hashCode3 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        String str2 = this.contributor_identifier;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        TransactionType transactionType = this.transaction_type;
        int hashCode6 = (hashCode5 + (transactionType != null ? transactionType.hashCode() : 0)) * 37;
        PoolContributionStatus poolContributionStatus = this.status;
        int hashCode7 = (hashCode6 + (poolContributionStatus != null ? poolContributionStatus.hashCode() : 0)) * 37;
        String str3 = this.contributor_comment;
        int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.pool_token;
        int hashCode9 = (hashCode8 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.pool_name;
        int hashCode10 = (hashCode9 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.owner_token;
        int hashCode11 = hashCode10 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = hashCode11;
        return hashCode11;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CashInRequest.Builder builder = new CashInRequest.Builder(16);
        builder.external_id = this.transaction_token;
        builder.request_context = this.created_at;
        builder.source = this.amount_cents;
        builder.passcode_token = this.contributor_identifier;
        builder.target = this.transaction_type;
        builder.amount = this.status;
        builder.external_client_transfer_token = this.contributor_comment;
        builder.call_context = this.pool_token;
        builder.forwarded_call_context = this.pool_name;
        builder.client_verified_digital_wallet = this.owner_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.transaction_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "transaction_token=", arrayList);
        }
        Long l = this.created_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at=", l, arrayList);
        }
        Long l2 = this.amount_cents;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("amount_cents=", l2, arrayList);
        }
        String str2 = this.contributor_identifier;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "contributor_identifier=", arrayList);
        }
        TransactionType transactionType = this.transaction_type;
        if (transactionType != null) {
            arrayList.add("transaction_type=" + transactionType);
        }
        PoolContributionStatus poolContributionStatus = this.status;
        if (poolContributionStatus != null) {
            arrayList.add("status=" + poolContributionStatus);
        }
        if (this.contributor_comment != null) {
            arrayList.add("contributor_comment=██");
        }
        String str3 = this.pool_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "pool_token=", arrayList);
        }
        if (this.pool_name != null) {
            arrayList.add("pool_name=██");
        }
        String str4 = this.owner_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "owner_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EnhancedContributionRecord{", "}", 0, null, null, 56);
    }
}
