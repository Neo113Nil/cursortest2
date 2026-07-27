package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.u9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1026u9 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C1026u9[] f9364b;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f9365a;

    public C1026u9() {
        a();
    }

    public static C1026u9[] b() {
        if (f9364b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9364b == null) {
                        f9364b = new C1026u9[0];
                    }
                } finally {
                }
            }
        }
        return f9364b;
    }

    public final C1026u9 a() {
        this.f9365a = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        return !Arrays.equals(this.f9365a, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(1, this.f9365a) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!Arrays.equals(this.f9365a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f9365a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1026u9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f9365a = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static C1026u9 a(byte[] bArr) {
        return (C1026u9) MessageNano.mergeFrom(new C1026u9(), bArr);
    }

    public static C1026u9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1026u9().mergeFrom(codedInputByteBufferNano);
    }
}
