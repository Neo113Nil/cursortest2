package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.commerce.CommerceOrderRenderData;
import com.squareup.protos.cash.local.activity.CashAppLocalOrderRenderData;
import com.squareup.protos.cash.local.activity.CashAppLocalPaymentRenderData;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.pay.CashAppPayOrderRenderData;
import com.squareup.protos.cash.pay.CashAppPayPaymentRenderData;
import com.squareup.protos.cash.pay.CashAppPayPaymentScheduleRenderData;
import com.squareup.protos.cash.pay.CashAppPayPayoutRenderData;
import com.squareup.protos.cash.pay.CashAppPayRefundRenderData;
import com.squareup.protos.cash.pay.CashAppPayRenderData;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.DepositPreference;
import com.squareup.protos.franklin.api.Instrument;
import com.squareup.protos.franklin.api.Payment$CancellationReason;
import com.squareup.protos.franklin.api.Payment$State;
import com.squareup.protos.franklin.api.RatePlan;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.protos.franklin.data.ExplicitConfirmationReason;
import com.squareup.protos.franklin.investing.resources.CustomOrder;
import com.squareup.protos.franklin.ui.RequestRefundReason;
import com.squareup.protos.franklin.ui.ScenarioPlanMap;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PaymentRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaymentRenderData> CREATOR;
    public final AchRenderData ach_render_data;
    public final ActivityRowRenderData activity_row_render_data;
    public final ActivityScope activity_scope;
    public final ActivityToken activity_token;
    public final AfterPayRenderData afterpay_render_data;
    public final Money amount;
    public final String auth_token;
    public final AutoAllocationRenderData auto_allocation_render_data;
    public final List balance_impacts;
    public final BillPayRenderData bill_pay_render_data;
    public final BitcoinLightningRenderData bitcoin_lightning_render_data;
    public final BitcoinOnchainRenderData bitcoin_onchain_render_data;
    public final Money boost_amount;
    public final Long boost_basis_points;
    public final String btc_limit;
    public final String caller_customer_token;
    public final Boolean can_unlock_free_atm_status;
    public final Payment$CancellationReason cancellation_reason;
    public final Long captured_at;
    public final CashAppLocalOrderRenderData cash_app_local_order_render_data;
    public final CashAppLocalPaymentRenderData cash_app_local_payment_render_data;
    public final CashAppPayOrderRenderData cash_app_pay_order_render_data;
    public final CashAppPayPaymentRenderData cash_app_pay_payment_render_data;
    public final CashAppPayPaymentScheduleRenderData cash_app_pay_payment_schedule_render_data;
    public final CashAppPayPayoutRenderData cash_app_pay_payout_render_data;
    public final CashAppPayRefundRenderData cash_app_pay_refund_render_data;
    public final CashAppPayRenderData cash_app_pay_render_data;
    public final CashAppTagRenderData cash_app_tag_render_data;
    public final CashLiteCardTransactionRenderData cash_lite_card_transaction_render_data;
    public final CheckDepositRenderData check_deposit_render_data;
    public final String check_reference_token;
    public final String client_display_name;
    public final CommerceOrderRenderData commerce_order_render_data;
    public final Long counterparty_viewed_at;
    public final CouponActivityRenderData coupon_activity_render_data;
    public final Long created_at;
    public final CrossCurrencyRewardInfo cross_currency_reward_info;
    public final CryptoOrderRenderData crypto_order_render_data;
    public final String crypto_transfer_status;
    public final Money current_balance;
    public final CustomerAdjustmentRenderData customer_adjustment_render_data;
    public final List days_of_period;
    public final Long deposit_instantly_valid_until;
    public final DepositPreference deposit_preference;
    public final Long deposited_at;
    public final Long display_date;
    public final String display_instrument;
    public final DisputedTransactionRenderData disputed_transaction_render_data;
    public final String estimated_withdrawal_date;
    public final ExplicitConfirmationReason explicit_confirmation_reason;
    public final Long failed_at;
    public final FeatureInvitationRenderData feature_invitation_render_data;
    public final Money fee_amount;
    public final FeeAmounts fee_amounts;
    public final FiatP2pRenderData fiat_p2p_render_data;
    public final RecurringSchedule.Frequency frequency;
    public final GenericNonPaymentRenderData generic_non_payment_render_data;
    public final GiftCardRenderData gift_card_render_data;
    public final GroupActivityRenderData group_activity_render_data;
    public final Boolean has_error_context;
    public final List hidden_receipt_buttons;
    public final Boolean idv_in_progress;
    public final Money impact;
    public final Boolean in_cash_boost_experiment;
    public final InstantPayRenderData instant_pay_render_data;
    public final Instrument instrument;
    public final CashInstrumentType instrument_type;
    public final InvestCorrectionRenderData invest_correction_render_data;
    public final InvestPaymentRenderData invest_payment_render_data;
    public final InvestingAutomationExecutionRenderData investing_automation_execution_render_data;
    public final InvestingAutomationTriggerRenderData investing_automation_trigger_render_data;
    public final Boolean is_app_purchase;
    public final Boolean is_background;
    public final Boolean is_banking_transaction;
    public final Boolean is_bitcoin_transaction;
    public final Boolean is_deposit_reversal;
    public final Boolean is_prefunded_transfer;
    public final Boolean is_pwc_payment;
    public final Boolean is_recurring;
    public final Boolean is_scheduled_payment;
    public final Boolean is_scheduled_reload;
    public final Boolean is_send_to_cashtag_oct;
    public final Boolean is_transfer;
    public final LendingCardRenderData lending_card_render_data;
    public final LendingRenderData lending_render_data;
    public final LiftedRestrictionTransferRenderData lifted_restriction_transfer_render_data;
    public final LocalizableString localizable_note;
    public final LoyaltyActivityRenderData loyalty_activity_render_data;
    public final String movement_exchange_rate;
    public final NewDeviceLoginRenderData new_device_login_render_data;
    public final String note;
    public final Orientation orientation;
    public final Long outstanding_until;
    public final OverdraftRenderData overdraft_render_data;
    public final P2pPoolContributionRenderData p2p_pool_contribution_render_data;
    public final P2pPoolMemberRenderData p2p_pool_member_render_data;
    public final P2pPoolRenderData p2p_pool_render_data;
    public final Long paid_out_at;
    public final PaperCashDepositRenderData paper_cash_deposit_render_data;
    public final Long passed_customer_at;
    public final PaymentPlanEligibilityRenderData payment_plan_eligibility_render_data;
    public final PendingReferralRenderData pending_referral_render_data;
    public final PersonalizationRenderData personalization_render_data;
    public final Money pull_amount;
    public final Money push_amount;
    public final RatePlan rate_plan;
    public final String raw_merchant_descriptor;
    public final Long reached_customer_at;
    public final ReactionRenderData reaction_data;
    public final String receipt_token;
    public final Money recipient_payment_amount_in_default_currency;
    public final RecurringTransferRenderData recurring_transfer_render_data;
    public final Money refund_amount;
    public final Payment$CancellationReason refund_cancellation_reason;
    public final Long refund_deposited_at;
    public final Long refund_request_declined_at;
    public final Long refund_request_expires_at;
    public final Long refund_requested_at;
    public final Long refunded_at;
    public final Boolean refunded_to_balance;
    public final ReimbursedAmounts reimbursed_amounts;
    public final RemittancePaymentRenderData remittance_payment_render_data;
    public final Long request_refund_available_until;
    public final RequestRefundReason request_refund_reason;
    public final RestrictedCashInTransferRenderData restricted_cash_in_transfer_render_data;
    public final Money reward_amount;
    public final Long reward_basis_points;
    public final Role role;
    public final SavingsInterestPaymentRenderData savings_interest_payment_render_data;
    public final SavingsTransferRenderData savings_transfer_render_data;
    public final ScenarioPlan scenario_plan;
    public final ScenarioPlanMap scenario_plan_map;
    public final Long scheduled_for;
    public final Country sender_country;
    public final Money sender_payment_amount_in_default_currency;
    public final Boolean sent_via_imessage;
    public final Boolean sent_via_watch;
    public final Money settled_amount;
    public final SponsoredAccountRenderData sponsored_account_render_data;
    public final StablecoinRenderData stablecoin_render_data;
    public final Payment$State state;
    public final Long supports_reporting_boost_until;
    public final Long supports_reporting_missing_reward_until;
    public final String target_wallet_address;
    public final TimelineRenderData timeline_render_data;
    public final String token;
    public final TransactionAmountHistory transaction_amount_history;
    public final TransactionAuthRenderData transaction_auth_render_data;
    public final String transaction_id;
    public final String transaction_reason_code;
    public final TTPPaymentRenderData ttp_payment_render_data;
    public final Boolean verification_required;
    public final ViewContextRenderData view_context_render_data;
    public final Boolean will_refund_to_balance;

    public final class Builder extends Message.Builder {
        public AchRenderData ach_render_data;
        public ActivityRowRenderData activity_row_render_data;
        public ActivityScope activity_scope;
        public ActivityToken activity_token;
        public AfterPayRenderData afterpay_render_data;
        public Money amount;
        public String auth_token;
        public AutoAllocationRenderData auto_allocation_render_data;
        public List balance_impacts;
        public BillPayRenderData bill_pay_render_data;
        public BitcoinLightningRenderData bitcoin_lightning_render_data;
        public BitcoinOnchainRenderData bitcoin_onchain_render_data;
        public Money boost_amount;
        public Long boost_basis_points;
        public String btc_limit;
        public String caller_customer_token;
        public Boolean can_unlock_free_atm_status;
        public Payment$CancellationReason cancellation_reason;
        public Long captured_at;
        public CashAppLocalOrderRenderData cash_app_local_order_render_data;
        public CashAppLocalPaymentRenderData cash_app_local_payment_render_data;
        public CashAppPayOrderRenderData cash_app_pay_order_render_data;
        public CashAppPayPaymentRenderData cash_app_pay_payment_render_data;
        public CashAppPayPaymentScheduleRenderData cash_app_pay_payment_schedule_render_data;
        public CashAppPayPayoutRenderData cash_app_pay_payout_render_data;
        public CashAppPayRefundRenderData cash_app_pay_refund_render_data;
        public CashAppPayRenderData cash_app_pay_render_data;
        public CashAppTagRenderData cash_app_tag_render_data;
        public CashLiteCardTransactionRenderData cash_lite_card_transaction_render_data;
        public CheckDepositRenderData check_deposit_render_data;
        public String check_reference_token;
        public String client_display_name;
        public CommerceOrderRenderData commerce_order_render_data;
        public Long counterparty_viewed_at;
        public CouponActivityRenderData coupon_activity_render_data;
        public Long created_at;
        public CrossCurrencyRewardInfo cross_currency_reward_info;
        public CryptoOrderRenderData crypto_order_render_data;
        public String crypto_transfer_status;
        public Money current_balance;
        public CustomerAdjustmentRenderData customer_adjustment_render_data;
        public List days_of_period;
        public Long deposit_instantly_valid_until;
        public DepositPreference deposit_preference;
        public Long deposited_at;
        public Long display_date;
        public String display_instrument;
        public DisputedTransactionRenderData disputed_transaction_render_data;
        public String estimated_withdrawal_date;
        public ExplicitConfirmationReason explicit_confirmation_reason;
        public Long failed_at;
        public FeatureInvitationRenderData feature_invitation_render_data;
        public Money fee_amount;
        public FeeAmounts fee_amounts;
        public FiatP2pRenderData fiat_p2p_render_data;
        public RecurringSchedule.Frequency frequency;
        public GenericNonPaymentRenderData generic_non_payment_render_data;
        public GiftCardRenderData gift_card_render_data;
        public GroupActivityRenderData group_activity_render_data;
        public Boolean has_error_context;
        public List hidden_receipt_buttons;
        public Boolean idv_in_progress;
        public Money impact;
        public Boolean in_cash_boost_experiment;
        public InstantPayRenderData instant_pay_render_data;
        public Instrument instrument;
        public CashInstrumentType instrument_type;
        public InvestCorrectionRenderData invest_correction_render_data;
        public InvestPaymentRenderData invest_payment_render_data;
        public InvestingAutomationExecutionRenderData investing_automation_execution_render_data;
        public InvestingAutomationTriggerRenderData investing_automation_trigger_render_data;
        public Boolean is_app_purchase;
        public Boolean is_background;
        public Boolean is_banking_transaction;
        public Boolean is_bitcoin_transaction;
        public Boolean is_deposit_reversal;
        public Boolean is_prefunded_transfer;
        public Boolean is_pwc_payment;
        public Boolean is_recurring;
        public Boolean is_scheduled_payment;
        public Boolean is_scheduled_reload;
        public Boolean is_send_to_cashtag_oct;
        public Boolean is_transfer;
        public LendingCardRenderData lending_card_render_data;
        public LendingRenderData lending_render_data;
        public LiftedRestrictionTransferRenderData lifted_restriction_transfer_render_data;
        public LocalizableString localizable_note;
        public LoyaltyActivityRenderData loyalty_activity_render_data;
        public String movement_exchange_rate;
        public NewDeviceLoginRenderData new_device_login_render_data;
        public String note;
        public Orientation orientation;
        public Long outstanding_until;
        public OverdraftRenderData overdraft_render_data;
        public P2pPoolContributionRenderData p2p_pool_contribution_render_data;
        public P2pPoolMemberRenderData p2p_pool_member_render_data;
        public P2pPoolRenderData p2p_pool_render_data;
        public Long paid_out_at;
        public PaperCashDepositRenderData paper_cash_deposit_render_data;
        public Long passed_customer_at;
        public PaymentPlanEligibilityRenderData payment_plan_eligibility_render_data;
        public PendingReferralRenderData pending_referral_render_data;
        public PersonalizationRenderData personalization_render_data;
        public Money pull_amount;
        public Money push_amount;
        public RatePlan rate_plan;
        public String raw_merchant_descriptor;
        public Long reached_customer_at;
        public ReactionRenderData reaction_data;
        public String receipt_token;
        public Money recipient_payment_amount_in_default_currency;
        public RecurringTransferRenderData recurring_transfer_render_data;
        public Money refund_amount;
        public Payment$CancellationReason refund_cancellation_reason;
        public Long refund_deposited_at;
        public Long refund_request_declined_at;
        public Long refund_request_expires_at;
        public Long refund_requested_at;
        public Long refunded_at;
        public Boolean refunded_to_balance;
        public ReimbursedAmounts reimbursed_amounts;
        public RemittancePaymentRenderData remittance_payment_render_data;
        public Long request_refund_available_until;
        public RequestRefundReason request_refund_reason;
        public RestrictedCashInTransferRenderData restricted_cash_in_transfer_render_data;
        public Money reward_amount;
        public Long reward_basis_points;
        public Role role;
        public SavingsInterestPaymentRenderData savings_interest_payment_render_data;
        public SavingsTransferRenderData savings_transfer_render_data;
        public ScenarioPlan scenario_plan;
        public ScenarioPlanMap scenario_plan_map;
        public Long scheduled_for;
        public Country sender_country;
        public Money sender_payment_amount_in_default_currency;
        public Boolean sent_via_imessage;
        public Boolean sent_via_watch;
        public Money settled_amount;
        public SponsoredAccountRenderData sponsored_account_render_data;
        public StablecoinRenderData stablecoin_render_data;
        public Payment$State state;
        public Long supports_reporting_boost_until;
        public Long supports_reporting_missing_reward_until;
        public String target_wallet_address;
        public TimelineRenderData timeline_render_data;
        public String token;
        public TransactionAmountHistory transaction_amount_history;
        public TransactionAuthRenderData transaction_auth_render_data;
        public String transaction_id;
        public String transaction_reason_code;
        public TTPPaymentRenderData ttp_payment_render_data;
        public Boolean verification_required;
        public ViewContextRenderData view_context_render_data;
        public Boolean will_refund_to_balance;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.hidden_receipt_buttons = emptyList;
            this.days_of_period = emptyList;
            this.balance_impacts = emptyList;
        }

        @Override // com.squareup.wire.Message.Builder
        public final PaymentRenderData build() {
            return new PaymentRenderData(this.token, this.auth_token, this.receipt_token, this.orientation, this.role, this.rate_plan, this.amount, this.pull_amount, this.push_amount, this.sender_payment_amount_in_default_currency, this.recipient_payment_amount_in_default_currency, this.fee_amount, this.refund_amount, this.reward_amount, this.reward_basis_points, this.boost_amount, this.settled_amount, this.boost_basis_points, this.state, this.cancellation_reason, this.refund_cancellation_reason, this.client_display_name, this.note, this.sent_via_watch, this.sent_via_imessage, this.display_instrument, this.instrument_type, this.transaction_id, this.created_at, this.captured_at, this.reached_customer_at, this.passed_customer_at, this.paid_out_at, this.deposited_at, this.refunded_at, this.refund_deposited_at, this.refund_request_expires_at, this.failed_at, this.display_date, this.scenario_plan, this.scenario_plan_map, this.is_transfer, this.is_prefunded_transfer, this.estimated_withdrawal_date, this.is_banking_transaction, this.is_scheduled_payment, this.is_pwc_payment, this.scheduled_for, this.deposit_preference, this.deposit_instantly_valid_until, this.transaction_reason_code, this.supports_reporting_missing_reward_until, this.instrument, this.target_wallet_address, this.hidden_receipt_buttons, this.supports_reporting_boost_until, this.in_cash_boost_experiment, this.is_scheduled_reload, this.refunded_to_balance, this.reaction_data, this.verification_required, this.idv_in_progress, this.fee_amounts, this.will_refund_to_balance, this.crypto_transfer_status, this.is_bitcoin_transaction, this.can_unlock_free_atm_status, this.reimbursed_amounts, this.movement_exchange_rate, this.sender_country, this.lending_render_data, this.is_app_purchase, this.refund_requested_at, this.refund_request_declined_at, this.request_refund_available_until, this.request_refund_reason, this.frequency, this.days_of_period, this.check_reference_token, this.pending_referral_render_data, this.explicit_confirmation_reason, this.btc_limit, this.cross_currency_reward_info, this.loyalty_activity_render_data, this.invest_payment_render_data, this.transaction_amount_history, this.outstanding_until, this.crypto_order_render_data, this.paper_cash_deposit_render_data, this.sponsored_account_render_data, this.instant_pay_render_data, this.gift_card_render_data, this.new_device_login_render_data, this.timeline_render_data, this.disputed_transaction_render_data, this.investing_automation_trigger_render_data, this.investing_automation_execution_render_data, this.afterpay_render_data, this.cash_app_pay_order_render_data, this.cash_app_pay_payment_render_data, this.cash_app_pay_refund_render_data, this.cash_app_pay_payment_schedule_render_data, this.cash_app_pay_payout_render_data, this.commerce_order_render_data, this.cash_app_pay_render_data, this.view_context_render_data, this.generic_non_payment_render_data, this.savings_transfer_render_data, this.savings_interest_payment_render_data, this.remittance_payment_render_data, this.group_activity_render_data, this.caller_customer_token, this.activity_token, this.activity_scope, this.transaction_auth_render_data, this.balance_impacts, this.coupon_activity_render_data, this.invest_correction_render_data, this.fiat_p2p_render_data, this.check_deposit_render_data, this.localizable_note, this.overdraft_render_data, this.payment_plan_eligibility_render_data, this.feature_invitation_render_data, this.ttp_payment_render_data, this.personalization_render_data, this.auto_allocation_render_data, this.bill_pay_render_data, this.is_background, this.has_error_context, this.is_recurring, this.bitcoin_onchain_render_data, this.is_deposit_reversal, this.lending_card_render_data, this.raw_merchant_descriptor, this.cash_app_local_payment_render_data, this.cash_app_local_order_render_data, this.ach_render_data, this.bitcoin_lightning_render_data, this.p2p_pool_render_data, this.p2p_pool_member_render_data, this.activity_row_render_data, this.impact, this.current_balance, this.p2p_pool_contribution_render_data, this.customer_adjustment_render_data, this.stablecoin_render_data, this.recurring_transfer_render_data, this.lifted_restriction_transfer_render_data, this.restricted_cash_in_transfer_render_data, this.cash_app_tag_render_data, this.counterparty_viewed_at, this.cash_lite_card_transaction_render_data, this.is_send_to_cashtag_oct, buildUnknownFields());
        }
    }

    public final class CrossCurrencyRewardInfo extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CrossCurrencyRewardInfo> CREATOR;
        public final Money reward_amount;
        public final Money reward_exchange_rate;
        public final String reward_transaction_token;

        static {
            PaymentRenderData$CrossCurrencyRewardInfo$Companion$ADAPTER$1 paymentRenderData$CrossCurrencyRewardInfo$Companion$ADAPTER$1 = new PaymentRenderData$CrossCurrencyRewardInfo$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CrossCurrencyRewardInfo.class), "type.googleapis.com/squareup.franklin.PaymentRenderData.CrossCurrencyRewardInfo", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = paymentRenderData$CrossCurrencyRewardInfo$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(paymentRenderData$CrossCurrencyRewardInfo$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CrossCurrencyRewardInfo(Money money, Money money2, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.reward_amount = money;
            this.reward_exchange_rate = money2;
            this.reward_transaction_token = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CrossCurrencyRewardInfo)) {
                return false;
            }
            CrossCurrencyRewardInfo crossCurrencyRewardInfo = (CrossCurrencyRewardInfo) obj;
            return Intrinsics.areEqual(unknownFields(), crossCurrencyRewardInfo.unknownFields()) && Intrinsics.areEqual(this.reward_amount, crossCurrencyRewardInfo.reward_amount) && Intrinsics.areEqual(this.reward_exchange_rate, crossCurrencyRewardInfo.reward_exchange_rate) && Intrinsics.areEqual(this.reward_transaction_token, crossCurrencyRewardInfo.reward_transaction_token);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Money money = this.reward_amount;
            int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
            Money money2 = this.reward_exchange_rate;
            int hashCode3 = (hashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
            String str = this.reward_transaction_token;
            int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            CustomOrder.Builder builder = new CustomOrder.Builder(4);
            builder.original_share_price = this.reward_amount;
            builder.target_share_price = this.reward_exchange_rate;
            builder.period_token = this.reward_transaction_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Money money = this.reward_amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("reward_amount=", money, arrayList);
            }
            Money money2 = this.reward_exchange_rate;
            if (money2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("reward_exchange_rate=", money2, arrayList);
            }
            String str = this.reward_transaction_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "reward_transaction_token=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CrossCurrencyRewardInfo{", "}", 0, null, null, 56);
        }
    }

    static {
        PaymentRenderData$Companion$ADAPTER$1 paymentRenderData$Companion$ADAPTER$1 = new PaymentRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaymentRenderData.class), "type.googleapis.com/squareup.franklin.PaymentRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = paymentRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(paymentRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentRenderData(String str, String str2, String str3, Orientation orientation, Role role, RatePlan ratePlan, Money money, Money money2, Money money3, Money money4, Money money5, Money money6, Money money7, Money money8, Long l, Money money9, Money money10, Long l2, Payment$State payment$State, Payment$CancellationReason payment$CancellationReason, Payment$CancellationReason payment$CancellationReason2, String str4, String str5, Boolean bool, Boolean bool2, String str6, CashInstrumentType cashInstrumentType, String str7, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, Long l11, Long l12, Long l13, ScenarioPlan scenarioPlan, ScenarioPlanMap scenarioPlanMap, Boolean bool3, Boolean bool4, String str8, Boolean bool5, Boolean bool6, Boolean bool7, Long l14, DepositPreference depositPreference, Long l15, String str9, Long l16, Instrument instrument, String str10, List list, Long l17, Boolean bool8, Boolean bool9, Boolean bool10, ReactionRenderData reactionRenderData, Boolean bool11, Boolean bool12, FeeAmounts feeAmounts, Boolean bool13, String str11, Boolean bool14, Boolean bool15, ReimbursedAmounts reimbursedAmounts, String str12, Country country, LendingRenderData lendingRenderData, Boolean bool16, Long l18, Long l19, Long l20, RequestRefundReason requestRefundReason, RecurringSchedule.Frequency frequency, List list2, String str13, PendingReferralRenderData pendingReferralRenderData, ExplicitConfirmationReason explicitConfirmationReason, String str14, CrossCurrencyRewardInfo crossCurrencyRewardInfo, LoyaltyActivityRenderData loyaltyActivityRenderData, InvestPaymentRenderData investPaymentRenderData, TransactionAmountHistory transactionAmountHistory, Long l21, CryptoOrderRenderData cryptoOrderRenderData, PaperCashDepositRenderData paperCashDepositRenderData, SponsoredAccountRenderData sponsoredAccountRenderData, InstantPayRenderData instantPayRenderData, GiftCardRenderData giftCardRenderData, NewDeviceLoginRenderData newDeviceLoginRenderData, TimelineRenderData timelineRenderData, DisputedTransactionRenderData disputedTransactionRenderData, InvestingAutomationTriggerRenderData investingAutomationTriggerRenderData, InvestingAutomationExecutionRenderData investingAutomationExecutionRenderData, AfterPayRenderData afterPayRenderData, CashAppPayOrderRenderData cashAppPayOrderRenderData, CashAppPayPaymentRenderData cashAppPayPaymentRenderData, CashAppPayRefundRenderData cashAppPayRefundRenderData, CashAppPayPaymentScheduleRenderData cashAppPayPaymentScheduleRenderData, CashAppPayPayoutRenderData cashAppPayPayoutRenderData, CommerceOrderRenderData commerceOrderRenderData, CashAppPayRenderData cashAppPayRenderData, ViewContextRenderData viewContextRenderData, GenericNonPaymentRenderData genericNonPaymentRenderData, SavingsTransferRenderData savingsTransferRenderData, SavingsInterestPaymentRenderData savingsInterestPaymentRenderData, RemittancePaymentRenderData remittancePaymentRenderData, GroupActivityRenderData groupActivityRenderData, String str15, ActivityToken activityToken, ActivityScope activityScope, TransactionAuthRenderData transactionAuthRenderData, List list3, CouponActivityRenderData couponActivityRenderData, InvestCorrectionRenderData investCorrectionRenderData, FiatP2pRenderData fiatP2pRenderData, CheckDepositRenderData checkDepositRenderData, LocalizableString localizableString, OverdraftRenderData overdraftRenderData, PaymentPlanEligibilityRenderData paymentPlanEligibilityRenderData, FeatureInvitationRenderData featureInvitationRenderData, TTPPaymentRenderData tTPPaymentRenderData, PersonalizationRenderData personalizationRenderData, AutoAllocationRenderData autoAllocationRenderData, BillPayRenderData billPayRenderData, Boolean bool17, Boolean bool18, Boolean bool19, BitcoinOnchainRenderData bitcoinOnchainRenderData, Boolean bool20, LendingCardRenderData lendingCardRenderData, String str16, CashAppLocalPaymentRenderData cashAppLocalPaymentRenderData, CashAppLocalOrderRenderData cashAppLocalOrderRenderData, AchRenderData achRenderData, BitcoinLightningRenderData bitcoinLightningRenderData, P2pPoolRenderData p2pPoolRenderData, P2pPoolMemberRenderData p2pPoolMemberRenderData, ActivityRowRenderData activityRowRenderData, Money money11, Money money12, P2pPoolContributionRenderData p2pPoolContributionRenderData, CustomerAdjustmentRenderData customerAdjustmentRenderData, StablecoinRenderData stablecoinRenderData, RecurringTransferRenderData recurringTransferRenderData, LiftedRestrictionTransferRenderData liftedRestrictionTransferRenderData, RestrictedCashInTransferRenderData restrictedCashInTransferRenderData, CashAppTagRenderData cashAppTagRenderData, Long l22, CashLiteCardTransactionRenderData cashLiteCardTransactionRenderData, Boolean bool21, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.token = str;
        this.auth_token = str2;
        this.receipt_token = str3;
        this.orientation = orientation;
        this.role = role;
        this.rate_plan = ratePlan;
        this.amount = money;
        this.pull_amount = money2;
        this.push_amount = money3;
        this.sender_payment_amount_in_default_currency = money4;
        this.recipient_payment_amount_in_default_currency = money5;
        this.fee_amount = money6;
        this.refund_amount = money7;
        this.reward_amount = money8;
        this.reward_basis_points = l;
        this.boost_amount = money9;
        this.settled_amount = money10;
        this.boost_basis_points = l2;
        this.state = payment$State;
        this.cancellation_reason = payment$CancellationReason;
        this.refund_cancellation_reason = payment$CancellationReason2;
        this.client_display_name = str4;
        this.note = str5;
        this.sent_via_watch = bool;
        this.sent_via_imessage = bool2;
        this.display_instrument = str6;
        this.instrument_type = cashInstrumentType;
        this.transaction_id = str7;
        this.created_at = l3;
        this.captured_at = l4;
        this.reached_customer_at = l5;
        this.passed_customer_at = l6;
        this.paid_out_at = l7;
        this.deposited_at = l8;
        this.refunded_at = l9;
        this.refund_deposited_at = l10;
        this.refund_request_expires_at = l11;
        this.failed_at = l12;
        this.display_date = l13;
        this.scenario_plan = scenarioPlan;
        this.scenario_plan_map = scenarioPlanMap;
        this.is_transfer = bool3;
        this.is_prefunded_transfer = bool4;
        this.estimated_withdrawal_date = str8;
        this.is_banking_transaction = bool5;
        this.is_scheduled_payment = bool6;
        this.is_pwc_payment = bool7;
        this.scheduled_for = l14;
        this.deposit_preference = depositPreference;
        this.deposit_instantly_valid_until = l15;
        this.transaction_reason_code = str9;
        this.supports_reporting_missing_reward_until = l16;
        this.instrument = instrument;
        this.target_wallet_address = str10;
        this.supports_reporting_boost_until = l17;
        this.in_cash_boost_experiment = bool8;
        this.is_scheduled_reload = bool9;
        this.refunded_to_balance = bool10;
        this.reaction_data = reactionRenderData;
        this.verification_required = bool11;
        this.idv_in_progress = bool12;
        this.fee_amounts = feeAmounts;
        this.will_refund_to_balance = bool13;
        this.crypto_transfer_status = str11;
        this.is_bitcoin_transaction = bool14;
        this.can_unlock_free_atm_status = bool15;
        this.reimbursed_amounts = reimbursedAmounts;
        this.movement_exchange_rate = str12;
        this.sender_country = country;
        this.lending_render_data = lendingRenderData;
        this.is_app_purchase = bool16;
        this.refund_requested_at = l18;
        this.refund_request_declined_at = l19;
        this.request_refund_available_until = l20;
        this.request_refund_reason = requestRefundReason;
        this.frequency = frequency;
        this.check_reference_token = str13;
        this.pending_referral_render_data = pendingReferralRenderData;
        this.explicit_confirmation_reason = explicitConfirmationReason;
        this.btc_limit = str14;
        this.cross_currency_reward_info = crossCurrencyRewardInfo;
        this.loyalty_activity_render_data = loyaltyActivityRenderData;
        this.invest_payment_render_data = investPaymentRenderData;
        this.transaction_amount_history = transactionAmountHistory;
        this.outstanding_until = l21;
        this.crypto_order_render_data = cryptoOrderRenderData;
        this.paper_cash_deposit_render_data = paperCashDepositRenderData;
        this.sponsored_account_render_data = sponsoredAccountRenderData;
        this.instant_pay_render_data = instantPayRenderData;
        this.gift_card_render_data = giftCardRenderData;
        this.new_device_login_render_data = newDeviceLoginRenderData;
        this.timeline_render_data = timelineRenderData;
        this.disputed_transaction_render_data = disputedTransactionRenderData;
        this.investing_automation_trigger_render_data = investingAutomationTriggerRenderData;
        this.investing_automation_execution_render_data = investingAutomationExecutionRenderData;
        this.afterpay_render_data = afterPayRenderData;
        this.cash_app_pay_order_render_data = cashAppPayOrderRenderData;
        this.cash_app_pay_payment_render_data = cashAppPayPaymentRenderData;
        this.cash_app_pay_refund_render_data = cashAppPayRefundRenderData;
        this.cash_app_pay_payment_schedule_render_data = cashAppPayPaymentScheduleRenderData;
        this.cash_app_pay_payout_render_data = cashAppPayPayoutRenderData;
        this.commerce_order_render_data = commerceOrderRenderData;
        this.cash_app_pay_render_data = cashAppPayRenderData;
        this.view_context_render_data = viewContextRenderData;
        this.generic_non_payment_render_data = genericNonPaymentRenderData;
        this.savings_transfer_render_data = savingsTransferRenderData;
        this.savings_interest_payment_render_data = savingsInterestPaymentRenderData;
        this.remittance_payment_render_data = remittancePaymentRenderData;
        this.group_activity_render_data = groupActivityRenderData;
        this.caller_customer_token = str15;
        this.activity_token = activityToken;
        this.activity_scope = activityScope;
        this.transaction_auth_render_data = transactionAuthRenderData;
        this.coupon_activity_render_data = couponActivityRenderData;
        this.invest_correction_render_data = investCorrectionRenderData;
        this.fiat_p2p_render_data = fiatP2pRenderData;
        this.check_deposit_render_data = checkDepositRenderData;
        this.localizable_note = localizableString;
        this.overdraft_render_data = overdraftRenderData;
        this.payment_plan_eligibility_render_data = paymentPlanEligibilityRenderData;
        this.feature_invitation_render_data = featureInvitationRenderData;
        this.ttp_payment_render_data = tTPPaymentRenderData;
        this.personalization_render_data = personalizationRenderData;
        this.auto_allocation_render_data = autoAllocationRenderData;
        this.bill_pay_render_data = billPayRenderData;
        this.is_background = bool17;
        this.has_error_context = bool18;
        this.is_recurring = bool19;
        this.bitcoin_onchain_render_data = bitcoinOnchainRenderData;
        this.is_deposit_reversal = bool20;
        this.lending_card_render_data = lendingCardRenderData;
        this.raw_merchant_descriptor = str16;
        this.cash_app_local_payment_render_data = cashAppLocalPaymentRenderData;
        this.cash_app_local_order_render_data = cashAppLocalOrderRenderData;
        this.ach_render_data = achRenderData;
        this.bitcoin_lightning_render_data = bitcoinLightningRenderData;
        this.p2p_pool_render_data = p2pPoolRenderData;
        this.p2p_pool_member_render_data = p2pPoolMemberRenderData;
        this.activity_row_render_data = activityRowRenderData;
        this.impact = money11;
        this.current_balance = money12;
        this.p2p_pool_contribution_render_data = p2pPoolContributionRenderData;
        this.customer_adjustment_render_data = customerAdjustmentRenderData;
        this.stablecoin_render_data = stablecoinRenderData;
        this.recurring_transfer_render_data = recurringTransferRenderData;
        this.lifted_restriction_transfer_render_data = liftedRestrictionTransferRenderData;
        this.restricted_cash_in_transfer_render_data = restrictedCashInTransferRenderData;
        this.cash_app_tag_render_data = cashAppTagRenderData;
        this.counterparty_viewed_at = l22;
        this.cash_lite_card_transaction_render_data = cashLiteCardTransactionRenderData;
        this.is_send_to_cashtag_oct = bool21;
        this.hidden_receipt_buttons = TransactorKt.immutableCopyOf("hidden_receipt_buttons", list);
        this.days_of_period = TransactorKt.immutableCopyOf("days_of_period", list2);
        this.balance_impacts = TransactorKt.immutableCopyOf("balance_impacts", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentRenderData)) {
            return false;
        }
        PaymentRenderData paymentRenderData = (PaymentRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), paymentRenderData.unknownFields()) && Intrinsics.areEqual(this.token, paymentRenderData.token) && Intrinsics.areEqual(this.auth_token, paymentRenderData.auth_token) && Intrinsics.areEqual(this.receipt_token, paymentRenderData.receipt_token) && this.orientation == paymentRenderData.orientation && this.role == paymentRenderData.role && this.rate_plan == paymentRenderData.rate_plan && Intrinsics.areEqual(this.amount, paymentRenderData.amount) && Intrinsics.areEqual(this.pull_amount, paymentRenderData.pull_amount) && Intrinsics.areEqual(this.push_amount, paymentRenderData.push_amount) && Intrinsics.areEqual(this.sender_payment_amount_in_default_currency, paymentRenderData.sender_payment_amount_in_default_currency) && Intrinsics.areEqual(this.recipient_payment_amount_in_default_currency, paymentRenderData.recipient_payment_amount_in_default_currency) && Intrinsics.areEqual(this.fee_amount, paymentRenderData.fee_amount) && Intrinsics.areEqual(this.refund_amount, paymentRenderData.refund_amount) && Intrinsics.areEqual(this.reward_amount, paymentRenderData.reward_amount) && Intrinsics.areEqual(this.reward_basis_points, paymentRenderData.reward_basis_points) && Intrinsics.areEqual(this.boost_amount, paymentRenderData.boost_amount) && Intrinsics.areEqual(this.settled_amount, paymentRenderData.settled_amount) && Intrinsics.areEqual(this.boost_basis_points, paymentRenderData.boost_basis_points) && this.state == paymentRenderData.state && this.cancellation_reason == paymentRenderData.cancellation_reason && this.refund_cancellation_reason == paymentRenderData.refund_cancellation_reason && Intrinsics.areEqual(this.client_display_name, paymentRenderData.client_display_name) && Intrinsics.areEqual(this.note, paymentRenderData.note) && Intrinsics.areEqual(this.sent_via_watch, paymentRenderData.sent_via_watch) && Intrinsics.areEqual(this.sent_via_imessage, paymentRenderData.sent_via_imessage) && Intrinsics.areEqual(this.display_instrument, paymentRenderData.display_instrument) && this.instrument_type == paymentRenderData.instrument_type && Intrinsics.areEqual(this.transaction_id, paymentRenderData.transaction_id) && Intrinsics.areEqual(this.created_at, paymentRenderData.created_at) && Intrinsics.areEqual(this.captured_at, paymentRenderData.captured_at) && Intrinsics.areEqual(this.reached_customer_at, paymentRenderData.reached_customer_at) && Intrinsics.areEqual(this.passed_customer_at, paymentRenderData.passed_customer_at) && Intrinsics.areEqual(this.paid_out_at, paymentRenderData.paid_out_at) && Intrinsics.areEqual(this.deposited_at, paymentRenderData.deposited_at) && Intrinsics.areEqual(this.refunded_at, paymentRenderData.refunded_at) && Intrinsics.areEqual(this.refund_deposited_at, paymentRenderData.refund_deposited_at) && Intrinsics.areEqual(this.refund_request_expires_at, paymentRenderData.refund_request_expires_at) && Intrinsics.areEqual(this.failed_at, paymentRenderData.failed_at) && Intrinsics.areEqual(this.display_date, paymentRenderData.display_date) && Intrinsics.areEqual(this.scenario_plan, paymentRenderData.scenario_plan) && Intrinsics.areEqual(this.scenario_plan_map, paymentRenderData.scenario_plan_map) && Intrinsics.areEqual(this.is_transfer, paymentRenderData.is_transfer) && Intrinsics.areEqual(this.is_prefunded_transfer, paymentRenderData.is_prefunded_transfer) && Intrinsics.areEqual(this.estimated_withdrawal_date, paymentRenderData.estimated_withdrawal_date) && Intrinsics.areEqual(this.is_banking_transaction, paymentRenderData.is_banking_transaction) && Intrinsics.areEqual(this.is_scheduled_payment, paymentRenderData.is_scheduled_payment) && Intrinsics.areEqual(this.is_pwc_payment, paymentRenderData.is_pwc_payment) && Intrinsics.areEqual(this.scheduled_for, paymentRenderData.scheduled_for) && this.deposit_preference == paymentRenderData.deposit_preference && Intrinsics.areEqual(this.deposit_instantly_valid_until, paymentRenderData.deposit_instantly_valid_until) && Intrinsics.areEqual(this.transaction_reason_code, paymentRenderData.transaction_reason_code) && Intrinsics.areEqual(this.supports_reporting_missing_reward_until, paymentRenderData.supports_reporting_missing_reward_until) && Intrinsics.areEqual(this.instrument, paymentRenderData.instrument) && Intrinsics.areEqual(this.target_wallet_address, paymentRenderData.target_wallet_address) && Intrinsics.areEqual(this.hidden_receipt_buttons, paymentRenderData.hidden_receipt_buttons) && Intrinsics.areEqual(this.supports_reporting_boost_until, paymentRenderData.supports_reporting_boost_until) && Intrinsics.areEqual(this.in_cash_boost_experiment, paymentRenderData.in_cash_boost_experiment) && Intrinsics.areEqual(this.is_scheduled_reload, paymentRenderData.is_scheduled_reload) && Intrinsics.areEqual(this.refunded_to_balance, paymentRenderData.refunded_to_balance) && Intrinsics.areEqual(this.reaction_data, paymentRenderData.reaction_data) && Intrinsics.areEqual(this.verification_required, paymentRenderData.verification_required) && Intrinsics.areEqual(this.idv_in_progress, paymentRenderData.idv_in_progress) && Intrinsics.areEqual(this.fee_amounts, paymentRenderData.fee_amounts) && Intrinsics.areEqual(this.will_refund_to_balance, paymentRenderData.will_refund_to_balance) && Intrinsics.areEqual(this.crypto_transfer_status, paymentRenderData.crypto_transfer_status) && Intrinsics.areEqual(this.is_bitcoin_transaction, paymentRenderData.is_bitcoin_transaction) && Intrinsics.areEqual(this.can_unlock_free_atm_status, paymentRenderData.can_unlock_free_atm_status) && Intrinsics.areEqual(this.reimbursed_amounts, paymentRenderData.reimbursed_amounts) && Intrinsics.areEqual(this.movement_exchange_rate, paymentRenderData.movement_exchange_rate) && this.sender_country == paymentRenderData.sender_country && Intrinsics.areEqual(this.lending_render_data, paymentRenderData.lending_render_data) && Intrinsics.areEqual(this.is_app_purchase, paymentRenderData.is_app_purchase) && Intrinsics.areEqual(this.refund_requested_at, paymentRenderData.refund_requested_at) && Intrinsics.areEqual(this.refund_request_declined_at, paymentRenderData.refund_request_declined_at) && Intrinsics.areEqual(this.request_refund_available_until, paymentRenderData.request_refund_available_until) && this.request_refund_reason == paymentRenderData.request_refund_reason && this.frequency == paymentRenderData.frequency && Intrinsics.areEqual(this.days_of_period, paymentRenderData.days_of_period) && Intrinsics.areEqual(this.check_reference_token, paymentRenderData.check_reference_token) && Intrinsics.areEqual(this.pending_referral_render_data, paymentRenderData.pending_referral_render_data) && this.explicit_confirmation_reason == paymentRenderData.explicit_confirmation_reason && Intrinsics.areEqual(this.btc_limit, paymentRenderData.btc_limit) && Intrinsics.areEqual(this.cross_currency_reward_info, paymentRenderData.cross_currency_reward_info) && Intrinsics.areEqual(this.loyalty_activity_render_data, paymentRenderData.loyalty_activity_render_data) && Intrinsics.areEqual(this.invest_payment_render_data, paymentRenderData.invest_payment_render_data) && Intrinsics.areEqual(this.transaction_amount_history, paymentRenderData.transaction_amount_history) && Intrinsics.areEqual(this.outstanding_until, paymentRenderData.outstanding_until) && Intrinsics.areEqual(this.crypto_order_render_data, paymentRenderData.crypto_order_render_data) && Intrinsics.areEqual(this.paper_cash_deposit_render_data, paymentRenderData.paper_cash_deposit_render_data) && Intrinsics.areEqual(this.sponsored_account_render_data, paymentRenderData.sponsored_account_render_data) && Intrinsics.areEqual(this.instant_pay_render_data, paymentRenderData.instant_pay_render_data) && Intrinsics.areEqual(this.gift_card_render_data, paymentRenderData.gift_card_render_data) && Intrinsics.areEqual(this.new_device_login_render_data, paymentRenderData.new_device_login_render_data) && Intrinsics.areEqual(this.timeline_render_data, paymentRenderData.timeline_render_data) && Intrinsics.areEqual(this.disputed_transaction_render_data, paymentRenderData.disputed_transaction_render_data) && Intrinsics.areEqual(this.investing_automation_trigger_render_data, paymentRenderData.investing_automation_trigger_render_data) && Intrinsics.areEqual(this.investing_automation_execution_render_data, paymentRenderData.investing_automation_execution_render_data) && Intrinsics.areEqual(this.afterpay_render_data, paymentRenderData.afterpay_render_data) && Intrinsics.areEqual(this.cash_app_pay_order_render_data, paymentRenderData.cash_app_pay_order_render_data) && Intrinsics.areEqual(this.cash_app_pay_payment_render_data, paymentRenderData.cash_app_pay_payment_render_data) && Intrinsics.areEqual(this.cash_app_pay_refund_render_data, paymentRenderData.cash_app_pay_refund_render_data) && Intrinsics.areEqual(this.cash_app_pay_payment_schedule_render_data, paymentRenderData.cash_app_pay_payment_schedule_render_data) && Intrinsics.areEqual(this.cash_app_pay_payout_render_data, paymentRenderData.cash_app_pay_payout_render_data) && Intrinsics.areEqual(this.commerce_order_render_data, paymentRenderData.commerce_order_render_data) && Intrinsics.areEqual(this.cash_app_pay_render_data, paymentRenderData.cash_app_pay_render_data) && Intrinsics.areEqual(this.view_context_render_data, paymentRenderData.view_context_render_data) && Intrinsics.areEqual(this.generic_non_payment_render_data, paymentRenderData.generic_non_payment_render_data) && Intrinsics.areEqual(this.savings_transfer_render_data, paymentRenderData.savings_transfer_render_data) && Intrinsics.areEqual(this.savings_interest_payment_render_data, paymentRenderData.savings_interest_payment_render_data) && Intrinsics.areEqual(this.remittance_payment_render_data, paymentRenderData.remittance_payment_render_data) && Intrinsics.areEqual(this.group_activity_render_data, paymentRenderData.group_activity_render_data) && Intrinsics.areEqual(this.caller_customer_token, paymentRenderData.caller_customer_token) && Intrinsics.areEqual(this.activity_token, paymentRenderData.activity_token) && this.activity_scope == paymentRenderData.activity_scope && Intrinsics.areEqual(this.transaction_auth_render_data, paymentRenderData.transaction_auth_render_data) && Intrinsics.areEqual(this.balance_impacts, paymentRenderData.balance_impacts) && Intrinsics.areEqual(this.coupon_activity_render_data, paymentRenderData.coupon_activity_render_data) && Intrinsics.areEqual(this.invest_correction_render_data, paymentRenderData.invest_correction_render_data) && Intrinsics.areEqual(this.fiat_p2p_render_data, paymentRenderData.fiat_p2p_render_data) && Intrinsics.areEqual(this.check_deposit_render_data, paymentRenderData.check_deposit_render_data) && Intrinsics.areEqual(this.localizable_note, paymentRenderData.localizable_note) && Intrinsics.areEqual(this.overdraft_render_data, paymentRenderData.overdraft_render_data) && Intrinsics.areEqual(this.payment_plan_eligibility_render_data, paymentRenderData.payment_plan_eligibility_render_data) && Intrinsics.areEqual(this.feature_invitation_render_data, paymentRenderData.feature_invitation_render_data) && Intrinsics.areEqual(this.ttp_payment_render_data, paymentRenderData.ttp_payment_render_data) && Intrinsics.areEqual(this.personalization_render_data, paymentRenderData.personalization_render_data) && Intrinsics.areEqual(this.auto_allocation_render_data, paymentRenderData.auto_allocation_render_data) && Intrinsics.areEqual(this.bill_pay_render_data, paymentRenderData.bill_pay_render_data) && Intrinsics.areEqual(this.is_background, paymentRenderData.is_background) && Intrinsics.areEqual(this.has_error_context, paymentRenderData.has_error_context) && Intrinsics.areEqual(this.is_recurring, paymentRenderData.is_recurring) && Intrinsics.areEqual(this.bitcoin_onchain_render_data, paymentRenderData.bitcoin_onchain_render_data) && Intrinsics.areEqual(this.is_deposit_reversal, paymentRenderData.is_deposit_reversal) && Intrinsics.areEqual(this.lending_card_render_data, paymentRenderData.lending_card_render_data) && Intrinsics.areEqual(this.raw_merchant_descriptor, paymentRenderData.raw_merchant_descriptor) && Intrinsics.areEqual(this.cash_app_local_payment_render_data, paymentRenderData.cash_app_local_payment_render_data) && Intrinsics.areEqual(this.cash_app_local_order_render_data, paymentRenderData.cash_app_local_order_render_data) && Intrinsics.areEqual(this.ach_render_data, paymentRenderData.ach_render_data) && Intrinsics.areEqual(this.bitcoin_lightning_render_data, paymentRenderData.bitcoin_lightning_render_data) && Intrinsics.areEqual(this.p2p_pool_render_data, paymentRenderData.p2p_pool_render_data) && Intrinsics.areEqual(this.p2p_pool_member_render_data, paymentRenderData.p2p_pool_member_render_data) && Intrinsics.areEqual(this.activity_row_render_data, paymentRenderData.activity_row_render_data) && Intrinsics.areEqual(this.impact, paymentRenderData.impact) && Intrinsics.areEqual(this.current_balance, paymentRenderData.current_balance) && Intrinsics.areEqual(this.p2p_pool_contribution_render_data, paymentRenderData.p2p_pool_contribution_render_data) && Intrinsics.areEqual(this.customer_adjustment_render_data, paymentRenderData.customer_adjustment_render_data) && Intrinsics.areEqual(this.stablecoin_render_data, paymentRenderData.stablecoin_render_data) && Intrinsics.areEqual(this.recurring_transfer_render_data, paymentRenderData.recurring_transfer_render_data) && Intrinsics.areEqual(this.lifted_restriction_transfer_render_data, paymentRenderData.lifted_restriction_transfer_render_data) && Intrinsics.areEqual(this.restricted_cash_in_transfer_render_data, paymentRenderData.restricted_cash_in_transfer_render_data) && Intrinsics.areEqual(this.cash_app_tag_render_data, paymentRenderData.cash_app_tag_render_data) && Intrinsics.areEqual(this.counterparty_viewed_at, paymentRenderData.counterparty_viewed_at) && Intrinsics.areEqual(this.cash_lite_card_transaction_render_data, paymentRenderData.cash_lite_card_transaction_render_data) && Intrinsics.areEqual(this.is_send_to_cashtag_oct, paymentRenderData.is_send_to_cashtag_oct);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.auth_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.receipt_token;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Orientation orientation = this.orientation;
        int hashCode5 = (hashCode4 + (orientation != null ? orientation.hashCode() : 0)) * 37;
        Role role = this.role;
        int hashCode6 = (hashCode5 + (role != null ? role.hashCode() : 0)) * 37;
        RatePlan ratePlan = this.rate_plan;
        int hashCode7 = (hashCode6 + (ratePlan != null ? ratePlan.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode8 = (hashCode7 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.pull_amount;
        int hashCode9 = (hashCode8 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.push_amount;
        int hashCode10 = (hashCode9 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Money money4 = this.sender_payment_amount_in_default_currency;
        int hashCode11 = (hashCode10 + (money4 != null ? money4.hashCode() : 0)) * 37;
        Money money5 = this.recipient_payment_amount_in_default_currency;
        int hashCode12 = (hashCode11 + (money5 != null ? money5.hashCode() : 0)) * 37;
        Money money6 = this.fee_amount;
        int hashCode13 = (hashCode12 + (money6 != null ? money6.hashCode() : 0)) * 37;
        Money money7 = this.refund_amount;
        int hashCode14 = (hashCode13 + (money7 != null ? money7.hashCode() : 0)) * 37;
        Money money8 = this.reward_amount;
        int hashCode15 = (hashCode14 + (money8 != null ? money8.hashCode() : 0)) * 37;
        Long l = this.reward_basis_points;
        int hashCode16 = (hashCode15 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Money money9 = this.boost_amount;
        int hashCode17 = (hashCode16 + (money9 != null ? money9.hashCode() : 0)) * 37;
        Money money10 = this.settled_amount;
        int hashCode18 = (hashCode17 + (money10 != null ? money10.hashCode() : 0)) * 37;
        Long l2 = this.boost_basis_points;
        int hashCode19 = (hashCode18 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Payment$State payment$State = this.state;
        int hashCode20 = (hashCode19 + (payment$State != null ? payment$State.hashCode() : 0)) * 37;
        Payment$CancellationReason payment$CancellationReason = this.cancellation_reason;
        int hashCode21 = (hashCode20 + (payment$CancellationReason != null ? payment$CancellationReason.hashCode() : 0)) * 37;
        Payment$CancellationReason payment$CancellationReason2 = this.refund_cancellation_reason;
        int hashCode22 = (hashCode21 + (payment$CancellationReason2 != null ? payment$CancellationReason2.hashCode() : 0)) * 37;
        String str4 = this.client_display_name;
        int hashCode23 = (hashCode22 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.note;
        int hashCode24 = (hashCode23 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Boolean bool = this.sent_via_watch;
        int hashCode25 = (hashCode24 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.sent_via_imessage;
        int hashCode26 = (hashCode25 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        String str6 = this.display_instrument;
        int hashCode27 = (hashCode26 + (str6 != null ? str6.hashCode() : 0)) * 37;
        CashInstrumentType cashInstrumentType = this.instrument_type;
        int hashCode28 = (hashCode27 + (cashInstrumentType != null ? cashInstrumentType.hashCode() : 0)) * 37;
        String str7 = this.transaction_id;
        int hashCode29 = (hashCode28 + (str7 != null ? str7.hashCode() : 0)) * 37;
        Long l3 = this.created_at;
        int hashCode30 = (hashCode29 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        Long l4 = this.captured_at;
        int hashCode31 = (hashCode30 + (l4 != null ? Long.hashCode(l4.longValue()) : 0)) * 37;
        Long l5 = this.reached_customer_at;
        int hashCode32 = (hashCode31 + (l5 != null ? Long.hashCode(l5.longValue()) : 0)) * 37;
        Long l6 = this.passed_customer_at;
        int hashCode33 = (hashCode32 + (l6 != null ? Long.hashCode(l6.longValue()) : 0)) * 37;
        Long l7 = this.paid_out_at;
        int hashCode34 = (hashCode33 + (l7 != null ? Long.hashCode(l7.longValue()) : 0)) * 37;
        Long l8 = this.deposited_at;
        int hashCode35 = (hashCode34 + (l8 != null ? Long.hashCode(l8.longValue()) : 0)) * 37;
        Long l9 = this.refunded_at;
        int hashCode36 = (hashCode35 + (l9 != null ? Long.hashCode(l9.longValue()) : 0)) * 37;
        Long l10 = this.refund_deposited_at;
        int hashCode37 = (hashCode36 + (l10 != null ? Long.hashCode(l10.longValue()) : 0)) * 37;
        Long l11 = this.refund_request_expires_at;
        int hashCode38 = (hashCode37 + (l11 != null ? Long.hashCode(l11.longValue()) : 0)) * 37;
        Long l12 = this.failed_at;
        int hashCode39 = (hashCode38 + (l12 != null ? Long.hashCode(l12.longValue()) : 0)) * 37;
        Long l13 = this.display_date;
        int hashCode40 = (hashCode39 + (l13 != null ? Long.hashCode(l13.longValue()) : 0)) * 37;
        ScenarioPlan scenarioPlan = this.scenario_plan;
        int hashCode41 = (hashCode40 + (scenarioPlan != null ? scenarioPlan.hashCode() : 0)) * 37;
        ScenarioPlanMap scenarioPlanMap = this.scenario_plan_map;
        int hashCode42 = (hashCode41 + (scenarioPlanMap != null ? scenarioPlanMap.hashCode() : 0)) * 37;
        Boolean bool3 = this.is_transfer;
        int hashCode43 = (hashCode42 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        Boolean bool4 = this.is_prefunded_transfer;
        int hashCode44 = (hashCode43 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0)) * 37;
        String str8 = this.estimated_withdrawal_date;
        int hashCode45 = (hashCode44 + (str8 != null ? str8.hashCode() : 0)) * 37;
        Boolean bool5 = this.is_banking_transaction;
        int hashCode46 = (hashCode45 + (bool5 != null ? Boolean.hashCode(bool5.booleanValue()) : 0)) * 37;
        Boolean bool6 = this.is_scheduled_payment;
        int hashCode47 = (hashCode46 + (bool6 != null ? Boolean.hashCode(bool6.booleanValue()) : 0)) * 37;
        Boolean bool7 = this.is_pwc_payment;
        int hashCode48 = (hashCode47 + (bool7 != null ? Boolean.hashCode(bool7.booleanValue()) : 0)) * 37;
        Long l14 = this.scheduled_for;
        int hashCode49 = (hashCode48 + (l14 != null ? Long.hashCode(l14.longValue()) : 0)) * 37;
        DepositPreference depositPreference = this.deposit_preference;
        int hashCode50 = (hashCode49 + (depositPreference != null ? depositPreference.hashCode() : 0)) * 37;
        Long l15 = this.deposit_instantly_valid_until;
        int hashCode51 = (hashCode50 + (l15 != null ? Long.hashCode(l15.longValue()) : 0)) * 37;
        String str9 = this.transaction_reason_code;
        int hashCode52 = (hashCode51 + (str9 != null ? str9.hashCode() : 0)) * 37;
        Long l16 = this.supports_reporting_missing_reward_until;
        int hashCode53 = (hashCode52 + (l16 != null ? Long.hashCode(l16.longValue()) : 0)) * 37;
        Instrument instrument = this.instrument;
        int hashCode54 = (hashCode53 + (instrument != null ? instrument.hashCode() : 0)) * 37;
        String str10 = this.target_wallet_address;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode54 + (str10 != null ? str10.hashCode() : 0)) * 37, 37, this.hidden_receipt_buttons);
        Long l17 = this.supports_reporting_boost_until;
        int hashCode55 = (m + (l17 != null ? Long.hashCode(l17.longValue()) : 0)) * 37;
        Boolean bool8 = this.in_cash_boost_experiment;
        int hashCode56 = (hashCode55 + (bool8 != null ? Boolean.hashCode(bool8.booleanValue()) : 0)) * 37;
        Boolean bool9 = this.is_scheduled_reload;
        int hashCode57 = (hashCode56 + (bool9 != null ? Boolean.hashCode(bool9.booleanValue()) : 0)) * 37;
        Boolean bool10 = this.refunded_to_balance;
        int hashCode58 = (hashCode57 + (bool10 != null ? Boolean.hashCode(bool10.booleanValue()) : 0)) * 37;
        ReactionRenderData reactionRenderData = this.reaction_data;
        int hashCode59 = (hashCode58 + (reactionRenderData != null ? reactionRenderData.hashCode() : 0)) * 37;
        Boolean bool11 = this.verification_required;
        int hashCode60 = (hashCode59 + (bool11 != null ? Boolean.hashCode(bool11.booleanValue()) : 0)) * 37;
        Boolean bool12 = this.idv_in_progress;
        int hashCode61 = (hashCode60 + (bool12 != null ? Boolean.hashCode(bool12.booleanValue()) : 0)) * 37;
        FeeAmounts feeAmounts = this.fee_amounts;
        int hashCode62 = (hashCode61 + (feeAmounts != null ? feeAmounts.hashCode() : 0)) * 37;
        Boolean bool13 = this.will_refund_to_balance;
        int hashCode63 = (hashCode62 + (bool13 != null ? Boolean.hashCode(bool13.booleanValue()) : 0)) * 37;
        String str11 = this.crypto_transfer_status;
        int hashCode64 = (hashCode63 + (str11 != null ? str11.hashCode() : 0)) * 37;
        Boolean bool14 = this.is_bitcoin_transaction;
        int hashCode65 = (hashCode64 + (bool14 != null ? Boolean.hashCode(bool14.booleanValue()) : 0)) * 37;
        Boolean bool15 = this.can_unlock_free_atm_status;
        int hashCode66 = (hashCode65 + (bool15 != null ? Boolean.hashCode(bool15.booleanValue()) : 0)) * 37;
        ReimbursedAmounts reimbursedAmounts = this.reimbursed_amounts;
        int hashCode67 = (hashCode66 + (reimbursedAmounts != null ? reimbursedAmounts.hashCode() : 0)) * 37;
        String str12 = this.movement_exchange_rate;
        int hashCode68 = (hashCode67 + (str12 != null ? str12.hashCode() : 0)) * 37;
        Country country = this.sender_country;
        int hashCode69 = (hashCode68 + (country != null ? country.hashCode() : 0)) * 37;
        LendingRenderData lendingRenderData = this.lending_render_data;
        int hashCode70 = (hashCode69 + (lendingRenderData != null ? lendingRenderData.hashCode() : 0)) * 37;
        Boolean bool16 = this.is_app_purchase;
        int hashCode71 = (hashCode70 + (bool16 != null ? Boolean.hashCode(bool16.booleanValue()) : 0)) * 37;
        Long l18 = this.refund_requested_at;
        int hashCode72 = (hashCode71 + (l18 != null ? Long.hashCode(l18.longValue()) : 0)) * 37;
        Long l19 = this.refund_request_declined_at;
        int hashCode73 = (hashCode72 + (l19 != null ? Long.hashCode(l19.longValue()) : 0)) * 37;
        Long l20 = this.request_refund_available_until;
        int hashCode74 = (hashCode73 + (l20 != null ? Long.hashCode(l20.longValue()) : 0)) * 37;
        RequestRefundReason requestRefundReason = this.request_refund_reason;
        int hashCode75 = (hashCode74 + (requestRefundReason != null ? requestRefundReason.hashCode() : 0)) * 37;
        RecurringSchedule.Frequency frequency = this.frequency;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode75 + (frequency != null ? frequency.hashCode() : 0)) * 37, 37, this.days_of_period);
        String str13 = this.check_reference_token;
        int hashCode76 = (m2 + (str13 != null ? str13.hashCode() : 0)) * 37;
        PendingReferralRenderData pendingReferralRenderData = this.pending_referral_render_data;
        int hashCode77 = (hashCode76 + (pendingReferralRenderData != null ? pendingReferralRenderData.hashCode() : 0)) * 37;
        ExplicitConfirmationReason explicitConfirmationReason = this.explicit_confirmation_reason;
        int hashCode78 = (hashCode77 + (explicitConfirmationReason != null ? explicitConfirmationReason.hashCode() : 0)) * 37;
        String str14 = this.btc_limit;
        int hashCode79 = (hashCode78 + (str14 != null ? str14.hashCode() : 0)) * 37;
        CrossCurrencyRewardInfo crossCurrencyRewardInfo = this.cross_currency_reward_info;
        int hashCode80 = (hashCode79 + (crossCurrencyRewardInfo != null ? crossCurrencyRewardInfo.hashCode() : 0)) * 37;
        LoyaltyActivityRenderData loyaltyActivityRenderData = this.loyalty_activity_render_data;
        int hashCode81 = (hashCode80 + (loyaltyActivityRenderData != null ? loyaltyActivityRenderData.hashCode() : 0)) * 37;
        InvestPaymentRenderData investPaymentRenderData = this.invest_payment_render_data;
        int hashCode82 = (hashCode81 + (investPaymentRenderData != null ? investPaymentRenderData.hashCode() : 0)) * 37;
        TransactionAmountHistory transactionAmountHistory = this.transaction_amount_history;
        int hashCode83 = (hashCode82 + (transactionAmountHistory != null ? transactionAmountHistory.hashCode() : 0)) * 37;
        Long l21 = this.outstanding_until;
        int hashCode84 = (hashCode83 + (l21 != null ? Long.hashCode(l21.longValue()) : 0)) * 37;
        CryptoOrderRenderData cryptoOrderRenderData = this.crypto_order_render_data;
        int hashCode85 = (hashCode84 + (cryptoOrderRenderData != null ? cryptoOrderRenderData.hashCode() : 0)) * 37;
        PaperCashDepositRenderData paperCashDepositRenderData = this.paper_cash_deposit_render_data;
        int hashCode86 = (hashCode85 + (paperCashDepositRenderData != null ? paperCashDepositRenderData.hashCode() : 0)) * 37;
        SponsoredAccountRenderData sponsoredAccountRenderData = this.sponsored_account_render_data;
        int hashCode87 = (hashCode86 + (sponsoredAccountRenderData != null ? sponsoredAccountRenderData.hashCode() : 0)) * 37;
        InstantPayRenderData instantPayRenderData = this.instant_pay_render_data;
        int hashCode88 = (hashCode87 + (instantPayRenderData != null ? instantPayRenderData.hashCode() : 0)) * 37;
        GiftCardRenderData giftCardRenderData = this.gift_card_render_data;
        int hashCode89 = (hashCode88 + (giftCardRenderData != null ? giftCardRenderData.hashCode() : 0)) * 37;
        NewDeviceLoginRenderData newDeviceLoginRenderData = this.new_device_login_render_data;
        int hashCode90 = (hashCode89 + (newDeviceLoginRenderData != null ? newDeviceLoginRenderData.hashCode() : 0)) * 37;
        TimelineRenderData timelineRenderData = this.timeline_render_data;
        int hashCode91 = (hashCode90 + (timelineRenderData != null ? timelineRenderData.hashCode() : 0)) * 37;
        DisputedTransactionRenderData disputedTransactionRenderData = this.disputed_transaction_render_data;
        int hashCode92 = (hashCode91 + (disputedTransactionRenderData != null ? disputedTransactionRenderData.hashCode() : 0)) * 37;
        InvestingAutomationTriggerRenderData investingAutomationTriggerRenderData = this.investing_automation_trigger_render_data;
        int hashCode93 = (hashCode92 + (investingAutomationTriggerRenderData != null ? investingAutomationTriggerRenderData.hashCode() : 0)) * 37;
        InvestingAutomationExecutionRenderData investingAutomationExecutionRenderData = this.investing_automation_execution_render_data;
        int hashCode94 = (hashCode93 + (investingAutomationExecutionRenderData != null ? investingAutomationExecutionRenderData.hashCode() : 0)) * 37;
        AfterPayRenderData afterPayRenderData = this.afterpay_render_data;
        int hashCode95 = (hashCode94 + (afterPayRenderData != null ? afterPayRenderData.hashCode() : 0)) * 37;
        CashAppPayOrderRenderData cashAppPayOrderRenderData = this.cash_app_pay_order_render_data;
        int hashCode96 = (hashCode95 + (cashAppPayOrderRenderData != null ? cashAppPayOrderRenderData.hashCode() : 0)) * 37;
        CashAppPayPaymentRenderData cashAppPayPaymentRenderData = this.cash_app_pay_payment_render_data;
        int hashCode97 = (hashCode96 + (cashAppPayPaymentRenderData != null ? cashAppPayPaymentRenderData.hashCode() : 0)) * 37;
        CashAppPayRefundRenderData cashAppPayRefundRenderData = this.cash_app_pay_refund_render_data;
        int hashCode98 = (hashCode97 + (cashAppPayRefundRenderData != null ? cashAppPayRefundRenderData.hashCode() : 0)) * 37;
        CashAppPayPaymentScheduleRenderData cashAppPayPaymentScheduleRenderData = this.cash_app_pay_payment_schedule_render_data;
        int hashCode99 = (hashCode98 + (cashAppPayPaymentScheduleRenderData != null ? cashAppPayPaymentScheduleRenderData.hashCode() : 0)) * 37;
        CashAppPayPayoutRenderData cashAppPayPayoutRenderData = this.cash_app_pay_payout_render_data;
        int hashCode100 = (hashCode99 + (cashAppPayPayoutRenderData != null ? cashAppPayPayoutRenderData.hashCode() : 0)) * 37;
        CommerceOrderRenderData commerceOrderRenderData = this.commerce_order_render_data;
        int hashCode101 = (hashCode100 + (commerceOrderRenderData != null ? commerceOrderRenderData.hashCode() : 0)) * 37;
        CashAppPayRenderData cashAppPayRenderData = this.cash_app_pay_render_data;
        int hashCode102 = (hashCode101 + (cashAppPayRenderData != null ? cashAppPayRenderData.hashCode() : 0)) * 37;
        ViewContextRenderData viewContextRenderData = this.view_context_render_data;
        int hashCode103 = (hashCode102 + (viewContextRenderData != null ? viewContextRenderData.hashCode() : 0)) * 37;
        GenericNonPaymentRenderData genericNonPaymentRenderData = this.generic_non_payment_render_data;
        int hashCode104 = (hashCode103 + (genericNonPaymentRenderData != null ? genericNonPaymentRenderData.hashCode() : 0)) * 37;
        SavingsTransferRenderData savingsTransferRenderData = this.savings_transfer_render_data;
        int hashCode105 = (hashCode104 + (savingsTransferRenderData != null ? savingsTransferRenderData.hashCode() : 0)) * 37;
        SavingsInterestPaymentRenderData savingsInterestPaymentRenderData = this.savings_interest_payment_render_data;
        int hashCode106 = (hashCode105 + (savingsInterestPaymentRenderData != null ? savingsInterestPaymentRenderData.hashCode() : 0)) * 37;
        RemittancePaymentRenderData remittancePaymentRenderData = this.remittance_payment_render_data;
        int hashCode107 = (hashCode106 + (remittancePaymentRenderData != null ? remittancePaymentRenderData.hashCode() : 0)) * 37;
        GroupActivityRenderData groupActivityRenderData = this.group_activity_render_data;
        int hashCode108 = (hashCode107 + (groupActivityRenderData != null ? groupActivityRenderData.hashCode() : 0)) * 37;
        String str15 = this.caller_customer_token;
        int hashCode109 = (hashCode108 + (str15 != null ? str15.hashCode() : 0)) * 37;
        ActivityToken activityToken = this.activity_token;
        int hashCode110 = (hashCode109 + (activityToken != null ? activityToken.hashCode() : 0)) * 37;
        ActivityScope activityScope = this.activity_scope;
        int hashCode111 = (hashCode110 + (activityScope != null ? activityScope.hashCode() : 0)) * 37;
        TransactionAuthRenderData transactionAuthRenderData = this.transaction_auth_render_data;
        int m3 = Recorder$$ExternalSyntheticOutline2.m((hashCode111 + (transactionAuthRenderData != null ? transactionAuthRenderData.hashCode() : 0)) * 37, 37, this.balance_impacts);
        CouponActivityRenderData couponActivityRenderData = this.coupon_activity_render_data;
        int hashCode112 = (m3 + (couponActivityRenderData != null ? couponActivityRenderData.hashCode() : 0)) * 37;
        InvestCorrectionRenderData investCorrectionRenderData = this.invest_correction_render_data;
        int hashCode113 = (hashCode112 + (investCorrectionRenderData != null ? investCorrectionRenderData.hashCode() : 0)) * 37;
        FiatP2pRenderData fiatP2pRenderData = this.fiat_p2p_render_data;
        int hashCode114 = (hashCode113 + (fiatP2pRenderData != null ? fiatP2pRenderData.hashCode() : 0)) * 37;
        CheckDepositRenderData checkDepositRenderData = this.check_deposit_render_data;
        int hashCode115 = (hashCode114 + (checkDepositRenderData != null ? checkDepositRenderData.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localizable_note;
        int hashCode116 = (hashCode115 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
        OverdraftRenderData overdraftRenderData = this.overdraft_render_data;
        int hashCode117 = (hashCode116 + (overdraftRenderData != null ? overdraftRenderData.hashCode() : 0)) * 37;
        PaymentPlanEligibilityRenderData paymentPlanEligibilityRenderData = this.payment_plan_eligibility_render_data;
        int hashCode118 = (hashCode117 + (paymentPlanEligibilityRenderData != null ? paymentPlanEligibilityRenderData.hashCode() : 0)) * 37;
        FeatureInvitationRenderData featureInvitationRenderData = this.feature_invitation_render_data;
        int hashCode119 = (hashCode118 + (featureInvitationRenderData != null ? featureInvitationRenderData.hashCode() : 0)) * 37;
        TTPPaymentRenderData tTPPaymentRenderData = this.ttp_payment_render_data;
        int hashCode120 = (hashCode119 + (tTPPaymentRenderData != null ? tTPPaymentRenderData.hashCode() : 0)) * 37;
        PersonalizationRenderData personalizationRenderData = this.personalization_render_data;
        int hashCode121 = (hashCode120 + (personalizationRenderData != null ? personalizationRenderData.hashCode() : 0)) * 37;
        AutoAllocationRenderData autoAllocationRenderData = this.auto_allocation_render_data;
        int hashCode122 = (hashCode121 + (autoAllocationRenderData != null ? autoAllocationRenderData.hashCode() : 0)) * 37;
        BillPayRenderData billPayRenderData = this.bill_pay_render_data;
        int hashCode123 = (hashCode122 + (billPayRenderData != null ? billPayRenderData.hashCode() : 0)) * 37;
        Boolean bool17 = this.is_background;
        int hashCode124 = (hashCode123 + (bool17 != null ? Boolean.hashCode(bool17.booleanValue()) : 0)) * 37;
        Boolean bool18 = this.has_error_context;
        int hashCode125 = (hashCode124 + (bool18 != null ? Boolean.hashCode(bool18.booleanValue()) : 0)) * 37;
        Boolean bool19 = this.is_recurring;
        int hashCode126 = (hashCode125 + (bool19 != null ? Boolean.hashCode(bool19.booleanValue()) : 0)) * 37;
        BitcoinOnchainRenderData bitcoinOnchainRenderData = this.bitcoin_onchain_render_data;
        int hashCode127 = (hashCode126 + (bitcoinOnchainRenderData != null ? bitcoinOnchainRenderData.hashCode() : 0)) * 37;
        Boolean bool20 = this.is_deposit_reversal;
        int hashCode128 = (hashCode127 + (bool20 != null ? Boolean.hashCode(bool20.booleanValue()) : 0)) * 37;
        LendingCardRenderData lendingCardRenderData = this.lending_card_render_data;
        int hashCode129 = (hashCode128 + (lendingCardRenderData != null ? lendingCardRenderData.hashCode() : 0)) * 37;
        String str16 = this.raw_merchant_descriptor;
        int hashCode130 = (hashCode129 + (str16 != null ? str16.hashCode() : 0)) * 37;
        CashAppLocalPaymentRenderData cashAppLocalPaymentRenderData = this.cash_app_local_payment_render_data;
        int hashCode131 = (hashCode130 + (cashAppLocalPaymentRenderData != null ? cashAppLocalPaymentRenderData.hashCode() : 0)) * 37;
        CashAppLocalOrderRenderData cashAppLocalOrderRenderData = this.cash_app_local_order_render_data;
        int hashCode132 = (hashCode131 + (cashAppLocalOrderRenderData != null ? cashAppLocalOrderRenderData.hashCode() : 0)) * 37;
        AchRenderData achRenderData = this.ach_render_data;
        int hashCode133 = (hashCode132 + (achRenderData != null ? achRenderData.hashCode() : 0)) * 37;
        BitcoinLightningRenderData bitcoinLightningRenderData = this.bitcoin_lightning_render_data;
        int hashCode134 = (hashCode133 + (bitcoinLightningRenderData != null ? bitcoinLightningRenderData.hashCode() : 0)) * 37;
        P2pPoolRenderData p2pPoolRenderData = this.p2p_pool_render_data;
        int hashCode135 = (hashCode134 + (p2pPoolRenderData != null ? p2pPoolRenderData.hashCode() : 0)) * 37;
        P2pPoolMemberRenderData p2pPoolMemberRenderData = this.p2p_pool_member_render_data;
        int hashCode136 = (hashCode135 + (p2pPoolMemberRenderData != null ? p2pPoolMemberRenderData.hashCode() : 0)) * 37;
        ActivityRowRenderData activityRowRenderData = this.activity_row_render_data;
        int hashCode137 = (hashCode136 + (activityRowRenderData != null ? activityRowRenderData.hashCode() : 0)) * 37;
        Money money11 = this.impact;
        int hashCode138 = (hashCode137 + (money11 != null ? money11.hashCode() : 0)) * 37;
        Money money12 = this.current_balance;
        int hashCode139 = (hashCode138 + (money12 != null ? money12.hashCode() : 0)) * 37;
        P2pPoolContributionRenderData p2pPoolContributionRenderData = this.p2p_pool_contribution_render_data;
        int hashCode140 = (hashCode139 + (p2pPoolContributionRenderData != null ? p2pPoolContributionRenderData.hashCode() : 0)) * 37;
        CustomerAdjustmentRenderData customerAdjustmentRenderData = this.customer_adjustment_render_data;
        int hashCode141 = (hashCode140 + (customerAdjustmentRenderData != null ? customerAdjustmentRenderData.hashCode() : 0)) * 37;
        StablecoinRenderData stablecoinRenderData = this.stablecoin_render_data;
        int hashCode142 = (hashCode141 + (stablecoinRenderData != null ? stablecoinRenderData.hashCode() : 0)) * 37;
        RecurringTransferRenderData recurringTransferRenderData = this.recurring_transfer_render_data;
        int hashCode143 = (hashCode142 + (recurringTransferRenderData != null ? recurringTransferRenderData.hashCode() : 0)) * 37;
        LiftedRestrictionTransferRenderData liftedRestrictionTransferRenderData = this.lifted_restriction_transfer_render_data;
        int hashCode144 = (hashCode143 + (liftedRestrictionTransferRenderData != null ? liftedRestrictionTransferRenderData.hashCode() : 0)) * 37;
        RestrictedCashInTransferRenderData restrictedCashInTransferRenderData = this.restricted_cash_in_transfer_render_data;
        int hashCode145 = (hashCode144 + (restrictedCashInTransferRenderData != null ? restrictedCashInTransferRenderData.hashCode() : 0)) * 37;
        CashAppTagRenderData cashAppTagRenderData = this.cash_app_tag_render_data;
        int hashCode146 = (hashCode145 + (cashAppTagRenderData != null ? cashAppTagRenderData.hashCode() : 0)) * 37;
        Long l22 = this.counterparty_viewed_at;
        int hashCode147 = (hashCode146 + (l22 != null ? Long.hashCode(l22.longValue()) : 0)) * 37;
        CashLiteCardTransactionRenderData cashLiteCardTransactionRenderData = this.cash_lite_card_transaction_render_data;
        int hashCode148 = (hashCode147 + (cashLiteCardTransactionRenderData != null ? cashLiteCardTransactionRenderData.hashCode() : 0)) * 37;
        Boolean bool21 = this.is_send_to_cashtag_oct;
        int hashCode149 = hashCode148 + (bool21 != null ? Boolean.hashCode(bool21.booleanValue()) : 0);
        this.hashCode = hashCode149;
        return hashCode149;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.token = this.token;
        builder.auth_token = this.auth_token;
        builder.receipt_token = this.receipt_token;
        builder.orientation = this.orientation;
        builder.role = this.role;
        builder.rate_plan = this.rate_plan;
        builder.amount = this.amount;
        builder.pull_amount = this.pull_amount;
        builder.push_amount = this.push_amount;
        builder.sender_payment_amount_in_default_currency = this.sender_payment_amount_in_default_currency;
        builder.recipient_payment_amount_in_default_currency = this.recipient_payment_amount_in_default_currency;
        builder.fee_amount = this.fee_amount;
        builder.refund_amount = this.refund_amount;
        builder.reward_amount = this.reward_amount;
        builder.reward_basis_points = this.reward_basis_points;
        builder.boost_amount = this.boost_amount;
        builder.settled_amount = this.settled_amount;
        builder.boost_basis_points = this.boost_basis_points;
        builder.state = this.state;
        builder.cancellation_reason = this.cancellation_reason;
        builder.refund_cancellation_reason = this.refund_cancellation_reason;
        builder.client_display_name = this.client_display_name;
        builder.note = this.note;
        builder.sent_via_watch = this.sent_via_watch;
        builder.sent_via_imessage = this.sent_via_imessage;
        builder.display_instrument = this.display_instrument;
        builder.instrument_type = this.instrument_type;
        builder.transaction_id = this.transaction_id;
        builder.created_at = this.created_at;
        builder.captured_at = this.captured_at;
        builder.reached_customer_at = this.reached_customer_at;
        builder.passed_customer_at = this.passed_customer_at;
        builder.paid_out_at = this.paid_out_at;
        builder.deposited_at = this.deposited_at;
        builder.refunded_at = this.refunded_at;
        builder.refund_deposited_at = this.refund_deposited_at;
        builder.refund_request_expires_at = this.refund_request_expires_at;
        builder.failed_at = this.failed_at;
        builder.display_date = this.display_date;
        builder.scenario_plan = this.scenario_plan;
        builder.scenario_plan_map = this.scenario_plan_map;
        builder.is_transfer = this.is_transfer;
        builder.is_prefunded_transfer = this.is_prefunded_transfer;
        builder.estimated_withdrawal_date = this.estimated_withdrawal_date;
        builder.is_banking_transaction = this.is_banking_transaction;
        builder.is_scheduled_payment = this.is_scheduled_payment;
        builder.is_pwc_payment = this.is_pwc_payment;
        builder.scheduled_for = this.scheduled_for;
        builder.deposit_preference = this.deposit_preference;
        builder.deposit_instantly_valid_until = this.deposit_instantly_valid_until;
        builder.transaction_reason_code = this.transaction_reason_code;
        builder.supports_reporting_missing_reward_until = this.supports_reporting_missing_reward_until;
        builder.instrument = this.instrument;
        builder.target_wallet_address = this.target_wallet_address;
        builder.hidden_receipt_buttons = this.hidden_receipt_buttons;
        builder.supports_reporting_boost_until = this.supports_reporting_boost_until;
        builder.in_cash_boost_experiment = this.in_cash_boost_experiment;
        builder.is_scheduled_reload = this.is_scheduled_reload;
        builder.refunded_to_balance = this.refunded_to_balance;
        builder.reaction_data = this.reaction_data;
        builder.verification_required = this.verification_required;
        builder.idv_in_progress = this.idv_in_progress;
        builder.fee_amounts = this.fee_amounts;
        builder.will_refund_to_balance = this.will_refund_to_balance;
        builder.crypto_transfer_status = this.crypto_transfer_status;
        builder.is_bitcoin_transaction = this.is_bitcoin_transaction;
        builder.can_unlock_free_atm_status = this.can_unlock_free_atm_status;
        builder.reimbursed_amounts = this.reimbursed_amounts;
        builder.movement_exchange_rate = this.movement_exchange_rate;
        builder.sender_country = this.sender_country;
        builder.lending_render_data = this.lending_render_data;
        builder.is_app_purchase = this.is_app_purchase;
        builder.refund_requested_at = this.refund_requested_at;
        builder.refund_request_declined_at = this.refund_request_declined_at;
        builder.request_refund_available_until = this.request_refund_available_until;
        builder.request_refund_reason = this.request_refund_reason;
        builder.frequency = this.frequency;
        builder.days_of_period = this.days_of_period;
        builder.check_reference_token = this.check_reference_token;
        builder.pending_referral_render_data = this.pending_referral_render_data;
        builder.explicit_confirmation_reason = this.explicit_confirmation_reason;
        builder.btc_limit = this.btc_limit;
        builder.cross_currency_reward_info = this.cross_currency_reward_info;
        builder.loyalty_activity_render_data = this.loyalty_activity_render_data;
        builder.invest_payment_render_data = this.invest_payment_render_data;
        builder.transaction_amount_history = this.transaction_amount_history;
        builder.outstanding_until = this.outstanding_until;
        builder.crypto_order_render_data = this.crypto_order_render_data;
        builder.paper_cash_deposit_render_data = this.paper_cash_deposit_render_data;
        builder.sponsored_account_render_data = this.sponsored_account_render_data;
        builder.instant_pay_render_data = this.instant_pay_render_data;
        builder.gift_card_render_data = this.gift_card_render_data;
        builder.new_device_login_render_data = this.new_device_login_render_data;
        builder.timeline_render_data = this.timeline_render_data;
        builder.disputed_transaction_render_data = this.disputed_transaction_render_data;
        builder.investing_automation_trigger_render_data = this.investing_automation_trigger_render_data;
        builder.investing_automation_execution_render_data = this.investing_automation_execution_render_data;
        builder.afterpay_render_data = this.afterpay_render_data;
        builder.cash_app_pay_order_render_data = this.cash_app_pay_order_render_data;
        builder.cash_app_pay_payment_render_data = this.cash_app_pay_payment_render_data;
        builder.cash_app_pay_refund_render_data = this.cash_app_pay_refund_render_data;
        builder.cash_app_pay_payment_schedule_render_data = this.cash_app_pay_payment_schedule_render_data;
        builder.cash_app_pay_payout_render_data = this.cash_app_pay_payout_render_data;
        builder.commerce_order_render_data = this.commerce_order_render_data;
        builder.cash_app_pay_render_data = this.cash_app_pay_render_data;
        builder.view_context_render_data = this.view_context_render_data;
        builder.generic_non_payment_render_data = this.generic_non_payment_render_data;
        builder.savings_transfer_render_data = this.savings_transfer_render_data;
        builder.savings_interest_payment_render_data = this.savings_interest_payment_render_data;
        builder.remittance_payment_render_data = this.remittance_payment_render_data;
        builder.group_activity_render_data = this.group_activity_render_data;
        builder.caller_customer_token = this.caller_customer_token;
        builder.activity_token = this.activity_token;
        builder.activity_scope = this.activity_scope;
        builder.transaction_auth_render_data = this.transaction_auth_render_data;
        builder.balance_impacts = this.balance_impacts;
        builder.coupon_activity_render_data = this.coupon_activity_render_data;
        builder.invest_correction_render_data = this.invest_correction_render_data;
        builder.fiat_p2p_render_data = this.fiat_p2p_render_data;
        builder.check_deposit_render_data = this.check_deposit_render_data;
        builder.localizable_note = this.localizable_note;
        builder.overdraft_render_data = this.overdraft_render_data;
        builder.payment_plan_eligibility_render_data = this.payment_plan_eligibility_render_data;
        builder.feature_invitation_render_data = this.feature_invitation_render_data;
        builder.ttp_payment_render_data = this.ttp_payment_render_data;
        builder.personalization_render_data = this.personalization_render_data;
        builder.auto_allocation_render_data = this.auto_allocation_render_data;
        builder.bill_pay_render_data = this.bill_pay_render_data;
        builder.is_background = this.is_background;
        builder.has_error_context = this.has_error_context;
        builder.is_recurring = this.is_recurring;
        builder.bitcoin_onchain_render_data = this.bitcoin_onchain_render_data;
        builder.is_deposit_reversal = this.is_deposit_reversal;
        builder.lending_card_render_data = this.lending_card_render_data;
        builder.raw_merchant_descriptor = this.raw_merchant_descriptor;
        builder.cash_app_local_payment_render_data = this.cash_app_local_payment_render_data;
        builder.cash_app_local_order_render_data = this.cash_app_local_order_render_data;
        builder.ach_render_data = this.ach_render_data;
        builder.bitcoin_lightning_render_data = this.bitcoin_lightning_render_data;
        builder.p2p_pool_render_data = this.p2p_pool_render_data;
        builder.p2p_pool_member_render_data = this.p2p_pool_member_render_data;
        builder.activity_row_render_data = this.activity_row_render_data;
        builder.impact = this.impact;
        builder.current_balance = this.current_balance;
        builder.p2p_pool_contribution_render_data = this.p2p_pool_contribution_render_data;
        builder.customer_adjustment_render_data = this.customer_adjustment_render_data;
        builder.stablecoin_render_data = this.stablecoin_render_data;
        builder.recurring_transfer_render_data = this.recurring_transfer_render_data;
        builder.lifted_restriction_transfer_render_data = this.lifted_restriction_transfer_render_data;
        builder.restricted_cash_in_transfer_render_data = this.restricted_cash_in_transfer_render_data;
        builder.cash_app_tag_render_data = this.cash_app_tag_render_data;
        builder.counterparty_viewed_at = this.counterparty_viewed_at;
        builder.cash_lite_card_transaction_render_data = this.cash_lite_card_transaction_render_data;
        builder.is_send_to_cashtag_oct = this.is_send_to_cashtag_oct;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        if (this.auth_token != null) {
            arrayList.add("auth_token=██");
        }
        String str2 = this.receipt_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "receipt_token=", arrayList);
        }
        Orientation orientation = this.orientation;
        if (orientation != null) {
            arrayList.add("orientation=" + orientation);
        }
        Role role = this.role;
        if (role != null) {
            arrayList.add("role=" + role);
        }
        RatePlan ratePlan = this.rate_plan;
        if (ratePlan != null) {
            arrayList.add("rate_plan=" + ratePlan);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        Money money2 = this.pull_amount;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("pull_amount=", money2, arrayList);
        }
        Money money3 = this.push_amount;
        if (money3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("push_amount=", money3, arrayList);
        }
        Money money4 = this.sender_payment_amount_in_default_currency;
        if (money4 != null) {
            Matcher$$ExternalSyntheticOutline0.m("sender_payment_amount_in_default_currency=", money4, arrayList);
        }
        Money money5 = this.recipient_payment_amount_in_default_currency;
        if (money5 != null) {
            Matcher$$ExternalSyntheticOutline0.m("recipient_payment_amount_in_default_currency=", money5, arrayList);
        }
        Money money6 = this.fee_amount;
        if (money6 != null) {
            Matcher$$ExternalSyntheticOutline0.m("fee_amount=", money6, arrayList);
        }
        Money money7 = this.refund_amount;
        if (money7 != null) {
            Matcher$$ExternalSyntheticOutline0.m("refund_amount=", money7, arrayList);
        }
        Money money8 = this.reward_amount;
        if (money8 != null) {
            Matcher$$ExternalSyntheticOutline0.m("reward_amount=", money8, arrayList);
        }
        Long l = this.reward_basis_points;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("reward_basis_points=", l, arrayList);
        }
        Money money9 = this.boost_amount;
        if (money9 != null) {
            Matcher$$ExternalSyntheticOutline0.m("boost_amount=", money9, arrayList);
        }
        Money money10 = this.settled_amount;
        if (money10 != null) {
            Matcher$$ExternalSyntheticOutline0.m("settled_amount=", money10, arrayList);
        }
        Long l2 = this.boost_basis_points;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("boost_basis_points=", l2, arrayList);
        }
        Payment$State payment$State = this.state;
        if (payment$State != null) {
            arrayList.add("state=" + payment$State);
        }
        Payment$CancellationReason payment$CancellationReason = this.cancellation_reason;
        if (payment$CancellationReason != null) {
            arrayList.add("cancellation_reason=" + payment$CancellationReason);
        }
        Payment$CancellationReason payment$CancellationReason2 = this.refund_cancellation_reason;
        if (payment$CancellationReason2 != null) {
            arrayList.add("refund_cancellation_reason=" + payment$CancellationReason2);
        }
        String str3 = this.client_display_name;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "client_display_name=", arrayList);
        }
        String str4 = this.note;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "note=", arrayList);
        }
        Boolean bool = this.sent_via_watch;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("sent_via_watch=", bool, arrayList);
        }
        Boolean bool2 = this.sent_via_imessage;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("sent_via_imessage=", bool2, arrayList);
        }
        String str5 = this.display_instrument;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "display_instrument=", arrayList);
        }
        CashInstrumentType cashInstrumentType = this.instrument_type;
        if (cashInstrumentType != null) {
            arrayList.add("instrument_type=" + cashInstrumentType);
        }
        String str6 = this.transaction_id;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "transaction_id=", arrayList);
        }
        Long l3 = this.created_at;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at=", l3, arrayList);
        }
        Long l4 = this.captured_at;
        if (l4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("captured_at=", l4, arrayList);
        }
        Long l5 = this.reached_customer_at;
        if (l5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("reached_customer_at=", l5, arrayList);
        }
        Long l6 = this.passed_customer_at;
        if (l6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("passed_customer_at=", l6, arrayList);
        }
        Long l7 = this.paid_out_at;
        if (l7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("paid_out_at=", l7, arrayList);
        }
        Long l8 = this.deposited_at;
        if (l8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("deposited_at=", l8, arrayList);
        }
        Long l9 = this.refunded_at;
        if (l9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("refunded_at=", l9, arrayList);
        }
        Long l10 = this.refund_deposited_at;
        if (l10 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("refund_deposited_at=", l10, arrayList);
        }
        Long l11 = this.refund_request_expires_at;
        if (l11 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("refund_request_expires_at=", l11, arrayList);
        }
        Long l12 = this.failed_at;
        if (l12 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("failed_at=", l12, arrayList);
        }
        Long l13 = this.display_date;
        if (l13 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("display_date=", l13, arrayList);
        }
        ScenarioPlan scenarioPlan = this.scenario_plan;
        if (scenarioPlan != null) {
            arrayList.add("scenario_plan=" + scenarioPlan);
        }
        ScenarioPlanMap scenarioPlanMap = this.scenario_plan_map;
        if (scenarioPlanMap != null) {
            arrayList.add("scenario_plan_map=" + scenarioPlanMap);
        }
        Boolean bool3 = this.is_transfer;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_transfer=", bool3, arrayList);
        }
        Boolean bool4 = this.is_prefunded_transfer;
        if (bool4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_prefunded_transfer=", bool4, arrayList);
        }
        String str7 = this.estimated_withdrawal_date;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "estimated_withdrawal_date=", arrayList);
        }
        Boolean bool5 = this.is_banking_transaction;
        if (bool5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_banking_transaction=", bool5, arrayList);
        }
        Boolean bool6 = this.is_scheduled_payment;
        if (bool6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_scheduled_payment=", bool6, arrayList);
        }
        Boolean bool7 = this.is_pwc_payment;
        if (bool7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_pwc_payment=", bool7, arrayList);
        }
        Long l14 = this.scheduled_for;
        if (l14 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("scheduled_for=", l14, arrayList);
        }
        DepositPreference depositPreference = this.deposit_preference;
        if (depositPreference != null) {
            arrayList.add("deposit_preference=" + depositPreference);
        }
        Long l15 = this.deposit_instantly_valid_until;
        if (l15 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("deposit_instantly_valid_until=", l15, arrayList);
        }
        String str8 = this.transaction_reason_code;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "transaction_reason_code=", arrayList);
        }
        Long l16 = this.supports_reporting_missing_reward_until;
        if (l16 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("supports_reporting_missing_reward_until=", l16, arrayList);
        }
        Instrument instrument = this.instrument;
        if (instrument != null) {
            arrayList.add("instrument=" + instrument);
        }
        String str9 = this.target_wallet_address;
        if (str9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str9, "target_wallet_address=", arrayList);
        }
        List list = this.hidden_receipt_buttons;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("hidden_receipt_buttons=", arrayList, list);
        }
        Long l17 = this.supports_reporting_boost_until;
        if (l17 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("supports_reporting_boost_until=", l17, arrayList);
        }
        Boolean bool8 = this.in_cash_boost_experiment;
        if (bool8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("in_cash_boost_experiment=", bool8, arrayList);
        }
        Boolean bool9 = this.is_scheduled_reload;
        if (bool9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_scheduled_reload=", bool9, arrayList);
        }
        Boolean bool10 = this.refunded_to_balance;
        if (bool10 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("refunded_to_balance=", bool10, arrayList);
        }
        ReactionRenderData reactionRenderData = this.reaction_data;
        if (reactionRenderData != null) {
            arrayList.add("reaction_data=" + reactionRenderData);
        }
        Boolean bool11 = this.verification_required;
        if (bool11 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("verification_required=", bool11, arrayList);
        }
        Boolean bool12 = this.idv_in_progress;
        if (bool12 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("idv_in_progress=", bool12, arrayList);
        }
        FeeAmounts feeAmounts = this.fee_amounts;
        if (feeAmounts != null) {
            arrayList.add("fee_amounts=" + feeAmounts);
        }
        Boolean bool13 = this.will_refund_to_balance;
        if (bool13 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("will_refund_to_balance=", bool13, arrayList);
        }
        String str10 = this.crypto_transfer_status;
        if (str10 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str10, "crypto_transfer_status=", arrayList);
        }
        Boolean bool14 = this.is_bitcoin_transaction;
        if (bool14 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_bitcoin_transaction=", bool14, arrayList);
        }
        Boolean bool15 = this.can_unlock_free_atm_status;
        if (bool15 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("can_unlock_free_atm_status=", bool15, arrayList);
        }
        ReimbursedAmounts reimbursedAmounts = this.reimbursed_amounts;
        if (reimbursedAmounts != null) {
            arrayList.add("reimbursed_amounts=" + reimbursedAmounts);
        }
        String str11 = this.movement_exchange_rate;
        if (str11 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str11, "movement_exchange_rate=", arrayList);
        }
        Country country = this.sender_country;
        if (country != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("sender_country=", country, arrayList);
        }
        LendingRenderData lendingRenderData = this.lending_render_data;
        if (lendingRenderData != null) {
            arrayList.add("lending_render_data=" + lendingRenderData);
        }
        Boolean bool16 = this.is_app_purchase;
        if (bool16 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_app_purchase=", bool16, arrayList);
        }
        Long l18 = this.refund_requested_at;
        if (l18 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("refund_requested_at=", l18, arrayList);
        }
        Long l19 = this.refund_request_declined_at;
        if (l19 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("refund_request_declined_at=", l19, arrayList);
        }
        Long l20 = this.request_refund_available_until;
        if (l20 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("request_refund_available_until=", l20, arrayList);
        }
        RequestRefundReason requestRefundReason = this.request_refund_reason;
        if (requestRefundReason != null) {
            arrayList.add("request_refund_reason=" + requestRefundReason);
        }
        RecurringSchedule.Frequency frequency = this.frequency;
        if (frequency != null) {
            arrayList.add("frequency=" + frequency);
        }
        List list2 = this.days_of_period;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("days_of_period=", arrayList, list2);
        }
        String str12 = this.check_reference_token;
        if (str12 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str12, "check_reference_token=", arrayList);
        }
        PendingReferralRenderData pendingReferralRenderData = this.pending_referral_render_data;
        if (pendingReferralRenderData != null) {
            arrayList.add("pending_referral_render_data=" + pendingReferralRenderData);
        }
        ExplicitConfirmationReason explicitConfirmationReason = this.explicit_confirmation_reason;
        if (explicitConfirmationReason != null) {
            arrayList.add("explicit_confirmation_reason=" + explicitConfirmationReason);
        }
        String str13 = this.btc_limit;
        if (str13 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str13, "btc_limit=", arrayList);
        }
        CrossCurrencyRewardInfo crossCurrencyRewardInfo = this.cross_currency_reward_info;
        if (crossCurrencyRewardInfo != null) {
            arrayList.add("cross_currency_reward_info=" + crossCurrencyRewardInfo);
        }
        LoyaltyActivityRenderData loyaltyActivityRenderData = this.loyalty_activity_render_data;
        if (loyaltyActivityRenderData != null) {
            arrayList.add("loyalty_activity_render_data=" + loyaltyActivityRenderData);
        }
        InvestPaymentRenderData investPaymentRenderData = this.invest_payment_render_data;
        if (investPaymentRenderData != null) {
            arrayList.add("invest_payment_render_data=" + investPaymentRenderData);
        }
        TransactionAmountHistory transactionAmountHistory = this.transaction_amount_history;
        if (transactionAmountHistory != null) {
            arrayList.add("transaction_amount_history=" + transactionAmountHistory);
        }
        Long l21 = this.outstanding_until;
        if (l21 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("outstanding_until=", l21, arrayList);
        }
        CryptoOrderRenderData cryptoOrderRenderData = this.crypto_order_render_data;
        if (cryptoOrderRenderData != null) {
            arrayList.add("crypto_order_render_data=" + cryptoOrderRenderData);
        }
        PaperCashDepositRenderData paperCashDepositRenderData = this.paper_cash_deposit_render_data;
        if (paperCashDepositRenderData != null) {
            arrayList.add("paper_cash_deposit_render_data=" + paperCashDepositRenderData);
        }
        SponsoredAccountRenderData sponsoredAccountRenderData = this.sponsored_account_render_data;
        if (sponsoredAccountRenderData != null) {
            arrayList.add("sponsored_account_render_data=" + sponsoredAccountRenderData);
        }
        InstantPayRenderData instantPayRenderData = this.instant_pay_render_data;
        if (instantPayRenderData != null) {
            arrayList.add("instant_pay_render_data=" + instantPayRenderData);
        }
        GiftCardRenderData giftCardRenderData = this.gift_card_render_data;
        if (giftCardRenderData != null) {
            arrayList.add("gift_card_render_data=" + giftCardRenderData);
        }
        NewDeviceLoginRenderData newDeviceLoginRenderData = this.new_device_login_render_data;
        if (newDeviceLoginRenderData != null) {
            arrayList.add("new_device_login_render_data=" + newDeviceLoginRenderData);
        }
        TimelineRenderData timelineRenderData = this.timeline_render_data;
        if (timelineRenderData != null) {
            arrayList.add("timeline_render_data=" + timelineRenderData);
        }
        DisputedTransactionRenderData disputedTransactionRenderData = this.disputed_transaction_render_data;
        if (disputedTransactionRenderData != null) {
            arrayList.add("disputed_transaction_render_data=" + disputedTransactionRenderData);
        }
        InvestingAutomationTriggerRenderData investingAutomationTriggerRenderData = this.investing_automation_trigger_render_data;
        if (investingAutomationTriggerRenderData != null) {
            arrayList.add("investing_automation_trigger_render_data=" + investingAutomationTriggerRenderData);
        }
        InvestingAutomationExecutionRenderData investingAutomationExecutionRenderData = this.investing_automation_execution_render_data;
        if (investingAutomationExecutionRenderData != null) {
            arrayList.add("investing_automation_execution_render_data=" + investingAutomationExecutionRenderData);
        }
        AfterPayRenderData afterPayRenderData = this.afterpay_render_data;
        if (afterPayRenderData != null) {
            arrayList.add("afterpay_render_data=" + afterPayRenderData);
        }
        CashAppPayOrderRenderData cashAppPayOrderRenderData = this.cash_app_pay_order_render_data;
        if (cashAppPayOrderRenderData != null) {
            arrayList.add("cash_app_pay_order_render_data=" + cashAppPayOrderRenderData);
        }
        CashAppPayPaymentRenderData cashAppPayPaymentRenderData = this.cash_app_pay_payment_render_data;
        if (cashAppPayPaymentRenderData != null) {
            arrayList.add("cash_app_pay_payment_render_data=" + cashAppPayPaymentRenderData);
        }
        CashAppPayRefundRenderData cashAppPayRefundRenderData = this.cash_app_pay_refund_render_data;
        if (cashAppPayRefundRenderData != null) {
            arrayList.add("cash_app_pay_refund_render_data=" + cashAppPayRefundRenderData);
        }
        CashAppPayPaymentScheduleRenderData cashAppPayPaymentScheduleRenderData = this.cash_app_pay_payment_schedule_render_data;
        if (cashAppPayPaymentScheduleRenderData != null) {
            arrayList.add("cash_app_pay_payment_schedule_render_data=" + cashAppPayPaymentScheduleRenderData);
        }
        CashAppPayPayoutRenderData cashAppPayPayoutRenderData = this.cash_app_pay_payout_render_data;
        if (cashAppPayPayoutRenderData != null) {
            arrayList.add("cash_app_pay_payout_render_data=" + cashAppPayPayoutRenderData);
        }
        CommerceOrderRenderData commerceOrderRenderData = this.commerce_order_render_data;
        if (commerceOrderRenderData != null) {
            arrayList.add("commerce_order_render_data=" + commerceOrderRenderData);
        }
        CashAppPayRenderData cashAppPayRenderData = this.cash_app_pay_render_data;
        if (cashAppPayRenderData != null) {
            arrayList.add("cash_app_pay_render_data=" + cashAppPayRenderData);
        }
        ViewContextRenderData viewContextRenderData = this.view_context_render_data;
        if (viewContextRenderData != null) {
            arrayList.add("view_context_render_data=" + viewContextRenderData);
        }
        GenericNonPaymentRenderData genericNonPaymentRenderData = this.generic_non_payment_render_data;
        if (genericNonPaymentRenderData != null) {
            arrayList.add("generic_non_payment_render_data=" + genericNonPaymentRenderData);
        }
        SavingsTransferRenderData savingsTransferRenderData = this.savings_transfer_render_data;
        if (savingsTransferRenderData != null) {
            arrayList.add("savings_transfer_render_data=" + savingsTransferRenderData);
        }
        SavingsInterestPaymentRenderData savingsInterestPaymentRenderData = this.savings_interest_payment_render_data;
        if (savingsInterestPaymentRenderData != null) {
            arrayList.add("savings_interest_payment_render_data=" + savingsInterestPaymentRenderData);
        }
        RemittancePaymentRenderData remittancePaymentRenderData = this.remittance_payment_render_data;
        if (remittancePaymentRenderData != null) {
            arrayList.add("remittance_payment_render_data=" + remittancePaymentRenderData);
        }
        GroupActivityRenderData groupActivityRenderData = this.group_activity_render_data;
        if (groupActivityRenderData != null) {
            arrayList.add("group_activity_render_data=" + groupActivityRenderData);
        }
        String str14 = this.caller_customer_token;
        if (str14 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str14, "caller_customer_token=", arrayList);
        }
        ActivityToken activityToken = this.activity_token;
        if (activityToken != null) {
            arrayList.add("activity_token=" + activityToken);
        }
        ActivityScope activityScope = this.activity_scope;
        if (activityScope != null) {
            arrayList.add("activity_scope=" + activityScope);
        }
        TransactionAuthRenderData transactionAuthRenderData = this.transaction_auth_render_data;
        if (transactionAuthRenderData != null) {
            arrayList.add("transaction_auth_render_data=" + transactionAuthRenderData);
        }
        List list3 = this.balance_impacts;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("balance_impacts=", arrayList, list3);
        }
        CouponActivityRenderData couponActivityRenderData = this.coupon_activity_render_data;
        if (couponActivityRenderData != null) {
            arrayList.add("coupon_activity_render_data=" + couponActivityRenderData);
        }
        InvestCorrectionRenderData investCorrectionRenderData = this.invest_correction_render_data;
        if (investCorrectionRenderData != null) {
            arrayList.add("invest_correction_render_data=" + investCorrectionRenderData);
        }
        FiatP2pRenderData fiatP2pRenderData = this.fiat_p2p_render_data;
        if (fiatP2pRenderData != null) {
            arrayList.add("fiat_p2p_render_data=" + fiatP2pRenderData);
        }
        CheckDepositRenderData checkDepositRenderData = this.check_deposit_render_data;
        if (checkDepositRenderData != null) {
            arrayList.add("check_deposit_render_data=" + checkDepositRenderData);
        }
        LocalizableString localizableString = this.localizable_note;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_note=", localizableString, arrayList);
        }
        OverdraftRenderData overdraftRenderData = this.overdraft_render_data;
        if (overdraftRenderData != null) {
            arrayList.add("overdraft_render_data=" + overdraftRenderData);
        }
        PaymentPlanEligibilityRenderData paymentPlanEligibilityRenderData = this.payment_plan_eligibility_render_data;
        if (paymentPlanEligibilityRenderData != null) {
            arrayList.add("payment_plan_eligibility_render_data=" + paymentPlanEligibilityRenderData);
        }
        FeatureInvitationRenderData featureInvitationRenderData = this.feature_invitation_render_data;
        if (featureInvitationRenderData != null) {
            arrayList.add("feature_invitation_render_data=" + featureInvitationRenderData);
        }
        TTPPaymentRenderData tTPPaymentRenderData = this.ttp_payment_render_data;
        if (tTPPaymentRenderData != null) {
            arrayList.add("ttp_payment_render_data=" + tTPPaymentRenderData);
        }
        PersonalizationRenderData personalizationRenderData = this.personalization_render_data;
        if (personalizationRenderData != null) {
            arrayList.add("personalization_render_data=" + personalizationRenderData);
        }
        AutoAllocationRenderData autoAllocationRenderData = this.auto_allocation_render_data;
        if (autoAllocationRenderData != null) {
            arrayList.add("auto_allocation_render_data=" + autoAllocationRenderData);
        }
        BillPayRenderData billPayRenderData = this.bill_pay_render_data;
        if (billPayRenderData != null) {
            arrayList.add("bill_pay_render_data=" + billPayRenderData);
        }
        Boolean bool17 = this.is_background;
        if (bool17 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_background=", bool17, arrayList);
        }
        Boolean bool18 = this.has_error_context;
        if (bool18 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("has_error_context=", bool18, arrayList);
        }
        Boolean bool19 = this.is_recurring;
        if (bool19 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_recurring=", bool19, arrayList);
        }
        BitcoinOnchainRenderData bitcoinOnchainRenderData = this.bitcoin_onchain_render_data;
        if (bitcoinOnchainRenderData != null) {
            arrayList.add("bitcoin_onchain_render_data=" + bitcoinOnchainRenderData);
        }
        Boolean bool20 = this.is_deposit_reversal;
        if (bool20 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_deposit_reversal=", bool20, arrayList);
        }
        LendingCardRenderData lendingCardRenderData = this.lending_card_render_data;
        if (lendingCardRenderData != null) {
            arrayList.add("lending_card_render_data=" + lendingCardRenderData);
        }
        String str15 = this.raw_merchant_descriptor;
        if (str15 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str15, "raw_merchant_descriptor=", arrayList);
        }
        CashAppLocalPaymentRenderData cashAppLocalPaymentRenderData = this.cash_app_local_payment_render_data;
        if (cashAppLocalPaymentRenderData != null) {
            arrayList.add("cash_app_local_payment_render_data=" + cashAppLocalPaymentRenderData);
        }
        CashAppLocalOrderRenderData cashAppLocalOrderRenderData = this.cash_app_local_order_render_data;
        if (cashAppLocalOrderRenderData != null) {
            arrayList.add("cash_app_local_order_render_data=" + cashAppLocalOrderRenderData);
        }
        AchRenderData achRenderData = this.ach_render_data;
        if (achRenderData != null) {
            arrayList.add("ach_render_data=" + achRenderData);
        }
        BitcoinLightningRenderData bitcoinLightningRenderData = this.bitcoin_lightning_render_data;
        if (bitcoinLightningRenderData != null) {
            arrayList.add("bitcoin_lightning_render_data=" + bitcoinLightningRenderData);
        }
        P2pPoolRenderData p2pPoolRenderData = this.p2p_pool_render_data;
        if (p2pPoolRenderData != null) {
            arrayList.add("p2p_pool_render_data=" + p2pPoolRenderData);
        }
        P2pPoolMemberRenderData p2pPoolMemberRenderData = this.p2p_pool_member_render_data;
        if (p2pPoolMemberRenderData != null) {
            arrayList.add("p2p_pool_member_render_data=" + p2pPoolMemberRenderData);
        }
        ActivityRowRenderData activityRowRenderData = this.activity_row_render_data;
        if (activityRowRenderData != null) {
            arrayList.add("activity_row_render_data=" + activityRowRenderData);
        }
        Money money11 = this.impact;
        if (money11 != null) {
            Matcher$$ExternalSyntheticOutline0.m("impact=", money11, arrayList);
        }
        Money money12 = this.current_balance;
        if (money12 != null) {
            Matcher$$ExternalSyntheticOutline0.m("current_balance=", money12, arrayList);
        }
        P2pPoolContributionRenderData p2pPoolContributionRenderData = this.p2p_pool_contribution_render_data;
        if (p2pPoolContributionRenderData != null) {
            arrayList.add("p2p_pool_contribution_render_data=" + p2pPoolContributionRenderData);
        }
        CustomerAdjustmentRenderData customerAdjustmentRenderData = this.customer_adjustment_render_data;
        if (customerAdjustmentRenderData != null) {
            arrayList.add("customer_adjustment_render_data=" + customerAdjustmentRenderData);
        }
        StablecoinRenderData stablecoinRenderData = this.stablecoin_render_data;
        if (stablecoinRenderData != null) {
            arrayList.add("stablecoin_render_data=" + stablecoinRenderData);
        }
        RecurringTransferRenderData recurringTransferRenderData = this.recurring_transfer_render_data;
        if (recurringTransferRenderData != null) {
            arrayList.add("recurring_transfer_render_data=" + recurringTransferRenderData);
        }
        LiftedRestrictionTransferRenderData liftedRestrictionTransferRenderData = this.lifted_restriction_transfer_render_data;
        if (liftedRestrictionTransferRenderData != null) {
            arrayList.add("lifted_restriction_transfer_render_data=" + liftedRestrictionTransferRenderData);
        }
        RestrictedCashInTransferRenderData restrictedCashInTransferRenderData = this.restricted_cash_in_transfer_render_data;
        if (restrictedCashInTransferRenderData != null) {
            arrayList.add("restricted_cash_in_transfer_render_data=" + restrictedCashInTransferRenderData);
        }
        CashAppTagRenderData cashAppTagRenderData = this.cash_app_tag_render_data;
        if (cashAppTagRenderData != null) {
            arrayList.add("cash_app_tag_render_data=" + cashAppTagRenderData);
        }
        Long l22 = this.counterparty_viewed_at;
        if (l22 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("counterparty_viewed_at=", l22, arrayList);
        }
        CashLiteCardTransactionRenderData cashLiteCardTransactionRenderData = this.cash_lite_card_transaction_render_data;
        if (cashLiteCardTransactionRenderData != null) {
            arrayList.add("cash_lite_card_transaction_render_data=" + cashLiteCardTransactionRenderData);
        }
        Boolean bool21 = this.is_send_to_cashtag_oct;
        if (bool21 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_send_to_cashtag_oct=", bool21, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentRenderData{", "}", 0, null, null, 56);
    }
}
