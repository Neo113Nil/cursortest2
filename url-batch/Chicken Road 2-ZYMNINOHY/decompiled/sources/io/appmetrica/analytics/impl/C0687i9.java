package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.i9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0687i9 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0687i9[] f12032e;

    /* renamed from: a, reason: collision with root package name */
    public long f12033a;

    /* renamed from: b, reason: collision with root package name */
    public int f12034b;

    /* renamed from: c, reason: collision with root package name */
    public long f12035c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12036d;

    public C0687i9() {
        a();
    }

    public static C0687i9[] b() {
        if (f12032e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12032e == null) {
                        f12032e = new C0687i9[0];
                    }
                } finally {
                }
            }
        }
        return f12032e;
    }

    public final C0687i9 a() {
        this.f12033a = 0L;
        this.f12034b = 0;
        this.f12035c = 0L;
        this.f12036d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSInt32Size = CodedOutputByteBufferNano.computeSInt32Size(2, this.f12034b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f12033a) + super.computeSerializedSize();
        long j4 = this.f12035c;
        if (j4 != 0) {
            computeSInt32Size += CodedOutputByteBufferNano.computeInt64Size(3, j4);
        }
        boolean z = this.f12036d;
        return z ? CodedOutputByteBufferNano.computeBoolSize(4, z) + computeSInt32Size : computeSInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f12033a);
        codedOutputByteBufferNano.writeSInt32(2, this.f12034b);
        long j4 = this.f12035c;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeInt64(3, j4);
        }
        boolean z = this.f12036d;
        if (z) {
            codedOutputByteBufferNano.writeBool(4, z);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0687i9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f12033a = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 16) {
                this.f12034b = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 24) {
                this.f12035c = codedInputByteBufferNano.readInt64();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f12036d = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C0687i9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0687i9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0687i9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0687i9) MessageNano.mergeFrom(new C0687i9(), bArr);
    }
}
