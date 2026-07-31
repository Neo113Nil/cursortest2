package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.i8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0247i8 extends MessageNano {
    public static volatile C0247i8[] f;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f1303a;
    public byte[] b;
    public C0349m8 c;
    public C0272j8[] d;
    public int e;

    public C0247i8() {
        a();
    }

    public static C0247i8[] b() {
        if (f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f == null) {
                    f = new C0247i8[0];
                }
            }
        }
        return f;
    }

    public final C0247i8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f1303a = bArr;
        this.b = bArr;
        this.c = null;
        this.d = C0272j8.b();
        this.e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f1303a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f1303a);
        }
        if (!Arrays.equals(this.b, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.b);
        }
        C0349m8 c0349m8 = this.c;
        if (c0349m8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c0349m8);
        }
        C0272j8[] c0272j8Arr = this.d;
        if (c0272j8Arr != null && c0272j8Arr.length > 0) {
            int i = 0;
            while (true) {
                C0272j8[] c0272j8Arr2 = this.d;
                if (i >= c0272j8Arr2.length) {
                    break;
                }
                C0272j8 c0272j8 = c0272j8Arr2[i];
                if (c0272j8 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c0272j8);
                }
                i++;
            }
        }
        int i2 = this.e;
        return i2 != 0 ? CodedOutputByteBufferNano.computeUInt32Size(5, i2) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f1303a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f1303a);
        }
        if (!Arrays.equals(this.b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.b);
        }
        C0349m8 c0349m8 = this.c;
        if (c0349m8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0349m8);
        }
        C0272j8[] c0272j8Arr = this.d;
        if (c0272j8Arr != null && c0272j8Arr.length > 0) {
            int i = 0;
            while (true) {
                C0272j8[] c0272j8Arr2 = this.d;
                if (i >= c0272j8Arr2.length) {
                    break;
                }
                C0272j8 c0272j8 = c0272j8Arr2[i];
                if (c0272j8 != null) {
                    codedOutputByteBufferNano.writeMessage(4, c0272j8);
                }
                i++;
            }
        }
        int i2 = this.e;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0247i8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f1303a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.b = codedInputByteBufferNano.readBytes();
            } else if (readTag == 26) {
                if (this.c == null) {
                    this.c = new C0349m8();
                }
                codedInputByteBufferNano.readMessage(this.c);
            } else if (readTag == 34) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                C0272j8[] c0272j8Arr = this.d;
                int length = c0272j8Arr == null ? 0 : c0272j8Arr.length;
                int i = repeatedFieldArrayLength + length;
                C0272j8[] c0272j8Arr2 = new C0272j8[i];
                if (length != 0) {
                    System.arraycopy(c0272j8Arr, 0, c0272j8Arr2, 0, length);
                }
                while (length < i - 1) {
                    C0272j8 c0272j8 = new C0272j8();
                    c0272j8Arr2[length] = c0272j8;
                    codedInputByteBufferNano.readMessage(c0272j8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0272j8 c0272j82 = new C0272j8();
                c0272j8Arr2[length] = c0272j82;
                codedInputByteBufferNano.readMessage(c0272j82);
                this.d = c0272j8Arr2;
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.e = codedInputByteBufferNano.readUInt32();
            }
        }
        return this;
    }

    public static C0247i8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0247i8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0247i8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0247i8) MessageNano.mergeFrom(new C0247i8(), bArr);
    }
}
