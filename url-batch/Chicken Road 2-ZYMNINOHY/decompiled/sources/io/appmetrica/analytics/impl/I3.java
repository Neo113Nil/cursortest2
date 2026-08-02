package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator;

/* loaded from: classes.dex */
public final class I3 implements ModuleClientActivator {
    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator
    public final void activate(Context context) {
        C0497b0 b4 = C0501b4.l().b();
        b4.f11449c.a().executeDelayed(new C0471a0(b4, context), b4.f11450d);
    }
}
