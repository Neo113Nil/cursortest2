package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.i8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0715i8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0715i8[] f8395c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f8396a;

    /* renamed from: b, reason: collision with root package name */
    public C0818m8 f8397b;

    public C0715i8() {
        a();
    }

    public static C0715i8[] b() {
        if (f8395c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8395c == null) {
                        f8395c = new C0715i8[0];
                    }
                } finally {
                }
            }
        }
        return f8395c;
    }

    public final C0715i8 a() {
        this.f8396a = WireFormatNano.EMPTY_BYTES;
        this.f8397b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f8396a, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f8396a);
        }
        C0818m8 c0818m8 = this.f8397b;
        return c0818m8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c0818m8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!Arrays.equals(this.f8396a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f8396a);
        }
        C0818m8 c0818m8 = this.f8397b;
        if (c0818m8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0818m8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0715i8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f8396a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f8397b == null) {
                    this.f8397b = new C0818m8();
                }
                codedInputByteBufferNano.readMessage(this.f8397b);
            }
        }
    }

    public static C0715i8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0715i8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0715i8 a(byte[] bArr) {
        return (C0715i8) MessageNano.mergeFrom(new C0715i8(), bArr);
    }
}
