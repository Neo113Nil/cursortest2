package com.squareup.protos.hieroglyph;

import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningCompletionData;
import com.squareup.protos.franklin.common.LoyaltyActivityRenderData;
import com.squareup.protos.franklin.common.P2pPoolRenderData;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.onboarding.OnboardingDeepLinkType;
import com.squareup.protos.franklin.ui.RequestRefundReason;
import com.squareup.protos.lending.LoanRepaymentSelectionData;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum KeyScope implements WireEnum {
    DEFAULT_DO_NOT_USE(0),
    ECR_PAN(1),
    ECR_PAN_HMAC(2),
    ECR_PIN(3),
    ECR_PIN_HMAC(4),
    EBT_PIN(5),
    EBT_PIN_HMAC(6),
    TTP_PAN(7),
    TTP_PAN_HMAC(8);

    public static final KeyScope$Companion$ADAPTER$1 ADAPTER;
    public static final Companion Companion;
    public final int value;

    static {
        KeyScope keyScope = DEFAULT_DO_NOT_USE;
        Companion = new Companion();
        ADAPTER = new KeyScope$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(KeyScope.class), Syntax.PROTO_2, keyScope);
    }

    KeyScope(int i) {
        this.value = i;
    }

    public static final KeyScope fromValue(int i) {
        Companion.getClass();
        return Companion.m3974fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    public final class Companion {
        public static DigitalWalletTokenProvisioningCompletionData.ProvisioningResult fromValue(int i) {
            switch (i) {
                case 1:
                    return DigitalWalletTokenProvisioningCompletionData.ProvisioningResult.SUCCESS;
                case 2:
                    return DigitalWalletTokenProvisioningCompletionData.ProvisioningResult.USER_CANCELED;
                case 3:
                    return DigitalWalletTokenProvisioningCompletionData.ProvisioningResult.UNKNOWN_ERROR;
                case 4:
                    return DigitalWalletTokenProvisioningCompletionData.ProvisioningResult.INVALID_DATA_ERROR;
                case 5:
                    return DigitalWalletTokenProvisioningCompletionData.ProvisioningResult.UNSUPPORTED_VERSION_ERROR;
                case 6:
                    return DigitalWalletTokenProvisioningCompletionData.ProvisioningResult.INVALID_SIGNATURE;
                case 7:
                    return DigitalWalletTokenProvisioningCompletionData.ProvisioningResult.NOT_ENTITLED_ERROR;
                case 8:
                    return DigitalWalletTokenProvisioningCompletionData.ProvisioningResult.ACTIVATION_FAILED;
                case 9:
                    return DigitalWalletTokenProvisioningCompletionData.ProvisioningResult.PARTIAL_ACTIVATION;
                case 10:
                    return DigitalWalletTokenProvisioningCompletionData.ProvisioningResult.NO_ACTIVE_WALLET;
                case 11:
                    return DigitalWalletTokenProvisioningCompletionData.ProvisioningResult.TOKEN_NOT_FOUND;
                case 12:
                    return DigitalWalletTokenProvisioningCompletionData.ProvisioningResult.INVALID_TOKEN_STATE;
                case 13:
                    return DigitalWalletTokenProvisioningCompletionData.ProvisioningResult.ATTESTATION_ERROR;
                case 14:
                    return DigitalWalletTokenProvisioningCompletionData.ProvisioningResult.TAP_AND_PAY_UNAVAILABLE;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static OnboardingDeepLinkType m3972fromValue(int i) {
            switch (i) {
                case 0:
                    return OnboardingDeepLinkType.UNKNOWN;
                case 1:
                    return OnboardingDeepLinkType.LOYALTY;
                case 2:
                    return OnboardingDeepLinkType.TAXES;
                case 3:
                    return OnboardingDeepLinkType.CASH_APP_PAY;
                case 4:
                    return OnboardingDeepLinkType.INVITATION;
                case 5:
                    return OnboardingDeepLinkType.WEB_ENFORCE_ONBOARDING;
                case 6:
                    return OnboardingDeepLinkType.ACCOUNT_SWITCH;
                case 7:
                    return OnboardingDeepLinkType.CASH_LOCAL;
                case 8:
                    return OnboardingDeepLinkType.OON_P2P;
                case 9:
                    return OnboardingDeepLinkType.GRANT_FLOW;
                case 10:
                    return OnboardingDeepLinkType.STAFF_INVITATION;
                case 11:
                    return OnboardingDeepLinkType.UNAUTHED_CARD_STUDIO;
                case 12:
                    return OnboardingDeepLinkType.CASH_FOR_WORK_GRADUATION;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static KeyScope m3974fromValue(int i) {
            switch (i) {
                case 0:
                    return KeyScope.DEFAULT_DO_NOT_USE;
                case 1:
                    return KeyScope.ECR_PAN;
                case 2:
                    return KeyScope.ECR_PAN_HMAC;
                case 3:
                    return KeyScope.ECR_PIN;
                case 4:
                    return KeyScope.ECR_PIN_HMAC;
                case 5:
                    return KeyScope.EBT_PIN;
                case 6:
                    return KeyScope.EBT_PIN_HMAC;
                case 7:
                    return KeyScope.TTP_PAN;
                case 8:
                    return KeyScope.TTP_PAN_HMAC;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static LoyaltyActivityRenderData.Type m3969fromValue(int i) {
            if (i == 1) {
                return LoyaltyActivityRenderData.Type.JOINED_PROGRAM;
            }
            if (i == 2) {
                return LoyaltyActivityRenderData.Type.EARNED_POINTS;
            }
            if (i == 3) {
                return LoyaltyActivityRenderData.Type.REDEEMED_REWARD;
            }
            if (i == 4) {
                return LoyaltyActivityRenderData.Type.EXPIRED_POINTS;
            }
            if (i != 5) {
                return null;
            }
            return LoyaltyActivityRenderData.Type.TIER_UPGRADE;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static RequestRefundReason m3973fromValue(int i) {
            switch (i) {
                case 1:
                    return RequestRefundReason.OTHER;
                case 2:
                    return RequestRefundReason.SENDER_NOT_AUTHORIZED;
                case 3:
                    return RequestRefundReason.WRONG_RECIPIENT;
                case 4:
                    return RequestRefundReason.PURCHASE_CANCELLED;
                case 5:
                    return RequestRefundReason.PURCHASE_RETURNED;
                case 6:
                    return RequestRefundReason.DID_NOT_RECEIVE;
                case 7:
                    return RequestRefundReason.NOT_AS_DESCRIBED;
                case 8:
                    return RequestRefundReason.SCAM_REPORT;
                case 9:
                    return RequestRefundReason.WRONG_AMOUNT;
                case 10:
                    return RequestRefundReason.PURCHASE_RETURNED_OR_CANCELLED;
                case 11:
                    return RequestRefundReason.SOMETHING_ELSE;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static P2pPoolRenderData.PoolState m3970fromValue(int i) {
            if (i == 0) {
                return P2pPoolRenderData.PoolState.UNKNOWN;
            }
            if (i == 1) {
                return P2pPoolRenderData.PoolState.ACTIVE;
            }
            if (i == 2) {
                return P2pPoolRenderData.PoolState.CLOSING;
            }
            if (i == 3) {
                return P2pPoolRenderData.PoolState.CLOSED;
            }
            if (i != 4) {
                return null;
            }
            return P2pPoolRenderData.PoolState.GOAL_REACHED;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static LoanRepaymentSelectionData.Choice.Icon m3975fromValue(int i) {
            if (i == 0) {
                return LoanRepaymentSelectionData.Choice.Icon.BORROW;
            }
            if (i == 1) {
                return LoanRepaymentSelectionData.Choice.Icon.OTHER;
            }
            if (i == 2) {
                return LoanRepaymentSelectionData.Choice.Icon.DATE;
            }
            if (i == 3) {
                return LoanRepaymentSelectionData.Choice.Icon.REMAINING;
            }
            if (i != 4) {
                return null;
            }
            return LoanRepaymentSelectionData.Choice.Icon.SKIP;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static StatusResult.Icon m3971fromValue(int i) {
            switch (i) {
                case 1:
                    return StatusResult.Icon.SUCCESS;
                case 2:
                    return StatusResult.Icon.BANK;
                case 3:
                    return StatusResult.Icon.FAILURE;
                case 4:
                    return StatusResult.Icon.ACTION_REQUIRED;
                case 5:
                    return StatusResult.Icon.NONE;
                case 6:
                    return StatusResult.Icon.INSTANT;
                case 7:
                    return StatusResult.Icon.PENDING;
                case 8:
                    return StatusResult.Icon.VERIFICATION_REQUIRED;
                case 9:
                    return StatusResult.Icon.PACKAGE;
                case 10:
                    return StatusResult.Icon.ACCOUNT_LOCKED;
                default:
                    return null;
            }
        }
    }
}
