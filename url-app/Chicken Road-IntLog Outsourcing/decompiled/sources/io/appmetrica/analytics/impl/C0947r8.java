package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.r8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0947r8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0947r8[] f9145c;

    /* renamed from: a, reason: collision with root package name */
    public C0922q8[] f9146a;

    /* renamed from: b, reason: collision with root package name */
    public int f9147b;

    public C0947r8() {
        a();
    }

    public static C0947r8[] b() {
        if (f9145c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9145c == null) {
                        f9145c = new C0947r8[0];
                    }
                } finally {
                }
            }
        }
        return f9145c;
    }

    public final C0947r8 a() {
        this.f9146a = C0922q8.b();
        this.f9147b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0922q8[] c0922q8Arr = this.f9146a;
        if (c0922q8Arr != null && c0922q8Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C0922q8[] c0922q8Arr2 = this.f9146a;
                if (i2 >= c0922q8Arr2.length) {
                    break;
                }
                C0922q8 c0922q8 = c0922q8Arr2[i2];
                if (c0922q8 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c0922q8) + computeSerializedSize;
                }
                i2++;
            }
        }
        int i3 = this.f9147b;
        return i3 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(2, i3) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C0922q8[] c0922q8Arr = this.f9146a;
        if (c0922q8Arr != null && c0922q8Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C0922q8[] c0922q8Arr2 = this.f9146a;
                if (i2 >= c0922q8Arr2.length) {
                    break;
                }
                C0922q8 c0922q8 = c0922q8Arr2[i2];
                if (c0922q8 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0922q8);
                }
                i2++;
            }
        }
        int i3 = this.f9147b;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0947r8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C0922q8[] c0922q8Arr = this.f9146a;
                int length = c0922q8Arr == null ? 0 : c0922q8Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                C0922q8[] c0922q8Arr2 = new C0922q8[i2];
                if (length != 0) {
                    System.arraycopy(c0922q8Arr, 0, c0922q8Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    C0922q8 c0922q8 = new C0922q8();
                    c0922q8Arr2[length] = c0922q8;
                    codedInputByteBufferNano.readMessage(c0922q8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0922q8 c0922q82 = new C0922q8();
                c0922q8Arr2[length] = c0922q82;
                codedInputByteBufferNano.readMessage(c0922q82);
                this.f9146a = c0922q8Arr2;
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f9147b = codedInputByteBufferNano.readUInt32();
            }
        }
    }

    public static C0947r8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0947r8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0947r8 a(byte[] bArr) {
        return (C0947r8) MessageNano.mergeFrom(new C0947r8(), bArr);
    }
}
