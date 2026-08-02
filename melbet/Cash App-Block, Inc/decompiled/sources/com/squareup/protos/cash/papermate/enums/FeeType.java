package com.squareup.protos.cash.papermate.enums;

import com.squareup.protos.cash.investcrypto.resources.FeeStrategy;
import com.squareup.protos.cash.janus.api.GetWebAuthnCredentialsResponse;
import com.squareup.protos.cash.kgoosememorystore.api.v1.MemoryType;
import com.squareup.protos.cash.messagingplatformcommon.app.DetailsPageView;
import com.squareup.protos.cash.pay.CashAppPayPaymentRenderData;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum FeeType implements WireEnum {
    FEE_TYPE_UNKNOWN_DO_NOT_USE(0),
    USER_PAID(1),
    COVERED(2),
    UNKNOWN(3);

    public static final FeeType$Companion$ADAPTER$1 ADAPTER;
    public static final Companion Companion;
    public final int value;

    static {
        FeeType feeType = FEE_TYPE_UNKNOWN_DO_NOT_USE;
        Companion = new Companion();
        ADAPTER = new FeeType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(FeeType.class), Syntax.PROTO_2, feeType);
    }

    FeeType(int i) {
        this.value = i;
    }

    public static final FeeType fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return FEE_TYPE_UNKNOWN_DO_NOT_USE;
        }
        if (i == 1) {
            return USER_PAID;
        }
        if (i == 2) {
            return COVERED;
        }
        if (i != 3) {
            return null;
        }
        return UNKNOWN;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    public final class Companion {
        public static FeeStrategy fromValue(int i) {
            switch (i) {
                case 1:
                    return FeeStrategy.TIERED_V1;
                case 2:
                    return FeeStrategy.WAIVE_ALL;
                case 3:
                    return FeeStrategy.SPREAD_ONLY;
                case 4:
                    return FeeStrategy.FLAT_FEE_1_PERCENT;
                case 5:
                    return FeeStrategy.CUSTOM_SPREAD;
                case 6:
                    return FeeStrategy.TIERED_V1_WITH_CUSTOM_SPREAD;
                case 7:
                    return FeeStrategy.TIERED_V2_VARIABLE;
                case 8:
                    return FeeStrategy.TIRED_V2_VARIABLE_FIXED_HYBRID;
                case 9:
                    return FeeStrategy.TIERED_V2_VARIABLE_FIXED_HYBRID_WITH_CUSTOM_SPREAD;
                case 10:
                    return FeeStrategy.TIERED_V3;
                case 11:
                    return FeeStrategy.FLAT_FEE_0_9_PERCENT;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static MemoryType m3910fromValue(int i) {
            if (i == 0) {
                return MemoryType.MEMORY_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return MemoryType.MEMORY_TYPE_USER_PREFERENCE;
            }
            if (i == 2) {
                return MemoryType.MEMORY_TYPE_FACTUAL_INFO;
            }
            if (i == 3) {
                return MemoryType.MEMORY_TYPE_CONVERSATION_SUMMARY;
            }
            if (i == 4) {
                return MemoryType.MEMORY_TYPE_BEHAVIORAL_PATTERN;
            }
            if (i != 5) {
                return null;
            }
            return MemoryType.MEMORY_TYPE_OPEN_LOOP;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static GetWebAuthnCredentialsResponse.Credential.DeviceType m3909fromValue(int i) {
            if (i == 1) {
                return GetWebAuthnCredentialsResponse.Credential.DeviceType.BROWSER;
            }
            if (i == 2) {
                return GetWebAuthnCredentialsResponse.Credential.DeviceType.IPHONE;
            }
            if (i == 3) {
                return GetWebAuthnCredentialsResponse.Credential.DeviceType.IPAD;
            }
            if (i == 4) {
                return GetWebAuthnCredentialsResponse.Credential.DeviceType.ANDROID;
            }
            if (i != 5) {
                return null;
            }
            return GetWebAuthnCredentialsResponse.Credential.DeviceType.OTHER;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static DetailsPageView.TextPlacement m3911fromValue(int i) {
            if (i == 0) {
                return DetailsPageView.TextPlacement.TEXT_PLACEMENT_UNSPECIFIED;
            }
            if (i == 1) {
                return DetailsPageView.TextPlacement.TEXT_PLACEMENT_TOP_LEFT;
            }
            if (i == 2) {
                return DetailsPageView.TextPlacement.TEXT_PLACEMENT_MIDDLE_LEFT;
            }
            if (i == 3) {
                return DetailsPageView.TextPlacement.TEXT_PLACEMENT_BOTTOM_LEFT;
            }
            if (i != 4) {
                return null;
            }
            return DetailsPageView.TextPlacement.TEXT_PLACEMENT_TOP_CENTER;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static CashAppPayPaymentRenderData.PaymentState m3912fromValue(int i) {
            if (i == 0) {
                return CashAppPayPaymentRenderData.PaymentState.UNKNOWN_PAYMENT_STATE;
            }
            if (i == 1) {
                return CashAppPayPaymentRenderData.PaymentState.SCHEDULED_PAYMENT_STATE;
            }
            if (i == 2) {
                return CashAppPayPaymentRenderData.PaymentState.AUTHORIZED_PAYMENT_STATE;
            }
            if (i == 3) {
                return CashAppPayPaymentRenderData.PaymentState.CAPTURED_PAYMENT_STATE;
            }
            if (i == 4) {
                return CashAppPayPaymentRenderData.PaymentState.VOIDED_PAYMENT_STATE;
            }
            if (i != 5) {
                return null;
            }
            return CashAppPayPaymentRenderData.PaymentState.FAILED_PAYMENT_STATE;
        }
    }
}
