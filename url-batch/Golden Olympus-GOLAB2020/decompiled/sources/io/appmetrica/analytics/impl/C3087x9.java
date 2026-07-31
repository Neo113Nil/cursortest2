package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.x9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3087x9 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C3087x9[] f40159c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f40160a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f40161b;

    public C3087x9() {
        a();
    }

    public static C3087x9[] b() {
        if (f40159c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40159c == null) {
                        f40159c = new C3087x9[0];
                    }
                } finally {
                }
            }
        }
        return f40159c;
    }

    public final C3087x9 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f40160a = bArr;
        this.f40161b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f40160a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f40160a);
        }
        return !Arrays.equals(this.f40161b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f40161b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f40160a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f40160a);
        }
        if (!Arrays.equals(this.f40161b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f40161b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3087x9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f40160a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f40161b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static C3087x9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C3087x9().mergeFrom(codedInputByteBufferNano);
    }

    public static C3087x9 a(byte[] bArr) {
        return (C3087x9) MessageNano.mergeFrom(new C3087x9(), bArr);
    }
}
