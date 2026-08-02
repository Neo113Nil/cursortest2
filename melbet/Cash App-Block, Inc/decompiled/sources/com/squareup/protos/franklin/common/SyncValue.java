package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.datadog.android.rum.model.ErrorEvent$Status$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ResourceEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.cashreactions.common.v1.AvailableReactions;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.remittances.syncvalue.v1.InternationalPaymentsCountryNotificationSyncValue;
import com.squareup.cash.remittances.syncvalue.v1.InternationalPaymentsCountrySelectionSyncValue;
import com.squareup.protos.access.sync_values.OTPInfo;
import com.squareup.protos.cash.aegis.sync_values.UiFamilyAccount;
import com.squareup.protos.cash.aegis.sync_values.UiFamilyTile;
import com.squareup.protos.cash.blockly.sync_values.P2PAllowListCustomer;
import com.squareup.protos.cash.cashbusinessaccounts.BusinessProfileData;
import com.squareup.protos.cash.cashbusinessaccounts.KybEligibilityWarning;
import com.squareup.protos.cash.cashbusinessaccounts.TapToPay;
import com.squareup.protos.cash.cashtaxgateway.sync_values.UiEfileInfo;
import com.squareup.protos.cash.fiatly.syncvalues.P2PControl;
import com.squareup.protos.cash.janus.syncvalues.SyncValueAccounts;
import com.squareup.protos.cash.janus.syncvalues.SyncValueAuthorizedAccount;
import com.squareup.protos.cash.kgoose.syncentity.CashGlobalUserSettings;
import com.squareup.protos.cash.kgoose.syncentity.CashUserSettings;
import com.squareup.protos.cash.local.client.app.v1.poscheckin.LocalPOSCheckIn;
import com.squareup.protos.cash.money.content.VersionedFinishSetupTile;
import com.squareup.protos.cash.notificationsettings.clientsync.v1.UiNotificationSettings;
import com.squareup.protos.cash.portfolios.syncvalues.PortfoliosHistoricalDataValue;
import com.squareup.protos.cash.portfolios.syncvalues.PortfoliosPerformanceValue;
import com.squareup.protos.cash.staff.syncvalues.VersionedCashForWorkApplet;
import com.squareup.protos.cash.taxfrontdoor.sync_values.UiTaxUpgrade;
import com.squareup.protos.cash.trustedcontact.SyncTrustedContact;
import com.squareup.protos.cash.woodrow.syncvalues.PerformanceDetails;
import com.squareup.protos.cash.woodrow.syncvalues.PerformanceDetailsUi;
import com.squareup.protos.cash.woodrow.syncvalues.PerformanceSummary;
import com.squareup.protos.franklin.common.AppLinks;
import com.squareup.protos.franklin.ui.C4BIdentityHubState;
import com.squareup.protos.franklin.ui.PersonalInfoCTABanner;
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
import com.squareup.protos.lending.sync_values.BorrowAppletCreditLimitAndBorrowButtonTile;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.bankingbenefits.ui.VersionedCashGreen;
import squareup.cash.bankingbenefits.ui.VersionedGreenBenefits;
import squareup.cash.bankingbenefits.ui.VersionedGreenBooklet;
import squareup.cash.cryptocurrency.AutoBtcWithdrawThresholdSyncValue;
import squareup.cash.earnings.EarningsAppletUIState;
import squareup.cash.earnings.EarningsHomeUIState;
import squareup.cash.investcore.trading.syncvalues.TradingState;
import squareup.cash.paychecks.AllocationDistribution;
import squareup.cash.paychecks.UiConfiguration;
import squareup.cash.paychecks.UiState;
import squareup.cash.phoneplans.syncvalues.VersionedPhonePlanApplet;
import squareup.cash.portfolios.syncvalues.PortfolioState;
import squareup.cash.savings.VersionedSavingsFolders;
import squareup.cash.savings.VersionedSavingsScreens;

/* loaded from: classes8.dex */
public final class SyncValue extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncValue> CREATOR;

    /* renamed from: type, reason: collision with root package name */
    public final SyncValueType f1393type;
    public final Value value;

    /* loaded from: classes4.dex */
    public abstract class Value {

        /* loaded from: classes8.dex */
        public final class Access extends Value {
            public final UiAccess value;

            public Access(UiAccess uiAccess) {
                uiAccess.getClass();
                this.value = uiAccess;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Access) && Intrinsics.areEqual(this.value, ((Access) obj).value);
            }

            public final UiAccess getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Access(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class AccountSuspension extends Value {
            public final com.squareup.protos.cash.guardrails.api.v1.AccountSuspension value;

            public AccountSuspension(com.squareup.protos.cash.guardrails.api.v1.AccountSuspension accountSuspension) {
                accountSuspension.getClass();
                this.value = accountSuspension;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AccountSuspension) && Intrinsics.areEqual(this.value, ((AccountSuspension) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "AccountSuspension(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class Accounts extends Value {
            public final SyncValueAccounts value;

            public Accounts(SyncValueAccounts syncValueAccounts) {
                syncValueAccounts.getClass();
                this.value = syncValueAccounts;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Accounts) && Intrinsics.areEqual(this.value, ((Accounts) obj).value);
            }

            public final SyncValueAccounts getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Accounts(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class Address extends Value {
            public final UiAddress value;

            public Address(UiAddress uiAddress) {
                uiAddress.getClass();
                this.value = uiAddress;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Address) && Intrinsics.areEqual(this.value, ((Address) obj).value);
            }

            public final UiAddress getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Address(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class AdversityBanner extends Value {
            public final com.squareup.protos.cash.guardrails.api.v1.AdversityBanner value;

            public AdversityBanner(com.squareup.protos.cash.guardrails.api.v1.AdversityBanner adversityBanner) {
                adversityBanner.getClass();
                this.value = adversityBanner;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AdversityBanner) && Intrinsics.areEqual(this.value, ((AdversityBanner) obj).value);
            }

            public final com.squareup.protos.cash.guardrails.api.v1.AdversityBanner getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "AdversityBanner(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class AfterpayPrepurchaseData extends Value {
            public final com.squareup.protos.lending.sync_values.AfterpayPrepurchaseData value;

            public AfterpayPrepurchaseData(com.squareup.protos.lending.sync_values.AfterpayPrepurchaseData afterpayPrepurchaseData) {
                afterpayPrepurchaseData.getClass();
                this.value = afterpayPrepurchaseData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AfterpayPrepurchaseData) && Intrinsics.areEqual(this.value, ((AfterpayPrepurchaseData) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "AfterpayPrepurchaseData(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class AppLock extends Value {
            public final UiAppLock value;

            public AppLock(UiAppLock uiAppLock) {
                uiAppLock.getClass();
                this.value = uiAppLock;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AppLock) && Intrinsics.areEqual(this.value, ((AppLock) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "AppLock(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class AppMessages extends Value {
            public final UiAppMesssages value;

            public AppMessages(UiAppMesssages uiAppMesssages) {
                uiAppMesssages.getClass();
                this.value = uiAppMesssages;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AppMessages) && Intrinsics.areEqual(this.value, ((AppMessages) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "AppMessages(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class AppThemeDefinitions extends Value {
            public final com.squareup.protos.cash.appthemes.AppThemeDefinitions value;

            public AppThemeDefinitions(com.squareup.protos.cash.appthemes.AppThemeDefinitions appThemeDefinitions) {
                appThemeDefinitions.getClass();
                this.value = appThemeDefinitions;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AppThemeDefinitions) && Intrinsics.areEqual(this.value, ((AppThemeDefinitions) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "AppThemeDefinitions(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class AtmPicker extends Value {
            public final ATMPicker value;

            public AtmPicker(ATMPicker aTMPicker) {
                aTMPicker.getClass();
                this.value = aTMPicker;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AtmPicker) && Intrinsics.areEqual(this.value, ((AtmPicker) obj).value);
            }

            public final ATMPicker getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "AtmPicker(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class AuthorizedAccount extends Value {
            public final SyncValueAuthorizedAccount value;

            public AuthorizedAccount(SyncValueAuthorizedAccount syncValueAuthorizedAccount) {
                syncValueAuthorizedAccount.getClass();
                this.value = syncValueAuthorizedAccount;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AuthorizedAccount) && Intrinsics.areEqual(this.value, ((AuthorizedAccount) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "AuthorizedAccount(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class AutoBtcWithdrawThreshold extends Value {
            public final AutoBtcWithdrawThresholdSyncValue value;

            public AutoBtcWithdrawThreshold(AutoBtcWithdrawThresholdSyncValue autoBtcWithdrawThresholdSyncValue) {
                autoBtcWithdrawThresholdSyncValue.getClass();
                this.value = autoBtcWithdrawThresholdSyncValue;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AutoBtcWithdrawThreshold) && Intrinsics.areEqual(this.value, ((AutoBtcWithdrawThreshold) obj).value);
            }

            public final AutoBtcWithdrawThresholdSyncValue getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "AutoBtcWithdrawThreshold(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class AvailablePaymentPadThemes extends Value {
            public final com.squareup.protos.franklin.AvailablePaymentPadThemes value;

            public AvailablePaymentPadThemes(com.squareup.protos.franklin.AvailablePaymentPadThemes availablePaymentPadThemes) {
                availablePaymentPadThemes.getClass();
                this.value = availablePaymentPadThemes;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AvailablePaymentPadThemes) && Intrinsics.areEqual(this.value, ((AvailablePaymentPadThemes) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "AvailablePaymentPadThemes(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class BadgingData extends Value {
            public final com.squareup.protos.cash.badging.api.BadgingData value;

            public BadgingData(com.squareup.protos.cash.badging.api.BadgingData badgingData) {
                badgingData.getClass();
                this.value = badgingData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BadgingData) && Intrinsics.areEqual(this.value, ((BadgingData) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "BadgingData(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class BalanceBasedAddCashPreference extends Value {
            public final com.squareup.protos.cash.balancebasedaddcash.api.v1_0.syncvalues.BalanceBasedAddCashPreference value;

            public BalanceBasedAddCashPreference(com.squareup.protos.cash.balancebasedaddcash.api.v1_0.syncvalues.BalanceBasedAddCashPreference balanceBasedAddCashPreference) {
                balanceBasedAddCashPreference.getClass();
                this.value = balanceBasedAddCashPreference;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BalanceBasedAddCashPreference) && Intrinsics.areEqual(this.value, ((BalanceBasedAddCashPreference) obj).value);
            }

            public final com.squareup.protos.cash.balancebasedaddcash.api.v1_0.syncvalues.BalanceBasedAddCashPreference getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "BalanceBasedAddCashPreference(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class BalanceSnapshot extends Value {
            public final com.squareup.protos.franklin.ui.BalanceSnapshot value;

            public BalanceSnapshot(com.squareup.protos.franklin.ui.BalanceSnapshot balanceSnapshot) {
                balanceSnapshot.getClass();
                this.value = balanceSnapshot;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BalanceSnapshot) && Intrinsics.areEqual(this.value, ((BalanceSnapshot) obj).value);
            }

            public final com.squareup.protos.franklin.ui.BalanceSnapshot getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "BalanceSnapshot(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class BankingBenefitsConfig extends Value {
            public final com.squareup.cash.bankingbenefits.ui.BankingBenefitsConfig value;

            public BankingBenefitsConfig(com.squareup.cash.bankingbenefits.ui.BankingBenefitsConfig bankingBenefitsConfig) {
                bankingBenefitsConfig.getClass();
                this.value = bankingBenefitsConfig;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BankingBenefitsConfig) && Intrinsics.areEqual(this.value, ((BankingBenefitsConfig) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "BankingBenefitsConfig(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class BankingTab extends Value {
            public final com.squareup.protos.unicorn.BankingTab value;

            public BankingTab(com.squareup.protos.unicorn.BankingTab bankingTab) {
                bankingTab.getClass();
                this.value = bankingTab;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BankingTab) && Intrinsics.areEqual(this.value, ((BankingTab) obj).value);
            }

            public final com.squareup.protos.unicorn.BankingTab getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "BankingTab(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class BillsApplet extends Value {
            public final squareup.cash.bills.BillsApplet value;

            public BillsApplet(squareup.cash.bills.BillsApplet billsApplet) {
                billsApplet.getClass();
                this.value = billsApplet;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BillsApplet) && Intrinsics.areEqual(this.value, ((BillsApplet) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "BillsApplet(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class BillsConfig extends Value {
            public final squareup.cash.bills.BillsConfig value;

            public BillsConfig(squareup.cash.bills.BillsConfig billsConfig) {
                billsConfig.getClass();
                this.value = billsConfig;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BillsConfig) && Intrinsics.areEqual(this.value, ((BillsConfig) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "BillsConfig(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class BitcoinPerformanceDetails extends Value {
            public final PerformanceDetails value;

            public BitcoinPerformanceDetails(PerformanceDetails performanceDetails) {
                performanceDetails.getClass();
                this.value = performanceDetails;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BitcoinPerformanceDetails) && Intrinsics.areEqual(this.value, ((BitcoinPerformanceDetails) obj).value);
            }

            public final PerformanceDetails getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "BitcoinPerformanceDetails(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class BitcoinPerformanceDetailsUi extends Value {
            public final PerformanceDetailsUi value;

            public BitcoinPerformanceDetailsUi(PerformanceDetailsUi performanceDetailsUi) {
                performanceDetailsUi.getClass();
                this.value = performanceDetailsUi;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BitcoinPerformanceDetailsUi) && Intrinsics.areEqual(this.value, ((BitcoinPerformanceDetailsUi) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "BitcoinPerformanceDetailsUi(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class BitcoinPerformanceDetailsUserInterface extends Value {
            public final PerformanceDetailsUi value;

            public BitcoinPerformanceDetailsUserInterface(PerformanceDetailsUi performanceDetailsUi) {
                performanceDetailsUi.getClass();
                this.value = performanceDetailsUi;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BitcoinPerformanceDetailsUserInterface) && Intrinsics.areEqual(this.value, ((BitcoinPerformanceDetailsUserInterface) obj).value);
            }

            public final PerformanceDetailsUi getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "BitcoinPerformanceDetailsUserInterface(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class BitcoinPerformanceSummary extends Value {
            public final PerformanceSummary value;

            public BitcoinPerformanceSummary(PerformanceSummary performanceSummary) {
                performanceSummary.getClass();
                this.value = performanceSummary;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BitcoinPerformanceSummary) && Intrinsics.areEqual(this.value, ((BitcoinPerformanceSummary) obj).value);
            }

            public final PerformanceSummary getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "BitcoinPerformanceSummary(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class BorrowAppletBulletinsTile extends Value {
            public final com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile value;

            public BorrowAppletBulletinsTile(com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile borrowAppletBulletinsTile) {
                borrowAppletBulletinsTile.getClass();
                this.value = borrowAppletBulletinsTile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BorrowAppletBulletinsTile) && Intrinsics.areEqual(this.value, ((BorrowAppletBulletinsTile) obj).value);
            }

            public final com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "BorrowAppletBulletinsTile(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class BorrowAppletCreditLimitBorrowButtonTile extends Value {
            public final BorrowAppletCreditLimitAndBorrowButtonTile value;

            public BorrowAppletCreditLimitBorrowButtonTile(BorrowAppletCreditLimitAndBorrowButtonTile borrowAppletCreditLimitAndBorrowButtonTile) {
                borrowAppletCreditLimitAndBorrowButtonTile.getClass();
                this.value = borrowAppletCreditLimitAndBorrowButtonTile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BorrowAppletCreditLimitBorrowButtonTile) && Intrinsics.areEqual(this.value, ((BorrowAppletCreditLimitBorrowButtonTile) obj).value);
            }

            public final BorrowAppletCreditLimitAndBorrowButtonTile getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "BorrowAppletCreditLimitBorrowButtonTile(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class BorrowAppletLinksTile extends Value {
            public final com.squareup.protos.lending.sync_values.BorrowAppletLinksTile value;

            public BorrowAppletLinksTile(com.squareup.protos.lending.sync_values.BorrowAppletLinksTile borrowAppletLinksTile) {
                borrowAppletLinksTile.getClass();
                this.value = borrowAppletLinksTile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BorrowAppletLinksTile) && Intrinsics.areEqual(this.value, ((BorrowAppletLinksTile) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "BorrowAppletLinksTile(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class BorrowAppletLoanHistoryTile extends Value {
            public final com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile value;

            public BorrowAppletLoanHistoryTile(com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile borrowAppletLoanHistoryTile) {
                borrowAppletLoanHistoryTile.getClass();
                this.value = borrowAppletLoanHistoryTile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BorrowAppletLoanHistoryTile) && Intrinsics.areEqual(this.value, ((BorrowAppletLoanHistoryTile) obj).value);
            }

            public final com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "BorrowAppletLoanHistoryTile(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class BorrowAppletPaymentTimelineTile extends Value {
            public final com.squareup.protos.lending.sync_values.BorrowAppletPaymentTimelineTile value;

            public BorrowAppletPaymentTimelineTile(com.squareup.protos.lending.sync_values.BorrowAppletPaymentTimelineTile borrowAppletPaymentTimelineTile) {
                borrowAppletPaymentTimelineTile.getClass();
                this.value = borrowAppletPaymentTimelineTile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BorrowAppletPaymentTimelineTile) && Intrinsics.areEqual(this.value, ((BorrowAppletPaymentTimelineTile) obj).value);
            }

            public final com.squareup.protos.lending.sync_values.BorrowAppletPaymentTimelineTile getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "BorrowAppletPaymentTimelineTile(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class BorrowData extends Value {
            public final com.squareup.protos.lending.sync_values.BorrowData value;

            public BorrowData(com.squareup.protos.lending.sync_values.BorrowData borrowData) {
                borrowData.getClass();
                this.value = borrowData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BorrowData) && Intrinsics.areEqual(this.value, ((BorrowData) obj).value);
            }

            public final com.squareup.protos.lending.sync_values.BorrowData getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "BorrowData(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class BorrowLimitHubData extends Value {
            public final com.squareup.protos.lending.sync_values.BorrowLimitHubData value;

            public BorrowLimitHubData(com.squareup.protos.lending.sync_values.BorrowLimitHubData borrowLimitHubData) {
                borrowLimitHubData.getClass();
                this.value = borrowLimitHubData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BorrowLimitHubData) && Intrinsics.areEqual(this.value, ((BorrowLimitHubData) obj).value);
            }

            public final com.squareup.protos.lending.sync_values.BorrowLimitHubData getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "BorrowLimitHubData(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class BtcAppletRenderingState extends Value {
            public final com.squareup.protos.cash.cashbusinessaccounts.BtcAppletRenderingState value;

            public BtcAppletRenderingState(com.squareup.protos.cash.cashbusinessaccounts.BtcAppletRenderingState btcAppletRenderingState) {
                btcAppletRenderingState.getClass();
                this.value = btcAppletRenderingState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BtcAppletRenderingState) && Intrinsics.areEqual(this.value, ((BtcAppletRenderingState) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "BtcAppletRenderingState(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class BtcP2pConversionBps extends Value {
            public final squareup.cash.cryptocurrency.BtcP2pConversionBps value;

            public BtcP2pConversionBps(squareup.cash.cryptocurrency.BtcP2pConversionBps btcP2pConversionBps) {
                btcP2pConversionBps.getClass();
                this.value = btcP2pConversionBps;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BtcP2pConversionBps) && Intrinsics.areEqual(this.value, ((BtcP2pConversionBps) obj).value);
            }

            public final squareup.cash.cryptocurrency.BtcP2pConversionBps getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "BtcP2pConversionBps(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class BusinessAddress extends Value {
            public final UiAddress value;

            public BusinessAddress(UiAddress uiAddress) {
                uiAddress.getClass();
                this.value = uiAddress;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BusinessAddress) && Intrinsics.areEqual(this.value, ((BusinessAddress) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "BusinessAddress(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class C4bIdentityHubState extends Value {
            public final C4BIdentityHubState value;

            public C4bIdentityHubState(C4BIdentityHubState c4BIdentityHubState) {
                c4BIdentityHubState.getClass();
                this.value = c4BIdentityHubState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4bIdentityHubState) && Intrinsics.areEqual(this.value, ((C4bIdentityHubState) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "C4bIdentityHubState(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class C4bKybEligibilityWarning extends Value {
            public final KybEligibilityWarning value;

            public C4bKybEligibilityWarning(KybEligibilityWarning kybEligibilityWarning) {
                kybEligibilityWarning.getClass();
                this.value = kybEligibilityWarning;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4bKybEligibilityWarning) && Intrinsics.areEqual(this.value, ((C4bKybEligibilityWarning) obj).value);
            }

            public final KybEligibilityWarning getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "C4bKybEligibilityWarning(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class C4bProfileData extends Value {
            public final BusinessProfileData value;

            public C4bProfileData(BusinessProfileData businessProfileData) {
                businessProfileData.getClass();
                this.value = businessProfileData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4bProfileData) && Intrinsics.areEqual(this.value, ((C4bProfileData) obj).value);
            }

            public final BusinessProfileData getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "C4bProfileData(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class C4bTapToPay extends Value {
            public final TapToPay value;

            public C4bTapToPay(TapToPay tapToPay) {
                tapToPay.getClass();
                this.value = tapToPay;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4bTapToPay) && Intrinsics.areEqual(this.value, ((C4bTapToPay) obj).value);
            }

            public final TapToPay getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "C4bTapToPay(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class CardSkinAssets extends Value {
            public final com.squareup.protos.cash.whimsicard.syncentity.CardSkinAssets value;

            public CardSkinAssets(com.squareup.protos.cash.whimsicard.syncentity.CardSkinAssets cardSkinAssets) {
                cardSkinAssets.getClass();
                this.value = cardSkinAssets;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CardSkinAssets) && Intrinsics.areEqual(this.value, ((CardSkinAssets) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "CardSkinAssets(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class CardSpendingInsightsConfig extends Value {
            public final com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightsConfig value;

            public CardSpendingInsightsConfig(com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightsConfig cardSpendingInsightsConfig) {
                cardSpendingInsightsConfig.getClass();
                this.value = cardSpendingInsightsConfig;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CardSpendingInsightsConfig) && Intrinsics.areEqual(this.value, ((CardSpendingInsightsConfig) obj).value);
            }

            public final com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightsConfig getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "CardSpendingInsightsConfig(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class CardSpendingInsightsHome extends Value {
            public final com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightsHome value;

            public CardSpendingInsightsHome(com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightsHome cardSpendingInsightsHome) {
                cardSpendingInsightsHome.getClass();
                this.value = cardSpendingInsightsHome;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CardSpendingInsightsHome) && Intrinsics.areEqual(this.value, ((CardSpendingInsightsHome) obj).value);
            }

            public final com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightsHome getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "CardSpendingInsightsHome(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class CardThemeDefinitions extends Value {
            public final com.squareup.protos.franklin.cards.CardThemeDefinitions value;

            public CardThemeDefinitions(com.squareup.protos.franklin.cards.CardThemeDefinitions cardThemeDefinitions) {
                cardThemeDefinitions.getClass();
                this.value = cardThemeDefinitions;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CardThemeDefinitions) && Intrinsics.areEqual(this.value, ((CardThemeDefinitions) obj).value);
            }

            public final com.squareup.protos.franklin.cards.CardThemeDefinitions getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "CardThemeDefinitions(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class CashAppCard extends Value {
            public final com.squareup.protos.cash.postcard.CashAppCard value;

            public CashAppCard(com.squareup.protos.cash.postcard.CashAppCard cashAppCard) {
                cashAppCard.getClass();
                this.value = cashAppCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CashAppCard) && Intrinsics.areEqual(this.value, ((CashAppCard) obj).value);
            }

            public final com.squareup.protos.cash.postcard.CashAppCard getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "CashAppCard(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class CashAppTag extends Value {
            public final com.squareup.protos.cash.taply.syncvalues.CashAppTag value;

            public CashAppTag(com.squareup.protos.cash.taply.syncvalues.CashAppTag cashAppTag) {
                cashAppTag.getClass();
                this.value = cashAppTag;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CashAppTag) && Intrinsics.areEqual(this.value, ((CashAppTag) obj).value);
            }

            public final com.squareup.protos.cash.taply.syncvalues.CashAppTag getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "CashAppTag(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class CashCreditScoreSyncData extends Value {
            public final com.squareup.lending.sync_values.CashCreditScoreSyncData value;

            public CashCreditScoreSyncData(com.squareup.lending.sync_values.CashCreditScoreSyncData cashCreditScoreSyncData) {
                cashCreditScoreSyncData.getClass();
                this.value = cashCreditScoreSyncData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CashCreditScoreSyncData) && Intrinsics.areEqual(this.value, ((CashCreditScoreSyncData) obj).value);
            }

            public final com.squareup.lending.sync_values.CashCreditScoreSyncData getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "CashCreditScoreSyncData(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class CashForWorkApplet extends Value {
            public final VersionedCashForWorkApplet value;

            public CashForWorkApplet(VersionedCashForWorkApplet versionedCashForWorkApplet) {
                versionedCashForWorkApplet.getClass();
                this.value = versionedCashForWorkApplet;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CashForWorkApplet) && Intrinsics.areEqual(this.value, ((CashForWorkApplet) obj).value);
            }

            public final VersionedCashForWorkApplet getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "CashForWorkApplet(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class CashGreen extends Value {
            public final VersionedCashGreen value;

            public CashGreen(VersionedCashGreen versionedCashGreen) {
                versionedCashGreen.getClass();
                this.value = versionedCashGreen;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CashGreen) && Intrinsics.areEqual(this.value, ((CashGreen) obj).value);
            }

            public final VersionedCashGreen getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "CashGreen(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class CashLimits extends Value {
            public final UiCashLimits value;

            public CashLimits(UiCashLimits uiCashLimits) {
                uiCashLimits.getClass();
                this.value = uiCashLimits;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CashLimits) && Intrinsics.areEqual(this.value, ((CashLimits) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "CashLimits(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class CashLiteDefaultBankAccount extends Value {
            public final squareup.cash.cashliteflow.CashLiteDefaultBankAccount value;

            public CashLiteDefaultBankAccount(squareup.cash.cashliteflow.CashLiteDefaultBankAccount cashLiteDefaultBankAccount) {
                cashLiteDefaultBankAccount.getClass();
                this.value = cashLiteDefaultBankAccount;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CashLiteDefaultBankAccount) && Intrinsics.areEqual(this.value, ((CashLiteDefaultBankAccount) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "CashLiteDefaultBankAccount(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class CashOClockPreference extends Value {
            public final com.squareup.cash.cashoclock.api.v1_0.syncvalues.CashOClockPreference value;

            public CashOClockPreference(com.squareup.cash.cashoclock.api.v1_0.syncvalues.CashOClockPreference cashOClockPreference) {
                cashOClockPreference.getClass();
                this.value = cashOClockPreference;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CashOClockPreference) && Intrinsics.areEqual(this.value, ((CashOClockPreference) obj).value);
            }

            public final com.squareup.cash.cashoclock.api.v1_0.syncvalues.CashOClockPreference getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "CashOClockPreference(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class CashOutFeeData extends Value {
            public final com.squareup.cash.out.sync_entity.CashOutFeeData value;

            public CashOutFeeData(com.squareup.cash.out.sync_entity.CashOutFeeData cashOutFeeData) {
                cashOutFeeData.getClass();
                this.value = cashOutFeeData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CashOutFeeData) && Intrinsics.areEqual(this.value, ((CashOutFeeData) obj).value);
            }

            public final com.squareup.cash.out.sync_entity.CashOutFeeData getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "CashOutFeeData(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class CashOutInstrumentCapabilityConfig extends Value {
            public final com.squareup.cash.out.sync_entity.CashOutInstrumentCapabilityConfig value;

            public CashOutInstrumentCapabilityConfig(com.squareup.cash.out.sync_entity.CashOutInstrumentCapabilityConfig cashOutInstrumentCapabilityConfig) {
                cashOutInstrumentCapabilityConfig.getClass();
                this.value = cashOutInstrumentCapabilityConfig;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CashOutInstrumentCapabilityConfig) && Intrinsics.areEqual(this.value, ((CashOutInstrumentCapabilityConfig) obj).value);
            }

            public final com.squareup.cash.out.sync_entity.CashOutInstrumentCapabilityConfig getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "CashOutInstrumentCapabilityConfig(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class Cats extends Value {
            public final com.squareup.protos.cash.cats.Cats value;

            public Cats(com.squareup.protos.cash.cats.Cats cats) {
                cats.getClass();
                this.value = cats;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Cats) && Intrinsics.areEqual(this.value, ((Cats) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Cats(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class CheckDepositEligibility extends Value {
            public final com.squareup.protos.checkmate.sync.CheckDepositEligibility value;

            public CheckDepositEligibility(com.squareup.protos.checkmate.sync.CheckDepositEligibility checkDepositEligibility) {
                checkDepositEligibility.getClass();
                this.value = checkDepositEligibility;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CheckDepositEligibility) && Intrinsics.areEqual(this.value, ((CheckDepositEligibility) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "CheckDepositEligibility(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class CheckDepositProfile extends Value {
            public final com.squareup.protos.checkmate.profile.CheckDepositProfile value;

            public CheckDepositProfile(com.squareup.protos.checkmate.profile.CheckDepositProfile checkDepositProfile) {
                checkDepositProfile.getClass();
                this.value = checkDepositProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CheckDepositProfile) && Intrinsics.areEqual(this.value, ((CheckDepositProfile) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "CheckDepositProfile(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class ClientSyncConfig extends Value {
            public final com.squareup.protos.cash.syncentitygateway.syncvalues.ClientSyncConfig value;

            public ClientSyncConfig(com.squareup.protos.cash.syncentitygateway.syncvalues.ClientSyncConfig clientSyncConfig) {
                clientSyncConfig.getClass();
                this.value = clientSyncConfig;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ClientSyncConfig) && Intrinsics.areEqual(this.value, ((ClientSyncConfig) obj).value);
            }

            public final com.squareup.protos.cash.syncentitygateway.syncvalues.ClientSyncConfig getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "ClientSyncConfig(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class CommerceBrowserAutofillPreferences extends Value {
            public final com.squareup.protos.cash.commercebrowser.CommerceBrowserAutofillPreferences value;

            public CommerceBrowserAutofillPreferences(com.squareup.protos.cash.commercebrowser.CommerceBrowserAutofillPreferences commerceBrowserAutofillPreferences) {
                commerceBrowserAutofillPreferences.getClass();
                this.value = commerceBrowserAutofillPreferences;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CommerceBrowserAutofillPreferences) && Intrinsics.areEqual(this.value, ((CommerceBrowserAutofillPreferences) obj).value);
            }

            public final com.squareup.protos.cash.commercebrowser.CommerceBrowserAutofillPreferences getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "CommerceBrowserAutofillPreferences(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class CoreCustomer extends Value {
            public final UiCoreCustomer value;

            public CoreCustomer(UiCoreCustomer uiCoreCustomer) {
                uiCoreCustomer.getClass();
                this.value = uiCoreCustomer;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CoreCustomer) && Intrinsics.areEqual(this.value, ((CoreCustomer) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "CoreCustomer(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class Cryptocurrency extends Value {
            public final UiCryptoCurrency value;

            public Cryptocurrency(UiCryptoCurrency uiCryptoCurrency) {
                uiCryptoCurrency.getClass();
                this.value = uiCryptoCurrency;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Cryptocurrency) && Intrinsics.areEqual(this.value, ((Cryptocurrency) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Cryptocurrency(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class CryptocurrencyProfile extends Value {
            public final squareup.cash.cryptocurrency.CryptocurrencyProfile value;

            public CryptocurrencyProfile(squareup.cash.cryptocurrency.CryptocurrencyProfile cryptocurrencyProfile) {
                cryptocurrencyProfile.getClass();
                this.value = cryptocurrencyProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CryptocurrencyProfile) && Intrinsics.areEqual(this.value, ((CryptocurrencyProfile) obj).value);
            }

            public final squareup.cash.cryptocurrency.CryptocurrencyProfile getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "CryptocurrencyProfile(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class CustomerShoppingPreference extends Value {
            public final com.squareup.protos.cash.shopping.CustomerShoppingPreference value;

            public CustomerShoppingPreference(com.squareup.protos.cash.shopping.CustomerShoppingPreference customerShoppingPreference) {
                customerShoppingPreference.getClass();
                this.value = customerShoppingPreference;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CustomerShoppingPreference) && Intrinsics.areEqual(this.value, ((CustomerShoppingPreference) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "CustomerShoppingPreference(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class DataPrivacySettings extends Value {
            public final com.squareup.protos.cash.dataprivacy.settings.DataPrivacySettings value;

            public DataPrivacySettings(com.squareup.protos.cash.dataprivacy.settings.DataPrivacySettings dataPrivacySettings) {
                dataPrivacySettings.getClass();
                this.value = dataPrivacySettings;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DataPrivacySettings) && Intrinsics.areEqual(this.value, ((DataPrivacySettings) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "DataPrivacySettings(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class Dda extends Value {
            public final UiDda value;

            public Dda(UiDda uiDda) {
                uiDda.getClass();
                this.value = uiDda;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Dda) && Intrinsics.areEqual(this.value, ((Dda) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Dda(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class DemandDepositAccount extends Value {
            public final com.squareup.protos.cash.postbank.DemandDepositAccount value;

            public DemandDepositAccount(com.squareup.protos.cash.postbank.DemandDepositAccount demandDepositAccount) {
                demandDepositAccount.getClass();
                this.value = demandDepositAccount;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DemandDepositAccount) && Intrinsics.areEqual(this.value, ((DemandDepositAccount) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "DemandDepositAccount(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class DeviceInfo extends Value {
            public final com.squareup.protos.access.sync_values.DeviceInfo value;

            public DeviceInfo(com.squareup.protos.access.sync_values.DeviceInfo deviceInfo) {
                deviceInfo.getClass();
                this.value = deviceInfo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DeviceInfo) && Intrinsics.areEqual(this.value, ((DeviceInfo) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "DeviceInfo(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class DisplayName extends Value {
            public final com.squareup.cash.idv.DisplayName value;

            public DisplayName(com.squareup.cash.idv.DisplayName displayName) {
                displayName.getClass();
                this.value = displayName;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DisplayName) && Intrinsics.areEqual(this.value, ((DisplayName) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "DisplayName(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class DisplayNameDetails extends Value {
            public final com.squareup.protos.cash.profiles.DisplayNameDetails value;

            public DisplayNameDetails(com.squareup.protos.cash.profiles.DisplayNameDetails displayNameDetails) {
                displayNameDetails.getClass();
                this.value = displayNameDetails;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DisplayNameDetails) && Intrinsics.areEqual(this.value, ((DisplayNameDetails) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "DisplayNameDetails(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class EarnerEnrollmentState extends Value {
            public final squareup.cash.earnings.EarnerEnrollmentState value;

            public EarnerEnrollmentState(squareup.cash.earnings.EarnerEnrollmentState earnerEnrollmentState) {
                earnerEnrollmentState.getClass();
                this.value = earnerEnrollmentState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EarnerEnrollmentState) && Intrinsics.areEqual(this.value, ((EarnerEnrollmentState) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "EarnerEnrollmentState(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class EarningsAppletUiState extends Value {
            public final EarningsAppletUIState value;

            public EarningsAppletUiState(EarningsAppletUIState earningsAppletUIState) {
                earningsAppletUIState.getClass();
                this.value = earningsAppletUIState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EarningsAppletUiState) && Intrinsics.areEqual(this.value, ((EarningsAppletUiState) obj).value);
            }

            public final EarningsAppletUIState getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "EarningsAppletUiState(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class EarningsHomeUiState extends Value {
            public final EarningsHomeUIState value;

            public EarningsHomeUiState(EarningsHomeUIState earningsHomeUIState) {
                earningsHomeUIState.getClass();
                this.value = earningsHomeUIState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EarningsHomeUiState) && Intrinsics.areEqual(this.value, ((EarningsHomeUiState) obj).value);
            }

            public final EarningsHomeUIState getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "EarningsHomeUiState(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class EarningsTrackerSummary extends Value {
            public final com.squareup.protos.cash.cashbusinessaccounts.EarningsTrackerSummary value;

            public EarningsTrackerSummary(com.squareup.protos.cash.cashbusinessaccounts.EarningsTrackerSummary earningsTrackerSummary) {
                earningsTrackerSummary.getClass();
                this.value = earningsTrackerSummary;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EarningsTrackerSummary) && Intrinsics.areEqual(this.value, ((EarningsTrackerSummary) obj).value);
            }

            public final com.squareup.protos.cash.cashbusinessaccounts.EarningsTrackerSummary getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "EarningsTrackerSummary(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class EfileInfo extends Value {
            public final UiEfileInfo value;

            public EfileInfo(UiEfileInfo uiEfileInfo) {
                uiEfileInfo.getClass();
                this.value = uiEfileInfo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EfileInfo) && Intrinsics.areEqual(this.value, ((EfileInfo) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "EfileInfo(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class ExchangeData extends Value {
            public final UiExchangeData value;

            public ExchangeData(UiExchangeData uiExchangeData) {
                uiExchangeData.getClass();
                this.value = uiExchangeData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ExchangeData) && Intrinsics.areEqual(this.value, ((ExchangeData) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "ExchangeData(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class FamilyAccount extends Value {
            public final UiFamilyAccount value;

            public FamilyAccount(UiFamilyAccount uiFamilyAccount) {
                uiFamilyAccount.getClass();
                this.value = uiFamilyAccount;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FamilyAccount) && Intrinsics.areEqual(this.value, ((FamilyAccount) obj).value);
            }

            public final UiFamilyAccount getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "FamilyAccount(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class FamilyTile extends Value {
            public final UiFamilyTile value;

            public FamilyTile(UiFamilyTile uiFamilyTile) {
                uiFamilyTile.getClass();
                this.value = uiFamilyTile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FamilyTile) && Intrinsics.areEqual(this.value, ((FamilyTile) obj).value);
            }

            public final UiFamilyTile getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "FamilyTile(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class Favorite extends Value {
            public final com.squareup.protos.cash.favorites.Favorite value;

            public Favorite(com.squareup.protos.cash.favorites.Favorite favorite) {
                favorite.getClass();
                this.value = favorite;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Favorite) && Intrinsics.areEqual(this.value, ((Favorite) obj).value);
            }

            public final com.squareup.protos.cash.favorites.Favorite getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Favorite(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class FdicInsuranceCustomerStatus extends Value {
            public final com.squareup.protos.unicorn.FdicInsuranceCustomerStatus value;

            public FdicInsuranceCustomerStatus(com.squareup.protos.unicorn.FdicInsuranceCustomerStatus fdicInsuranceCustomerStatus) {
                fdicInsuranceCustomerStatus.getClass();
                this.value = fdicInsuranceCustomerStatus;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FdicInsuranceCustomerStatus) && Intrinsics.areEqual(this.value, ((FdicInsuranceCustomerStatus) obj).value);
            }

            public final com.squareup.protos.unicorn.FdicInsuranceCustomerStatus getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "FdicInsuranceCustomerStatus(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class FeatureEligibilityRefreshPolicy extends Value {
            public final com.squareup.protos.access.sync_values.FeatureEligibilityRefreshPolicy value;

            public FeatureEligibilityRefreshPolicy(com.squareup.protos.access.sync_values.FeatureEligibilityRefreshPolicy featureEligibilityRefreshPolicy) {
                featureEligibilityRefreshPolicy.getClass();
                this.value = featureEligibilityRefreshPolicy;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FeatureEligibilityRefreshPolicy) && Intrinsics.areEqual(this.value, ((FeatureEligibilityRefreshPolicy) obj).value);
            }

            public final com.squareup.protos.access.sync_values.FeatureEligibilityRefreshPolicy getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "FeatureEligibilityRefreshPolicy(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class FinishSetupTile extends Value {
            public final VersionedFinishSetupTile value;

            public FinishSetupTile(VersionedFinishSetupTile versionedFinishSetupTile) {
                versionedFinishSetupTile.getClass();
                this.value = versionedFinishSetupTile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FinishSetupTile) && Intrinsics.areEqual(this.value, ((FinishSetupTile) obj).value);
            }

            public final VersionedFinishSetupTile getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "FinishSetupTile(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class GlobalBorrowData extends Value {
            public final com.squareup.protos.lending.sync_values.GlobalBorrowData value;

            public GlobalBorrowData(com.squareup.protos.lending.sync_values.GlobalBorrowData globalBorrowData) {
                globalBorrowData.getClass();
                this.value = globalBorrowData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GlobalBorrowData) && Intrinsics.areEqual(this.value, ((GlobalBorrowData) obj).value);
            }

            public final com.squareup.protos.lending.sync_values.GlobalBorrowData getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "GlobalBorrowData(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class GreenBenefits extends Value {
            public final VersionedGreenBenefits value;

            public GreenBenefits(VersionedGreenBenefits versionedGreenBenefits) {
                versionedGreenBenefits.getClass();
                this.value = versionedGreenBenefits;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GreenBenefits) && Intrinsics.areEqual(this.value, ((GreenBenefits) obj).value);
            }

            public final VersionedGreenBenefits getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "GreenBenefits(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class GreenBooklet extends Value {
            public final VersionedGreenBooklet value;

            public GreenBooklet(VersionedGreenBooklet versionedGreenBooklet) {
                versionedGreenBooklet.getClass();
                this.value = versionedGreenBooklet;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GreenBooklet) && Intrinsics.areEqual(this.value, ((GreenBooklet) obj).value);
            }

            public final VersionedGreenBooklet getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "GreenBooklet(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class IdentityHubState extends Value {
            public final com.squareup.protos.franklin.ui.IdentityHubState value;

            public IdentityHubState(com.squareup.protos.franklin.ui.IdentityHubState identityHubState) {
                identityHubState.getClass();
                this.value = identityHubState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof IdentityHubState) && Intrinsics.areEqual(this.value, ((IdentityHubState) obj).value);
            }

            public final com.squareup.protos.franklin.ui.IdentityHubState getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "IdentityHubState(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class IdvState extends Value {
            public final UiIdvState value;

            public IdvState(UiIdvState uiIdvState) {
                uiIdvState.getClass();
                this.value = uiIdvState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof IdvState) && Intrinsics.areEqual(this.value, ((IdvState) obj).value);
            }

            public final UiIdvState getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "IdvState(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class InputtedLegalName extends Value {
            public final com.squareup.protos.franklin.ui.InputtedLegalName value;

            public InputtedLegalName(com.squareup.protos.franklin.ui.InputtedLegalName inputtedLegalName) {
                inputtedLegalName.getClass();
                this.value = inputtedLegalName;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InputtedLegalName) && Intrinsics.areEqual(this.value, ((InputtedLegalName) obj).value);
            }

            public final com.squareup.protos.franklin.ui.InputtedLegalName getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "InputtedLegalName(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class Instrument extends Value {
            public final com.squareup.protos.franklin.api.Instrument value;

            public Instrument(com.squareup.protos.franklin.api.Instrument instrument) {
                instrument.getClass();
                this.value = instrument;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Instrument) && Intrinsics.areEqual(this.value, ((Instrument) obj).value);
            }

            public final com.squareup.protos.franklin.api.Instrument getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Instrument(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class InstrumentLinkingOption extends Value {
            public final com.squareup.protos.franklin.common.InstrumentLinkingOption value;

            public InstrumentLinkingOption(com.squareup.protos.franklin.common.InstrumentLinkingOption instrumentLinkingOption) {
                instrumentLinkingOption.getClass();
                this.value = instrumentLinkingOption;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InstrumentLinkingOption) && Intrinsics.areEqual(this.value, ((InstrumentLinkingOption) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "InstrumentLinkingOption(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class InstrumentLinkingOptions extends Value {
            public final com.squareup.protos.franklin.common.InstrumentLinkingOptions value;

            public InstrumentLinkingOptions(com.squareup.protos.franklin.common.InstrumentLinkingOptions instrumentLinkingOptions) {
                instrumentLinkingOptions.getClass();
                this.value = instrumentLinkingOptions;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InstrumentLinkingOptions) && Intrinsics.areEqual(this.value, ((InstrumentLinkingOptions) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "InstrumentLinkingOptions(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class InternationalPaymentsCountryConfig extends Value {
            public final InternationalPaymentsCountrySelectionSyncValue value;

            public InternationalPaymentsCountryConfig(InternationalPaymentsCountrySelectionSyncValue internationalPaymentsCountrySelectionSyncValue) {
                internationalPaymentsCountrySelectionSyncValue.getClass();
                this.value = internationalPaymentsCountrySelectionSyncValue;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InternationalPaymentsCountryConfig) && Intrinsics.areEqual(this.value, ((InternationalPaymentsCountryConfig) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "InternationalPaymentsCountryConfig(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class InternationalPaymentsCountryNotificationConfig extends Value {
            public final InternationalPaymentsCountryNotificationSyncValue value;

            public InternationalPaymentsCountryNotificationConfig(InternationalPaymentsCountryNotificationSyncValue internationalPaymentsCountryNotificationSyncValue) {
                internationalPaymentsCountryNotificationSyncValue.getClass();
                this.value = internationalPaymentsCountryNotificationSyncValue;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InternationalPaymentsCountryNotificationConfig) && Intrinsics.areEqual(this.value, ((InternationalPaymentsCountryNotificationConfig) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "InternationalPaymentsCountryNotificationConfig(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class InvestAutomatorNotificationSettings extends Value {
            public final NotificationsSettings value;

            public InvestAutomatorNotificationSettings(NotificationsSettings notificationsSettings) {
                notificationsSettings.getClass();
                this.value = notificationsSettings;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InvestAutomatorNotificationSettings) && Intrinsics.areEqual(this.value, ((InvestAutomatorNotificationSettings) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "InvestAutomatorNotificationSettings(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class InvestDividendSetting extends Value {
            public final squareup.cash.investcustomer.syncvalues.InvestDividendSetting value;

            public InvestDividendSetting(squareup.cash.investcustomer.syncvalues.InvestDividendSetting investDividendSetting) {
                investDividendSetting.getClass();
                this.value = investDividendSetting;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InvestDividendSetting) && Intrinsics.areEqual(this.value, ((InvestDividendSetting) obj).value);
            }

            public final squareup.cash.investcustomer.syncvalues.InvestDividendSetting getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "InvestDividendSetting(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class InvestPortfolioState extends Value {
            public final PortfolioState value;

            public InvestPortfolioState(PortfolioState portfolioState) {
                portfolioState.getClass();
                this.value = portfolioState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InvestPortfolioState) && Intrinsics.areEqual(this.value, ((InvestPortfolioState) obj).value);
            }

            public final PortfolioState getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "InvestPortfolioState(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class InvestPortfoliosHistoricalData extends Value {
            public final PortfoliosHistoricalDataValue value;

            public InvestPortfoliosHistoricalData(PortfoliosHistoricalDataValue portfoliosHistoricalDataValue) {
                portfoliosHistoricalDataValue.getClass();
                this.value = portfoliosHistoricalDataValue;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InvestPortfoliosHistoricalData) && Intrinsics.areEqual(this.value, ((InvestPortfoliosHistoricalData) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "InvestPortfoliosHistoricalData(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class InvestPortfoliosPerformance extends Value {
            public final PortfoliosPerformanceValue value;

            public InvestPortfoliosPerformance(PortfoliosPerformanceValue portfoliosPerformanceValue) {
                portfoliosPerformanceValue.getClass();
                this.value = portfoliosPerformanceValue;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InvestPortfoliosPerformance) && Intrinsics.areEqual(this.value, ((InvestPortfoliosPerformance) obj).value);
            }

            public final PortfoliosPerformanceValue getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "InvestPortfoliosPerformance(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class InvestTradingState extends Value {
            public final TradingState value;

            public InvestTradingState(TradingState tradingState) {
                tradingState.getClass();
                this.value = tradingState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InvestTradingState) && Intrinsics.areEqual(this.value, ((InvestTradingState) obj).value);
            }

            public final TradingState getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "InvestTradingState(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class InvestYourPaycheckAutomation extends Value {
            public final UiInvestingAutomation value;

            public InvestYourPaycheckAutomation(UiInvestingAutomation uiInvestingAutomation) {
                uiInvestingAutomation.getClass();
                this.value = uiInvestingAutomation;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InvestYourPaycheckAutomation) && Intrinsics.areEqual(this.value, ((InvestYourPaycheckAutomation) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "InvestYourPaycheckAutomation(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class InvestingAutomation extends Value {
            public final UiInvestingAutomation value;

            public InvestingAutomation(UiInvestingAutomation uiInvestingAutomation) {
                uiInvestingAutomation.getClass();
                this.value = uiInvestingAutomation;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InvestingAutomation) && Intrinsics.areEqual(this.value, ((InvestingAutomation) obj).value);
            }

            public final UiInvestingAutomation getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "InvestingAutomation(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class InvestmentNotificationSettings extends Value {
            public final NotificationsSettings value;

            public InvestmentNotificationSettings(NotificationsSettings notificationsSettings) {
                notificationsSettings.getClass();
                this.value = notificationsSettings;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InvestmentNotificationSettings) && Intrinsics.areEqual(this.value, ((InvestmentNotificationSettings) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "InvestmentNotificationSettings(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class IssuedCard extends Value {
            public final UiIssuedCard value;

            public IssuedCard(UiIssuedCard uiIssuedCard) {
                uiIssuedCard.getClass();
                this.value = uiIssuedCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof IssuedCard) && Intrinsics.areEqual(this.value, ((IssuedCard) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "IssuedCard(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class JurisdictionConfig extends Value {
            public final UiJurisdictionConfig value;

            public JurisdictionConfig(UiJurisdictionConfig uiJurisdictionConfig) {
                uiJurisdictionConfig.getClass();
                this.value = uiJurisdictionConfig;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof JurisdictionConfig) && Intrinsics.areEqual(this.value, ((JurisdictionConfig) obj).value);
            }

            public final UiJurisdictionConfig getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "JurisdictionConfig(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class KgooseGlobalUserSettings extends Value {
            public final CashGlobalUserSettings value;

            public KgooseGlobalUserSettings(CashGlobalUserSettings cashGlobalUserSettings) {
                cashGlobalUserSettings.getClass();
                this.value = cashGlobalUserSettings;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof KgooseGlobalUserSettings) && Intrinsics.areEqual(this.value, ((KgooseGlobalUserSettings) obj).value);
            }

            public final CashGlobalUserSettings getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "KgooseGlobalUserSettings(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class KgooseUserSettings extends Value {
            public final CashUserSettings value;

            public KgooseUserSettings(CashUserSettings cashUserSettings) {
                cashUserSettings.getClass();
                this.value = cashUserSettings;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof KgooseUserSettings) && Intrinsics.areEqual(this.value, ((KgooseUserSettings) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "KgooseUserSettings(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class LendingInfo extends Value {
            public final com.squareup.protos.lending.sync_values.LendingInfo value;

            public LendingInfo(com.squareup.protos.lending.sync_values.LendingInfo lendingInfo) {
                lendingInfo.getClass();
                this.value = lendingInfo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LendingInfo) && Intrinsics.areEqual(this.value, ((LendingInfo) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "LendingInfo(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class LimitsPageletInlineMessage extends Value {
            public final com.squareup.protos.franklin.ui.LimitsPageletInlineMessage value;

            public LimitsPageletInlineMessage(com.squareup.protos.franklin.ui.LimitsPageletInlineMessage limitsPageletInlineMessage) {
                limitsPageletInlineMessage.getClass();
                this.value = limitsPageletInlineMessage;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LimitsPageletInlineMessage) && Intrinsics.areEqual(this.value, ((LimitsPageletInlineMessage) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "LimitsPageletInlineMessage(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class Lions extends Value {
            public final com.squareup.protos.cash.lions.Lions value;

            public Lions(com.squareup.protos.cash.lions.Lions lions) {
                lions.getClass();
                this.value = lions;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Lions) && Intrinsics.areEqual(this.value, ((Lions) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Lions(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class LocalAccount extends Value {
            public final com.squareup.protos.cash.local.client.app.v1.account.LocalAccount value;

            public LocalAccount(com.squareup.protos.cash.local.client.app.v1.account.LocalAccount localAccount) {
                localAccount.getClass();
                this.value = localAccount;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LocalAccount) && Intrinsics.areEqual(this.value, ((LocalAccount) obj).value);
            }

            public final com.squareup.protos.cash.local.client.app.v1.account.LocalAccount getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "LocalAccount(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class LocalCard extends Value {
            public final com.squareup.protos.cash.local.client.app.v1.card.LocalCard value;

            public LocalCard(com.squareup.protos.cash.local.client.app.v1.card.LocalCard localCard) {
                localCard.getClass();
                this.value = localCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LocalCard) && Intrinsics.areEqual(this.value, ((LocalCard) obj).value);
            }

            public final com.squareup.protos.cash.local.client.app.v1.card.LocalCard getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "LocalCard(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class LocalCashBalance extends Value {
            public final com.squareup.protos.cash.local.client.app.v1.cashbalance.LocalCashBalance value;

            public LocalCashBalance(com.squareup.protos.cash.local.client.app.v1.cashbalance.LocalCashBalance localCashBalance) {
                localCashBalance.getClass();
                this.value = localCashBalance;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LocalCashBalance) && Intrinsics.areEqual(this.value, ((LocalCashBalance) obj).value);
            }

            public final com.squareup.protos.cash.local.client.app.v1.cashbalance.LocalCashBalance getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "LocalCashBalance(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class LocalEarningCard extends Value {
            public final com.squareup.protos.cash.local.client.app.v1.account.LocalEarningCard value;

            public LocalEarningCard(com.squareup.protos.cash.local.client.app.v1.account.LocalEarningCard localEarningCard) {
                localEarningCard.getClass();
                this.value = localEarningCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LocalEarningCard) && Intrinsics.areEqual(this.value, ((LocalEarningCard) obj).value);
            }

            public final com.squareup.protos.cash.local.client.app.v1.account.LocalEarningCard getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "LocalEarningCard(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class LocalPosCheckIn extends Value {
            public final LocalPOSCheckIn value;

            public LocalPosCheckIn(LocalPOSCheckIn localPOSCheckIn) {
                localPOSCheckIn.getClass();
                this.value = localPOSCheckIn;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LocalPosCheckIn) && Intrinsics.areEqual(this.value, ((LocalPosCheckIn) obj).value);
            }

            public final LocalPOSCheckIn getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "LocalPosCheckIn(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class LoyaltyProfile extends Value {
            public final com.squareup.protos.loyalizer.LoyaltyProfile value;

            public LoyaltyProfile(com.squareup.protos.loyalizer.LoyaltyProfile loyaltyProfile) {
                loyaltyProfile.getClass();
                this.value = loyaltyProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoyaltyProfile) && Intrinsics.areEqual(this.value, ((LoyaltyProfile) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "LoyaltyProfile(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class Marketing extends Value {
            public final UiMarketing value;

            public Marketing(UiMarketing uiMarketing) {
                uiMarketing.getClass();
                this.value = uiMarketing;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Marketing) && Intrinsics.areEqual(this.value, ((Marketing) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Marketing(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class MoneyTab extends Value {
            public final com.squareup.protos.cash.money.content.MoneyTab value;

            public MoneyTab(com.squareup.protos.cash.money.content.MoneyTab moneyTab) {
                moneyTab.getClass();
                this.value = moneyTab;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MoneyTab) && Intrinsics.areEqual(this.value, ((MoneyTab) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "MoneyTab(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class MultiInstrumentLinkingOptions extends Value {
            public final com.squareup.protos.franklin.common.MultiInstrumentLinkingOptions value;

            public MultiInstrumentLinkingOptions(com.squareup.protos.franklin.common.MultiInstrumentLinkingOptions multiInstrumentLinkingOptions) {
                multiInstrumentLinkingOptions.getClass();
                this.value = multiInstrumentLinkingOptions;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MultiInstrumentLinkingOptions) && Intrinsics.areEqual(this.value, ((MultiInstrumentLinkingOptions) obj).value);
            }

            public final com.squareup.protos.franklin.common.MultiInstrumentLinkingOptions getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "MultiInstrumentLinkingOptions(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class NotificationPreference extends Value {
            public final UiNotificationPreference value;

            public NotificationPreference(UiNotificationPreference uiNotificationPreference) {
                uiNotificationPreference.getClass();
                this.value = uiNotificationPreference;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NotificationPreference) && Intrinsics.areEqual(this.value, ((NotificationPreference) obj).value);
            }

            public final UiNotificationPreference getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "NotificationPreference(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class NotificationSettings extends Value {
            public final UiNotificationSettings value;

            public NotificationSettings(UiNotificationSettings uiNotificationSettings) {
                uiNotificationSettings.getClass();
                this.value = uiNotificationSettings;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NotificationSettings) && Intrinsics.areEqual(this.value, ((NotificationSettings) obj).value);
            }

            public final UiNotificationSettings getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "NotificationSettings(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class OfferCustomerPreference extends Value {
            public final com.squareup.protos.cash.offerdex.sync.OfferCustomerPreference value;

            public OfferCustomerPreference(com.squareup.protos.cash.offerdex.sync.OfferCustomerPreference offerCustomerPreference) {
                offerCustomerPreference.getClass();
                this.value = offerCustomerPreference;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OfferCustomerPreference) && Intrinsics.areEqual(this.value, ((OfferCustomerPreference) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "OfferCustomerPreference(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class OtpInfo extends Value {
            public final OTPInfo value;

            public OtpInfo(OTPInfo oTPInfo) {
                oTPInfo.getClass();
                this.value = oTPInfo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OtpInfo) && Intrinsics.areEqual(this.value, ((OtpInfo) obj).value);
            }

            public final OTPInfo getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "OtpInfo(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class OverdraftStatus extends Value {
            public final squareup.cash.overdraft.OverdraftStatus value;

            public OverdraftStatus(squareup.cash.overdraft.OverdraftStatus overdraftStatus) {
                overdraftStatus.getClass();
                this.value = overdraftStatus;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OverdraftStatus) && Intrinsics.areEqual(this.value, ((OverdraftStatus) obj).value);
            }

            public final squareup.cash.overdraft.OverdraftStatus getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "OverdraftStatus(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class OverdraftUsage extends Value {
            public final squareup.cash.overdraft.OverdraftUsage value;

            public OverdraftUsage(squareup.cash.overdraft.OverdraftUsage overdraftUsage) {
                overdraftUsage.getClass();
                this.value = overdraftUsage;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OverdraftUsage) && Intrinsics.areEqual(this.value, ((OverdraftUsage) obj).value);
            }

            public final squareup.cash.overdraft.OverdraftUsage getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "OverdraftUsage(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class P2pAllowlistCustomer extends Value {
            public final P2PAllowListCustomer value;

            public P2pAllowlistCustomer(P2PAllowListCustomer p2PAllowListCustomer) {
                p2PAllowListCustomer.getClass();
                this.value = p2PAllowListCustomer;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof P2pAllowlistCustomer) && Intrinsics.areEqual(this.value, ((P2pAllowlistCustomer) obj).value);
            }

            public final P2PAllowListCustomer getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "P2pAllowlistCustomer(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class P2pControl extends Value {
            public final P2PControl value;

            public P2pControl(P2PControl p2PControl) {
                p2PControl.getClass();
                this.value = p2PControl;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof P2pControl) && Intrinsics.areEqual(this.value, ((P2pControl) obj).value);
            }

            public final P2PControl getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "P2pControl(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class P2pSettings extends Value {
            public final UiP2pSettings value;

            public P2pSettings(UiP2pSettings uiP2pSettings) {
                uiP2pSettings.getClass();
                this.value = uiP2pSettings;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof P2pSettings) && Intrinsics.areEqual(this.value, ((P2pSettings) obj).value);
            }

            public final UiP2pSettings getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "P2pSettings(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class PaperCashDepositEligibility extends Value {
            public final com.squareup.protos.papermate.PaperCashDepositEligibility value;

            public PaperCashDepositEligibility(com.squareup.protos.papermate.PaperCashDepositEligibility paperCashDepositEligibility) {
                paperCashDepositEligibility.getClass();
                this.value = paperCashDepositEligibility;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PaperCashDepositEligibility) && Intrinsics.areEqual(this.value, ((PaperCashDepositEligibility) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "PaperCashDepositEligibility(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class PasskeyOptions extends Value {
            public final com.squareup.protos.access.sync_values.PasskeyOptions value;

            public PasskeyOptions(com.squareup.protos.access.sync_values.PasskeyOptions passkeyOptions) {
                passkeyOptions.getClass();
                this.value = passkeyOptions;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PasskeyOptions) && Intrinsics.areEqual(this.value, ((PasskeyOptions) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "PasskeyOptions(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class PasswordInfo extends Value {
            public final com.squareup.protos.access.sync_values.PasswordInfo value;

            public PasswordInfo(com.squareup.protos.access.sync_values.PasswordInfo passwordInfo) {
                passwordInfo.getClass();
                this.value = passwordInfo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PasswordInfo) && Intrinsics.areEqual(this.value, ((PasswordInfo) obj).value);
            }

            public final com.squareup.protos.access.sync_values.PasswordInfo getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "PasswordInfo(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class PaycheckAllocationDistribution extends Value {
            public final AllocationDistribution value;

            public PaycheckAllocationDistribution(AllocationDistribution allocationDistribution) {
                allocationDistribution.getClass();
                this.value = allocationDistribution;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PaycheckAllocationDistribution) && Intrinsics.areEqual(this.value, ((PaycheckAllocationDistribution) obj).value);
            }

            public final AllocationDistribution getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "PaycheckAllocationDistribution(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class PaychecksUiConfiguration extends Value {
            public final UiConfiguration value;

            public PaychecksUiConfiguration(UiConfiguration uiConfiguration) {
                uiConfiguration.getClass();
                this.value = uiConfiguration;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PaychecksUiConfiguration) && Intrinsics.areEqual(this.value, ((PaychecksUiConfiguration) obj).value);
            }

            public final UiConfiguration getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "PaychecksUiConfiguration(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class PaychecksUiState extends Value {
            public final UiState value;

            public PaychecksUiState(UiState uiState) {
                uiState.getClass();
                this.value = uiState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PaychecksUiState) && Intrinsics.areEqual(this.value, ((PaychecksUiState) obj).value);
            }

            public final UiState getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "PaychecksUiState(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class PaymentDevicePresentation extends Value {
            public final com.squareup.protos.cash.whimsicard.syncentity.PaymentDevicePresentation value;

            public PaymentDevicePresentation(com.squareup.protos.cash.whimsicard.syncentity.PaymentDevicePresentation paymentDevicePresentation) {
                paymentDevicePresentation.getClass();
                this.value = paymentDevicePresentation;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PaymentDevicePresentation) && Intrinsics.areEqual(this.value, ((PaymentDevicePresentation) obj).value);
            }

            public final com.squareup.protos.cash.whimsicard.syncentity.PaymentDevicePresentation getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "PaymentDevicePresentation(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class PersonalInfoCtaBanner extends Value {
            public final PersonalInfoCTABanner value;

            public PersonalInfoCtaBanner(PersonalInfoCTABanner personalInfoCTABanner) {
                personalInfoCTABanner.getClass();
                this.value = personalInfoCTABanner;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PersonalInfoCtaBanner) && Intrinsics.areEqual(this.value, ((PersonalInfoCtaBanner) obj).value);
            }

            public final PersonalInfoCTABanner getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "PersonalInfoCtaBanner(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class PhonePlanApplet extends Value {
            public final VersionedPhonePlanApplet value;

            public PhonePlanApplet(VersionedPhonePlanApplet versionedPhonePlanApplet) {
                versionedPhonePlanApplet.getClass();
                this.value = versionedPhonePlanApplet;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PhonePlanApplet) && Intrinsics.areEqual(this.value, ((PhonePlanApplet) obj).value);
            }

            public final VersionedPhonePlanApplet getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "PhonePlanApplet(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class PrepurchaseCashCardData extends Value {
            public final com.squareup.lending.sync_values.PrepurchaseCashCardData value;

            public PrepurchaseCashCardData(com.squareup.lending.sync_values.PrepurchaseCashCardData prepurchaseCashCardData) {
                prepurchaseCashCardData.getClass();
                this.value = prepurchaseCashCardData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PrepurchaseCashCardData) && Intrinsics.areEqual(this.value, ((PrepurchaseCashCardData) obj).value);
            }

            public final com.squareup.lending.sync_values.PrepurchaseCashCardData getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "PrepurchaseCashCardData(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class ProfileAlias extends Value {
            public final com.squareup.protos.franklin.common.ProfileAlias value;

            public ProfileAlias(com.squareup.protos.franklin.common.ProfileAlias profileAlias) {
                profileAlias.getClass();
                this.value = profileAlias;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ProfileAlias) && Intrinsics.areEqual(this.value, ((ProfileAlias) obj).value);
            }

            public final com.squareup.protos.franklin.common.ProfileAlias getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "ProfileAlias(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class ProfileDetails extends Value {
            public final com.squareup.protos.cash.profiles.ProfileDetails value;

            public ProfileDetails(com.squareup.protos.cash.profiles.ProfileDetails profileDetails) {
                profileDetails.getClass();
                this.value = profileDetails;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ProfileDetails) && Intrinsics.areEqual(this.value, ((ProfileDetails) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "ProfileDetails(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class ProfilePageUpsellComponent extends Value {
            public final com.squareup.protos.franklin.ui.ProfilePageUpsellComponent value;

            public ProfilePageUpsellComponent(com.squareup.protos.franklin.ui.ProfilePageUpsellComponent profilePageUpsellComponent) {
                profilePageUpsellComponent.getClass();
                this.value = profilePageUpsellComponent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ProfilePageUpsellComponent) && Intrinsics.areEqual(this.value, ((ProfilePageUpsellComponent) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "ProfilePageUpsellComponent(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class ProfilePageUpsellComponentV2 extends Value {
            public final com.squareup.cash.idv.ProfilePageUpsellComponentV2 value;

            public ProfilePageUpsellComponentV2(com.squareup.cash.idv.ProfilePageUpsellComponentV2 profilePageUpsellComponentV2) {
                profilePageUpsellComponentV2.getClass();
                this.value = profilePageUpsellComponentV2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ProfilePageUpsellComponentV2) && Intrinsics.areEqual(this.value, ((ProfilePageUpsellComponentV2) obj).value);
            }

            public final com.squareup.cash.idv.ProfilePageUpsellComponentV2 getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "ProfilePageUpsellComponentV2(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class ProfilePageUpsellConfiguration extends Value {
            public final ProfileUpsellConfiguration value;

            public ProfilePageUpsellConfiguration(ProfileUpsellConfiguration profileUpsellConfiguration) {
                profileUpsellConfiguration.getClass();
                this.value = profileUpsellConfiguration;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ProfilePageUpsellConfiguration) && Intrinsics.areEqual(this.value, ((ProfilePageUpsellConfiguration) obj).value);
            }

            public final ProfileUpsellConfiguration getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "ProfilePageUpsellConfiguration(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class PublicProfile extends Value {
            public final UiPublicProfile value;

            public PublicProfile(UiPublicProfile uiPublicProfile) {
                uiPublicProfile.getClass();
                this.value = uiPublicProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PublicProfile) && Intrinsics.areEqual(this.value, ((PublicProfile) obj).value);
            }

            public final UiPublicProfile getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "PublicProfile(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class Rabbits extends Value {
            public final com.squareup.protos.cash.rabbits.Rabbits value;

            public Rabbits(com.squareup.protos.cash.rabbits.Rabbits rabbits) {
                rabbits.getClass();
                this.value = rabbits;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Rabbits) && Intrinsics.areEqual(this.value, ((Rabbits) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Rabbits(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class ReactionsAvailable extends Value {
            public final AvailableReactions value;

            public ReactionsAvailable(AvailableReactions availableReactions) {
                availableReactions.getClass();
                this.value = availableReactions;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ReactionsAvailable) && Intrinsics.areEqual(this.value, ((ReactionsAvailable) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "ReactionsAvailable(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class RecipientSuggestions extends Value {
            public final com.squareup.protos.cash.recipientsuggestion.RecipientSuggestions value;

            public RecipientSuggestions(com.squareup.protos.cash.recipientsuggestion.RecipientSuggestions recipientSuggestions) {
                recipientSuggestions.getClass();
                this.value = recipientSuggestions;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RecipientSuggestions) && Intrinsics.areEqual(this.value, ((RecipientSuggestions) obj).value);
            }

            public final com.squareup.protos.cash.recipientsuggestion.RecipientSuggestions getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "RecipientSuggestions(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class RestrictionsData extends Value {
            public final com.squareup.cash.crow.sync_values.RestrictionsData value;

            public RestrictionsData(com.squareup.cash.crow.sync_values.RestrictionsData restrictionsData) {
                restrictionsData.getClass();
                this.value = restrictionsData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RestrictionsData) && Intrinsics.areEqual(this.value, ((RestrictionsData) obj).value);
            }

            public final com.squareup.cash.crow.sync_values.RestrictionsData getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "RestrictionsData(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class SavingsApplet extends Value {
            public final squareup.cash.savings.SavingsApplet value;

            public SavingsApplet(squareup.cash.savings.SavingsApplet savingsApplet) {
                savingsApplet.getClass();
                this.value = savingsApplet;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SavingsApplet) && Intrinsics.areEqual(this.value, ((SavingsApplet) obj).value);
            }

            public final squareup.cash.savings.SavingsApplet getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "SavingsApplet(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class SavingsConfig extends Value {
            public final squareup.cash.savings.SavingsConfig value;

            public SavingsConfig(squareup.cash.savings.SavingsConfig savingsConfig) {
                savingsConfig.getClass();
                this.value = savingsConfig;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SavingsConfig) && Intrinsics.areEqual(this.value, ((SavingsConfig) obj).value);
            }

            public final squareup.cash.savings.SavingsConfig getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "SavingsConfig(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class SavingsExternalElements extends Value {
            public final squareup.cash.savings.SavingsExternalElements value;

            public SavingsExternalElements(squareup.cash.savings.SavingsExternalElements savingsExternalElements) {
                savingsExternalElements.getClass();
                this.value = savingsExternalElements;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SavingsExternalElements) && Intrinsics.areEqual(this.value, ((SavingsExternalElements) obj).value);
            }

            public final squareup.cash.savings.SavingsExternalElements getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "SavingsExternalElements(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class SavingsFolder extends Value {
            public final squareup.cash.savings.SavingsFolder value;

            public SavingsFolder(squareup.cash.savings.SavingsFolder savingsFolder) {
                savingsFolder.getClass();
                this.value = savingsFolder;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SavingsFolder) && Intrinsics.areEqual(this.value, ((SavingsFolder) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "SavingsFolder(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class SavingsFolders extends Value {
            public final VersionedSavingsFolders value;

            public SavingsFolders(VersionedSavingsFolders versionedSavingsFolders) {
                versionedSavingsFolders.getClass();
                this.value = versionedSavingsFolders;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SavingsFolders) && Intrinsics.areEqual(this.value, ((SavingsFolders) obj).value);
            }

            public final VersionedSavingsFolders getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "SavingsFolders(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class SavingsHome extends Value {
            public final squareup.cash.savings.SavingsHome value;

            public SavingsHome(squareup.cash.savings.SavingsHome savingsHome) {
                savingsHome.getClass();
                this.value = savingsHome;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SavingsHome) && Intrinsics.areEqual(this.value, ((SavingsHome) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "SavingsHome(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class SavingsScreens extends Value {
            public final VersionedSavingsScreens value;

            public SavingsScreens(VersionedSavingsScreens versionedSavingsScreens) {
                versionedSavingsScreens.getClass();
                this.value = versionedSavingsScreens;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SavingsScreens) && Intrinsics.areEqual(this.value, ((SavingsScreens) obj).value);
            }

            public final VersionedSavingsScreens getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "SavingsScreens(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class ScenarioPlan extends Value {
            public final ScenarioPlanEntry value;

            public ScenarioPlan(ScenarioPlanEntry scenarioPlanEntry) {
                scenarioPlanEntry.getClass();
                this.value = scenarioPlanEntry;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ScenarioPlan) && Intrinsics.areEqual(this.value, ((ScenarioPlan) obj).value);
            }

            public final ScenarioPlanEntry getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "ScenarioPlan(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class ScheduledPayments extends Value {
            public final UiScheduledPayments value;

            public ScheduledPayments(UiScheduledPayments uiScheduledPayments) {
                uiScheduledPayments.getClass();
                this.value = uiScheduledPayments;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ScheduledPayments) && Intrinsics.areEqual(this.value, ((ScheduledPayments) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "ScheduledPayments(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class SchemaVersions extends Value {
            public final SyncValueSchemaVersions value;

            public SchemaVersions(SyncValueSchemaVersions syncValueSchemaVersions) {
                syncValueSchemaVersions.getClass();
                this.value = syncValueSchemaVersions;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SchemaVersions) && Intrinsics.areEqual(this.value, ((SchemaVersions) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "SchemaVersions(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class Scheme extends Value {
            public final com.squareup.protos.cash.postcard.CardScheme value;

            public Scheme(com.squareup.protos.cash.postcard.CardScheme cardScheme) {
                cardScheme.getClass();
                this.value = cardScheme;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Scheme) && Intrinsics.areEqual(this.value, ((Scheme) obj).value);
            }

            public final com.squareup.protos.cash.postcard.CardScheme getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Scheme(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class ShippingAddress extends Value {
            public final SyncShippingAddress value;

            public ShippingAddress(SyncShippingAddress syncShippingAddress) {
                syncShippingAddress.getClass();
                this.value = syncShippingAddress;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShippingAddress) && Intrinsics.areEqual(this.value, ((ShippingAddress) obj).value);
            }

            public final SyncShippingAddress getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "ShippingAddress(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class SponsorshipCryptoAuthorization extends Value {
            public final com.squareup.cash.cryptocurrency.SponsorshipCryptoAuthorization value;

            public SponsorshipCryptoAuthorization(com.squareup.cash.cryptocurrency.SponsorshipCryptoAuthorization sponsorshipCryptoAuthorization) {
                sponsorshipCryptoAuthorization.getClass();
                this.value = sponsorshipCryptoAuthorization;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SponsorshipCryptoAuthorization) && Intrinsics.areEqual(this.value, ((SponsorshipCryptoAuthorization) obj).value);
            }

            public final com.squareup.cash.cryptocurrency.SponsorshipCryptoAuthorization getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "SponsorshipCryptoAuthorization(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class StatusAndLimits extends Value {
            public final UiStatusAndLimits value;

            public StatusAndLimits(UiStatusAndLimits uiStatusAndLimits) {
                uiStatusAndLimits.getClass();
                this.value = uiStatusAndLimits;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StatusAndLimits) && Intrinsics.areEqual(this.value, ((StatusAndLimits) obj).value);
            }

            public final UiStatusAndLimits getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "StatusAndLimits(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class SupOffersTabCreditLine extends Value {
            public final com.squareup.protos.lending.sync_values.SupOffersTabCreditLine value;

            public SupOffersTabCreditLine(com.squareup.protos.lending.sync_values.SupOffersTabCreditLine supOffersTabCreditLine) {
                supOffersTabCreditLine.getClass();
                this.value = supOffersTabCreditLine;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SupOffersTabCreditLine) && Intrinsics.areEqual(this.value, ((SupOffersTabCreditLine) obj).value);
            }

            public final com.squareup.protos.lending.sync_values.SupOffersTabCreditLine getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "SupOffersTabCreditLine(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class SupportPhoneConfirmation extends Value {
            public final com.squareup.protos.cash.cashvoice.syncentity.v1.SupportPhoneConfirmation value;

            public SupportPhoneConfirmation(com.squareup.protos.cash.cashvoice.syncentity.v1.SupportPhoneConfirmation supportPhoneConfirmation) {
                supportPhoneConfirmation.getClass();
                this.value = supportPhoneConfirmation;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SupportPhoneConfirmation) && Intrinsics.areEqual(this.value, ((SupportPhoneConfirmation) obj).value);
            }

            public final com.squareup.protos.cash.cashvoice.syncentity.v1.SupportPhoneConfirmation getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "SupportPhoneConfirmation(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class TagThemeDefinitions extends Value {
            public final com.squareup.protos.cash.taply.syncvalues.TagThemeDefinitions value;

            public TagThemeDefinitions(com.squareup.protos.cash.taply.syncvalues.TagThemeDefinitions tagThemeDefinitions) {
                tagThemeDefinitions.getClass();
                this.value = tagThemeDefinitions;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TagThemeDefinitions) && Intrinsics.areEqual(this.value, ((TagThemeDefinitions) obj).value);
            }

            public final com.squareup.protos.cash.taply.syncvalues.TagThemeDefinitions getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "TagThemeDefinitions(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class TapToPayDescriptionSuggestions extends Value {
            public final com.squareup.protos.cash.cashbusinessaccounts.TapToPayDescriptionSuggestions value;

            public TapToPayDescriptionSuggestions(com.squareup.protos.cash.cashbusinessaccounts.TapToPayDescriptionSuggestions tapToPayDescriptionSuggestions) {
                tapToPayDescriptionSuggestions.getClass();
                this.value = tapToPayDescriptionSuggestions;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TapToPayDescriptionSuggestions) && Intrinsics.areEqual(this.value, ((TapToPayDescriptionSuggestions) obj).value);
            }

            public final com.squareup.protos.cash.cashbusinessaccounts.TapToPayDescriptionSuggestions getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "TapToPayDescriptionSuggestions(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class TaxUpgrade extends Value {
            public final UiTaxUpgrade value;

            public TaxUpgrade(UiTaxUpgrade uiTaxUpgrade) {
                uiTaxUpgrade.getClass();
                this.value = uiTaxUpgrade;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaxUpgrade) && Intrinsics.areEqual(this.value, ((TaxUpgrade) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "TaxUpgrade(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class Tigers extends Value {
            public final com.squareup.protos.cash.tigers.Tigers value;

            public Tigers(com.squareup.protos.cash.tigers.Tigers tigers) {
                tigers.getClass();
                this.value = tigers;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Tigers) && Intrinsics.areEqual(this.value, ((Tigers) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Tigers(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class TransactionActivityConfig extends Value {
            public final com.squareup.protos.cash.transactionwriter.config.TransactionActivityConfig value;

            public TransactionActivityConfig(com.squareup.protos.cash.transactionwriter.config.TransactionActivityConfig transactionActivityConfig) {
                transactionActivityConfig.getClass();
                this.value = transactionActivityConfig;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TransactionActivityConfig) && Intrinsics.areEqual(this.value, ((TransactionActivityConfig) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "TransactionActivityConfig(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class TrustedContact extends Value {
            public final SyncTrustedContact value;

            public TrustedContact(SyncTrustedContact syncTrustedContact) {
                syncTrustedContact.getClass();
                this.value = syncTrustedContact;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TrustedContact) && Intrinsics.areEqual(this.value, ((TrustedContact) obj).value);
            }

            public final SyncTrustedContact getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "TrustedContact(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class Wallet extends Value {
            public final com.squareup.protos.cash.cryptocurrency.Wallet value;

            public Wallet(com.squareup.protos.cash.cryptocurrency.Wallet wallet) {
                wallet.getClass();
                this.value = wallet;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Wallet) && Intrinsics.areEqual(this.value, ((Wallet) obj).value);
            }

            public final com.squareup.protos.cash.cryptocurrency.Wallet getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Wallet(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class WiresAccountInfo extends Value {
            public final squareup.cash.wires.WiresAccountInfo value;

            public WiresAccountInfo(squareup.cash.wires.WiresAccountInfo wiresAccountInfo) {
                wiresAccountInfo.getClass();
                this.value = wiresAccountInfo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof WiresAccountInfo) && Intrinsics.areEqual(this.value, ((WiresAccountInfo) obj).value);
            }

            public final squareup.cash.wires.WiresAccountInfo getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "WiresAccountInfo(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class WiresEligibilityState extends Value {
            public final com.squareup.protos.wiremate.WiresEligibilityState value;

            public WiresEligibilityState(com.squareup.protos.wiremate.WiresEligibilityState wiresEligibilityState) {
                wiresEligibilityState.getClass();
                this.value = wiresEligibilityState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof WiresEligibilityState) && Intrinsics.areEqual(this.value, ((WiresEligibilityState) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "WiresEligibilityState(value=" + this.value + ")";
            }
        }

        public static ResourceEvent.Device fromJsonObject(JsonObject jsonObject) {
            int i;
            ArrayList arrayList;
            JsonArray asJsonArray;
            String asString;
            try {
                JsonElement jsonElement = jsonObject.get("type");
                if (jsonElement != null && (asString = jsonElement.getAsString()) != null) {
                    for (int i2 : CameraSelector$$ExternalSyntheticOutline0.values(7)) {
                        if (ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$13(i2).equals(asString)) {
                            i = i2;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
                i = 0;
                JsonElement jsonElement2 = jsonObject.get("name");
                String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                JsonElement jsonElement3 = jsonObject.get("model");
                String asString3 = jsonElement3 != null ? jsonElement3.getAsString() : null;
                JsonElement jsonElement4 = jsonObject.get("brand");
                String asString4 = jsonElement4 != null ? jsonElement4.getAsString() : null;
                JsonElement jsonElement5 = jsonObject.get("architecture");
                String asString5 = jsonElement5 != null ? jsonElement5.getAsString() : null;
                JsonElement jsonElement6 = jsonObject.get("locale");
                String asString6 = jsonElement6 != null ? jsonElement6.getAsString() : null;
                JsonElement jsonElement7 = jsonObject.get("locales");
                if (jsonElement7 == null || (asJsonArray = jsonElement7.getAsJsonArray()) == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList(asJsonArray.size());
                    Iterator<JsonElement> it = asJsonArray.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(it.next().getAsString());
                    }
                    arrayList = arrayList2;
                }
                JsonElement jsonElement8 = jsonObject.get("time_zone");
                String asString7 = jsonElement8 != null ? jsonElement8.getAsString() : null;
                JsonElement jsonElement9 = jsonObject.get("battery_level");
                Number asNumber = jsonElement9 != null ? jsonElement9.getAsNumber() : null;
                JsonElement jsonElement10 = jsonObject.get("power_saving_mode");
                Boolean valueOf = jsonElement10 != null ? Boolean.valueOf(jsonElement10.getAsBoolean()) : null;
                JsonElement jsonElement11 = jsonObject.get("brightness_level");
                return new ResourceEvent.Device(i, asString2, asString3, asString4, asString5, asString6, arrayList, asString7, asNumber, valueOf, jsonElement11 != null ? jsonElement11.getAsNumber() : null);
            } catch (IllegalStateException e) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Device", e);
                return null;
            } catch (NullPointerException e2) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Device", e2);
                return null;
            } catch (NumberFormatException e3) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Device", e3);
                return null;
            }
        }

        public static EmptyList getDeepLinkSpecs() {
            return ClientRoute.ViewSupportPhone.deepLinkSpecs;
        }
    }

    static {
        SyncValue$Companion$ADAPTER$1 syncValue$Companion$ADAPTER$1 = new SyncValue$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncValue.class), "type.googleapis.com/squareup.franklin.SyncValue", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
        ADAPTER = syncValue$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncValue$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncValue(SyncValueType syncValueType, Value value, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1393type = syncValueType;
        this.value = value;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncValue)) {
            return false;
        }
        SyncValue syncValue = (SyncValue) obj;
        return Intrinsics.areEqual(unknownFields(), syncValue.unknownFields()) && this.f1393type == syncValue.f1393type && Intrinsics.areEqual(this.value, syncValue.value);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SyncValueType syncValueType = this.f1393type;
        int hashCode2 = (hashCode + (syncValueType != null ? syncValueType.hashCode() : 0)) * 37;
        Value value = this.value;
        int hashCode3 = hashCode2 + (value != null ? value.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(21);
        builder.f1372android = this.f1393type;
        builder.ios = this.value;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        SyncValueType syncValueType = this.f1393type;
        if (syncValueType != null) {
            arrayList.add("type=" + syncValueType);
        }
        Value value = this.value;
        if (value != null) {
            arrayList.add("value=" + value);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncValue{", "}", 0, null, null, 56);
    }

    public /* synthetic */ SyncValue(Value.InvestPortfoliosPerformance investPortfoliosPerformance) {
        this(SyncValueType.INVEST_PORTFOLIOS_PERFORMANCE, investPortfoliosPerformance, ByteString.EMPTY);
    }
}
