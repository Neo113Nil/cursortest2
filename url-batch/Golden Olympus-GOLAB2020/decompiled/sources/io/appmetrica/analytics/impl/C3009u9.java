package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.u9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3009u9 extends MessageNano {

    /* renamed from: j, reason: collision with root package name */
    public static final int f39918j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final int f39919k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static final int f39920l = 2;

    /* renamed from: m, reason: collision with root package name */
    public static volatile C3009u9[] f39921m;

    /* renamed from: a, reason: collision with root package name */
    public double f39922a;

    /* renamed from: b, reason: collision with root package name */
    public double f39923b;

    /* renamed from: c, reason: collision with root package name */
    public long f39924c;

    /* renamed from: d, reason: collision with root package name */
    public int f39925d;

    /* renamed from: e, reason: collision with root package name */
    public int f39926e;

    /* renamed from: f, reason: collision with root package name */
    public int f39927f;

    /* renamed from: g, reason: collision with root package name */
    public int f39928g;

    /* renamed from: h, reason: collision with root package name */
    public int f39929h;

    /* renamed from: i, reason: collision with root package name */
    public String f39930i;

    public C3009u9() {
        a();
    }

    public static C3009u9[] b() {
        if (f39921m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39921m == null) {
                        f39921m = new C3009u9[0];
                    }
                } finally {
                }
            }
        }
        return f39921m;
    }

    public final C3009u9 a() {
        this.f39922a = 0.0d;
        this.f39923b = 0.0d;
        this.f39924c = 0L;
        this.f39925d = 0;
        this.f39926e = 0;
        this.f39927f = 0;
        this.f39928g = 0;
        this.f39929h = 0;
        this.f39930i = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeDoubleSize = CodedOutputByteBufferNano.computeDoubleSize(2, this.f39923b) + CodedOutputByteBufferNano.computeDoubleSize(1, this.f39922a) + super.computeSerializedSize();
        long j4 = this.f39924c;
        if (j4 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt64Size(3, j4);
        }
        int i4 = this.f39925d;
        if (i4 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(4, i4);
        }
        int i5 = this.f39926e;
        if (i5 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(5, i5);
        }
        int i6 = this.f39927f;
        if (i6 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(6, i6);
        }
        int i7 = this.f39928g;
        if (i7 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(7, i7);
        }
        int i8 = this.f39929h;
        if (i8 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(8, i8);
        }
        return !this.f39930i.equals("") ? CodedOutputByteBufferNano.computeStringSize(9, this.f39930i) + computeDoubleSize : computeDoubleSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeDouble(1, this.f39922a);
        codedOutputByteBufferNano.writeDouble(2, this.f39923b);
        long j4 = this.f39924c;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j4);
        }
        int i4 = this.f39925d;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeUInt32(4, i4);
        }
        int i5 = this.f39926e;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i5);
        }
        int i6 = this.f39927f;
        if (i6 != 0) {
            codedOutputByteBufferNano.writeUInt32(6, i6);
        }
        int i7 = this.f39928g;
        if (i7 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i7);
        }
        int i8 = this.f39929h;
        if (i8 != 0) {
            codedOutputByteBufferNano.writeInt32(8, i8);
        }
        if (!this.f39930i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f39930i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C3009u9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C3009u9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3009u9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 9) {
                this.f39922a = codedInputByteBufferNano.readDouble();
            } else if (readTag == 17) {
                this.f39923b = codedInputByteBufferNano.readDouble();
            } else if (readTag == 24) {
                this.f39924c = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 32) {
                this.f39925d = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 40) {
                this.f39926e = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 48) {
                this.f39927f = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 56) {
                this.f39928g = codedInputByteBufferNano.readInt32();
            } else if (readTag == 64) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f39929h = readInt32;
                }
            } else if (readTag != 74) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f39930i = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C3009u9 a(byte[] bArr) {
        return (C3009u9) MessageNano.mergeFrom(new C3009u9(), bArr);
    }
}
