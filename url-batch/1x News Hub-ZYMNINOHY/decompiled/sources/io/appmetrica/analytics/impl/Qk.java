package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Qk extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile Qk[] f6526c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f6527a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f6528b;

    public Qk() {
        a();
    }

    public static Qk[] b() {
        if (f6526c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6526c == null) {
                        f6526c = new Qk[0];
                    }
                } finally {
                }
            }
        }
        return f6526c;
    }

    public final Qk a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f6527a = bArr;
        this.f6528b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f6527a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f6527a);
        }
        return !Arrays.equals(this.f6528b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f6528b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f6527a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f6527a);
        }
        if (!Arrays.equals(this.f6528b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f6528b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Qk mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f6527a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f6528b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static Qk b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Qk().mergeFrom(codedInputByteBufferNano);
    }

    public static Qk a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Qk) MessageNano.mergeFrom(new Qk(), bArr);
    }
}
