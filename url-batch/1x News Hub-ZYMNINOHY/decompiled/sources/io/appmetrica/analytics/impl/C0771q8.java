package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.q8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0771q8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0771q8[] f8138c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f8139a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f8140b;

    public C0771q8() {
        a();
    }

    public static C0771q8[] b() {
        if (f8138c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8138c == null) {
                        f8138c = new C0771q8[0];
                    }
                } finally {
                }
            }
        }
        return f8138c;
    }

    public final C0771q8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f8139a = bArr;
        this.f8140b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f8139a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f8139a);
        }
        return !Arrays.equals(this.f8140b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f8140b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f8139a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f8139a);
        }
        if (!Arrays.equals(this.f8140b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f8140b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0771q8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f8139a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f8140b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static C0771q8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0771q8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0771q8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0771q8) MessageNano.mergeFrom(new C0771q8(), bArr);
    }
}
