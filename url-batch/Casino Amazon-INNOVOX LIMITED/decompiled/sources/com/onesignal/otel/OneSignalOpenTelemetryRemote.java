package com.onesignal.otel;

import com.onesignal.core.internal.http.impl.HttpClientKt;
import com.onesignal.otel.attributes.OtelFieldsPerEvent;
import com.onesignal.otel.attributes.OtelFieldsTopLevel;
import com.onesignal.otel.config.OtelConfigRemoteOneSignal;
import com.onesignal.otel.config.OtelConfigShared;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.logs.export.LogRecordExporter;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OneSignalOpenTelemetry.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001c\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u0011H\u0014R\u0014\u0010\n\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR'\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/onesignal/otel/OneSignalOpenTelemetryRemote;", "Lcom/onesignal/otel/OneSignalOpenTelemetryBase;", "Lcom/onesignal/otel/IOtelOpenTelemetryRemote;", "platformProvider", "Lcom/onesignal/otel/IOtelPlatformProvider;", "osTopLevelFields", "Lcom/onesignal/otel/attributes/OtelFieldsTopLevel;", "osPerEventFields", "Lcom/onesignal/otel/attributes/OtelFieldsPerEvent;", "(Lcom/onesignal/otel/IOtelPlatformProvider;Lcom/onesignal/otel/attributes/OtelFieldsTopLevel;Lcom/onesignal/otel/attributes/OtelFieldsPerEvent;)V", "apiBaseUrl", "", "getApiBaseUrl", "()Ljava/lang/String;", "appId", "getAppId", "extraHttpHeaders", "", "getExtraHttpHeaders", "()Ljava/util/Map;", "extraHttpHeaders$delegate", "Lkotlin/Lazy;", "logExporter", "Lio/opentelemetry/sdk/logs/export/LogRecordExporter;", "getLogExporter", "()Lio/opentelemetry/sdk/logs/export/LogRecordExporter;", "logExporter$delegate", "getSdkInstance", "Lio/opentelemetry/sdk/OpenTelemetrySdk;", "attributes", "com.onesignal.otel"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OneSignalOpenTelemetryRemote extends OneSignalOpenTelemetryBase implements IOtelOpenTelemetryRemote {

    /* renamed from: extraHttpHeaders$delegate, reason: from kotlin metadata */
    private final Lazy extraHttpHeaders;

    /* renamed from: logExporter$delegate, reason: from kotlin metadata */
    private final Lazy logExporter;
    private final IOtelPlatformProvider platformProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSignalOpenTelemetryRemote(IOtelPlatformProvider platformProvider, OtelFieldsTopLevel osTopLevelFields, OtelFieldsPerEvent osPerEventFields) {
        super(osTopLevelFields, osPerEventFields);
        Intrinsics.checkNotNullParameter(platformProvider, "platformProvider");
        Intrinsics.checkNotNullParameter(osTopLevelFields, "osTopLevelFields");
        Intrinsics.checkNotNullParameter(osPerEventFields, "osPerEventFields");
        this.platformProvider = platformProvider;
        this.extraHttpHeaders = LazyKt.lazy(new Function0<Map<String, ? extends String>>() { // from class: com.onesignal.otel.OneSignalOpenTelemetryRemote$extraHttpHeaders$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Map<String, ? extends String> invoke() {
                IOtelPlatformProvider iOtelPlatformProvider;
                IOtelPlatformProvider iOtelPlatformProvider2;
                StringBuilder sb = new StringBuilder("onesignal/");
                iOtelPlatformProvider = OneSignalOpenTelemetryRemote.this.platformProvider;
                StringBuilder append = sb.append(iOtelPlatformProvider.getSdkBase()).append(IOUtils.DIR_SEPARATOR_UNIX);
                iOtelPlatformProvider2 = OneSignalOpenTelemetryRemote.this.platformProvider;
                return MapsKt.mapOf(TuplesKt.to(HttpClientKt.HTTP_SDK_VERSION_HEADER_KEY, append.append(iOtelPlatformProvider2.getSdkBaseVersion()).toString()));
            }
        });
        this.logExporter = LazyKt.lazy(new Function0<LogRecordExporter>() { // from class: com.onesignal.otel.OneSignalOpenTelemetryRemote$logExporter$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final LogRecordExporter invoke() {
                String appId;
                String apiBaseUrl;
                IOtelPlatformProvider iOtelPlatformProvider;
                OtelConfigRemoteOneSignal.HttpRecordBatchExporter httpRecordBatchExporter = OtelConfigRemoteOneSignal.HttpRecordBatchExporter.INSTANCE;
                Map<String, String> extraHttpHeaders = OneSignalOpenTelemetryRemote.this.getExtraHttpHeaders();
                appId = OneSignalOpenTelemetryRemote.this.getAppId();
                apiBaseUrl = OneSignalOpenTelemetryRemote.this.getApiBaseUrl();
                iOtelPlatformProvider = OneSignalOpenTelemetryRemote.this.platformProvider;
                return httpRecordBatchExporter.create(extraHttpHeaders, appId, apiBaseUrl, iOtelPlatformProvider.getIsOtelExporterLoggingEnabled());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getAppId() {
        return this.platformProvider.getAppIdForHeaders();
    }

    public final Map<String, String> getExtraHttpHeaders() {
        return (Map) this.extraHttpHeaders.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getApiBaseUrl() {
        return this.platformProvider.getApiBaseUrl();
    }

    @Override // com.onesignal.otel.IOtelOpenTelemetryRemote
    public LogRecordExporter getLogExporter() {
        return (LogRecordExporter) this.logExporter.getValue();
    }

    @Override // com.onesignal.otel.OneSignalOpenTelemetryBase
    protected OpenTelemetrySdk getSdkInstance(Map<String, String> attributes) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        OpenTelemetrySdk build = OpenTelemetrySdk.builder().setLoggerProvider(OtelConfigRemoteOneSignal.SdkLoggerProviderConfig.INSTANCE.create(OtelConfigShared.ResourceConfig.INSTANCE.create(attributes), getExtraHttpHeaders(), getAppId(), getApiBaseUrl(), this.platformProvider.getIsOtelExporterLoggingEnabled())).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
