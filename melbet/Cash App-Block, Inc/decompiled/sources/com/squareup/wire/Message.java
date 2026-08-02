package com.squareup.wire;

import java.io.OutputStream;
import java.io.Serializable;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;

/* loaded from: classes.dex */
public abstract class Message implements Serializable {
    public static final Companion Companion = new Companion();
    private static final long serialVersionUID = 0;
    private final transient ProtoAdapter adapter;
    private transient int cachedSerializedSize;
    protected transient int hashCode;
    private final transient ByteString unknownFields;

    public abstract class Builder {
        private transient Buffer unknownFieldsBuffer;
        private transient ByteString unknownFieldsByteString = ByteString.EMPTY;
        private transient ProtoWriter unknownFieldsWriter;

        public final Builder addUnknownField(int i, FieldEncoding fieldEncoding, Object obj) {
            fieldEncoding.getClass();
            if (this.unknownFieldsBuffer == null) {
                Buffer buffer = new Buffer();
                this.unknownFieldsBuffer = buffer;
                ProtoWriter protoWriter = new ProtoWriter(buffer);
                this.unknownFieldsWriter = protoWriter;
                protoWriter.writeBytes(this.unknownFieldsByteString);
                this.unknownFieldsByteString = ByteString.EMPTY;
            }
            ProtoAdapter rawProtoAdapter = fieldEncoding.rawProtoAdapter();
            rawProtoAdapter.getClass();
            ProtoWriter protoWriter2 = this.unknownFieldsWriter;
            protoWriter2.getClass();
            rawProtoAdapter.encodeWithTag(protoWriter2, i, obj);
            return this;
        }

        public final Builder addUnknownFields(ByteString byteString) {
            byteString.getClass();
            if (byteString.getSize$okio() > 0) {
                if (this.unknownFieldsBuffer == null) {
                    Buffer buffer = new Buffer();
                    this.unknownFieldsBuffer = buffer;
                    ProtoWriter protoWriter = new ProtoWriter(buffer);
                    this.unknownFieldsWriter = protoWriter;
                    protoWriter.writeBytes(this.unknownFieldsByteString);
                    this.unknownFieldsByteString = ByteString.EMPTY;
                }
                ProtoWriter protoWriter2 = this.unknownFieldsWriter;
                protoWriter2.getClass();
                protoWriter2.sink.write(byteString);
            }
            return this;
        }

        public abstract Message build();

        public final ByteString buildUnknownFields() {
            Buffer buffer = this.unknownFieldsBuffer;
            if (buffer != null) {
                buffer.getClass();
                this.unknownFieldsByteString = buffer.readByteString(buffer.size);
                this.unknownFieldsBuffer = null;
                this.unknownFieldsWriter = null;
            }
            return this.unknownFieldsByteString;
        }

        public final Builder clearUnknownFields() {
            this.unknownFieldsByteString = ByteString.EMPTY;
            Buffer buffer = this.unknownFieldsBuffer;
            if (buffer != null) {
                buffer.getClass();
                buffer.clear();
                this.unknownFieldsBuffer = null;
            }
            this.unknownFieldsWriter = null;
            return this;
        }

        public final Buffer getUnknownFieldsBuffer$wire_runtime() {
            return this.unknownFieldsBuffer;
        }

        public final ByteString getUnknownFieldsByteString$wire_runtime() {
            return this.unknownFieldsByteString;
        }

        public final ProtoWriter getUnknownFieldsWriter$wire_runtime() {
            return this.unknownFieldsWriter;
        }

        public final void setUnknownFieldsBuffer$wire_runtime(Buffer buffer) {
            this.unknownFieldsBuffer = buffer;
        }

        public final void setUnknownFieldsByteString$wire_runtime(ByteString byteString) {
            byteString.getClass();
            this.unknownFieldsByteString = byteString;
        }

        public final void setUnknownFieldsWriter$wire_runtime(ProtoWriter protoWriter) {
            this.unknownFieldsWriter = protoWriter;
        }
    }

    public final class Companion {
    }

    public Message(ProtoAdapter protoAdapter, ByteString byteString) {
        protoAdapter.getClass();
        byteString.getClass();
        this.adapter = protoAdapter;
        this.unknownFields = byteString;
    }

    public static /* synthetic */ void unknownFields$annotations() {
    }

    public final ProtoAdapter adapter() {
        return this.adapter;
    }

    public final void encode(BufferedSink bufferedSink) {
        bufferedSink.getClass();
        this.adapter.encode(bufferedSink, this);
    }

    public final ByteString encodeByteString() {
        return this.adapter.encodeByteString(this);
    }

    public final int getCachedSerializedSize$wire_runtime() {
        return this.cachedSerializedSize;
    }

    public abstract Builder newBuilder();

    public final void setCachedSerializedSize$wire_runtime(int i) {
        this.cachedSerializedSize = i;
    }

    public ByteString unknownFields() {
        ByteString byteString = this.unknownFields;
        return byteString == null ? ByteString.EMPTY : byteString;
    }

    public final Message withoutUnknownFields() {
        return newBuilder().clearUnknownFields().build();
    }

    public final Object writeReplace() {
        return new MessageSerializedForm(encode(), getClass());
    }

    public final byte[] encode() {
        return this.adapter.encode(this);
    }

    public final void encode(OutputStream outputStream) {
        outputStream.getClass();
        this.adapter.encode(outputStream, this);
    }
}
