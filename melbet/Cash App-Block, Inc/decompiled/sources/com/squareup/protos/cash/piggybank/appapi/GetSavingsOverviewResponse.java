package com.squareup.protos.cash.piggybank.appapi;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.piggybank.api.v2.InterestRate;
import com.squareup.protos.cash.piggybank.api.v2.SavingsBalance;
import com.squareup.protos.cash.piggybank.api.v2.SavingsCustomer;
import com.squareup.protos.cash.piggybank.api.v2.SavingsGoal;
import com.squareup.protos.document.DocumentEntity;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.savings.VersionedSavingsFolders;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/piggybank/appapi/GetSavingsOverviewResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/document/DocumentEntity$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetSavingsOverviewResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetSavingsOverviewResponse> CREATOR;
    public final AutomationSection automation_section;
    public final SavingsBalance balance;
    public final SavingsConfig config;
    public final SavingsCustomer customer;
    public final SavingsGoal goal;
    public final InterestRate interest_rate;
    public final ResponseContext response_context;
    public final VersionedSavingsFolders versioned_savings_folders;

    static {
        GetSavingsOverviewResponse$Companion$ADAPTER$1 getSavingsOverviewResponse$Companion$ADAPTER$1 = new GetSavingsOverviewResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetSavingsOverviewResponse.class), "type.googleapis.com/squareup.cash.piggybank.appapi.GetSavingsOverviewResponse", Syntax.PROTO_2, null, "squareup/cash/app/get_savings_overview.proto");
        ADAPTER = getSavingsOverviewResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getSavingsOverviewResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSavingsOverviewResponse(ResponseContext responseContext, SavingsCustomer savingsCustomer, SavingsBalance savingsBalance, SavingsGoal savingsGoal, InterestRate interestRate, VersionedSavingsFolders versionedSavingsFolders, AutomationSection automationSection, SavingsConfig savingsConfig, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.customer = savingsCustomer;
        this.balance = savingsBalance;
        this.goal = savingsGoal;
        this.interest_rate = interestRate;
        this.versioned_savings_folders = versionedSavingsFolders;
        this.automation_section = automationSection;
        this.config = savingsConfig;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetSavingsOverviewResponse)) {
            return false;
        }
        GetSavingsOverviewResponse getSavingsOverviewResponse = (GetSavingsOverviewResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getSavingsOverviewResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, getSavingsOverviewResponse.response_context) && Intrinsics.areEqual(this.customer, getSavingsOverviewResponse.customer) && Intrinsics.areEqual(this.balance, getSavingsOverviewResponse.balance) && Intrinsics.areEqual(this.goal, getSavingsOverviewResponse.goal) && Intrinsics.areEqual(this.interest_rate, getSavingsOverviewResponse.interest_rate) && Intrinsics.areEqual(this.versioned_savings_folders, getSavingsOverviewResponse.versioned_savings_folders) && Intrinsics.areEqual(this.automation_section, getSavingsOverviewResponse.automation_section) && Intrinsics.areEqual(this.config, getSavingsOverviewResponse.config);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = (hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        SavingsCustomer savingsCustomer = this.customer;
        int hashCode3 = (hashCode2 + (savingsCustomer != null ? savingsCustomer.hashCode() : 0)) * 37;
        SavingsBalance savingsBalance = this.balance;
        int hashCode4 = (hashCode3 + (savingsBalance != null ? savingsBalance.hashCode() : 0)) * 37;
        SavingsGoal savingsGoal = this.goal;
        int hashCode5 = (hashCode4 + (savingsGoal != null ? savingsGoal.hashCode() : 0)) * 37;
        InterestRate interestRate = this.interest_rate;
        int hashCode6 = (hashCode5 + (interestRate != null ? interestRate.hashCode() : 0)) * 37;
        VersionedSavingsFolders versionedSavingsFolders = this.versioned_savings_folders;
        int hashCode7 = (hashCode6 + (versionedSavingsFolders != null ? versionedSavingsFolders.hashCode() : 0)) * 37;
        AutomationSection automationSection = this.automation_section;
        int hashCode8 = (hashCode7 + (automationSection != null ? automationSection.hashCode() : 0)) * 37;
        SavingsConfig savingsConfig = this.config;
        int hashCode9 = hashCode8 + (savingsConfig != null ? savingsConfig.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DocumentEntity.Builder builder = new DocumentEntity.Builder(11, false);
        builder.category = this.response_context;
        builder.token = this.customer;
        builder.title = this.balance;
        builder.client_route = this.goal;
        builder.url = this.interest_rate;
        builder.owner_token = this.versioned_savings_folders;
        builder.version_data = this.automation_section;
        builder.localizable_title = this.config;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        SavingsCustomer savingsCustomer = this.customer;
        if (savingsCustomer != null) {
            arrayList.add("customer=" + savingsCustomer);
        }
        SavingsBalance savingsBalance = this.balance;
        if (savingsBalance != null) {
            arrayList.add("balance=" + savingsBalance);
        }
        SavingsGoal savingsGoal = this.goal;
        if (savingsGoal != null) {
            arrayList.add("goal=" + savingsGoal);
        }
        InterestRate interestRate = this.interest_rate;
        if (interestRate != null) {
            arrayList.add("interest_rate=" + interestRate);
        }
        VersionedSavingsFolders versionedSavingsFolders = this.versioned_savings_folders;
        if (versionedSavingsFolders != null) {
            arrayList.add("versioned_savings_folders=" + versionedSavingsFolders);
        }
        AutomationSection automationSection = this.automation_section;
        if (automationSection != null) {
            arrayList.add("automation_section=" + automationSection);
        }
        SavingsConfig savingsConfig = this.config;
        if (savingsConfig != null) {
            arrayList.add("config=" + savingsConfig);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetSavingsOverviewResponse{", "}", 0, null, null, 56);
    }
}
