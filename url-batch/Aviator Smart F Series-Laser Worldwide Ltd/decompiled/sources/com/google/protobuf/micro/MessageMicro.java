package com.google.protobuf.micro;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class MessageMicro {
    public abstract int getCachedSize();

    public abstract int getSerializedSize();

    public abstract MessageMicro mergeFrom(CodedInputStreamMicro codedInputStreamMicro);

    public MessageMicro mergeFrom(byte[] bArr) {
        return mergeFrom(bArr, 0, bArr.length);
    }

    protected boolean parseUnknownField(CodedInputStreamMicro codedInputStreamMicro, int i8) {
        return codedInputStreamMicro.skipField(i8);
    }

    public byte[] toByteArray() {
        int serializedSize = getSerializedSize();
        byte[] bArr = new byte[serializedSize];
        toByteArray(bArr, 0, serializedSize);
        return bArr;
    }

    public abstract void writeTo(CodedOutputStreamMicro codedOutputStreamMicro);

    public MessageMicro mergeFrom(byte[] bArr, int i8, int i9) {
        try {
            CodedInputStreamMicro newInstance = CodedInputStreamMicro.newInstance(bArr, i8, i9);
            mergeFrom(newInstance);
            newInstance.checkLastTagWas(0);
            return this;
        } catch (InvalidProtocolBufferMicroException e8) {
            throw e8;
        } catch (IOException unused) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    public void toByteArray(byte[] bArr, int i8, int i9) {
        try {
            CodedOutputStreamMicro newInstance = CodedOutputStreamMicro.newInstance(bArr, i8, i9);
            writeTo(newInstance);
            newInstance.checkNoSpaceLeft();
        } catch (IOException unused) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).");
        }
    }
}
