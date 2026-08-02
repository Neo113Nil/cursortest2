package com.squareup.protos.cash.cashliteflow.blockers.v1;

import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum PushProvisioningStatus implements WireEnum {
    PUSH_PROVISIONING_STATUS_UNSPECIFIED(0),
    PUSH_PROVISIONING_STATUS_SUCCESS(1),
    PUSH_PROVISIONING_STATUS_FAILED(2),
    PUSH_PROVISIONING_STATUS_USER_CANCELED(3);

    public static final PushProvisioningStatus$Companion$ADAPTER$1 ADAPTER;
    public static final Action.Type.Companion Companion;
    public final int value;

    static {
        PushProvisioningStatus pushProvisioningStatus = PUSH_PROVISIONING_STATUS_UNSPECIFIED;
        Companion = new Action.Type.Companion();
        ADAPTER = new PushProvisioningStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PushProvisioningStatus.class), Syntax.PROTO_2, pushProvisioningStatus);
    }

    PushProvisioningStatus(int i) {
        this.value = i;
    }

    public static final PushProvisioningStatus fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return PUSH_PROVISIONING_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return PUSH_PROVISIONING_STATUS_SUCCESS;
        }
        if (i == 2) {
            return PUSH_PROVISIONING_STATUS_FAILED;
        }
        if (i != 3) {
            return null;
        }
        return PUSH_PROVISIONING_STATUS_USER_CANCELED;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
