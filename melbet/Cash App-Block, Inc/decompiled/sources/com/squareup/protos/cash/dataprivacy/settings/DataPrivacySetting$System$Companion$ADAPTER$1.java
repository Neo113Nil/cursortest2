package com.squareup.protos.cash.dataprivacy.settings;

import com.squareup.protos.cash.dataprivacy.settings.DataPrivacySetting;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class DataPrivacySetting$System$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        DataPrivacySetting.System.Companion.getClass();
        if (i == 1) {
            return DataPrivacySetting.System.APPSFLYER;
        }
        if (i == 2) {
            return DataPrivacySetting.System.ANALYTICS;
        }
        if (i != 3) {
            return null;
        }
        return DataPrivacySetting.System.CRASH_REPORTING;
    }
}
