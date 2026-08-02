package io.appmetrica.analytics.impl;

import com.startapp.simple.bloomfilter.codec.BaseNCodec;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.v7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0899v7 extends MessageNano {

    /* renamed from: k, reason: collision with root package name */
    public static volatile C0899v7[] f8493k;

    /* renamed from: a, reason: collision with root package name */
    public int f8494a;

    /* renamed from: b, reason: collision with root package name */
    public double f8495b;

    /* renamed from: c, reason: collision with root package name */
    public double f8496c;

    /* renamed from: d, reason: collision with root package name */
    public int f8497d;

    /* renamed from: e, reason: collision with root package name */
    public int f8498e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f8499g;

    /* renamed from: h, reason: collision with root package name */
    public long f8500h;

    /* renamed from: i, reason: collision with root package name */
    public String f8501i;

    /* renamed from: j, reason: collision with root package name */
    public String f8502j;

    public C0899v7() {
        a();
    }

    public static C0899v7[] b() {
        if (f8493k == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8493k == null) {
                        f8493k = new C0899v7[0];
                    }
                } finally {
                }
            }
        }
        return f8493k;
    }

    public final C0899v7 a() {
        this.f8494a = -1;
        this.f8495b = -1.0d;
        this.f8496c = -1.0d;
        this.f8497d = -1;
        this.f8498e = -1;
        this.f = -1;
        this.f8499g = -1;
        this.f8500h = -1L;
        this.f8501i = "";
        this.f8502j = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i3 = this.f8494a;
        if (i3 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i3);
        }
        if (Double.doubleToLongBits(this.f8495b) != Double.doubleToLongBits(-1.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f8495b);
        }
        if (Double.doubleToLongBits(this.f8496c) != Double.doubleToLongBits(-1.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f8496c);
        }
        int i4 = this.f8497d;
        if (i4 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i4);
        }
        int i5 = this.f8498e;
        if (i5 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(5, i5);
        }
        int i6 = this.f;
        if (i6 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i6);
        }
        int i7 = this.f8499g;
        if (i7 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i7);
        }
        long j3 = this.f8500h;
        if (j3 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(8, j3);
        }
        if (!this.f8501i.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(9, this.f8501i);
        }
        return !this.f8502j.equals("") ? CodedOutputByteBufferNano.computeStringSize(10, this.f8502j) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i3 = this.f8494a;
        if (i3 != -1) {
            codedOutputByteBufferNano.writeInt32(1, i3);
        }
        if (Double.doubleToLongBits(this.f8495b) != Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.f8495b);
        }
        if (Double.doubleToLongBits(this.f8496c) != Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.writeDouble(3, this.f8496c);
        }
        int i4 = this.f8497d;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i4);
        }
        int i5 = this.f8498e;
        if (i5 != -1) {
            codedOutputByteBufferNano.writeInt32(5, i5);
        }
        int i6 = this.f;
        if (i6 != -1) {
            codedOutputByteBufferNano.writeInt32(6, i6);
        }
        int i7 = this.f8499g;
        if (i7 != -1) {
            codedOutputByteBufferNano.writeInt32(7, i7);
        }
        long j3 = this.f8500h;
        if (j3 != -1) {
            codedOutputByteBufferNano.writeInt64(8, j3);
        }
        if (!this.f8501i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f8501i);
        }
        if (!this.f8502j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f8502j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0899v7 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0899v7().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0899v7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                        this.f8494a = readInt32;
                        break;
                    }
                case 17:
                    this.f8495b = codedInputByteBufferNano.readDouble();
                    break;
                case C0642l9.f7780F /* 25 */:
                    this.f8496c = codedInputByteBufferNano.readDouble();
                    break;
                case 32:
                    this.f8497d = codedInputByteBufferNano.readInt32();
                    break;
                case C0642l9.L /* 40 */:
                    this.f8498e = codedInputByteBufferNano.readInt32();
                    break;
                case 48:
                    this.f = codedInputByteBufferNano.readInt32();
                    break;
                case 56:
                    this.f8499g = codedInputByteBufferNano.readInt32();
                    break;
                case BaseNCodec.PEM_CHUNK_SIZE /* 64 */:
                    this.f8500h = codedInputByteBufferNano.readInt64();
                    break;
                case 74:
                    this.f8501i = codedInputByteBufferNano.readString();
                    break;
                case 82:
                    this.f8502j = codedInputByteBufferNano.readString();
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

    public static C0899v7 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0899v7) MessageNano.mergeFrom(new C0899v7(), bArr);
    }
}
