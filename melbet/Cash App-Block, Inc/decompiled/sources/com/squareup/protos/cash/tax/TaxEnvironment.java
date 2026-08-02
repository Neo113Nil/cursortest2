package com.squareup.protos.cash.tax;

import com.squareup.protos.cash.pools.RemoveCustomersFromPoolResponse;
import com.squareup.protos.cash.postcard.app.KnotEntryPoint;
import com.squareup.protos.cash.scheduledreloader.resources.v1.ReloadSchedule;
import com.squareup.protos.cash.scheduledreloader.resources.v1.ScheduledReloadPreference;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.supportal.app.SupportPhoneStatusResponse;
import com.squareup.protos.common.address.Verification;
import com.squareup.protos.franklin.api.DirectDepositBlockerBenefitsIcon;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum TaxEnvironment implements WireEnum {
    LOCAL(7),
    DEV(0),
    STAGE(1),
    PREFLIGHT(2),
    PROD(3),
    NEXT_YEAR_DEV(4),
    NEXT_YEAR_STAGE(5),
    NEXT_YEAR_PREFLIGHT(6);

    public static final TaxEnvironment$Companion$ADAPTER$1 ADAPTER;
    public static final Companion Companion;
    public final int value;

    static {
        TaxEnvironment taxEnvironment = DEV;
        Companion = new Companion();
        ADAPTER = new TaxEnvironment$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TaxEnvironment.class), Syntax.PROTO_2, taxEnvironment);
    }

    TaxEnvironment(int i) {
        this.value = i;
    }

    public static final TaxEnvironment fromValue(int i) {
        Companion.getClass();
        switch (i) {
            case 0:
                return DEV;
            case 1:
                return STAGE;
            case 2:
                return PREFLIGHT;
            case 3:
                return PROD;
            case 4:
                return NEXT_YEAR_DEV;
            case 5:
                return NEXT_YEAR_STAGE;
            case 6:
                return NEXT_YEAR_PREFLIGHT;
            case 7:
                return LOCAL;
            default:
                return null;
        }
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    public final class Companion {
        /* renamed from: fromValue, reason: collision with other method in class */
        public static AnalyticsEvent.ParamType m3927fromValue(int i) {
            switch (i) {
                case 1:
                    return AnalyticsEvent.ParamType.BROWSE_FLOW_TOKEN;
                case 2:
                    return AnalyticsEvent.ParamType.REFERRER_FLOW_TOKEN;
                case 3:
                    return AnalyticsEvent.ParamType.SOURCE_SECTION;
                case 4:
                    return AnalyticsEvent.ParamType.SOURCE_CATEGORY;
                case 5:
                    return AnalyticsEvent.ParamType.SEARCH_FLOW_TOKEN;
                case 6:
                    return AnalyticsEvent.ParamType.SOURCE_SCREEN;
                case 7:
                    return AnalyticsEvent.ParamType.ORIGIN;
                case 8:
                    return AnalyticsEvent.ParamType.CURRENT_OFFER_TOKEN;
                case 9:
                    return AnalyticsEvent.ParamType.CURRENT_BUSINESS_TOKEN;
                case 10:
                    return AnalyticsEvent.ParamType.CURRENT_BUSINESS_NAME;
                case 11:
                    return AnalyticsEvent.ParamType.BROWSER_SESSION_TOKEN;
                case 12:
                    return AnalyticsEvent.ParamType.MARKETING_SOURCE;
                case 13:
                    return AnalyticsEvent.ParamType.MARKETING_UTM;
                case 14:
                    return AnalyticsEvent.ParamType.APP_LOCATION;
                case 15:
                    return AnalyticsEvent.ParamType.DISMISS_ORIGIN;
                case 16:
                    return AnalyticsEvent.ParamType.SEARCH_TEXT;
                case 17:
                    return AnalyticsEvent.ParamType.FILTERS;
                case 18:
                    return AnalyticsEvent.ParamType.UPDATE_TYPE;
                case 19:
                    return AnalyticsEvent.ParamType.PLASMA_FLOW_TOKEN;
                case 20:
                    return AnalyticsEvent.ParamType.SHOP_FLOW_TOKEN;
                case 21:
                    return AnalyticsEvent.ParamType.FILTERS_SELECTED;
                case 22:
                    return AnalyticsEvent.ParamType.CARD_PLASMA_FLOW_TOKEN;
                case 23:
                    return AnalyticsEvent.ParamType.BUTTON_TYPE;
                case 24:
                    return AnalyticsEvent.ParamType.QUERY_TOKEN;
                case 25:
                    return AnalyticsEvent.ParamType.AFTERPAY_APPLET_FLOW_TOKEN;
                case 26:
                    return AnalyticsEvent.ParamType.FROM_SCREEN;
                case 27:
                    return AnalyticsEvent.ParamType.FROM_SECTION;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static DirectDepositBlockerBenefitsIcon m3930fromValue(int i) {
            switch (i) {
                case 1:
                    return DirectDepositBlockerBenefitsIcon.CARD;
                case 2:
                    return DirectDepositBlockerBenefitsIcon.FDIC;
                case 3:
                    return DirectDepositBlockerBenefitsIcon.LIGHTNING;
                case 4:
                    return DirectDepositBlockerBenefitsIcon.BORROW;
                case 5:
                    return DirectDepositBlockerBenefitsIcon.PHONE;
                case 6:
                    return DirectDepositBlockerBenefitsIcon.ATM;
                case 7:
                    return DirectDepositBlockerBenefitsIcon.DEPOSIT;
                case 8:
                    return DirectDepositBlockerBenefitsIcon.OVERDRAFT;
                case 9:
                    return DirectDepositBlockerBenefitsIcon.SAVINGS;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static SupportPhoneStatusResponse.ActiveStatus m3928fromValue(int i) {
            if (i == 1) {
                return SupportPhoneStatusResponse.ActiveStatus.IN_QUEUE;
            }
            if (i == 2) {
                return SupportPhoneStatusResponse.ActiveStatus.MISSED;
            }
            if (i == 3) {
                return SupportPhoneStatusResponse.ActiveStatus.COMPLETED;
            }
            if (i == 4) {
                return SupportPhoneStatusResponse.ActiveStatus.CANCELLED;
            }
            if (i != 5) {
                return null;
            }
            return SupportPhoneStatusResponse.ActiveStatus.FAILED_TO_QUEUE;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static ReloadSchedule.Frequency m3925fromValue(int i) {
            if (i == 0) {
                return ReloadSchedule.Frequency.FREQUENCY_UNSPECIFIED;
            }
            if (i == 1) {
                return ReloadSchedule.Frequency.FREQUENCY_EVERY_DAY;
            }
            if (i == 2) {
                return ReloadSchedule.Frequency.FREQUENCY_EVERY_WEEK;
            }
            if (i == 3) {
                return ReloadSchedule.Frequency.FREQUENCY_EVERY_TWO_WEEKS;
            }
            if (i != 4) {
                return null;
            }
            return ReloadSchedule.Frequency.FREQUENCY_EVERY_MONTH;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static Verification.VerificationLevel m3929fromValue(int i) {
            if (i == 0) {
                return Verification.VerificationLevel.UNKNOWN_VERIFICATION_LEVEL;
            }
            if (i == 1) {
                return Verification.VerificationLevel.ADMINISTRATIVE_AREA;
            }
            if (i == 2) {
                return Verification.VerificationLevel.LOCALITY;
            }
            if (i == 3) {
                return Verification.VerificationLevel.THOROUGHFARE;
            }
            if (i == 4) {
                return Verification.VerificationLevel.PREMISES;
            }
            if (i != 5) {
                return null;
            }
            return Verification.VerificationLevel.SUBPREMISES;
        }

        public static RemoveCustomersFromPoolResponse.FailureReason fromValue(int i) {
            if (i == 0) {
                return RemoveCustomersFromPoolResponse.FailureReason.FAILURE_REASON_UNSPECIFIED;
            }
            if (i == 1) {
                return RemoveCustomersFromPoolResponse.FailureReason.FAILURE_REASON_FORBIDDEN_POOL_OWNERSHIP;
            }
            if (i == 2) {
                return RemoveCustomersFromPoolResponse.FailureReason.FAILURE_REASON_CONTRIBUTED_CUSTOMER_NON_REMOVABLE;
            }
            if (i == 3) {
                return RemoveCustomersFromPoolResponse.FailureReason.FAILURE_REASON_CLOSED_POOL;
            }
            if (i == 4) {
                return RemoveCustomersFromPoolResponse.FailureReason.FAILURE_REASON_CUSTOMER_NO_MEMBERSHIP;
            }
            if (i != 5) {
                return null;
            }
            return RemoveCustomersFromPoolResponse.FailureReason.FAILURE_REASON_RATE_LIMIT_EXCEEDED;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static KnotEntryPoint m3924fromValue(int i) {
            if (i == 0) {
                return KnotEntryPoint.KNOT_ENTRY_POINT_UNSPECIFIED;
            }
            if (i == 1) {
                return KnotEntryPoint.CARD_TAB;
            }
            if (i == 2) {
                return KnotEntryPoint.CARD_ACTIVATION;
            }
            if (i == 3) {
                return KnotEntryPoint.MERCHANT_PROFILE;
            }
            if (i != 4) {
                return null;
            }
            return KnotEntryPoint.BILLS_SUBSCRIPTIONS;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static ScheduledReloadPreference.Type m3926fromValue(int i) {
            if (i == 0) {
                return ScheduledReloadPreference.Type.TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return ScheduledReloadPreference.Type.TYPE_CASH_IN;
            }
            if (i == 2) {
                return ScheduledReloadPreference.Type.TYPE_BTC_BUY;
            }
            if (i == 3) {
                return ScheduledReloadPreference.Type.TYPE_EQUITY_BUY;
            }
            if (i != 4) {
                return null;
            }
            return ScheduledReloadPreference.Type.TYPE_SAVINGS_TRANSFER;
        }
    }
}
