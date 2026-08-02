package com.withpersona.sdk2.inquiry.tracking.network;

import com.withpersona.sdk2.inquiry.device.DeviceModule;
import com.withpersona.sdk2.inquiry.device.DeviceModule_AppSetIdHelperFactory;
import com.withpersona.sdk2.inquiry.logger.C0350SubsystemLogger_Factory;
import com.withpersona.sdk2.inquiry.logger.Logger_Factory;
import com.withpersona.sdk2.inquiry.logger.SubsystemLogger_Factory_Impl;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_InterceptorFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_KeyInflectionFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_MoshiFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_OkhttpClientFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_ProvideMoshiJsonAdapterFactoryFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_ResponseInterceptorFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_RetrofitFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_UseServerStylesFactory;
import com.withpersona.sdk2.inquiry.network.dto.NetworkInquiryModule_ProvideMoshiJsonAdapterFactoryFactory;
import com.withpersona.sdk2.inquiry.network.dto.NetworkInquiryModule_UserAgentFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.MapFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.SetBuilder;
import dagger.internal.SetFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes9.dex */
public final class DaggerTrackingEventsServiceComponent {
    private DaggerTrackingEventsServiceComponent() {
    }

    public static Builder builder() {
        return new Builder(0);
    }

    public static final class Builder {
        private DeviceModule deviceModule;
        private NetworkCoreModule networkCoreModule;
        private TrackingEventsServiceModule trackingEventsServiceModule;

        public /* synthetic */ Builder(int i) {
            this();
        }

        public TrackingEventsServiceComponent build() {
            Preconditions.checkBuilderRequirement(NetworkCoreModule.class, this.networkCoreModule);
            Preconditions.checkBuilderRequirement(TrackingEventsServiceModule.class, this.trackingEventsServiceModule);
            if (this.deviceModule == null) {
                this.deviceModule = new DeviceModule();
            }
            return new TrackingEventsServiceComponentImpl(this.networkCoreModule, this.trackingEventsServiceModule, this.deviceModule, 0);
        }

        public Builder deviceModule(DeviceModule deviceModule) {
            deviceModule.getClass();
            this.deviceModule = deviceModule;
            return this;
        }

        public Builder networkCoreModule(NetworkCoreModule networkCoreModule) {
            networkCoreModule.getClass();
            this.networkCoreModule = networkCoreModule;
            return this;
        }

        public Builder trackingEventsServiceModule(TrackingEventsServiceModule trackingEventsServiceModule) {
            trackingEventsServiceModule.getClass();
            this.trackingEventsServiceModule = trackingEventsServiceModule;
            return this;
        }

        private Builder() {
        }
    }

    public static final class TrackingEventsServiceComponentImpl implements TrackingEventsServiceComponent {
        private Provider appSetIdHelperProvider;
        private Provider deviceInfoProvider;
        private Provider factoryProvider;
        private Provider interceptorProvider;
        private Provider keyInflectionProvider;
        private Provider loggerProvider;
        private Provider mapOfStringAndStringProvider;
        private Provider moshiProvider;
        private Provider okhttpClientProvider;
        private Provider provideContextProvider;
        private Provider provideTrackingEventsServiceApiProvider;
        private Provider realDeviceInfoProvider;
        private Provider realDeviceVendorIDProvider;
        private Provider responseInterceptorProvider;
        private Provider retrofitProvider;
        private Provider serverEndpointProvider;
        private Provider setOfInterceptorProvider;
        private Provider setOfJsonAdapterBindingOfProvider;
        private Provider setOfJsonAdapterFactoryProvider;
        private Provider setOfObjectProvider;
        private C0350SubsystemLogger_Factory subsystemLoggerProvider;
        private final TrackingEventsServiceComponentImpl trackingEventsServiceComponentImpl;
        private Provider trackingEventsServiceProvider;
        private Provider useServerStylesProvider;

        private TrackingEventsServiceComponentImpl(NetworkCoreModule networkCoreModule, TrackingEventsServiceModule trackingEventsServiceModule, DeviceModule deviceModule) {
            this.trackingEventsServiceComponentImpl = this;
            initialize(networkCoreModule, trackingEventsServiceModule, deviceModule);
        }

        private void initialize(NetworkCoreModule networkCoreModule, TrackingEventsServiceModule trackingEventsServiceModule, DeviceModule deviceModule) {
            this.serverEndpointProvider = TrackingEventsServiceModule_ServerEndpointFactory.create(trackingEventsServiceModule);
            this.responseInterceptorProvider = NetworkCoreModule_ResponseInterceptorFactory.create(networkCoreModule);
            int i = SetFactory.$r8$clinit;
            List list = Collections.EMPTY_LIST;
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(TrackingEventsServiceModule_ProvideMoshiJsonAdapterFactory.create());
            this.setOfObjectProvider = new SetFactory(list, arrayList);
            List list2 = Collections.EMPTY_LIST;
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(TrackingEventsServiceModule_ProvideMoshiJsonAdapterBindingFactory.create());
            this.setOfJsonAdapterBindingOfProvider = new SetFactory(list2, arrayList2);
            List list3 = Collections.EMPTY_LIST;
            ArrayList arrayList3 = new ArrayList(2);
            arrayList3.add(NetworkInquiryModule_ProvideMoshiJsonAdapterFactoryFactory.create());
            arrayList3.add(NetworkCoreModule_ProvideMoshiJsonAdapterFactoryFactory.create());
            SetFactory setFactory = new SetFactory(list3, arrayList3);
            this.setOfJsonAdapterFactoryProvider = setFactory;
            Provider provider = DoubleCheck.provider(NetworkCoreModule_MoshiFactory.create(networkCoreModule, this.setOfObjectProvider, this.setOfJsonAdapterBindingOfProvider, (Provider) setFactory));
            this.moshiProvider = provider;
            this.interceptorProvider = NetworkCoreModule_InterceptorFactory.create(networkCoreModule, provider);
            ArrayList arrayList4 = new ArrayList(2);
            List list4 = Collections.EMPTY_LIST;
            arrayList4.add(this.responseInterceptorProvider);
            arrayList4.add(this.interceptorProvider);
            this.setOfInterceptorProvider = new SetFactory(arrayList4, list4);
            this.keyInflectionProvider = NetworkCoreModule_KeyInflectionFactory.create(networkCoreModule);
            this.useServerStylesProvider = NetworkCoreModule_UseServerStylesFactory.create(networkCoreModule);
            int i2 = MapFactory.$r8$clinit;
            SetBuilder setBuilder = new SetBuilder(3);
            setBuilder.put$dagger$internal$AbstractMapFactory$Builder("User-Agent", NetworkInquiryModule_UserAgentFactory.create());
            setBuilder.put$dagger$internal$AbstractMapFactory$Builder("Key-Inflection", this.keyInflectionProvider);
            setBuilder.put$dagger$internal$AbstractMapFactory$Builder("Persona-Use-Mobile-Server-Styles", this.useServerStylesProvider);
            this.mapOfStringAndStringProvider = new MapFactory((LinkedHashMap) setBuilder.contributions);
            TrackingEventsServiceModule_ProvideContextFactory create = TrackingEventsServiceModule_ProvideContextFactory.create(trackingEventsServiceModule);
            this.provideContextProvider = create;
            Logger_Factory logger_Factory = new Logger_Factory(create, 6);
            this.realDeviceVendorIDProvider = logger_Factory;
            int i3 = 0;
            this.appSetIdHelperProvider = DoubleCheck.provider(new DeviceModule_AppSetIdHelperFactory(deviceModule, logger_Factory, i3));
            Logger_Factory logger_Factory2 = new Logger_Factory(this.provideContextProvider, 5);
            this.realDeviceInfoProvider = logger_Factory2;
            this.deviceInfoProvider = DoubleCheck.provider(new DeviceModule_AppSetIdHelperFactory(deviceModule, logger_Factory2, 4));
            Logger_Factory logger_Factory3 = new Logger_Factory(this.provideContextProvider, i3);
            this.loggerProvider = logger_Factory3;
            C0350SubsystemLogger_Factory c0350SubsystemLogger_Factory = new C0350SubsystemLogger_Factory(logger_Factory3);
            this.subsystemLoggerProvider = c0350SubsystemLogger_Factory;
            InstanceFactory create2 = InstanceFactory.create(new SubsystemLogger_Factory_Impl(c0350SubsystemLogger_Factory));
            this.factoryProvider = create2;
            NetworkCoreModule_OkhttpClientFactory create3 = NetworkCoreModule_OkhttpClientFactory.create(networkCoreModule, this.setOfInterceptorProvider, this.mapOfStringAndStringProvider, this.provideContextProvider, this.appSetIdHelperProvider, this.deviceInfoProvider, (Provider) create2);
            this.okhttpClientProvider = create3;
            Provider provider2 = DoubleCheck.provider(NetworkCoreModule_RetrofitFactory.create(networkCoreModule, this.serverEndpointProvider, (Provider) create3, this.moshiProvider));
            this.retrofitProvider = provider2;
            Provider provider3 = DoubleCheck.provider(TrackingEventsServiceModule_ProvideTrackingEventsServiceApiFactory.create(trackingEventsServiceModule, provider2));
            this.provideTrackingEventsServiceApiProvider = provider3;
            this.trackingEventsServiceProvider = DoubleCheck.provider(TrackingEventsService_Factory.create(provider3));
        }

        @Override // com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsServiceComponent
        public TrackingEventsService trackingEventsService() {
            return (TrackingEventsService) this.trackingEventsServiceProvider.get();
        }

        public /* synthetic */ TrackingEventsServiceComponentImpl(NetworkCoreModule networkCoreModule, TrackingEventsServiceModule trackingEventsServiceModule, DeviceModule deviceModule, int i) {
            this(networkCoreModule, trackingEventsServiceModule, deviceModule);
        }
    }
}
