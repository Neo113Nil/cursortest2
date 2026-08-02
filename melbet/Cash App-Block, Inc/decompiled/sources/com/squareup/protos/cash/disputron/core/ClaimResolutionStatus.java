package com.squareup.protos.cash.disputron.core;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.employeejobs.Job;
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
public final class ClaimResolutionStatus extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ClaimResolutionStatus> CREATOR;
    public final Money amount;
    public final Long claim_resolved_at;
    public final Long claim_submitted_at;
    public final String claim_token;
    public final String counterparty_name;
    public final ListClaimDSL3Data dsl3_data;
    public final String icon_url;
    public final String status;
    public final Long transaction_initiated_at;
    public final String transaction_token;
    public final TransactionType transaction_type;

    static {
        ClaimResolutionStatus$Companion$ADAPTER$1 claimResolutionStatus$Companion$ADAPTER$1 = new ClaimResolutionStatus$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ClaimResolutionStatus.class), "type.googleapis.com/squareup.cash.disputron.core.ClaimResolutionStatus", Syntax.PROTO_3, null, "squareup/cash/disputron/core/ListClaimResolutionStatuses.proto");
        ADAPTER = claimResolutionStatus$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(claimResolutionStatus$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClaimResolutionStatus(String str, String str2, Money money, String str3, Long l, Long l2, TransactionType transactionType, String str4, String str5, Long l3, ListClaimDSL3Data listClaimDSL3Data, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.claim_token = str;
        this.transaction_token = str2;
        this.amount = money;
        this.status = str3;
        this.claim_submitted_at = l;
        this.claim_resolved_at = l2;
        this.transaction_type = transactionType;
        this.counterparty_name = str4;
        this.icon_url = str5;
        this.transaction_initiated_at = l3;
        this.dsl3_data = listClaimDSL3Data;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClaimResolutionStatus)) {
            return false;
        }
        ClaimResolutionStatus claimResolutionStatus = (ClaimResolutionStatus) obj;
        return Intrinsics.areEqual(unknownFields(), claimResolutionStatus.unknownFields()) && Intrinsics.areEqual(this.claim_token, claimResolutionStatus.claim_token) && Intrinsics.areEqual(this.transaction_token, claimResolutionStatus.transaction_token) && Intrinsics.areEqual(this.amount, claimResolutionStatus.amount) && Intrinsics.areEqual(this.status, claimResolutionStatus.status) && Intrinsics.areEqual(this.claim_submitted_at, claimResolutionStatus.claim_submitted_at) && Intrinsics.areEqual(this.claim_resolved_at, claimResolutionStatus.claim_resolved_at) && this.transaction_type == claimResolutionStatus.transaction_type && Intrinsics.areEqual(this.counterparty_name, claimResolutionStatus.counterparty_name) && Intrinsics.areEqual(this.icon_url, claimResolutionStatus.icon_url) && Intrinsics.areEqual(this.transaction_initiated_at, claimResolutionStatus.transaction_initiated_at) && Intrinsics.areEqual(this.dsl3_data, claimResolutionStatus.dsl3_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.claim_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.transaction_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
        String str3 = this.status;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Long l = this.claim_submitted_at;
        int hashCode6 = (hashCode5 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.claim_resolved_at;
        int hashCode7 = (hashCode6 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        TransactionType transactionType = this.transaction_type;
        int hashCode8 = (hashCode7 + (transactionType != null ? transactionType.hashCode() : 0)) * 37;
        String str4 = this.counterparty_name;
        int hashCode9 = (hashCode8 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.icon_url;
        int hashCode10 = (hashCode9 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Long l3 = this.transaction_initiated_at;
        int hashCode11 = (hashCode10 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        ListClaimDSL3Data listClaimDSL3Data = this.dsl3_data;
        int hashCode12 = hashCode11 + (listClaimDSL3Data != null ? listClaimDSL3Data.hashCode() : 0);
        this.hashCode = hashCode12;
        return hashCode12;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Job.Builder builder = new Job.Builder(7);
        builder.token = this.claim_token;
        builder.merchant_token = this.transaction_token;
        builder.default_wage = this.amount;
        builder.title = this.status;
        builder.created_at_timestamp_ms = this.claim_submitted_at;
        builder.updated_at_timestamp_ms = this.claim_resolved_at;
        builder.team_member_count = this.transaction_type;
        builder.version = this.counterparty_name;
        builder.tip_eligible = this.icon_url;
        builder.deleted_at_timestamp_ms = this.transaction_initiated_at;
        builder.default_color_scheme = this.dsl3_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.claim_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "claim_token=", arrayList);
        }
        String str2 = this.transaction_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "transaction_token=", arrayList);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        String str3 = this.status;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "status=", arrayList);
        }
        Long l = this.claim_submitted_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("claim_submitted_at=", l, arrayList);
        }
        Long l2 = this.claim_resolved_at;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("claim_resolved_at=", l2, arrayList);
        }
        TransactionType transactionType = this.transaction_type;
        if (transactionType != null) {
            arrayList.add("transaction_type=" + transactionType);
        }
        String str4 = this.counterparty_name;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "counterparty_name=", arrayList);
        }
        String str5 = this.icon_url;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "icon_url=", arrayList);
        }
        Long l3 = this.transaction_initiated_at;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("transaction_initiated_at=", l3, arrayList);
        }
        ListClaimDSL3Data listClaimDSL3Data = this.dsl3_data;
        if (listClaimDSL3Data != null) {
            arrayList.add("dsl3_data=" + listClaimDSL3Data);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClaimResolutionStatus{", "}", 0, null, null, 56);
    }
}
