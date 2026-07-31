package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.xj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3097xj {

    /* renamed from: a, reason: collision with root package name */
    public final String f40197a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f40198b;

    /* renamed from: c, reason: collision with root package name */
    public final CounterConfigurationReporterType f40199c;

    /* renamed from: d, reason: collision with root package name */
    public final Aj f40200d;

    public C3097xj(String str, Context context, CounterConfigurationReporterType counterConfigurationReporterType, Aj aj) {
        this.f40197a = str;
        this.f40198b = context;
        int i4 = AbstractC3071wj.f40097a[counterConfigurationReporterType.ordinal()];
        if (i4 == 1) {
            this.f40199c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MAIN;
        } else if (i4 != 2) {
            this.f40199c = null;
        } else {
            this.f40199c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MANUAL;
        }
        this.f40200d = aj;
    }
}
