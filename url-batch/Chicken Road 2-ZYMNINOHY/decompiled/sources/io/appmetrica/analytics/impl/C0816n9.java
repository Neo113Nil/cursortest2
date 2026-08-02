package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.n9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0816n9 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0816n9[] f12415b;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f12416a;

    public C0816n9() {
        a();
    }

    public static C0816n9[] b() {
        if (f12415b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12415b == null) {
                        f12415b = new C0816n9[0];
                    }
                } finally {
                }
            }
        }
        return f12415b;
    }

    public final C0816n9 a() {
        this.f12416a = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        return !Arrays.equals(this.f12416a, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(1, this.f12416a) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f12416a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f12416a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0816n9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f12416a = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static C0816n9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0816n9) MessageNano.mergeFrom(new C0816n9(), bArr);
    }

    public static C0816n9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0816n9().mergeFrom(codedInputByteBufferNano);
    }
}
