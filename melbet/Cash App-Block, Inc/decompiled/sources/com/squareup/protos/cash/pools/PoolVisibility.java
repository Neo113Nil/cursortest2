package com.squareup.protos.cash.pools;

import com.squareup.protos.cash.pools.CreatePoolResponse;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.franklin.accounts.AddressSource;
import com.squareup.protos.franklin.app.VerifyContactsResponse;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum PoolVisibility implements WireEnum {
    POOL_VISIBILITY_TYPE_UNSPECIFIED(0),
    POOL_VISIBILITY_TYPE_PUBLIC(1),
    POOL_VISIBILITY_TYPE_PRIVATE(2);

    public static final PoolVisibility$Companion$ADAPTER$1 ADAPTER;
    public static final Companion Companion;
    public final int value;

    static {
        PoolVisibility poolVisibility = POOL_VISIBILITY_TYPE_UNSPECIFIED;
        Companion = new Companion();
        ADAPTER = new PoolVisibility$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PoolVisibility.class), Syntax.PROTO_2, poolVisibility);
    }

    PoolVisibility(int i) {
        this.value = i;
    }

    public static final PoolVisibility fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return POOL_VISIBILITY_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return POOL_VISIBILITY_TYPE_PUBLIC;
        }
        if (i != 2) {
            return null;
        }
        return POOL_VISIBILITY_TYPE_PRIVATE;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    public final class Companion {
        /* renamed from: fromValue, reason: collision with other method in class */
        public static CardModule.InformationSource m3913fromValue(int i) {
            switch (i) {
                case 0:
                    return CardModule.InformationSource.INFORMATION_SOURCE_UNSPECIFIED;
                case 1:
                    return CardModule.InformationSource.GENERIC;
                case 2:
                    return CardModule.InformationSource.GIFT_CARDS;
                case 3:
                    return CardModule.InformationSource.OFFERS;
                case 4:
                    return CardModule.InformationSource.OVERDRAFT;
                case 5:
                    return CardModule.InformationSource.ROUND_UPS;
                case 6:
                    return CardModule.InformationSource.SPENDING_INSIGHTS;
                case 7:
                    return CardModule.InformationSource.MERCHANT_BLOCKING;
                case 8:
                    return CardModule.InformationSource.DIGITAL_WALLET;
                case 9:
                    return CardModule.InformationSource.AFTERPAY;
                case 10:
                    return CardModule.InformationSource.PREPURCHASE_CASH_CARD;
                case 11:
                    return CardModule.InformationSource.ACTIVATE_TAG;
                case 12:
                    return CardModule.InformationSource.SECURITY_RESOURCES;
                case 13:
                    return CardModule.InformationSource.CASH_APP_TAG;
                case 14:
                    return CardModule.InformationSource.CASH_LITE_DIGITAL_WALLET;
                case 15:
                    return CardModule.InformationSource.BILLS_AND_SUBSCRIPTIONS;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static VerifyContactsResponse.Status m3915fromValue(int i) {
            if (i == 0) {
                return VerifyContactsResponse.Status.INVALID;
            }
            if (i == 1) {
                return VerifyContactsResponse.Status.SUCCESS;
            }
            if (i == 2) {
                return VerifyContactsResponse.Status.FAILURE;
            }
            if (i == 3) {
                return VerifyContactsResponse.Status.TOO_MANY_ATTEMPTS;
            }
            if (i != 4) {
                return null;
            }
            return VerifyContactsResponse.Status.CONCURRENT_MODIFICATION;
        }

        public static CreatePoolResponse.FailureReason fromValue(int i) {
            switch (i) {
                case 0:
                    return CreatePoolResponse.FailureReason.FAILURE_REASON_DEFAULT_UNSPECIFIED;
                case 1:
                    return CreatePoolResponse.FailureReason.FAILURE_REASON_INVALID_GOAL_AMOUNT;
                case 2:
                    return CreatePoolResponse.FailureReason.FAILURE_REASON_ALREADY_CREATED;
                case 3:
                    return CreatePoolResponse.FailureReason.FAILURE_REASON_MAX_OPEN_POOL_LIMIT_REACHED;
                case 4:
                    return CreatePoolResponse.FailureReason.FAILURE_REASON_INVALID_POOL_NAME;
                case 5:
                    return CreatePoolResponse.FailureReason.FAILURE_REASON_MAX_POOL_NAME_LENGTH;
                case 6:
                    return CreatePoolResponse.FailureReason.FAILURE_REASON_INELIGIBLE_CUSTOMER;
                case 7:
                    return CreatePoolResponse.FailureReason.FAILURE_REASON_IDEMPOTENCY_KEY_ALREADY_USED;
                case 8:
                    return CreatePoolResponse.FailureReason.FAILURE_REASON_RISK_BLOCKED;
                case 9:
                    return CreatePoolResponse.FailureReason.FAILURE_REASON_RISK_BLOCKED_ELIGIBILITY;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static AddressSource m3914fromValue(int i) {
            switch (i) {
                case 1:
                    return AddressSource.CUSTOMER;
                case 2:
                    return AddressSource.IDOLOGY_IDV;
                case 3:
                    return AddressSource.TLO_ADDRESS_SEARCH;
                case 4:
                    return AddressSource.GOVERNMENT_ID;
                case 5:
                    return AddressSource.IDV_ATTEMPT;
                case 6:
                    return AddressSource.CARD_ACTIVATION;
                case 7:
                    return AddressSource.ALLOY_IDV;
                case 8:
                    return AddressSource.PROOF_OF_ADDRESS_DOCUMENT;
                case 9:
                    return AddressSource.CARD_LINK;
                case 10:
                    return AddressSource.PHONE_NUMBER;
                case 11:
                    return AddressSource.BUSINESS;
                case 12:
                    return AddressSource.SPONSOR;
                case 13:
                    return AddressSource.SOCURE_IDV;
                case 14:
                    return AddressSource.DIGITAL_WALLET;
                case 15:
                    return AddressSource.ID_MATCH_IDV;
                default:
                    return null;
            }
        }
    }
}
