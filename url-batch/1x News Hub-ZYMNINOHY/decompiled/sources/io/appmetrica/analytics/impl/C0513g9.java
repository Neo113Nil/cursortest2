package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.g9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0513g9 extends MessageNano {

    /* renamed from: j, reason: collision with root package name */
    public static final int f7378j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final int f7379k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static final int f7380l = 2;

    /* renamed from: m, reason: collision with root package name */
    public static volatile C0513g9[] f7381m;

    /* renamed from: a, reason: collision with root package name */
    public double f7382a;

    /* renamed from: b, reason: collision with root package name */
    public double f7383b;

    /* renamed from: c, reason: collision with root package name */
    public long f7384c;

    /* renamed from: d, reason: collision with root package name */
    public int f7385d;

    /* renamed from: e, reason: collision with root package name */
    public int f7386e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f7387g;

    /* renamed from: h, reason: collision with root package name */
    public int f7388h;

    /* renamed from: i, reason: collision with root package name */
    public String f7389i;

    public C0513g9() {
        a();
    }

    public static C0513g9[] b() {
        if (f7381m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7381m == null) {
                        f7381m = new C0513g9[0];
                    }
                } finally {
                }
            }
        }
        return f7381m;
    }

    public final C0513g9 a() {
        this.f7382a = 0.0d;
        this.f7383b = 0.0d;
        this.f7384c = 0L;
        this.f7385d = 0;
        this.f7386e = 0;
        this.f = 0;
        this.f7387g = 0;
        this.f7388h = 0;
        this.f7389i = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeDoubleSize = CodedOutputByteBufferNano.computeDoubleSize(2, this.f7383b) + CodedOutputByteBufferNano.computeDoubleSize(1, this.f7382a) + super.computeSerializedSize();
        long j3 = this.f7384c;
        if (j3 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt64Size(3, j3);
        }
        int i3 = this.f7385d;
        if (i3 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(4, i3);
        }
        int i4 = this.f7386e;
        if (i4 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(5, i4);
        }
        int i5 = this.f;
        if (i5 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(6, i5);
        }
        int i6 = this.f7387g;
        if (i6 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(7, i6);
        }
        int i7 = this.f7388h;
        if (i7 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(8, i7);
        }
        return !this.f7389i.equals("") ? CodedOutputByteBufferNano.computeStringSize(9, this.f7389i) + computeDoubleSize : computeDoubleSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeDouble(1, this.f7382a);
        codedOutputByteBufferNano.writeDouble(2, this.f7383b);
        long j3 = this.f7384c;
        if (j3 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j3);
        }
        int i3 = this.f7385d;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(4, i3);
        }
        int i4 = this.f7386e;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i4);
        }
        int i5 = this.f;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeUInt32(6, i5);
        }
        int i6 = this.f7387g;
        if (i6 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i6);
        }
        int i7 = this.f7388h;
        if (i7 != 0) {
            codedOutputByteBufferNano.writeInt32(8, i7);
        }
        if (!this.f7389i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f7389i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0513g9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0513g9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0513g9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 9) {
                this.f7382a = codedInputByteBufferNano.readDouble();
            } else if (readTag == 17) {
                this.f7383b = codedInputByteBufferNano.readDouble();
            } else if (readTag == 24) {
                this.f7384c = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 32) {
                this.f7385d = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 40) {
                this.f7386e = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 48) {
                this.f = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 56) {
                this.f7387g = codedInputByteBufferNano.readInt32();
            } else if (readTag == 64) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f7388h = readInt32;
                }
            } else if (readTag != 74) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f7389i = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C0513g9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0513g9) MessageNano.mergeFrom(new C0513g9(), bArr);
    }
}
