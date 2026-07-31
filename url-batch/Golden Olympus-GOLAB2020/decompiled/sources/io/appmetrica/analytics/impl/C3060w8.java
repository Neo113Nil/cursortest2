package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.w8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3060w8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C3060w8[] f40018c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f40019a;

    /* renamed from: b, reason: collision with root package name */
    public A8 f40020b;

    public C3060w8() {
        a();
    }

    public static C3060w8[] b() {
        if (f40018c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40018c == null) {
                        f40018c = new C3060w8[0];
                    }
                } finally {
                }
            }
        }
        return f40018c;
    }

    public final C3060w8 a() {
        this.f40019a = WireFormatNano.EMPTY_BYTES;
        this.f40020b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f40019a, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f40019a);
        }
        A8 a8 = this.f40020b;
        return a8 != null ? CodedOutputByteBufferNano.computeMessageSize(2, a8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!Arrays.equals(this.f40019a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f40019a);
        }
        A8 a8 = this.f40020b;
        if (a8 != null) {
            codedOutputByteBufferNano.writeMessage(2, a8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3060w8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f40019a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f40020b == null) {
                    this.f40020b = new A8();
                }
                codedInputByteBufferNano.readMessage(this.f40020b);
            }
        }
        return this;
    }

    public static C3060w8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C3060w8().mergeFrom(codedInputByteBufferNano);
    }

    public static C3060w8 a(byte[] bArr) {
        return (C3060w8) MessageNano.mergeFrom(new C3060w8(), bArr);
    }
}
