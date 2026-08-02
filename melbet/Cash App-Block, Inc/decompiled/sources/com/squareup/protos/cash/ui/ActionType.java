package com.squareup.protos.cash.ui;

import com.squareup.protos.cash.piggybank.api.v2.InterestYieldStatus;
import com.squareup.protos.cash.pools.PoolState;
import com.squareup.protos.cash.security.mri.api.v1.ThreeDsSignals;
import com.squareup.protos.cash.shop.rendering.api.ClusterInfoItem;
import com.squareup.protos.cash.shop.rendering.api.IconId;
import com.squareup.protos.cash.whimsicard.flows.v1.PaymentDeviceOrderScenarioType;
import com.squareup.protos.cash.woodrow.model.v1.AssetDisposition$DispositionType;
import com.squareup.protos.franklin.app.BitcoinAppletConfig;
import com.squareup.protos.franklin.app.OAuthResolveFlowResponse;
import com.squareup.protos.franklin.app.SetAppLockActivatedResponse;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum ActionType implements WireEnum {
    ACTION_TYPE_UNSPECIFIED(0),
    ACTION_TYPE_DISMISS(1);

    public static final ActionType$Companion$ADAPTER$1 ADAPTER;
    public static final Companion Companion;
    public final int value;

    static {
        ActionType actionType = ACTION_TYPE_UNSPECIFIED;
        Companion = new Companion();
        ADAPTER = new ActionType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ActionType.class), Syntax.PROTO_2, actionType);
    }

    ActionType(int i) {
        this.value = i;
    }

    public static final ActionType fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return ACTION_TYPE_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return ACTION_TYPE_DISMISS;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    public final class Companion {
        /* renamed from: fromValue, reason: collision with other method in class */
        public static BitcoinAppletConfig.BitcoinWidgetId m3937fromValue(int i) {
            switch (i) {
                case 1:
                    return BitcoinAppletConfig.BitcoinWidgetId.WELCOME;
                case 2:
                    return BitcoinAppletConfig.BitcoinWidgetId.GRAPH;
                case 3:
                    return BitcoinAppletConfig.BitcoinWidgetId.BOOST;
                case 4:
                    return BitcoinAppletConfig.BitcoinWidgetId.ON_RAMP;
                case 5:
                    return BitcoinAppletConfig.BitcoinWidgetId.DISCLOSURE;
                case 6:
                    return BitcoinAppletConfig.BitcoinWidgetId.BUTTONS;
                case 7:
                    return BitcoinAppletConfig.BitcoinWidgetId.NEWS;
                case 8:
                    return BitcoinAppletConfig.BitcoinWidgetId.PENDING_IDV;
                case 9:
                    return BitcoinAppletConfig.BitcoinWidgetId.STATS_AND_SETTINGS;
                case 10:
                    return BitcoinAppletConfig.BitcoinWidgetId.AUTO_INVEST;
                case 11:
                    return BitcoinAppletConfig.BitcoinWidgetId.ACTIVITY;
                case 12:
                    return BitcoinAppletConfig.BitcoinWidgetId.BITCOIN_STORIES;
                case 13:
                    return BitcoinAppletConfig.BitcoinWidgetId.KYB_RESTRICTION;
                case 14:
                    return BitcoinAppletConfig.BitcoinWidgetId.STACKING_TOOLS;
                case 15:
                    return BitcoinAppletConfig.BitcoinWidgetId.BALANCE;
                case 16:
                    return BitcoinAppletConfig.BitcoinWidgetId.PERFORMANCE;
                case 17:
                    return BitcoinAppletConfig.BitcoinWidgetId.DISABLED;
                case 18:
                    return BitcoinAppletConfig.BitcoinWidgetId.BITCOIN_MAP_CARD;
                default:
                    return null;
            }
        }

        public static InterestYieldStatus fromValue(int i) {
            if (i == 0) {
                return InterestYieldStatus.INTEREST_YIELD_STATUS_DEFAULT_UNSPECIFIED;
            }
            if (i == 1) {
                return InterestYieldStatus.INTEREST_YIELD_STATUS_UNONBOARDED;
            }
            if (i == 2) {
                return InterestYieldStatus.INTEREST_YIELD_STATUS_ACTIVE;
            }
            if (i == 3) {
                return InterestYieldStatus.INTEREST_YIELD_STATUS_DISMISSED;
            }
            if (i == 4) {
                return InterestYieldStatus.INTEREST_YIELD_STATUS_INACTIVE;
            }
            if (i != 5) {
                return null;
            }
            return InterestYieldStatus.INTEREST_YIELD_STATUS_MANUALLY_DISABLED;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static PoolState m3931fromValue(int i) {
            if (i == 0) {
                return PoolState.POOL_STATE_DEFAULT_UNSPECIFIED;
            }
            if (i == 1) {
                return PoolState.POOL_STATE_ACTIVE_IN_PROGRESS;
            }
            if (i == 2) {
                return PoolState.POOL_STATE_ACTIVE_REACHED_GOAL;
            }
            if (i == 3) {
                return PoolState.POOL_STATE_MANUAL_CLOSED;
            }
            if (i != 4) {
                return null;
            }
            return PoolState.POOL_STATE_CLOSING;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static IconId m3934fromValue(int i) {
            switch (i) {
                case 1:
                    return IconId.CARD_BASIC;
                case 2:
                    return IconId.TIME_STOPWATCH;
                case 3:
                    return IconId.TIME_HOURGLASS;
                case 4:
                    return IconId.LIMITS_FILL;
                case 5:
                    return IconId.DISCOUNT_MINIMUM;
                case 6:
                    return IconId.CASH_APP_PAY;
                case 7:
                    return IconId.TIME;
                case 8:
                    return IconId.CASH_APP_CUSTOMER;
                case 9:
                    return IconId.CARD_NEW;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static PaymentDeviceOrderScenarioType m3935fromValue(int i) {
            if (i == 0) {
                return PaymentDeviceOrderScenarioType.PAYMENT_DEVICE_ORDER_SCENARIO_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return PaymentDeviceOrderScenarioType.FIRST_TIME_ORDER;
            }
            if (i == 2) {
                return PaymentDeviceOrderScenarioType.REPLACEMENT_ORDER;
            }
            if (i == 3) {
                return PaymentDeviceOrderScenarioType.LOST_DEVICE_ORDER;
            }
            if (i == 4) {
                return PaymentDeviceOrderScenarioType.EXPIRED_DEVICE_ORDER;
            }
            if (i != 5) {
                return null;
            }
            return PaymentDeviceOrderScenarioType.DEBIT_FLEX_UPGRADE;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static AssetDisposition$DispositionType m3936fromValue(int i) {
            if (i == 0) {
                return AssetDisposition$DispositionType.TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return AssetDisposition$DispositionType.TRADE;
            }
            if (i == 2) {
                return AssetDisposition$DispositionType.WITHDRAW;
            }
            if (i == 3) {
                return AssetDisposition$DispositionType.TRANSFER;
            }
            if (i != 4) {
                return null;
            }
            return AssetDisposition$DispositionType.SANCTIONS_FREEZE;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static ThreeDsSignals.Status m3932fromValue(int i) {
            if (i == 0) {
                return ThreeDsSignals.Status.STATUS_UNSPECIFIED;
            }
            if (i == 1) {
                return ThreeDsSignals.Status.STATUS_SUCCESS;
            }
            if (i == 2) {
                return ThreeDsSignals.Status.STATUS_WARNING;
            }
            if (i == 3) {
                return ThreeDsSignals.Status.STATUS_INITIALIZATION_TIMEOUT;
            }
            if (i != 4) {
                return null;
            }
            return ThreeDsSignals.Status.STATUS_INITIALIZATION_FAILED;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static OAuthResolveFlowResponse.Status m3938fromValue(int i) {
            if (i == 0) {
                return OAuthResolveFlowResponse.Status.INVALID;
            }
            if (i == 1) {
                return OAuthResolveFlowResponse.Status.SUCCESS;
            }
            if (i == 2) {
                return OAuthResolveFlowResponse.Status.FAILURE;
            }
            if (i == 3) {
                return OAuthResolveFlowResponse.Status.TOO_MANY_ATTEMPTS;
            }
            if (i != 4) {
                return null;
            }
            return OAuthResolveFlowResponse.Status.CONCURRENT_MODIFICATION;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static SetAppLockActivatedResponse.Status m3939fromValue(int i) {
            if (i == 0) {
                return SetAppLockActivatedResponse.Status.INVALID;
            }
            if (i == 1) {
                return SetAppLockActivatedResponse.Status.SUCCESS;
            }
            if (i == 2) {
                return SetAppLockActivatedResponse.Status.INVALID_PASSCODE_TOKEN;
            }
            if (i == 3) {
                return SetAppLockActivatedResponse.Status.INVALID_PASSCODE;
            }
            if (i == 4) {
                return SetAppLockActivatedResponse.Status.TOO_MANY_ATTEMPTS;
            }
            if (i != 5) {
                return null;
            }
            return SetAppLockActivatedResponse.Status.OP_NOT_PERMITTED;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static ClusterInfoItem.ClusterColorTheme m3933fromValue(int i) {
            if (i == 0) {
                return ClusterInfoItem.ClusterColorTheme.UNSPECIFIED;
            }
            if (i == 1) {
                return ClusterInfoItem.ClusterColorTheme.GREEN;
            }
            if (i == 2) {
                return ClusterInfoItem.ClusterColorTheme.PURPLE;
            }
            if (i == 3) {
                return ClusterInfoItem.ClusterColorTheme.ORANGE;
            }
            if (i != 4) {
                return null;
            }
            return ClusterInfoItem.ClusterColorTheme.BLUE;
        }
    }
}
