package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class Vf extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static final int f11137e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f11138f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f11139g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static volatile Vf[] f11140h;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f11141a;

    /* renamed from: b, reason: collision with root package name */
    public long f11142b;

    /* renamed from: c, reason: collision with root package name */
    public long f11143c;

    /* renamed from: d, reason: collision with root package name */
    public int f11144d;

    public Vf() {
        a();
    }

    public static Vf[] b() {
        if (f11140h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11140h == null) {
                        f11140h = new Vf[0];
                    }
                } finally {
                }
            }
        }
        return f11140h;
    }

    public final Vf a() {
        this.f11141a = WireFormatNano.EMPTY_BYTES;
        this.f11142b = 0L;
        this.f11143c = 0L;
        this.f11144d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeBytesSize = CodedOutputByteBufferNano.computeBytesSize(1, this.f11141a) + super.computeSerializedSize();
        long j4 = this.f11142b;
        if (j4 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(2, j4);
        }
        long j5 = this.f11143c;
        if (j5 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(3, j5);
        }
        int i4 = this.f11144d;
        return i4 != 0 ? CodedOutputByteBufferNano.computeInt32Size(4, i4) + computeBytesSize : computeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBytes(1, this.f11141a);
        long j4 = this.f11142b;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j4);
        }
        long j5 = this.f11143c;
        if (j5 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j5);
        }
        int i4 = this.f11144d;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Vf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f11141a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                this.f11142b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                this.f11143c = codedInputByteBufferNano.readUInt64();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f11144d = readInt32;
                }
            }
        }
        return this;
    }

    public static Vf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Vf().mergeFrom(codedInputByteBufferNano);
    }

    public static Vf a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Vf) MessageNano.mergeFrom(new Vf(), bArr);
    }
}
