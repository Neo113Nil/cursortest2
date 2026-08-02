package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* loaded from: classes.dex */
public abstract class N4 extends AbstractC0897v5 {
    public N4(BaseRequestConfig.ComponentLoader<Object, Object, S5> componentLoader, C0603jm c0603jm, BaseRequestConfig.BaseRequestArguments<C0896v4, Object> baseRequestArguments) {
        super(componentLoader, c0603jm, baseRequestArguments);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0897v5
    public final void a(Object obj) {
        C0896v4 c0896v4 = (C0896v4) obj;
        synchronized (this) {
            super.a((Object) c0896v4);
        }
    }

    public final synchronized void a(C0896v4 c0896v4) {
        super.a((Object) c0896v4);
    }
}
