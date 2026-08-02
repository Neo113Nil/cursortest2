package io.appmetrica.analytics.impl;

import com.startapp.simple.bloomfilter.codec.BaseNCodec;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import io.flutter.Build;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.m7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0788m7 extends MessageNano {

    /* renamed from: s, reason: collision with root package name */
    public static volatile C0788m7[] f12328s;

    /* renamed from: a, reason: collision with root package name */
    public int f12329a;

    /* renamed from: b, reason: collision with root package name */
    public String f12330b;

    /* renamed from: c, reason: collision with root package name */
    public String f12331c;

    /* renamed from: d, reason: collision with root package name */
    public long f12332d;

    /* renamed from: e, reason: collision with root package name */
    public C0814n7 f12333e;

    /* renamed from: f, reason: collision with root package name */
    public String f12334f;

    /* renamed from: g, reason: collision with root package name */
    public String f12335g;

    /* renamed from: h, reason: collision with root package name */
    public long f12336h;

    /* renamed from: i, reason: collision with root package name */
    public int f12337i;

    /* renamed from: j, reason: collision with root package name */
    public int f12338j;

    /* renamed from: k, reason: collision with root package name */
    public String f12339k;

    /* renamed from: l, reason: collision with root package name */
    public int f12340l;

    /* renamed from: m, reason: collision with root package name */
    public String f12341m;
    public int n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public int f12342p;

    /* renamed from: q, reason: collision with root package name */
    public int f12343q;

    /* renamed from: r, reason: collision with root package name */
    public byte[] f12344r;

    public C0788m7() {
        a();
    }

    public static C0788m7[] b() {
        if (f12328s == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12328s == null) {
                        f12328s = new C0788m7[0];
                    }
                } finally {
                }
            }
        }
        return f12328s;
    }

    public final C0788m7 a() {
        this.f12329a = -1;
        this.f12330b = "";
        this.f12331c = "";
        this.f12332d = -1L;
        this.f12333e = null;
        this.f12334f = "";
        this.f12335g = "";
        this.f12336h = -1L;
        this.f12337i = -1;
        this.f12338j = -1;
        this.f12339k = "";
        this.f12340l = -1;
        this.f12341m = "";
        this.n = -1;
        this.o = -1;
        this.f12342p = -1;
        this.f12343q = -1;
        this.f12344r = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i4 = this.f12329a;
        if (i4 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i4);
        }
        if (!this.f12330b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f12330b);
        }
        if (!this.f12331c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f12331c);
        }
        long j4 = this.f12332d;
        if (j4 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(4, j4);
        }
        C0814n7 c0814n7 = this.f12333e;
        if (c0814n7 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c0814n7);
        }
        if (!this.f12334f.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f12334f);
        }
        if (!this.f12335g.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(7, this.f12335g);
        }
        long j5 = this.f12336h;
        if (j5 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(8, j5);
        }
        int i5 = this.f12337i;
        if (i5 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(9, i5);
        }
        int i6 = this.f12338j;
        if (i6 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(10, i6);
        }
        if (!this.f12339k.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(11, this.f12339k);
        }
        int i7 = this.f12340l;
        if (i7 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(12, i7);
        }
        if (!this.f12341m.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(13, this.f12341m);
        }
        int i8 = this.n;
        if (i8 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(14, i8);
        }
        int i9 = this.o;
        if (i9 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(15, i9);
        }
        int i10 = this.f12342p;
        if (i10 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(16, i10);
        }
        int i11 = this.f12343q;
        if (i11 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(17, i11);
        }
        return !Arrays.equals(this.f12344r, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(18, this.f12344r) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i4 = this.f12329a;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeInt32(1, i4);
        }
        if (!this.f12330b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f12330b);
        }
        if (!this.f12331c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f12331c);
        }
        long j4 = this.f12332d;
        if (j4 != -1) {
            codedOutputByteBufferNano.writeInt64(4, j4);
        }
        C0814n7 c0814n7 = this.f12333e;
        if (c0814n7 != null) {
            codedOutputByteBufferNano.writeMessage(5, c0814n7);
        }
        if (!this.f12334f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f12334f);
        }
        if (!this.f12335g.equals("")) {
            codedOutputByteBufferNano.writeString(7, this.f12335g);
        }
        long j5 = this.f12336h;
        if (j5 != -1) {
            codedOutputByteBufferNano.writeInt64(8, j5);
        }
        int i5 = this.f12337i;
        if (i5 != -1) {
            codedOutputByteBufferNano.writeInt32(9, i5);
        }
        int i6 = this.f12338j;
        if (i6 != -1) {
            codedOutputByteBufferNano.writeInt32(10, i6);
        }
        if (!this.f12339k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f12339k);
        }
        int i7 = this.f12340l;
        if (i7 != -1) {
            codedOutputByteBufferNano.writeInt32(12, i7);
        }
        if (!this.f12341m.equals("")) {
            codedOutputByteBufferNano.writeString(13, this.f12341m);
        }
        int i8 = this.n;
        if (i8 != -1) {
            codedOutputByteBufferNano.writeInt32(14, i8);
        }
        int i9 = this.o;
        if (i9 != -1) {
            codedOutputByteBufferNano.writeInt32(15, i9);
        }
        int i10 = this.f12342p;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeInt32(16, i10);
        }
        int i11 = this.f12343q;
        if (i11 != -1) {
            codedOutputByteBufferNano.writeInt32(17, i11);
        }
        if (!Arrays.equals(this.f12344r, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(18, this.f12344r);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0788m7 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0788m7().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0788m7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 8:
                    this.f12329a = codedInputByteBufferNano.readInt32();
                    break;
                case 18:
                    this.f12330b = codedInputByteBufferNano.readString();
                    break;
                case 26:
                    this.f12331c = codedInputByteBufferNano.readString();
                    break;
                case Build.API_LEVELS.API_32 /* 32 */:
                    this.f12332d = codedInputByteBufferNano.readInt64();
                    break;
                case C0583e9.f11752M /* 42 */:
                    if (this.f12333e == null) {
                        this.f12333e = new C0814n7();
                    }
                    codedInputByteBufferNano.readMessage(this.f12333e);
                    break;
                case 50:
                    this.f12334f = codedInputByteBufferNano.readString();
                    break;
                case 58:
                    this.f12335g = codedInputByteBufferNano.readString();
                    break;
                case BaseNCodec.PEM_CHUNK_SIZE /* 64 */:
                    this.f12336h = codedInputByteBufferNano.readInt64();
                    break;
                case 72:
                    this.f12337i = codedInputByteBufferNano.readInt32();
                    break;
                case 80:
                    this.f12338j = codedInputByteBufferNano.readInt32();
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    this.f12339k = codedInputByteBufferNano.readString();
                    break;
                case 96:
                    this.f12340l = codedInputByteBufferNano.readInt32();
                    break;
                case 106:
                    this.f12341m = codedInputByteBufferNano.readString();
                    break;
                case 112:
                    this.n = codedInputByteBufferNano.readInt32();
                    break;
                case 120:
                    this.o = codedInputByteBufferNano.readInt32();
                    break;
                case 128:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.f12342p = readInt32;
                        break;
                    }
                case 136:
                    this.f12343q = codedInputByteBufferNano.readInt32();
                    break;
                case 146:
                    this.f12344r = codedInputByteBufferNano.readBytes();
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

    public static C0788m7 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0788m7) MessageNano.mergeFrom(new C0788m7(), bArr);
    }
}
