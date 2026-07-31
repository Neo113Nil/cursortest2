package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class H8 extends MessageNano {

    /* renamed from: h, reason: collision with root package name */
    public static volatile H8[] f37622h;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f37623a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f37624b;

    /* renamed from: c, reason: collision with root package name */
    public C3138z8 f37625c;

    /* renamed from: d, reason: collision with root package name */
    public F8 f37626d;

    /* renamed from: e, reason: collision with root package name */
    public G8 f37627e;

    /* renamed from: f, reason: collision with root package name */
    public G8 f37628f;

    /* renamed from: g, reason: collision with root package name */
    public I8[] f37629g;

    public H8() {
        a();
    }

    public static H8[] b() {
        if (f37622h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f37622h == null) {
                        f37622h = new H8[0];
                    }
                } finally {
                }
            }
        }
        return f37622h;
    }

    public final H8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f37623a = bArr;
        this.f37624b = bArr;
        this.f37625c = null;
        this.f37626d = null;
        this.f37627e = null;
        this.f37628f = null;
        this.f37629g = I8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f37623a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f37623a);
        }
        if (!Arrays.equals(this.f37624b, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f37624b);
        }
        C3138z8 c3138z8 = this.f37625c;
        if (c3138z8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c3138z8);
        }
        F8 f8 = this.f37626d;
        if (f8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, f8);
        }
        G8 g8 = this.f37627e;
        if (g8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, g8);
        }
        G8 g82 = this.f37628f;
        if (g82 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, g82);
        }
        I8[] i8Arr = this.f37629g;
        if (i8Arr != null && i8Arr.length > 0) {
            int i4 = 0;
            while (true) {
                I8[] i8Arr2 = this.f37629g;
                if (i4 >= i8Arr2.length) {
                    break;
                }
                I8 i8 = i8Arr2[i4];
                if (i8 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, i8) + computeSerializedSize;
                }
                i4++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f37623a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f37623a);
        }
        if (!Arrays.equals(this.f37624b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f37624b);
        }
        C3138z8 c3138z8 = this.f37625c;
        if (c3138z8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c3138z8);
        }
        F8 f8 = this.f37626d;
        if (f8 != null) {
            codedOutputByteBufferNano.writeMessage(4, f8);
        }
        G8 g8 = this.f37627e;
        if (g8 != null) {
            codedOutputByteBufferNano.writeMessage(5, g8);
        }
        G8 g82 = this.f37628f;
        if (g82 != null) {
            codedOutputByteBufferNano.writeMessage(6, g82);
        }
        I8[] i8Arr = this.f37629g;
        if (i8Arr != null && i8Arr.length > 0) {
            int i4 = 0;
            while (true) {
                I8[] i8Arr2 = this.f37629g;
                if (i4 >= i8Arr2.length) {
                    break;
                }
                I8 i8 = i8Arr2[i4];
                if (i8 != null) {
                    codedOutputByteBufferNano.writeMessage(7, i8);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static H8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new H8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final H8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f37623a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.f37624b = codedInputByteBufferNano.readBytes();
            } else if (readTag == 26) {
                if (this.f37625c == null) {
                    this.f37625c = new C3138z8();
                }
                codedInputByteBufferNano.readMessage(this.f37625c);
            } else if (readTag == 34) {
                if (this.f37626d == null) {
                    this.f37626d = new F8();
                }
                codedInputByteBufferNano.readMessage(this.f37626d);
            } else if (readTag == 42) {
                if (this.f37627e == null) {
                    this.f37627e = new G8();
                }
                codedInputByteBufferNano.readMessage(this.f37627e);
            } else if (readTag == 50) {
                if (this.f37628f == null) {
                    this.f37628f = new G8();
                }
                codedInputByteBufferNano.readMessage(this.f37628f);
            } else if (readTag != 58) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                I8[] i8Arr = this.f37629g;
                int length = i8Arr == null ? 0 : i8Arr.length;
                int i4 = repeatedFieldArrayLength + length;
                I8[] i8Arr2 = new I8[i4];
                if (length != 0) {
                    System.arraycopy(i8Arr, 0, i8Arr2, 0, length);
                }
                while (length < i4 - 1) {
                    I8 i8 = new I8();
                    i8Arr2[length] = i8;
                    codedInputByteBufferNano.readMessage(i8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                I8 i82 = new I8();
                i8Arr2[length] = i82;
                codedInputByteBufferNano.readMessage(i82);
                this.f37629g = i8Arr2;
            }
        }
        return this;
    }

    public static H8 a(byte[] bArr) {
        return (H8) MessageNano.mergeFrom(new H8(), bArr);
    }
}
