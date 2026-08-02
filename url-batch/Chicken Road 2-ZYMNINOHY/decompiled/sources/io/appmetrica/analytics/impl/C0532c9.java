package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.c9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0532c9 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0532c9[] f11596c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f11597a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f11598b;

    public C0532c9() {
        a();
    }

    public static C0532c9[] b() {
        if (f11596c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11596c == null) {
                        f11596c = new C0532c9[0];
                    }
                } finally {
                }
            }
        }
        return f11596c;
    }

    public final C0532c9 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f11597a = bArr;
        this.f11598b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f11597a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f11597a);
        }
        return !Arrays.equals(this.f11598b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f11598b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f11597a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f11597a);
        }
        if (!Arrays.equals(this.f11598b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f11598b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0532c9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f11597a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f11598b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static C0532c9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0532c9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0532c9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0532c9) MessageNano.mergeFrom(new C0532c9(), bArr);
    }
}
