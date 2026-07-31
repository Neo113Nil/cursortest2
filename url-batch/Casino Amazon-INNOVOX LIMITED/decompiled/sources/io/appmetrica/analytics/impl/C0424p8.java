package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.p8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0424p8 extends MessageNano {
    public static volatile C0424p8[] b;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f1428a;

    public C0424p8() {
        a();
    }

    public static C0424p8[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (b == null) {
                    b = new C0424p8[0];
                }
            }
        }
        return b;
    }

    public final C0424p8 a() {
        this.f1428a = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        return !Arrays.equals(this.f1428a, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(1, this.f1428a) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f1428a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f1428a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0424p8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f1428a = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static C0424p8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0424p8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0424p8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0424p8) MessageNano.mergeFrom(new C0424p8(), bArr);
    }
}
