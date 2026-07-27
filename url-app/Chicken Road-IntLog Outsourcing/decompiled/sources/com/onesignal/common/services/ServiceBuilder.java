package com.onesignal.common.services;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class ServiceBuilder implements IServiceBuilder {
    private final List<ServiceRegistration<?>> registrations = new ArrayList();

    @Override // com.onesignal.common.services.IServiceBuilder
    public ServiceProvider build() {
        return new ServiceProvider(this.registrations);
    }

    public final /* synthetic */ <T> ServiceRegistration<T> register() {
        i.i();
        throw null;
    }

    @Override // com.onesignal.common.services.IServiceBuilder
    public <T> ServiceRegistration<T> register(Class<T> c2) {
        i.e(c2, "c");
        ServiceRegistrationReflection serviceRegistrationReflection = new ServiceRegistrationReflection(c2);
        this.registrations.add(serviceRegistrationReflection);
        return serviceRegistrationReflection;
    }

    @Override // com.onesignal.common.services.IServiceBuilder
    public <T> ServiceRegistration<T> register(InterfaceC1441l create) {
        i.e(create, "create");
        ServiceRegistrationLambda serviceRegistrationLambda = new ServiceRegistrationLambda(create);
        this.registrations.add(serviceRegistrationLambda);
        return serviceRegistrationLambda;
    }

    @Override // com.onesignal.common.services.IServiceBuilder
    public <T> ServiceRegistration<T> register(T t5) {
        ServiceRegistrationSingleton serviceRegistrationSingleton = new ServiceRegistrationSingleton(t5);
        this.registrations.add(serviceRegistrationSingleton);
        return serviceRegistrationSingleton;
    }
}
