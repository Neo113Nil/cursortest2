package com.squareup.protos.cash.piggybank.appapi;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.piggybank.api.v2.InterestRate;
import com.squareup.protos.cash.piggybank.api.v2.SavingsBalance;
import com.squareup.protos.cash.piggybank.api.v2.SavingsCustomer;
import com.squareup.protos.cash.piggybank.api.v2.SavingsGoal;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.savings.VersionedSavingsFolders;

/* loaded from: classes7.dex */
public final class GetSavingsOverviewResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetSavingsOverviewResponse((ResponseContext) obj, (SavingsCustomer) obj2, (SavingsBalance) obj3, (SavingsGoal) obj4, (InterestRate) obj5, (VersionedSavingsFolders) obj6, (AutomationSection) obj7, (SavingsConfig) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(SavingsCustomer.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(SavingsBalance.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(SavingsGoal.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(InterestRate.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(VersionedSavingsFolders.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(AutomationSection.ADAPTER, protoReader, obj7);
                    break;
                case 8:
                    obj8 = TransactorKt.decodeMessageOrMerge(SavingsConfig.ADAPTER, protoReader, obj8);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetSavingsOverviewResponse getSavingsOverviewResponse = (GetSavingsOverviewResponse) obj;
        reverseProtoWriter.getClass();
        getSavingsOverviewResponse.getClass();
        reverseProtoWriter.writeBytes(getSavingsOverviewResponse.unknownFields());
        SavingsConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 8, getSavingsOverviewResponse.config);
        AutomationSection.ADAPTER.encodeWithTag(reverseProtoWriter, 7, getSavingsOverviewResponse.automation_section);
        VersionedSavingsFolders.ADAPTER.encodeWithTag(reverseProtoWriter, 6, getSavingsOverviewResponse.versioned_savings_folders);
        InterestRate.ADAPTER.encodeWithTag(reverseProtoWriter, 5, getSavingsOverviewResponse.interest_rate);
        SavingsGoal.ADAPTER.encodeWithTag(reverseProtoWriter, 4, getSavingsOverviewResponse.goal);
        SavingsBalance.ADAPTER.encodeWithTag(reverseProtoWriter, 3, getSavingsOverviewResponse.balance);
        SavingsCustomer.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getSavingsOverviewResponse.customer);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getSavingsOverviewResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetSavingsOverviewResponse getSavingsOverviewResponse = (GetSavingsOverviewResponse) obj;
        getSavingsOverviewResponse.getClass();
        return SavingsConfig.ADAPTER.encodedSizeWithTag(8, getSavingsOverviewResponse.config) + AutomationSection.ADAPTER.encodedSizeWithTag(7, getSavingsOverviewResponse.automation_section) + VersionedSavingsFolders.ADAPTER.encodedSizeWithTag(6, getSavingsOverviewResponse.versioned_savings_folders) + InterestRate.ADAPTER.encodedSizeWithTag(5, getSavingsOverviewResponse.interest_rate) + SavingsGoal.ADAPTER.encodedSizeWithTag(4, getSavingsOverviewResponse.goal) + SavingsBalance.ADAPTER.encodedSizeWithTag(3, getSavingsOverviewResponse.balance) + SavingsCustomer.ADAPTER.encodedSizeWithTag(2, getSavingsOverviewResponse.customer) + ResponseContext.ADAPTER.encodedSizeWithTag(1, getSavingsOverviewResponse.response_context) + getSavingsOverviewResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetSavingsOverviewResponse getSavingsOverviewResponse = (GetSavingsOverviewResponse) obj;
        getSavingsOverviewResponse.getClass();
        ResponseContext responseContext = getSavingsOverviewResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        SavingsCustomer savingsCustomer = getSavingsOverviewResponse.customer;
        SavingsCustomer savingsCustomer2 = savingsCustomer != null ? (SavingsCustomer) SavingsCustomer.ADAPTER.redact(savingsCustomer) : null;
        SavingsBalance savingsBalance = getSavingsOverviewResponse.balance;
        SavingsBalance savingsBalance2 = savingsBalance != null ? (SavingsBalance) SavingsBalance.ADAPTER.redact(savingsBalance) : null;
        SavingsGoal savingsGoal = getSavingsOverviewResponse.goal;
        SavingsGoal savingsGoal2 = savingsGoal != null ? (SavingsGoal) SavingsGoal.ADAPTER.redact(savingsGoal) : null;
        InterestRate interestRate = getSavingsOverviewResponse.interest_rate;
        InterestRate interestRate2 = interestRate != null ? (InterestRate) InterestRate.ADAPTER.redact(interestRate) : null;
        VersionedSavingsFolders versionedSavingsFolders = getSavingsOverviewResponse.versioned_savings_folders;
        VersionedSavingsFolders versionedSavingsFolders2 = versionedSavingsFolders != null ? (VersionedSavingsFolders) VersionedSavingsFolders.ADAPTER.redact(versionedSavingsFolders) : null;
        AutomationSection automationSection = getSavingsOverviewResponse.automation_section;
        AutomationSection automationSection2 = automationSection != null ? (AutomationSection) AutomationSection.ADAPTER.redact(automationSection) : null;
        SavingsConfig savingsConfig = getSavingsOverviewResponse.config;
        SavingsConfig savingsConfig2 = savingsConfig != null ? (SavingsConfig) SavingsConfig.ADAPTER.redact(savingsConfig) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetSavingsOverviewResponse(responseContext2, savingsCustomer2, savingsBalance2, savingsGoal2, interestRate2, versionedSavingsFolders2, automationSection2, savingsConfig2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetSavingsOverviewResponse getSavingsOverviewResponse = (GetSavingsOverviewResponse) obj;
        getSavingsOverviewResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, getSavingsOverviewResponse.response_context);
        SavingsCustomer.ADAPTER.encodeWithTag(protoWriter, 2, getSavingsOverviewResponse.customer);
        SavingsBalance.ADAPTER.encodeWithTag(protoWriter, 3, getSavingsOverviewResponse.balance);
        SavingsGoal.ADAPTER.encodeWithTag(protoWriter, 4, getSavingsOverviewResponse.goal);
        InterestRate.ADAPTER.encodeWithTag(protoWriter, 5, getSavingsOverviewResponse.interest_rate);
        VersionedSavingsFolders.ADAPTER.encodeWithTag(protoWriter, 6, getSavingsOverviewResponse.versioned_savings_folders);
        AutomationSection.ADAPTER.encodeWithTag(protoWriter, 7, getSavingsOverviewResponse.automation_section);
        SavingsConfig.ADAPTER.encodeWithTag(protoWriter, 8, getSavingsOverviewResponse.config);
        protoWriter.writeBytes(getSavingsOverviewResponse.unknownFields());
    }
}
