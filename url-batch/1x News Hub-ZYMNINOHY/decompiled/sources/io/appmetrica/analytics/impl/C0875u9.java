package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.u9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0875u9 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0875u9[] f8418b;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f8419a;

    public C0875u9() {
        a();
    }

    public static C0875u9[] b() {
        if (f8418b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8418b == null) {
                        f8418b = new C0875u9[0];
                    }
                } finally {
                }
            }
        }
        return f8418b;
    }

    public final C0875u9 a() {
        this.f8419a = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        return !Arrays.equals(this.f8419a, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(1, this.f8419a) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f8419a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f8419a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0875u9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f8419a = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static C0875u9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0875u9) MessageNano.mergeFrom(new C0875u9(), bArr);
    }

    public static C0875u9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0875u9().mergeFrom(codedInputByteBufferNano);
    }
}
