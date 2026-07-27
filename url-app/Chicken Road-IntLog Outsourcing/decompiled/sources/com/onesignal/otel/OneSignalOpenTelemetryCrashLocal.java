package com.onesignal.otel;

import B0.e;
import I3.d;
import c3.C0310a;
import com.onesignal.otel.attributes.OtelFieldsPerEvent;
import com.onesignal.otel.attributes.OtelFieldsTopLevel;
import com.onesignal.otel.config.OtelConfigCrashFile;
import com.onesignal.otel.config.OtelConfigShared;
import java.util.Map;
import java.util.logging.Logger;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class OneSignalOpenTelemetryCrashLocal extends OneSignalOpenTelemetryBase implements IOtelOpenTelemetryCrash {
    private final IOtelPlatformProvider platformProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSignalOpenTelemetryCrashLocal(IOtelPlatformProvider platformProvider, OtelFieldsTopLevel osTopLevelFields, OtelFieldsPerEvent osPerEventFields) {
        super(osTopLevelFields, osPerEventFields);
        i.e(platformProvider, "platformProvider");
        i.e(osTopLevelFields, "osTopLevelFields");
        i.e(osPerEventFields, "osPerEventFields");
        this.platformProvider = platformProvider;
    }

    @Override // com.onesignal.otel.OneSignalOpenTelemetryBase
    public d getSdkInstance(Map<String, String> attributes) {
        i.e(attributes, "attributes");
        Logger logger = d.f1274f;
        e eVar = new e(5);
        eVar.f146b = C0310a.f4919b;
        eVar.f147c = OtelConfigCrashFile.SdkLoggerProviderConfig.INSTANCE.create(OtelConfigShared.ResourceConfig.INSTANCE.create(attributes), this.platformProvider.getCrashStoragePath(), this.platformProvider.getMinFileAgeForReadMillis());
        return eVar.k();
    }
}
