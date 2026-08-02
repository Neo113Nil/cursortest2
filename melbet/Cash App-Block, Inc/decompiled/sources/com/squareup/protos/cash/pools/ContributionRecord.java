package com.squareup.protos.cash.pools;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.PoolParticipant;
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
public final class ContributionRecord extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ContributionRecord> CREATOR;
    public final Long amount_cents;
    public final String contributor_comment;
    public final String contributor_identifier;
    public final Long created_at;
    public final PoolContributionStatus status;
    public final String transaction_token;
    public final TransactionType transaction_type;

    static {
        ContributionRecord$Companion$ADAPTER$1 contributionRecord$Companion$ADAPTER$1 = new ContributionRecord$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ContributionRecord.class), "type.googleapis.com/squareup.cash.pools.v1beta.ContributionRecord", Syntax.PROTO_2, null, "squareup/cash/pools/v1beta/pools.proto");
        ADAPTER = contributionRecord$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(contributionRecord$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContributionRecord(String str, Long l, Long l2, String str2, TransactionType transactionType, PoolContributionStatus poolContributionStatus, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.transaction_token = str;
        this.created_at = l;
        this.amount_cents = l2;
        this.contributor_identifier = str2;
        this.transaction_type = transactionType;
        this.status = poolContributionStatus;
        this.contributor_comment = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContributionRecord)) {
            return false;
        }
        ContributionRecord contributionRecord = (ContributionRecord) obj;
        return Intrinsics.areEqual(unknownFields(), contributionRecord.unknownFields()) && Intrinsics.areEqual(this.transaction_token, contributionRecord.transaction_token) && Intrinsics.areEqual(this.created_at, contributionRecord.created_at) && Intrinsics.areEqual(this.amount_cents, contributionRecord.amount_cents) && Intrinsics.areEqual(this.contributor_identifier, contributionRecord.contributor_identifier) && this.transaction_type == contributionRecord.transaction_type && this.status == contributionRecord.status && Intrinsics.areEqual(this.contributor_comment, contributionRecord.contributor_comment);
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
        int hashCode8 = hashCode7 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PoolParticipant.Builder builder = new PoolParticipant.Builder(13);
        builder.customer_identifier = this.transaction_token;
        builder.added_at = this.created_at;
        builder.cashtag = this.amount_cents;
        builder.full_name = this.contributor_identifier;
        builder.participant_type = this.transaction_type;
        builder.aggregated_contribution_amount = this.status;
        builder.profile_photo_url = this.contributor_comment;
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "ContributionRecord{", "}", 0, null, null, 56);
    }
}
