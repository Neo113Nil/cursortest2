package io.appmetrica.analytics.reporterextension.internal;

import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import io.appmetrica.analytics.reporterextension.internal.ReporterExtensionClientModuleEntryPoint;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class ReporterExtensionClientModuleEntryPoint extends ModuleClientEntryPoint<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final long f40688a = 10;

    /* renamed from: b, reason: collision with root package name */
    private final String f40689b = "reporter_extension";

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ClientContext clientContext) {
        clientContext.getClientActivator().activate(clientContext.getContext());
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    @NotNull
    public String getIdentifier() {
        return this.f40689b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void initClientSide(@NotNull final ClientContext clientContext) {
        super.initClientSide(clientContext);
        if (clientContext.getProcessDetector().isMainProcess()) {
            clientContext.getClientExecutorProvider().getDefaultExecutor().executeDelayed(new Runnable() { // from class: T1.a
                @Override // java.lang.Runnable
                public final void run() {
                    ReporterExtensionClientModuleEntryPoint.a(ClientContext.this);
                }
            }, this.f40688a, TimeUnit.SECONDS);
        }
    }
}
