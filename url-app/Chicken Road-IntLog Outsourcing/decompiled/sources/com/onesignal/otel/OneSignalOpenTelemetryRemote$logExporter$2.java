package com.onesignal.otel;

import P3.e;
import com.onesignal.otel.config.OtelConfigRemoteOneSignal;
import java.util.Map;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class OneSignalOpenTelemetryRemote$logExporter$2 extends j implements InterfaceC1430a {
    final /* synthetic */ OneSignalOpenTelemetryRemote this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSignalOpenTelemetryRemote$logExporter$2(OneSignalOpenTelemetryRemote oneSignalOpenTelemetryRemote) {
        super(0);
        this.this$0 = oneSignalOpenTelemetryRemote;
    }

    @Override // t4.InterfaceC1430a
    public final e invoke() {
        String appId;
        String apiBaseUrl;
        IOtelPlatformProvider iOtelPlatformProvider;
        OtelConfigRemoteOneSignal.HttpRecordBatchExporter httpRecordBatchExporter = OtelConfigRemoteOneSignal.HttpRecordBatchExporter.INSTANCE;
        Map<String, String> extraHttpHeaders = this.this$0.getExtraHttpHeaders();
        appId = this.this$0.getAppId();
        apiBaseUrl = this.this$0.getApiBaseUrl();
        iOtelPlatformProvider = this.this$0.platformProvider;
        return httpRecordBatchExporter.create(extraHttpHeaders, appId, apiBaseUrl, iOtelPlatformProvider.isOtelExporterLoggingEnabled());
    }
}
