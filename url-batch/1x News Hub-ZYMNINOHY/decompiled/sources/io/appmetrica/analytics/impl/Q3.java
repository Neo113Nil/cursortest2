package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator;

/* loaded from: classes.dex */
public final class Q3 implements ModuleClientActivator {
    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator
    public final void activate(Context context) {
        C0375b0 b3 = C0585j4.l().b();
        b3.f7054c.a().executeDelayed(new C0349a0(b3, context), b3.f7055d);
    }
}
