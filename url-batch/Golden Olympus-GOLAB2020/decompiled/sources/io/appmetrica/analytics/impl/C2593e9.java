package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.e9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2593e9 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C2593e9[] f38917b;

    /* renamed from: a, reason: collision with root package name */
    public C2567d9[] f38918a;

    public C2593e9() {
        a();
    }

    public static C2593e9[] b() {
        if (f38917b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f38917b == null) {
                        f38917b = new C2593e9[0];
                    }
                } finally {
                }
            }
        }
        return f38917b;
    }

    public final C2593e9 a() {
        this.f38918a = C2567d9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C2567d9[] c2567d9Arr = this.f38918a;
        if (c2567d9Arr != null && c2567d9Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C2567d9[] c2567d9Arr2 = this.f38918a;
                if (i4 >= c2567d9Arr2.length) {
                    break;
                }
                C2567d9 c2567d9 = c2567d9Arr2[i4];
                if (c2567d9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c2567d9) + computeSerializedSize;
                }
                i4++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C2567d9[] c2567d9Arr = this.f38918a;
        if (c2567d9Arr != null && c2567d9Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C2567d9[] c2567d9Arr2 = this.f38918a;
                if (i4 >= c2567d9Arr2.length) {
                    break;
                }
                C2567d9 c2567d9 = c2567d9Arr2[i4];
                if (c2567d9 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c2567d9);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2593e9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                C2567d9[] c2567d9Arr = this.f38918a;
                int length = c2567d9Arr == null ? 0 : c2567d9Arr.length;
                int i4 = repeatedFieldArrayLength + length;
                C2567d9[] c2567d9Arr2 = new C2567d9[i4];
                if (length != 0) {
                    System.arraycopy(c2567d9Arr, 0, c2567d9Arr2, 0, length);
                }
                while (length < i4 - 1) {
                    C2567d9 c2567d9 = new C2567d9();
                    c2567d9Arr2[length] = c2567d9;
                    codedInputByteBufferNano.readMessage(c2567d9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C2567d9 c2567d92 = new C2567d9();
                c2567d9Arr2[length] = c2567d92;
                codedInputByteBufferNano.readMessage(c2567d92);
                this.f38918a = c2567d9Arr2;
            }
        }
        return this;
    }

    public static C2593e9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2593e9().mergeFrom(codedInputByteBufferNano);
    }

    public static C2593e9 a(byte[] bArr) {
        return (C2593e9) MessageNano.mergeFrom(new C2593e9(), bArr);
    }
}
