package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.pj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0756pj {

    /* renamed from: a, reason: collision with root package name */
    public final String f8100a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f8101b;

    /* renamed from: c, reason: collision with root package name */
    public final CounterConfigurationReporterType f8102c;

    /* renamed from: d, reason: collision with root package name */
    public final C0833sj f8103d;

    public C0756pj(String str, Context context, CounterConfigurationReporterType counterConfigurationReporterType, C0833sj c0833sj) {
        this.f8100a = str;
        this.f8101b = context;
        int i3 = AbstractC0730oj.f8026a[counterConfigurationReporterType.ordinal()];
        if (i3 == 1) {
            this.f8102c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MAIN;
        } else if (i3 != 2) {
            this.f8102c = null;
        } else {
            this.f8102c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MANUAL;
        }
        this.f8103d = c0833sj;
    }
}
