package io.opentelemetry.api.logs;

/* loaded from: classes3.dex */
public interface LoggerBuilder {
    Logger build();

    LoggerBuilder setInstrumentationVersion(String str);

    LoggerBuilder setSchemaUrl(String str);
}
