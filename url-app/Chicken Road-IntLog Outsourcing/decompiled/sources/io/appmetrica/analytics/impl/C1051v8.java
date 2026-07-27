package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.v8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1051v8 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C1051v8[] f9455d;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f9456a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f9457b;

    /* renamed from: c, reason: collision with root package name */
    public C1077w8 f9458c;

    public C1051v8() {
        a();
    }

    public static C1051v8[] b() {
        if (f9455d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9455d == null) {
                        f9455d = new C1051v8[0];
                    }
                } finally {
                }
            }
        }
        return f9455d;
    }

    public final C1051v8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f9456a = bArr;
        this.f9457b = bArr;
        this.f9458c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f9456a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f9456a);
        }
        if (!Arrays.equals(this.f9457b, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f9457b);
        }
        C1077w8 c1077w8 = this.f9458c;
        return c1077w8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, c1077w8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f9456a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f9456a);
        }
        if (!Arrays.equals(this.f9457b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f9457b);
        }
        C1077w8 c1077w8 = this.f9458c;
        if (c1077w8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c1077w8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1051v8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f9456a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.f9457b = codedInputByteBufferNano.readBytes();
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f9458c == null) {
                    this.f9458c = new C1077w8();
                }
                codedInputByteBufferNano.readMessage(this.f9458c);
            }
        }
    }

    public static C1051v8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1051v8().mergeFrom(codedInputByteBufferNano);
    }

    public static C1051v8 a(byte[] bArr) {
        return (C1051v8) MessageNano.mergeFrom(new C1051v8(), bArr);
    }
}
