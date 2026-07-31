package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes3.dex */
public final class D9 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile D9[] f37352e;

    /* renamed from: a, reason: collision with root package name */
    public long f37353a;

    /* renamed from: b, reason: collision with root package name */
    public int f37354b;

    /* renamed from: c, reason: collision with root package name */
    public long f37355c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f37356d;

    public D9() {
        a();
    }

    public static D9[] b() {
        if (f37352e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f37352e == null) {
                        f37352e = new D9[0];
                    }
                } finally {
                }
            }
        }
        return f37352e;
    }

    public final D9 a() {
        this.f37353a = 0L;
        this.f37354b = 0;
        this.f37355c = 0L;
        this.f37356d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSInt32Size = CodedOutputByteBufferNano.computeSInt32Size(2, this.f37354b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f37353a) + super.computeSerializedSize();
        long j4 = this.f37355c;
        if (j4 != 0) {
            computeSInt32Size += CodedOutputByteBufferNano.computeInt64Size(3, j4);
        }
        boolean z4 = this.f37356d;
        return z4 ? CodedOutputByteBufferNano.computeBoolSize(4, z4) + computeSInt32Size : computeSInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeUInt64(1, this.f37353a);
        codedOutputByteBufferNano.writeSInt32(2, this.f37354b);
        long j4 = this.f37355c;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeInt64(3, j4);
        }
        boolean z4 = this.f37356d;
        if (z4) {
            codedOutputByteBufferNano.writeBool(4, z4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final D9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f37353a = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 16) {
                this.f37354b = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 24) {
                this.f37355c = codedInputByteBufferNano.readInt64();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f37356d = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static D9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new D9().mergeFrom(codedInputByteBufferNano);
    }

    public static D9 a(byte[] bArr) {
        return (D9) MessageNano.mergeFrom(new D9(), bArr);
    }
}
