package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class Z8 extends MessageNano {

    /* renamed from: j, reason: collision with root package name */
    public static final int f11349j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final int f11350k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static final int f11351l = 2;

    /* renamed from: m, reason: collision with root package name */
    public static volatile Z8[] f11352m;

    /* renamed from: a, reason: collision with root package name */
    public double f11353a;

    /* renamed from: b, reason: collision with root package name */
    public double f11354b;

    /* renamed from: c, reason: collision with root package name */
    public long f11355c;

    /* renamed from: d, reason: collision with root package name */
    public int f11356d;

    /* renamed from: e, reason: collision with root package name */
    public int f11357e;

    /* renamed from: f, reason: collision with root package name */
    public int f11358f;

    /* renamed from: g, reason: collision with root package name */
    public int f11359g;

    /* renamed from: h, reason: collision with root package name */
    public int f11360h;

    /* renamed from: i, reason: collision with root package name */
    public String f11361i;

    public Z8() {
        a();
    }

    public static Z8[] b() {
        if (f11352m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11352m == null) {
                        f11352m = new Z8[0];
                    }
                } finally {
                }
            }
        }
        return f11352m;
    }

    public final Z8 a() {
        this.f11353a = 0.0d;
        this.f11354b = 0.0d;
        this.f11355c = 0L;
        this.f11356d = 0;
        this.f11357e = 0;
        this.f11358f = 0;
        this.f11359g = 0;
        this.f11360h = 0;
        this.f11361i = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeDoubleSize = CodedOutputByteBufferNano.computeDoubleSize(2, this.f11354b) + CodedOutputByteBufferNano.computeDoubleSize(1, this.f11353a) + super.computeSerializedSize();
        long j4 = this.f11355c;
        if (j4 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt64Size(3, j4);
        }
        int i4 = this.f11356d;
        if (i4 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(4, i4);
        }
        int i5 = this.f11357e;
        if (i5 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(5, i5);
        }
        int i6 = this.f11358f;
        if (i6 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(6, i6);
        }
        int i7 = this.f11359g;
        if (i7 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(7, i7);
        }
        int i8 = this.f11360h;
        if (i8 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(8, i8);
        }
        return !this.f11361i.equals("") ? CodedOutputByteBufferNano.computeStringSize(9, this.f11361i) + computeDoubleSize : computeDoubleSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeDouble(1, this.f11353a);
        codedOutputByteBufferNano.writeDouble(2, this.f11354b);
        long j4 = this.f11355c;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j4);
        }
        int i4 = this.f11356d;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeUInt32(4, i4);
        }
        int i5 = this.f11357e;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i5);
        }
        int i6 = this.f11358f;
        if (i6 != 0) {
            codedOutputByteBufferNano.writeUInt32(6, i6);
        }
        int i7 = this.f11359g;
        if (i7 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i7);
        }
        int i8 = this.f11360h;
        if (i8 != 0) {
            codedOutputByteBufferNano.writeInt32(8, i8);
        }
        if (!this.f11361i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f11361i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Z8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Z8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Z8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 9) {
                this.f11353a = codedInputByteBufferNano.readDouble();
            } else if (readTag == 17) {
                this.f11354b = codedInputByteBufferNano.readDouble();
            } else if (readTag == 24) {
                this.f11355c = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 32) {
                this.f11356d = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 40) {
                this.f11357e = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 48) {
                this.f11358f = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 56) {
                this.f11359g = codedInputByteBufferNano.readInt32();
            } else if (readTag == 64) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f11360h = readInt32;
                }
            } else if (readTag != 74) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f11361i = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static Z8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Z8) MessageNano.mergeFrom(new Z8(), bArr);
    }
}
