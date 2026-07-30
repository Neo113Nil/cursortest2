package com.baidu.location.pb;

import com.google.protobuf.micro.CodedInputStreamMicro;
import com.google.protobuf.micro.CodedOutputStreamMicro;
import com.google.protobuf.micro.MessageMicro;

/* loaded from: classes2.dex */
public final class Result extends MessageMicro {
    public static final int ERROR_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private boolean hasError;
    private boolean hasType;
    private int type_ = 0;
    private int error_ = 0;
    private int cachedSize = -1;

    public static Result parseFrom(CodedInputStreamMicro codedInputStreamMicro) {
        return new Result().mergeFrom(codedInputStreamMicro);
    }

    public final Result clear() {
        clearType();
        clearError();
        this.cachedSize = -1;
        return this;
    }

    public Result clearError() {
        this.hasError = false;
        this.error_ = 0;
        return this;
    }

    public Result clearType() {
        this.hasType = false;
        this.type_ = 0;
        return this;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public int getCachedSize() {
        if (this.cachedSize < 0) {
            getSerializedSize();
        }
        return this.cachedSize;
    }

    public int getError() {
        return this.error_;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public int getSerializedSize() {
        int computeInt32Size = hasType() ? CodedOutputStreamMicro.computeInt32Size(1, getType()) : 0;
        if (hasError()) {
            computeInt32Size += CodedOutputStreamMicro.computeSInt32Size(2, getError());
        }
        this.cachedSize = computeInt32Size;
        return computeInt32Size;
    }

    public int getType() {
        return this.type_;
    }

    public boolean hasError() {
        return this.hasError;
    }

    public boolean hasType() {
        return this.hasType;
    }

    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public Result mergeFrom(CodedInputStreamMicro codedInputStreamMicro) {
        while (true) {
            int readTag = codedInputStreamMicro.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                setType(codedInputStreamMicro.readInt32());
            } else if (readTag == 16) {
                setError(codedInputStreamMicro.readSInt32());
            } else if (!parseUnknownField(codedInputStreamMicro, readTag)) {
                return this;
            }
        }
    }

    public Result setError(int i8) {
        this.hasError = true;
        this.error_ = i8;
        return this;
    }

    public Result setType(int i8) {
        this.hasType = true;
        this.type_ = i8;
        return this;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public void writeTo(CodedOutputStreamMicro codedOutputStreamMicro) {
        if (hasType()) {
            codedOutputStreamMicro.writeInt32(1, getType());
        }
        if (hasError()) {
            codedOutputStreamMicro.writeSInt32(2, getError());
        }
    }

    public static Result parseFrom(byte[] bArr) {
        return (Result) new Result().mergeFrom(bArr);
    }
}
