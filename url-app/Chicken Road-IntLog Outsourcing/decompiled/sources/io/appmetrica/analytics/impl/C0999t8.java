package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.t8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0999t8 extends MessageNano {

    /* renamed from: h, reason: collision with root package name */
    public static volatile C0999t8[] f9295h;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f9296a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f9297b;

    /* renamed from: c, reason: collision with root package name */
    public C0792l8 f9298c;

    /* renamed from: d, reason: collision with root package name */
    public C0947r8 f9299d;

    /* renamed from: e, reason: collision with root package name */
    public C0973s8 f9300e;

    /* renamed from: f, reason: collision with root package name */
    public C0973s8 f9301f;

    /* renamed from: g, reason: collision with root package name */
    public C1025u8[] f9302g;

    public C0999t8() {
        a();
    }

    public static C0999t8[] b() {
        if (f9295h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9295h == null) {
                        f9295h = new C0999t8[0];
                    }
                } finally {
                }
            }
        }
        return f9295h;
    }

    public final C0999t8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f9296a = bArr;
        this.f9297b = bArr;
        this.f9298c = null;
        this.f9299d = null;
        this.f9300e = null;
        this.f9301f = null;
        this.f9302g = C1025u8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f9296a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f9296a);
        }
        if (!Arrays.equals(this.f9297b, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f9297b);
        }
        C0792l8 c0792l8 = this.f9298c;
        if (c0792l8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c0792l8);
        }
        C0947r8 c0947r8 = this.f9299d;
        if (c0947r8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c0947r8);
        }
        C0973s8 c0973s8 = this.f9300e;
        if (c0973s8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c0973s8);
        }
        C0973s8 c0973s82 = this.f9301f;
        if (c0973s82 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, c0973s82);
        }
        C1025u8[] c1025u8Arr = this.f9302g;
        if (c1025u8Arr != null && c1025u8Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C1025u8[] c1025u8Arr2 = this.f9302g;
                if (i2 >= c1025u8Arr2.length) {
                    break;
                }
                C1025u8 c1025u8 = c1025u8Arr2[i2];
                if (c1025u8 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, c1025u8) + computeSerializedSize;
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f9296a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f9296a);
        }
        if (!Arrays.equals(this.f9297b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f9297b);
        }
        C0792l8 c0792l8 = this.f9298c;
        if (c0792l8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0792l8);
        }
        C0947r8 c0947r8 = this.f9299d;
        if (c0947r8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0947r8);
        }
        C0973s8 c0973s8 = this.f9300e;
        if (c0973s8 != null) {
            codedOutputByteBufferNano.writeMessage(5, c0973s8);
        }
        C0973s8 c0973s82 = this.f9301f;
        if (c0973s82 != null) {
            codedOutputByteBufferNano.writeMessage(6, c0973s82);
        }
        C1025u8[] c1025u8Arr = this.f9302g;
        if (c1025u8Arr != null && c1025u8Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C1025u8[] c1025u8Arr2 = this.f9302g;
                if (i2 >= c1025u8Arr2.length) {
                    break;
                }
                C1025u8 c1025u8 = c1025u8Arr2[i2];
                if (c1025u8 != null) {
                    codedOutputByteBufferNano.writeMessage(7, c1025u8);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0999t8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0999t8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0999t8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f9296a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.f9297b = codedInputByteBufferNano.readBytes();
            } else if (readTag == 26) {
                if (this.f9298c == null) {
                    this.f9298c = new C0792l8();
                }
                codedInputByteBufferNano.readMessage(this.f9298c);
            } else if (readTag == 34) {
                if (this.f9299d == null) {
                    this.f9299d = new C0947r8();
                }
                codedInputByteBufferNano.readMessage(this.f9299d);
            } else if (readTag == 42) {
                if (this.f9300e == null) {
                    this.f9300e = new C0973s8();
                }
                codedInputByteBufferNano.readMessage(this.f9300e);
            } else if (readTag == 50) {
                if (this.f9301f == null) {
                    this.f9301f = new C0973s8();
                }
                codedInputByteBufferNano.readMessage(this.f9301f);
            } else if (readTag != 58) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                C1025u8[] c1025u8Arr = this.f9302g;
                int length = c1025u8Arr == null ? 0 : c1025u8Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                C1025u8[] c1025u8Arr2 = new C1025u8[i2];
                if (length != 0) {
                    System.arraycopy(c1025u8Arr, 0, c1025u8Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    C1025u8 c1025u8 = new C1025u8();
                    c1025u8Arr2[length] = c1025u8;
                    codedInputByteBufferNano.readMessage(c1025u8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C1025u8 c1025u82 = new C1025u8();
                c1025u8Arr2[length] = c1025u82;
                codedInputByteBufferNano.readMessage(c1025u82);
                this.f9302g = c1025u8Arr2;
            }
        }
    }

    public static C0999t8 a(byte[] bArr) {
        return (C0999t8) MessageNano.mergeFrom(new C0999t8(), bArr);
    }
}
