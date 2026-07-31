package io.opentelemetry.diskbuffering.proto.logs.v1;

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
public final class ScopeLogs extends Message<ScopeLogs, Builder> {
    public static final ProtoAdapter<ScopeLogs> ADAPTER = new ProtoAdapter_ScopeLogs();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.logs.v1.LogRecord#ADAPTER", jsonName = "logRecords", label = WireField.Label.REPEATED, tag = 2)
    public final List<LogRecord> log_records;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "schemaUrl", label = WireField.Label.OMIT_IDENTITY, tag = 3)
    public final String schema_url;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.common.v1.InstrumentationScope#ADAPTER", label = WireField.Label.OMIT_IDENTITY, tag = 1)
    public final InstrumentationScope scope;

    public ScopeLogs(InstrumentationScope instrumentationScope, List<LogRecord> list, String str) {
        this(instrumentationScope, list, str, ByteString.EMPTY);
    }

    public ScopeLogs(InstrumentationScope instrumentationScope, List<LogRecord> list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.scope = instrumentationScope;
        this.log_records = Internal.immutableCopyOf("log_records", list);
        if (str == null) {
            throw new IllegalArgumentException("schema_url == null");
        }
        this.schema_url = str;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.scope = this.scope;
        builder.log_records = Internal.copyOf(this.log_records);
        builder.schema_url = this.schema_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ScopeLogs)) {
            return false;
        }
        ScopeLogs scopeLogs = (ScopeLogs) obj;
        return unknownFields().equals(scopeLogs.unknownFields()) && Internal.equals(this.scope, scopeLogs.scope) && this.log_records.equals(scopeLogs.log_records) && Internal.equals(this.schema_url, scopeLogs.schema_url);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        InstrumentationScope instrumentationScope = this.scope;
        int hashCode2 = (((hashCode + (instrumentationScope != null ? instrumentationScope.hashCode() : 0)) * 37) + this.log_records.hashCode()) * 37;
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
        if (!this.log_records.isEmpty()) {
            sb.append(", log_records=").append(this.log_records);
        }
        if (this.schema_url != null) {
            sb.append(", schema_url=").append(Internal.sanitize(this.schema_url));
        }
        return sb.replace(0, 2, "ScopeLogs{").append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    public static final class Builder extends Message.Builder<ScopeLogs, Builder> {
        public List<LogRecord> log_records = Internal.newMutableList();
        public String schema_url = "";
        public InstrumentationScope scope;

        public Builder scope(InstrumentationScope instrumentationScope) {
            this.scope = instrumentationScope;
            return this;
        }

        public Builder log_records(List<LogRecord> list) {
            Internal.checkElementsNotNull(list);
            this.log_records = list;
            return this;
        }

        public Builder schema_url(String str) {
            this.schema_url = str;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ScopeLogs build() {
            return new ScopeLogs(this.scope, this.log_records, this.schema_url, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_ScopeLogs extends ProtoAdapter<ScopeLogs> {
        public ProtoAdapter_ScopeLogs() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) ScopeLogs.class, "type.googleapis.com/opentelemetry.proto.logs.v1.ScopeLogs", Syntax.PROTO_3, (Object) null, "opentelemetry/proto/logs/v1/logs.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(ScopeLogs scopeLogs) {
            int encodedSizeWithTag = (!Objects.equals(scopeLogs.scope, null) ? InstrumentationScope.ADAPTER.encodedSizeWithTag(1, scopeLogs.scope) : 0) + LogRecord.ADAPTER.asRepeated().encodedSizeWithTag(2, scopeLogs.log_records);
            if (!Objects.equals(scopeLogs.schema_url, "")) {
                encodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(3, scopeLogs.schema_url);
            }
            return encodedSizeWithTag + scopeLogs.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, ScopeLogs scopeLogs) throws IOException {
            if (!Objects.equals(scopeLogs.scope, null)) {
                InstrumentationScope.ADAPTER.encodeWithTag(protoWriter, 1, (int) scopeLogs.scope);
            }
            LogRecord.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, (int) scopeLogs.log_records);
            if (!Objects.equals(scopeLogs.schema_url, "")) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, (int) scopeLogs.schema_url);
            }
            protoWriter.writeBytes(scopeLogs.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ReverseProtoWriter reverseProtoWriter, ScopeLogs scopeLogs) throws IOException {
            reverseProtoWriter.writeBytes(scopeLogs.unknownFields());
            if (!Objects.equals(scopeLogs.schema_url, "")) {
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, (int) scopeLogs.schema_url);
            }
            LogRecord.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, (int) scopeLogs.log_records);
            if (Objects.equals(scopeLogs.scope, null)) {
                return;
            }
            InstrumentationScope.ADAPTER.encodeWithTag(reverseProtoWriter, 1, (int) scopeLogs.scope);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public ScopeLogs decode(ProtoReader protoReader) throws IOException {
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
                    builder.log_records.add(LogRecord.ADAPTER.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.schema_url(ProtoAdapter.STRING.decode(protoReader));
                } else {
                    protoReader.readUnknownField(nextTag);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public ScopeLogs redact(ScopeLogs scopeLogs) {
            Builder newBuilder = scopeLogs.newBuilder();
            if (newBuilder.scope != null) {
                newBuilder.scope = InstrumentationScope.ADAPTER.redact(newBuilder.scope);
            }
            Internal.redactElements(newBuilder.log_records, LogRecord.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }
}
