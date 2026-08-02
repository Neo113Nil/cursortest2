package com.squareup.protos.cash.familynotifications.api.v1;

import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum NotificationType implements WireEnum {
    NOTIFICATION_TYPE_UNSPECIFIED(0),
    NOTIFICATION_TYPE_REALTIME(1);

    public static final NotificationType$Companion$ADAPTER$1 ADAPTER;
    public static final Alignment.Companion Companion;
    public final int value;

    static {
        NotificationType notificationType = NOTIFICATION_TYPE_UNSPECIFIED;
        Companion = new Alignment.Companion();
        ADAPTER = new NotificationType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(NotificationType.class), Syntax.PROTO_2, notificationType);
    }

    NotificationType(int i) {
        this.value = i;
    }

    public static final NotificationType fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return NOTIFICATION_TYPE_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return NOTIFICATION_TYPE_REALTIME;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
