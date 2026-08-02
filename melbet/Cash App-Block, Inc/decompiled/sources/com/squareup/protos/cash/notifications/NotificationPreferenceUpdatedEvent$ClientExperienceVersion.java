package com.squareup.protos.cash.notifications;

import com.squareup.protos.cash.papermate.enums.FeeType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum NotificationPreferenceUpdatedEvent$ClientExperienceVersion implements WireEnum {
    CLIENT_EXPERIENCE_VERSION_UNSPECIFIED(0),
    CLIENT_EXPERIENCE_VERSION_INITIAL(1),
    CLIENT_EXPERIENCE_VERSION_2024_CATEGORY_SETTINGS(2);

    public static final NotificationPreferenceUpdatedEvent$ClientExperienceVersion$Companion$ADAPTER$1 ADAPTER;
    public static final FeeType.Companion Companion;
    public final int value;

    static {
        NotificationPreferenceUpdatedEvent$ClientExperienceVersion notificationPreferenceUpdatedEvent$ClientExperienceVersion = CLIENT_EXPERIENCE_VERSION_UNSPECIFIED;
        Companion = new FeeType.Companion();
        ADAPTER = new NotificationPreferenceUpdatedEvent$ClientExperienceVersion$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(NotificationPreferenceUpdatedEvent$ClientExperienceVersion.class), Syntax.PROTO_2, notificationPreferenceUpdatedEvent$ClientExperienceVersion);
    }

    NotificationPreferenceUpdatedEvent$ClientExperienceVersion(int i) {
        this.value = i;
    }

    public static final NotificationPreferenceUpdatedEvent$ClientExperienceVersion fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return CLIENT_EXPERIENCE_VERSION_UNSPECIFIED;
        }
        if (i == 1) {
            return CLIENT_EXPERIENCE_VERSION_INITIAL;
        }
        if (i != 2) {
            return null;
        }
        return CLIENT_EXPERIENCE_VERSION_2024_CATEGORY_SETTINGS;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
