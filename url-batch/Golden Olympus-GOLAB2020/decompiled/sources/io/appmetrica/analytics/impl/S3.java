package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes3.dex */
public final class S3 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile S3[] f38225b;

    /* renamed from: a, reason: collision with root package name */
    public R3[] f38226a;

    public S3() {
        a();
    }

    public static S3[] b() {
        if (f38225b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f38225b == null) {
                        f38225b = new S3[0];
                    }
                } finally {
                }
            }
        }
        return f38225b;
    }

    public final S3 a() {
        this.f38226a = R3.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        R3[] r3Arr = this.f38226a;
        if (r3Arr != null && r3Arr.length > 0) {
            int i4 = 0;
            while (true) {
                R3[] r3Arr2 = this.f38226a;
                if (i4 >= r3Arr2.length) {
                    break;
                }
                R3 r32 = r3Arr2[i4];
                if (r32 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, r32) + computeSerializedSize;
                }
                i4++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        R3[] r3Arr = this.f38226a;
        if (r3Arr != null && r3Arr.length > 0) {
            int i4 = 0;
            while (true) {
                R3[] r3Arr2 = this.f38226a;
                if (i4 >= r3Arr2.length) {
                    break;
                }
                R3 r32 = r3Arr2[i4];
                if (r32 != null) {
                    codedOutputByteBufferNano.writeMessage(1, r32);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                R3[] r3Arr = this.f38226a;
                int length = r3Arr == null ? 0 : r3Arr.length;
                int i4 = repeatedFieldArrayLength + length;
                R3[] r3Arr2 = new R3[i4];
                if (length != 0) {
                    System.arraycopy(r3Arr, 0, r3Arr2, 0, length);
                }
                while (length < i4 - 1) {
                    R3 r32 = new R3();
                    r3Arr2[length] = r32;
                    codedInputByteBufferNano.readMessage(r32);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                R3 r33 = new R3();
                r3Arr2[length] = r33;
                codedInputByteBufferNano.readMessage(r33);
                this.f38226a = r3Arr2;
            }
        }
        return this;
    }

    public static S3 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new S3().mergeFrom(codedInputByteBufferNano);
    }

    public static S3 a(byte[] bArr) {
        return (S3) MessageNano.mergeFrom(new S3(), bArr);
    }
}
