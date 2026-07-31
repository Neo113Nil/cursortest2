package com.onesignal.otel;

import com.onesignal.otel.attributes.OtelFieldsPerEvent;
import com.onesignal.otel.attributes.OtelFieldsTopLevel;
import com.onesignal.otel.config.OtelConfigCrashFile;
import com.onesignal.otel.config.OtelConfigShared;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OneSignalOpenTelemetry.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/onesignal/otel/OneSignalOpenTelemetryCrashLocal;", "Lcom/onesignal/otel/OneSignalOpenTelemetryBase;", "Lcom/onesignal/otel/IOtelOpenTelemetryCrash;", "platformProvider", "Lcom/onesignal/otel/IOtelPlatformProvider;", "osTopLevelFields", "Lcom/onesignal/otel/attributes/OtelFieldsTopLevel;", "osPerEventFields", "Lcom/onesignal/otel/attributes/OtelFieldsPerEvent;", "(Lcom/onesignal/otel/IOtelPlatformProvider;Lcom/onesignal/otel/attributes/OtelFieldsTopLevel;Lcom/onesignal/otel/attributes/OtelFieldsPerEvent;)V", "getSdkInstance", "Lio/opentelemetry/sdk/OpenTelemetrySdk;", "attributes", "", "", "com.onesignal.otel"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OneSignalOpenTelemetryCrashLocal extends OneSignalOpenTelemetryBase implements IOtelOpenTelemetryCrash {
    private final IOtelPlatformProvider platformProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSignalOpenTelemetryCrashLocal(IOtelPlatformProvider platformProvider, OtelFieldsTopLevel osTopLevelFields, OtelFieldsPerEvent osPerEventFields) {
        super(osTopLevelFields, osPerEventFields);
        Intrinsics.checkNotNullParameter(platformProvider, "platformProvider");
        Intrinsics.checkNotNullParameter(osTopLevelFields, "osTopLevelFields");
        Intrinsics.checkNotNullParameter(osPerEventFields, "osPerEventFields");
        this.platformProvider = platformProvider;
    }

    @Override // com.onesignal.otel.OneSignalOpenTelemetryBase
    protected OpenTelemetrySdk getSdkInstance(Map<String, String> attributes) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        OpenTelemetrySdk build = OpenTelemetrySdk.builder().setLoggerProvider(OtelConfigCrashFile.SdkLoggerProviderConfig.INSTANCE.create(OtelConfigShared.ResourceConfig.INSTANCE.create(attributes), this.platformProvider.getCrashStoragePath(), this.platformProvider.getMinFileAgeForReadMillis())).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
