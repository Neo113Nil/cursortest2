package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* loaded from: classes.dex */
public abstract class G4 extends AbstractC0838o5 {
    public G4(BaseRequestConfig.ComponentLoader<Object, Object, L5> componentLoader, C0622fm c0622fm, BaseRequestConfig.BaseRequestArguments<C0837o4, Object> baseRequestArguments) {
        super(componentLoader, c0622fm, baseRequestArguments);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0838o5
    public final void a(Object obj) {
        C0837o4 c0837o4 = (C0837o4) obj;
        synchronized (this) {
            super.a((Object) c0837o4);
        }
    }

    public final synchronized void a(C0837o4 c0837o4) {
        super.a((Object) c0837o4);
    }
}
