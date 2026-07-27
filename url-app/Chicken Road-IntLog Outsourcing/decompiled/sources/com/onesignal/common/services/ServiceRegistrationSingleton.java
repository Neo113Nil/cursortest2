package com.onesignal.common.services;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class ServiceRegistrationSingleton<T> extends ServiceRegistration<T> {
    private T obj;

    public ServiceRegistrationSingleton(T t5) {
        this.obj = t5;
    }

    @Override // com.onesignal.common.services.ServiceRegistration
    public Object resolve(IServiceProvider provider) {
        i.e(provider, "provider");
        return this.obj;
    }
}
