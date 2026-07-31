package io.opentelemetry.proto.metrics.v1.internal;

import io.opentelemetry.exporter.internal.marshal.ProtoFieldInfo;
import io.opentelemetry.exporter.otlp.internal.OtlpConfigUtil;

/* loaded from: classes3.dex */
public final class ScopeMetrics {
    public static final ProtoFieldInfo SCOPE = ProtoFieldInfo.create(1, 10, "scope");
    public static final ProtoFieldInfo METRICS = ProtoFieldInfo.create(2, 18, OtlpConfigUtil.DATA_TYPE_METRICS);
    public static final ProtoFieldInfo SCHEMA_URL = ProtoFieldInfo.create(3, 26, "schemaUrl");
}
