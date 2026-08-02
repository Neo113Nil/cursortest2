package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.ag, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0365ag extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static final int f7024e = 0;
    public static final int f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f7025g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static volatile C0365ag[] f7026h;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f7027a;

    /* renamed from: b, reason: collision with root package name */
    public long f7028b;

    /* renamed from: c, reason: collision with root package name */
    public long f7029c;

    /* renamed from: d, reason: collision with root package name */
    public int f7030d;

    public C0365ag() {
        a();
    }

    public static C0365ag[] b() {
        if (f7026h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7026h == null) {
                        f7026h = new C0365ag[0];
                    }
                } finally {
                }
            }
        }
        return f7026h;
    }

    public final C0365ag a() {
        this.f7027a = WireFormatNano.EMPTY_BYTES;
        this.f7028b = 0L;
        this.f7029c = 0L;
        this.f7030d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeBytesSize = CodedOutputByteBufferNano.computeBytesSize(1, this.f7027a) + super.computeSerializedSize();
        long j3 = this.f7028b;
        if (j3 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(2, j3);
        }
        long j4 = this.f7029c;
        if (j4 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(3, j4);
        }
        int i3 = this.f7030d;
        return i3 != 0 ? CodedOutputByteBufferNano.computeInt32Size(4, i3) + computeBytesSize : computeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBytes(1, this.f7027a);
        long j3 = this.f7028b;
        if (j3 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j3);
        }
        long j4 = this.f7029c;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j4);
        }
        int i3 = this.f7030d;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0365ag mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f7027a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                this.f7028b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                this.f7029c = codedInputByteBufferNano.readUInt64();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f7030d = readInt32;
                }
            }
        }
        return this;
    }

    public static C0365ag b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0365ag().mergeFrom(codedInputByteBufferNano);
    }

    public static C0365ag a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0365ag) MessageNano.mergeFrom(new C0365ag(), bArr);
    }
}
