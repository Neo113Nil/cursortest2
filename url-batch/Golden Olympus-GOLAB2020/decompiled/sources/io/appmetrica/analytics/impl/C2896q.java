package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2896q extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C2896q[] f39639c;

    /* renamed from: a, reason: collision with root package name */
    public long f39640a;

    /* renamed from: b, reason: collision with root package name */
    public int f39641b;

    public C2896q() {
        a();
    }

    public static C2896q[] b() {
        if (f39639c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39639c == null) {
                        f39639c = new C2896q[0];
                    }
                } finally {
                }
            }
        }
        return f39639c;
    }

    public final C2896q a() {
        this.f39640a = 0L;
        this.f39641b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j4 = this.f39640a;
        if (j4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j4);
        }
        int i4 = this.f39641b;
        return i4 != 0 ? CodedOutputByteBufferNano.computeInt32Size(2, i4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        long j4 = this.f39640a;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j4);
        }
        int i4 = this.f39641b;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2896q mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f39640a = codedInputByteBufferNano.readInt64();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f39641b = codedInputByteBufferNano.readInt32();
            }
        }
        return this;
    }

    public static C2896q b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2896q().mergeFrom(codedInputByteBufferNano);
    }

    public static C2896q a(byte[] bArr) {
        return (C2896q) MessageNano.mergeFrom(new C2896q(), bArr);
    }
}
