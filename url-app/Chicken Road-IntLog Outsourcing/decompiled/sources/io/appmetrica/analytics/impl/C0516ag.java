package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.ag, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0516ag extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static final int f7871e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f7872f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f7873g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static volatile C0516ag[] f7874h;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f7875a;

    /* renamed from: b, reason: collision with root package name */
    public long f7876b;

    /* renamed from: c, reason: collision with root package name */
    public long f7877c;

    /* renamed from: d, reason: collision with root package name */
    public int f7878d;

    public C0516ag() {
        a();
    }

    public static C0516ag[] b() {
        if (f7874h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7874h == null) {
                        f7874h = new C0516ag[0];
                    }
                } finally {
                }
            }
        }
        return f7874h;
    }

    public final C0516ag a() {
        this.f7875a = WireFormatNano.EMPTY_BYTES;
        this.f7876b = 0L;
        this.f7877c = 0L;
        this.f7878d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeBytesSize = CodedOutputByteBufferNano.computeBytesSize(1, this.f7875a) + super.computeSerializedSize();
        long j2 = this.f7876b;
        if (j2 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(2, j2);
        }
        long j6 = this.f7877c;
        if (j6 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(3, j6);
        }
        int i2 = this.f7878d;
        return i2 != 0 ? computeBytesSize + CodedOutputByteBufferNano.computeInt32Size(4, i2) : computeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeBytes(1, this.f7875a);
        long j2 = this.f7876b;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j2);
        }
        long j6 = this.f7877c;
        if (j6 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j6);
        }
        int i2 = this.f7878d;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0516ag mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f7875a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                this.f7876b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                this.f7877c = codedInputByteBufferNano.readUInt64();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f7878d = readInt32;
                }
            }
        }
    }

    public static C0516ag b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0516ag().mergeFrom(codedInputByteBufferNano);
    }

    public static C0516ag a(byte[] bArr) {
        return (C0516ag) MessageNano.mergeFrom(new C0516ag(), bArr);
    }
}
