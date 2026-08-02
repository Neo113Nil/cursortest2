package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.y1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1093y1 extends IAppMetricaService.Stub {

    /* renamed from: a, reason: collision with root package name */
    public final A1 f13049a;

    public BinderC1093y1(A1 a12) {
        this.f13049a = a12;
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void pauseUserSession(Bundle bundle) {
        ((B1) this.f13049a).pauseUserSession(bundle);
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void reportData(int i4, Bundle bundle) {
        ((B1) this.f13049a).reportData(i4, bundle);
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void resumeUserSession(Bundle bundle) {
        ((B1) this.f13049a).resumeUserSession(bundle);
    }
}
