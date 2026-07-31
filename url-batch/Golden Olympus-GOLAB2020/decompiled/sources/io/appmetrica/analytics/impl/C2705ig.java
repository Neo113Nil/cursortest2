package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.ig, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2705ig extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static final int f39197e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f39198f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f39199g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static volatile C2705ig[] f39200h;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f39201a;

    /* renamed from: b, reason: collision with root package name */
    public long f39202b;

    /* renamed from: c, reason: collision with root package name */
    public long f39203c;

    /* renamed from: d, reason: collision with root package name */
    public int f39204d;

    public C2705ig() {
        a();
    }

    public static C2705ig[] b() {
        if (f39200h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39200h == null) {
                        f39200h = new C2705ig[0];
                    }
                } finally {
                }
            }
        }
        return f39200h;
    }

    public final C2705ig a() {
        this.f39201a = WireFormatNano.EMPTY_BYTES;
        this.f39202b = 0L;
        this.f39203c = 0L;
        this.f39204d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeBytesSize = CodedOutputByteBufferNano.computeBytesSize(1, this.f39201a) + super.computeSerializedSize();
        long j4 = this.f39202b;
        if (j4 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(2, j4);
        }
        long j5 = this.f39203c;
        if (j5 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(3, j5);
        }
        int i4 = this.f39204d;
        return i4 != 0 ? CodedOutputByteBufferNano.computeInt32Size(4, i4) + computeBytesSize : computeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeBytes(1, this.f39201a);
        long j4 = this.f39202b;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j4);
        }
        long j5 = this.f39203c;
        if (j5 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j5);
        }
        int i4 = this.f39204d;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2705ig mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f39201a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                this.f39202b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                this.f39203c = codedInputByteBufferNano.readUInt64();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f39204d = readInt32;
                }
            }
        }
        return this;
    }

    public static C2705ig b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2705ig().mergeFrom(codedInputByteBufferNano);
    }

    public static C2705ig a(byte[] bArr) {
        return (C2705ig) MessageNano.mergeFrom(new C2705ig(), bArr);
    }
}
