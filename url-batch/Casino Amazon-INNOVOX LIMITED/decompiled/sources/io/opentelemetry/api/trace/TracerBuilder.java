package io.opentelemetry.api.trace;

/* loaded from: classes3.dex */
public interface TracerBuilder {
    Tracer build();

    TracerBuilder setInstrumentationVersion(String str);

    TracerBuilder setSchemaUrl(String str);
}
