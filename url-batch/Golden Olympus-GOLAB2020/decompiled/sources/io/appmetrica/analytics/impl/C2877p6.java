package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.p6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2877p6 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C2877p6[] f39604c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f39605a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f39606b;

    public C2877p6() {
        a();
    }

    public static C2877p6[] b() {
        if (f39604c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39604c == null) {
                        f39604c = new C2877p6[0];
                    }
                } finally {
                }
            }
        }
        return f39604c;
    }

    public final C2877p6 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f39605a = bArr;
        this.f39606b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f39605a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f39605a);
        }
        return !Arrays.equals(this.f39606b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f39606b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f39605a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f39605a);
        }
        if (!Arrays.equals(this.f39606b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f39606b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2877p6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f39605a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f39606b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static C2877p6 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2877p6().mergeFrom(codedInputByteBufferNano);
    }

    public static C2877p6 a(byte[] bArr) {
        return (C2877p6) MessageNano.mergeFrom(new C2877p6(), bArr);
    }
}
