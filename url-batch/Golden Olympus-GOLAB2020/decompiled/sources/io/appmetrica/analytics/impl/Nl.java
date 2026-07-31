package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.StartupParamsCallback;

/* loaded from: classes3.dex */
public final class Nl implements V6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StartupParamsCallback f38032a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ol f38033b;

    public Nl(Ol ol, StartupParamsCallback startupParamsCallback) {
        this.f38033b = ol;
        this.f38032a = startupParamsCallback;
    }

    @Override // io.appmetrica.analytics.impl.V6
    public final void a(int i4, Bundle bundle) {
        this.f38033b.b(bundle, this.f38032a);
    }
}
