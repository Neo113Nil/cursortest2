package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.m8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0818m8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0818m8[] f8774c;

    /* renamed from: a, reason: collision with root package name */
    public long f8775a;

    /* renamed from: b, reason: collision with root package name */
    public int f8776b;

    public C0818m8() {
        a();
    }

    public static C0818m8[] b() {
        if (f8774c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8774c == null) {
                        f8774c = new C0818m8[0];
                    }
                } finally {
                }
            }
        }
        return f8774c;
    }

    public final C0818m8 a() {
        this.f8775a = 0L;
        this.f8776b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j2 = this.f8775a;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j2);
        }
        int i2 = this.f8776b;
        return i2 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        long j2 = this.f8775a;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j2);
        }
        int i2 = this.f8776b;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0818m8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f8775a = codedInputByteBufferNano.readInt64();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f8776b = codedInputByteBufferNano.readInt32();
            }
        }
    }

    public static C0818m8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0818m8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0818m8 a(byte[] bArr) {
        return (C0818m8) MessageNano.mergeFrom(new C0818m8(), bArr);
    }
}
