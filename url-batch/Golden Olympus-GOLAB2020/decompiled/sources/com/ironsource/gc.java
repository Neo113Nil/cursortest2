package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* loaded from: classes2.dex */
class gc {

    /* renamed from: a, reason: collision with root package name */
    static final String f16370a = "ironbeast";

    /* renamed from: b, reason: collision with root package name */
    static final String f16371b = "outcome";

    /* renamed from: c, reason: collision with root package name */
    static final int f16372c = 3;

    /* renamed from: d, reason: collision with root package name */
    static final int f16373d = 2;

    /* renamed from: e, reason: collision with root package name */
    static final int f16374e = 0;

    gc() {
    }

    static AbstractC1451e a(String str, int i4) {
        if (f16370a.equals(str)) {
            return new mk(i4);
        }
        if (f16371b.equals(str)) {
            return new xo(i4);
        }
        if (i4 == 2) {
            return new mk(i4);
        }
        if (i4 == 3) {
            return new xo(i4);
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.NATIVE, "EventsFormatterFactory failed to instantiate a formatter (type: " + str + ", adUnit: " + i4 + ")", 2);
        return null;
    }
}
