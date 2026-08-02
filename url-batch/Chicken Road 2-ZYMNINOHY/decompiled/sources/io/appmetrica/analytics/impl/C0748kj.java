package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.kj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0748kj {

    /* renamed from: a, reason: collision with root package name */
    public final String f12240a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f12241b;

    /* renamed from: c, reason: collision with root package name */
    public final CounterConfigurationReporterType f12242c;

    /* renamed from: d, reason: collision with root package name */
    public final C0826nj f12243d;

    public C0748kj(String str, Context context, CounterConfigurationReporterType counterConfigurationReporterType, C0826nj c0826nj) {
        this.f12240a = str;
        this.f12241b = context;
        int i4 = AbstractC0722jj.f12153a[counterConfigurationReporterType.ordinal()];
        if (i4 == 1) {
            this.f12242c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MAIN;
        } else if (i4 != 2) {
            this.f12242c = null;
        } else {
            this.f12242c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MANUAL;
        }
        this.f12243d = c0826nj;
    }
}
