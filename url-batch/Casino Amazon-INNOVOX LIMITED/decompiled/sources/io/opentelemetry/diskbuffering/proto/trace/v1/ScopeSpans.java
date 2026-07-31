package io.opentelemetry.diskbuffering.proto.trace.v1;

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
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class ScopeSpans extends Message<ScopeSpans, Builder> {
    public static final ProtoAdapter<ScopeSpans> ADAPTER = new ProtoAdapter_ScopeSpans();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "schemaUrl", label = WireField.Label.OMIT_IDENTITY, tag = 3)
    public final String schema_url;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.common.v1.InstrumentationScope#ADAPTER", label = WireField.Label.OMIT_IDENTITY, tag = 1)
    public final InstrumentationScope scope;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.trace.v1.Span#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public final List<Span> spans;

    public ScopeSpans(InstrumentationScope instrumentationScope, List<Span> list, String str) {
        this(instrumentationScope, list, str, ByteString.EMPTY);
    }

    public ScopeSpans(InstrumentationScope instrumentationScope, List<Span> list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.scope = instrumentationScope;
        this.spans = Internal.immutableCopyOf("spans", list);
        if (str == null) {
            throw new IllegalArgumentException("schema_url == null");
        }
        this.schema_url = str;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.scope = this.scope;
        builder.spans = Internal.copyOf(this.spans);
        builder.schema_url = this.schema_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ScopeSpans)) {
            return false;
        }
        ScopeSpans scopeSpans = (ScopeSpans) obj;
        return unknownFields().equals(scopeSpans.unknownFields()) && Internal.equals(this.scope, scopeSpans.scope) && this.spans.equals(scopeSpans.spans) && Internal.equals(this.schema_url, scopeSpans.schema_url);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        InstrumentationScope instrumentationScope = this.scope;
        int hashCode2 = (((hashCode + (instrumentationScope != null ? instrumentationScope.hashCode() : 0)) * 37) + this.spans.hashCode()) * 37;
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
        if (!this.spans.isEmpty()) {
            sb.append(", spans=").append(this.spans);
        }
        if (this.schema_url != null) {
            sb.append(", schema_url=").append(Internal.sanitize(this.schema_url));
        }
        return sb.replace(0, 2, "ScopeSpans{").append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    public static final class Builder extends Message.Builder<ScopeSpans, Builder> {
        public InstrumentationScope scope;
        public List<Span> spans = Internal.newMutableList();
        public String schema_url = "";

        public Builder scope(InstrumentationScope instrumentationScope) {
            this.scope = instrumentationScope;
            return this;
        }

        public Builder spans(List<Span> list) {
            Internal.checkElementsNotNull(list);
            this.spans = list;
            return this;
        }

        public Builder schema_url(String str) {
            this.schema_url = str;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ScopeSpans build() {
            return new ScopeSpans(this.scope, this.spans, this.schema_url, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_ScopeSpans extends ProtoAdapter<ScopeSpans> {
        public ProtoAdapter_ScopeSpans() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) ScopeSpans.class, "type.googleapis.com/opentelemetry.proto.trace.v1.ScopeSpans", Syntax.PROTO_3, (Object) null, "opentelemetry/proto/trace/v1/trace.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(ScopeSpans scopeSpans) {
            int encodedSizeWithTag = (!Objects.equals(scopeSpans.scope, null) ? InstrumentationScope.ADAPTER.encodedSizeWithTag(1, scopeSpans.scope) : 0) + Span.ADAPTER.asRepeated().encodedSizeWithTag(2, scopeSpans.spans);
            if (!Objects.equals(scopeSpans.schema_url, "")) {
                encodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(3, scopeSpans.schema_url);
            }
            return encodedSizeWithTag + scopeSpans.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, ScopeSpans scopeSpans) throws IOException {
            if (!Objects.equals(scopeSpans.scope, null)) {
                InstrumentationScope.ADAPTER.encodeWithTag(protoWriter, 1, (int) scopeSpans.scope);
            }
            Span.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, (int) scopeSpans.spans);
            if (!Objects.equals(scopeSpans.schema_url, "")) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, (int) scopeSpans.schema_url);
            }
            protoWriter.writeBytes(scopeSpans.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ReverseProtoWriter reverseProtoWriter, ScopeSpans scopeSpans) throws IOException {
            reverseProtoWriter.writeBytes(scopeSpans.unknownFields());
            if (!Objects.equals(scopeSpans.schema_url, "")) {
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, (int) scopeSpans.schema_url);
            }
            Span.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, (int) scopeSpans.spans);
            if (Objects.equals(scopeSpans.scope, null)) {
                return;
            }
            InstrumentationScope.ADAPTER.encodeWithTag(reverseProtoWriter, 1, (int) scopeSpans.scope);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public ScopeSpans decode(ProtoReader protoReader) throws IOException {
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
                    builder.spans.add(Span.ADAPTER.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.schema_url(ProtoAdapter.STRING.decode(protoReader));
                } else {
                    protoReader.readUnknownField(nextTag);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public ScopeSpans redact(ScopeSpans scopeSpans) {
            Builder newBuilder = scopeSpans.newBuilder();
            if (newBuilder.scope != null) {
                newBuilder.scope = InstrumentationScope.ADAPTER.redact(newBuilder.scope);
            }
            Internal.redactElements(newBuilder.spans, Span.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }
}
