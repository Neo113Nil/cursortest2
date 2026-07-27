package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.StartupParamsCallback;

/* loaded from: classes.dex */
public final class Rl implements H6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StartupParamsCallback f7397a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Sl f7398b;

    public Rl(Sl sl, StartupParamsCallback startupParamsCallback) {
        this.f7398b = sl;
        this.f7397a = startupParamsCallback;
    }

    @Override // io.appmetrica.analytics.impl.H6
    public final void a(int i2, Bundle bundle) {
        this.f7398b.b(bundle, this.f7397a);
    }
}
