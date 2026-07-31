package io.opentelemetry.diskbuffering.proto.trace.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class Status extends Message<Status, Builder> {
    public static final ProtoAdapter<Status> ADAPTER = new ProtoAdapter_Status();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.trace.v1.Status$StatusCode#ADAPTER", label = WireField.Label.OMIT_IDENTITY, tag = 3)
    public final StatusCode code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, tag = 2)
    public final String message;

    public Status(String str, StatusCode statusCode) {
        this(str, statusCode, ByteString.EMPTY);
    }

    public Status(String str, StatusCode statusCode, ByteString byteString) {
        super(ADAPTER, byteString);
        if (str == null) {
            throw new IllegalArgumentException("message == null");
        }
        this.message = str;
        if (statusCode == null) {
            throw new IllegalArgumentException("code == null");
        }
        this.code = statusCode;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.message = this.message;
        builder.code = this.code;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return unknownFields().equals(status.unknownFields()) && Internal.equals(this.message, status.message) && Internal.equals(this.code, status.code);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.message;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        StatusCode statusCode = this.code;
        int hashCode3 = hashCode2 + (statusCode != null ? statusCode.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.message != null) {
            sb.append(", message=").append(Internal.sanitize(this.message));
        }
        if (this.code != null) {
            sb.append(", code=").append(this.code);
        }
        return sb.replace(0, 2, "Status{").append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    public static final class Builder extends Message.Builder<Status, Builder> {
        public String message = "";
        public StatusCode code = StatusCode.STATUS_CODE_UNSET;

        public Builder message(String str) {
            this.message = str;
            return this;
        }

        public Builder code(StatusCode statusCode) {
            this.code = statusCode;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public Status build() {
            return new Status(this.message, this.code, super.buildUnknownFields());
        }
    }

    public enum StatusCode implements WireEnum {
        STATUS_CODE_UNSET(0),
        STATUS_CODE_OK(1),
        STATUS_CODE_ERROR(2);

        public static final ProtoAdapter<StatusCode> ADAPTER = new ProtoAdapter_StatusCode();
        private final int value;

        StatusCode(int i) {
            this.value = i;
        }

        public static StatusCode fromValue(int i) {
            if (i == 0) {
                return STATUS_CODE_UNSET;
            }
            if (i == 1) {
                return STATUS_CODE_OK;
            }
            if (i != 2) {
                return null;
            }
            return STATUS_CODE_ERROR;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        private static final class ProtoAdapter_StatusCode extends EnumAdapter<StatusCode> {
            ProtoAdapter_StatusCode() {
                super((Class<StatusCode>) StatusCode.class, Syntax.PROTO_3, StatusCode.STATUS_CODE_UNSET);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public StatusCode fromValue(int i) {
                return StatusCode.fromValue(i);
            }
        }
    }

    private static final class ProtoAdapter_Status extends ProtoAdapter<Status> {
        public ProtoAdapter_Status() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) Status.class, "type.googleapis.com/opentelemetry.proto.trace.v1.Status", Syntax.PROTO_3, (Object) null, "opentelemetry/proto/trace/v1/trace.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(Status status) {
            int encodedSizeWithTag = !Objects.equals(status.message, "") ? ProtoAdapter.STRING.encodedSizeWithTag(2, status.message) : 0;
            if (!Objects.equals(status.code, StatusCode.STATUS_CODE_UNSET)) {
                encodedSizeWithTag += StatusCode.ADAPTER.encodedSizeWithTag(3, status.code);
            }
            return encodedSizeWithTag + status.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, Status status) throws IOException {
            if (!Objects.equals(status.message, "")) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, (int) status.message);
            }
            if (!Objects.equals(status.code, StatusCode.STATUS_CODE_UNSET)) {
                StatusCode.ADAPTER.encodeWithTag(protoWriter, 3, (int) status.code);
            }
            protoWriter.writeBytes(status.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ReverseProtoWriter reverseProtoWriter, Status status) throws IOException {
            reverseProtoWriter.writeBytes(status.unknownFields());
            if (!Objects.equals(status.code, StatusCode.STATUS_CODE_UNSET)) {
                StatusCode.ADAPTER.encodeWithTag(reverseProtoWriter, 3, (int) status.code);
            }
            if (Objects.equals(status.message, "")) {
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, (int) status.message);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public Status decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    builder.addUnknownFields(protoReader.endMessageAndGetUnknownFields(beginMessage));
                    return builder.build();
                }
                if (nextTag == 2) {
                    builder.message(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    try {
                        builder.code(StatusCode.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                    }
                } else {
                    protoReader.readUnknownField(nextTag);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Status redact(Status status) {
            Builder newBuilder = status.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }
}
