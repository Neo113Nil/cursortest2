package com.baidu.entity.pb;

import com.google.protobuf.micro.ByteStringMicro;
import com.google.protobuf.micro.CodedInputStreamMicro;
import com.google.protobuf.micro.CodedOutputStreamMicro;
import com.google.protobuf.micro.MessageMicro;

/* loaded from: classes2.dex */
public final class TransPreferInfo extends MessageMicro {
    public static final int GOOD_AUXILARY_LABEL_FIELD_NUMBER = 1;
    public static final int NORMAL_AUXILARY_LABEL_FIELD_NUMBER = 2;
    private int cachedSize;
    private ByteStringMicro goodAuxilaryLabel_;
    private boolean hasGoodAuxilaryLabel;
    private boolean hasNormalAuxilaryLabel;
    private ByteStringMicro normalAuxilaryLabel_;

    public TransPreferInfo() {
        ByteStringMicro byteStringMicro = ByteStringMicro.EMPTY;
        this.goodAuxilaryLabel_ = byteStringMicro;
        this.normalAuxilaryLabel_ = byteStringMicro;
        this.cachedSize = -1;
    }

    public static TransPreferInfo parseFrom(CodedInputStreamMicro codedInputStreamMicro) {
        return new TransPreferInfo().mergeFrom(codedInputStreamMicro);
    }

    public final TransPreferInfo clear() {
        clearGoodAuxilaryLabel();
        clearNormalAuxilaryLabel();
        this.cachedSize = -1;
        return this;
    }

    public TransPreferInfo clearGoodAuxilaryLabel() {
        this.hasGoodAuxilaryLabel = false;
        this.goodAuxilaryLabel_ = ByteStringMicro.EMPTY;
        return this;
    }

    public TransPreferInfo clearNormalAuxilaryLabel() {
        this.hasNormalAuxilaryLabel = false;
        this.normalAuxilaryLabel_ = ByteStringMicro.EMPTY;
        return this;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public int getCachedSize() {
        if (this.cachedSize < 0) {
            getSerializedSize();
        }
        return this.cachedSize;
    }

    public ByteStringMicro getGoodAuxilaryLabel() {
        return this.goodAuxilaryLabel_;
    }

    public ByteStringMicro getNormalAuxilaryLabel() {
        return this.normalAuxilaryLabel_;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public int getSerializedSize() {
        int computeBytesSize = hasGoodAuxilaryLabel() ? CodedOutputStreamMicro.computeBytesSize(1, getGoodAuxilaryLabel()) : 0;
        if (hasNormalAuxilaryLabel()) {
            computeBytesSize += CodedOutputStreamMicro.computeBytesSize(2, getNormalAuxilaryLabel());
        }
        this.cachedSize = computeBytesSize;
        return computeBytesSize;
    }

    public boolean hasGoodAuxilaryLabel() {
        return this.hasGoodAuxilaryLabel;
    }

    public boolean hasNormalAuxilaryLabel() {
        return this.hasNormalAuxilaryLabel;
    }

    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public TransPreferInfo mergeFrom(CodedInputStreamMicro codedInputStreamMicro) {
        while (true) {
            int readTag = codedInputStreamMicro.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                setGoodAuxilaryLabel(codedInputStreamMicro.readBytes());
            } else if (readTag == 18) {
                setNormalAuxilaryLabel(codedInputStreamMicro.readBytes());
            } else if (!parseUnknownField(codedInputStreamMicro, readTag)) {
                return this;
            }
        }
    }

    public TransPreferInfo setGoodAuxilaryLabel(ByteStringMicro byteStringMicro) {
        this.hasGoodAuxilaryLabel = true;
        this.goodAuxilaryLabel_ = byteStringMicro;
        return this;
    }

    public TransPreferInfo setNormalAuxilaryLabel(ByteStringMicro byteStringMicro) {
        this.hasNormalAuxilaryLabel = true;
        this.normalAuxilaryLabel_ = byteStringMicro;
        return this;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public void writeTo(CodedOutputStreamMicro codedOutputStreamMicro) {
        if (hasGoodAuxilaryLabel()) {
            codedOutputStreamMicro.writeBytes(1, getGoodAuxilaryLabel());
        }
        if (hasNormalAuxilaryLabel()) {
            codedOutputStreamMicro.writeBytes(2, getNormalAuxilaryLabel());
        }
    }

    public static TransPreferInfo parseFrom(byte[] bArr) {
        return (TransPreferInfo) new TransPreferInfo().mergeFrom(bArr);
    }
}
