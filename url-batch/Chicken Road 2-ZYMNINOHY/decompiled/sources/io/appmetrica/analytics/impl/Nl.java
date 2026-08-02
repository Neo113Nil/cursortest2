package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.StartupParamsCallback;

/* loaded from: classes.dex */
public final class Nl implements A6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StartupParamsCallback f10724a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ol f10725b;

    public Nl(Ol ol, StartupParamsCallback startupParamsCallback) {
        this.f10725b = ol;
        this.f10724a = startupParamsCallback;
    }

    @Override // io.appmetrica.analytics.impl.A6
    public final void a(int i4, Bundle bundle) {
        this.f10725b.b(bundle, this.f10724a);
    }
}
