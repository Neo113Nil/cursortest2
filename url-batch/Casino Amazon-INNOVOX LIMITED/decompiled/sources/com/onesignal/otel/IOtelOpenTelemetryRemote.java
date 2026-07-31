package com.onesignal.otel;

import io.opentelemetry.sdk.logs.export.LogRecordExporter;
import kotlin.Metadata;

/* compiled from: IOtelOpenTelemetry.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/onesignal/otel/IOtelOpenTelemetryRemote;", "Lcom/onesignal/otel/IOtelOpenTelemetry;", "logExporter", "Lio/opentelemetry/sdk/logs/export/LogRecordExporter;", "getLogExporter", "()Lio/opentelemetry/sdk/logs/export/LogRecordExporter;", "com.onesignal.otel"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface IOtelOpenTelemetryRemote extends IOtelOpenTelemetry {
    LogRecordExporter getLogExporter();
}
