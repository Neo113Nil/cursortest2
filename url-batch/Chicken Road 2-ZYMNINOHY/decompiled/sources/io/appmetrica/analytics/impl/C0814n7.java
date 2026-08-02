package io.appmetrica.analytics.impl;

import com.startapp.simple.bloomfilter.codec.BaseNCodec;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import io.flutter.Build;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.n7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0814n7 extends MessageNano {

    /* renamed from: k, reason: collision with root package name */
    public static volatile C0814n7[] f12396k;

    /* renamed from: a, reason: collision with root package name */
    public int f12397a;

    /* renamed from: b, reason: collision with root package name */
    public double f12398b;

    /* renamed from: c, reason: collision with root package name */
    public double f12399c;

    /* renamed from: d, reason: collision with root package name */
    public int f12400d;

    /* renamed from: e, reason: collision with root package name */
    public int f12401e;

    /* renamed from: f, reason: collision with root package name */
    public int f12402f;

    /* renamed from: g, reason: collision with root package name */
    public int f12403g;

    /* renamed from: h, reason: collision with root package name */
    public long f12404h;

    /* renamed from: i, reason: collision with root package name */
    public String f12405i;

    /* renamed from: j, reason: collision with root package name */
    public String f12406j;

    public C0814n7() {
        a();
    }

    public static C0814n7[] b() {
        if (f12396k == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12396k == null) {
                        f12396k = new C0814n7[0];
                    }
                } finally {
                }
            }
        }
        return f12396k;
    }

    public final C0814n7 a() {
        this.f12397a = -1;
        this.f12398b = -1.0d;
        this.f12399c = -1.0d;
        this.f12400d = -1;
        this.f12401e = -1;
        this.f12402f = -1;
        this.f12403g = -1;
        this.f12404h = -1L;
        this.f12405i = "";
        this.f12406j = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i4 = this.f12397a;
        if (i4 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i4);
        }
        if (Double.doubleToLongBits(this.f12398b) != Double.doubleToLongBits(-1.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f12398b);
        }
        if (Double.doubleToLongBits(this.f12399c) != Double.doubleToLongBits(-1.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f12399c);
        }
        int i5 = this.f12400d;
        if (i5 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i5);
        }
        int i6 = this.f12401e;
        if (i6 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(5, i6);
        }
        int i7 = this.f12402f;
        if (i7 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i7);
        }
        int i8 = this.f12403g;
        if (i8 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i8);
        }
        long j4 = this.f12404h;
        if (j4 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(8, j4);
        }
        if (!this.f12405i.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(9, this.f12405i);
        }
        return !this.f12406j.equals("") ? CodedOutputByteBufferNano.computeStringSize(10, this.f12406j) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i4 = this.f12397a;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeInt32(1, i4);
        }
        if (Double.doubleToLongBits(this.f12398b) != Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.f12398b);
        }
        if (Double.doubleToLongBits(this.f12399c) != Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.writeDouble(3, this.f12399c);
        }
        int i5 = this.f12400d;
        if (i5 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i5);
        }
        int i6 = this.f12401e;
        if (i6 != -1) {
            codedOutputByteBufferNano.writeInt32(5, i6);
        }
        int i7 = this.f12402f;
        if (i7 != -1) {
            codedOutputByteBufferNano.writeInt32(6, i7);
        }
        int i8 = this.f12403g;
        if (i8 != -1) {
            codedOutputByteBufferNano.writeInt32(7, i8);
        }
        long j4 = this.f12404h;
        if (j4 != -1) {
            codedOutputByteBufferNano.writeInt64(8, j4);
        }
        if (!this.f12405i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f12405i);
        }
        if (!this.f12406j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f12406j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0814n7 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0814n7().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0814n7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 8:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.f12397a = readInt32;
                        break;
                    }
                case 17:
                    this.f12398b = codedInputByteBufferNano.readDouble();
                    break;
                case 25:
                    this.f12399c = codedInputByteBufferNano.readDouble();
                    break;
                case Build.API_LEVELS.API_32 /* 32 */:
                    this.f12400d = codedInputByteBufferNano.readInt32();
                    break;
                case C0583e9.L /* 40 */:
                    this.f12401e = codedInputByteBufferNano.readInt32();
                    break;
                case 48:
                    this.f12402f = codedInputByteBufferNano.readInt32();
                    break;
                case 56:
                    this.f12403g = codedInputByteBufferNano.readInt32();
                    break;
                case BaseNCodec.PEM_CHUNK_SIZE /* 64 */:
                    this.f12404h = codedInputByteBufferNano.readInt64();
                    break;
                case 74:
                    this.f12405i = codedInputByteBufferNano.readString();
                    break;
                case 82:
                    this.f12406j = codedInputByteBufferNano.readString();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }

    public static C0814n7 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0814n7) MessageNano.mergeFrom(new C0814n7(), bArr);
    }
}
