package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class E3 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile E3[] f6720b;

    /* renamed from: a, reason: collision with root package name */
    public D3[] f6721a;

    public E3() {
        a();
    }

    public static E3[] b() {
        if (f6720b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6720b == null) {
                        f6720b = new E3[0];
                    }
                } finally {
                }
            }
        }
        return f6720b;
    }

    public final E3 a() {
        this.f6721a = D3.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        D3[] d3Arr = this.f6721a;
        if (d3Arr != null && d3Arr.length > 0) {
            int i2 = 0;
            while (true) {
                D3[] d3Arr2 = this.f6721a;
                if (i2 >= d3Arr2.length) {
                    break;
                }
                D3 d32 = d3Arr2[i2];
                if (d32 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, d32) + computeSerializedSize;
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        D3[] d3Arr = this.f6721a;
        if (d3Arr != null && d3Arr.length > 0) {
            int i2 = 0;
            while (true) {
                D3[] d3Arr2 = this.f6721a;
                if (i2 >= d3Arr2.length) {
                    break;
                }
                D3 d32 = d3Arr2[i2];
                if (d32 != null) {
                    codedOutputByteBufferNano.writeMessage(1, d32);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final E3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                D3[] d3Arr = this.f6721a;
                int length = d3Arr == null ? 0 : d3Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                D3[] d3Arr2 = new D3[i2];
                if (length != 0) {
                    System.arraycopy(d3Arr, 0, d3Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    D3 d32 = new D3();
                    d3Arr2[length] = d32;
                    codedInputByteBufferNano.readMessage(d32);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                D3 d33 = new D3();
                d3Arr2[length] = d33;
                codedInputByteBufferNano.readMessage(d33);
                this.f6721a = d3Arr2;
            }
        }
    }

    public static E3 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new E3().mergeFrom(codedInputByteBufferNano);
    }

    public static E3 a(byte[] bArr) {
        return (E3) MessageNano.mergeFrom(new E3(), bArr);
    }
}
