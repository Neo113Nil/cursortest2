package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.a6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0506a6 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0506a6[] f7831c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f7832a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f7833b;

    public C0506a6() {
        a();
    }

    public static C0506a6[] b() {
        if (f7831c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7831c == null) {
                        f7831c = new C0506a6[0];
                    }
                } finally {
                }
            }
        }
        return f7831c;
    }

    public final C0506a6 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f7832a = bArr;
        this.f7833b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f7832a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f7832a);
        }
        return !Arrays.equals(this.f7833b, bArr2) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f7833b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f7832a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f7832a);
        }
        if (!Arrays.equals(this.f7833b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f7833b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0506a6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f7832a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f7833b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static C0506a6 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0506a6().mergeFrom(codedInputByteBufferNano);
    }

    public static C0506a6 a(byte[] bArr) {
        return (C0506a6) MessageNano.mergeFrom(new C0506a6(), bArr);
    }
}
