package io.opentelemetry.diskbuffering.proto.metrics.v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import io.opentelemetry.diskbuffering.proto.common.v1.InstrumentationScope;
import io.opentelemetry.exporter.otlp.internal.OtlpConfigUtil;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class ScopeMetrics extends Message<ScopeMetrics, Builder> {
    public static final ProtoAdapter<ScopeMetrics> ADAPTER = new ProtoAdapter_ScopeMetrics();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.metrics.v1.Metric#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public final List<Metric> metrics;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "schemaUrl", label = WireField.Label.OMIT_IDENTITY, tag = 3)
    public final String schema_url;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.common.v1.InstrumentationScope#ADAPTER", label = WireField.Label.OMIT_IDENTITY, tag = 1)
    public final InstrumentationScope scope;

    public ScopeMetrics(InstrumentationScope instrumentationScope, List<Metric> list, String str) {
        this(instrumentationScope, list, str, ByteString.EMPTY);
    }

    public ScopeMetrics(InstrumentationScope instrumentationScope, List<Metric> list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.scope = instrumentationScope;
        this.metrics = Internal.immutableCopyOf(OtlpConfigUtil.DATA_TYPE_METRICS, list);
        if (str == null) {
            throw new IllegalArgumentException("schema_url == null");
        }
        this.schema_url = str;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.scope = this.scope;
        builder.metrics = Internal.copyOf(this.metrics);
        builder.schema_url = this.schema_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ScopeMetrics)) {
            return false;
        }
        ScopeMetrics scopeMetrics = (ScopeMetrics) obj;
        return unknownFields().equals(scopeMetrics.unknownFields()) && Internal.equals(this.scope, scopeMetrics.scope) && this.metrics.equals(scopeMetrics.metrics) && Internal.equals(this.schema_url, scopeMetrics.schema_url);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        InstrumentationScope instrumentationScope = this.scope;
        int hashCode2 = (((hashCode + (instrumentationScope != null ? instrumentationScope.hashCode() : 0)) * 37) + this.metrics.hashCode()) * 37;
        String str = this.schema_url;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.scope != null) {
            sb.append(", scope=").append(this.scope);
        }
        if (!this.metrics.isEmpty()) {
            sb.append(", metrics=").append(this.metrics);
        }
        if (this.schema_url != null) {
            sb.append(", schema_url=").append(Internal.sanitize(this.schema_url));
        }
        return sb.replace(0, 2, "ScopeMetrics{").append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    public static final class Builder extends Message.Builder<ScopeMetrics, Builder> {
        public List<Metric> metrics = Internal.newMutableList();
        public String schema_url = "";
        public InstrumentationScope scope;

        public Builder scope(InstrumentationScope instrumentationScope) {
            this.scope = instrumentationScope;
            return this;
        }

        public Builder metrics(List<Metric> list) {
            Internal.checkElementsNotNull(list);
            this.metrics = list;
            return this;
        }

        public Builder schema_url(String str) {
            this.schema_url = str;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ScopeMetrics build() {
            return new ScopeMetrics(this.scope, this.metrics, this.schema_url, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_ScopeMetrics extends ProtoAdapter<ScopeMetrics> {
        public ProtoAdapter_ScopeMetrics() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) ScopeMetrics.class, "type.googleapis.com/opentelemetry.proto.metrics.v1.ScopeMetrics", Syntax.PROTO_3, (Object) null, "opentelemetry/proto/metrics/v1/metrics.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(ScopeMetrics scopeMetrics) {
            int encodedSizeWithTag = (!Objects.equals(scopeMetrics.scope, null) ? InstrumentationScope.ADAPTER.encodedSizeWithTag(1, scopeMetrics.scope) : 0) + Metric.ADAPTER.asRepeated().encodedSizeWithTag(2, scopeMetrics.metrics);
            if (!Objects.equals(scopeMetrics.schema_url, "")) {
                encodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(3, scopeMetrics.schema_url);
            }
            return encodedSizeWithTag + scopeMetrics.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, ScopeMetrics scopeMetrics) throws IOException {
            if (!Objects.equals(scopeMetrics.scope, null)) {
                InstrumentationScope.ADAPTER.encodeWithTag(protoWriter, 1, (int) scopeMetrics.scope);
            }
            Metric.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, (int) scopeMetrics.metrics);
            if (!Objects.equals(scopeMetrics.schema_url, "")) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, (int) scopeMetrics.schema_url);
            }
            protoWriter.writeBytes(scopeMetrics.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ReverseProtoWriter reverseProtoWriter, ScopeMetrics scopeMetrics) throws IOException {
            reverseProtoWriter.writeBytes(scopeMetrics.unknownFields());
            if (!Objects.equals(scopeMetrics.schema_url, "")) {
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, (int) scopeMetrics.schema_url);
            }
            Metric.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, (int) scopeMetrics.metrics);
            if (Objects.equals(scopeMetrics.scope, null)) {
                return;
            }
            InstrumentationScope.ADAPTER.encodeWithTag(reverseProtoWriter, 1, (int) scopeMetrics.scope);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public ScopeMetrics decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    builder.addUnknownFields(protoReader.endMessageAndGetUnknownFields(beginMessage));
                    return builder.build();
                }
                if (nextTag == 1) {
                    builder.scope(InstrumentationScope.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.metrics.add(Metric.ADAPTER.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.schema_url(ProtoAdapter.STRING.decode(protoReader));
                } else {
                    protoReader.readUnknownField(nextTag);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public ScopeMetrics redact(ScopeMetrics scopeMetrics) {
            Builder newBuilder = scopeMetrics.newBuilder();
            if (newBuilder.scope != null) {
                newBuilder.scope = InstrumentationScope.ADAPTER.redact(newBuilder.scope);
            }
            Internal.redactElements(newBuilder.metrics, Metric.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }
}
