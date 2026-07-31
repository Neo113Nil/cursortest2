package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes3.dex */
public final class Bg extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static final int f37247e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f37248f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f37249g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static volatile Bg[] f37250h;

    /* renamed from: a, reason: collision with root package name */
    public String f37251a;

    /* renamed from: b, reason: collision with root package name */
    public long f37252b;

    /* renamed from: c, reason: collision with root package name */
    public long f37253c;

    /* renamed from: d, reason: collision with root package name */
    public int f37254d;

    public Bg() {
        a();
    }

    public static Bg[] b() {
        if (f37250h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f37250h == null) {
                        f37250h = new Bg[0];
                    }
                } finally {
                }
            }
        }
        return f37250h;
    }

    public final Bg a() {
        this.f37251a = "";
        this.f37252b = 0L;
        this.f37253c = 0L;
        this.f37254d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f37251a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f37251a);
        }
        long j4 = this.f37252b;
        if (j4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j4);
        }
        long j5 = this.f37253c;
        if (j5 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(3, j5);
        }
        int i4 = this.f37254d;
        return i4 != 0 ? CodedOutputByteBufferNano.computeInt32Size(4, i4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f37251a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f37251a);
        }
        long j4 = this.f37252b;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j4);
        }
        long j5 = this.f37253c;
        if (j5 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j5);
        }
        int i4 = this.f37254d;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Bg mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f37251a = codedInputByteBufferNano.readString();
            } else if (readTag == 16) {
                this.f37252b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                this.f37253c = codedInputByteBufferNano.readUInt64();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f37254d = readInt32;
                }
            }
        }
        return this;
    }

    public static Bg b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Bg().mergeFrom(codedInputByteBufferNano);
    }

    public static Bg a(byte[] bArr) {
        return (Bg) MessageNano.mergeFrom(new Bg(), bArr);
    }
}
