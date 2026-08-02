package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneta.api.v1_0.CashInRequest;
import com.squareup.protos.cash.disputron.core.DisputeClaim$Reason;
import com.squareup.protos.cash.postcard.CashAppCard;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.bankbook.Institution;
import com.squareup.protos.franklin.common.Trigger;
import com.squareup.protos.franklin.data.LinkResult;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.protos.hieroglyph.KeyScope;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class DisputedTransactionRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DisputedTransactionRenderData> CREATOR;
    public final String appealed_claim_token;
    public final List captures;
    public final Boolean claim_withdrawn;
    public final String customer_explanation;
    public final Long dispute_deadline_at;
    public final Long first_credit_issued_at;
    public final Boolean has_dispute;
    public final Boolean is_appeals_enabled;
    public final Money total_credit_issued;
    public final DisputeStatus transaction_dispute_status;

    public enum DisputeStatus implements WireEnum {
        PENDING(1),
        IN_PROGRESS(2),
        PARTIALLY_REFUNDED(3),
        REFUNDED(4),
        DECLINED(5),
        REMOVED(6),
        CAPTURE_AMOUNT_MISMATCH(7),
        WITHDRAWN(8),
        TRANSACTION_CANCELED(9);

        public final int value;
        public static final UiControl.Type.Companion Companion = new UiControl.Type.Companion();
        public static final DisputedTransactionRenderData$DisputeStatus$Companion$ADAPTER$1 ADAPTER = new DisputedTransactionRenderData$DisputeStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DisputeStatus.class), Syntax.PROTO_2, null);

        DisputeStatus(int i) {
            this.value = i;
        }

        public static final DisputeStatus fromValue(int i) {
            Companion.getClass();
            return UiControl.Type.Companion.m3964fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class DisputedCapture extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DisputedCapture> CREATOR;
        public final Money capture_amount;
        public final Long capture_date;
        public final List capture_dispute_history;

        public final class DisputeCase extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<DisputeCase> CREATOR;
            public final DenialReason denial_reason;
            public final Money disputed_amount;
            public final Long disputed_at;
            public final Long finalized_at;
            public final Money permanent_credit_issued;
            public final Money provisional_credit_issued;
            public final Long provisional_credit_issued_at;
            public final Long provisional_credit_will_be_withdrawn_at;
            public final Money provisional_credit_withdrawn;
            public final Long provisional_credit_withdrawn_at;
            public final DisputeClaim$Reason reason;
            public final Long review_completed_at;
            public final Long review_initiated_at;
            public final String salesforce_case_number;
            public final State state;
            public final WithdrawalReason withdrawal_reason;

            public enum DenialReason implements WireEnum {
                TRANSACTION_AUTHORIZED_BY_YOU(1),
                TRANSACTION_PROCESSED_PROPERLY(2),
                MERCHANT_FULFILLED_OBLIGATIONS(3),
                ATM_DISPENSED_PROPERLY(4),
                CORRECT_NON_REFUND(5),
                CANCELED_DUE_TO_MERCHANT_REFUND(6),
                WITHDRAWN_BY_YOU(7),
                TERMS_OF_SERVICE_TIMEFRAME_EXCEEDED_FRAUD(8),
                TERMS_OF_SERVICE_TIMEFRAME_EXCEEDED_NON_FRAUD(9),
                DISPUTE_ABUSE(20),
                FRAUD_60_DAY_P2P(28),
                AUTHORIZED_USER_P2P(29),
                CHARGEBACK_ACCEPTED_P2P(30),
                CHARGEBACK_PENDING_P2P(31),
                CLAIM_WITHDRAWN_P2P(32),
                DEVICE_ACTIVITY_P2P(33),
                DEVICE_IN_POSSESSION_P2P(34),
                MATCHING_FUNDS_P2P(35),
                PIN_USAGE_P2P(36),
                SUBSEQUENT_ACTIVITY_P2P(37),
                USER_ERROR_P2P(38),
                DISPUTE_ABUSE_VIRAL_SCAM(39),
                IDENTITY_VERIFICATION_FAILED(40),
                IDENTITY_VERIFICATION_TIMED_OUT(41),
                GOODS_OR_SERVICES_NOT_RECEIVED(42),
                CUSTOMER_AUTHENTICATED_TRANSACTION(43),
                MERCHANT_REFUND(44),
                DUPLICATE_TRANSACTION(45),
                SPONSOR_IDENTITY_VERIFICATION_FAILED(46),
                SPONSOR_IDENTITY_VERIFICATION_TIMED_OUT(47),
                FRAUDULENT_OR_FALSE_CLAIM_P2P(48),
                SEV_RESPONSE_GENERIC_0(49),
                SEV_RESPONSE_GENERIC_1(50),
                SEV_RESPONSE_GENERIC_2(51),
                SEV_RESPONSE_GENERIC_3(52),
                SEV_RESPONSE_GENERIC_4(53),
                SEV_RESPONSE_GENERIC_5(54),
                SEV_RESPONSE_GENERIC_6(55),
                SEV_RESPONSE_GENERIC_7(56),
                SEV_RESPONSE_GENERIC_8(57),
                SEV_RESPONSE_GENERIC_9(58),
                SEV_RESPONSE_GENERIC_P2P_0(59),
                SEV_RESPONSE_GENERIC_P2P_1(60),
                SEV_RESPONSE_GENERIC_P2P_2(61),
                SEV_RESPONSE_GENERIC_P2P_3(62),
                SEV_RESPONSE_GENERIC_P2P_4(63),
                SEV_RESPONSE_GENERIC_P2P_5(64),
                CONFLICTING_SUBMISSION(66),
                CONFLICTING_TIMEFRAME(67),
                MATCHING_ACCOUNT(68),
                RECIPIENT_RELATIONSHIP(69),
                REFUND_EVIDENCE(70),
                RETURNED_FUNDS(71),
                AUTHORIZED_PAYMENT(72),
                SCAM_INSUFFICIENT_EVIDENCE(74),
                SCAM_EVIDENCE_AGAINST(75),
                SCAM_FRAUDULENT_OR_FALSE_CLAIM(76),
                SCAM_USER_ERROR(77),
                SCAM_CLAIM_WITHDRAWN(78),
                SCAM_OUTSIDE_OF_REPORT_WINDOW_TIMEFRAME(79),
                SCAM_CUSTOMER_WAS_WARNED_OF_POTENTIAL_SCAM(80),
                SCAM_PRIOR_BLOCKS(81),
                SCAM_TERMS_OF_SERVICE_VIOLATION(82),
                SCAM_ALREADY_REFUNDED(83),
                SCAM_OVER_REIMBURSEMENT_THRESHOLD(84),
                SCAM_NOT_COVERED_IN_POLICY(85),
                SCAM_CLAIM_ABUSE(113),
                SCAM_NOT_A_SCAM(114),
                POSSESSION_TIMEFRAME(87),
                RECIPIENT_REIMBURSEMENT(88),
                CONTRADICTING_RESUBMISSION_DETAILS(89),
                SHARED_IDENTITY(90),
                INCONSISTENT_RECOVERY_NARRATIVE(91),
                SUBSEQUENT_DEVICE_ACTIVITY(92),
                SECURITY_LOCK(93),
                DISPUTE_ABUSE_P2P(94),
                CAP_AUTHORIZED_USER(95),
                CAP_CONTRADICTING_RESUBMISSION_DETAILS(96),
                CAP_DEVICE_IN_POSSESSION(97),
                CAP_SHARED_IDENTITY(98),
                CAP_INCONSISTENT_RECOVERY_NARRATIVE(99),
                CAP_POSSESSION_TIMEFRAME(100),
                CAP_SECURITY_LOCK(101),
                CAP_USER_ERROR(102),
                CAP_DISPUTE_ABUSE(103),
                CAP_FRAUD_60_DAY(104),
                CAP_CLAIM_WITHDRAWN(105),
                CAP_CHARGEBACK_ACCEPTED(106),
                CAP_MERCHANT_REFUND(107),
                CAP_CONFLICTING_SUBMISSION(108),
                CAP_CONFLICTING_TIMEFRAME(109),
                CAP_RETURNED_FUNDS(110),
                CAP_REFUND_EVIDENCE(111),
                CAP_ALREADY_CORRECTED_MERCHANT_REFUND(112);

                public final int value;
                public static final LinkResult.Companion Companion = new LinkResult.Companion();
                public static final DisputedTransactionRenderData$DisputedCapture$DisputeCase$DenialReason$Companion$ADAPTER$1 ADAPTER = new DisputedTransactionRenderData$DisputedCapture$DisputeCase$DenialReason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DenialReason.class), Syntax.PROTO_2, null);

                DenialReason(int i) {
                    this.value = i;
                }

                public static final DenialReason fromValue(int i) {
                    Companion.getClass();
                    return LinkResult.Companion.fromValue(i);
                }

                @Override // com.squareup.wire.WireEnum
                public final int getValue() {
                    return this.value;
                }
            }

            public enum State implements WireEnum {
                PENDING(1),
                UNDER_REVIEW(2),
                APPROVED(3),
                DENIED(4),
                WITHDRAWN(5);

                public final int value;
                public static final Trigger.Companion Companion = new Trigger.Companion();
                public static final DisputedTransactionRenderData$DisputedCapture$DisputeCase$State$Companion$ADAPTER$1 ADAPTER = new DisputedTransactionRenderData$DisputedCapture$DisputeCase$State$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(State.class), Syntax.PROTO_2, null);

                State(int i) {
                    this.value = i;
                }

                public static final State fromValue(int i) {
                    Companion.getClass();
                    return Trigger.Companion.m3949fromValue(i);
                }

                @Override // com.squareup.wire.WireEnum
                public final int getValue() {
                    return this.value;
                }
            }

            public enum WithdrawalReason implements WireEnum {
                AGENT_REMOVED_TRANSACTION(1),
                SKIPPED_IN_PARTIAL_DISPUTE(2),
                CUSTOMER_REQUESTED_WITHDRAWAL(3);

                public final int value;
                public static final KeyScope.Companion Companion = new KeyScope.Companion();
                public static final DisputedTransactionRenderData$DisputedCapture$DisputeCase$WithdrawalReason$Companion$ADAPTER$1 ADAPTER = new DisputedTransactionRenderData$DisputedCapture$DisputeCase$WithdrawalReason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(WithdrawalReason.class), Syntax.PROTO_2, null);

                WithdrawalReason(int i) {
                    this.value = i;
                }

                public static final WithdrawalReason fromValue(int i) {
                    Companion.getClass();
                    if (i == 1) {
                        return AGENT_REMOVED_TRANSACTION;
                    }
                    if (i == 2) {
                        return SKIPPED_IN_PARTIAL_DISPUTE;
                    }
                    if (i != 3) {
                        return null;
                    }
                    return CUSTOMER_REQUESTED_WITHDRAWAL;
                }

                @Override // com.squareup.wire.WireEnum
                public final int getValue() {
                    return this.value;
                }
            }

            static {
                DisputedTransactionRenderData$DisputedCapture$DisputeCase$Companion$ADAPTER$1 disputedTransactionRenderData$DisputedCapture$DisputeCase$Companion$ADAPTER$1 = new DisputedTransactionRenderData$DisputedCapture$DisputeCase$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DisputeCase.class), "type.googleapis.com/squareup.franklin.DisputedTransactionRenderData.DisputedCapture.DisputeCase", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
                ADAPTER = disputedTransactionRenderData$DisputedCapture$DisputeCase$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(disputedTransactionRenderData$DisputedCapture$DisputeCase$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DisputeCase(Long l, Money money, DisputeClaim$Reason disputeClaim$Reason, Long l2, Long l3, Money money2, Long l4, Money money3, Long l5, Money money4, Long l6, String str, State state, DenialReason denialReason, WithdrawalReason withdrawalReason, Long l7, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.disputed_at = l;
                this.disputed_amount = money;
                this.reason = disputeClaim$Reason;
                this.review_initiated_at = l2;
                this.review_completed_at = l3;
                this.provisional_credit_issued = money2;
                this.provisional_credit_issued_at = l4;
                this.provisional_credit_withdrawn = money3;
                this.provisional_credit_withdrawn_at = l5;
                this.permanent_credit_issued = money4;
                this.finalized_at = l6;
                this.salesforce_case_number = str;
                this.state = state;
                this.denial_reason = denialReason;
                this.withdrawal_reason = withdrawalReason;
                this.provisional_credit_will_be_withdrawn_at = l7;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof DisputeCase)) {
                    return false;
                }
                DisputeCase disputeCase = (DisputeCase) obj;
                return Intrinsics.areEqual(unknownFields(), disputeCase.unknownFields()) && Intrinsics.areEqual(this.disputed_at, disputeCase.disputed_at) && Intrinsics.areEqual(this.disputed_amount, disputeCase.disputed_amount) && this.reason == disputeCase.reason && Intrinsics.areEqual(this.review_initiated_at, disputeCase.review_initiated_at) && Intrinsics.areEqual(this.review_completed_at, disputeCase.review_completed_at) && Intrinsics.areEqual(this.provisional_credit_issued, disputeCase.provisional_credit_issued) && Intrinsics.areEqual(this.provisional_credit_issued_at, disputeCase.provisional_credit_issued_at) && Intrinsics.areEqual(this.provisional_credit_withdrawn, disputeCase.provisional_credit_withdrawn) && Intrinsics.areEqual(this.provisional_credit_withdrawn_at, disputeCase.provisional_credit_withdrawn_at) && Intrinsics.areEqual(this.permanent_credit_issued, disputeCase.permanent_credit_issued) && Intrinsics.areEqual(this.finalized_at, disputeCase.finalized_at) && Intrinsics.areEqual(this.salesforce_case_number, disputeCase.salesforce_case_number) && this.state == disputeCase.state && this.denial_reason == disputeCase.denial_reason && this.withdrawal_reason == disputeCase.withdrawal_reason && Intrinsics.areEqual(this.provisional_credit_will_be_withdrawn_at, disputeCase.provisional_credit_will_be_withdrawn_at);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Long l = this.disputed_at;
                int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
                Money money = this.disputed_amount;
                int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
                DisputeClaim$Reason disputeClaim$Reason = this.reason;
                int hashCode4 = (hashCode3 + (disputeClaim$Reason != null ? disputeClaim$Reason.hashCode() : 0)) * 37;
                Long l2 = this.review_initiated_at;
                int hashCode5 = (hashCode4 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
                Long l3 = this.review_completed_at;
                int hashCode6 = (hashCode5 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
                Money money2 = this.provisional_credit_issued;
                int hashCode7 = (hashCode6 + (money2 != null ? money2.hashCode() : 0)) * 37;
                Long l4 = this.provisional_credit_issued_at;
                int hashCode8 = (hashCode7 + (l4 != null ? Long.hashCode(l4.longValue()) : 0)) * 37;
                Money money3 = this.provisional_credit_withdrawn;
                int hashCode9 = (hashCode8 + (money3 != null ? money3.hashCode() : 0)) * 37;
                Long l5 = this.provisional_credit_withdrawn_at;
                int hashCode10 = (hashCode9 + (l5 != null ? Long.hashCode(l5.longValue()) : 0)) * 37;
                Money money4 = this.permanent_credit_issued;
                int hashCode11 = (hashCode10 + (money4 != null ? money4.hashCode() : 0)) * 37;
                Long l6 = this.finalized_at;
                int hashCode12 = (hashCode11 + (l6 != null ? Long.hashCode(l6.longValue()) : 0)) * 37;
                String str = this.salesforce_case_number;
                int hashCode13 = (hashCode12 + (str != null ? str.hashCode() : 0)) * 37;
                State state = this.state;
                int hashCode14 = (hashCode13 + (state != null ? state.hashCode() : 0)) * 37;
                DenialReason denialReason = this.denial_reason;
                int hashCode15 = (hashCode14 + (denialReason != null ? denialReason.hashCode() : 0)) * 37;
                WithdrawalReason withdrawalReason = this.withdrawal_reason;
                int hashCode16 = (hashCode15 + (withdrawalReason != null ? withdrawalReason.hashCode() : 0)) * 37;
                Long l7 = this.provisional_credit_will_be_withdrawn_at;
                int hashCode17 = hashCode16 + (l7 != null ? Long.hashCode(l7.longValue()) : 0);
                this.hashCode = hashCode17;
                return hashCode17;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                CashAppCard.Builder builder = new CashAppCard.Builder(1);
                builder.version_token = this.disputed_at;
                builder.last_four = this.disputed_amount;
                builder.cardholder_name = this.reason;
                builder.apple_pay_identifier = this.review_initiated_at;
                builder.apple_pay_description = this.review_completed_at;
                builder.card_theme_token = this.provisional_credit_issued;
                builder.customization_image_path = this.provisional_credit_issued_at;
                builder.enabled = this.provisional_credit_withdrawn;
                builder.sponsor_locked = this.provisional_credit_withdrawn_at;
                builder.activated = this.permanent_credit_issued;
                builder.isCardExpired = this.finalized_at;
                builder.card_token = this.salesforce_case_number;
                builder.card_type = this.state;
                builder.physical_card_order_state = this.denial_reason;
                builder.externalIssuingAccountState = this.withdrawal_reason;
                builder.payment_method = this.provisional_credit_will_be_withdrawn_at;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Long l = this.disputed_at;
                if (l != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("disputed_at=", l, arrayList);
                }
                Money money = this.disputed_amount;
                if (money != null) {
                    Matcher$$ExternalSyntheticOutline0.m("disputed_amount=", money, arrayList);
                }
                DisputeClaim$Reason disputeClaim$Reason = this.reason;
                if (disputeClaim$Reason != null) {
                    arrayList.add("reason=" + disputeClaim$Reason);
                }
                Long l2 = this.review_initiated_at;
                if (l2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("review_initiated_at=", l2, arrayList);
                }
                Long l3 = this.review_completed_at;
                if (l3 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("review_completed_at=", l3, arrayList);
                }
                Money money2 = this.provisional_credit_issued;
                if (money2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("provisional_credit_issued=", money2, arrayList);
                }
                Long l4 = this.provisional_credit_issued_at;
                if (l4 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("provisional_credit_issued_at=", l4, arrayList);
                }
                Money money3 = this.provisional_credit_withdrawn;
                if (money3 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("provisional_credit_withdrawn=", money3, arrayList);
                }
                Long l5 = this.provisional_credit_withdrawn_at;
                if (l5 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("provisional_credit_withdrawn_at=", l5, arrayList);
                }
                Money money4 = this.permanent_credit_issued;
                if (money4 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("permanent_credit_issued=", money4, arrayList);
                }
                Long l6 = this.finalized_at;
                if (l6 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("finalized_at=", l6, arrayList);
                }
                String str = this.salesforce_case_number;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "salesforce_case_number=", arrayList);
                }
                State state = this.state;
                if (state != null) {
                    arrayList.add("state=" + state);
                }
                DenialReason denialReason = this.denial_reason;
                if (denialReason != null) {
                    arrayList.add("denial_reason=" + denialReason);
                }
                WithdrawalReason withdrawalReason = this.withdrawal_reason;
                if (withdrawalReason != null) {
                    arrayList.add("withdrawal_reason=" + withdrawalReason);
                }
                Long l7 = this.provisional_credit_will_be_withdrawn_at;
                if (l7 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("provisional_credit_will_be_withdrawn_at=", l7, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "DisputeCase{", "}", 0, null, null, 56);
            }
        }

        static {
            DisputedTransactionRenderData$DisputedCapture$Companion$ADAPTER$1 disputedTransactionRenderData$DisputedCapture$Companion$ADAPTER$1 = new DisputedTransactionRenderData$DisputedCapture$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DisputedCapture.class), "type.googleapis.com/squareup.franklin.DisputedTransactionRenderData.DisputedCapture", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = disputedTransactionRenderData$DisputedCapture$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(disputedTransactionRenderData$DisputedCapture$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisputedCapture(Money money, Long l, List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.capture_amount = money;
            this.capture_date = l;
            this.capture_dispute_history = TransactorKt.immutableCopyOf("capture_dispute_history", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DisputedCapture)) {
                return false;
            }
            DisputedCapture disputedCapture = (DisputedCapture) obj;
            return Intrinsics.areEqual(unknownFields(), disputedCapture.unknownFields()) && Intrinsics.areEqual(this.capture_amount, disputedCapture.capture_amount) && Intrinsics.areEqual(this.capture_date, disputedCapture.capture_date) && Intrinsics.areEqual(this.capture_dispute_history, disputedCapture.capture_dispute_history);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Money money = this.capture_amount;
            int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
            Long l = this.capture_date;
            int hashCode3 = this.capture_dispute_history.hashCode() + ((hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Institution.Builder builder = new Institution.Builder(16, false);
            builder.institution_token = this.capture_amount;
            builder.display_info = this.capture_date;
            builder.help_menu_items = this.capture_dispute_history;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Money money = this.capture_amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("capture_amount=", money, arrayList);
            }
            Long l = this.capture_date;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("capture_date=", l, arrayList);
            }
            List list = this.capture_dispute_history;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("capture_dispute_history=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DisputedCapture{", "}", 0, null, null, 56);
        }
    }

    static {
        DisputedTransactionRenderData$Companion$ADAPTER$1 disputedTransactionRenderData$Companion$ADAPTER$1 = new DisputedTransactionRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DisputedTransactionRenderData.class), "type.googleapis.com/squareup.franklin.DisputedTransactionRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = disputedTransactionRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(disputedTransactionRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisputedTransactionRenderData(DisputeStatus disputeStatus, Money money, List list, Long l, Long l2, String str, Boolean bool, String str2, Boolean bool2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.transaction_dispute_status = disputeStatus;
        this.total_credit_issued = money;
        this.dispute_deadline_at = l;
        this.first_credit_issued_at = l2;
        this.customer_explanation = str;
        this.has_dispute = bool;
        this.appealed_claim_token = str2;
        this.is_appeals_enabled = bool2;
        this.claim_withdrawn = bool3;
        this.captures = TransactorKt.immutableCopyOf("captures", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DisputedTransactionRenderData)) {
            return false;
        }
        DisputedTransactionRenderData disputedTransactionRenderData = (DisputedTransactionRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), disputedTransactionRenderData.unknownFields()) && this.transaction_dispute_status == disputedTransactionRenderData.transaction_dispute_status && Intrinsics.areEqual(this.total_credit_issued, disputedTransactionRenderData.total_credit_issued) && Intrinsics.areEqual(this.captures, disputedTransactionRenderData.captures) && Intrinsics.areEqual(this.dispute_deadline_at, disputedTransactionRenderData.dispute_deadline_at) && Intrinsics.areEqual(this.first_credit_issued_at, disputedTransactionRenderData.first_credit_issued_at) && Intrinsics.areEqual(this.customer_explanation, disputedTransactionRenderData.customer_explanation) && Intrinsics.areEqual(this.has_dispute, disputedTransactionRenderData.has_dispute) && Intrinsics.areEqual(this.appealed_claim_token, disputedTransactionRenderData.appealed_claim_token) && Intrinsics.areEqual(this.is_appeals_enabled, disputedTransactionRenderData.is_appeals_enabled) && Intrinsics.areEqual(this.claim_withdrawn, disputedTransactionRenderData.claim_withdrawn);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        DisputeStatus disputeStatus = this.transaction_dispute_status;
        int hashCode2 = (hashCode + (disputeStatus != null ? disputeStatus.hashCode() : 0)) * 37;
        Money money = this.total_credit_issued;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (money != null ? money.hashCode() : 0)) * 37, 37, this.captures);
        Long l = this.dispute_deadline_at;
        int hashCode3 = (m + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.first_credit_issued_at;
        int hashCode4 = (hashCode3 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        String str = this.customer_explanation;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.has_dispute;
        int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str2 = this.appealed_claim_token;
        int hashCode7 = (hashCode6 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Boolean bool2 = this.is_appeals_enabled;
        int hashCode8 = (hashCode7 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Boolean bool3 = this.claim_withdrawn;
        int hashCode9 = hashCode8 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CashInRequest.Builder builder = new CashInRequest.Builder(19);
        builder.request_context = this.transaction_dispute_status;
        builder.amount = this.total_credit_issued;
        builder.external_client_transfer_token = this.captures;
        builder.source = this.dispute_deadline_at;
        builder.target = this.first_credit_issued_at;
        builder.external_id = this.customer_explanation;
        builder.call_context = this.has_dispute;
        builder.passcode_token = this.appealed_claim_token;
        builder.forwarded_call_context = this.is_appeals_enabled;
        builder.client_verified_digital_wallet = this.claim_withdrawn;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        DisputeStatus disputeStatus = this.transaction_dispute_status;
        if (disputeStatus != null) {
            arrayList.add("transaction_dispute_status=" + disputeStatus);
        }
        Money money = this.total_credit_issued;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("total_credit_issued=", money, arrayList);
        }
        List list = this.captures;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("captures=", arrayList, list);
        }
        Long l = this.dispute_deadline_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("dispute_deadline_at=", l, arrayList);
        }
        Long l2 = this.first_credit_issued_at;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("first_credit_issued_at=", l2, arrayList);
        }
        String str = this.customer_explanation;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_explanation=", arrayList);
        }
        Boolean bool = this.has_dispute;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("has_dispute=", bool, arrayList);
        }
        String str2 = this.appealed_claim_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "appealed_claim_token=", arrayList);
        }
        Boolean bool2 = this.is_appeals_enabled;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_appeals_enabled=", bool2, arrayList);
        }
        Boolean bool3 = this.claim_withdrawn;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("claim_withdrawn=", bool3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DisputedTransactionRenderData{", "}", 0, null, null, 56);
    }
}
