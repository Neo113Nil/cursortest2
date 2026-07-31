package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class B8 extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static volatile B8[] f37211f;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f37212a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f37213b;

    /* renamed from: c, reason: collision with root package name */
    public F8 f37214c;

    /* renamed from: d, reason: collision with root package name */
    public C8[] f37215d;

    /* renamed from: e, reason: collision with root package name */
    public int f37216e;

    public B8() {
        a();
    }

    public static B8[] b() {
        if (f37211f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f37211f == null) {
                        f37211f = new B8[0];
                    }
                } finally {
                }
            }
        }
        return f37211f;
    }

    public final B8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f37212a = bArr;
        this.f37213b = bArr;
        this.f37214c = null;
        this.f37215d = C8.b();
        this.f37216e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f37212a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f37212a);
        }
        if (!Arrays.equals(this.f37213b, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f37213b);
        }
        F8 f8 = this.f37214c;
        if (f8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, f8);
        }
        C8[] c8Arr = this.f37215d;
        if (c8Arr != null && c8Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C8[] c8Arr2 = this.f37215d;
                if (i4 >= c8Arr2.length) {
                    break;
                }
                C8 c8 = c8Arr2[i4];
                if (c8 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(4, c8) + computeSerializedSize;
                }
                i4++;
            }
        }
        int i5 = this.f37216e;
        return i5 != 0 ? CodedOutputByteBufferNano.computeUInt32Size(5, i5) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f37212a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f37212a);
        }
        if (!Arrays.equals(this.f37213b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f37213b);
        }
        F8 f8 = this.f37214c;
        if (f8 != null) {
            codedOutputByteBufferNano.writeMessage(3, f8);
        }
        C8[] c8Arr = this.f37215d;
        if (c8Arr != null && c8Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C8[] c8Arr2 = this.f37215d;
                if (i4 >= c8Arr2.length) {
                    break;
                }
                C8 c8 = c8Arr2[i4];
                if (c8 != null) {
                    codedOutputByteBufferNano.writeMessage(4, c8);
                }
                i4++;
            }
        }
        int i5 = this.f37216e;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static B8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new B8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final B8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f37212a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.f37213b = codedInputByteBufferNano.readBytes();
            } else if (readTag == 26) {
                if (this.f37214c == null) {
                    this.f37214c = new F8();
                }
                codedInputByteBufferNano.readMessage(this.f37214c);
            } else if (readTag == 34) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                C8[] c8Arr = this.f37215d;
                int length = c8Arr == null ? 0 : c8Arr.length;
                int i4 = repeatedFieldArrayLength + length;
                C8[] c8Arr2 = new C8[i4];
                if (length != 0) {
                    System.arraycopy(c8Arr, 0, c8Arr2, 0, length);
                }
                while (length < i4 - 1) {
                    C8 c8 = new C8();
                    c8Arr2[length] = c8;
                    codedInputByteBufferNano.readMessage(c8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C8 c82 = new C8();
                c8Arr2[length] = c82;
                codedInputByteBufferNano.readMessage(c82);
                this.f37215d = c8Arr2;
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f37216e = codedInputByteBufferNano.readUInt32();
            }
        }
        return this;
    }

    public static B8 a(byte[] bArr) {
        return (B8) MessageNano.mergeFrom(new B8(), bArr);
    }
}
