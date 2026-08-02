package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class U5 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile U5[] f11033c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f11034a;

    /* renamed from: b, reason: collision with root package name */
    public Y5 f11035b;

    public U5() {
        a();
    }

    public static U5[] b() {
        if (f11033c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11033c == null) {
                        f11033c = new U5[0];
                    }
                } finally {
                }
            }
        }
        return f11033c;
    }

    public final U5 a() {
        this.f11034a = WireFormatNano.EMPTY_BYTES;
        this.f11035b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f11034a, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f11034a);
        }
        Y5 y5 = this.f11035b;
        return y5 != null ? CodedOutputByteBufferNano.computeMessageSize(2, y5) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f11034a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f11034a);
        }
        Y5 y5 = this.f11035b;
        if (y5 != null) {
            codedOutputByteBufferNano.writeMessage(2, y5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final U5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f11034a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f11035b == null) {
                    this.f11035b = new Y5();
                }
                codedInputByteBufferNano.readMessage(this.f11035b);
            }
        }
        return this;
    }

    public static U5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new U5().mergeFrom(codedInputByteBufferNano);
    }

    public static U5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (U5) MessageNano.mergeFrom(new U5(), bArr);
    }
}
