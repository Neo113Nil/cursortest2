package com.yandex.varioqub.flutter;

import android.text.TextUtils;
import com.yandex.varioqub.config.VarioqubSettings;
import com.yandex.varioqub.flutter.pigeon.Pigeon;
import java.util.Map;

/* loaded from: classes.dex */
class VarioqubSettingsConverter {
    public static VarioqubSettings convertSettingsFromPigeon(Pigeon.VarioqubSettingsPigeon varioqubSettingsPigeon) {
        String clientId = varioqubSettingsPigeon.getClientId();
        if (clientId == null) {
            throw new IllegalArgumentException("Client id must not be null");
        }
        VarioqubSettings.Builder builder = new VarioqubSettings.Builder(clientId);
        if (!TextUtils.isEmpty(varioqubSettingsPigeon.getUrl())) {
            builder.withUrl(varioqubSettingsPigeon.getUrl());
        }
        if (varioqubSettingsPigeon.getFetchThrottleIntervalSeconds() != null) {
            builder.withThrottleInterval(varioqubSettingsPigeon.getFetchThrottleIntervalSeconds().longValue());
        }
        if (varioqubSettingsPigeon.getLogs() != null && varioqubSettingsPigeon.getLogs().booleanValue()) {
            builder.withLogs();
        }
        if (varioqubSettingsPigeon.getActivateEvent() != null) {
            builder.withActivateEvent(varioqubSettingsPigeon.getActivateEvent().booleanValue());
        }
        if (varioqubSettingsPigeon.getClientFeatures() != null) {
            for (Map.Entry<String, String> entry : varioqubSettingsPigeon.getClientFeatures().entrySet()) {
                builder.withClientFeature(entry.getKey(), entry.getValue());
            }
        }
        return builder.build();
    }
}
