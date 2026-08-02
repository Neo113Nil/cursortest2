package com.squareup.protos.cash.cashliteflow.api.v1;

import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum PushProvisionStatus implements WireEnum {
    PUSH_PROVISION_STATUS_UNSPECIFIED(0),
    PUSH_PROVISION_STATUS_SUCCESS(1),
    PUSH_PROVISION_STATUS_FAILED(2);

    public static final PushProvisionStatus$Companion$ADAPTER$1 ADAPTER;
    public static final Alignment.Companion Companion;
    public final int value;

    static {
        PushProvisionStatus pushProvisionStatus = PUSH_PROVISION_STATUS_UNSPECIFIED;
        Companion = new Alignment.Companion();
        ADAPTER = new PushProvisionStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PushProvisionStatus.class), Syntax.PROTO_2, pushProvisionStatus);
    }

    PushProvisionStatus(int i) {
        this.value = i;
    }

    public static final PushProvisionStatus fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return PUSH_PROVISION_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return PUSH_PROVISION_STATUS_SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return PUSH_PROVISION_STATUS_FAILED;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
