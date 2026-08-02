package com.squareup.protos.cash.pools;

import com.squareup.protos.cash.piggybank.api.v2.SavingsGoal;
import com.squareup.protos.cash.taply.syncvalues.PhysicalTagOrderState;
import com.squareup.protos.franklin.api.Payment$State;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum TransactionType implements WireEnum {
    TRANSACTION_TYPE_UNSPECIFIED(0),
    TRANSACTION_TYPE_OWNER_BALANCE(1),
    TRANSACTION_TYPE_OWNER_CASH_IN(2),
    TRANSACTION_TYPE_P2P_IN_NETWORK(3),
    TRANSACTION_TYPE_P2P_OUT_OF_NETWORK(4);

    public static final TransactionType$Companion$ADAPTER$1 ADAPTER;
    public static final Companion Companion;
    public final int value;

    static {
        TransactionType transactionType = TRANSACTION_TYPE_UNSPECIFIED;
        Companion = new Companion();
        ADAPTER = new TransactionType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TransactionType.class), Syntax.PROTO_2, transactionType);
    }

    TransactionType(int i) {
        this.value = i;
    }

    public static final TransactionType fromValue(int i) {
        Companion.getClass();
        return Companion.m3916fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    public final class Companion {
        /* renamed from: fromValue, reason: collision with other method in class */
        public static Payment$State m3918fromValue(int i) {
            switch (i) {
                case 1:
                    return Payment$State.PENDING;
                case 2:
                    return Payment$State.WAITING_ON_SENDER;
                case 3:
                    return Payment$State.WAITING_ON_RECIPIENT;
                case 4:
                    return Payment$State.COMPLETED;
                case 5:
                    return Payment$State.CANCELED;
                case 6:
                    return Payment$State.WAITING_TO_PAY_OUT;
                case 7:
                    return Payment$State.WAITING_TO_REFUND;
                case 8:
                    return Payment$State.WAITING_ON_RISK;
                case 9:
                    return Payment$State.WAITING_ON_EXTERNAL;
                case 10:
                    return Payment$State.SCHEDULED;
                case 11:
                    return Payment$State.AUTHORIZED;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static PhysicalTagOrderState m3917fromValue(int i) {
            if (i == 0) {
                return PhysicalTagOrderState.PHYSICAL_TAG_ORDER_STATE_UNSPECIFIED;
            }
            if (i == 1) {
                return PhysicalTagOrderState.PHYSICAL_TAG_ORDER_STATE_PREPARING;
            }
            if (i == 2) {
                return PhysicalTagOrderState.PHYSICAL_TAG_ORDER_STATE_SHIPPED;
            }
            if (i == 3) {
                return PhysicalTagOrderState.PHYSICAL_TAG_ORDER_STATE_PENDING_ACTIVATION;
            }
            if (i != 4) {
                return null;
            }
            return PhysicalTagOrderState.PHYSICAL_TAG_ORDER_STATE_COMPLETE;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static TransactionType m3916fromValue(int i) {
            if (i == 0) {
                return TransactionType.TRANSACTION_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return TransactionType.TRANSACTION_TYPE_OWNER_BALANCE;
            }
            if (i == 2) {
                return TransactionType.TRANSACTION_TYPE_OWNER_CASH_IN;
            }
            if (i == 3) {
                return TransactionType.TRANSACTION_TYPE_P2P_IN_NETWORK;
            }
            if (i != 4) {
                return null;
            }
            return TransactionType.TRANSACTION_TYPE_P2P_OUT_OF_NETWORK;
        }

        public static SavingsGoal.GoalState fromValue(int i) {
            if (i == 0) {
                return SavingsGoal.GoalState.GOAL_STATE_DEFAULT_UNSPECIFIED;
            }
            if (i == 1) {
                return SavingsGoal.GoalState.GOAL_STATE_IN_PROGRESS;
            }
            if (i == 2) {
                return SavingsGoal.GoalState.GOAL_STATE_COMPLETED;
            }
            if (i == 3) {
                return SavingsGoal.GoalState.GOAL_STATE_REPLACED;
            }
            if (i != 4) {
                return null;
            }
            return SavingsGoal.GoalState.GOAL_STATE_CANCELLED;
        }
    }
}
