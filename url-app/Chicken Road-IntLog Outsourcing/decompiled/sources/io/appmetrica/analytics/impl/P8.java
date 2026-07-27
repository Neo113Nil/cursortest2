package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class P8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile P8[] f7270c;

    /* renamed from: a, reason: collision with root package name */
    public String f7271a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f7272b;

    public P8() {
        a();
    }

    public static P8[] b() {
        if (f7270c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7270c == null) {
                        f7270c = new P8[0];
                    }
                } finally {
                }
            }
        }
        return f7270c;
    }

    public final P8 a() {
        this.f7271a = "";
        this.f7272b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f7271a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f7271a);
        }
        return !Arrays.equals(this.f7272b, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f7272b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f7271a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f7271a);
        }
        if (!Arrays.equals(this.f7272b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f7272b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final P8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f7271a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f7272b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static P8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new P8().mergeFrom(codedInputByteBufferNano);
    }

    public static P8 a(byte[] bArr) {
        return (P8) MessageNano.mergeFrom(new P8(), bArr);
    }
}
