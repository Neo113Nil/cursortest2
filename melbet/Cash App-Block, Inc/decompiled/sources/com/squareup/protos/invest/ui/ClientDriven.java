package com.squareup.protos.invest.ui;

import com.squareup.protos.franklin.common.FieldName;
import com.squareup.protos.franklin.common.StatusResultButton;
import com.squareup.protos.franklin.ui.CardOrderData;
import com.squareup.protos.franklin.ui.IdentityHubState;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class ClientDriven implements WireEnum {
    public static final /* synthetic */ ClientDriven[] $VALUES;
    public static final ClientDriven$Companion$ADAPTER$1 ADAPTER;
    public static final ClientDriven CURRENT_PRICE;
    public static final Companion Companion;

    static {
        ClientDriven clientDriven = new ClientDriven("CURRENT_PRICE", 0);
        CURRENT_PRICE = clientDriven;
        $VALUES = new ClientDriven[]{clientDriven};
        Companion = new Companion();
        ADAPTER = new ClientDriven$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ClientDriven.class), Syntax.PROTO_2, null);
    }

    public static final ClientDriven fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return CURRENT_PRICE;
        }
        return null;
    }

    public static ClientDriven valueOf(String str) {
        return (ClientDriven) Enum.valueOf(ClientDriven.class, str);
    }

    public static ClientDriven[] values() {
        return (ClientDriven[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return 1;
    }

    public final class Companion {
        public static FieldName fromValue(int i) {
            switch (i) {
                case 1:
                    return FieldName.CARD_NUMBER;
                case 2:
                    return FieldName.CARD_EXPIRATION;
                case 3:
                    return FieldName.CARD_POSTAL_CODE;
                case 4:
                default:
                    return null;
                case 5:
                    return FieldName.PASSWORD;
                case 6:
                    return FieldName.SMS_NUMBER;
                case 7:
                    return FieldName.SMS_VERIFICATION_CODE;
                case 8:
                    return FieldName.BANK_ROUTING_NUMBER;
                case 9:
                    return FieldName.BANK_ACCOUNT_NUMBER;
                case 10:
                    return FieldName.CARD_CVV;
                case 11:
                    return FieldName.EMAIL_VERIFICATION_CODE;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static IdentityHubState.EntrypointStatus m3978fromValue(int i) {
            if (i == 1) {
                return IdentityHubState.EntrypointStatus.VERIFY;
            }
            if (i == 2) {
                return IdentityHubState.EntrypointStatus.CONTINUE;
            }
            if (i == 3) {
                return IdentityHubState.EntrypointStatus.PENDING;
            }
            if (i == 4) {
                return IdentityHubState.EntrypointStatus.NOT_VERIFIED;
            }
            if (i != 5) {
                return null;
            }
            return IdentityHubState.EntrypointStatus.VERIFIED;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static StatusResultButton.ButtonAction m3976fromValue(int i) {
            if (i == 1) {
                return StatusResultButton.ButtonAction.PAY_SCREEN;
            }
            if (i == 2) {
                return StatusResultButton.ButtonAction.LINK_CARD;
            }
            if (i == 3) {
                return StatusResultButton.ButtonAction.OPEN_URL;
            }
            if (i == 5) {
                return StatusResultButton.ButtonAction.INVITATION_SCREEN;
            }
            if (i == 6) {
                return StatusResultButton.ButtonAction.ADD_CASH;
            }
            if (i == 8) {
                return StatusResultButton.ButtonAction.COMPLETE_CLIENT_SCENARIO;
            }
            if (i == 9) {
                return StatusResultButton.ButtonAction.START_SUPPORT_FLOW;
            }
            if (i != 11) {
                return null;
            }
            return StatusResultButton.ButtonAction.BLOCKER_ACTION;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static CardOrderData.OrderScenarioType m3977fromValue(int i) {
            if (i == 1) {
                return CardOrderData.OrderScenarioType.FIRST_TIME_ORDER;
            }
            if (i == 2) {
                return CardOrderData.OrderScenarioType.REPLACEMENT_ORDER;
            }
            if (i == 3) {
                return CardOrderData.OrderScenarioType.LOST_DEVICE_ORDER;
            }
            if (i == 4) {
                return CardOrderData.OrderScenarioType.EXPIRED_DEVICE_ORDER;
            }
            if (i != 5) {
                return null;
            }
            return CardOrderData.OrderScenarioType.DEBIT_FLEX_UPGRADE;
        }
    }
}
