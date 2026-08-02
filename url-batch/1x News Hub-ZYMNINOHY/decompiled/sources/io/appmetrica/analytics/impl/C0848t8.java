package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.t8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0848t8 extends MessageNano {

    /* renamed from: h, reason: collision with root package name */
    public static volatile C0848t8[] f8353h;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f8354a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f8355b;

    /* renamed from: c, reason: collision with root package name */
    public C0641l8 f8356c;

    /* renamed from: d, reason: collision with root package name */
    public C0796r8 f8357d;

    /* renamed from: e, reason: collision with root package name */
    public C0822s8 f8358e;
    public C0822s8 f;

    /* renamed from: g, reason: collision with root package name */
    public C0874u8[] f8359g;

    public C0848t8() {
        a();
    }

    public static C0848t8[] b() {
        if (f8353h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8353h == null) {
                        f8353h = new C0848t8[0];
                    }
                } finally {
                }
            }
        }
        return f8353h;
    }

    public final C0848t8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f8354a = bArr;
        this.f8355b = bArr;
        this.f8356c = null;
        this.f8357d = null;
        this.f8358e = null;
        this.f = null;
        this.f8359g = C0874u8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f8354a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f8354a);
        }
        if (!Arrays.equals(this.f8355b, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f8355b);
        }
        C0641l8 c0641l8 = this.f8356c;
        if (c0641l8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c0641l8);
        }
        C0796r8 c0796r8 = this.f8357d;
        if (c0796r8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c0796r8);
        }
        C0822s8 c0822s8 = this.f8358e;
        if (c0822s8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c0822s8);
        }
        C0822s8 c0822s82 = this.f;
        if (c0822s82 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, c0822s82);
        }
        C0874u8[] c0874u8Arr = this.f8359g;
        if (c0874u8Arr != null && c0874u8Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C0874u8[] c0874u8Arr2 = this.f8359g;
                if (i3 >= c0874u8Arr2.length) {
                    break;
                }
                C0874u8 c0874u8 = c0874u8Arr2[i3];
                if (c0874u8 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, c0874u8) + computeSerializedSize;
                }
                i3++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f8354a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f8354a);
        }
        if (!Arrays.equals(this.f8355b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f8355b);
        }
        C0641l8 c0641l8 = this.f8356c;
        if (c0641l8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0641l8);
        }
        C0796r8 c0796r8 = this.f8357d;
        if (c0796r8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0796r8);
        }
        C0822s8 c0822s8 = this.f8358e;
        if (c0822s8 != null) {
            codedOutputByteBufferNano.writeMessage(5, c0822s8);
        }
        C0822s8 c0822s82 = this.f;
        if (c0822s82 != null) {
            codedOutputByteBufferNano.writeMessage(6, c0822s82);
        }
        C0874u8[] c0874u8Arr = this.f8359g;
        if (c0874u8Arr != null && c0874u8Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C0874u8[] c0874u8Arr2 = this.f8359g;
                if (i3 >= c0874u8Arr2.length) {
                    break;
                }
                C0874u8 c0874u8 = c0874u8Arr2[i3];
                if (c0874u8 != null) {
                    codedOutputByteBufferNano.writeMessage(7, c0874u8);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0848t8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0848t8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0848t8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f8354a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.f8355b = codedInputByteBufferNano.readBytes();
            } else if (readTag == 26) {
                if (this.f8356c == null) {
                    this.f8356c = new C0641l8();
                }
                codedInputByteBufferNano.readMessage(this.f8356c);
            } else if (readTag == 34) {
                if (this.f8357d == null) {
                    this.f8357d = new C0796r8();
                }
                codedInputByteBufferNano.readMessage(this.f8357d);
            } else if (readTag == 42) {
                if (this.f8358e == null) {
                    this.f8358e = new C0822s8();
                }
                codedInputByteBufferNano.readMessage(this.f8358e);
            } else if (readTag == 50) {
                if (this.f == null) {
                    this.f = new C0822s8();
                }
                codedInputByteBufferNano.readMessage(this.f);
            } else if (readTag != 58) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                C0874u8[] c0874u8Arr = this.f8359g;
                int length = c0874u8Arr == null ? 0 : c0874u8Arr.length;
                int i3 = repeatedFieldArrayLength + length;
                C0874u8[] c0874u8Arr2 = new C0874u8[i3];
                if (length != 0) {
                    System.arraycopy(c0874u8Arr, 0, c0874u8Arr2, 0, length);
                }
                while (length < i3 - 1) {
                    C0874u8 c0874u8 = new C0874u8();
                    c0874u8Arr2[length] = c0874u8;
                    codedInputByteBufferNano.readMessage(c0874u8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0874u8 c0874u82 = new C0874u8();
                c0874u8Arr2[length] = c0874u82;
                codedInputByteBufferNano.readMessage(c0874u82);
                this.f8359g = c0874u8Arr2;
            }
        }
        return this;
    }

    public static C0848t8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0848t8) MessageNano.mergeFrom(new C0848t8(), bArr);
    }
}
