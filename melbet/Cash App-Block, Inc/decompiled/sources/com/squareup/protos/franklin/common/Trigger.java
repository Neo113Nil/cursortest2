package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.BillPayRenderData;
import com.squareup.protos.franklin.common.DisputedTransactionRenderData;
import com.squareup.protos.franklin.common.LendingRenderData;
import com.squareup.protos.franklin.common.P2pPoolMemberRenderData;
import com.squareup.protos.franklin.lending.Loan;
import com.squareup.protos.franklin.onboarding.CashLocalOnboardingDeepLinkPayload;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.protos.hieroglyph.AndroidKeystoreCompatibilityReport;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum Trigger implements WireEnum {
    DO_NOT_USE_TRIGGER(0),
    APP_LAUNCH(1),
    PUSH_NOTIFICATION(2),
    IMMEDIATE_NEXT_CALL(3),
    DELAYED_NEXT_CALL(4),
    SERVER_PUSH(5),
    POLLING(6),
    USER_ACTION(7),
    WIDGET(8),
    DEBUG(9);

    public static final Trigger$Companion$ADAPTER$1 ADAPTER;
    public static final Companion Companion;
    public final int value;

    static {
        Trigger trigger = DO_NOT_USE_TRIGGER;
        Companion = new Companion();
        ADAPTER = new Trigger$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Trigger.class), Syntax.PROTO_2, trigger);
    }

    Trigger(int i) {
        this.value = i;
    }

    public static final Trigger fromValue(int i) {
        Companion.getClass();
        return Companion.m3952fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    public final class Companion {
        public static BillPayRenderData.BillCategory fromValue(int i) {
            switch (i) {
                case 1:
                    return BillPayRenderData.BillCategory.BILL_CATEGORY_DO_NOT_USE;
                case 2:
                    return BillPayRenderData.BillCategory.UTILITIES;
                case 3:
                    return BillPayRenderData.BillCategory.TELECOM;
                case 4:
                    return BillPayRenderData.BillCategory.CREDIT_CARD;
                case 5:
                    return BillPayRenderData.BillCategory.INSURANCE;
                case 6:
                    return BillPayRenderData.BillCategory.BANK_AND_FINANCE;
                case 7:
                    return BillPayRenderData.BillCategory.LOAN;
                case 8:
                    return BillPayRenderData.BillCategory.MORTGAGE;
                case 9:
                    return BillPayRenderData.BillCategory.SUBSCRIPTIONS;
                case 10:
                    return BillPayRenderData.BillCategory.CLUB_MEMBERSHIP;
                case 11:
                    return BillPayRenderData.BillCategory.HEALTHCARE_SERVICES;
                case 12:
                    return BillPayRenderData.BillCategory.EDUCATIONAL_SERVICES;
                case 13:
                    return BillPayRenderData.BillCategory.GOVERNMENT_SERVICES;
                case 14:
                    return BillPayRenderData.BillCategory.RENTAL_PROPERTIES;
                case 15:
                    return BillPayRenderData.BillCategory.HOMEOWNERS_ASSOCIATION;
                case 16:
                    return BillPayRenderData.BillCategory.HOME_SECURITY;
                case 17:
                    return BillPayRenderData.BillCategory.NON_PROFIT_ORGANIZATION;
                case 18:
                    return BillPayRenderData.BillCategory.TRANSPORTATION;
                case 19:
                    return BillPayRenderData.BillCategory.OTHER;
                case 20:
                    return BillPayRenderData.BillCategory.UNCATEGORIZED;
                case 21:
                    return BillPayRenderData.BillCategory.TAXES;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static P2pPoolMemberRenderData.MembershipStatus m3951fromValue(int i) {
            if (i == 0) {
                return P2pPoolMemberRenderData.MembershipStatus.UNKNOWN;
            }
            if (i == 1) {
                return P2pPoolMemberRenderData.MembershipStatus.ADDED_BY_OWNER;
            }
            if (i == 2) {
                return P2pPoolMemberRenderData.MembershipStatus.ADDED_THROUGH_SHARE_LINK;
            }
            if (i == 3) {
                return P2pPoolMemberRenderData.MembershipStatus.REMOVED_BY_OWNER;
            }
            if (i != 4) {
                return null;
            }
            return P2pPoolMemberRenderData.MembershipStatus.REMOVED_BY_SELF;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static Trigger m3952fromValue(int i) {
            switch (i) {
                case 0:
                    return Trigger.DO_NOT_USE_TRIGGER;
                case 1:
                    return Trigger.APP_LAUNCH;
                case 2:
                    return Trigger.PUSH_NOTIFICATION;
                case 3:
                    return Trigger.IMMEDIATE_NEXT_CALL;
                case 4:
                    return Trigger.DELAYED_NEXT_CALL;
                case 5:
                    return Trigger.SERVER_PUSH;
                case 6:
                    return Trigger.POLLING;
                case 7:
                    return Trigger.USER_ACTION;
                case 8:
                    return Trigger.WIDGET;
                case 9:
                    return Trigger.DEBUG;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static CashLocalOnboardingDeepLinkPayload.Source m3954fromValue(int i) {
            if (i == 0) {
                return CashLocalOnboardingDeepLinkPayload.Source.UNKNOWN;
            }
            if (i == 1) {
                return CashLocalOnboardingDeepLinkPayload.Source.POS;
            }
            if (i == 2) {
                return CashLocalOnboardingDeepLinkPayload.Source.RECEIPT_DIGITAL;
            }
            if (i == 3) {
                return CashLocalOnboardingDeepLinkPayload.Source.RECEIPT_PRINTED;
            }
            if (i != 4) {
                return null;
            }
            return CashLocalOnboardingDeepLinkPayload.Source.WEB;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static AndroidKeystoreCompatibilityReport.CompatibilityTest m3956fromValue(int i) {
            switch (i) {
                case 1:
                    return AndroidKeystoreCompatibilityReport.CompatibilityTest.OS_VERSION;
                case 2:
                    return AndroidKeystoreCompatibilityReport.CompatibilityTest.PHONE_MODEL;
                case 3:
                    return AndroidKeystoreCompatibilityReport.CompatibilityTest.KEY_GENERATION;
                case 4:
                    return AndroidKeystoreCompatibilityReport.CompatibilityTest.KEYMINT_VERSION;
                case 5:
                    return AndroidKeystoreCompatibilityReport.CompatibilityTest.AES_KEY_IMPORT_NO_MIN_MAC;
                case 6:
                    return AndroidKeystoreCompatibilityReport.CompatibilityTest.AES_KEY_IMPORT_WITH_MIN_MAC;
                case 7:
                    return AndroidKeystoreCompatibilityReport.CompatibilityTest.HMAC_KEY_IMPORT_NO_MIN_MAC;
                case 8:
                    return AndroidKeystoreCompatibilityReport.CompatibilityTest.HMAC_KEY_IMPORT_WITH_MIN_MAC;
                case 9:
                    return AndroidKeystoreCompatibilityReport.CompatibilityTest.AES_KEY_ENCRYPTION;
                case 10:
                    return AndroidKeystoreCompatibilityReport.CompatibilityTest.HMAC_KEY_SIGNING;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static Loan.State m3953fromValue(int i) {
            if (i == 1) {
                return Loan.State.OPEN;
            }
            if (i == 2) {
                return Loan.State.COMPLETE;
            }
            if (i == 3) {
                return Loan.State.OVERDUE;
            }
            if (i == 4) {
                return Loan.State.WRITTEN_OFF;
            }
            if (i != 5) {
                return null;
            }
            return Loan.State.LONG_OVERDUE;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static UiControl.Icon m3955fromValue(int i) {
            switch (i) {
                case 1:
                    return UiControl.Icon.EXCLAMATION_MARK;
                case 2:
                    return UiControl.Icon.ELLIPSIS;
                case 3:
                    return UiControl.Icon.PACKAGE;
                case 4:
                default:
                    return null;
                case 5:
                    return UiControl.Icon.LOCK;
                case 6:
                    return UiControl.Icon.CARD_SHOP;
                case 7:
                    return UiControl.Icon.CIRCLE_OUTLINED_PLUS;
                case 8:
                    return UiControl.Icon.CIRCLE_FILLED_QUESTION_MARK;
                case 9:
                    return UiControl.Icon.CHECK_MARK;
                case 10:
                    return UiControl.Icon.CIRCLE_PLUS;
                case 11:
                    return UiControl.Icon.ENVELOPE;
                case 12:
                    return UiControl.Icon.CARD;
                case 13:
                    return UiControl.Icon.KEYPAD;
                case 14:
                    return UiControl.Icon.INFO;
                case 15:
                    return UiControl.Icon.ATM;
                case 16:
                    return UiControl.Icon.PRICE_TAG;
                case 17:
                    return UiControl.Icon.CIRCLE_SLASH;
                case 18:
                    return UiControl.Icon.INSIGHTS;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static DisputedTransactionRenderData.DisputedCapture.DisputeCase.State m3949fromValue(int i) {
            if (i == 1) {
                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.State.PENDING;
            }
            if (i == 2) {
                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.State.UNDER_REVIEW;
            }
            if (i == 3) {
                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.State.APPROVED;
            }
            if (i == 4) {
                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.State.DENIED;
            }
            if (i != 5) {
                return null;
            }
            return DisputedTransactionRenderData.DisputedCapture.DisputeCase.State.WITHDRAWN;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static LendingRenderData.Initiator m3950fromValue(int i) {
            switch (i) {
                case 1:
                    return LendingRenderData.Initiator.CUSTOMER;
                case 2:
                    return LendingRenderData.Initiator.JOB;
                case 3:
                    return LendingRenderData.Initiator.ADMIN;
                case 4:
                    return LendingRenderData.Initiator.BALANCE_RECOVERY;
                case 5:
                    return LendingRenderData.Initiator.PAY_AS_YOU_GO;
                case 6:
                    return LendingRenderData.Initiator.OVERDUE_SCHEDULED_RETRY;
                case 7:
                    return LendingRenderData.Initiator.INFLOW;
                case 8:
                    return LendingRenderData.Initiator.PAY_WITH_CASH;
                case 9:
                    return LendingRenderData.Initiator.SETTLEMENT;
                case 10:
                    return LendingRenderData.Initiator.FINAL_REPAYMENT_RETRY;
                default:
                    return null;
            }
        }
    }
}
