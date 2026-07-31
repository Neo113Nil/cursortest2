package com.onesignal.core.internal.config;

import com.onesignal.common.modeling.Model;
import com.onesignal.common.modeling.ModelChangeTags;
import com.onesignal.core.BuildConfig;
import com.onesignal.debug.LogLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfigModel.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/onesignal/core/internal/config/RemoteLoggingConfigModel;", "Lcom/onesignal/common/modeling/Model;", "parentModel", "parentProperty", "", "(Lcom/onesignal/common/modeling/Model;Ljava/lang/String;)V", "value", "", "isEnabled", "()Z", "setEnabled", "(Z)V", "Lcom/onesignal/debug/LogLevel;", "logLevel", "getLogLevel", "()Lcom/onesignal/debug/LogLevel;", "setLogLevel", "(Lcom/onesignal/debug/LogLevel;)V", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RemoteLoggingConfigModel extends Model {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteLoggingConfigModel(Model parentModel, String parentProperty) {
        super(parentModel, parentProperty);
        Intrinsics.checkNotNullParameter(parentModel, "parentModel");
        Intrinsics.checkNotNullParameter(parentProperty, "parentProperty");
    }

    public final LogLevel getLogLevel() {
        Enum r3 = null;
        Object optAnyProperty$default = Model.getOptAnyProperty$default(this, "logLevel", null, 2, null);
        if (optAnyProperty$default != null) {
            if (optAnyProperty$default instanceof LogLevel) {
                r3 = (Enum) optAnyProperty$default;
            } else if (optAnyProperty$default instanceof String) {
                r3 = LogLevel.valueOf((String) optAnyProperty$default);
            } else {
                if (optAnyProperty$default == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.onesignal.debug.LogLevel");
                }
                r3 = (LogLevel) optAnyProperty$default;
            }
        }
        return (LogLevel) r3;
    }

    public final boolean isEnabled() {
        return getBooleanProperty("isEnabled", new Function0<Boolean>() { // from class: com.onesignal.core.internal.config.RemoteLoggingConfigModel$isEnabled$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return false;
            }
        });
    }

    public final void setEnabled(boolean z) {
        Model.setBooleanProperty$default(this, "isEnabled", z, null, false, 12, null);
    }

    public final void setLogLevel(LogLevel logLevel) {
        LogLevel logLevel2 = logLevel;
        setOptAnyProperty("logLevel", logLevel2 != null ? logLevel2.toString() : null, ModelChangeTags.NORMAL, false);
    }
}
