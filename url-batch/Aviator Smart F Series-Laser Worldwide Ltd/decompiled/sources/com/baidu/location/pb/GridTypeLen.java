package com.baidu.location.pb;

import com.google.protobuf.micro.CodedInputStreamMicro;
import com.google.protobuf.micro.CodedOutputStreamMicro;
import com.google.protobuf.micro.MessageMicro;

/* loaded from: classes2.dex */
public final class GridTypeLen extends MessageMicro {
    public static final int GL_FIELD_NUMBER = 2;
    public static final int GT_FIELD_NUMBER = 1;
    private boolean hasGl;
    private boolean hasGt;
    private int gt_ = 0;
    private int gl_ = 0;
    private int cachedSize = -1;

    public static GridTypeLen parseFrom(CodedInputStreamMicro codedInputStreamMicro) {
        return new GridTypeLen().mergeFrom(codedInputStreamMicro);
    }

    public final GridTypeLen clear() {
        clearGt();
        clearGl();
        this.cachedSize = -1;
        return this;
    }

    public GridTypeLen clearGl() {
        this.hasGl = false;
        this.gl_ = 0;
        return this;
    }

    public GridTypeLen clearGt() {
        this.hasGt = false;
        this.gt_ = 0;
        return this;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public int getCachedSize() {
        if (this.cachedSize < 0) {
            getSerializedSize();
        }
        return this.cachedSize;
    }

    public int getGl() {
        return this.gl_;
    }

    public int getGt() {
        return this.gt_;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public int getSerializedSize() {
        int computeInt32Size = hasGt() ? CodedOutputStreamMicro.computeInt32Size(1, getGt()) : 0;
        if (hasGl()) {
            computeInt32Size += CodedOutputStreamMicro.computeInt32Size(2, getGl());
        }
        this.cachedSize = computeInt32Size;
        return computeInt32Size;
    }

    public boolean hasGl() {
        return this.hasGl;
    }

    public boolean hasGt() {
        return this.hasGt;
    }

    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public GridTypeLen mergeFrom(CodedInputStreamMicro codedInputStreamMicro) {
        while (true) {
            int readTag = codedInputStreamMicro.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                setGt(codedInputStreamMicro.readInt32());
            } else if (readTag == 16) {
                setGl(codedInputStreamMicro.readInt32());
            } else if (!parseUnknownField(codedInputStreamMicro, readTag)) {
                return this;
            }
        }
    }

    public GridTypeLen setGl(int i8) {
        this.hasGl = true;
        this.gl_ = i8;
        return this;
    }

    public GridTypeLen setGt(int i8) {
        this.hasGt = true;
        this.gt_ = i8;
        return this;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public void writeTo(CodedOutputStreamMicro codedOutputStreamMicro) {
        if (hasGt()) {
            codedOutputStreamMicro.writeInt32(1, getGt());
        }
        if (hasGl()) {
            codedOutputStreamMicro.writeInt32(2, getGl());
        }
    }

    public static GridTypeLen parseFrom(byte[] bArr) {
        return (GridTypeLen) new GridTypeLen().mergeFrom(bArr);
    }
}
