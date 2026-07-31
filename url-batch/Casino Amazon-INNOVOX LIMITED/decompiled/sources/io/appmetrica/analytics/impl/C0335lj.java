package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.lj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0335lj {

    /* renamed from: a, reason: collision with root package name */
    public final String f1361a;
    public final Context b;
    public final CounterConfigurationReporterType c;
    public final C0410oj d;

    public C0335lj(String str, Context context, CounterConfigurationReporterType counterConfigurationReporterType, C0410oj c0410oj) {
        this.f1361a = str;
        this.b = context;
        int i = AbstractC0309kj.f1346a[counterConfigurationReporterType.ordinal()];
        if (i == 1) {
            this.c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MAIN;
        } else if (i != 2) {
            this.c = null;
        } else {
            this.c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MANUAL;
        }
        this.d = c0410oj;
    }
}
