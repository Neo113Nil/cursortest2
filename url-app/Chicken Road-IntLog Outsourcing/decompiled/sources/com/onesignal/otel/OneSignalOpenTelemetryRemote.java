package com.onesignal.otel;

import I3.d;
import P3.e;
import a.AbstractC0169a;
import c3.C0310a;
import com.onesignal.otel.attributes.OtelFieldsPerEvent;
import com.onesignal.otel.attributes.OtelFieldsTopLevel;
import com.onesignal.otel.config.OtelConfigRemoteOneSignal;
import com.onesignal.otel.config.OtelConfigShared;
import f4.InterfaceC0428e;
import java.util.Map;
import java.util.logging.Logger;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class OneSignalOpenTelemetryRemote extends OneSignalOpenTelemetryBase implements IOtelOpenTelemetryRemote {
    private final InterfaceC0428e extraHttpHeaders$delegate;
    private final InterfaceC0428e logExporter$delegate;
    private final IOtelPlatformProvider platformProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSignalOpenTelemetryRemote(IOtelPlatformProvider platformProvider, OtelFieldsTopLevel osTopLevelFields, OtelFieldsPerEvent osPerEventFields) {
        super(osTopLevelFields, osPerEventFields);
        i.e(platformProvider, "platformProvider");
        i.e(osTopLevelFields, "osTopLevelFields");
        i.e(osPerEventFields, "osPerEventFields");
        this.platformProvider = platformProvider;
        this.extraHttpHeaders$delegate = AbstractC0169a.A(new OneSignalOpenTelemetryRemote$extraHttpHeaders$2(this));
        this.logExporter$delegate = AbstractC0169a.A(new OneSignalOpenTelemetryRemote$logExporter$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getApiBaseUrl() {
        return this.platformProvider.getApiBaseUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getAppId() {
        return this.platformProvider.getAppIdForHeaders();
    }

    public final Map<String, String> getExtraHttpHeaders() {
        return (Map) this.extraHttpHeaders$delegate.getValue();
    }

    @Override // com.onesignal.otel.IOtelOpenTelemetryRemote
    public e getLogExporter() {
        return (e) this.logExporter$delegate.getValue();
    }

    @Override // com.onesignal.otel.OneSignalOpenTelemetryBase
    public d getSdkInstance(Map<String, String> attributes) {
        i.e(attributes, "attributes");
        Logger logger = d.f1274f;
        B0.e eVar = new B0.e(5);
        eVar.f146b = C0310a.f4919b;
        eVar.f147c = OtelConfigRemoteOneSignal.SdkLoggerProviderConfig.INSTANCE.create(OtelConfigShared.ResourceConfig.INSTANCE.create(attributes), getExtraHttpHeaders(), getAppId(), getApiBaseUrl(), this.platformProvider.isOtelExporterLoggingEnabled());
        return eVar.k();
    }
}
