package com.baidu.location.pb;

import com.google.protobuf.micro.ByteStringMicro;
import com.google.protobuf.micro.CodedInputStreamMicro;
import com.google.protobuf.micro.CodedOutputStreamMicro;
import com.google.protobuf.micro.MessageMicro;

/* loaded from: classes2.dex */
public final class OffStatRes extends MessageMicro {
    public static final int ERRMSG_FIELD_NUMBER = 2;
    public static final int ERRNUM_FIELD_NUMBER = 1;
    private boolean hasErrmsg;
    private boolean hasErrnum;
    private int errnum_ = 0;
    private ByteStringMicro errmsg_ = ByteStringMicro.EMPTY;
    private int cachedSize = -1;

    public static OffStatRes parseFrom(CodedInputStreamMicro codedInputStreamMicro) {
        return new OffStatRes().mergeFrom(codedInputStreamMicro);
    }

    public final OffStatRes clear() {
        clearErrnum();
        clearErrmsg();
        this.cachedSize = -1;
        return this;
    }

    public OffStatRes clearErrmsg() {
        this.hasErrmsg = false;
        this.errmsg_ = ByteStringMicro.EMPTY;
        return this;
    }

    public OffStatRes clearErrnum() {
        this.hasErrnum = false;
        this.errnum_ = 0;
        return this;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public int getCachedSize() {
        if (this.cachedSize < 0) {
            getSerializedSize();
        }
        return this.cachedSize;
    }

    public ByteStringMicro getErrmsg() {
        return this.errmsg_;
    }

    public int getErrnum() {
        return this.errnum_;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public int getSerializedSize() {
        int computeInt32Size = hasErrnum() ? CodedOutputStreamMicro.computeInt32Size(1, getErrnum()) : 0;
        if (hasErrmsg()) {
            computeInt32Size += CodedOutputStreamMicro.computeBytesSize(2, getErrmsg());
        }
        this.cachedSize = computeInt32Size;
        return computeInt32Size;
    }

    public boolean hasErrmsg() {
        return this.hasErrmsg;
    }

    public boolean hasErrnum() {
        return this.hasErrnum;
    }

    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public OffStatRes mergeFrom(CodedInputStreamMicro codedInputStreamMicro) {
        while (true) {
            int readTag = codedInputStreamMicro.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                setErrnum(codedInputStreamMicro.readInt32());
            } else if (readTag == 18) {
                setErrmsg(codedInputStreamMicro.readBytes());
            } else if (!parseUnknownField(codedInputStreamMicro, readTag)) {
                return this;
            }
        }
    }

    public OffStatRes setErrmsg(ByteStringMicro byteStringMicro) {
        this.hasErrmsg = true;
        this.errmsg_ = byteStringMicro;
        return this;
    }

    public OffStatRes setErrnum(int i8) {
        this.hasErrnum = true;
        this.errnum_ = i8;
        return this;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public void writeTo(CodedOutputStreamMicro codedOutputStreamMicro) {
        if (hasErrnum()) {
            codedOutputStreamMicro.writeInt32(1, getErrnum());
        }
        if (hasErrmsg()) {
            codedOutputStreamMicro.writeBytes(2, getErrmsg());
        }
    }

    public static OffStatRes parseFrom(byte[] bArr) {
        return (OffStatRes) new OffStatRes().mergeFrom(bArr);
    }
}
