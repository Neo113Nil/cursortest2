package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.a6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0355a6 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0355a6[] f6988c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f6989a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f6990b;

    public C0355a6() {
        a();
    }

    public static C0355a6[] b() {
        if (f6988c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6988c == null) {
                        f6988c = new C0355a6[0];
                    }
                } finally {
                }
            }
        }
        return f6988c;
    }

    public final C0355a6 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f6989a = bArr;
        this.f6990b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f6989a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f6989a);
        }
        return !Arrays.equals(this.f6990b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f6990b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f6989a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f6989a);
        }
        if (!Arrays.equals(this.f6990b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f6990b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0355a6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f6989a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f6990b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static C0355a6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0355a6().mergeFrom(codedInputByteBufferNano);
    }

    public static C0355a6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0355a6) MessageNano.mergeFrom(new C0355a6(), bArr);
    }
}
