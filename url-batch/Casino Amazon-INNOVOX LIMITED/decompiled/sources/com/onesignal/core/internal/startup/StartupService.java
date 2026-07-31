package com.onesignal.core.internal.startup;

import com.onesignal.common.services.ServiceProvider;
import com.onesignal.common.threading.OneSignalDispatchers;
import com.onesignal.core.BuildConfig;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StartupService.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/onesignal/core/internal/startup/StartupService;", "", "services", "Lcom/onesignal/common/services/ServiceProvider;", "(Lcom/onesignal/common/services/ServiceProvider;)V", "bootstrap", "", "scheduleStart", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StartupService {
    private final ServiceProvider services;

    public StartupService(ServiceProvider services) {
        Intrinsics.checkNotNullParameter(services, "services");
        this.services = services;
    }

    public final void bootstrap() {
        Iterator it = this.services.getAllServices(IBootstrapService.class).iterator();
        while (it.hasNext()) {
            ((IBootstrapService) it.next()).bootstrap();
        }
    }

    public final void scheduleStart() {
        OneSignalDispatchers.INSTANCE.launchOnDefault(new StartupService$scheduleStart$1(this, null));
    }
}
