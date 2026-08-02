package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.document.DocumentEntity;
import com.squareup.protos.franklin.common.SavingsTransferRenderData;
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

/* loaded from: classes8.dex */
public final class RecurringTransferRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RecurringTransferRenderData> CREATOR;
    public final String client_route;
    public final Long expected_execution_date_ms;
    public final String goal_token;
    public final Integer number_of_upcoming_transfers;
    public final String savings_subbalance_name;
    public final String schedule_preference_token;
    public final SavingsTransferRenderData.SavingsFolderMetadata target_savings_folder_metadata;
    public final Long transfer_amount_cents;

    static {
        RecurringTransferRenderData$Companion$ADAPTER$1 recurringTransferRenderData$Companion$ADAPTER$1 = new RecurringTransferRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RecurringTransferRenderData.class), "type.googleapis.com/squareup.franklin.RecurringTransferRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = recurringTransferRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(recurringTransferRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringTransferRenderData(String str, Long l, Long l2, String str2, String str3, String str4, SavingsTransferRenderData.SavingsFolderMetadata savingsFolderMetadata, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.savings_subbalance_name = str;
        this.transfer_amount_cents = l;
        this.expected_execution_date_ms = l2;
        this.client_route = str2;
        this.goal_token = str3;
        this.schedule_preference_token = str4;
        this.target_savings_folder_metadata = savingsFolderMetadata;
        this.number_of_upcoming_transfers = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecurringTransferRenderData)) {
            return false;
        }
        RecurringTransferRenderData recurringTransferRenderData = (RecurringTransferRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), recurringTransferRenderData.unknownFields()) && Intrinsics.areEqual(this.savings_subbalance_name, recurringTransferRenderData.savings_subbalance_name) && Intrinsics.areEqual(this.transfer_amount_cents, recurringTransferRenderData.transfer_amount_cents) && Intrinsics.areEqual(this.expected_execution_date_ms, recurringTransferRenderData.expected_execution_date_ms) && Intrinsics.areEqual(this.client_route, recurringTransferRenderData.client_route) && Intrinsics.areEqual(this.goal_token, recurringTransferRenderData.goal_token) && Intrinsics.areEqual(this.schedule_preference_token, recurringTransferRenderData.schedule_preference_token) && Intrinsics.areEqual(this.target_savings_folder_metadata, recurringTransferRenderData.target_savings_folder_metadata) && Intrinsics.areEqual(this.number_of_upcoming_transfers, recurringTransferRenderData.number_of_upcoming_transfers);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.savings_subbalance_name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.transfer_amount_cents;
        int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.expected_execution_date_ms;
        int hashCode4 = (hashCode3 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        String str2 = this.client_route;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.goal_token;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.schedule_preference_token;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
        SavingsTransferRenderData.SavingsFolderMetadata savingsFolderMetadata = this.target_savings_folder_metadata;
        int hashCode8 = (hashCode7 + (savingsFolderMetadata != null ? savingsFolderMetadata.hashCode() : 0)) * 37;
        Integer num = this.number_of_upcoming_transfers;
        int hashCode9 = hashCode8 + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DocumentEntity.Builder builder = new DocumentEntity.Builder(28, false);
        builder.category = this.savings_subbalance_name;
        builder.url = this.transfer_amount_cents;
        builder.owner_token = this.expected_execution_date_ms;
        builder.token = this.client_route;
        builder.title = this.goal_token;
        builder.client_route = this.schedule_preference_token;
        builder.version_data = this.target_savings_folder_metadata;
        builder.localizable_title = this.number_of_upcoming_transfers;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.savings_subbalance_name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "savings_subbalance_name=", arrayList);
        }
        Long l = this.transfer_amount_cents;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("transfer_amount_cents=", l, arrayList);
        }
        Long l2 = this.expected_execution_date_ms;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expected_execution_date_ms=", l2, arrayList);
        }
        String str2 = this.client_route;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "client_route=", arrayList);
        }
        String str3 = this.goal_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "goal_token=", arrayList);
        }
        String str4 = this.schedule_preference_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "schedule_preference_token=", arrayList);
        }
        SavingsTransferRenderData.SavingsFolderMetadata savingsFolderMetadata = this.target_savings_folder_metadata;
        if (savingsFolderMetadata != null) {
            arrayList.add("target_savings_folder_metadata=" + savingsFolderMetadata);
        }
        Integer num = this.number_of_upcoming_transfers;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("number_of_upcoming_transfers=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RecurringTransferRenderData{", "}", 0, null, null, 56);
    }
}
