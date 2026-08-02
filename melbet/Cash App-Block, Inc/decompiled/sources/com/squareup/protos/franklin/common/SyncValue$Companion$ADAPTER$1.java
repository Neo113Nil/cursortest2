package com.squareup.protos.franklin.common;

import com.plaid.internal.EnumC0170g;
import com.squareup.cash.bankingbenefits.ui.BankingBenefitsConfig;
import com.squareup.cash.cashoclock.api.v1_0.syncvalues.CashOClockPreference;
import com.squareup.cash.cashreactions.common.v1.AvailableReactions;
import com.squareup.cash.crow.sync_values.RestrictionsData;
import com.squareup.cash.cryptocurrency.SponsorshipCryptoAuthorization;
import com.squareup.cash.idv.DisplayName;
import com.squareup.cash.idv.ProfilePageUpsellComponentV2;
import com.squareup.cash.out.sync_entity.CashOutFeeData;
import com.squareup.cash.out.sync_entity.CashOutInstrumentCapabilityConfig;
import com.squareup.cash.remittances.syncvalue.v1.InternationalPaymentsCountryNotificationSyncValue;
import com.squareup.cash.remittances.syncvalue.v1.InternationalPaymentsCountrySelectionSyncValue;
import com.squareup.lending.sync_values.CashCreditScoreSyncData;
import com.squareup.lending.sync_values.PrepurchaseCashCardData;
import com.squareup.protos.access.sync_values.DeviceInfo;
import com.squareup.protos.access.sync_values.FeatureEligibilityRefreshPolicy;
import com.squareup.protos.access.sync_values.OTPInfo;
import com.squareup.protos.access.sync_values.PasskeyOptions;
import com.squareup.protos.access.sync_values.PasswordInfo;
import com.squareup.protos.cash.aegis.sync_values.UiFamilyAccount;
import com.squareup.protos.cash.aegis.sync_values.UiFamilyTile;
import com.squareup.protos.cash.appthemes.AppThemeDefinitions;
import com.squareup.protos.cash.badging.api.BadgingData;
import com.squareup.protos.cash.balancebasedaddcash.api.v1_0.syncvalues.BalanceBasedAddCashPreference;
import com.squareup.protos.cash.blockly.sync_values.P2PAllowListCustomer;
import com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightsConfig;
import com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightsHome;
import com.squareup.protos.cash.cashbusinessaccounts.BtcAppletRenderingState;
import com.squareup.protos.cash.cashbusinessaccounts.BusinessProfileData;
import com.squareup.protos.cash.cashbusinessaccounts.EarningsTrackerSummary;
import com.squareup.protos.cash.cashbusinessaccounts.KybEligibilityWarning;
import com.squareup.protos.cash.cashbusinessaccounts.TapToPay;
import com.squareup.protos.cash.cashbusinessaccounts.TapToPayDescriptionSuggestions;
import com.squareup.protos.cash.cashtaxgateway.sync_values.UiEfileInfo;
import com.squareup.protos.cash.cashvoice.syncentity.v1.SupportPhoneConfirmation;
import com.squareup.protos.cash.cats.Cats;
import com.squareup.protos.cash.commercebrowser.CommerceBrowserAutofillPreferences;
import com.squareup.protos.cash.cryptocurrency.Wallet;
import com.squareup.protos.cash.dataprivacy.settings.DataPrivacySettings;
import com.squareup.protos.cash.favorites.Favorite;
import com.squareup.protos.cash.fiatly.syncvalues.P2PControl;
import com.squareup.protos.cash.guardrails.api.v1.AccountSuspension;
import com.squareup.protos.cash.guardrails.api.v1.AdversityBanner;
import com.squareup.protos.cash.janus.syncvalues.SyncValueAccounts;
import com.squareup.protos.cash.janus.syncvalues.SyncValueAuthorizedAccount;
import com.squareup.protos.cash.kgoose.syncentity.CashGlobalUserSettings;
import com.squareup.protos.cash.kgoose.syncentity.CashUserSettings;
import com.squareup.protos.cash.lions.Lions;
import com.squareup.protos.cash.local.client.app.v1.account.LocalAccount;
import com.squareup.protos.cash.local.client.app.v1.account.LocalEarningCard;
import com.squareup.protos.cash.local.client.app.v1.card.LocalCard;
import com.squareup.protos.cash.local.client.app.v1.cashbalance.LocalCashBalance;
import com.squareup.protos.cash.local.client.app.v1.poscheckin.LocalPOSCheckIn;
import com.squareup.protos.cash.money.content.MoneyTab;
import com.squareup.protos.cash.money.content.VersionedFinishSetupTile;
import com.squareup.protos.cash.notificationsettings.clientsync.v1.UiNotificationSettings;
import com.squareup.protos.cash.offerdex.sync.OfferCustomerPreference;
import com.squareup.protos.cash.portfolios.syncvalues.PortfoliosHistoricalDataValue;
import com.squareup.protos.cash.portfolios.syncvalues.PortfoliosPerformanceValue;
import com.squareup.protos.cash.postbank.DemandDepositAccount;
import com.squareup.protos.cash.postcard.CashAppCard;
import com.squareup.protos.cash.profiles.DisplayNameDetails;
import com.squareup.protos.cash.profiles.ProfileDetails;
import com.squareup.protos.cash.rabbits.Rabbits;
import com.squareup.protos.cash.recipientsuggestion.RecipientSuggestions;
import com.squareup.protos.cash.shopping.CustomerShoppingPreference;
import com.squareup.protos.cash.staff.syncvalues.VersionedCashForWorkApplet;
import com.squareup.protos.cash.syncentitygateway.syncvalues.ClientSyncConfig;
import com.squareup.protos.cash.taply.syncvalues.CashAppTag;
import com.squareup.protos.cash.taply.syncvalues.TagThemeDefinitions;
import com.squareup.protos.cash.taxfrontdoor.sync_values.UiTaxUpgrade;
import com.squareup.protos.cash.tigers.Tigers;
import com.squareup.protos.cash.transactionwriter.config.TransactionActivityConfig;
import com.squareup.protos.cash.trustedcontact.SyncTrustedContact;
import com.squareup.protos.cash.whimsicard.syncentity.CardSkinAssets;
import com.squareup.protos.cash.whimsicard.syncentity.PaymentDevicePresentation;
import com.squareup.protos.cash.woodrow.syncvalues.PerformanceDetails;
import com.squareup.protos.cash.woodrow.syncvalues.PerformanceDetailsUi;
import com.squareup.protos.cash.woodrow.syncvalues.PerformanceSummary;
import com.squareup.protos.checkmate.profile.CheckDepositProfile;
import com.squareup.protos.checkmate.sync.CheckDepositEligibility;
import com.squareup.protos.franklin.AvailablePaymentPadThemes;
import com.squareup.protos.franklin.api.Instrument;
import com.squareup.protos.franklin.cards.CardThemeDefinitions;
import com.squareup.protos.franklin.common.SyncValue;
import com.squareup.protos.franklin.ui.BalanceSnapshot;
import com.squareup.protos.franklin.ui.C4BIdentityHubState;
import com.squareup.protos.franklin.ui.IdentityHubState;
import com.squareup.protos.franklin.ui.InputtedLegalName;
import com.squareup.protos.franklin.ui.LimitsPageletInlineMessage;
import com.squareup.protos.franklin.ui.PersonalInfoCTABanner;
import com.squareup.protos.franklin.ui.ProfilePageUpsellComponent;
import com.squareup.protos.franklin.ui.ProfileUpsellConfiguration;
import com.squareup.protos.franklin.ui.ScenarioPlanEntry;
import com.squareup.protos.franklin.ui.UiAccess;
import com.squareup.protos.franklin.ui.UiAddress;
import com.squareup.protos.franklin.ui.UiAppLock;
import com.squareup.protos.franklin.ui.UiAppMesssages;
import com.squareup.protos.franklin.ui.UiCashLimits;
import com.squareup.protos.franklin.ui.UiCoreCustomer;
import com.squareup.protos.franklin.ui.UiCryptoCurrency;
import com.squareup.protos.franklin.ui.UiDda;
import com.squareup.protos.franklin.ui.UiExchangeData;
import com.squareup.protos.franklin.ui.UiIdvState;
import com.squareup.protos.franklin.ui.UiInvestingAutomation;
import com.squareup.protos.franklin.ui.UiIssuedCard;
import com.squareup.protos.franklin.ui.UiJurisdictionConfig;
import com.squareup.protos.franklin.ui.UiMarketing;
import com.squareup.protos.franklin.ui.UiNotificationPreference;
import com.squareup.protos.franklin.ui.UiP2pSettings;
import com.squareup.protos.franklin.ui.UiPublicProfile;
import com.squareup.protos.franklin.ui.UiScheduledPayments;
import com.squareup.protos.franklin.ui.UiStatusAndLimits;
import com.squareup.protos.investing.notifications.settings.NotificationsSettings;
import com.squareup.protos.lending.sync_values.AfterpayPrepurchaseData;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import com.squareup.protos.lending.sync_values.BorrowAppletCreditLimitAndBorrowButtonTile;
import com.squareup.protos.lending.sync_values.BorrowAppletLinksTile;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import com.squareup.protos.lending.sync_values.BorrowAppletPaymentTimelineTile;
import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.protos.lending.sync_values.BorrowLimitHubData;
import com.squareup.protos.lending.sync_values.GlobalBorrowData;
import com.squareup.protos.lending.sync_values.LendingInfo;
import com.squareup.protos.lending.sync_values.SupOffersTabCreditLine;
import com.squareup.protos.loyalizer.LoyaltyProfile;
import com.squareup.protos.papermate.PaperCashDepositEligibility;
import com.squareup.protos.unicorn.BankingTab;
import com.squareup.protos.unicorn.FdicInsuranceCustomerStatus;
import com.squareup.protos.wiremate.WiresEligibilityState;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.NoWhenBranchMatchedException;
import okio.ByteString;
import squareup.cash.bankingbenefits.ui.VersionedCashGreen;
import squareup.cash.bankingbenefits.ui.VersionedGreenBenefits;
import squareup.cash.bankingbenefits.ui.VersionedGreenBooklet;
import squareup.cash.bills.BillsApplet;
import squareup.cash.bills.BillsConfig;
import squareup.cash.cashliteflow.CashLiteDefaultBankAccount;
import squareup.cash.cryptocurrency.AutoBtcWithdrawThresholdSyncValue;
import squareup.cash.cryptocurrency.BtcP2pConversionBps;
import squareup.cash.cryptocurrency.CryptocurrencyProfile;
import squareup.cash.earnings.EarnerEnrollmentState;
import squareup.cash.earnings.EarningsAppletUIState;
import squareup.cash.earnings.EarningsHomeUIState;
import squareup.cash.investcore.trading.syncvalues.TradingState;
import squareup.cash.investcustomer.syncvalues.InvestDividendSetting;
import squareup.cash.overdraft.OverdraftStatus;
import squareup.cash.overdraft.OverdraftUsage;
import squareup.cash.paychecks.AllocationDistribution;
import squareup.cash.paychecks.UiConfiguration;
import squareup.cash.paychecks.UiState;
import squareup.cash.phoneplans.syncvalues.VersionedPhonePlanApplet;
import squareup.cash.portfolios.syncvalues.PortfolioState;
import squareup.cash.savings.SavingsApplet;
import squareup.cash.savings.SavingsConfig;
import squareup.cash.savings.SavingsExternalElements;
import squareup.cash.savings.SavingsFolder;
import squareup.cash.savings.SavingsHome;
import squareup.cash.savings.VersionedSavingsFolders;
import squareup.cash.savings.VersionedSavingsScreens;
import squareup.cash.wires.WiresAccountInfo;

/* loaded from: classes8.dex */
public final class SyncValue$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        SyncValue.Value value = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SyncValue((SyncValueType) obj, value, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = SyncValueType.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 20:
                case 25:
                case 80:
                case 81:
                case 101:
                case 112:
                case SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE:
                case 140:
                case SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE:
                case SDK_ASSET_ILLUSTRATION_INCOME_VALUE:
                case SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE:
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
                case 3:
                    value = new SyncValue.Value.Instrument((Instrument) Instrument.ADAPTER.decode(protoReader));
                    break;
                case 12:
                    value = new SyncValue.Value.AtmPicker((ATMPicker) ATMPicker.ADAPTER.decode(protoReader));
                    break;
                case 13:
                    value = new SyncValue.Value.BalanceSnapshot((BalanceSnapshot) BalanceSnapshot.ADAPTER.decode(protoReader));
                    break;
                case 14:
                    value = new SyncValue.Value.Dda((UiDda) UiDda.ADAPTER.decode(protoReader));
                    break;
                case 15:
                    value = new SyncValue.Value.Access((UiAccess) UiAccess.ADAPTER.decode(protoReader));
                    break;
                case 16:
                    value = new SyncValue.Value.Address((UiAddress) UiAddress.ADAPTER.decode(protoReader));
                    break;
                case 17:
                    value = new SyncValue.Value.StatusAndLimits((UiStatusAndLimits) UiStatusAndLimits.ADAPTER.decode(protoReader));
                    break;
                case 18:
                    value = new SyncValue.Value.AppMessages((UiAppMesssages) UiAppMesssages.ADAPTER.decode(protoReader));
                    break;
                case 19:
                    value = new SyncValue.Value.CoreCustomer((UiCoreCustomer) UiCoreCustomer.ADAPTER.decode(protoReader));
                    break;
                case 21:
                    value = new SyncValue.Value.IssuedCard((UiIssuedCard) UiIssuedCard.ADAPTER.decode(protoReader));
                    break;
                case 22:
                    value = new SyncValue.Value.Marketing((UiMarketing) UiMarketing.ADAPTER.decode(protoReader));
                    break;
                case 23:
                    value = new SyncValue.Value.P2pSettings((UiP2pSettings) UiP2pSettings.ADAPTER.decode(protoReader));
                    break;
                case 24:
                    value = new SyncValue.Value.ScheduledPayments((UiScheduledPayments) UiScheduledPayments.ADAPTER.decode(protoReader));
                    break;
                case 26:
                    value = new SyncValue.Value.PublicProfile((UiPublicProfile) UiPublicProfile.ADAPTER.decode(protoReader));
                    break;
                case 27:
                    value = new SyncValue.Value.ProfileAlias((ProfileAlias) ProfileAlias.ADAPTER.decode(protoReader));
                    break;
                case 28:
                    value = new SyncValue.Value.LoyaltyProfile((LoyaltyProfile) LoyaltyProfile.ADAPTER.decode(protoReader));
                    break;
                case 29:
                    value = new SyncValue.Value.CheckDepositProfile((CheckDepositProfile) CheckDepositProfile.ADAPTER.decode(protoReader));
                    break;
                case 30:
                    value = new SyncValue.Value.InvestmentNotificationSettings((NotificationsSettings) NotificationsSettings.ADAPTER.decode(protoReader));
                    break;
                case 31:
                    value = new SyncValue.Value.ProfileDetails((ProfileDetails) ProfileDetails.ADAPTER.decode(protoReader));
                    break;
                case 32:
                    value = new SyncValue.Value.Wallet((Wallet) Wallet.ADAPTER.decode(protoReader));
                    break;
                case 33:
                    value = new SyncValue.Value.BankingTab((BankingTab) BankingTab.ADAPTER.decode(protoReader));
                    break;
                case 34:
                    value = new SyncValue.Value.JurisdictionConfig((UiJurisdictionConfig) UiJurisdictionConfig.ADAPTER.decode(protoReader));
                    break;
                case 35:
                    value = new SyncValue.Value.Cryptocurrency((UiCryptoCurrency) UiCryptoCurrency.ADAPTER.decode(protoReader));
                    break;
                case 36:
                    value = new SyncValue.Value.ExchangeData((UiExchangeData) UiExchangeData.ADAPTER.decode(protoReader));
                    break;
                case 37:
                    value = new SyncValue.Value.NotificationPreference((UiNotificationPreference) UiNotificationPreference.ADAPTER.decode(protoReader));
                    break;
                case 38:
                    value = new SyncValue.Value.DataPrivacySettings((DataPrivacySettings) DataPrivacySettings.ADAPTER.decode(protoReader));
                    break;
                case 39:
                    value = new SyncValue.Value.PasswordInfo((PasswordInfo) PasswordInfo.ADAPTER.decode(protoReader));
                    break;
                case 40:
                    value = new SyncValue.Value.OtpInfo((OTPInfo) OTPInfo.ADAPTER.decode(protoReader));
                    break;
                case 41:
                    value = new SyncValue.Value.FamilyAccount((UiFamilyAccount) UiFamilyAccount.ADAPTER.decode(protoReader));
                    break;
                case 42:
                    value = new SyncValue.Value.InvestingAutomation((UiInvestingAutomation) UiInvestingAutomation.ADAPTER.decode(protoReader));
                    break;
                case 43:
                    value = new SyncValue.Value.LendingInfo((LendingInfo) LendingInfo.ADAPTER.decode(protoReader));
                    break;
                case 44:
                    value = new SyncValue.Value.TrustedContact((SyncTrustedContact) SyncTrustedContact.ADAPTER.decode(protoReader));
                    break;
                case 45:
                    value = new SyncValue.Value.IdvState((UiIdvState) UiIdvState.ADAPTER.decode(protoReader));
                    break;
                case 46:
                    value = new SyncValue.Value.CryptocurrencyProfile((CryptocurrencyProfile) CryptocurrencyProfile.ADAPTER.decode(protoReader));
                    break;
                case 47:
                    value = new SyncValue.Value.InvestAutomatorNotificationSettings((NotificationsSettings) NotificationsSettings.ADAPTER.decode(protoReader));
                    break;
                case 48:
                    value = new SyncValue.Value.Favorite((Favorite) Favorite.ADAPTER.decode(protoReader));
                    break;
                case 49:
                    value = new SyncValue.Value.SavingsConfig((SavingsConfig) SavingsConfig.ADAPTER.decode(protoReader));
                    break;
                case 50:
                    value = new SyncValue.Value.SavingsHome((SavingsHome) SavingsHome.ADAPTER.decode(protoReader));
                    break;
                case 51:
                    value = new SyncValue.Value.InvestPortfolioState((PortfolioState) PortfolioState.ADAPTER.decode(protoReader));
                    break;
                case 52:
                    value = new SyncValue.Value.InvestTradingState((TradingState) TradingState.ADAPTER.decode(protoReader));
                    break;
                case 53:
                    value = new SyncValue.Value.SavingsFolder((SavingsFolder) SavingsFolder.ADAPTER.decode(protoReader));
                    break;
                case 54:
                    value = new SyncValue.Value.Tigers((Tigers) Tigers.ADAPTER.decode(protoReader));
                    break;
                case 55:
                    value = new SyncValue.Value.WiresAccountInfo((WiresAccountInfo) WiresAccountInfo.ADAPTER.decode(protoReader));
                    break;
                case 56:
                    value = new SyncValue.Value.TaxUpgrade((UiTaxUpgrade) UiTaxUpgrade.ADAPTER.decode(protoReader));
                    break;
                case 57:
                    value = new SyncValue.Value.EfileInfo((UiEfileInfo) UiEfileInfo.ADAPTER.decode(protoReader));
                    break;
                case 58:
                    value = new SyncValue.Value.CashLimits((UiCashLimits) UiCashLimits.ADAPTER.decode(protoReader));
                    break;
                case 59:
                    value = new SyncValue.Value.Lions((Lions) Lions.ADAPTER.decode(protoReader));
                    break;
                case 60:
                    value = new SyncValue.Value.DeviceInfo((DeviceInfo) DeviceInfo.ADAPTER.decode(protoReader));
                    break;
                case 61:
                    value = new SyncValue.Value.LimitsPageletInlineMessage((LimitsPageletInlineMessage) LimitsPageletInlineMessage.ADAPTER.decode(protoReader));
                    break;
                case 62:
                    value = new SyncValue.Value.SchemaVersions((SyncValueSchemaVersions) SyncValueSchemaVersions.ADAPTER.decode(protoReader));
                    break;
                case 63:
                    value = new SyncValue.Value.Cats((Cats) Cats.ADAPTER.decode(protoReader));
                    break;
                case 64:
                    value = new SyncValue.Value.InstrumentLinkingOption((InstrumentLinkingOption) InstrumentLinkingOption.ADAPTER.decode(protoReader));
                    break;
                case 65:
                    value = new SyncValue.Value.Rabbits((Rabbits) Rabbits.ADAPTER.decode(protoReader));
                    break;
                case 66:
                    value = new SyncValue.Value.OverdraftStatus((OverdraftStatus) OverdraftStatus.ADAPTER.decode(protoReader));
                    break;
                case 67:
                    value = new SyncValue.Value.OverdraftUsage((OverdraftUsage) OverdraftUsage.ADAPTER.decode(protoReader));
                    break;
                case 68:
                    value = new SyncValue.Value.InstrumentLinkingOptions((InstrumentLinkingOptions) InstrumentLinkingOptions.ADAPTER.decode(protoReader));
                    break;
                case 69:
                    value = new SyncValue.Value.IdentityHubState((IdentityHubState) IdentityHubState.ADAPTER.decode(protoReader));
                    break;
                case 70:
                    value = new SyncValue.Value.AppLock((UiAppLock) UiAppLock.ADAPTER.decode(protoReader));
                    break;
                case 71:
                    value = new SyncValue.Value.SponsorshipCryptoAuthorization((SponsorshipCryptoAuthorization) SponsorshipCryptoAuthorization.ADAPTER.decode(protoReader));
                    break;
                case 72:
                    value = new SyncValue.Value.OfferCustomerPreference((OfferCustomerPreference) OfferCustomerPreference.ADAPTER.decode(protoReader));
                    break;
                case 73:
                    value = new SyncValue.Value.PasskeyOptions((PasskeyOptions) PasskeyOptions.ADAPTER.decode(protoReader));
                    break;
                case 74:
                    value = new SyncValue.Value.PaycheckAllocationDistribution((AllocationDistribution) AllocationDistribution.ADAPTER.decode(protoReader));
                    break;
                case 75:
                    value = new SyncValue.Value.PaychecksUiConfiguration((UiConfiguration) UiConfiguration.ADAPTER.decode(protoReader));
                    break;
                case 76:
                    value = new SyncValue.Value.PaychecksUiState((UiState) UiState.ADAPTER.decode(protoReader));
                    break;
                case 77:
                    value = new SyncValue.Value.PaperCashDepositEligibility((PaperCashDepositEligibility) PaperCashDepositEligibility.ADAPTER.decode(protoReader));
                    break;
                case 78:
                    value = new SyncValue.Value.CheckDepositEligibility((CheckDepositEligibility) CheckDepositEligibility.ADAPTER.decode(protoReader));
                    break;
                case 79:
                    value = new SyncValue.Value.WiresEligibilityState((WiresEligibilityState) WiresEligibilityState.ADAPTER.decode(protoReader));
                    break;
                case 82:
                    value = new SyncValue.Value.BorrowAppletCreditLimitBorrowButtonTile((BorrowAppletCreditLimitAndBorrowButtonTile) BorrowAppletCreditLimitAndBorrowButtonTile.ADAPTER.decode(protoReader));
                    break;
                case 83:
                    value = new SyncValue.Value.C4bProfileData((BusinessProfileData) BusinessProfileData.ADAPTER.decode(protoReader));
                    break;
                case 84:
                    value = new SyncValue.Value.ReactionsAvailable((AvailableReactions) AvailableReactions.ADAPTER.decode(protoReader));
                    break;
                case 85:
                    value = new SyncValue.Value.BorrowAppletPaymentTimelineTile((BorrowAppletPaymentTimelineTile) BorrowAppletPaymentTimelineTile.ADAPTER.decode(protoReader));
                    break;
                case 86:
                    value = new SyncValue.Value.BorrowAppletBulletinsTile((BorrowAppletBulletinsTile) BorrowAppletBulletinsTile.ADAPTER.decode(protoReader));
                    break;
                case 87:
                    value = new SyncValue.Value.InternationalPaymentsCountryConfig((InternationalPaymentsCountrySelectionSyncValue) InternationalPaymentsCountrySelectionSyncValue.ADAPTER.decode(protoReader));
                    break;
                case 88:
                    value = new SyncValue.Value.BorrowAppletLoanHistoryTile((BorrowAppletLoanHistoryTile) BorrowAppletLoanHistoryTile.ADAPTER.decode(protoReader));
                    break;
                case 89:
                    value = new SyncValue.Value.InternationalPaymentsCountryNotificationConfig((InternationalPaymentsCountryNotificationSyncValue) InternationalPaymentsCountryNotificationSyncValue.ADAPTER.decode(protoReader));
                    break;
                case 90:
                    value = new SyncValue.Value.BalanceBasedAddCashPreference((BalanceBasedAddCashPreference) BalanceBasedAddCashPreference.ADAPTER.decode(protoReader));
                    break;
                case 91:
                    value = new SyncValue.Value.BorrowData((BorrowData) BorrowData.ADAPTER.decode(protoReader));
                    break;
                case 92:
                    value = new SyncValue.Value.GlobalBorrowData((GlobalBorrowData) GlobalBorrowData.ADAPTER.decode(protoReader));
                    break;
                case 93:
                    value = new SyncValue.Value.TransactionActivityConfig((TransactionActivityConfig) TransactionActivityConfig.ADAPTER.decode(protoReader));
                    break;
                case 94:
                    value = new SyncValue.Value.DisplayNameDetails((DisplayNameDetails) DisplayNameDetails.ADAPTER.decode(protoReader));
                    break;
                case 95:
                    value = new SyncValue.Value.InvestYourPaycheckAutomation((UiInvestingAutomation) UiInvestingAutomation.ADAPTER.decode(protoReader));
                    break;
                case 96:
                    value = new SyncValue.Value.BusinessAddress((UiAddress) UiAddress.ADAPTER.decode(protoReader));
                    break;
                case 97:
                    value = new SyncValue.Value.CommerceBrowserAutofillPreferences((CommerceBrowserAutofillPreferences) CommerceBrowserAutofillPreferences.ADAPTER.decode(protoReader));
                    break;
                case 98:
                    value = new SyncValue.Value.AvailablePaymentPadThemes((AvailablePaymentPadThemes) AvailablePaymentPadThemes.ADAPTER.decode(protoReader));
                    break;
                case 99:
                    value = new SyncValue.Value.FamilyTile((UiFamilyTile) UiFamilyTile.ADAPTER.decode(protoReader));
                    break;
                case 100:
                    value = new SyncValue.Value.FdicInsuranceCustomerStatus((FdicInsuranceCustomerStatus) FdicInsuranceCustomerStatus.ADAPTER.decode(protoReader));
                    break;
                case 102:
                    value = new SyncValue.Value.PersonalInfoCtaBanner((PersonalInfoCTABanner) PersonalInfoCTABanner.ADAPTER.decode(protoReader));
                    break;
                case 103:
                    value = new SyncValue.Value.InputtedLegalName((InputtedLegalName) InputtedLegalName.ADAPTER.decode(protoReader));
                    break;
                case 104:
                    value = new SyncValue.Value.ProfilePageUpsellComponent((ProfilePageUpsellComponent) ProfilePageUpsellComponent.ADAPTER.decode(protoReader));
                    break;
                case 105:
                    value = new SyncValue.Value.C4bIdentityHubState((C4BIdentityHubState) C4BIdentityHubState.ADAPTER.decode(protoReader));
                    break;
                case 106:
                    value = new SyncValue.Value.BtcAppletRenderingState((BtcAppletRenderingState) BtcAppletRenderingState.ADAPTER.decode(protoReader));
                    break;
                case 107:
                    value = new SyncValue.Value.ShippingAddress((SyncShippingAddress) SyncShippingAddress.ADAPTER.decode(protoReader));
                    break;
                case 108:
                    value = new SyncValue.Value.InvestDividendSetting((InvestDividendSetting) InvestDividendSetting.ADAPTER.decode(protoReader));
                    break;
                case 109:
                    value = new SyncValue.Value.ProfilePageUpsellConfiguration((ProfileUpsellConfiguration) ProfileUpsellConfiguration.ADAPTER.decode(protoReader));
                    break;
                case 110:
                    value = new SyncValue.Value.ProfilePageUpsellComponentV2((ProfilePageUpsellComponentV2) ProfilePageUpsellComponentV2.ADAPTER.decode(protoReader));
                    break;
                case 111:
                    value = new SyncValue.Value.SupOffersTabCreditLine((SupOffersTabCreditLine) SupOffersTabCreditLine.ADAPTER.decode(protoReader));
                    break;
                case 113:
                    value = new SyncValue.Value.C4bKybEligibilityWarning((KybEligibilityWarning) KybEligibilityWarning.ADAPTER.decode(protoReader));
                    break;
                case 114:
                    value = new SyncValue.Value.CardSpendingInsightsConfig((CardSpendingInsightsConfig) CardSpendingInsightsConfig.ADAPTER.decode(protoReader));
                    break;
                case 115:
                    value = new SyncValue.Value.CardSpendingInsightsHome((CardSpendingInsightsHome) CardSpendingInsightsHome.ADAPTER.decode(protoReader));
                    break;
                case 116:
                    value = new SyncValue.Value.SavingsApplet((SavingsApplet) SavingsApplet.ADAPTER.decode(protoReader));
                    break;
                case 117:
                    value = new SyncValue.Value.Scheme((com.squareup.protos.cash.postcard.CardScheme) com.squareup.protos.cash.postcard.CardScheme.ADAPTER.decode(protoReader));
                    break;
                case 118:
                    value = new SyncValue.Value.AfterpayPrepurchaseData((AfterpayPrepurchaseData) AfterpayPrepurchaseData.ADAPTER.decode(protoReader));
                    break;
                case 119:
                    value = new SyncValue.Value.BillsApplet((BillsApplet) BillsApplet.ADAPTER.decode(protoReader));
                    break;
                case 120:
                    value = new SyncValue.Value.ScenarioPlan((ScenarioPlanEntry) ScenarioPlanEntry.ADAPTER.decode(protoReader));
                    break;
                case 121:
                    value = new SyncValue.Value.BillsConfig((BillsConfig) BillsConfig.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                    value = new SyncValue.Value.LocalCard((LocalCard) LocalCard.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                    value = new SyncValue.Value.C4bTapToPay((TapToPay) TapToPay.ADAPTER.decode(protoReader));
                    break;
                case 125:
                    value = new SyncValue.Value.NotificationSettings((UiNotificationSettings) UiNotificationSettings.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE:
                    value = new SyncValue.Value.CardThemeDefinitions((CardThemeDefinitions) CardThemeDefinitions.ADAPTER.decode(protoReader));
                    break;
                case 127:
                    value = new SyncValue.Value.SupportPhoneConfirmation((SupportPhoneConfirmation) SupportPhoneConfirmation.ADAPTER.decode(protoReader));
                    break;
                case 128:
                    value = new SyncValue.Value.AppThemeDefinitions((AppThemeDefinitions) AppThemeDefinitions.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                    value = new SyncValue.Value.Accounts((SyncValueAccounts) SyncValueAccounts.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                    value = new SyncValue.Value.SavingsFolders((VersionedSavingsFolders) VersionedSavingsFolders.ADAPTER.decode(protoReader));
                    break;
                case 131:
                    value = new SyncValue.Value.SavingsScreens((VersionedSavingsScreens) VersionedSavingsScreens.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE:
                    value = new SyncValue.Value.LocalAccount((LocalAccount) LocalAccount.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE:
                    value = new SyncValue.Value.BitcoinPerformanceSummary((PerformanceSummary) PerformanceSummary.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE:
                    value = new SyncValue.Value.BitcoinPerformanceDetails((PerformanceDetails) PerformanceDetails.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE:
                    value = new SyncValue.Value.EarningsTrackerSummary((EarningsTrackerSummary) EarningsTrackerSummary.ADAPTER.decode(protoReader));
                    break;
                case 136:
                    value = new SyncValue.Value.FeatureEligibilityRefreshPolicy((FeatureEligibilityRefreshPolicy) FeatureEligibilityRefreshPolicy.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE:
                    value = new SyncValue.Value.BitcoinPerformanceDetailsUi((PerformanceDetailsUi) PerformanceDetailsUi.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE:
                    value = new SyncValue.Value.BitcoinPerformanceDetailsUserInterface((PerformanceDetailsUi) PerformanceDetailsUi.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE:
                    value = new SyncValue.Value.CashAppCard((CashAppCard) CashAppCard.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE:
                    value = new SyncValue.Value.LocalCashBalance((LocalCashBalance) LocalCashBalance.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE:
                    value = new SyncValue.Value.CustomerShoppingPreference((CustomerShoppingPreference) CustomerShoppingPreference.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE:
                    value = new SyncValue.Value.BorrowAppletLinksTile((BorrowAppletLinksTile) BorrowAppletLinksTile.ADAPTER.decode(protoReader));
                    break;
                case 144:
                    value = new SyncValue.Value.SavingsExternalElements((SavingsExternalElements) SavingsExternalElements.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE:
                    value = new SyncValue.Value.TapToPayDescriptionSuggestions((TapToPayDescriptionSuggestions) TapToPayDescriptionSuggestions.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE:
                    value = new SyncValue.Value.CashOClockPreference((CashOClockPreference) CashOClockPreference.ADAPTER.decode(protoReader));
                    break;
                case 147:
                    value = new SyncValue.Value.DisplayName((DisplayName) DisplayName.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE:
                    value = new SyncValue.Value.MultiInstrumentLinkingOptions((MultiInstrumentLinkingOptions) MultiInstrumentLinkingOptions.ADAPTER.decode(protoReader));
                    break;
                case 150:
                    value = new SyncValue.Value.AccountSuspension((AccountSuspension) AccountSuspension.ADAPTER.decode(protoReader));
                    break;
                case 151:
                    value = new SyncValue.Value.CashOutInstrumentCapabilityConfig((CashOutInstrumentCapabilityConfig) CashOutInstrumentCapabilityConfig.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE:
                    value = new SyncValue.Value.BorrowLimitHubData((BorrowLimitHubData) BorrowLimitHubData.ADAPTER.decode(protoReader));
                    break;
                case 153:
                    value = new SyncValue.Value.PrepurchaseCashCardData((PrepurchaseCashCardData) PrepurchaseCashCardData.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE:
                    value = new SyncValue.Value.P2pAllowlistCustomer((P2PAllowListCustomer) P2PAllowListCustomer.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_MANAGE_CONNECTIONS_VALUE:
                    value = new SyncValue.Value.P2pControl((P2PControl) P2PControl.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_CENTERED_VALUE:
                    value = new SyncValue.Value.CashGreen((VersionedCashGreen) VersionedCashGreen.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE:
                    value = new SyncValue.Value.GreenBenefits((VersionedGreenBenefits) VersionedGreenBenefits.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_WALLET_VALUE:
                    value = new SyncValue.Value.GreenBooklet((VersionedGreenBooklet) VersionedGreenBooklet.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE:
                    value = new SyncValue.Value.ClientSyncConfig((ClientSyncConfig) ClientSyncConfig.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE:
                    value = new SyncValue.Value.BadgingData((BadgingData) BadgingData.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE:
                    value = new SyncValue.Value.KgooseUserSettings((CashUserSettings) CashUserSettings.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE:
                    value = new SyncValue.Value.KgooseGlobalUserSettings((CashGlobalUserSettings) CashGlobalUserSettings.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE:
                    value = new SyncValue.Value.AuthorizedAccount((SyncValueAuthorizedAccount) SyncValueAuthorizedAccount.ADAPTER.decode(protoReader));
                    break;
                case 165:
                    value = new SyncValue.Value.RestrictionsData((RestrictionsData) RestrictionsData.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE:
                    value = new SyncValue.Value.AdversityBanner((AdversityBanner) AdversityBanner.ADAPTER.decode(protoReader));
                    break;
                case 167:
                    value = new SyncValue.Value.BankingBenefitsConfig((BankingBenefitsConfig) BankingBenefitsConfig.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE:
                    value = new SyncValue.Value.MoneyTab((MoneyTab) MoneyTab.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_HEADER_CARD_COLLECT_VALUE:
                    value = new SyncValue.Value.LocalPosCheckIn((LocalPOSCheckIn) LocalPOSCheckIn.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE:
                    value = new SyncValue.Value.DemandDepositAccount((DemandDepositAccount) DemandDepositAccount.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE:
                    value = new SyncValue.Value.InvestPortfoliosPerformance((PortfoliosPerformanceValue) PortfoliosPerformanceValue.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE:
                    value = new SyncValue.Value.CashCreditScoreSyncData((CashCreditScoreSyncData) CashCreditScoreSyncData.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE:
                    value = new SyncValue.Value.CashOutFeeData((CashOutFeeData) CashOutFeeData.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE:
                    value = new SyncValue.Value.RecipientSuggestions((RecipientSuggestions) RecipientSuggestions.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE:
                    value = new SyncValue.Value.CashAppTag((CashAppTag) CashAppTag.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE:
                    value = new SyncValue.Value.InvestPortfoliosHistoricalData((PortfoliosHistoricalDataValue) PortfoliosHistoricalDataValue.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE:
                    value = new SyncValue.Value.CardSkinAssets((CardSkinAssets) CardSkinAssets.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE:
                    value = new SyncValue.Value.PhonePlanApplet((VersionedPhonePlanApplet) VersionedPhonePlanApplet.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_VERIFICATION_IN_PROGRESS_DARK_APPEARANCE_VALUE:
                    value = new SyncValue.Value.TagThemeDefinitions((TagThemeDefinitions) TagThemeDefinitions.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE:
                    value = new SyncValue.Value.BtcP2pConversionBps((BtcP2pConversionBps) BtcP2pConversionBps.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE:
                    value = new SyncValue.Value.PaymentDevicePresentation((PaymentDevicePresentation) PaymentDevicePresentation.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE:
                    value = new SyncValue.Value.LocalEarningCard((LocalEarningCard) LocalEarningCard.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE:
                    value = new SyncValue.Value.EarningsHomeUiState((EarningsHomeUIState) EarningsHomeUIState.ADAPTER.decode(protoReader));
                    break;
                case 185:
                    value = new SyncValue.Value.EarningsAppletUiState((EarningsAppletUIState) EarningsAppletUIState.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE:
                    value = new SyncValue.Value.CashForWorkApplet((VersionedCashForWorkApplet) VersionedCashForWorkApplet.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE:
                    value = new SyncValue.Value.AutoBtcWithdrawThreshold((AutoBtcWithdrawThresholdSyncValue) AutoBtcWithdrawThresholdSyncValue.ADAPTER.decode(protoReader));
                    break;
                case 188:
                    value = new SyncValue.Value.FinishSetupTile((VersionedFinishSetupTile) VersionedFinishSetupTile.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE:
                    value = new SyncValue.Value.EarnerEnrollmentState((EarnerEnrollmentState) EarnerEnrollmentState.ADAPTER.decode(protoReader));
                    break;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE:
                    value = new SyncValue.Value.CashLiteDefaultBankAccount((CashLiteDefaultBankAccount) CashLiteDefaultBankAccount.ADAPTER.decode(protoReader));
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncValue syncValue = (SyncValue) obj;
        reverseProtoWriter.getClass();
        syncValue.getClass();
        reverseProtoWriter.writeBytes(syncValue.unknownFields());
        SyncValue.Value value = syncValue.value;
        if (value instanceof SyncValue.Value.Instrument) {
            Instrument.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((SyncValue.Value.Instrument) value).value);
        } else if (value instanceof SyncValue.Value.AtmPicker) {
            ATMPicker.ADAPTER.encodeWithTag(reverseProtoWriter, 12, ((SyncValue.Value.AtmPicker) value).value);
        } else if (value instanceof SyncValue.Value.BalanceSnapshot) {
            BalanceSnapshot.ADAPTER.encodeWithTag(reverseProtoWriter, 13, ((SyncValue.Value.BalanceSnapshot) value).value);
        } else if (value instanceof SyncValue.Value.Dda) {
            UiDda.ADAPTER.encodeWithTag(reverseProtoWriter, 14, ((SyncValue.Value.Dda) value).value);
        } else if (value instanceof SyncValue.Value.Access) {
            UiAccess.ADAPTER.encodeWithTag(reverseProtoWriter, 15, ((SyncValue.Value.Access) value).value);
        } else if (value instanceof SyncValue.Value.Address) {
            UiAddress.ADAPTER.encodeWithTag(reverseProtoWriter, 16, ((SyncValue.Value.Address) value).value);
        } else if (value instanceof SyncValue.Value.StatusAndLimits) {
            UiStatusAndLimits.ADAPTER.encodeWithTag(reverseProtoWriter, 17, ((SyncValue.Value.StatusAndLimits) value).value);
        } else if (value instanceof SyncValue.Value.AppMessages) {
            UiAppMesssages.ADAPTER.encodeWithTag(reverseProtoWriter, 18, ((SyncValue.Value.AppMessages) value).value);
        } else if (value instanceof SyncValue.Value.CoreCustomer) {
            UiCoreCustomer.ADAPTER.encodeWithTag(reverseProtoWriter, 19, ((SyncValue.Value.CoreCustomer) value).value);
        } else if (value instanceof SyncValue.Value.IssuedCard) {
            UiIssuedCard.ADAPTER.encodeWithTag(reverseProtoWriter, 21, ((SyncValue.Value.IssuedCard) value).value);
        } else if (value instanceof SyncValue.Value.Marketing) {
            UiMarketing.ADAPTER.encodeWithTag(reverseProtoWriter, 22, ((SyncValue.Value.Marketing) value).value);
        } else if (value instanceof SyncValue.Value.P2pSettings) {
            UiP2pSettings.ADAPTER.encodeWithTag(reverseProtoWriter, 23, ((SyncValue.Value.P2pSettings) value).value);
        } else if (value instanceof SyncValue.Value.ScheduledPayments) {
            UiScheduledPayments.ADAPTER.encodeWithTag(reverseProtoWriter, 24, ((SyncValue.Value.ScheduledPayments) value).value);
        } else if (value instanceof SyncValue.Value.PublicProfile) {
            UiPublicProfile.ADAPTER.encodeWithTag(reverseProtoWriter, 26, ((SyncValue.Value.PublicProfile) value).value);
        } else if (value instanceof SyncValue.Value.ProfileAlias) {
            ProfileAlias.ADAPTER.encodeWithTag(reverseProtoWriter, 27, ((SyncValue.Value.ProfileAlias) value).value);
        } else if (value instanceof SyncValue.Value.LoyaltyProfile) {
            LoyaltyProfile.ADAPTER.encodeWithTag(reverseProtoWriter, 28, ((SyncValue.Value.LoyaltyProfile) value).value);
        } else if (value instanceof SyncValue.Value.CheckDepositProfile) {
            CheckDepositProfile.ADAPTER.encodeWithTag(reverseProtoWriter, 29, ((SyncValue.Value.CheckDepositProfile) value).value);
        } else if (value instanceof SyncValue.Value.InvestmentNotificationSettings) {
            NotificationsSettings.ADAPTER.encodeWithTag(reverseProtoWriter, 30, ((SyncValue.Value.InvestmentNotificationSettings) value).value);
        } else if (value instanceof SyncValue.Value.ProfileDetails) {
            ProfileDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 31, ((SyncValue.Value.ProfileDetails) value).value);
        } else if (value instanceof SyncValue.Value.Wallet) {
            Wallet.ADAPTER.encodeWithTag(reverseProtoWriter, 32, ((SyncValue.Value.Wallet) value).value);
        } else if (value instanceof SyncValue.Value.BankingTab) {
            BankingTab.ADAPTER.encodeWithTag(reverseProtoWriter, 33, ((SyncValue.Value.BankingTab) value).value);
        } else if (value instanceof SyncValue.Value.JurisdictionConfig) {
            UiJurisdictionConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 34, ((SyncValue.Value.JurisdictionConfig) value).value);
        } else if (value instanceof SyncValue.Value.Cryptocurrency) {
            UiCryptoCurrency.ADAPTER.encodeWithTag(reverseProtoWriter, 35, ((SyncValue.Value.Cryptocurrency) value).value);
        } else if (value instanceof SyncValue.Value.ExchangeData) {
            UiExchangeData.ADAPTER.encodeWithTag(reverseProtoWriter, 36, ((SyncValue.Value.ExchangeData) value).value);
        } else if (value instanceof SyncValue.Value.NotificationPreference) {
            UiNotificationPreference.ADAPTER.encodeWithTag(reverseProtoWriter, 37, ((SyncValue.Value.NotificationPreference) value).value);
        } else if (value instanceof SyncValue.Value.DataPrivacySettings) {
            DataPrivacySettings.ADAPTER.encodeWithTag(reverseProtoWriter, 38, ((SyncValue.Value.DataPrivacySettings) value).value);
        } else if (value instanceof SyncValue.Value.PasswordInfo) {
            PasswordInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 39, ((SyncValue.Value.PasswordInfo) value).value);
        } else if (value instanceof SyncValue.Value.OtpInfo) {
            OTPInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 40, ((SyncValue.Value.OtpInfo) value).value);
        } else if (value instanceof SyncValue.Value.FamilyAccount) {
            UiFamilyAccount.ADAPTER.encodeWithTag(reverseProtoWriter, 41, ((SyncValue.Value.FamilyAccount) value).value);
        } else if (value instanceof SyncValue.Value.InvestingAutomation) {
            UiInvestingAutomation.ADAPTER.encodeWithTag(reverseProtoWriter, 42, ((SyncValue.Value.InvestingAutomation) value).value);
        } else if (value instanceof SyncValue.Value.LendingInfo) {
            LendingInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 43, ((SyncValue.Value.LendingInfo) value).value);
        } else if (value instanceof SyncValue.Value.TrustedContact) {
            SyncTrustedContact.ADAPTER.encodeWithTag(reverseProtoWriter, 44, ((SyncValue.Value.TrustedContact) value).value);
        } else if (value instanceof SyncValue.Value.IdvState) {
            UiIdvState.ADAPTER.encodeWithTag(reverseProtoWriter, 45, ((SyncValue.Value.IdvState) value).value);
        } else if (value instanceof SyncValue.Value.CryptocurrencyProfile) {
            CryptocurrencyProfile.ADAPTER.encodeWithTag(reverseProtoWriter, 46, ((SyncValue.Value.CryptocurrencyProfile) value).value);
        } else if (value instanceof SyncValue.Value.InvestAutomatorNotificationSettings) {
            NotificationsSettings.ADAPTER.encodeWithTag(reverseProtoWriter, 47, ((SyncValue.Value.InvestAutomatorNotificationSettings) value).value);
        } else if (value instanceof SyncValue.Value.Favorite) {
            Favorite.ADAPTER.encodeWithTag(reverseProtoWriter, 48, ((SyncValue.Value.Favorite) value).value);
        } else if (value instanceof SyncValue.Value.SavingsConfig) {
            SavingsConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 49, ((SyncValue.Value.SavingsConfig) value).value);
        } else if (value instanceof SyncValue.Value.SavingsHome) {
            SavingsHome.ADAPTER.encodeWithTag(reverseProtoWriter, 50, ((SyncValue.Value.SavingsHome) value).value);
        } else if (value instanceof SyncValue.Value.InvestPortfolioState) {
            PortfolioState.ADAPTER.encodeWithTag(reverseProtoWriter, 51, ((SyncValue.Value.InvestPortfolioState) value).value);
        } else if (value instanceof SyncValue.Value.InvestTradingState) {
            TradingState.ADAPTER.encodeWithTag(reverseProtoWriter, 52, ((SyncValue.Value.InvestTradingState) value).value);
        } else if (value instanceof SyncValue.Value.SavingsFolder) {
            SavingsFolder.ADAPTER.encodeWithTag(reverseProtoWriter, 53, ((SyncValue.Value.SavingsFolder) value).value);
        } else if (value instanceof SyncValue.Value.Tigers) {
            Tigers.ADAPTER.encodeWithTag(reverseProtoWriter, 54, ((SyncValue.Value.Tigers) value).value);
        } else if (value instanceof SyncValue.Value.WiresAccountInfo) {
            WiresAccountInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 55, ((SyncValue.Value.WiresAccountInfo) value).value);
        } else if (value instanceof SyncValue.Value.TaxUpgrade) {
            UiTaxUpgrade.ADAPTER.encodeWithTag(reverseProtoWriter, 56, ((SyncValue.Value.TaxUpgrade) value).value);
        } else if (value instanceof SyncValue.Value.EfileInfo) {
            UiEfileInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 57, ((SyncValue.Value.EfileInfo) value).value);
        } else if (value instanceof SyncValue.Value.CashLimits) {
            UiCashLimits.ADAPTER.encodeWithTag(reverseProtoWriter, 58, ((SyncValue.Value.CashLimits) value).value);
        } else if (value instanceof SyncValue.Value.Lions) {
            Lions.ADAPTER.encodeWithTag(reverseProtoWriter, 59, ((SyncValue.Value.Lions) value).value);
        } else if (value instanceof SyncValue.Value.DeviceInfo) {
            DeviceInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 60, ((SyncValue.Value.DeviceInfo) value).value);
        } else if (value instanceof SyncValue.Value.LimitsPageletInlineMessage) {
            LimitsPageletInlineMessage.ADAPTER.encodeWithTag(reverseProtoWriter, 61, ((SyncValue.Value.LimitsPageletInlineMessage) value).value);
        } else if (value instanceof SyncValue.Value.SchemaVersions) {
            SyncValueSchemaVersions.ADAPTER.encodeWithTag(reverseProtoWriter, 62, ((SyncValue.Value.SchemaVersions) value).value);
        } else if (value instanceof SyncValue.Value.Cats) {
            Cats.ADAPTER.encodeWithTag(reverseProtoWriter, 63, ((SyncValue.Value.Cats) value).value);
        } else if (value instanceof SyncValue.Value.InstrumentLinkingOption) {
            InstrumentLinkingOption.ADAPTER.encodeWithTag(reverseProtoWriter, 64, ((SyncValue.Value.InstrumentLinkingOption) value).value);
        } else if (value instanceof SyncValue.Value.Rabbits) {
            Rabbits.ADAPTER.encodeWithTag(reverseProtoWriter, 65, ((SyncValue.Value.Rabbits) value).value);
        } else if (value instanceof SyncValue.Value.OverdraftStatus) {
            OverdraftStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 66, ((SyncValue.Value.OverdraftStatus) value).value);
        } else if (value instanceof SyncValue.Value.OverdraftUsage) {
            OverdraftUsage.ADAPTER.encodeWithTag(reverseProtoWriter, 67, ((SyncValue.Value.OverdraftUsage) value).value);
        } else if (value instanceof SyncValue.Value.InstrumentLinkingOptions) {
            InstrumentLinkingOptions.ADAPTER.encodeWithTag(reverseProtoWriter, 68, ((SyncValue.Value.InstrumentLinkingOptions) value).value);
        } else if (value instanceof SyncValue.Value.IdentityHubState) {
            IdentityHubState.ADAPTER.encodeWithTag(reverseProtoWriter, 69, ((SyncValue.Value.IdentityHubState) value).value);
        } else if (value instanceof SyncValue.Value.AppLock) {
            UiAppLock.ADAPTER.encodeWithTag(reverseProtoWriter, 70, ((SyncValue.Value.AppLock) value).value);
        } else if (value instanceof SyncValue.Value.SponsorshipCryptoAuthorization) {
            SponsorshipCryptoAuthorization.ADAPTER.encodeWithTag(reverseProtoWriter, 71, ((SyncValue.Value.SponsorshipCryptoAuthorization) value).value);
        } else if (value instanceof SyncValue.Value.OfferCustomerPreference) {
            OfferCustomerPreference.ADAPTER.encodeWithTag(reverseProtoWriter, 72, ((SyncValue.Value.OfferCustomerPreference) value).value);
        } else if (value instanceof SyncValue.Value.PasskeyOptions) {
            PasskeyOptions.ADAPTER.encodeWithTag(reverseProtoWriter, 73, ((SyncValue.Value.PasskeyOptions) value).value);
        } else if (value instanceof SyncValue.Value.PaycheckAllocationDistribution) {
            AllocationDistribution.ADAPTER.encodeWithTag(reverseProtoWriter, 74, ((SyncValue.Value.PaycheckAllocationDistribution) value).value);
        } else if (value instanceof SyncValue.Value.PaychecksUiConfiguration) {
            UiConfiguration.ADAPTER.encodeWithTag(reverseProtoWriter, 75, ((SyncValue.Value.PaychecksUiConfiguration) value).value);
        } else if (value instanceof SyncValue.Value.PaychecksUiState) {
            UiState.ADAPTER.encodeWithTag(reverseProtoWriter, 76, ((SyncValue.Value.PaychecksUiState) value).value);
        } else if (value instanceof SyncValue.Value.PaperCashDepositEligibility) {
            PaperCashDepositEligibility.ADAPTER.encodeWithTag(reverseProtoWriter, 77, ((SyncValue.Value.PaperCashDepositEligibility) value).value);
        } else if (value instanceof SyncValue.Value.CheckDepositEligibility) {
            CheckDepositEligibility.ADAPTER.encodeWithTag(reverseProtoWriter, 78, ((SyncValue.Value.CheckDepositEligibility) value).value);
        } else if (value instanceof SyncValue.Value.WiresEligibilityState) {
            WiresEligibilityState.ADAPTER.encodeWithTag(reverseProtoWriter, 79, ((SyncValue.Value.WiresEligibilityState) value).value);
        } else if (value instanceof SyncValue.Value.BorrowAppletCreditLimitBorrowButtonTile) {
            BorrowAppletCreditLimitAndBorrowButtonTile.ADAPTER.encodeWithTag(reverseProtoWriter, 82, ((SyncValue.Value.BorrowAppletCreditLimitBorrowButtonTile) value).value);
        } else if (value instanceof SyncValue.Value.C4bProfileData) {
            BusinessProfileData.ADAPTER.encodeWithTag(reverseProtoWriter, 83, ((SyncValue.Value.C4bProfileData) value).value);
        } else if (value instanceof SyncValue.Value.ReactionsAvailable) {
            AvailableReactions.ADAPTER.encodeWithTag(reverseProtoWriter, 84, ((SyncValue.Value.ReactionsAvailable) value).value);
        } else if (value instanceof SyncValue.Value.BorrowAppletPaymentTimelineTile) {
            BorrowAppletPaymentTimelineTile.ADAPTER.encodeWithTag(reverseProtoWriter, 85, ((SyncValue.Value.BorrowAppletPaymentTimelineTile) value).value);
        } else if (value instanceof SyncValue.Value.BorrowAppletBulletinsTile) {
            BorrowAppletBulletinsTile.ADAPTER.encodeWithTag(reverseProtoWriter, 86, ((SyncValue.Value.BorrowAppletBulletinsTile) value).value);
        } else if (value instanceof SyncValue.Value.InternationalPaymentsCountryConfig) {
            InternationalPaymentsCountrySelectionSyncValue.ADAPTER.encodeWithTag(reverseProtoWriter, 87, ((SyncValue.Value.InternationalPaymentsCountryConfig) value).value);
        } else if (value instanceof SyncValue.Value.InternationalPaymentsCountryNotificationConfig) {
            InternationalPaymentsCountryNotificationSyncValue.ADAPTER.encodeWithTag(reverseProtoWriter, 89, ((SyncValue.Value.InternationalPaymentsCountryNotificationConfig) value).value);
        } else if (value instanceof SyncValue.Value.BorrowAppletLoanHistoryTile) {
            BorrowAppletLoanHistoryTile.ADAPTER.encodeWithTag(reverseProtoWriter, 88, ((SyncValue.Value.BorrowAppletLoanHistoryTile) value).value);
        } else if (value instanceof SyncValue.Value.BalanceBasedAddCashPreference) {
            BalanceBasedAddCashPreference.ADAPTER.encodeWithTag(reverseProtoWriter, 90, ((SyncValue.Value.BalanceBasedAddCashPreference) value).value);
        } else if (value instanceof SyncValue.Value.BorrowData) {
            BorrowData.ADAPTER.encodeWithTag(reverseProtoWriter, 91, ((SyncValue.Value.BorrowData) value).value);
        } else if (value instanceof SyncValue.Value.GlobalBorrowData) {
            GlobalBorrowData.ADAPTER.encodeWithTag(reverseProtoWriter, 92, ((SyncValue.Value.GlobalBorrowData) value).value);
        } else if (value instanceof SyncValue.Value.TransactionActivityConfig) {
            TransactionActivityConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 93, ((SyncValue.Value.TransactionActivityConfig) value).value);
        } else if (value instanceof SyncValue.Value.DisplayNameDetails) {
            DisplayNameDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 94, ((SyncValue.Value.DisplayNameDetails) value).value);
        } else if (value instanceof SyncValue.Value.InvestYourPaycheckAutomation) {
            UiInvestingAutomation.ADAPTER.encodeWithTag(reverseProtoWriter, 95, ((SyncValue.Value.InvestYourPaycheckAutomation) value).value);
        } else if (value instanceof SyncValue.Value.BusinessAddress) {
            UiAddress.ADAPTER.encodeWithTag(reverseProtoWriter, 96, ((SyncValue.Value.BusinessAddress) value).value);
        } else if (value instanceof SyncValue.Value.CommerceBrowserAutofillPreferences) {
            CommerceBrowserAutofillPreferences.ADAPTER.encodeWithTag(reverseProtoWriter, 97, ((SyncValue.Value.CommerceBrowserAutofillPreferences) value).value);
        } else if (value instanceof SyncValue.Value.AvailablePaymentPadThemes) {
            AvailablePaymentPadThemes.ADAPTER.encodeWithTag(reverseProtoWriter, 98, ((SyncValue.Value.AvailablePaymentPadThemes) value).value);
        } else if (value instanceof SyncValue.Value.FamilyTile) {
            UiFamilyTile.ADAPTER.encodeWithTag(reverseProtoWriter, 99, ((SyncValue.Value.FamilyTile) value).value);
        } else if (value instanceof SyncValue.Value.FdicInsuranceCustomerStatus) {
            FdicInsuranceCustomerStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 100, ((SyncValue.Value.FdicInsuranceCustomerStatus) value).value);
        } else if (value instanceof SyncValue.Value.PersonalInfoCtaBanner) {
            PersonalInfoCTABanner.ADAPTER.encodeWithTag(reverseProtoWriter, 102, ((SyncValue.Value.PersonalInfoCtaBanner) value).value);
        } else if (value instanceof SyncValue.Value.InputtedLegalName) {
            InputtedLegalName.ADAPTER.encodeWithTag(reverseProtoWriter, 103, ((SyncValue.Value.InputtedLegalName) value).value);
        } else if (value instanceof SyncValue.Value.ProfilePageUpsellComponent) {
            ProfilePageUpsellComponent.ADAPTER.encodeWithTag(reverseProtoWriter, 104, ((SyncValue.Value.ProfilePageUpsellComponent) value).value);
        } else if (value instanceof SyncValue.Value.C4bIdentityHubState) {
            C4BIdentityHubState.ADAPTER.encodeWithTag(reverseProtoWriter, 105, ((SyncValue.Value.C4bIdentityHubState) value).value);
        } else if (value instanceof SyncValue.Value.BtcAppletRenderingState) {
            BtcAppletRenderingState.ADAPTER.encodeWithTag(reverseProtoWriter, 106, ((SyncValue.Value.BtcAppletRenderingState) value).value);
        } else if (value instanceof SyncValue.Value.ShippingAddress) {
            SyncShippingAddress.ADAPTER.encodeWithTag(reverseProtoWriter, 107, ((SyncValue.Value.ShippingAddress) value).value);
        } else if (value instanceof SyncValue.Value.InvestDividendSetting) {
            InvestDividendSetting.ADAPTER.encodeWithTag(reverseProtoWriter, 108, ((SyncValue.Value.InvestDividendSetting) value).value);
        } else if (value instanceof SyncValue.Value.ProfilePageUpsellConfiguration) {
            ProfileUpsellConfiguration.ADAPTER.encodeWithTag(reverseProtoWriter, 109, ((SyncValue.Value.ProfilePageUpsellConfiguration) value).value);
        } else if (value instanceof SyncValue.Value.ProfilePageUpsellComponentV2) {
            ProfilePageUpsellComponentV2.ADAPTER.encodeWithTag(reverseProtoWriter, 110, ((SyncValue.Value.ProfilePageUpsellComponentV2) value).value);
        } else if (value instanceof SyncValue.Value.SupOffersTabCreditLine) {
            SupOffersTabCreditLine.ADAPTER.encodeWithTag(reverseProtoWriter, 111, ((SyncValue.Value.SupOffersTabCreditLine) value).value);
        } else if (value instanceof SyncValue.Value.C4bKybEligibilityWarning) {
            KybEligibilityWarning.ADAPTER.encodeWithTag(reverseProtoWriter, 113, ((SyncValue.Value.C4bKybEligibilityWarning) value).value);
        } else if (value instanceof SyncValue.Value.CardSpendingInsightsConfig) {
            CardSpendingInsightsConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 114, ((SyncValue.Value.CardSpendingInsightsConfig) value).value);
        } else if (value instanceof SyncValue.Value.CardSpendingInsightsHome) {
            CardSpendingInsightsHome.ADAPTER.encodeWithTag(reverseProtoWriter, 115, ((SyncValue.Value.CardSpendingInsightsHome) value).value);
        } else if (value instanceof SyncValue.Value.SavingsApplet) {
            SavingsApplet.ADAPTER.encodeWithTag(reverseProtoWriter, 116, ((SyncValue.Value.SavingsApplet) value).value);
        } else if (value instanceof SyncValue.Value.Scheme) {
            com.squareup.protos.cash.postcard.CardScheme.ADAPTER.encodeWithTag(reverseProtoWriter, 117, ((SyncValue.Value.Scheme) value).value);
        } else if (value instanceof SyncValue.Value.AfterpayPrepurchaseData) {
            AfterpayPrepurchaseData.ADAPTER.encodeWithTag(reverseProtoWriter, 118, ((SyncValue.Value.AfterpayPrepurchaseData) value).value);
        } else if (value instanceof SyncValue.Value.BillsApplet) {
            BillsApplet.ADAPTER.encodeWithTag(reverseProtoWriter, 119, ((SyncValue.Value.BillsApplet) value).value);
        } else if (value instanceof SyncValue.Value.ScenarioPlan) {
            ScenarioPlanEntry.ADAPTER.encodeWithTag(reverseProtoWriter, 120, ((SyncValue.Value.ScenarioPlan) value).value);
        } else if (value instanceof SyncValue.Value.BillsConfig) {
            BillsConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 121, ((SyncValue.Value.BillsConfig) value).value);
        } else if (value instanceof SyncValue.Value.LocalCard) {
            LocalCard.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, ((SyncValue.Value.LocalCard) value).value);
        } else if (value instanceof SyncValue.Value.C4bTapToPay) {
            TapToPay.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, ((SyncValue.Value.C4bTapToPay) value).value);
        } else if (value instanceof SyncValue.Value.NotificationSettings) {
            UiNotificationSettings.ADAPTER.encodeWithTag(reverseProtoWriter, 125, ((SyncValue.Value.NotificationSettings) value).value);
        } else if (value instanceof SyncValue.Value.CardThemeDefinitions) {
            CardThemeDefinitions.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, ((SyncValue.Value.CardThemeDefinitions) value).value);
        } else if (value instanceof SyncValue.Value.SupportPhoneConfirmation) {
            SupportPhoneConfirmation.ADAPTER.encodeWithTag(reverseProtoWriter, 127, ((SyncValue.Value.SupportPhoneConfirmation) value).value);
        } else if (value instanceof SyncValue.Value.AppThemeDefinitions) {
            AppThemeDefinitions.ADAPTER.encodeWithTag(reverseProtoWriter, 128, ((SyncValue.Value.AppThemeDefinitions) value).value);
        } else if (value instanceof SyncValue.Value.Accounts) {
            SyncValueAccounts.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, ((SyncValue.Value.Accounts) value).value);
        } else if (value instanceof SyncValue.Value.SavingsFolders) {
            VersionedSavingsFolders.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, ((SyncValue.Value.SavingsFolders) value).value);
        } else if (value instanceof SyncValue.Value.SavingsScreens) {
            VersionedSavingsScreens.ADAPTER.encodeWithTag(reverseProtoWriter, 131, ((SyncValue.Value.SavingsScreens) value).value);
        } else if (value instanceof SyncValue.Value.LocalAccount) {
            LocalAccount.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, ((SyncValue.Value.LocalAccount) value).value);
        } else if (value instanceof SyncValue.Value.BitcoinPerformanceSummary) {
            PerformanceSummary.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, ((SyncValue.Value.BitcoinPerformanceSummary) value).value);
        } else if (value instanceof SyncValue.Value.BitcoinPerformanceDetails) {
            PerformanceDetails.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE, ((SyncValue.Value.BitcoinPerformanceDetails) value).value);
        } else if (value instanceof SyncValue.Value.EarningsTrackerSummary) {
            EarningsTrackerSummary.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE, ((SyncValue.Value.EarningsTrackerSummary) value).value);
        } else if (value instanceof SyncValue.Value.FeatureEligibilityRefreshPolicy) {
            FeatureEligibilityRefreshPolicy.ADAPTER.encodeWithTag(reverseProtoWriter, 136, ((SyncValue.Value.FeatureEligibilityRefreshPolicy) value).value);
        } else if (value instanceof SyncValue.Value.BitcoinPerformanceDetailsUi) {
            PerformanceDetailsUi.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE, ((SyncValue.Value.BitcoinPerformanceDetailsUi) value).value);
        } else if (value instanceof SyncValue.Value.BitcoinPerformanceDetailsUserInterface) {
            PerformanceDetailsUi.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, ((SyncValue.Value.BitcoinPerformanceDetailsUserInterface) value).value);
        } else if (value instanceof SyncValue.Value.CashAppCard) {
            CashAppCard.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, ((SyncValue.Value.CashAppCard) value).value);
        } else if (value instanceof SyncValue.Value.LocalCashBalance) {
            LocalCashBalance.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE, ((SyncValue.Value.LocalCashBalance) value).value);
        } else if (value instanceof SyncValue.Value.CustomerShoppingPreference) {
            CustomerShoppingPreference.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE, ((SyncValue.Value.CustomerShoppingPreference) value).value);
        } else if (value instanceof SyncValue.Value.BorrowAppletLinksTile) {
            BorrowAppletLinksTile.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE, ((SyncValue.Value.BorrowAppletLinksTile) value).value);
        } else if (value instanceof SyncValue.Value.SavingsExternalElements) {
            SavingsExternalElements.ADAPTER.encodeWithTag(reverseProtoWriter, 144, ((SyncValue.Value.SavingsExternalElements) value).value);
        } else if (value instanceof SyncValue.Value.TapToPayDescriptionSuggestions) {
            TapToPayDescriptionSuggestions.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE, ((SyncValue.Value.TapToPayDescriptionSuggestions) value).value);
        } else if (value instanceof SyncValue.Value.CashOClockPreference) {
            CashOClockPreference.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE, ((SyncValue.Value.CashOClockPreference) value).value);
        } else if (value instanceof SyncValue.Value.DisplayName) {
            DisplayName.ADAPTER.encodeWithTag(reverseProtoWriter, 147, ((SyncValue.Value.DisplayName) value).value);
        } else if (value instanceof SyncValue.Value.MultiInstrumentLinkingOptions) {
            MultiInstrumentLinkingOptions.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE, ((SyncValue.Value.MultiInstrumentLinkingOptions) value).value);
        } else if (value instanceof SyncValue.Value.AccountSuspension) {
            AccountSuspension.ADAPTER.encodeWithTag(reverseProtoWriter, 150, ((SyncValue.Value.AccountSuspension) value).value);
        } else if (value instanceof SyncValue.Value.CashOutInstrumentCapabilityConfig) {
            CashOutInstrumentCapabilityConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 151, ((SyncValue.Value.CashOutInstrumentCapabilityConfig) value).value);
        } else if (value instanceof SyncValue.Value.BorrowLimitHubData) {
            BorrowLimitHubData.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, ((SyncValue.Value.BorrowLimitHubData) value).value);
        } else if (value instanceof SyncValue.Value.PrepurchaseCashCardData) {
            PrepurchaseCashCardData.ADAPTER.encodeWithTag(reverseProtoWriter, 153, ((SyncValue.Value.PrepurchaseCashCardData) value).value);
        } else if (value instanceof SyncValue.Value.P2pAllowlistCustomer) {
            P2PAllowListCustomer.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE, ((SyncValue.Value.P2pAllowlistCustomer) value).value);
        } else if (value instanceof SyncValue.Value.P2pControl) {
            P2PControl.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_MANAGE_CONNECTIONS_VALUE, ((SyncValue.Value.P2pControl) value).value);
        } else if (value instanceof SyncValue.Value.CashGreen) {
            VersionedCashGreen.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_CENTERED_VALUE, ((SyncValue.Value.CashGreen) value).value);
        } else if (value instanceof SyncValue.Value.GreenBenefits) {
            VersionedGreenBenefits.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE, ((SyncValue.Value.GreenBenefits) value).value);
        } else if (value instanceof SyncValue.Value.GreenBooklet) {
            VersionedGreenBooklet.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, ((SyncValue.Value.GreenBooklet) value).value);
        } else if (value instanceof SyncValue.Value.ClientSyncConfig) {
            ClientSyncConfig.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, ((SyncValue.Value.ClientSyncConfig) value).value);
        } else if (value instanceof SyncValue.Value.BadgingData) {
            BadgingData.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE, ((SyncValue.Value.BadgingData) value).value);
        } else if (value instanceof SyncValue.Value.KgooseUserSettings) {
            CashUserSettings.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, ((SyncValue.Value.KgooseUserSettings) value).value);
        } else if (value instanceof SyncValue.Value.KgooseGlobalUserSettings) {
            CashGlobalUserSettings.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE, ((SyncValue.Value.KgooseGlobalUserSettings) value).value);
        } else if (value instanceof SyncValue.Value.AuthorizedAccount) {
            SyncValueAuthorizedAccount.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, ((SyncValue.Value.AuthorizedAccount) value).value);
        } else if (value instanceof SyncValue.Value.RestrictionsData) {
            RestrictionsData.ADAPTER.encodeWithTag(reverseProtoWriter, 165, ((SyncValue.Value.RestrictionsData) value).value);
        } else if (value instanceof SyncValue.Value.AdversityBanner) {
            AdversityBanner.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE, ((SyncValue.Value.AdversityBanner) value).value);
        } else if (value instanceof SyncValue.Value.BankingBenefitsConfig) {
            BankingBenefitsConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 167, ((SyncValue.Value.BankingBenefitsConfig) value).value);
        } else if (value instanceof SyncValue.Value.MoneyTab) {
            MoneyTab.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, ((SyncValue.Value.MoneyTab) value).value);
        } else if (value instanceof SyncValue.Value.LocalPosCheckIn) {
            LocalPOSCheckIn.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, ((SyncValue.Value.LocalPosCheckIn) value).value);
        } else if (value instanceof SyncValue.Value.DemandDepositAccount) {
            DemandDepositAccount.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, ((SyncValue.Value.DemandDepositAccount) value).value);
        } else if (value instanceof SyncValue.Value.InvestPortfoliosPerformance) {
            PortfoliosPerformanceValue.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE, ((SyncValue.Value.InvestPortfoliosPerformance) value).value);
        } else if (value instanceof SyncValue.Value.CashCreditScoreSyncData) {
            CashCreditScoreSyncData.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, ((SyncValue.Value.CashCreditScoreSyncData) value).value);
        } else if (value instanceof SyncValue.Value.CashOutFeeData) {
            CashOutFeeData.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, ((SyncValue.Value.CashOutFeeData) value).value);
        } else if (value instanceof SyncValue.Value.RecipientSuggestions) {
            RecipientSuggestions.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, ((SyncValue.Value.RecipientSuggestions) value).value);
        } else if (value instanceof SyncValue.Value.CashAppTag) {
            CashAppTag.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE, ((SyncValue.Value.CashAppTag) value).value);
        } else if (value instanceof SyncValue.Value.InvestPortfoliosHistoricalData) {
            PortfoliosHistoricalDataValue.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE, ((SyncValue.Value.InvestPortfoliosHistoricalData) value).value);
        } else if (value instanceof SyncValue.Value.CardSkinAssets) {
            CardSkinAssets.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, ((SyncValue.Value.CardSkinAssets) value).value);
        } else if (value instanceof SyncValue.Value.PhonePlanApplet) {
            VersionedPhonePlanApplet.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, ((SyncValue.Value.PhonePlanApplet) value).value);
        } else if (value instanceof SyncValue.Value.TagThemeDefinitions) {
            TagThemeDefinitions.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_VERIFICATION_IN_PROGRESS_DARK_APPEARANCE_VALUE, ((SyncValue.Value.TagThemeDefinitions) value).value);
        } else if (value instanceof SyncValue.Value.BtcP2pConversionBps) {
            BtcP2pConversionBps.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE, ((SyncValue.Value.BtcP2pConversionBps) value).value);
        } else if (value instanceof SyncValue.Value.PaymentDevicePresentation) {
            PaymentDevicePresentation.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE, ((SyncValue.Value.PaymentDevicePresentation) value).value);
        } else if (value instanceof SyncValue.Value.LocalEarningCard) {
            LocalEarningCard.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE, ((SyncValue.Value.LocalEarningCard) value).value);
        } else if (value instanceof SyncValue.Value.EarningsHomeUiState) {
            EarningsHomeUIState.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, ((SyncValue.Value.EarningsHomeUiState) value).value);
        } else if (value instanceof SyncValue.Value.EarningsAppletUiState) {
            EarningsAppletUIState.ADAPTER.encodeWithTag(reverseProtoWriter, 185, ((SyncValue.Value.EarningsAppletUiState) value).value);
        } else if (value instanceof SyncValue.Value.CashForWorkApplet) {
            VersionedCashForWorkApplet.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE, ((SyncValue.Value.CashForWorkApplet) value).value);
        } else if (value instanceof SyncValue.Value.AutoBtcWithdrawThreshold) {
            AutoBtcWithdrawThresholdSyncValue.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE, ((SyncValue.Value.AutoBtcWithdrawThreshold) value).value);
        } else if (value instanceof SyncValue.Value.FinishSetupTile) {
            VersionedFinishSetupTile.ADAPTER.encodeWithTag(reverseProtoWriter, 188, ((SyncValue.Value.FinishSetupTile) value).value);
        } else if (value instanceof SyncValue.Value.EarnerEnrollmentState) {
            EarnerEnrollmentState.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, ((SyncValue.Value.EarnerEnrollmentState) value).value);
        } else if (value instanceof SyncValue.Value.CashLiteDefaultBankAccount) {
            CashLiteDefaultBankAccount.ADAPTER.encodeWithTag(reverseProtoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, ((SyncValue.Value.CashLiteDefaultBankAccount) value).value);
        } else if (value != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        SyncValueType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, syncValue.f1393type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        SyncValue syncValue = (SyncValue) obj;
        syncValue.getClass();
        int encodedSizeWithTag2 = SyncValueType.ADAPTER.encodedSizeWithTag(1, syncValue.f1393type) + syncValue.unknownFields().getSize$okio();
        SyncValue.Value value = syncValue.value;
        if (value instanceof SyncValue.Value.Instrument) {
            encodedSizeWithTag = Instrument.ADAPTER.encodedSizeWithTag(3, ((SyncValue.Value.Instrument) value).value);
        } else if (value instanceof SyncValue.Value.AtmPicker) {
            encodedSizeWithTag = ATMPicker.ADAPTER.encodedSizeWithTag(12, ((SyncValue.Value.AtmPicker) value).value);
        } else if (value instanceof SyncValue.Value.BalanceSnapshot) {
            encodedSizeWithTag = BalanceSnapshot.ADAPTER.encodedSizeWithTag(13, ((SyncValue.Value.BalanceSnapshot) value).value);
        } else if (value instanceof SyncValue.Value.Dda) {
            encodedSizeWithTag = UiDda.ADAPTER.encodedSizeWithTag(14, ((SyncValue.Value.Dda) value).value);
        } else if (value instanceof SyncValue.Value.Access) {
            encodedSizeWithTag = UiAccess.ADAPTER.encodedSizeWithTag(15, ((SyncValue.Value.Access) value).value);
        } else if (value instanceof SyncValue.Value.Address) {
            encodedSizeWithTag = UiAddress.ADAPTER.encodedSizeWithTag(16, ((SyncValue.Value.Address) value).value);
        } else if (value instanceof SyncValue.Value.StatusAndLimits) {
            encodedSizeWithTag = UiStatusAndLimits.ADAPTER.encodedSizeWithTag(17, ((SyncValue.Value.StatusAndLimits) value).value);
        } else if (value instanceof SyncValue.Value.AppMessages) {
            encodedSizeWithTag = UiAppMesssages.ADAPTER.encodedSizeWithTag(18, ((SyncValue.Value.AppMessages) value).value);
        } else if (value instanceof SyncValue.Value.CoreCustomer) {
            encodedSizeWithTag = UiCoreCustomer.ADAPTER.encodedSizeWithTag(19, ((SyncValue.Value.CoreCustomer) value).value);
        } else if (value instanceof SyncValue.Value.IssuedCard) {
            encodedSizeWithTag = UiIssuedCard.ADAPTER.encodedSizeWithTag(21, ((SyncValue.Value.IssuedCard) value).value);
        } else if (value instanceof SyncValue.Value.Marketing) {
            encodedSizeWithTag = UiMarketing.ADAPTER.encodedSizeWithTag(22, ((SyncValue.Value.Marketing) value).value);
        } else if (value instanceof SyncValue.Value.P2pSettings) {
            encodedSizeWithTag = UiP2pSettings.ADAPTER.encodedSizeWithTag(23, ((SyncValue.Value.P2pSettings) value).value);
        } else if (value instanceof SyncValue.Value.ScheduledPayments) {
            encodedSizeWithTag = UiScheduledPayments.ADAPTER.encodedSizeWithTag(24, ((SyncValue.Value.ScheduledPayments) value).value);
        } else if (value instanceof SyncValue.Value.PublicProfile) {
            encodedSizeWithTag = UiPublicProfile.ADAPTER.encodedSizeWithTag(26, ((SyncValue.Value.PublicProfile) value).value);
        } else if (value instanceof SyncValue.Value.ProfileAlias) {
            encodedSizeWithTag = ProfileAlias.ADAPTER.encodedSizeWithTag(27, ((SyncValue.Value.ProfileAlias) value).value);
        } else if (value instanceof SyncValue.Value.LoyaltyProfile) {
            encodedSizeWithTag = LoyaltyProfile.ADAPTER.encodedSizeWithTag(28, ((SyncValue.Value.LoyaltyProfile) value).value);
        } else if (value instanceof SyncValue.Value.CheckDepositProfile) {
            encodedSizeWithTag = CheckDepositProfile.ADAPTER.encodedSizeWithTag(29, ((SyncValue.Value.CheckDepositProfile) value).value);
        } else if (value instanceof SyncValue.Value.InvestmentNotificationSettings) {
            encodedSizeWithTag = NotificationsSettings.ADAPTER.encodedSizeWithTag(30, ((SyncValue.Value.InvestmentNotificationSettings) value).value);
        } else if (value instanceof SyncValue.Value.ProfileDetails) {
            encodedSizeWithTag = ProfileDetails.ADAPTER.encodedSizeWithTag(31, ((SyncValue.Value.ProfileDetails) value).value);
        } else if (value instanceof SyncValue.Value.Wallet) {
            encodedSizeWithTag = Wallet.ADAPTER.encodedSizeWithTag(32, ((SyncValue.Value.Wallet) value).value);
        } else if (value instanceof SyncValue.Value.BankingTab) {
            encodedSizeWithTag = BankingTab.ADAPTER.encodedSizeWithTag(33, ((SyncValue.Value.BankingTab) value).value);
        } else if (value instanceof SyncValue.Value.JurisdictionConfig) {
            encodedSizeWithTag = UiJurisdictionConfig.ADAPTER.encodedSizeWithTag(34, ((SyncValue.Value.JurisdictionConfig) value).value);
        } else if (value instanceof SyncValue.Value.Cryptocurrency) {
            encodedSizeWithTag = UiCryptoCurrency.ADAPTER.encodedSizeWithTag(35, ((SyncValue.Value.Cryptocurrency) value).value);
        } else if (value instanceof SyncValue.Value.ExchangeData) {
            encodedSizeWithTag = UiExchangeData.ADAPTER.encodedSizeWithTag(36, ((SyncValue.Value.ExchangeData) value).value);
        } else if (value instanceof SyncValue.Value.NotificationPreference) {
            encodedSizeWithTag = UiNotificationPreference.ADAPTER.encodedSizeWithTag(37, ((SyncValue.Value.NotificationPreference) value).value);
        } else if (value instanceof SyncValue.Value.DataPrivacySettings) {
            encodedSizeWithTag = DataPrivacySettings.ADAPTER.encodedSizeWithTag(38, ((SyncValue.Value.DataPrivacySettings) value).value);
        } else if (value instanceof SyncValue.Value.PasswordInfo) {
            encodedSizeWithTag = PasswordInfo.ADAPTER.encodedSizeWithTag(39, ((SyncValue.Value.PasswordInfo) value).value);
        } else if (value instanceof SyncValue.Value.OtpInfo) {
            encodedSizeWithTag = OTPInfo.ADAPTER.encodedSizeWithTag(40, ((SyncValue.Value.OtpInfo) value).value);
        } else if (value instanceof SyncValue.Value.FamilyAccount) {
            encodedSizeWithTag = UiFamilyAccount.ADAPTER.encodedSizeWithTag(41, ((SyncValue.Value.FamilyAccount) value).value);
        } else if (value instanceof SyncValue.Value.InvestingAutomation) {
            encodedSizeWithTag = UiInvestingAutomation.ADAPTER.encodedSizeWithTag(42, ((SyncValue.Value.InvestingAutomation) value).value);
        } else if (value instanceof SyncValue.Value.LendingInfo) {
            encodedSizeWithTag = LendingInfo.ADAPTER.encodedSizeWithTag(43, ((SyncValue.Value.LendingInfo) value).value);
        } else if (value instanceof SyncValue.Value.TrustedContact) {
            encodedSizeWithTag = SyncTrustedContact.ADAPTER.encodedSizeWithTag(44, ((SyncValue.Value.TrustedContact) value).value);
        } else if (value instanceof SyncValue.Value.IdvState) {
            encodedSizeWithTag = UiIdvState.ADAPTER.encodedSizeWithTag(45, ((SyncValue.Value.IdvState) value).value);
        } else if (value instanceof SyncValue.Value.CryptocurrencyProfile) {
            encodedSizeWithTag = CryptocurrencyProfile.ADAPTER.encodedSizeWithTag(46, ((SyncValue.Value.CryptocurrencyProfile) value).value);
        } else if (value instanceof SyncValue.Value.InvestAutomatorNotificationSettings) {
            encodedSizeWithTag = NotificationsSettings.ADAPTER.encodedSizeWithTag(47, ((SyncValue.Value.InvestAutomatorNotificationSettings) value).value);
        } else if (value instanceof SyncValue.Value.Favorite) {
            encodedSizeWithTag = Favorite.ADAPTER.encodedSizeWithTag(48, ((SyncValue.Value.Favorite) value).value);
        } else if (value instanceof SyncValue.Value.SavingsConfig) {
            encodedSizeWithTag = SavingsConfig.ADAPTER.encodedSizeWithTag(49, ((SyncValue.Value.SavingsConfig) value).value);
        } else if (value instanceof SyncValue.Value.SavingsHome) {
            encodedSizeWithTag = SavingsHome.ADAPTER.encodedSizeWithTag(50, ((SyncValue.Value.SavingsHome) value).value);
        } else if (value instanceof SyncValue.Value.InvestPortfolioState) {
            encodedSizeWithTag = PortfolioState.ADAPTER.encodedSizeWithTag(51, ((SyncValue.Value.InvestPortfolioState) value).value);
        } else if (value instanceof SyncValue.Value.InvestTradingState) {
            encodedSizeWithTag = TradingState.ADAPTER.encodedSizeWithTag(52, ((SyncValue.Value.InvestTradingState) value).value);
        } else if (value instanceof SyncValue.Value.SavingsFolder) {
            encodedSizeWithTag = SavingsFolder.ADAPTER.encodedSizeWithTag(53, ((SyncValue.Value.SavingsFolder) value).value);
        } else if (value instanceof SyncValue.Value.Tigers) {
            encodedSizeWithTag = Tigers.ADAPTER.encodedSizeWithTag(54, ((SyncValue.Value.Tigers) value).value);
        } else if (value instanceof SyncValue.Value.WiresAccountInfo) {
            encodedSizeWithTag = WiresAccountInfo.ADAPTER.encodedSizeWithTag(55, ((SyncValue.Value.WiresAccountInfo) value).value);
        } else if (value instanceof SyncValue.Value.TaxUpgrade) {
            encodedSizeWithTag = UiTaxUpgrade.ADAPTER.encodedSizeWithTag(56, ((SyncValue.Value.TaxUpgrade) value).value);
        } else if (value instanceof SyncValue.Value.EfileInfo) {
            encodedSizeWithTag = UiEfileInfo.ADAPTER.encodedSizeWithTag(57, ((SyncValue.Value.EfileInfo) value).value);
        } else if (value instanceof SyncValue.Value.CashLimits) {
            encodedSizeWithTag = UiCashLimits.ADAPTER.encodedSizeWithTag(58, ((SyncValue.Value.CashLimits) value).value);
        } else if (value instanceof SyncValue.Value.Lions) {
            encodedSizeWithTag = Lions.ADAPTER.encodedSizeWithTag(59, ((SyncValue.Value.Lions) value).value);
        } else if (value instanceof SyncValue.Value.DeviceInfo) {
            encodedSizeWithTag = DeviceInfo.ADAPTER.encodedSizeWithTag(60, ((SyncValue.Value.DeviceInfo) value).value);
        } else if (value instanceof SyncValue.Value.LimitsPageletInlineMessage) {
            encodedSizeWithTag = LimitsPageletInlineMessage.ADAPTER.encodedSizeWithTag(61, ((SyncValue.Value.LimitsPageletInlineMessage) value).value);
        } else if (value instanceof SyncValue.Value.SchemaVersions) {
            encodedSizeWithTag = SyncValueSchemaVersions.ADAPTER.encodedSizeWithTag(62, ((SyncValue.Value.SchemaVersions) value).value);
        } else if (value instanceof SyncValue.Value.Cats) {
            encodedSizeWithTag = Cats.ADAPTER.encodedSizeWithTag(63, ((SyncValue.Value.Cats) value).value);
        } else if (value instanceof SyncValue.Value.InstrumentLinkingOption) {
            encodedSizeWithTag = InstrumentLinkingOption.ADAPTER.encodedSizeWithTag(64, ((SyncValue.Value.InstrumentLinkingOption) value).value);
        } else if (value instanceof SyncValue.Value.Rabbits) {
            encodedSizeWithTag = Rabbits.ADAPTER.encodedSizeWithTag(65, ((SyncValue.Value.Rabbits) value).value);
        } else if (value instanceof SyncValue.Value.OverdraftStatus) {
            encodedSizeWithTag = OverdraftStatus.ADAPTER.encodedSizeWithTag(66, ((SyncValue.Value.OverdraftStatus) value).value);
        } else if (value instanceof SyncValue.Value.OverdraftUsage) {
            encodedSizeWithTag = OverdraftUsage.ADAPTER.encodedSizeWithTag(67, ((SyncValue.Value.OverdraftUsage) value).value);
        } else if (value instanceof SyncValue.Value.InstrumentLinkingOptions) {
            encodedSizeWithTag = InstrumentLinkingOptions.ADAPTER.encodedSizeWithTag(68, ((SyncValue.Value.InstrumentLinkingOptions) value).value);
        } else if (value instanceof SyncValue.Value.IdentityHubState) {
            encodedSizeWithTag = IdentityHubState.ADAPTER.encodedSizeWithTag(69, ((SyncValue.Value.IdentityHubState) value).value);
        } else if (value instanceof SyncValue.Value.AppLock) {
            encodedSizeWithTag = UiAppLock.ADAPTER.encodedSizeWithTag(70, ((SyncValue.Value.AppLock) value).value);
        } else if (value instanceof SyncValue.Value.SponsorshipCryptoAuthorization) {
            encodedSizeWithTag = SponsorshipCryptoAuthorization.ADAPTER.encodedSizeWithTag(71, ((SyncValue.Value.SponsorshipCryptoAuthorization) value).value);
        } else if (value instanceof SyncValue.Value.OfferCustomerPreference) {
            encodedSizeWithTag = OfferCustomerPreference.ADAPTER.encodedSizeWithTag(72, ((SyncValue.Value.OfferCustomerPreference) value).value);
        } else if (value instanceof SyncValue.Value.PasskeyOptions) {
            encodedSizeWithTag = PasskeyOptions.ADAPTER.encodedSizeWithTag(73, ((SyncValue.Value.PasskeyOptions) value).value);
        } else if (value instanceof SyncValue.Value.PaycheckAllocationDistribution) {
            encodedSizeWithTag = AllocationDistribution.ADAPTER.encodedSizeWithTag(74, ((SyncValue.Value.PaycheckAllocationDistribution) value).value);
        } else if (value instanceof SyncValue.Value.PaychecksUiConfiguration) {
            encodedSizeWithTag = UiConfiguration.ADAPTER.encodedSizeWithTag(75, ((SyncValue.Value.PaychecksUiConfiguration) value).value);
        } else if (value instanceof SyncValue.Value.PaychecksUiState) {
            encodedSizeWithTag = UiState.ADAPTER.encodedSizeWithTag(76, ((SyncValue.Value.PaychecksUiState) value).value);
        } else if (value instanceof SyncValue.Value.PaperCashDepositEligibility) {
            encodedSizeWithTag = PaperCashDepositEligibility.ADAPTER.encodedSizeWithTag(77, ((SyncValue.Value.PaperCashDepositEligibility) value).value);
        } else if (value instanceof SyncValue.Value.CheckDepositEligibility) {
            encodedSizeWithTag = CheckDepositEligibility.ADAPTER.encodedSizeWithTag(78, ((SyncValue.Value.CheckDepositEligibility) value).value);
        } else if (value instanceof SyncValue.Value.WiresEligibilityState) {
            encodedSizeWithTag = WiresEligibilityState.ADAPTER.encodedSizeWithTag(79, ((SyncValue.Value.WiresEligibilityState) value).value);
        } else if (value instanceof SyncValue.Value.BorrowAppletCreditLimitBorrowButtonTile) {
            encodedSizeWithTag = BorrowAppletCreditLimitAndBorrowButtonTile.ADAPTER.encodedSizeWithTag(82, ((SyncValue.Value.BorrowAppletCreditLimitBorrowButtonTile) value).value);
        } else if (value instanceof SyncValue.Value.C4bProfileData) {
            encodedSizeWithTag = BusinessProfileData.ADAPTER.encodedSizeWithTag(83, ((SyncValue.Value.C4bProfileData) value).value);
        } else if (value instanceof SyncValue.Value.ReactionsAvailable) {
            encodedSizeWithTag = AvailableReactions.ADAPTER.encodedSizeWithTag(84, ((SyncValue.Value.ReactionsAvailable) value).value);
        } else if (value instanceof SyncValue.Value.BorrowAppletPaymentTimelineTile) {
            encodedSizeWithTag = BorrowAppletPaymentTimelineTile.ADAPTER.encodedSizeWithTag(85, ((SyncValue.Value.BorrowAppletPaymentTimelineTile) value).value);
        } else if (value instanceof SyncValue.Value.BorrowAppletBulletinsTile) {
            encodedSizeWithTag = BorrowAppletBulletinsTile.ADAPTER.encodedSizeWithTag(86, ((SyncValue.Value.BorrowAppletBulletinsTile) value).value);
        } else if (value instanceof SyncValue.Value.InternationalPaymentsCountryConfig) {
            encodedSizeWithTag = InternationalPaymentsCountrySelectionSyncValue.ADAPTER.encodedSizeWithTag(87, ((SyncValue.Value.InternationalPaymentsCountryConfig) value).value);
        } else if (value instanceof SyncValue.Value.InternationalPaymentsCountryNotificationConfig) {
            encodedSizeWithTag = InternationalPaymentsCountryNotificationSyncValue.ADAPTER.encodedSizeWithTag(89, ((SyncValue.Value.InternationalPaymentsCountryNotificationConfig) value).value);
        } else if (value instanceof SyncValue.Value.BorrowAppletLoanHistoryTile) {
            encodedSizeWithTag = BorrowAppletLoanHistoryTile.ADAPTER.encodedSizeWithTag(88, ((SyncValue.Value.BorrowAppletLoanHistoryTile) value).value);
        } else if (value instanceof SyncValue.Value.BalanceBasedAddCashPreference) {
            encodedSizeWithTag = BalanceBasedAddCashPreference.ADAPTER.encodedSizeWithTag(90, ((SyncValue.Value.BalanceBasedAddCashPreference) value).value);
        } else if (value instanceof SyncValue.Value.BorrowData) {
            encodedSizeWithTag = BorrowData.ADAPTER.encodedSizeWithTag(91, ((SyncValue.Value.BorrowData) value).value);
        } else if (value instanceof SyncValue.Value.GlobalBorrowData) {
            encodedSizeWithTag = GlobalBorrowData.ADAPTER.encodedSizeWithTag(92, ((SyncValue.Value.GlobalBorrowData) value).value);
        } else if (value instanceof SyncValue.Value.TransactionActivityConfig) {
            encodedSizeWithTag = TransactionActivityConfig.ADAPTER.encodedSizeWithTag(93, ((SyncValue.Value.TransactionActivityConfig) value).value);
        } else if (value instanceof SyncValue.Value.DisplayNameDetails) {
            encodedSizeWithTag = DisplayNameDetails.ADAPTER.encodedSizeWithTag(94, ((SyncValue.Value.DisplayNameDetails) value).value);
        } else if (value instanceof SyncValue.Value.InvestYourPaycheckAutomation) {
            encodedSizeWithTag = UiInvestingAutomation.ADAPTER.encodedSizeWithTag(95, ((SyncValue.Value.InvestYourPaycheckAutomation) value).value);
        } else if (value instanceof SyncValue.Value.BusinessAddress) {
            encodedSizeWithTag = UiAddress.ADAPTER.encodedSizeWithTag(96, ((SyncValue.Value.BusinessAddress) value).value);
        } else if (value instanceof SyncValue.Value.CommerceBrowserAutofillPreferences) {
            encodedSizeWithTag = CommerceBrowserAutofillPreferences.ADAPTER.encodedSizeWithTag(97, ((SyncValue.Value.CommerceBrowserAutofillPreferences) value).value);
        } else if (value instanceof SyncValue.Value.AvailablePaymentPadThemes) {
            encodedSizeWithTag = AvailablePaymentPadThemes.ADAPTER.encodedSizeWithTag(98, ((SyncValue.Value.AvailablePaymentPadThemes) value).value);
        } else if (value instanceof SyncValue.Value.FamilyTile) {
            encodedSizeWithTag = UiFamilyTile.ADAPTER.encodedSizeWithTag(99, ((SyncValue.Value.FamilyTile) value).value);
        } else if (value instanceof SyncValue.Value.FdicInsuranceCustomerStatus) {
            encodedSizeWithTag = FdicInsuranceCustomerStatus.ADAPTER.encodedSizeWithTag(100, ((SyncValue.Value.FdicInsuranceCustomerStatus) value).value);
        } else if (value instanceof SyncValue.Value.PersonalInfoCtaBanner) {
            encodedSizeWithTag = PersonalInfoCTABanner.ADAPTER.encodedSizeWithTag(102, ((SyncValue.Value.PersonalInfoCtaBanner) value).value);
        } else if (value instanceof SyncValue.Value.InputtedLegalName) {
            encodedSizeWithTag = InputtedLegalName.ADAPTER.encodedSizeWithTag(103, ((SyncValue.Value.InputtedLegalName) value).value);
        } else if (value instanceof SyncValue.Value.ProfilePageUpsellComponent) {
            encodedSizeWithTag = ProfilePageUpsellComponent.ADAPTER.encodedSizeWithTag(104, ((SyncValue.Value.ProfilePageUpsellComponent) value).value);
        } else if (value instanceof SyncValue.Value.C4bIdentityHubState) {
            encodedSizeWithTag = C4BIdentityHubState.ADAPTER.encodedSizeWithTag(105, ((SyncValue.Value.C4bIdentityHubState) value).value);
        } else if (value instanceof SyncValue.Value.BtcAppletRenderingState) {
            encodedSizeWithTag = BtcAppletRenderingState.ADAPTER.encodedSizeWithTag(106, ((SyncValue.Value.BtcAppletRenderingState) value).value);
        } else if (value instanceof SyncValue.Value.ShippingAddress) {
            encodedSizeWithTag = SyncShippingAddress.ADAPTER.encodedSizeWithTag(107, ((SyncValue.Value.ShippingAddress) value).value);
        } else if (value instanceof SyncValue.Value.InvestDividendSetting) {
            encodedSizeWithTag = InvestDividendSetting.ADAPTER.encodedSizeWithTag(108, ((SyncValue.Value.InvestDividendSetting) value).value);
        } else if (value instanceof SyncValue.Value.ProfilePageUpsellConfiguration) {
            encodedSizeWithTag = ProfileUpsellConfiguration.ADAPTER.encodedSizeWithTag(109, ((SyncValue.Value.ProfilePageUpsellConfiguration) value).value);
        } else if (value instanceof SyncValue.Value.ProfilePageUpsellComponentV2) {
            encodedSizeWithTag = ProfilePageUpsellComponentV2.ADAPTER.encodedSizeWithTag(110, ((SyncValue.Value.ProfilePageUpsellComponentV2) value).value);
        } else if (value instanceof SyncValue.Value.SupOffersTabCreditLine) {
            encodedSizeWithTag = SupOffersTabCreditLine.ADAPTER.encodedSizeWithTag(111, ((SyncValue.Value.SupOffersTabCreditLine) value).value);
        } else if (value instanceof SyncValue.Value.C4bKybEligibilityWarning) {
            encodedSizeWithTag = KybEligibilityWarning.ADAPTER.encodedSizeWithTag(113, ((SyncValue.Value.C4bKybEligibilityWarning) value).value);
        } else if (value instanceof SyncValue.Value.CardSpendingInsightsConfig) {
            encodedSizeWithTag = CardSpendingInsightsConfig.ADAPTER.encodedSizeWithTag(114, ((SyncValue.Value.CardSpendingInsightsConfig) value).value);
        } else if (value instanceof SyncValue.Value.CardSpendingInsightsHome) {
            encodedSizeWithTag = CardSpendingInsightsHome.ADAPTER.encodedSizeWithTag(115, ((SyncValue.Value.CardSpendingInsightsHome) value).value);
        } else if (value instanceof SyncValue.Value.SavingsApplet) {
            encodedSizeWithTag = SavingsApplet.ADAPTER.encodedSizeWithTag(116, ((SyncValue.Value.SavingsApplet) value).value);
        } else if (value instanceof SyncValue.Value.Scheme) {
            encodedSizeWithTag = com.squareup.protos.cash.postcard.CardScheme.ADAPTER.encodedSizeWithTag(117, ((SyncValue.Value.Scheme) value).value);
        } else if (value instanceof SyncValue.Value.AfterpayPrepurchaseData) {
            encodedSizeWithTag = AfterpayPrepurchaseData.ADAPTER.encodedSizeWithTag(118, ((SyncValue.Value.AfterpayPrepurchaseData) value).value);
        } else if (value instanceof SyncValue.Value.BillsApplet) {
            encodedSizeWithTag = BillsApplet.ADAPTER.encodedSizeWithTag(119, ((SyncValue.Value.BillsApplet) value).value);
        } else if (value instanceof SyncValue.Value.ScenarioPlan) {
            encodedSizeWithTag = ScenarioPlanEntry.ADAPTER.encodedSizeWithTag(120, ((SyncValue.Value.ScenarioPlan) value).value);
        } else if (value instanceof SyncValue.Value.BillsConfig) {
            encodedSizeWithTag = BillsConfig.ADAPTER.encodedSizeWithTag(121, ((SyncValue.Value.BillsConfig) value).value);
        } else if (value instanceof SyncValue.Value.LocalCard) {
            encodedSizeWithTag = LocalCard.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, ((SyncValue.Value.LocalCard) value).value);
        } else if (value instanceof SyncValue.Value.C4bTapToPay) {
            encodedSizeWithTag = TapToPay.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, ((SyncValue.Value.C4bTapToPay) value).value);
        } else if (value instanceof SyncValue.Value.NotificationSettings) {
            encodedSizeWithTag = UiNotificationSettings.ADAPTER.encodedSizeWithTag(125, ((SyncValue.Value.NotificationSettings) value).value);
        } else if (value instanceof SyncValue.Value.CardThemeDefinitions) {
            encodedSizeWithTag = CardThemeDefinitions.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, ((SyncValue.Value.CardThemeDefinitions) value).value);
        } else if (value instanceof SyncValue.Value.SupportPhoneConfirmation) {
            encodedSizeWithTag = SupportPhoneConfirmation.ADAPTER.encodedSizeWithTag(127, ((SyncValue.Value.SupportPhoneConfirmation) value).value);
        } else if (value instanceof SyncValue.Value.AppThemeDefinitions) {
            encodedSizeWithTag = AppThemeDefinitions.ADAPTER.encodedSizeWithTag(128, ((SyncValue.Value.AppThemeDefinitions) value).value);
        } else if (value instanceof SyncValue.Value.Accounts) {
            encodedSizeWithTag = SyncValueAccounts.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, ((SyncValue.Value.Accounts) value).value);
        } else if (value instanceof SyncValue.Value.SavingsFolders) {
            encodedSizeWithTag = VersionedSavingsFolders.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, ((SyncValue.Value.SavingsFolders) value).value);
        } else if (value instanceof SyncValue.Value.SavingsScreens) {
            encodedSizeWithTag = VersionedSavingsScreens.ADAPTER.encodedSizeWithTag(131, ((SyncValue.Value.SavingsScreens) value).value);
        } else if (value instanceof SyncValue.Value.LocalAccount) {
            encodedSizeWithTag = LocalAccount.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, ((SyncValue.Value.LocalAccount) value).value);
        } else if (value instanceof SyncValue.Value.BitcoinPerformanceSummary) {
            encodedSizeWithTag = PerformanceSummary.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, ((SyncValue.Value.BitcoinPerformanceSummary) value).value);
        } else if (value instanceof SyncValue.Value.BitcoinPerformanceDetails) {
            encodedSizeWithTag = PerformanceDetails.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE, ((SyncValue.Value.BitcoinPerformanceDetails) value).value);
        } else if (value instanceof SyncValue.Value.EarningsTrackerSummary) {
            encodedSizeWithTag = EarningsTrackerSummary.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE, ((SyncValue.Value.EarningsTrackerSummary) value).value);
        } else if (value instanceof SyncValue.Value.FeatureEligibilityRefreshPolicy) {
            encodedSizeWithTag = FeatureEligibilityRefreshPolicy.ADAPTER.encodedSizeWithTag(136, ((SyncValue.Value.FeatureEligibilityRefreshPolicy) value).value);
        } else if (value instanceof SyncValue.Value.BitcoinPerformanceDetailsUi) {
            encodedSizeWithTag = PerformanceDetailsUi.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE, ((SyncValue.Value.BitcoinPerformanceDetailsUi) value).value);
        } else if (value instanceof SyncValue.Value.BitcoinPerformanceDetailsUserInterface) {
            encodedSizeWithTag = PerformanceDetailsUi.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, ((SyncValue.Value.BitcoinPerformanceDetailsUserInterface) value).value);
        } else if (value instanceof SyncValue.Value.CashAppCard) {
            encodedSizeWithTag = CashAppCard.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, ((SyncValue.Value.CashAppCard) value).value);
        } else if (value instanceof SyncValue.Value.LocalCashBalance) {
            encodedSizeWithTag = LocalCashBalance.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE, ((SyncValue.Value.LocalCashBalance) value).value);
        } else if (value instanceof SyncValue.Value.CustomerShoppingPreference) {
            encodedSizeWithTag = CustomerShoppingPreference.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE, ((SyncValue.Value.CustomerShoppingPreference) value).value);
        } else if (value instanceof SyncValue.Value.BorrowAppletLinksTile) {
            encodedSizeWithTag = BorrowAppletLinksTile.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE, ((SyncValue.Value.BorrowAppletLinksTile) value).value);
        } else if (value instanceof SyncValue.Value.SavingsExternalElements) {
            encodedSizeWithTag = SavingsExternalElements.ADAPTER.encodedSizeWithTag(144, ((SyncValue.Value.SavingsExternalElements) value).value);
        } else if (value instanceof SyncValue.Value.TapToPayDescriptionSuggestions) {
            encodedSizeWithTag = TapToPayDescriptionSuggestions.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE, ((SyncValue.Value.TapToPayDescriptionSuggestions) value).value);
        } else if (value instanceof SyncValue.Value.CashOClockPreference) {
            encodedSizeWithTag = CashOClockPreference.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE, ((SyncValue.Value.CashOClockPreference) value).value);
        } else if (value instanceof SyncValue.Value.DisplayName) {
            encodedSizeWithTag = DisplayName.ADAPTER.encodedSizeWithTag(147, ((SyncValue.Value.DisplayName) value).value);
        } else if (value instanceof SyncValue.Value.MultiInstrumentLinkingOptions) {
            encodedSizeWithTag = MultiInstrumentLinkingOptions.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE, ((SyncValue.Value.MultiInstrumentLinkingOptions) value).value);
        } else if (value instanceof SyncValue.Value.AccountSuspension) {
            encodedSizeWithTag = AccountSuspension.ADAPTER.encodedSizeWithTag(150, ((SyncValue.Value.AccountSuspension) value).value);
        } else if (value instanceof SyncValue.Value.CashOutInstrumentCapabilityConfig) {
            encodedSizeWithTag = CashOutInstrumentCapabilityConfig.ADAPTER.encodedSizeWithTag(151, ((SyncValue.Value.CashOutInstrumentCapabilityConfig) value).value);
        } else if (value instanceof SyncValue.Value.BorrowLimitHubData) {
            encodedSizeWithTag = BorrowLimitHubData.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, ((SyncValue.Value.BorrowLimitHubData) value).value);
        } else if (value instanceof SyncValue.Value.PrepurchaseCashCardData) {
            encodedSizeWithTag = PrepurchaseCashCardData.ADAPTER.encodedSizeWithTag(153, ((SyncValue.Value.PrepurchaseCashCardData) value).getValue());
        } else if (value instanceof SyncValue.Value.P2pAllowlistCustomer) {
            encodedSizeWithTag = P2PAllowListCustomer.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE, ((SyncValue.Value.P2pAllowlistCustomer) value).getValue());
        } else if (value instanceof SyncValue.Value.P2pControl) {
            encodedSizeWithTag = P2PControl.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_MANAGE_CONNECTIONS_VALUE, ((SyncValue.Value.P2pControl) value).getValue());
        } else if (value instanceof SyncValue.Value.CashGreen) {
            encodedSizeWithTag = VersionedCashGreen.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_CENTERED_VALUE, ((SyncValue.Value.CashGreen) value).getValue());
        } else if (value instanceof SyncValue.Value.GreenBenefits) {
            encodedSizeWithTag = VersionedGreenBenefits.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE, ((SyncValue.Value.GreenBenefits) value).getValue());
        } else if (value instanceof SyncValue.Value.GreenBooklet) {
            encodedSizeWithTag = VersionedGreenBooklet.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, ((SyncValue.Value.GreenBooklet) value).getValue());
        } else if (value instanceof SyncValue.Value.ClientSyncConfig) {
            encodedSizeWithTag = ClientSyncConfig.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, ((SyncValue.Value.ClientSyncConfig) value).getValue());
        } else if (value instanceof SyncValue.Value.BadgingData) {
            encodedSizeWithTag = BadgingData.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE, ((SyncValue.Value.BadgingData) value).value);
        } else if (value instanceof SyncValue.Value.KgooseUserSettings) {
            encodedSizeWithTag = CashUserSettings.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, ((SyncValue.Value.KgooseUserSettings) value).value);
        } else if (value instanceof SyncValue.Value.KgooseGlobalUserSettings) {
            encodedSizeWithTag = CashGlobalUserSettings.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE, ((SyncValue.Value.KgooseGlobalUserSettings) value).getValue());
        } else if (value instanceof SyncValue.Value.AuthorizedAccount) {
            encodedSizeWithTag = SyncValueAuthorizedAccount.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, ((SyncValue.Value.AuthorizedAccount) value).value);
        } else if (value instanceof SyncValue.Value.RestrictionsData) {
            encodedSizeWithTag = RestrictionsData.ADAPTER.encodedSizeWithTag(165, ((SyncValue.Value.RestrictionsData) value).getValue());
        } else if (value instanceof SyncValue.Value.AdversityBanner) {
            encodedSizeWithTag = AdversityBanner.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE, ((SyncValue.Value.AdversityBanner) value).getValue());
        } else if (value instanceof SyncValue.Value.BankingBenefitsConfig) {
            encodedSizeWithTag = BankingBenefitsConfig.ADAPTER.encodedSizeWithTag(167, ((SyncValue.Value.BankingBenefitsConfig) value).value);
        } else if (value instanceof SyncValue.Value.MoneyTab) {
            encodedSizeWithTag = MoneyTab.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, ((SyncValue.Value.MoneyTab) value).value);
        } else if (value instanceof SyncValue.Value.LocalPosCheckIn) {
            encodedSizeWithTag = LocalPOSCheckIn.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, ((SyncValue.Value.LocalPosCheckIn) value).getValue());
        } else if (value instanceof SyncValue.Value.DemandDepositAccount) {
            encodedSizeWithTag = DemandDepositAccount.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, ((SyncValue.Value.DemandDepositAccount) value).value);
        } else if (value instanceof SyncValue.Value.InvestPortfoliosPerformance) {
            encodedSizeWithTag = PortfoliosPerformanceValue.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE, ((SyncValue.Value.InvestPortfoliosPerformance) value).getValue());
        } else if (value instanceof SyncValue.Value.CashCreditScoreSyncData) {
            encodedSizeWithTag = CashCreditScoreSyncData.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, ((SyncValue.Value.CashCreditScoreSyncData) value).getValue());
        } else if (value instanceof SyncValue.Value.CashOutFeeData) {
            encodedSizeWithTag = CashOutFeeData.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, ((SyncValue.Value.CashOutFeeData) value).getValue());
        } else if (value instanceof SyncValue.Value.RecipientSuggestions) {
            encodedSizeWithTag = RecipientSuggestions.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, ((SyncValue.Value.RecipientSuggestions) value).getValue());
        } else if (value instanceof SyncValue.Value.CashAppTag) {
            encodedSizeWithTag = CashAppTag.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE, ((SyncValue.Value.CashAppTag) value).getValue());
        } else if (value instanceof SyncValue.Value.InvestPortfoliosHistoricalData) {
            encodedSizeWithTag = PortfoliosHistoricalDataValue.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE, ((SyncValue.Value.InvestPortfoliosHistoricalData) value).value);
        } else if (value instanceof SyncValue.Value.CardSkinAssets) {
            encodedSizeWithTag = CardSkinAssets.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, ((SyncValue.Value.CardSkinAssets) value).value);
        } else if (value instanceof SyncValue.Value.PhonePlanApplet) {
            encodedSizeWithTag = VersionedPhonePlanApplet.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, ((SyncValue.Value.PhonePlanApplet) value).getValue());
        } else if (value instanceof SyncValue.Value.TagThemeDefinitions) {
            encodedSizeWithTag = TagThemeDefinitions.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_VERIFICATION_IN_PROGRESS_DARK_APPEARANCE_VALUE, ((SyncValue.Value.TagThemeDefinitions) value).getValue());
        } else if (value instanceof SyncValue.Value.BtcP2pConversionBps) {
            encodedSizeWithTag = BtcP2pConversionBps.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE, ((SyncValue.Value.BtcP2pConversionBps) value).getValue());
        } else if (value instanceof SyncValue.Value.PaymentDevicePresentation) {
            encodedSizeWithTag = PaymentDevicePresentation.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE, ((SyncValue.Value.PaymentDevicePresentation) value).getValue());
        } else if (value instanceof SyncValue.Value.LocalEarningCard) {
            encodedSizeWithTag = LocalEarningCard.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE, ((SyncValue.Value.LocalEarningCard) value).getValue());
        } else if (value instanceof SyncValue.Value.EarningsHomeUiState) {
            encodedSizeWithTag = EarningsHomeUIState.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, ((SyncValue.Value.EarningsHomeUiState) value).getValue());
        } else if (value instanceof SyncValue.Value.EarningsAppletUiState) {
            encodedSizeWithTag = EarningsAppletUIState.ADAPTER.encodedSizeWithTag(185, ((SyncValue.Value.EarningsAppletUiState) value).getValue());
        } else if (value instanceof SyncValue.Value.CashForWorkApplet) {
            encodedSizeWithTag = VersionedCashForWorkApplet.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE, ((SyncValue.Value.CashForWorkApplet) value).getValue());
        } else if (value instanceof SyncValue.Value.AutoBtcWithdrawThreshold) {
            encodedSizeWithTag = AutoBtcWithdrawThresholdSyncValue.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE, ((SyncValue.Value.AutoBtcWithdrawThreshold) value).getValue());
        } else if (value instanceof SyncValue.Value.FinishSetupTile) {
            encodedSizeWithTag = VersionedFinishSetupTile.ADAPTER.encodedSizeWithTag(188, ((SyncValue.Value.FinishSetupTile) value).getValue());
        } else if (value instanceof SyncValue.Value.EarnerEnrollmentState) {
            encodedSizeWithTag = EarnerEnrollmentState.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, ((SyncValue.Value.EarnerEnrollmentState) value).value);
        } else {
            if (!(value instanceof SyncValue.Value.CashLiteDefaultBankAccount)) {
                if (value == null) {
                    return encodedSizeWithTag2;
                }
                throw new NoWhenBranchMatchedException();
            }
            encodedSizeWithTag = CashLiteDefaultBankAccount.ADAPTER.encodedSizeWithTag(EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, ((SyncValue.Value.CashLiteDefaultBankAccount) value).value);
        }
        return encodedSizeWithTag + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncValue syncValue = (SyncValue) obj;
        syncValue.getClass();
        ByteString byteString = ByteString.EMPTY;
        SyncValueType syncValueType = syncValue.f1393type;
        SyncValue.Value value = syncValue.value;
        byteString.getClass();
        return new SyncValue(syncValueType, value, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncValue syncValue = (SyncValue) obj;
        syncValue.getClass();
        SyncValueType.ADAPTER.encodeWithTag(protoWriter, 1, syncValue.f1393type);
        SyncValue.Value value = syncValue.value;
        if (value instanceof SyncValue.Value.Instrument) {
            Instrument.ADAPTER.encodeWithTag(protoWriter, 3, ((SyncValue.Value.Instrument) value).value);
        } else if (value instanceof SyncValue.Value.AtmPicker) {
            ATMPicker.ADAPTER.encodeWithTag(protoWriter, 12, ((SyncValue.Value.AtmPicker) value).value);
        } else if (value instanceof SyncValue.Value.BalanceSnapshot) {
            BalanceSnapshot.ADAPTER.encodeWithTag(protoWriter, 13, ((SyncValue.Value.BalanceSnapshot) value).value);
        } else if (value instanceof SyncValue.Value.Dda) {
            UiDda.ADAPTER.encodeWithTag(protoWriter, 14, ((SyncValue.Value.Dda) value).value);
        } else if (value instanceof SyncValue.Value.Access) {
            UiAccess.ADAPTER.encodeWithTag(protoWriter, 15, ((SyncValue.Value.Access) value).value);
        } else if (value instanceof SyncValue.Value.Address) {
            UiAddress.ADAPTER.encodeWithTag(protoWriter, 16, ((SyncValue.Value.Address) value).value);
        } else if (value instanceof SyncValue.Value.StatusAndLimits) {
            UiStatusAndLimits.ADAPTER.encodeWithTag(protoWriter, 17, ((SyncValue.Value.StatusAndLimits) value).value);
        } else if (value instanceof SyncValue.Value.AppMessages) {
            UiAppMesssages.ADAPTER.encodeWithTag(protoWriter, 18, ((SyncValue.Value.AppMessages) value).value);
        } else if (value instanceof SyncValue.Value.CoreCustomer) {
            UiCoreCustomer.ADAPTER.encodeWithTag(protoWriter, 19, ((SyncValue.Value.CoreCustomer) value).value);
        } else if (value instanceof SyncValue.Value.IssuedCard) {
            UiIssuedCard.ADAPTER.encodeWithTag(protoWriter, 21, ((SyncValue.Value.IssuedCard) value).value);
        } else if (value instanceof SyncValue.Value.Marketing) {
            UiMarketing.ADAPTER.encodeWithTag(protoWriter, 22, ((SyncValue.Value.Marketing) value).value);
        } else if (value instanceof SyncValue.Value.P2pSettings) {
            UiP2pSettings.ADAPTER.encodeWithTag(protoWriter, 23, ((SyncValue.Value.P2pSettings) value).value);
        } else if (value instanceof SyncValue.Value.ScheduledPayments) {
            UiScheduledPayments.ADAPTER.encodeWithTag(protoWriter, 24, ((SyncValue.Value.ScheduledPayments) value).value);
        } else if (value instanceof SyncValue.Value.PublicProfile) {
            UiPublicProfile.ADAPTER.encodeWithTag(protoWriter, 26, ((SyncValue.Value.PublicProfile) value).value);
        } else if (value instanceof SyncValue.Value.ProfileAlias) {
            ProfileAlias.ADAPTER.encodeWithTag(protoWriter, 27, ((SyncValue.Value.ProfileAlias) value).value);
        } else if (value instanceof SyncValue.Value.LoyaltyProfile) {
            LoyaltyProfile.ADAPTER.encodeWithTag(protoWriter, 28, ((SyncValue.Value.LoyaltyProfile) value).value);
        } else if (value instanceof SyncValue.Value.CheckDepositProfile) {
            CheckDepositProfile.ADAPTER.encodeWithTag(protoWriter, 29, ((SyncValue.Value.CheckDepositProfile) value).value);
        } else if (value instanceof SyncValue.Value.InvestmentNotificationSettings) {
            NotificationsSettings.ADAPTER.encodeWithTag(protoWriter, 30, ((SyncValue.Value.InvestmentNotificationSettings) value).value);
        } else if (value instanceof SyncValue.Value.ProfileDetails) {
            ProfileDetails.ADAPTER.encodeWithTag(protoWriter, 31, ((SyncValue.Value.ProfileDetails) value).value);
        } else if (value instanceof SyncValue.Value.Wallet) {
            Wallet.ADAPTER.encodeWithTag(protoWriter, 32, ((SyncValue.Value.Wallet) value).value);
        } else if (value instanceof SyncValue.Value.BankingTab) {
            BankingTab.ADAPTER.encodeWithTag(protoWriter, 33, ((SyncValue.Value.BankingTab) value).value);
        } else if (value instanceof SyncValue.Value.JurisdictionConfig) {
            UiJurisdictionConfig.ADAPTER.encodeWithTag(protoWriter, 34, ((SyncValue.Value.JurisdictionConfig) value).value);
        } else if (value instanceof SyncValue.Value.Cryptocurrency) {
            UiCryptoCurrency.ADAPTER.encodeWithTag(protoWriter, 35, ((SyncValue.Value.Cryptocurrency) value).value);
        } else if (value instanceof SyncValue.Value.ExchangeData) {
            UiExchangeData.ADAPTER.encodeWithTag(protoWriter, 36, ((SyncValue.Value.ExchangeData) value).value);
        } else if (value instanceof SyncValue.Value.NotificationPreference) {
            UiNotificationPreference.ADAPTER.encodeWithTag(protoWriter, 37, ((SyncValue.Value.NotificationPreference) value).value);
        } else if (value instanceof SyncValue.Value.DataPrivacySettings) {
            DataPrivacySettings.ADAPTER.encodeWithTag(protoWriter, 38, ((SyncValue.Value.DataPrivacySettings) value).value);
        } else if (value instanceof SyncValue.Value.PasswordInfo) {
            PasswordInfo.ADAPTER.encodeWithTag(protoWriter, 39, ((SyncValue.Value.PasswordInfo) value).value);
        } else if (value instanceof SyncValue.Value.OtpInfo) {
            OTPInfo.ADAPTER.encodeWithTag(protoWriter, 40, ((SyncValue.Value.OtpInfo) value).value);
        } else if (value instanceof SyncValue.Value.FamilyAccount) {
            UiFamilyAccount.ADAPTER.encodeWithTag(protoWriter, 41, ((SyncValue.Value.FamilyAccount) value).value);
        } else if (value instanceof SyncValue.Value.InvestingAutomation) {
            UiInvestingAutomation.ADAPTER.encodeWithTag(protoWriter, 42, ((SyncValue.Value.InvestingAutomation) value).value);
        } else if (value instanceof SyncValue.Value.LendingInfo) {
            LendingInfo.ADAPTER.encodeWithTag(protoWriter, 43, ((SyncValue.Value.LendingInfo) value).value);
        } else if (value instanceof SyncValue.Value.TrustedContact) {
            SyncTrustedContact.ADAPTER.encodeWithTag(protoWriter, 44, ((SyncValue.Value.TrustedContact) value).value);
        } else if (value instanceof SyncValue.Value.IdvState) {
            UiIdvState.ADAPTER.encodeWithTag(protoWriter, 45, ((SyncValue.Value.IdvState) value).value);
        } else if (value instanceof SyncValue.Value.CryptocurrencyProfile) {
            CryptocurrencyProfile.ADAPTER.encodeWithTag(protoWriter, 46, ((SyncValue.Value.CryptocurrencyProfile) value).value);
        } else if (value instanceof SyncValue.Value.InvestAutomatorNotificationSettings) {
            NotificationsSettings.ADAPTER.encodeWithTag(protoWriter, 47, ((SyncValue.Value.InvestAutomatorNotificationSettings) value).value);
        } else if (value instanceof SyncValue.Value.Favorite) {
            Favorite.ADAPTER.encodeWithTag(protoWriter, 48, ((SyncValue.Value.Favorite) value).value);
        } else if (value instanceof SyncValue.Value.SavingsConfig) {
            SavingsConfig.ADAPTER.encodeWithTag(protoWriter, 49, ((SyncValue.Value.SavingsConfig) value).value);
        } else if (value instanceof SyncValue.Value.SavingsHome) {
            SavingsHome.ADAPTER.encodeWithTag(protoWriter, 50, ((SyncValue.Value.SavingsHome) value).value);
        } else if (value instanceof SyncValue.Value.InvestPortfolioState) {
            PortfolioState.ADAPTER.encodeWithTag(protoWriter, 51, ((SyncValue.Value.InvestPortfolioState) value).value);
        } else if (value instanceof SyncValue.Value.InvestTradingState) {
            TradingState.ADAPTER.encodeWithTag(protoWriter, 52, ((SyncValue.Value.InvestTradingState) value).value);
        } else if (value instanceof SyncValue.Value.SavingsFolder) {
            SavingsFolder.ADAPTER.encodeWithTag(protoWriter, 53, ((SyncValue.Value.SavingsFolder) value).value);
        } else if (value instanceof SyncValue.Value.Tigers) {
            Tigers.ADAPTER.encodeWithTag(protoWriter, 54, ((SyncValue.Value.Tigers) value).value);
        } else if (value instanceof SyncValue.Value.WiresAccountInfo) {
            WiresAccountInfo.ADAPTER.encodeWithTag(protoWriter, 55, ((SyncValue.Value.WiresAccountInfo) value).value);
        } else if (value instanceof SyncValue.Value.TaxUpgrade) {
            UiTaxUpgrade.ADAPTER.encodeWithTag(protoWriter, 56, ((SyncValue.Value.TaxUpgrade) value).value);
        } else if (value instanceof SyncValue.Value.EfileInfo) {
            UiEfileInfo.ADAPTER.encodeWithTag(protoWriter, 57, ((SyncValue.Value.EfileInfo) value).value);
        } else if (value instanceof SyncValue.Value.CashLimits) {
            UiCashLimits.ADAPTER.encodeWithTag(protoWriter, 58, ((SyncValue.Value.CashLimits) value).value);
        } else if (value instanceof SyncValue.Value.Lions) {
            Lions.ADAPTER.encodeWithTag(protoWriter, 59, ((SyncValue.Value.Lions) value).value);
        } else if (value instanceof SyncValue.Value.DeviceInfo) {
            DeviceInfo.ADAPTER.encodeWithTag(protoWriter, 60, ((SyncValue.Value.DeviceInfo) value).value);
        } else if (value instanceof SyncValue.Value.LimitsPageletInlineMessage) {
            LimitsPageletInlineMessage.ADAPTER.encodeWithTag(protoWriter, 61, ((SyncValue.Value.LimitsPageletInlineMessage) value).value);
        } else if (value instanceof SyncValue.Value.SchemaVersions) {
            SyncValueSchemaVersions.ADAPTER.encodeWithTag(protoWriter, 62, ((SyncValue.Value.SchemaVersions) value).value);
        } else if (value instanceof SyncValue.Value.Cats) {
            Cats.ADAPTER.encodeWithTag(protoWriter, 63, ((SyncValue.Value.Cats) value).value);
        } else if (value instanceof SyncValue.Value.InstrumentLinkingOption) {
            InstrumentLinkingOption.ADAPTER.encodeWithTag(protoWriter, 64, ((SyncValue.Value.InstrumentLinkingOption) value).value);
        } else if (value instanceof SyncValue.Value.Rabbits) {
            Rabbits.ADAPTER.encodeWithTag(protoWriter, 65, ((SyncValue.Value.Rabbits) value).value);
        } else if (value instanceof SyncValue.Value.OverdraftStatus) {
            OverdraftStatus.ADAPTER.encodeWithTag(protoWriter, 66, ((SyncValue.Value.OverdraftStatus) value).value);
        } else if (value instanceof SyncValue.Value.OverdraftUsage) {
            OverdraftUsage.ADAPTER.encodeWithTag(protoWriter, 67, ((SyncValue.Value.OverdraftUsage) value).value);
        } else if (value instanceof SyncValue.Value.InstrumentLinkingOptions) {
            InstrumentLinkingOptions.ADAPTER.encodeWithTag(protoWriter, 68, ((SyncValue.Value.InstrumentLinkingOptions) value).value);
        } else if (value instanceof SyncValue.Value.IdentityHubState) {
            IdentityHubState.ADAPTER.encodeWithTag(protoWriter, 69, ((SyncValue.Value.IdentityHubState) value).value);
        } else if (value instanceof SyncValue.Value.AppLock) {
            UiAppLock.ADAPTER.encodeWithTag(protoWriter, 70, ((SyncValue.Value.AppLock) value).value);
        } else if (value instanceof SyncValue.Value.SponsorshipCryptoAuthorization) {
            SponsorshipCryptoAuthorization.ADAPTER.encodeWithTag(protoWriter, 71, ((SyncValue.Value.SponsorshipCryptoAuthorization) value).value);
        } else if (value instanceof SyncValue.Value.OfferCustomerPreference) {
            OfferCustomerPreference.ADAPTER.encodeWithTag(protoWriter, 72, ((SyncValue.Value.OfferCustomerPreference) value).value);
        } else if (value instanceof SyncValue.Value.PasskeyOptions) {
            PasskeyOptions.ADAPTER.encodeWithTag(protoWriter, 73, ((SyncValue.Value.PasskeyOptions) value).value);
        } else if (value instanceof SyncValue.Value.PaycheckAllocationDistribution) {
            AllocationDistribution.ADAPTER.encodeWithTag(protoWriter, 74, ((SyncValue.Value.PaycheckAllocationDistribution) value).value);
        } else if (value instanceof SyncValue.Value.PaychecksUiConfiguration) {
            UiConfiguration.ADAPTER.encodeWithTag(protoWriter, 75, ((SyncValue.Value.PaychecksUiConfiguration) value).value);
        } else if (value instanceof SyncValue.Value.PaychecksUiState) {
            UiState.ADAPTER.encodeWithTag(protoWriter, 76, ((SyncValue.Value.PaychecksUiState) value).value);
        } else if (value instanceof SyncValue.Value.PaperCashDepositEligibility) {
            PaperCashDepositEligibility.ADAPTER.encodeWithTag(protoWriter, 77, ((SyncValue.Value.PaperCashDepositEligibility) value).value);
        } else if (value instanceof SyncValue.Value.CheckDepositEligibility) {
            CheckDepositEligibility.ADAPTER.encodeWithTag(protoWriter, 78, ((SyncValue.Value.CheckDepositEligibility) value).value);
        } else if (value instanceof SyncValue.Value.WiresEligibilityState) {
            WiresEligibilityState.ADAPTER.encodeWithTag(protoWriter, 79, ((SyncValue.Value.WiresEligibilityState) value).value);
        } else if (value instanceof SyncValue.Value.BorrowAppletCreditLimitBorrowButtonTile) {
            BorrowAppletCreditLimitAndBorrowButtonTile.ADAPTER.encodeWithTag(protoWriter, 82, ((SyncValue.Value.BorrowAppletCreditLimitBorrowButtonTile) value).value);
        } else if (value instanceof SyncValue.Value.C4bProfileData) {
            BusinessProfileData.ADAPTER.encodeWithTag(protoWriter, 83, ((SyncValue.Value.C4bProfileData) value).value);
        } else if (value instanceof SyncValue.Value.ReactionsAvailable) {
            AvailableReactions.ADAPTER.encodeWithTag(protoWriter, 84, ((SyncValue.Value.ReactionsAvailable) value).value);
        } else if (value instanceof SyncValue.Value.BorrowAppletPaymentTimelineTile) {
            BorrowAppletPaymentTimelineTile.ADAPTER.encodeWithTag(protoWriter, 85, ((SyncValue.Value.BorrowAppletPaymentTimelineTile) value).value);
        } else if (value instanceof SyncValue.Value.BorrowAppletBulletinsTile) {
            BorrowAppletBulletinsTile.ADAPTER.encodeWithTag(protoWriter, 86, ((SyncValue.Value.BorrowAppletBulletinsTile) value).value);
        } else if (value instanceof SyncValue.Value.InternationalPaymentsCountryConfig) {
            InternationalPaymentsCountrySelectionSyncValue.ADAPTER.encodeWithTag(protoWriter, 87, ((SyncValue.Value.InternationalPaymentsCountryConfig) value).value);
        } else if (value instanceof SyncValue.Value.InternationalPaymentsCountryNotificationConfig) {
            InternationalPaymentsCountryNotificationSyncValue.ADAPTER.encodeWithTag(protoWriter, 89, ((SyncValue.Value.InternationalPaymentsCountryNotificationConfig) value).value);
        } else if (value instanceof SyncValue.Value.BorrowAppletLoanHistoryTile) {
            BorrowAppletLoanHistoryTile.ADAPTER.encodeWithTag(protoWriter, 88, ((SyncValue.Value.BorrowAppletLoanHistoryTile) value).value);
        } else if (value instanceof SyncValue.Value.BalanceBasedAddCashPreference) {
            BalanceBasedAddCashPreference.ADAPTER.encodeWithTag(protoWriter, 90, ((SyncValue.Value.BalanceBasedAddCashPreference) value).value);
        } else if (value instanceof SyncValue.Value.BorrowData) {
            BorrowData.ADAPTER.encodeWithTag(protoWriter, 91, ((SyncValue.Value.BorrowData) value).value);
        } else if (value instanceof SyncValue.Value.GlobalBorrowData) {
            GlobalBorrowData.ADAPTER.encodeWithTag(protoWriter, 92, ((SyncValue.Value.GlobalBorrowData) value).value);
        } else if (value instanceof SyncValue.Value.TransactionActivityConfig) {
            TransactionActivityConfig.ADAPTER.encodeWithTag(protoWriter, 93, ((SyncValue.Value.TransactionActivityConfig) value).value);
        } else if (value instanceof SyncValue.Value.DisplayNameDetails) {
            DisplayNameDetails.ADAPTER.encodeWithTag(protoWriter, 94, ((SyncValue.Value.DisplayNameDetails) value).value);
        } else if (value instanceof SyncValue.Value.InvestYourPaycheckAutomation) {
            UiInvestingAutomation.ADAPTER.encodeWithTag(protoWriter, 95, ((SyncValue.Value.InvestYourPaycheckAutomation) value).value);
        } else if (value instanceof SyncValue.Value.BusinessAddress) {
            UiAddress.ADAPTER.encodeWithTag(protoWriter, 96, ((SyncValue.Value.BusinessAddress) value).value);
        } else if (value instanceof SyncValue.Value.CommerceBrowserAutofillPreferences) {
            CommerceBrowserAutofillPreferences.ADAPTER.encodeWithTag(protoWriter, 97, ((SyncValue.Value.CommerceBrowserAutofillPreferences) value).value);
        } else if (value instanceof SyncValue.Value.AvailablePaymentPadThemes) {
            AvailablePaymentPadThemes.ADAPTER.encodeWithTag(protoWriter, 98, ((SyncValue.Value.AvailablePaymentPadThemes) value).value);
        } else if (value instanceof SyncValue.Value.FamilyTile) {
            UiFamilyTile.ADAPTER.encodeWithTag(protoWriter, 99, ((SyncValue.Value.FamilyTile) value).value);
        } else if (value instanceof SyncValue.Value.FdicInsuranceCustomerStatus) {
            FdicInsuranceCustomerStatus.ADAPTER.encodeWithTag(protoWriter, 100, ((SyncValue.Value.FdicInsuranceCustomerStatus) value).value);
        } else if (value instanceof SyncValue.Value.PersonalInfoCtaBanner) {
            PersonalInfoCTABanner.ADAPTER.encodeWithTag(protoWriter, 102, ((SyncValue.Value.PersonalInfoCtaBanner) value).value);
        } else if (value instanceof SyncValue.Value.InputtedLegalName) {
            InputtedLegalName.ADAPTER.encodeWithTag(protoWriter, 103, ((SyncValue.Value.InputtedLegalName) value).value);
        } else if (value instanceof SyncValue.Value.ProfilePageUpsellComponent) {
            ProfilePageUpsellComponent.ADAPTER.encodeWithTag(protoWriter, 104, ((SyncValue.Value.ProfilePageUpsellComponent) value).value);
        } else if (value instanceof SyncValue.Value.C4bIdentityHubState) {
            C4BIdentityHubState.ADAPTER.encodeWithTag(protoWriter, 105, ((SyncValue.Value.C4bIdentityHubState) value).value);
        } else if (value instanceof SyncValue.Value.BtcAppletRenderingState) {
            BtcAppletRenderingState.ADAPTER.encodeWithTag(protoWriter, 106, ((SyncValue.Value.BtcAppletRenderingState) value).value);
        } else if (value instanceof SyncValue.Value.ShippingAddress) {
            SyncShippingAddress.ADAPTER.encodeWithTag(protoWriter, 107, ((SyncValue.Value.ShippingAddress) value).value);
        } else if (value instanceof SyncValue.Value.InvestDividendSetting) {
            InvestDividendSetting.ADAPTER.encodeWithTag(protoWriter, 108, ((SyncValue.Value.InvestDividendSetting) value).value);
        } else if (value instanceof SyncValue.Value.ProfilePageUpsellConfiguration) {
            ProfileUpsellConfiguration.ADAPTER.encodeWithTag(protoWriter, 109, ((SyncValue.Value.ProfilePageUpsellConfiguration) value).value);
        } else if (value instanceof SyncValue.Value.ProfilePageUpsellComponentV2) {
            ProfilePageUpsellComponentV2.ADAPTER.encodeWithTag(protoWriter, 110, ((SyncValue.Value.ProfilePageUpsellComponentV2) value).value);
        } else if (value instanceof SyncValue.Value.SupOffersTabCreditLine) {
            SupOffersTabCreditLine.ADAPTER.encodeWithTag(protoWriter, 111, ((SyncValue.Value.SupOffersTabCreditLine) value).value);
        } else if (value instanceof SyncValue.Value.C4bKybEligibilityWarning) {
            KybEligibilityWarning.ADAPTER.encodeWithTag(protoWriter, 113, ((SyncValue.Value.C4bKybEligibilityWarning) value).value);
        } else if (value instanceof SyncValue.Value.CardSpendingInsightsConfig) {
            CardSpendingInsightsConfig.ADAPTER.encodeWithTag(protoWriter, 114, ((SyncValue.Value.CardSpendingInsightsConfig) value).value);
        } else if (value instanceof SyncValue.Value.CardSpendingInsightsHome) {
            CardSpendingInsightsHome.ADAPTER.encodeWithTag(protoWriter, 115, ((SyncValue.Value.CardSpendingInsightsHome) value).value);
        } else if (value instanceof SyncValue.Value.SavingsApplet) {
            SavingsApplet.ADAPTER.encodeWithTag(protoWriter, 116, ((SyncValue.Value.SavingsApplet) value).value);
        } else if (value instanceof SyncValue.Value.Scheme) {
            com.squareup.protos.cash.postcard.CardScheme.ADAPTER.encodeWithTag(protoWriter, 117, ((SyncValue.Value.Scheme) value).value);
        } else if (value instanceof SyncValue.Value.AfterpayPrepurchaseData) {
            AfterpayPrepurchaseData.ADAPTER.encodeWithTag(protoWriter, 118, ((SyncValue.Value.AfterpayPrepurchaseData) value).value);
        } else if (value instanceof SyncValue.Value.BillsApplet) {
            BillsApplet.ADAPTER.encodeWithTag(protoWriter, 119, ((SyncValue.Value.BillsApplet) value).value);
        } else if (value instanceof SyncValue.Value.ScenarioPlan) {
            ScenarioPlanEntry.ADAPTER.encodeWithTag(protoWriter, 120, ((SyncValue.Value.ScenarioPlan) value).value);
        } else if (value instanceof SyncValue.Value.BillsConfig) {
            BillsConfig.ADAPTER.encodeWithTag(protoWriter, 121, ((SyncValue.Value.BillsConfig) value).value);
        } else if (value instanceof SyncValue.Value.LocalCard) {
            LocalCard.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, ((SyncValue.Value.LocalCard) value).value);
        } else if (value instanceof SyncValue.Value.C4bTapToPay) {
            TapToPay.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, ((SyncValue.Value.C4bTapToPay) value).value);
        } else if (value instanceof SyncValue.Value.NotificationSettings) {
            UiNotificationSettings.ADAPTER.encodeWithTag(protoWriter, 125, ((SyncValue.Value.NotificationSettings) value).value);
        } else if (value instanceof SyncValue.Value.CardThemeDefinitions) {
            CardThemeDefinitions.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, ((SyncValue.Value.CardThemeDefinitions) value).value);
        } else if (value instanceof SyncValue.Value.SupportPhoneConfirmation) {
            SupportPhoneConfirmation.ADAPTER.encodeWithTag(protoWriter, 127, ((SyncValue.Value.SupportPhoneConfirmation) value).value);
        } else if (value instanceof SyncValue.Value.AppThemeDefinitions) {
            AppThemeDefinitions.ADAPTER.encodeWithTag(protoWriter, 128, ((SyncValue.Value.AppThemeDefinitions) value).value);
        } else if (value instanceof SyncValue.Value.Accounts) {
            SyncValueAccounts.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, ((SyncValue.Value.Accounts) value).value);
        } else if (value instanceof SyncValue.Value.SavingsFolders) {
            VersionedSavingsFolders.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, ((SyncValue.Value.SavingsFolders) value).value);
        } else if (value instanceof SyncValue.Value.SavingsScreens) {
            VersionedSavingsScreens.ADAPTER.encodeWithTag(protoWriter, 131, ((SyncValue.Value.SavingsScreens) value).value);
        } else if (value instanceof SyncValue.Value.LocalAccount) {
            LocalAccount.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, ((SyncValue.Value.LocalAccount) value).value);
        } else if (value instanceof SyncValue.Value.BitcoinPerformanceSummary) {
            PerformanceSummary.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, ((SyncValue.Value.BitcoinPerformanceSummary) value).value);
        } else if (value instanceof SyncValue.Value.BitcoinPerformanceDetails) {
            PerformanceDetails.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE, ((SyncValue.Value.BitcoinPerformanceDetails) value).value);
        } else if (value instanceof SyncValue.Value.EarningsTrackerSummary) {
            EarningsTrackerSummary.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE, ((SyncValue.Value.EarningsTrackerSummary) value).value);
        } else if (value instanceof SyncValue.Value.FeatureEligibilityRefreshPolicy) {
            FeatureEligibilityRefreshPolicy.ADAPTER.encodeWithTag(protoWriter, 136, ((SyncValue.Value.FeatureEligibilityRefreshPolicy) value).value);
        } else if (value instanceof SyncValue.Value.BitcoinPerformanceDetailsUi) {
            PerformanceDetailsUi.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE, ((SyncValue.Value.BitcoinPerformanceDetailsUi) value).value);
        } else if (value instanceof SyncValue.Value.BitcoinPerformanceDetailsUserInterface) {
            PerformanceDetailsUi.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, ((SyncValue.Value.BitcoinPerformanceDetailsUserInterface) value).value);
        } else if (value instanceof SyncValue.Value.CashAppCard) {
            CashAppCard.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, ((SyncValue.Value.CashAppCard) value).value);
        } else if (value instanceof SyncValue.Value.LocalCashBalance) {
            LocalCashBalance.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE, ((SyncValue.Value.LocalCashBalance) value).value);
        } else if (value instanceof SyncValue.Value.CustomerShoppingPreference) {
            CustomerShoppingPreference.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE, ((SyncValue.Value.CustomerShoppingPreference) value).value);
        } else if (value instanceof SyncValue.Value.BorrowAppletLinksTile) {
            BorrowAppletLinksTile.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE, ((SyncValue.Value.BorrowAppletLinksTile) value).value);
        } else if (value instanceof SyncValue.Value.SavingsExternalElements) {
            SavingsExternalElements.ADAPTER.encodeWithTag(protoWriter, 144, ((SyncValue.Value.SavingsExternalElements) value).value);
        } else if (value instanceof SyncValue.Value.TapToPayDescriptionSuggestions) {
            TapToPayDescriptionSuggestions.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE, ((SyncValue.Value.TapToPayDescriptionSuggestions) value).value);
        } else if (value instanceof SyncValue.Value.CashOClockPreference) {
            CashOClockPreference.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE, ((SyncValue.Value.CashOClockPreference) value).value);
        } else if (value instanceof SyncValue.Value.DisplayName) {
            DisplayName.ADAPTER.encodeWithTag(protoWriter, 147, ((SyncValue.Value.DisplayName) value).value);
        } else if (value instanceof SyncValue.Value.MultiInstrumentLinkingOptions) {
            MultiInstrumentLinkingOptions.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE, ((SyncValue.Value.MultiInstrumentLinkingOptions) value).value);
        } else if (value instanceof SyncValue.Value.AccountSuspension) {
            AccountSuspension.ADAPTER.encodeWithTag(protoWriter, 150, ((SyncValue.Value.AccountSuspension) value).value);
        } else if (value instanceof SyncValue.Value.CashOutInstrumentCapabilityConfig) {
            CashOutInstrumentCapabilityConfig.ADAPTER.encodeWithTag(protoWriter, 151, ((SyncValue.Value.CashOutInstrumentCapabilityConfig) value).value);
        } else if (value instanceof SyncValue.Value.BorrowLimitHubData) {
            BorrowLimitHubData.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, ((SyncValue.Value.BorrowLimitHubData) value).value);
        } else if (value instanceof SyncValue.Value.PrepurchaseCashCardData) {
            PrepurchaseCashCardData.ADAPTER.encodeWithTag(protoWriter, 153, ((SyncValue.Value.PrepurchaseCashCardData) value).value);
        } else if (value instanceof SyncValue.Value.P2pAllowlistCustomer) {
            P2PAllowListCustomer.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE, ((SyncValue.Value.P2pAllowlistCustomer) value).value);
        } else if (value instanceof SyncValue.Value.P2pControl) {
            P2PControl.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_MANAGE_CONNECTIONS_VALUE, ((SyncValue.Value.P2pControl) value).value);
        } else if (value instanceof SyncValue.Value.CashGreen) {
            VersionedCashGreen.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_CENTERED_VALUE, ((SyncValue.Value.CashGreen) value).value);
        } else if (value instanceof SyncValue.Value.GreenBenefits) {
            VersionedGreenBenefits.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE, ((SyncValue.Value.GreenBenefits) value).value);
        } else if (value instanceof SyncValue.Value.GreenBooklet) {
            VersionedGreenBooklet.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, ((SyncValue.Value.GreenBooklet) value).value);
        } else if (value instanceof SyncValue.Value.ClientSyncConfig) {
            ClientSyncConfig.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, ((SyncValue.Value.ClientSyncConfig) value).value);
        } else if (value instanceof SyncValue.Value.BadgingData) {
            BadgingData.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE, ((SyncValue.Value.BadgingData) value).value);
        } else if (value instanceof SyncValue.Value.KgooseUserSettings) {
            CashUserSettings.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, ((SyncValue.Value.KgooseUserSettings) value).value);
        } else if (value instanceof SyncValue.Value.KgooseGlobalUserSettings) {
            CashGlobalUserSettings.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE, ((SyncValue.Value.KgooseGlobalUserSettings) value).value);
        } else if (value instanceof SyncValue.Value.AuthorizedAccount) {
            SyncValueAuthorizedAccount.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, ((SyncValue.Value.AuthorizedAccount) value).value);
        } else if (value instanceof SyncValue.Value.RestrictionsData) {
            RestrictionsData.ADAPTER.encodeWithTag(protoWriter, 165, ((SyncValue.Value.RestrictionsData) value).value);
        } else if (value instanceof SyncValue.Value.AdversityBanner) {
            AdversityBanner.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE, ((SyncValue.Value.AdversityBanner) value).value);
        } else if (value instanceof SyncValue.Value.BankingBenefitsConfig) {
            BankingBenefitsConfig.ADAPTER.encodeWithTag(protoWriter, 167, ((SyncValue.Value.BankingBenefitsConfig) value).value);
        } else if (value instanceof SyncValue.Value.MoneyTab) {
            MoneyTab.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, ((SyncValue.Value.MoneyTab) value).value);
        } else if (value instanceof SyncValue.Value.LocalPosCheckIn) {
            LocalPOSCheckIn.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, ((SyncValue.Value.LocalPosCheckIn) value).value);
        } else if (value instanceof SyncValue.Value.DemandDepositAccount) {
            DemandDepositAccount.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, ((SyncValue.Value.DemandDepositAccount) value).value);
        } else if (value instanceof SyncValue.Value.InvestPortfoliosPerformance) {
            PortfoliosPerformanceValue.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE, ((SyncValue.Value.InvestPortfoliosPerformance) value).value);
        } else if (value instanceof SyncValue.Value.CashCreditScoreSyncData) {
            CashCreditScoreSyncData.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, ((SyncValue.Value.CashCreditScoreSyncData) value).value);
        } else if (value instanceof SyncValue.Value.CashOutFeeData) {
            CashOutFeeData.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, ((SyncValue.Value.CashOutFeeData) value).value);
        } else if (value instanceof SyncValue.Value.RecipientSuggestions) {
            RecipientSuggestions.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, ((SyncValue.Value.RecipientSuggestions) value).value);
        } else if (value instanceof SyncValue.Value.CashAppTag) {
            CashAppTag.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE, ((SyncValue.Value.CashAppTag) value).value);
        } else if (value instanceof SyncValue.Value.InvestPortfoliosHistoricalData) {
            PortfoliosHistoricalDataValue.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE, ((SyncValue.Value.InvestPortfoliosHistoricalData) value).value);
        } else if (value instanceof SyncValue.Value.CardSkinAssets) {
            CardSkinAssets.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, ((SyncValue.Value.CardSkinAssets) value).value);
        } else if (value instanceof SyncValue.Value.PhonePlanApplet) {
            VersionedPhonePlanApplet.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, ((SyncValue.Value.PhonePlanApplet) value).value);
        } else if (value instanceof SyncValue.Value.TagThemeDefinitions) {
            TagThemeDefinitions.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_VERIFICATION_IN_PROGRESS_DARK_APPEARANCE_VALUE, ((SyncValue.Value.TagThemeDefinitions) value).value);
        } else if (value instanceof SyncValue.Value.BtcP2pConversionBps) {
            BtcP2pConversionBps.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE, ((SyncValue.Value.BtcP2pConversionBps) value).value);
        } else if (value instanceof SyncValue.Value.PaymentDevicePresentation) {
            PaymentDevicePresentation.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE, ((SyncValue.Value.PaymentDevicePresentation) value).value);
        } else if (value instanceof SyncValue.Value.LocalEarningCard) {
            LocalEarningCard.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE, ((SyncValue.Value.LocalEarningCard) value).value);
        } else if (value instanceof SyncValue.Value.EarningsHomeUiState) {
            EarningsHomeUIState.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, ((SyncValue.Value.EarningsHomeUiState) value).value);
        } else if (value instanceof SyncValue.Value.EarningsAppletUiState) {
            EarningsAppletUIState.ADAPTER.encodeWithTag(protoWriter, 185, ((SyncValue.Value.EarningsAppletUiState) value).value);
        } else if (value instanceof SyncValue.Value.CashForWorkApplet) {
            VersionedCashForWorkApplet.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE, ((SyncValue.Value.CashForWorkApplet) value).value);
        } else if (value instanceof SyncValue.Value.AutoBtcWithdrawThreshold) {
            AutoBtcWithdrawThresholdSyncValue.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE, ((SyncValue.Value.AutoBtcWithdrawThreshold) value).value);
        } else if (value instanceof SyncValue.Value.FinishSetupTile) {
            VersionedFinishSetupTile.ADAPTER.encodeWithTag(protoWriter, 188, ((SyncValue.Value.FinishSetupTile) value).value);
        } else if (value instanceof SyncValue.Value.EarnerEnrollmentState) {
            EarnerEnrollmentState.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, ((SyncValue.Value.EarnerEnrollmentState) value).value);
        } else if (value instanceof SyncValue.Value.CashLiteDefaultBankAccount) {
            CashLiteDefaultBankAccount.ADAPTER.encodeWithTag(protoWriter, EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, ((SyncValue.Value.CashLiteDefaultBankAccount) value).value);
        } else if (value != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(syncValue.unknownFields());
    }
}
