package com.baidu.location.pb;

import com.google.protobuf.micro.CodedInputStreamMicro;
import com.google.protobuf.micro.CodedOutputStreamMicro;
import com.google.protobuf.micro.MessageMicro;

/* loaded from: classes2.dex */
public final class Loc extends MessageMicro {
    public static final int X_FIELD_NUMBER = 1;
    public static final int Y_FIELD_NUMBER = 2;
    private boolean hasX;
    private boolean hasY;
    private int x_ = 0;
    private int y_ = 0;
    private int cachedSize = -1;

    public static Loc parseFrom(CodedInputStreamMicro codedInputStreamMicro) {
        return new Loc().mergeFrom(codedInputStreamMicro);
    }

    public final Loc clear() {
        clearX();
        clearY();
        this.cachedSize = -1;
        return this;
    }

    public Loc clearX() {
        this.hasX = false;
        this.x_ = 0;
        return this;
    }

    public Loc clearY() {
        this.hasY = false;
        this.y_ = 0;
        return this;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public int getCachedSize() {
        if (this.cachedSize < 0) {
            getSerializedSize();
        }
        return this.cachedSize;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public int getSerializedSize() {
        int computeInt32Size = hasX() ? CodedOutputStreamMicro.computeInt32Size(1, getX()) : 0;
        if (hasY()) {
            computeInt32Size += CodedOutputStreamMicro.computeInt32Size(2, getY());
        }
        this.cachedSize = computeInt32Size;
        return computeInt32Size;
    }

    public int getX() {
        return this.x_;
    }

    public int getY() {
        return this.y_;
    }

    public boolean hasX() {
        return this.hasX;
    }

    public boolean hasY() {
        return this.hasY;
    }

    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public Loc mergeFrom(CodedInputStreamMicro codedInputStreamMicro) {
        while (true) {
            int readTag = codedInputStreamMicro.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                setX(codedInputStreamMicro.readInt32());
            } else if (readTag == 16) {
                setY(codedInputStreamMicro.readInt32());
            } else if (!parseUnknownField(codedInputStreamMicro, readTag)) {
                return this;
            }
        }
    }

    public Loc setX(int i8) {
        this.hasX = true;
        this.x_ = i8;
        return this;
    }

    public Loc setY(int i8) {
        this.hasY = true;
        this.y_ = i8;
        return this;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public void writeTo(CodedOutputStreamMicro codedOutputStreamMicro) {
        if (hasX()) {
            codedOutputStreamMicro.writeInt32(1, getX());
        }
        if (hasY()) {
            codedOutputStreamMicro.writeInt32(2, getY());
        }
    }

    public static Loc parseFrom(byte[] bArr) {
        return (Loc) new Loc().mergeFrom(bArr);
    }
}
