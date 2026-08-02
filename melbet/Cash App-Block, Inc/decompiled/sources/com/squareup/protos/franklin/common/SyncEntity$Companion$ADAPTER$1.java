package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.syncentity.DomainType;
import com.squareup.protos.document.DocumentCategoryEntity;
import com.squareup.protos.document.DocumentEntity;
import com.squareup.protos.franklin.lending.CreditLine;
import com.squareup.protos.franklin.lending.Loan;
import com.squareup.protos.franklin.lending.LoanTransaction;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.investcore.trading.syncvalues.TradingState;

/* loaded from: classes.dex */
public final class SyncEntity$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x005e. Please report as an issue. */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        Object obj17;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj18 = null;
        Object obj19 = null;
        Object obj20 = null;
        Object obj21 = null;
        Object obj22 = null;
        Object obj23 = null;
        Object obj24 = null;
        Object obj25 = null;
        Object obj26 = null;
        Object obj27 = null;
        Object obj28 = null;
        Object obj29 = null;
        Object obj30 = null;
        Object obj31 = null;
        Object obj32 = null;
        Object obj33 = null;
        Object obj34 = null;
        Object obj35 = null;
        Object obj36 = null;
        Object obj37 = null;
        Object obj38 = null;
        Object obj39 = null;
        Object obj40 = null;
        Object obj41 = null;
        Object obj42 = null;
        Object obj43 = null;
        Object obj44 = null;
        Object obj45 = null;
        Object obj46 = null;
        Object obj47 = null;
        Object obj48 = null;
        Object obj49 = null;
        Object obj50 = null;
        Object obj51 = null;
        Object obj52 = null;
        Object obj53 = null;
        Object obj54 = null;
        Object obj55 = null;
        Object obj56 = null;
        Object obj57 = null;
        Object obj58 = null;
        Object obj59 = null;
        Object obj60 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                Object obj61 = obj22;
                Object obj62 = obj24;
                Object obj63 = obj58;
                return new SyncEntity((SyncEntityType) obj18, (String) obj30, (Long) obj31, (Long) obj32, (Boolean) obj33, (Boolean) obj34, (DomainType) obj35, (Long) obj36, (Long) obj37, (Long) obj38, (BadgingInfo) obj28, (SyncPayment) obj39, (SyncCustomer) obj40, (SyncLoyaltyAccount) obj41, (SyncRewardSelection) obj42, (SyncLoyaltyProgram) obj43, (SyncInvestmentHolding) obj44, (SyncInvestmentEntity) obj45, (SyncReceiptEntity) obj46, (SyncValue) obj47, (CreditLine) obj48, (Loan) obj49, (LoanTransaction) obj50, (SyncInvitation) obj51, (SyncRecurringPreference) obj52, (SyncInvestmentCategory) obj53, (SyncInvestmentFilterGroup) obj54, (SyncInvestmentEntityRanking) obj55, (SyncInvestmentIncentive) obj57, (SyncCheckDepositReceiptEntity) obj63, (EncryptedSyncEntity) obj23, (InvestDefaultNotificationSettings) obj62, (CashHouseScreen) obj25, (DocumentCategoryEntity) obj26, (DocumentEntity) obj27, (SyncBusinessGrant) obj59, (SyncGiftCardEntity) obj60, (SyncCryptoPayrollPreference) obj29, (SyncAccountStatementEntity) obj19, (SyncGroup) obj20, (SyncGroupExpense) obj21, (TradingState.DividendSetting) obj56, (SyncReactions) obj61, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    Object obj64 = obj57;
                    obj4 = obj59;
                    Object obj65 = obj39;
                    obj5 = obj64;
                    obj = obj22;
                    obj6 = obj24;
                    obj7 = obj58;
                    try {
                        obj39 = obj65;
                        obj59 = obj4;
                        obj57 = obj5;
                        obj17 = SyncEntityType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj8 = obj65;
                        obj9 = obj60;
                        obj10 = obj19;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                    obj58 = obj7;
                    obj15 = obj17;
                    obj24 = obj6;
                    obj14 = obj15;
                    obj22 = obj;
                    break;
                case 2:
                    obj = obj22;
                    obj11 = obj24;
                    obj12 = obj57;
                    obj13 = obj59;
                    obj30 = ProtoAdapter.STRING.decode(protoReader);
                    obj59 = obj13;
                    obj14 = obj18;
                    obj24 = obj11;
                    obj57 = obj12;
                    obj22 = obj;
                    break;
                case 3:
                    obj = obj22;
                    obj11 = obj24;
                    obj12 = obj57;
                    obj13 = obj59;
                    obj39 = TransactorKt.decodeMessageOrMerge(SyncPayment.ADAPTER, protoReader, obj39);
                    obj59 = obj13;
                    obj14 = obj18;
                    obj24 = obj11;
                    obj57 = obj12;
                    obj22 = obj;
                    break;
                case 4:
                    obj = obj22;
                    obj11 = obj24;
                    obj12 = obj57;
                    obj13 = obj59;
                    obj40 = TransactorKt.decodeMessageOrMerge(SyncCustomer.ADAPTER, protoReader, obj40);
                    obj59 = obj13;
                    obj14 = obj18;
                    obj24 = obj11;
                    obj57 = obj12;
                    obj22 = obj;
                    break;
                case 5:
                    obj = obj22;
                    obj11 = obj24;
                    obj12 = obj57;
                    obj13 = obj59;
                    obj41 = TransactorKt.decodeMessageOrMerge(SyncLoyaltyAccount.ADAPTER, protoReader, obj41);
                    obj59 = obj13;
                    obj14 = obj18;
                    obj24 = obj11;
                    obj57 = obj12;
                    obj22 = obj;
                    break;
                case 6:
                    obj = obj22;
                    obj11 = obj24;
                    obj12 = obj57;
                    obj13 = obj59;
                    obj42 = TransactorKt.decodeMessageOrMerge(SyncRewardSelection.ADAPTER, protoReader, obj42);
                    obj59 = obj13;
                    obj14 = obj18;
                    obj24 = obj11;
                    obj57 = obj12;
                    obj22 = obj;
                    break;
                case 7:
                    obj = obj22;
                    obj11 = obj24;
                    obj12 = obj57;
                    obj13 = obj59;
                    obj43 = TransactorKt.decodeMessageOrMerge(SyncLoyaltyProgram.ADAPTER, protoReader, obj43);
                    obj59 = obj13;
                    obj14 = obj18;
                    obj24 = obj11;
                    obj57 = obj12;
                    obj22 = obj;
                    break;
                case 8:
                    obj = obj22;
                    obj11 = obj24;
                    obj12 = obj57;
                    obj13 = obj59;
                    obj44 = TransactorKt.decodeMessageOrMerge(SyncInvestmentHolding.ADAPTER, protoReader, obj44);
                    obj59 = obj13;
                    obj14 = obj18;
                    obj24 = obj11;
                    obj57 = obj12;
                    obj22 = obj;
                    break;
                case 9:
                    obj = obj22;
                    obj11 = obj24;
                    obj12 = obj57;
                    obj13 = obj59;
                    obj45 = TransactorKt.decodeMessageOrMerge(SyncInvestmentEntity.ADAPTER, protoReader, obj45);
                    obj59 = obj13;
                    obj14 = obj18;
                    obj24 = obj11;
                    obj57 = obj12;
                    obj22 = obj;
                    break;
                case 10:
                    obj = obj22;
                    obj11 = obj24;
                    obj12 = obj57;
                    obj13 = obj59;
                    obj31 = ProtoAdapter.INT64.decode(protoReader);
                    obj59 = obj13;
                    obj14 = obj18;
                    obj24 = obj11;
                    obj57 = obj12;
                    obj22 = obj;
                    break;
                case 11:
                case 14:
                case 31:
                default:
                    protoReader.readUnknownField(nextTag);
                    obj9 = obj60;
                    obj10 = obj19;
                    obj = obj22;
                    obj6 = obj24;
                    obj7 = obj58;
                    obj8 = obj39;
                    obj5 = obj57;
                    obj4 = obj59;
                    obj17 = obj18;
                    obj59 = obj4;
                    obj19 = obj10;
                    obj60 = obj9;
                    obj57 = obj5;
                    obj39 = obj8;
                    obj58 = obj7;
                    obj15 = obj17;
                    obj24 = obj6;
                    obj14 = obj15;
                    obj22 = obj;
                    break;
                case 12:
                    obj = obj22;
                    obj11 = obj24;
                    obj12 = obj57;
                    obj13 = obj59;
                    obj46 = TransactorKt.decodeMessageOrMerge(SyncReceiptEntity.ADAPTER, protoReader, obj46);
                    obj59 = obj13;
                    obj14 = obj18;
                    obj24 = obj11;
                    obj57 = obj12;
                    obj22 = obj;
                    break;
                case 13:
                    obj = obj22;
                    obj11 = obj24;
                    obj12 = obj57;
                    obj13 = obj59;
                    obj47 = TransactorKt.decodeMessageOrMerge(SyncValue.ADAPTER, protoReader, obj47);
                    obj59 = obj13;
                    obj14 = obj18;
                    obj24 = obj11;
                    obj57 = obj12;
                    obj22 = obj;
                    break;
                case 15:
                    obj = obj22;
                    obj11 = obj24;
                    obj12 = obj57;
                    obj13 = obj59;
                    obj32 = ProtoAdapter.INT64.decode(protoReader);
                    obj59 = obj13;
                    obj14 = obj18;
                    obj24 = obj11;
                    obj57 = obj12;
                    obj22 = obj;
                    break;
                case 16:
                    obj = obj22;
                    obj11 = obj24;
                    obj12 = obj57;
                    obj13 = obj59;
                    obj48 = TransactorKt.decodeMessageOrMerge(CreditLine.ADAPTER, protoReader, obj48);
                    obj59 = obj13;
                    obj14 = obj18;
                    obj24 = obj11;
                    obj57 = obj12;
                    obj22 = obj;
                    break;
                case 17:
                    obj = obj22;
                    obj11 = obj24;
                    obj12 = obj57;
                    obj13 = obj59;
                    obj49 = TransactorKt.decodeMessageOrMerge(Loan.ADAPTER, protoReader, obj49);
                    obj59 = obj13;
                    obj14 = obj18;
                    obj24 = obj11;
                    obj57 = obj12;
                    obj22 = obj;
                    break;
                case 18:
                    obj = obj22;
                    obj11 = obj24;
                    obj12 = obj57;
                    obj13 = obj59;
                    obj50 = TransactorKt.decodeMessageOrMerge(LoanTransaction.ADAPTER, protoReader, obj50);
                    obj59 = obj13;
                    obj14 = obj18;
                    obj24 = obj11;
                    obj57 = obj12;
                    obj22 = obj;
                    break;
                case 19:
                    obj = obj22;
                    obj11 = obj24;
                    obj12 = obj57;
                    obj13 = obj59;
                    obj51 = TransactorKt.decodeMessageOrMerge(SyncInvitation.ADAPTER, protoReader, obj51);
                    obj59 = obj13;
                    obj14 = obj18;
                    obj24 = obj11;
                    obj57 = obj12;
                    obj22 = obj;
                    break;
                case 20:
                    obj = obj22;
                    obj11 = obj24;
                    obj12 = obj57;
                    obj13 = obj59;
                    obj52 = TransactorKt.decodeMessageOrMerge(SyncRecurringPreference.ADAPTER, protoReader, obj52);
                    obj59 = obj13;
                    obj14 = obj18;
                    obj24 = obj11;
                    obj57 = obj12;
                    obj22 = obj;
                    break;
                case 21:
                    obj = obj22;
                    obj11 = obj24;
                    obj12 = obj57;
                    obj13 = obj59;
                    obj53 = TransactorKt.decodeMessageOrMerge(SyncInvestmentCategory.ADAPTER, protoReader, obj53);
                    obj59 = obj13;
                    obj14 = obj18;
                    obj24 = obj11;
                    obj57 = obj12;
                    obj22 = obj;
                    break;
                case 22:
                    obj = obj22;
                    obj11 = obj24;
                    obj12 = obj57;
                    obj13 = obj59;
                    obj54 = TransactorKt.decodeMessageOrMerge(SyncInvestmentFilterGroup.ADAPTER, protoReader, obj54);
                    obj59 = obj13;
                    obj14 = obj18;
                    obj24 = obj11;
                    obj57 = obj12;
                    obj22 = obj;
                    break;
                case 23:
                    obj = obj22;
                    obj11 = obj24;
                    obj12 = obj57;
                    obj13 = obj59;
                    obj55 = TransactorKt.decodeMessageOrMerge(SyncInvestmentEntityRanking.ADAPTER, protoReader, obj55);
                    obj59 = obj13;
                    obj14 = obj18;
                    obj24 = obj11;
                    obj57 = obj12;
                    obj22 = obj;
                    break;
                case 24:
                    obj = obj22;
                    obj6 = obj24;
                    obj57 = TransactorKt.decodeMessageOrMerge(SyncInvestmentIncentive.ADAPTER, protoReader, obj57);
                    obj15 = obj18;
                    obj24 = obj6;
                    obj14 = obj15;
                    obj22 = obj;
                    break;
                case 25:
                    obj16 = obj22;
                    obj58 = TransactorKt.decodeMessageOrMerge(SyncCheckDepositReceiptEntity.ADAPTER, protoReader, obj58);
                    obj24 = obj24;
                    obj22 = obj16;
                    obj14 = obj18;
                    break;
                case 26:
                    obj16 = obj22;
                    obj23 = TransactorKt.decodeMessageOrMerge(EncryptedSyncEntity.ADAPTER, protoReader, obj23);
                    obj22 = obj16;
                    obj14 = obj18;
                    break;
                case 27:
                    obj16 = obj22;
                    obj24 = TransactorKt.decodeMessageOrMerge(InvestDefaultNotificationSettings.ADAPTER, protoReader, obj24);
                    obj22 = obj16;
                    obj14 = obj18;
                    break;
                case 28:
                    obj33 = ProtoAdapter.BOOL.decode(protoReader);
                    obj14 = obj18;
                    break;
                case 29:
                    obj25 = TransactorKt.decodeMessageOrMerge(CashHouseScreen.ADAPTER, protoReader, obj25);
                    obj14 = obj18;
                    break;
                case 30:
                    obj34 = ProtoAdapter.BOOL.decode(protoReader);
                    obj14 = obj18;
                    break;
                case 32:
                    obj26 = TransactorKt.decodeMessageOrMerge(DocumentCategoryEntity.ADAPTER, protoReader, obj26);
                    obj14 = obj18;
                    break;
                case 33:
                    obj27 = TransactorKt.decodeMessageOrMerge(DocumentEntity.ADAPTER, protoReader, obj27);
                    obj14 = obj18;
                    break;
                case 34:
                    obj59 = TransactorKt.decodeMessageOrMerge(SyncBusinessGrant.ADAPTER, protoReader, obj59);
                    obj14 = obj18;
                    break;
                case 35:
                    obj60 = TransactorKt.decodeMessageOrMerge(SyncGiftCardEntity.ADAPTER, protoReader, obj60);
                    obj14 = obj18;
                    break;
                case 36:
                    obj29 = TransactorKt.decodeMessageOrMerge(SyncCryptoPayrollPreference.ADAPTER, protoReader, obj29);
                    obj14 = obj18;
                    break;
                case 37:
                    obj19 = TransactorKt.decodeMessageOrMerge(SyncAccountStatementEntity.ADAPTER, protoReader, obj19);
                    obj14 = obj18;
                    break;
                case 38:
                    obj = obj22;
                    obj2 = obj23;
                    obj3 = obj24;
                    try {
                        obj35 = DomainType.ADAPTER.decode(protoReader);
                        obj22 = obj;
                        obj23 = obj2;
                        obj24 = obj3;
                        obj14 = obj18;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        obj7 = obj58;
                        obj23 = obj2;
                        obj6 = obj3;
                        obj9 = obj60;
                        obj10 = obj19;
                        obj8 = obj39;
                        obj5 = obj57;
                        obj4 = obj59;
                        obj17 = obj18;
                        obj59 = obj4;
                        obj19 = obj10;
                        obj60 = obj9;
                        obj57 = obj5;
                        obj39 = obj8;
                        obj58 = obj7;
                        obj15 = obj17;
                        obj24 = obj6;
                        obj14 = obj15;
                        obj22 = obj;
                        obj18 = obj14;
                    }
                case 39:
                    obj36 = ProtoAdapter.INT64.decode(protoReader);
                    obj14 = obj18;
                    break;
                case 40:
                    obj20 = TransactorKt.decodeMessageOrMerge(SyncGroup.ADAPTER, protoReader, obj20);
                    obj14 = obj18;
                    break;
                case 41:
                    obj21 = TransactorKt.decodeMessageOrMerge(SyncGroupExpense.ADAPTER, protoReader, obj21);
                    obj14 = obj18;
                    break;
                case 42:
                    try {
                        obj56 = TradingState.DividendSetting.ADAPTER.decode(protoReader);
                        obj14 = obj18;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        obj = obj22;
                        obj2 = obj23;
                        obj3 = obj24;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        obj7 = obj58;
                        obj23 = obj2;
                        obj6 = obj3;
                        obj9 = obj60;
                        obj10 = obj19;
                        obj8 = obj39;
                        obj5 = obj57;
                        obj4 = obj59;
                        obj17 = obj18;
                        obj59 = obj4;
                        obj19 = obj10;
                        obj60 = obj9;
                        obj57 = obj5;
                        obj39 = obj8;
                        obj58 = obj7;
                        obj15 = obj17;
                        obj24 = obj6;
                        obj14 = obj15;
                        obj22 = obj;
                        obj18 = obj14;
                    }
                case 43:
                    obj37 = ProtoAdapter.INT64.decode(protoReader);
                    obj14 = obj18;
                    break;
                case 44:
                    obj22 = TransactorKt.decodeMessageOrMerge(SyncReactions.ADAPTER, protoReader, obj22);
                    obj14 = obj18;
                    break;
                case 45:
                    obj38 = ProtoAdapter.INT64.decode(protoReader);
                    obj14 = obj18;
                    break;
                case 46:
                    obj28 = TransactorKt.decodeMessageOrMerge(BadgingInfo.ADAPTER, protoReader, obj28);
                    obj14 = obj18;
                    break;
            }
            obj18 = obj14;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncEntity syncEntity = (SyncEntity) obj;
        reverseProtoWriter.getClass();
        syncEntity.getClass();
        reverseProtoWriter.writeBytes(syncEntity.unknownFields());
        SyncReactions.ADAPTER.encodeWithTag(reverseProtoWriter, 44, syncEntity.reactions);
        TradingState.DividendSetting.ADAPTER.encodeWithTag(reverseProtoWriter, 42, syncEntity.invest_default_dividend_setting);
        SyncGroupExpense.ADAPTER.encodeWithTag(reverseProtoWriter, 41, syncEntity.group_expense);
        SyncGroup.ADAPTER.encodeWithTag(reverseProtoWriter, 40, syncEntity.group);
        SyncAccountStatementEntity.ADAPTER.encodeWithTag(reverseProtoWriter, 37, syncEntity.account_statement);
        SyncCryptoPayrollPreference.ADAPTER.encodeWithTag(reverseProtoWriter, 36, syncEntity.crypto_payroll_preference);
        SyncGiftCardEntity.ADAPTER.encodeWithTag(reverseProtoWriter, 35, syncEntity.gift_card);
        SyncBusinessGrant.ADAPTER.encodeWithTag(reverseProtoWriter, 34, syncEntity.business_grant);
        DocumentEntity.ADAPTER.encodeWithTag(reverseProtoWriter, 33, syncEntity.document_entity);
        DocumentCategoryEntity.ADAPTER.encodeWithTag(reverseProtoWriter, 32, syncEntity.document_category_entity);
        CashHouseScreen.ADAPTER.encodeWithTag(reverseProtoWriter, 29, syncEntity.cash_house_screen);
        InvestDefaultNotificationSettings.ADAPTER.encodeWithTag(reverseProtoWriter, 27, syncEntity.invest_default_notification_settings);
        EncryptedSyncEntity.ADAPTER.encodeWithTag(reverseProtoWriter, 26, syncEntity.encrypted_sync_entity);
        SyncCheckDepositReceiptEntity.ADAPTER.encodeWithTag(reverseProtoWriter, 25, syncEntity.check_deposit_receipt_entity);
        SyncInvestmentIncentive.ADAPTER.encodeWithTag(reverseProtoWriter, 24, syncEntity.investment_incentive);
        SyncInvestmentEntityRanking.ADAPTER.encodeWithTag(reverseProtoWriter, 23, syncEntity.investment_entity_ranking);
        SyncInvestmentFilterGroup.ADAPTER.encodeWithTag(reverseProtoWriter, 22, syncEntity.investment_filter_group);
        SyncInvestmentCategory.ADAPTER.encodeWithTag(reverseProtoWriter, 21, syncEntity.investment_category);
        SyncRecurringPreference.ADAPTER.encodeWithTag(reverseProtoWriter, 20, syncEntity.recurring_preference);
        SyncInvitation.ADAPTER.encodeWithTag(reverseProtoWriter, 19, syncEntity.invitation);
        LoanTransaction.ADAPTER.encodeWithTag(reverseProtoWriter, 18, syncEntity.loan_transaction);
        Loan.ADAPTER.encodeWithTag(reverseProtoWriter, 17, syncEntity.loan);
        CreditLine.ADAPTER.encodeWithTag(reverseProtoWriter, 16, syncEntity.credit_line);
        SyncValue.ADAPTER.encodeWithTag(reverseProtoWriter, 13, syncEntity.sync_value);
        SyncReceiptEntity.ADAPTER.encodeWithTag(reverseProtoWriter, 12, syncEntity.receipt_entity);
        SyncInvestmentEntity.ADAPTER.encodeWithTag(reverseProtoWriter, 9, syncEntity.investment_entity);
        SyncInvestmentHolding.ADAPTER.encodeWithTag(reverseProtoWriter, 8, syncEntity.investment_holding);
        SyncLoyaltyProgram.ADAPTER.encodeWithTag(reverseProtoWriter, 7, syncEntity.loyalty_program);
        SyncRewardSelection.ADAPTER.encodeWithTag(reverseProtoWriter, 6, syncEntity.reward_selection);
        SyncLoyaltyAccount.ADAPTER.encodeWithTag(reverseProtoWriter, 5, syncEntity.loyalty_account);
        SyncCustomer.ADAPTER.encodeWithTag(reverseProtoWriter, 4, syncEntity.customer);
        SyncPayment.ADAPTER.encodeWithTag(reverseProtoWriter, 3, syncEntity.payment);
        BadgingInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 46, syncEntity.badging_info);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 45, syncEntity.external_version);
        protoAdapter.encodeWithTag(reverseProtoWriter, 43, syncEntity.schema_version);
        protoAdapter.encodeWithTag(reverseProtoWriter, 39, syncEntity.client_sync_stored_at);
        DomainType.ADAPTER.encodeWithTag(reverseProtoWriter, 38, syncEntity.domain_type);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 30, syncEntity.deleted);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 28, syncEntity.is_unrendered);
        protoAdapter.encodeWithTag(reverseProtoWriter, 15, syncEntity.display_date);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, syncEntity.version);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, syncEntity.entity_id);
        SyncEntityType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, syncEntity.f1388type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncEntity syncEntity = (SyncEntity) obj;
        syncEntity.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(2, syncEntity.entity_id) + SyncEntityType.ADAPTER.encodedSizeWithTag(1, syncEntity.f1388type) + syncEntity.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(15, syncEntity.display_date) + protoAdapter.encodedSizeWithTag(10, syncEntity.version) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        return SyncReactions.ADAPTER.encodedSizeWithTag(44, syncEntity.reactions) + TradingState.DividendSetting.ADAPTER.encodedSizeWithTag(42, syncEntity.invest_default_dividend_setting) + SyncGroupExpense.ADAPTER.encodedSizeWithTag(41, syncEntity.group_expense) + SyncGroup.ADAPTER.encodedSizeWithTag(40, syncEntity.group) + SyncAccountStatementEntity.ADAPTER.encodedSizeWithTag(37, syncEntity.account_statement) + SyncCryptoPayrollPreference.ADAPTER.encodedSizeWithTag(36, syncEntity.crypto_payroll_preference) + SyncGiftCardEntity.ADAPTER.encodedSizeWithTag(35, syncEntity.gift_card) + SyncBusinessGrant.ADAPTER.encodedSizeWithTag(34, syncEntity.business_grant) + DocumentEntity.ADAPTER.encodedSizeWithTag(33, syncEntity.document_entity) + DocumentCategoryEntity.ADAPTER.encodedSizeWithTag(32, syncEntity.document_category_entity) + CashHouseScreen.ADAPTER.encodedSizeWithTag(29, syncEntity.cash_house_screen) + InvestDefaultNotificationSettings.ADAPTER.encodedSizeWithTag(27, syncEntity.invest_default_notification_settings) + EncryptedSyncEntity.ADAPTER.encodedSizeWithTag(26, syncEntity.encrypted_sync_entity) + SyncCheckDepositReceiptEntity.ADAPTER.encodedSizeWithTag(25, syncEntity.check_deposit_receipt_entity) + SyncInvestmentIncentive.ADAPTER.encodedSizeWithTag(24, syncEntity.investment_incentive) + SyncInvestmentEntityRanking.ADAPTER.encodedSizeWithTag(23, syncEntity.investment_entity_ranking) + SyncInvestmentFilterGroup.ADAPTER.encodedSizeWithTag(22, syncEntity.investment_filter_group) + SyncInvestmentCategory.ADAPTER.encodedSizeWithTag(21, syncEntity.investment_category) + SyncRecurringPreference.ADAPTER.encodedSizeWithTag(20, syncEntity.recurring_preference) + SyncInvitation.ADAPTER.encodedSizeWithTag(19, syncEntity.invitation) + LoanTransaction.ADAPTER.encodedSizeWithTag(18, syncEntity.loan_transaction) + Loan.ADAPTER.encodedSizeWithTag(17, syncEntity.loan) + CreditLine.ADAPTER.encodedSizeWithTag(16, syncEntity.credit_line) + SyncValue.ADAPTER.encodedSizeWithTag(13, syncEntity.sync_value) + SyncReceiptEntity.ADAPTER.encodedSizeWithTag(12, syncEntity.receipt_entity) + SyncInvestmentEntity.ADAPTER.encodedSizeWithTag(9, syncEntity.investment_entity) + SyncInvestmentHolding.ADAPTER.encodedSizeWithTag(8, syncEntity.investment_holding) + SyncLoyaltyProgram.ADAPTER.encodedSizeWithTag(7, syncEntity.loyalty_program) + SyncRewardSelection.ADAPTER.encodedSizeWithTag(6, syncEntity.reward_selection) + SyncLoyaltyAccount.ADAPTER.encodedSizeWithTag(5, syncEntity.loyalty_account) + SyncCustomer.ADAPTER.encodedSizeWithTag(4, syncEntity.customer) + SyncPayment.ADAPTER.encodedSizeWithTag(3, syncEntity.payment) + BadgingInfo.ADAPTER.encodedSizeWithTag(46, syncEntity.badging_info) + protoAdapter.encodedSizeWithTag(45, syncEntity.external_version) + protoAdapter.encodedSizeWithTag(43, syncEntity.schema_version) + protoAdapter.encodedSizeWithTag(39, syncEntity.client_sync_stored_at) + DomainType.ADAPTER.encodedSizeWithTag(38, syncEntity.domain_type) + protoAdapter2.encodedSizeWithTag(30, syncEntity.deleted) + protoAdapter2.encodedSizeWithTag(28, syncEntity.is_unrendered) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncEntity syncEntity = (SyncEntity) obj;
        syncEntity.getClass();
        BadgingInfo badgingInfo = syncEntity.badging_info;
        BadgingInfo badgingInfo2 = badgingInfo != null ? (BadgingInfo) BadgingInfo.ADAPTER.redact(badgingInfo) : null;
        SyncPayment syncPayment = syncEntity.payment;
        SyncPayment syncPayment2 = syncPayment != null ? (SyncPayment) SyncPayment.ADAPTER.redact(syncPayment) : null;
        SyncCustomer syncCustomer = syncEntity.customer;
        SyncCustomer syncCustomer2 = syncCustomer != null ? (SyncCustomer) SyncCustomer.ADAPTER.redact(syncCustomer) : null;
        SyncLoyaltyAccount syncLoyaltyAccount = syncEntity.loyalty_account;
        SyncLoyaltyAccount syncLoyaltyAccount2 = syncLoyaltyAccount != null ? (SyncLoyaltyAccount) SyncLoyaltyAccount.ADAPTER.redact(syncLoyaltyAccount) : null;
        SyncRewardSelection syncRewardSelection = syncEntity.reward_selection;
        SyncRewardSelection syncRewardSelection2 = syncRewardSelection != null ? (SyncRewardSelection) SyncRewardSelection.ADAPTER.redact(syncRewardSelection) : null;
        SyncLoyaltyProgram syncLoyaltyProgram = syncEntity.loyalty_program;
        SyncLoyaltyProgram syncLoyaltyProgram2 = syncLoyaltyProgram != null ? (SyncLoyaltyProgram) SyncLoyaltyProgram.ADAPTER.redact(syncLoyaltyProgram) : null;
        SyncInvestmentHolding syncInvestmentHolding = syncEntity.investment_holding;
        SyncInvestmentHolding syncInvestmentHolding2 = syncInvestmentHolding != null ? (SyncInvestmentHolding) SyncInvestmentHolding.ADAPTER.redact(syncInvestmentHolding) : null;
        SyncInvestmentEntity syncInvestmentEntity = syncEntity.investment_entity;
        SyncInvestmentEntity syncInvestmentEntity2 = syncInvestmentEntity != null ? (SyncInvestmentEntity) SyncInvestmentEntity.ADAPTER.redact(syncInvestmentEntity) : null;
        SyncReceiptEntity syncReceiptEntity = syncEntity.receipt_entity;
        SyncReceiptEntity syncReceiptEntity2 = syncReceiptEntity != null ? (SyncReceiptEntity) SyncReceiptEntity.ADAPTER.redact(syncReceiptEntity) : null;
        SyncValue syncValue = syncEntity.sync_value;
        SyncValue syncValue2 = syncValue != null ? (SyncValue) SyncValue.ADAPTER.redact(syncValue) : null;
        CreditLine creditLine = syncEntity.credit_line;
        CreditLine creditLine2 = creditLine != null ? (CreditLine) CreditLine.ADAPTER.redact(creditLine) : null;
        Loan loan = syncEntity.loan;
        Loan loan2 = loan != null ? (Loan) Loan.ADAPTER.redact(loan) : null;
        LoanTransaction loanTransaction = syncEntity.loan_transaction;
        LoanTransaction loanTransaction2 = loanTransaction != null ? (LoanTransaction) LoanTransaction.ADAPTER.redact(loanTransaction) : null;
        SyncInvitation syncInvitation = syncEntity.invitation;
        SyncInvitation syncInvitation2 = syncInvitation != null ? (SyncInvitation) SyncInvitation.ADAPTER.redact(syncInvitation) : null;
        SyncRecurringPreference syncRecurringPreference = syncEntity.recurring_preference;
        SyncRecurringPreference syncRecurringPreference2 = syncRecurringPreference != null ? (SyncRecurringPreference) SyncRecurringPreference.ADAPTER.redact(syncRecurringPreference) : null;
        SyncInvestmentCategory syncInvestmentCategory = syncEntity.investment_category;
        SyncInvestmentCategory syncInvestmentCategory2 = syncInvestmentCategory != null ? (SyncInvestmentCategory) SyncInvestmentCategory.ADAPTER.redact(syncInvestmentCategory) : null;
        SyncInvestmentFilterGroup syncInvestmentFilterGroup = syncEntity.investment_filter_group;
        SyncInvestmentFilterGroup syncInvestmentFilterGroup2 = syncInvestmentFilterGroup != null ? (SyncInvestmentFilterGroup) SyncInvestmentFilterGroup.ADAPTER.redact(syncInvestmentFilterGroup) : null;
        SyncInvestmentEntityRanking syncInvestmentEntityRanking = syncEntity.investment_entity_ranking;
        SyncInvestmentEntityRanking syncInvestmentEntityRanking2 = syncInvestmentEntityRanking != null ? (SyncInvestmentEntityRanking) SyncInvestmentEntityRanking.ADAPTER.redact(syncInvestmentEntityRanking) : null;
        SyncInvestmentIncentive syncInvestmentIncentive = syncEntity.investment_incentive;
        SyncInvestmentIncentive syncInvestmentIncentive2 = syncInvestmentIncentive != null ? (SyncInvestmentIncentive) SyncInvestmentIncentive.ADAPTER.redact(syncInvestmentIncentive) : null;
        SyncCheckDepositReceiptEntity syncCheckDepositReceiptEntity = syncEntity.check_deposit_receipt_entity;
        SyncCheckDepositReceiptEntity syncCheckDepositReceiptEntity2 = syncCheckDepositReceiptEntity != null ? (SyncCheckDepositReceiptEntity) SyncCheckDepositReceiptEntity.ADAPTER.redact(syncCheckDepositReceiptEntity) : null;
        EncryptedSyncEntity encryptedSyncEntity = syncEntity.encrypted_sync_entity;
        EncryptedSyncEntity encryptedSyncEntity2 = encryptedSyncEntity != null ? (EncryptedSyncEntity) EncryptedSyncEntity.ADAPTER.redact(encryptedSyncEntity) : null;
        InvestDefaultNotificationSettings investDefaultNotificationSettings = syncEntity.invest_default_notification_settings;
        InvestDefaultNotificationSettings investDefaultNotificationSettings2 = investDefaultNotificationSettings != null ? (InvestDefaultNotificationSettings) InvestDefaultNotificationSettings.ADAPTER.redact(investDefaultNotificationSettings) : null;
        CashHouseScreen cashHouseScreen = syncEntity.cash_house_screen;
        CashHouseScreen cashHouseScreen2 = cashHouseScreen != null ? (CashHouseScreen) CashHouseScreen.ADAPTER.redact(cashHouseScreen) : null;
        DocumentCategoryEntity documentCategoryEntity = syncEntity.document_category_entity;
        DocumentCategoryEntity documentCategoryEntity2 = documentCategoryEntity != null ? (DocumentCategoryEntity) DocumentCategoryEntity.ADAPTER.redact(documentCategoryEntity) : null;
        DocumentEntity documentEntity = syncEntity.document_entity;
        DocumentEntity documentEntity2 = documentEntity != null ? (DocumentEntity) DocumentEntity.ADAPTER.redact(documentEntity) : null;
        SyncBusinessGrant syncBusinessGrant = syncEntity.business_grant;
        SyncBusinessGrant syncBusinessGrant2 = syncBusinessGrant != null ? (SyncBusinessGrant) SyncBusinessGrant.ADAPTER.redact(syncBusinessGrant) : null;
        SyncGiftCardEntity syncGiftCardEntity = syncEntity.gift_card;
        SyncGiftCardEntity syncGiftCardEntity2 = syncGiftCardEntity != null ? (SyncGiftCardEntity) SyncGiftCardEntity.ADAPTER.redact(syncGiftCardEntity) : null;
        SyncCryptoPayrollPreference syncCryptoPayrollPreference = syncEntity.crypto_payroll_preference;
        SyncCryptoPayrollPreference syncCryptoPayrollPreference2 = syncCryptoPayrollPreference != null ? (SyncCryptoPayrollPreference) SyncCryptoPayrollPreference.ADAPTER.redact(syncCryptoPayrollPreference) : null;
        SyncAccountStatementEntity syncAccountStatementEntity = syncEntity.account_statement;
        SyncAccountStatementEntity syncAccountStatementEntity2 = syncAccountStatementEntity != null ? (SyncAccountStatementEntity) SyncAccountStatementEntity.ADAPTER.redact(syncAccountStatementEntity) : null;
        SyncGroup syncGroup = syncEntity.group;
        SyncGroup syncGroup2 = syncGroup != null ? (SyncGroup) SyncGroup.ADAPTER.redact(syncGroup) : null;
        SyncGroupExpense syncGroupExpense = syncEntity.group_expense;
        SyncGroupExpense syncGroupExpense2 = syncGroupExpense != null ? (SyncGroupExpense) SyncGroupExpense.ADAPTER.redact(syncGroupExpense) : null;
        SyncReactions syncReactions = syncEntity.reactions;
        SyncReactions syncReactions2 = syncReactions != null ? (SyncReactions) SyncReactions.ADAPTER.redact(syncReactions) : null;
        ByteString byteString = ByteString.EMPTY;
        SyncEntityType syncEntityType = syncEntity.f1388type;
        String str = syncEntity.entity_id;
        Long l = syncEntity.version;
        Long l2 = syncEntity.display_date;
        Boolean bool = syncEntity.is_unrendered;
        Boolean bool2 = syncEntity.deleted;
        DomainType domainType = syncEntity.domain_type;
        Long l3 = syncEntity.client_sync_stored_at;
        Long l4 = syncEntity.schema_version;
        Long l5 = syncEntity.external_version;
        TradingState.DividendSetting dividendSetting = syncEntity.invest_default_dividend_setting;
        byteString.getClass();
        return new SyncEntity(syncEntityType, str, l, l2, bool, bool2, domainType, l3, l4, l5, badgingInfo2, syncPayment2, syncCustomer2, syncLoyaltyAccount2, syncRewardSelection2, syncLoyaltyProgram2, syncInvestmentHolding2, syncInvestmentEntity2, syncReceiptEntity2, syncValue2, creditLine2, loan2, loanTransaction2, syncInvitation2, syncRecurringPreference2, syncInvestmentCategory2, syncInvestmentFilterGroup2, syncInvestmentEntityRanking2, syncInvestmentIncentive2, syncCheckDepositReceiptEntity2, encryptedSyncEntity2, investDefaultNotificationSettings2, cashHouseScreen2, documentCategoryEntity2, documentEntity2, syncBusinessGrant2, syncGiftCardEntity2, syncCryptoPayrollPreference2, syncAccountStatementEntity2, syncGroup2, syncGroupExpense2, dividendSetting, syncReactions2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncEntity syncEntity = (SyncEntity) obj;
        syncEntity.getClass();
        SyncEntityType.ADAPTER.encodeWithTag(protoWriter, 1, syncEntity.f1388type);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, syncEntity.entity_id);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 10, syncEntity.version);
        protoAdapter.encodeWithTag(protoWriter, 15, syncEntity.display_date);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 28, syncEntity.is_unrendered);
        protoAdapter2.encodeWithTag(protoWriter, 30, syncEntity.deleted);
        DomainType.ADAPTER.encodeWithTag(protoWriter, 38, syncEntity.domain_type);
        protoAdapter.encodeWithTag(protoWriter, 39, syncEntity.client_sync_stored_at);
        protoAdapter.encodeWithTag(protoWriter, 43, syncEntity.schema_version);
        protoAdapter.encodeWithTag(protoWriter, 45, syncEntity.external_version);
        BadgingInfo.ADAPTER.encodeWithTag(protoWriter, 46, syncEntity.badging_info);
        SyncPayment.ADAPTER.encodeWithTag(protoWriter, 3, syncEntity.payment);
        SyncCustomer.ADAPTER.encodeWithTag(protoWriter, 4, syncEntity.customer);
        SyncLoyaltyAccount.ADAPTER.encodeWithTag(protoWriter, 5, syncEntity.loyalty_account);
        SyncRewardSelection.ADAPTER.encodeWithTag(protoWriter, 6, syncEntity.reward_selection);
        SyncLoyaltyProgram.ADAPTER.encodeWithTag(protoWriter, 7, syncEntity.loyalty_program);
        SyncInvestmentHolding.ADAPTER.encodeWithTag(protoWriter, 8, syncEntity.investment_holding);
        SyncInvestmentEntity.ADAPTER.encodeWithTag(protoWriter, 9, syncEntity.investment_entity);
        SyncReceiptEntity.ADAPTER.encodeWithTag(protoWriter, 12, syncEntity.receipt_entity);
        SyncValue.ADAPTER.encodeWithTag(protoWriter, 13, syncEntity.sync_value);
        CreditLine.ADAPTER.encodeWithTag(protoWriter, 16, syncEntity.credit_line);
        Loan.ADAPTER.encodeWithTag(protoWriter, 17, syncEntity.loan);
        LoanTransaction.ADAPTER.encodeWithTag(protoWriter, 18, syncEntity.loan_transaction);
        SyncInvitation.ADAPTER.encodeWithTag(protoWriter, 19, syncEntity.invitation);
        SyncRecurringPreference.ADAPTER.encodeWithTag(protoWriter, 20, syncEntity.recurring_preference);
        SyncInvestmentCategory.ADAPTER.encodeWithTag(protoWriter, 21, syncEntity.investment_category);
        SyncInvestmentFilterGroup.ADAPTER.encodeWithTag(protoWriter, 22, syncEntity.investment_filter_group);
        SyncInvestmentEntityRanking.ADAPTER.encodeWithTag(protoWriter, 23, syncEntity.investment_entity_ranking);
        SyncInvestmentIncentive.ADAPTER.encodeWithTag(protoWriter, 24, syncEntity.investment_incentive);
        SyncCheckDepositReceiptEntity.ADAPTER.encodeWithTag(protoWriter, 25, syncEntity.check_deposit_receipt_entity);
        EncryptedSyncEntity.ADAPTER.encodeWithTag(protoWriter, 26, syncEntity.encrypted_sync_entity);
        InvestDefaultNotificationSettings.ADAPTER.encodeWithTag(protoWriter, 27, syncEntity.invest_default_notification_settings);
        CashHouseScreen.ADAPTER.encodeWithTag(protoWriter, 29, syncEntity.cash_house_screen);
        DocumentCategoryEntity.ADAPTER.encodeWithTag(protoWriter, 32, syncEntity.document_category_entity);
        DocumentEntity.ADAPTER.encodeWithTag(protoWriter, 33, syncEntity.document_entity);
        SyncBusinessGrant.ADAPTER.encodeWithTag(protoWriter, 34, syncEntity.business_grant);
        SyncGiftCardEntity.ADAPTER.encodeWithTag(protoWriter, 35, syncEntity.gift_card);
        SyncCryptoPayrollPreference.ADAPTER.encodeWithTag(protoWriter, 36, syncEntity.crypto_payroll_preference);
        SyncAccountStatementEntity.ADAPTER.encodeWithTag(protoWriter, 37, syncEntity.account_statement);
        SyncGroup.ADAPTER.encodeWithTag(protoWriter, 40, syncEntity.group);
        SyncGroupExpense.ADAPTER.encodeWithTag(protoWriter, 41, syncEntity.group_expense);
        TradingState.DividendSetting.ADAPTER.encodeWithTag(protoWriter, 42, syncEntity.invest_default_dividend_setting);
        SyncReactions.ADAPTER.encodeWithTag(protoWriter, 44, syncEntity.reactions);
        protoWriter.writeBytes(syncEntity.unknownFields());
    }
}
