package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes3.dex */
public final class G8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile G8[] f37568c;

    /* renamed from: a, reason: collision with root package name */
    public C3060w8 f37569a;

    /* renamed from: b, reason: collision with root package name */
    public C3060w8[] f37570b;

    public G8() {
        a();
    }

    public static G8[] b() {
        if (f37568c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f37568c == null) {
                        f37568c = new G8[0];
                    }
                } finally {
                }
            }
        }
        return f37568c;
    }

    public final G8 a() {
        this.f37569a = null;
        this.f37570b = C3060w8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C3060w8 c3060w8 = this.f37569a;
        if (c3060w8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c3060w8);
        }
        C3060w8[] c3060w8Arr = this.f37570b;
        if (c3060w8Arr != null && c3060w8Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C3060w8[] c3060w8Arr2 = this.f37570b;
                if (i4 >= c3060w8Arr2.length) {
                    break;
                }
                C3060w8 c3060w82 = c3060w8Arr2[i4];
                if (c3060w82 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c3060w82) + computeSerializedSize;
                }
                i4++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C3060w8 c3060w8 = this.f37569a;
        if (c3060w8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c3060w8);
        }
        C3060w8[] c3060w8Arr = this.f37570b;
        if (c3060w8Arr != null && c3060w8Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C3060w8[] c3060w8Arr2 = this.f37570b;
                if (i4 >= c3060w8Arr2.length) {
                    break;
                }
                C3060w8 c3060w82 = c3060w8Arr2[i4];
                if (c3060w82 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c3060w82);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final G8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f37569a == null) {
                    this.f37569a = new C3060w8();
                }
                codedInputByteBufferNano.readMessage(this.f37569a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C3060w8[] c3060w8Arr = this.f37570b;
                int length = c3060w8Arr == null ? 0 : c3060w8Arr.length;
                int i4 = repeatedFieldArrayLength + length;
                C3060w8[] c3060w8Arr2 = new C3060w8[i4];
                if (length != 0) {
                    System.arraycopy(c3060w8Arr, 0, c3060w8Arr2, 0, length);
                }
                while (length < i4 - 1) {
                    C3060w8 c3060w8 = new C3060w8();
                    c3060w8Arr2[length] = c3060w8;
                    codedInputByteBufferNano.readMessage(c3060w8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C3060w8 c3060w82 = new C3060w8();
                c3060w8Arr2[length] = c3060w82;
                codedInputByteBufferNano.readMessage(c3060w82);
                this.f37570b = c3060w8Arr2;
            }
        }
        return this;
    }

    public static G8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new G8().mergeFrom(codedInputByteBufferNano);
    }

    public static G8 a(byte[] bArr) {
        return (G8) MessageNano.mergeFrom(new G8(), bArr);
    }
}
