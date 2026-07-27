package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.s8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0973s8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0973s8[] f9239c;

    /* renamed from: a, reason: collision with root package name */
    public C0715i8 f9240a;

    /* renamed from: b, reason: collision with root package name */
    public C0715i8[] f9241b;

    public C0973s8() {
        a();
    }

    public static C0973s8[] b() {
        if (f9239c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9239c == null) {
                        f9239c = new C0973s8[0];
                    }
                } finally {
                }
            }
        }
        return f9239c;
    }

    public final C0973s8 a() {
        this.f9240a = null;
        this.f9241b = C0715i8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0715i8 c0715i8 = this.f9240a;
        if (c0715i8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0715i8);
        }
        C0715i8[] c0715i8Arr = this.f9241b;
        if (c0715i8Arr != null && c0715i8Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C0715i8[] c0715i8Arr2 = this.f9241b;
                if (i2 >= c0715i8Arr2.length) {
                    break;
                }
                C0715i8 c0715i82 = c0715i8Arr2[i2];
                if (c0715i82 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c0715i82) + computeSerializedSize;
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C0715i8 c0715i8 = this.f9240a;
        if (c0715i8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0715i8);
        }
        C0715i8[] c0715i8Arr = this.f9241b;
        if (c0715i8Arr != null && c0715i8Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C0715i8[] c0715i8Arr2 = this.f9241b;
                if (i2 >= c0715i8Arr2.length) {
                    break;
                }
                C0715i8 c0715i82 = c0715i8Arr2[i2];
                if (c0715i82 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0715i82);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0973s8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f9240a == null) {
                    this.f9240a = new C0715i8();
                }
                codedInputByteBufferNano.readMessage(this.f9240a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C0715i8[] c0715i8Arr = this.f9241b;
                int length = c0715i8Arr == null ? 0 : c0715i8Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                C0715i8[] c0715i8Arr2 = new C0715i8[i2];
                if (length != 0) {
                    System.arraycopy(c0715i8Arr, 0, c0715i8Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    C0715i8 c0715i8 = new C0715i8();
                    c0715i8Arr2[length] = c0715i8;
                    codedInputByteBufferNano.readMessage(c0715i8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0715i8 c0715i82 = new C0715i8();
                c0715i8Arr2[length] = c0715i82;
                codedInputByteBufferNano.readMessage(c0715i82);
                this.f9241b = c0715i8Arr2;
            }
        }
    }

    public static C0973s8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0973s8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0973s8 a(byte[] bArr) {
        return (C0973s8) MessageNano.mergeFrom(new C0973s8(), bArr);
    }
}
