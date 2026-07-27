package com.onesignal.core.internal.config;

import com.onesignal.common.modeling.Model;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class FCMConfigModel extends Model {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FCMConfigModel(Model parentModel, String parentProperty) {
        super(parentModel, parentProperty);
        i.e(parentModel, "parentModel");
        i.e(parentProperty, "parentProperty");
    }

    public final String getApiKey() {
        return getOptStringProperty("apiKey", FCMConfigModel$apiKey$1.INSTANCE);
    }

    public final String getAppId() {
        return getOptStringProperty("appId", FCMConfigModel$appId$1.INSTANCE);
    }

    public final String getProjectId() {
        return getOptStringProperty("projectId", FCMConfigModel$projectId$1.INSTANCE);
    }

    public final void setApiKey(String str) {
        Model.setOptStringProperty$default(this, "apiKey", str, null, false, 12, null);
    }

    public final void setAppId(String str) {
        Model.setOptStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    public final void setProjectId(String str) {
        Model.setOptStringProperty$default(this, "projectId", str, null, false, 12, null);
    }
}
