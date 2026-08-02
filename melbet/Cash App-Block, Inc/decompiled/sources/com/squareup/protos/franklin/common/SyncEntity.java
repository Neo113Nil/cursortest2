package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.syncentity.DomainType;
import com.squareup.protos.document.DocumentCategoryEntity;
import com.squareup.protos.document.DocumentEntity;
import com.squareup.protos.franklin.lending.CreditLine;
import com.squareup.protos.franklin.lending.Loan;
import com.squareup.protos.franklin.lending.LoanTransaction;
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
import squareup.cash.investcore.trading.syncvalues.TradingState;

/* loaded from: classes.dex */
public final class SyncEntity extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncEntity> CREATOR;
    public final SyncAccountStatementEntity account_statement;
    public final BadgingInfo badging_info;
    public final SyncBusinessGrant business_grant;
    public final CashHouseScreen cash_house_screen;
    public final SyncCheckDepositReceiptEntity check_deposit_receipt_entity;
    public final Long client_sync_stored_at;
    public final CreditLine credit_line;
    public final SyncCryptoPayrollPreference crypto_payroll_preference;
    public final SyncCustomer customer;
    public final Boolean deleted;
    public final Long display_date;
    public final DocumentCategoryEntity document_category_entity;
    public final DocumentEntity document_entity;
    public final DomainType domain_type;
    public final EncryptedSyncEntity encrypted_sync_entity;
    public final String entity_id;
    public final Long external_version;
    public final SyncGiftCardEntity gift_card;
    public final SyncGroup group;
    public final SyncGroupExpense group_expense;
    public final TradingState.DividendSetting invest_default_dividend_setting;
    public final InvestDefaultNotificationSettings invest_default_notification_settings;
    public final SyncInvestmentCategory investment_category;
    public final SyncInvestmentEntity investment_entity;
    public final SyncInvestmentEntityRanking investment_entity_ranking;
    public final SyncInvestmentFilterGroup investment_filter_group;
    public final SyncInvestmentHolding investment_holding;
    public final SyncInvestmentIncentive investment_incentive;
    public final SyncInvitation invitation;
    public final Boolean is_unrendered;
    public final Loan loan;
    public final LoanTransaction loan_transaction;
    public final SyncLoyaltyAccount loyalty_account;
    public final SyncLoyaltyProgram loyalty_program;
    public final SyncPayment payment;
    public final SyncReactions reactions;
    public final SyncReceiptEntity receipt_entity;
    public final SyncRecurringPreference recurring_preference;
    public final SyncRewardSelection reward_selection;
    public final Long schema_version;
    public final SyncValue sync_value;

    /* renamed from: type, reason: collision with root package name */
    public final SyncEntityType f1388type;
    public final Long version;

    /* loaded from: classes8.dex */
    public final class Builder extends Message.Builder {
        public SyncAccountStatementEntity account_statement;
        public BadgingInfo badging_info;
        public SyncBusinessGrant business_grant;
        public CashHouseScreen cash_house_screen;
        public SyncCheckDepositReceiptEntity check_deposit_receipt_entity;
        public Long client_sync_stored_at;
        public CreditLine credit_line;
        public SyncCryptoPayrollPreference crypto_payroll_preference;
        public SyncCustomer customer;
        public Boolean deleted;
        public Long display_date;
        public DocumentCategoryEntity document_category_entity;
        public DocumentEntity document_entity;
        public DomainType domain_type;
        public EncryptedSyncEntity encrypted_sync_entity;
        public String entity_id;
        public Long external_version;
        public SyncGiftCardEntity gift_card;
        public SyncGroup group;
        public SyncGroupExpense group_expense;
        public TradingState.DividendSetting invest_default_dividend_setting;
        public InvestDefaultNotificationSettings invest_default_notification_settings;
        public SyncInvestmentCategory investment_category;
        public SyncInvestmentEntity investment_entity;
        public SyncInvestmentEntityRanking investment_entity_ranking;
        public SyncInvestmentFilterGroup investment_filter_group;
        public SyncInvestmentHolding investment_holding;
        public SyncInvestmentIncentive investment_incentive;
        public SyncInvitation invitation;
        public Boolean is_unrendered;
        public Loan loan;
        public LoanTransaction loan_transaction;
        public SyncLoyaltyAccount loyalty_account;
        public SyncLoyaltyProgram loyalty_program;
        public SyncPayment payment;
        public SyncReactions reactions;
        public SyncReceiptEntity receipt_entity;
        public SyncRecurringPreference recurring_preference;
        public SyncRewardSelection reward_selection;
        public Long schema_version;
        public SyncValue sync_value;

        /* renamed from: type, reason: collision with root package name */
        public SyncEntityType f1389type;
        public Long version;

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            return new SyncEntity(this.f1389type, this.entity_id, this.version, this.display_date, this.is_unrendered, this.deleted, this.domain_type, this.client_sync_stored_at, this.schema_version, this.external_version, this.badging_info, this.payment, this.customer, this.loyalty_account, this.reward_selection, this.loyalty_program, this.investment_holding, this.investment_entity, this.receipt_entity, this.sync_value, this.credit_line, this.loan, this.loan_transaction, this.invitation, this.recurring_preference, this.investment_category, this.investment_filter_group, this.investment_entity_ranking, this.investment_incentive, this.check_deposit_receipt_entity, this.encrypted_sync_entity, this.invest_default_notification_settings, this.cash_house_screen, this.document_category_entity, this.document_entity, this.business_grant, this.gift_card, this.crypto_payroll_preference, this.account_statement, this.group, this.group_expense, this.invest_default_dividend_setting, this.reactions, buildUnknownFields());
        }
    }

    static {
        SyncEntity$Companion$ADAPTER$1 syncEntity$Companion$ADAPTER$1 = new SyncEntity$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncEntity.class), "type.googleapis.com/squareup.franklin.SyncEntity", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
        ADAPTER = syncEntity$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncEntity$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncEntity(SyncEntityType syncEntityType, String str, Long l, Long l2, Boolean bool, Boolean bool2, DomainType domainType, Long l3, Long l4, Long l5, BadgingInfo badgingInfo, SyncPayment syncPayment, SyncCustomer syncCustomer, SyncLoyaltyAccount syncLoyaltyAccount, SyncRewardSelection syncRewardSelection, SyncLoyaltyProgram syncLoyaltyProgram, SyncInvestmentHolding syncInvestmentHolding, SyncInvestmentEntity syncInvestmentEntity, SyncReceiptEntity syncReceiptEntity, SyncValue syncValue, CreditLine creditLine, Loan loan, LoanTransaction loanTransaction, SyncInvitation syncInvitation, SyncRecurringPreference syncRecurringPreference, SyncInvestmentCategory syncInvestmentCategory, SyncInvestmentFilterGroup syncInvestmentFilterGroup, SyncInvestmentEntityRanking syncInvestmentEntityRanking, SyncInvestmentIncentive syncInvestmentIncentive, SyncCheckDepositReceiptEntity syncCheckDepositReceiptEntity, EncryptedSyncEntity encryptedSyncEntity, InvestDefaultNotificationSettings investDefaultNotificationSettings, CashHouseScreen cashHouseScreen, DocumentCategoryEntity documentCategoryEntity, DocumentEntity documentEntity, SyncBusinessGrant syncBusinessGrant, SyncGiftCardEntity syncGiftCardEntity, SyncCryptoPayrollPreference syncCryptoPayrollPreference, SyncAccountStatementEntity syncAccountStatementEntity, SyncGroup syncGroup, SyncGroupExpense syncGroupExpense, TradingState.DividendSetting dividendSetting, SyncReactions syncReactions, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1388type = syncEntityType;
        this.entity_id = str;
        this.version = l;
        this.display_date = l2;
        this.is_unrendered = bool;
        this.deleted = bool2;
        this.domain_type = domainType;
        this.client_sync_stored_at = l3;
        this.schema_version = l4;
        this.external_version = l5;
        this.badging_info = badgingInfo;
        this.payment = syncPayment;
        this.customer = syncCustomer;
        this.loyalty_account = syncLoyaltyAccount;
        this.reward_selection = syncRewardSelection;
        this.loyalty_program = syncLoyaltyProgram;
        this.investment_holding = syncInvestmentHolding;
        this.investment_entity = syncInvestmentEntity;
        this.receipt_entity = syncReceiptEntity;
        this.sync_value = syncValue;
        this.credit_line = creditLine;
        this.loan = loan;
        this.loan_transaction = loanTransaction;
        this.invitation = syncInvitation;
        this.recurring_preference = syncRecurringPreference;
        this.investment_category = syncInvestmentCategory;
        this.investment_filter_group = syncInvestmentFilterGroup;
        this.investment_entity_ranking = syncInvestmentEntityRanking;
        this.investment_incentive = syncInvestmentIncentive;
        this.check_deposit_receipt_entity = syncCheckDepositReceiptEntity;
        this.encrypted_sync_entity = encryptedSyncEntity;
        this.invest_default_notification_settings = investDefaultNotificationSettings;
        this.cash_house_screen = cashHouseScreen;
        this.document_category_entity = documentCategoryEntity;
        this.document_entity = documentEntity;
        this.business_grant = syncBusinessGrant;
        this.gift_card = syncGiftCardEntity;
        this.crypto_payroll_preference = syncCryptoPayrollPreference;
        this.account_statement = syncAccountStatementEntity;
        this.group = syncGroup;
        this.group_expense = syncGroupExpense;
        this.invest_default_dividend_setting = dividendSetting;
        this.reactions = syncReactions;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncEntity)) {
            return false;
        }
        SyncEntity syncEntity = (SyncEntity) obj;
        return Intrinsics.areEqual(unknownFields(), syncEntity.unknownFields()) && this.f1388type == syncEntity.f1388type && Intrinsics.areEqual(this.entity_id, syncEntity.entity_id) && Intrinsics.areEqual(this.version, syncEntity.version) && Intrinsics.areEqual(this.display_date, syncEntity.display_date) && Intrinsics.areEqual(this.is_unrendered, syncEntity.is_unrendered) && Intrinsics.areEqual(this.deleted, syncEntity.deleted) && this.domain_type == syncEntity.domain_type && Intrinsics.areEqual(this.client_sync_stored_at, syncEntity.client_sync_stored_at) && Intrinsics.areEqual(this.schema_version, syncEntity.schema_version) && Intrinsics.areEqual(this.external_version, syncEntity.external_version) && Intrinsics.areEqual(this.badging_info, syncEntity.badging_info) && Intrinsics.areEqual(this.payment, syncEntity.payment) && Intrinsics.areEqual(this.customer, syncEntity.customer) && Intrinsics.areEqual(this.loyalty_account, syncEntity.loyalty_account) && Intrinsics.areEqual(this.reward_selection, syncEntity.reward_selection) && Intrinsics.areEqual(this.loyalty_program, syncEntity.loyalty_program) && Intrinsics.areEqual(this.investment_holding, syncEntity.investment_holding) && Intrinsics.areEqual(this.investment_entity, syncEntity.investment_entity) && Intrinsics.areEqual(this.receipt_entity, syncEntity.receipt_entity) && Intrinsics.areEqual(this.sync_value, syncEntity.sync_value) && Intrinsics.areEqual(this.credit_line, syncEntity.credit_line) && Intrinsics.areEqual(this.loan, syncEntity.loan) && Intrinsics.areEqual(this.loan_transaction, syncEntity.loan_transaction) && Intrinsics.areEqual(this.invitation, syncEntity.invitation) && Intrinsics.areEqual(this.recurring_preference, syncEntity.recurring_preference) && Intrinsics.areEqual(this.investment_category, syncEntity.investment_category) && Intrinsics.areEqual(this.investment_filter_group, syncEntity.investment_filter_group) && Intrinsics.areEqual(this.investment_entity_ranking, syncEntity.investment_entity_ranking) && Intrinsics.areEqual(this.investment_incentive, syncEntity.investment_incentive) && Intrinsics.areEqual(this.check_deposit_receipt_entity, syncEntity.check_deposit_receipt_entity) && Intrinsics.areEqual(this.encrypted_sync_entity, syncEntity.encrypted_sync_entity) && Intrinsics.areEqual(this.invest_default_notification_settings, syncEntity.invest_default_notification_settings) && Intrinsics.areEqual(this.cash_house_screen, syncEntity.cash_house_screen) && Intrinsics.areEqual(this.document_category_entity, syncEntity.document_category_entity) && Intrinsics.areEqual(this.document_entity, syncEntity.document_entity) && Intrinsics.areEqual(this.business_grant, syncEntity.business_grant) && Intrinsics.areEqual(this.gift_card, syncEntity.gift_card) && Intrinsics.areEqual(this.crypto_payroll_preference, syncEntity.crypto_payroll_preference) && Intrinsics.areEqual(this.account_statement, syncEntity.account_statement) && Intrinsics.areEqual(this.group, syncEntity.group) && Intrinsics.areEqual(this.group_expense, syncEntity.group_expense) && this.invest_default_dividend_setting == syncEntity.invest_default_dividend_setting && Intrinsics.areEqual(this.reactions, syncEntity.reactions);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SyncEntityType syncEntityType = this.f1388type;
        int hashCode2 = (hashCode + (syncEntityType != null ? syncEntityType.hashCode() : 0)) * 37;
        String str = this.entity_id;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.version;
        int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.display_date;
        int hashCode5 = (hashCode4 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Boolean bool = this.is_unrendered;
        int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.deleted;
        int hashCode7 = (hashCode6 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        DomainType domainType = this.domain_type;
        int hashCode8 = (hashCode7 + (domainType != null ? domainType.hashCode() : 0)) * 37;
        Long l3 = this.client_sync_stored_at;
        int hashCode9 = (hashCode8 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        Long l4 = this.schema_version;
        int hashCode10 = (hashCode9 + (l4 != null ? Long.hashCode(l4.longValue()) : 0)) * 37;
        Long l5 = this.external_version;
        int hashCode11 = (hashCode10 + (l5 != null ? Long.hashCode(l5.longValue()) : 0)) * 37;
        BadgingInfo badgingInfo = this.badging_info;
        int hashCode12 = (hashCode11 + (badgingInfo != null ? badgingInfo.hashCode() : 0)) * 37;
        SyncPayment syncPayment = this.payment;
        int hashCode13 = (hashCode12 + (syncPayment != null ? syncPayment.hashCode() : 0)) * 37;
        SyncCustomer syncCustomer = this.customer;
        int hashCode14 = (hashCode13 + (syncCustomer != null ? syncCustomer.hashCode() : 0)) * 37;
        SyncLoyaltyAccount syncLoyaltyAccount = this.loyalty_account;
        int hashCode15 = (hashCode14 + (syncLoyaltyAccount != null ? syncLoyaltyAccount.hashCode() : 0)) * 37;
        SyncRewardSelection syncRewardSelection = this.reward_selection;
        int hashCode16 = (hashCode15 + (syncRewardSelection != null ? syncRewardSelection.hashCode() : 0)) * 37;
        SyncLoyaltyProgram syncLoyaltyProgram = this.loyalty_program;
        int hashCode17 = (hashCode16 + (syncLoyaltyProgram != null ? syncLoyaltyProgram.hashCode() : 0)) * 37;
        SyncInvestmentHolding syncInvestmentHolding = this.investment_holding;
        int hashCode18 = (hashCode17 + (syncInvestmentHolding != null ? syncInvestmentHolding.hashCode() : 0)) * 37;
        SyncInvestmentEntity syncInvestmentEntity = this.investment_entity;
        int hashCode19 = (hashCode18 + (syncInvestmentEntity != null ? syncInvestmentEntity.hashCode() : 0)) * 37;
        SyncReceiptEntity syncReceiptEntity = this.receipt_entity;
        int hashCode20 = (hashCode19 + (syncReceiptEntity != null ? syncReceiptEntity.hashCode() : 0)) * 37;
        SyncValue syncValue = this.sync_value;
        int hashCode21 = (hashCode20 + (syncValue != null ? syncValue.hashCode() : 0)) * 37;
        CreditLine creditLine = this.credit_line;
        int hashCode22 = (hashCode21 + (creditLine != null ? creditLine.hashCode() : 0)) * 37;
        Loan loan = this.loan;
        int hashCode23 = (hashCode22 + (loan != null ? loan.hashCode() : 0)) * 37;
        LoanTransaction loanTransaction = this.loan_transaction;
        int hashCode24 = (hashCode23 + (loanTransaction != null ? loanTransaction.hashCode() : 0)) * 37;
        SyncInvitation syncInvitation = this.invitation;
        int hashCode25 = (hashCode24 + (syncInvitation != null ? syncInvitation.hashCode() : 0)) * 37;
        SyncRecurringPreference syncRecurringPreference = this.recurring_preference;
        int hashCode26 = (hashCode25 + (syncRecurringPreference != null ? syncRecurringPreference.hashCode() : 0)) * 37;
        SyncInvestmentCategory syncInvestmentCategory = this.investment_category;
        int hashCode27 = (hashCode26 + (syncInvestmentCategory != null ? syncInvestmentCategory.hashCode() : 0)) * 37;
        SyncInvestmentFilterGroup syncInvestmentFilterGroup = this.investment_filter_group;
        int hashCode28 = (hashCode27 + (syncInvestmentFilterGroup != null ? syncInvestmentFilterGroup.hashCode() : 0)) * 37;
        SyncInvestmentEntityRanking syncInvestmentEntityRanking = this.investment_entity_ranking;
        int hashCode29 = (hashCode28 + (syncInvestmentEntityRanking != null ? syncInvestmentEntityRanking.hashCode() : 0)) * 37;
        SyncInvestmentIncentive syncInvestmentIncentive = this.investment_incentive;
        int hashCode30 = (hashCode29 + (syncInvestmentIncentive != null ? syncInvestmentIncentive.hashCode() : 0)) * 37;
        SyncCheckDepositReceiptEntity syncCheckDepositReceiptEntity = this.check_deposit_receipt_entity;
        int hashCode31 = (hashCode30 + (syncCheckDepositReceiptEntity != null ? syncCheckDepositReceiptEntity.hashCode() : 0)) * 37;
        EncryptedSyncEntity encryptedSyncEntity = this.encrypted_sync_entity;
        int hashCode32 = (hashCode31 + (encryptedSyncEntity != null ? encryptedSyncEntity.hashCode() : 0)) * 37;
        InvestDefaultNotificationSettings investDefaultNotificationSettings = this.invest_default_notification_settings;
        int hashCode33 = (hashCode32 + (investDefaultNotificationSettings != null ? investDefaultNotificationSettings.hashCode() : 0)) * 37;
        CashHouseScreen cashHouseScreen = this.cash_house_screen;
        int hashCode34 = (hashCode33 + (cashHouseScreen != null ? cashHouseScreen.hashCode() : 0)) * 37;
        DocumentCategoryEntity documentCategoryEntity = this.document_category_entity;
        int hashCode35 = (hashCode34 + (documentCategoryEntity != null ? documentCategoryEntity.hashCode() : 0)) * 37;
        DocumentEntity documentEntity = this.document_entity;
        int hashCode36 = (hashCode35 + (documentEntity != null ? documentEntity.hashCode() : 0)) * 37;
        SyncBusinessGrant syncBusinessGrant = this.business_grant;
        int hashCode37 = (hashCode36 + (syncBusinessGrant != null ? syncBusinessGrant.hashCode() : 0)) * 37;
        SyncGiftCardEntity syncGiftCardEntity = this.gift_card;
        int hashCode38 = (hashCode37 + (syncGiftCardEntity != null ? syncGiftCardEntity.hashCode() : 0)) * 37;
        SyncCryptoPayrollPreference syncCryptoPayrollPreference = this.crypto_payroll_preference;
        int hashCode39 = (hashCode38 + (syncCryptoPayrollPreference != null ? syncCryptoPayrollPreference.hashCode() : 0)) * 37;
        SyncAccountStatementEntity syncAccountStatementEntity = this.account_statement;
        int hashCode40 = (hashCode39 + (syncAccountStatementEntity != null ? syncAccountStatementEntity.hashCode() : 0)) * 37;
        SyncGroup syncGroup = this.group;
        int hashCode41 = (hashCode40 + (syncGroup != null ? syncGroup.hashCode() : 0)) * 37;
        SyncGroupExpense syncGroupExpense = this.group_expense;
        int hashCode42 = (hashCode41 + (syncGroupExpense != null ? syncGroupExpense.hashCode() : 0)) * 37;
        TradingState.DividendSetting dividendSetting = this.invest_default_dividend_setting;
        int hashCode43 = (hashCode42 + (dividendSetting != null ? dividendSetting.hashCode() : 0)) * 37;
        SyncReactions syncReactions = this.reactions;
        int hashCode44 = hashCode43 + (syncReactions != null ? syncReactions.hashCode() : 0);
        this.hashCode = hashCode44;
        return hashCode44;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.f1389type = this.f1388type;
        builder.entity_id = this.entity_id;
        builder.version = this.version;
        builder.display_date = this.display_date;
        builder.is_unrendered = this.is_unrendered;
        builder.deleted = this.deleted;
        builder.domain_type = this.domain_type;
        builder.client_sync_stored_at = this.client_sync_stored_at;
        builder.schema_version = this.schema_version;
        builder.external_version = this.external_version;
        builder.badging_info = this.badging_info;
        builder.payment = this.payment;
        builder.customer = this.customer;
        builder.loyalty_account = this.loyalty_account;
        builder.reward_selection = this.reward_selection;
        builder.loyalty_program = this.loyalty_program;
        builder.investment_holding = this.investment_holding;
        builder.investment_entity = this.investment_entity;
        builder.receipt_entity = this.receipt_entity;
        builder.sync_value = this.sync_value;
        builder.credit_line = this.credit_line;
        builder.loan = this.loan;
        builder.loan_transaction = this.loan_transaction;
        builder.invitation = this.invitation;
        builder.recurring_preference = this.recurring_preference;
        builder.investment_category = this.investment_category;
        builder.investment_filter_group = this.investment_filter_group;
        builder.investment_entity_ranking = this.investment_entity_ranking;
        builder.investment_incentive = this.investment_incentive;
        builder.check_deposit_receipt_entity = this.check_deposit_receipt_entity;
        builder.encrypted_sync_entity = this.encrypted_sync_entity;
        builder.invest_default_notification_settings = this.invest_default_notification_settings;
        builder.cash_house_screen = this.cash_house_screen;
        builder.document_category_entity = this.document_category_entity;
        builder.document_entity = this.document_entity;
        builder.business_grant = this.business_grant;
        builder.gift_card = this.gift_card;
        builder.crypto_payroll_preference = this.crypto_payroll_preference;
        builder.account_statement = this.account_statement;
        builder.group = this.group;
        builder.group_expense = this.group_expense;
        builder.invest_default_dividend_setting = this.invest_default_dividend_setting;
        builder.reactions = this.reactions;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        SyncEntityType syncEntityType = this.f1388type;
        if (syncEntityType != null) {
            arrayList.add("type=" + syncEntityType);
        }
        String str = this.entity_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "entity_id=", arrayList);
        }
        Long l = this.version;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("version=", l, arrayList);
        }
        Long l2 = this.display_date;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("display_date=", l2, arrayList);
        }
        Boolean bool = this.is_unrendered;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_unrendered=", bool, arrayList);
        }
        Boolean bool2 = this.deleted;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("deleted=", bool2, arrayList);
        }
        DomainType domainType = this.domain_type;
        if (domainType != null) {
            arrayList.add("domain_type=" + domainType);
        }
        Long l3 = this.client_sync_stored_at;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("client_sync_stored_at=", l3, arrayList);
        }
        Long l4 = this.schema_version;
        if (l4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("schema_version=", l4, arrayList);
        }
        Long l5 = this.external_version;
        if (l5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("external_version=", l5, arrayList);
        }
        BadgingInfo badgingInfo = this.badging_info;
        if (badgingInfo != null) {
            arrayList.add("badging_info=" + badgingInfo);
        }
        SyncPayment syncPayment = this.payment;
        if (syncPayment != null) {
            arrayList.add("payment=" + syncPayment);
        }
        SyncCustomer syncCustomer = this.customer;
        if (syncCustomer != null) {
            arrayList.add("customer=" + syncCustomer);
        }
        SyncLoyaltyAccount syncLoyaltyAccount = this.loyalty_account;
        if (syncLoyaltyAccount != null) {
            arrayList.add("loyalty_account=" + syncLoyaltyAccount);
        }
        SyncRewardSelection syncRewardSelection = this.reward_selection;
        if (syncRewardSelection != null) {
            arrayList.add("reward_selection=" + syncRewardSelection);
        }
        SyncLoyaltyProgram syncLoyaltyProgram = this.loyalty_program;
        if (syncLoyaltyProgram != null) {
            arrayList.add("loyalty_program=" + syncLoyaltyProgram);
        }
        SyncInvestmentHolding syncInvestmentHolding = this.investment_holding;
        if (syncInvestmentHolding != null) {
            arrayList.add("investment_holding=" + syncInvestmentHolding);
        }
        SyncInvestmentEntity syncInvestmentEntity = this.investment_entity;
        if (syncInvestmentEntity != null) {
            arrayList.add("investment_entity=" + syncInvestmentEntity);
        }
        SyncReceiptEntity syncReceiptEntity = this.receipt_entity;
        if (syncReceiptEntity != null) {
            arrayList.add("receipt_entity=" + syncReceiptEntity);
        }
        SyncValue syncValue = this.sync_value;
        if (syncValue != null) {
            arrayList.add("sync_value=" + syncValue);
        }
        CreditLine creditLine = this.credit_line;
        if (creditLine != null) {
            arrayList.add("credit_line=" + creditLine);
        }
        Loan loan = this.loan;
        if (loan != null) {
            arrayList.add("loan=" + loan);
        }
        LoanTransaction loanTransaction = this.loan_transaction;
        if (loanTransaction != null) {
            arrayList.add("loan_transaction=" + loanTransaction);
        }
        SyncInvitation syncInvitation = this.invitation;
        if (syncInvitation != null) {
            arrayList.add("invitation=" + syncInvitation);
        }
        SyncRecurringPreference syncRecurringPreference = this.recurring_preference;
        if (syncRecurringPreference != null) {
            arrayList.add("recurring_preference=" + syncRecurringPreference);
        }
        SyncInvestmentCategory syncInvestmentCategory = this.investment_category;
        if (syncInvestmentCategory != null) {
            arrayList.add("investment_category=" + syncInvestmentCategory);
        }
        SyncInvestmentFilterGroup syncInvestmentFilterGroup = this.investment_filter_group;
        if (syncInvestmentFilterGroup != null) {
            arrayList.add("investment_filter_group=" + syncInvestmentFilterGroup);
        }
        SyncInvestmentEntityRanking syncInvestmentEntityRanking = this.investment_entity_ranking;
        if (syncInvestmentEntityRanking != null) {
            arrayList.add("investment_entity_ranking=" + syncInvestmentEntityRanking);
        }
        SyncInvestmentIncentive syncInvestmentIncentive = this.investment_incentive;
        if (syncInvestmentIncentive != null) {
            arrayList.add("investment_incentive=" + syncInvestmentIncentive);
        }
        SyncCheckDepositReceiptEntity syncCheckDepositReceiptEntity = this.check_deposit_receipt_entity;
        if (syncCheckDepositReceiptEntity != null) {
            arrayList.add("check_deposit_receipt_entity=" + syncCheckDepositReceiptEntity);
        }
        EncryptedSyncEntity encryptedSyncEntity = this.encrypted_sync_entity;
        if (encryptedSyncEntity != null) {
            arrayList.add("encrypted_sync_entity=" + encryptedSyncEntity);
        }
        InvestDefaultNotificationSettings investDefaultNotificationSettings = this.invest_default_notification_settings;
        if (investDefaultNotificationSettings != null) {
            arrayList.add("invest_default_notification_settings=" + investDefaultNotificationSettings);
        }
        CashHouseScreen cashHouseScreen = this.cash_house_screen;
        if (cashHouseScreen != null) {
            arrayList.add("cash_house_screen=" + cashHouseScreen);
        }
        DocumentCategoryEntity documentCategoryEntity = this.document_category_entity;
        if (documentCategoryEntity != null) {
            arrayList.add("document_category_entity=" + documentCategoryEntity);
        }
        DocumentEntity documentEntity = this.document_entity;
        if (documentEntity != null) {
            arrayList.add("document_entity=" + documentEntity);
        }
        SyncBusinessGrant syncBusinessGrant = this.business_grant;
        if (syncBusinessGrant != null) {
            arrayList.add("business_grant=" + syncBusinessGrant);
        }
        SyncGiftCardEntity syncGiftCardEntity = this.gift_card;
        if (syncGiftCardEntity != null) {
            arrayList.add("gift_card=" + syncGiftCardEntity);
        }
        SyncCryptoPayrollPreference syncCryptoPayrollPreference = this.crypto_payroll_preference;
        if (syncCryptoPayrollPreference != null) {
            arrayList.add("crypto_payroll_preference=" + syncCryptoPayrollPreference);
        }
        SyncAccountStatementEntity syncAccountStatementEntity = this.account_statement;
        if (syncAccountStatementEntity != null) {
            arrayList.add("account_statement=" + syncAccountStatementEntity);
        }
        SyncGroup syncGroup = this.group;
        if (syncGroup != null) {
            arrayList.add("group=" + syncGroup);
        }
        SyncGroupExpense syncGroupExpense = this.group_expense;
        if (syncGroupExpense != null) {
            arrayList.add("group_expense=" + syncGroupExpense);
        }
        TradingState.DividendSetting dividendSetting = this.invest_default_dividend_setting;
        if (dividendSetting != null) {
            arrayList.add("invest_default_dividend_setting=" + dividendSetting);
        }
        SyncReactions syncReactions = this.reactions;
        if (syncReactions != null) {
            arrayList.add("reactions=" + syncReactions);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncEntity{", "}", 0, null, null, 56);
    }
}
