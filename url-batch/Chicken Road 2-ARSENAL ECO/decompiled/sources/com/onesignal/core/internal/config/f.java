package com.onesignal.core.internal.config;

import com.onesignal.common.modeling.i;
import kotlin.jvm.internal.j;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public final class f extends i {

    public static final class a extends j implements InterfaceC0732a {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i parentModel, String parentProperty) {
        super(parentModel, parentProperty);
        kotlin.jvm.internal.i.e(parentModel, "parentModel");
        kotlin.jvm.internal.i.e(parentProperty, "parentProperty");
    }

    public final i2.c getLogLevel() {
        Object optAnyProperty$default = i.getOptAnyProperty$default(this, "logLevel", null, 2, null);
        return (i2.c) (optAnyProperty$default != null ? optAnyProperty$default instanceof i2.c ? (Enum) optAnyProperty$default : optAnyProperty$default instanceof String ? i2.c.valueOf((String) optAnyProperty$default) : (i2.c) optAnyProperty$default : null);
    }

    public final boolean isEnabled() {
        return getBooleanProperty("isEnabled", a.INSTANCE);
    }

    public final void setEnabled(boolean z5) {
        i.setBooleanProperty$default(this, "isEnabled", z5, null, false, 12, null);
    }

    public final void setLogLevel(i2.c cVar) {
        setOptAnyProperty("logLevel", cVar != null ? cVar.toString() : null, "NORMAL", false);
    }
}
