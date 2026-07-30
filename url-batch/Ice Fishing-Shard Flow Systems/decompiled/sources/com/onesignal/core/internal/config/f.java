package com.onesignal.core.internal.config;

import com.onesignal.common.modeling.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class f extends i {

    public static final class a extends p implements Function0 {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i parentModel, String parentProperty) {
        super(parentModel, parentProperty);
        Intrinsics.checkNotNullParameter(parentModel, "parentModel");
        Intrinsics.checkNotNullParameter(parentProperty, "parentProperty");
    }

    public final K2.c getLogLevel() {
        Object optAnyProperty$default = i.getOptAnyProperty$default(this, "logLevel", null, 2, null);
        return (K2.c) (optAnyProperty$default != null ? optAnyProperty$default instanceof K2.c ? (Enum) optAnyProperty$default : optAnyProperty$default instanceof String ? K2.c.valueOf((String) optAnyProperty$default) : (K2.c) optAnyProperty$default : null);
    }

    public final boolean isEnabled() {
        return getBooleanProperty("isEnabled", a.INSTANCE);
    }

    public final void setEnabled(boolean z7) {
        i.setBooleanProperty$default(this, "isEnabled", z7, null, false, 12, null);
    }

    public final void setLogLevel(K2.c cVar) {
        setOptAnyProperty("logLevel", cVar != null ? cVar.toString() : null, "NORMAL", false);
    }
}
