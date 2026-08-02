package com.squareup.protos.cash.notifications;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class NotificationPreferenceUpdatedEvent$ClientExperienceVersion$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        NotificationPreferenceUpdatedEvent$ClientExperienceVersion.Companion.getClass();
        if (i == 0) {
            return NotificationPreferenceUpdatedEvent$ClientExperienceVersion.CLIENT_EXPERIENCE_VERSION_UNSPECIFIED;
        }
        if (i == 1) {
            return NotificationPreferenceUpdatedEvent$ClientExperienceVersion.CLIENT_EXPERIENCE_VERSION_INITIAL;
        }
        if (i != 2) {
            return null;
        }
        return NotificationPreferenceUpdatedEvent$ClientExperienceVersion.CLIENT_EXPERIENCE_VERSION_2024_CATEGORY_SETTINGS;
    }
}
