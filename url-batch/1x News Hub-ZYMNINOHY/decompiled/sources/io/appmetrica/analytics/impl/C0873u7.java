package io.appmetrica.analytics.impl;

import com.startapp.simple.bloomfilter.codec.BaseNCodec;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.u7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0873u7 extends MessageNano {

    /* renamed from: s, reason: collision with root package name */
    public static volatile C0873u7[] f8399s;

    /* renamed from: a, reason: collision with root package name */
    public int f8400a;

    /* renamed from: b, reason: collision with root package name */
    public String f8401b;

    /* renamed from: c, reason: collision with root package name */
    public String f8402c;

    /* renamed from: d, reason: collision with root package name */
    public long f8403d;

    /* renamed from: e, reason: collision with root package name */
    public C0899v7 f8404e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public String f8405g;

    /* renamed from: h, reason: collision with root package name */
    public long f8406h;

    /* renamed from: i, reason: collision with root package name */
    public int f8407i;

    /* renamed from: j, reason: collision with root package name */
    public int f8408j;

    /* renamed from: k, reason: collision with root package name */
    public String f8409k;

    /* renamed from: l, reason: collision with root package name */
    public int f8410l;

    /* renamed from: m, reason: collision with root package name */
    public String f8411m;

    /* renamed from: n, reason: collision with root package name */
    public int f8412n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public int f8413p;

    /* renamed from: q, reason: collision with root package name */
    public int f8414q;

    /* renamed from: r, reason: collision with root package name */
    public byte[] f8415r;

    public C0873u7() {
        a();
    }

    public static C0873u7[] b() {
        if (f8399s == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8399s == null) {
                        f8399s = new C0873u7[0];
                    }
                } finally {
                }
            }
        }
        return f8399s;
    }

    public final C0873u7 a() {
        this.f8400a = -1;
        this.f8401b = "";
        this.f8402c = "";
        this.f8403d = -1L;
        this.f8404e = null;
        this.f = "";
        this.f8405g = "";
        this.f8406h = -1L;
        this.f8407i = -1;
        this.f8408j = -1;
        this.f8409k = "";
        this.f8410l = -1;
        this.f8411m = "";
        this.f8412n = -1;
        this.o = -1;
        this.f8413p = -1;
        this.f8414q = -1;
        this.f8415r = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i3 = this.f8400a;
        if (i3 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i3);
        }
        if (!this.f8401b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f8401b);
        }
        if (!this.f8402c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f8402c);
        }
        long j3 = this.f8403d;
        if (j3 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(4, j3);
        }
        C0899v7 c0899v7 = this.f8404e;
        if (c0899v7 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c0899v7);
        }
        if (!this.f.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f);
        }
        if (!this.f8405g.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(7, this.f8405g);
        }
        long j4 = this.f8406h;
        if (j4 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(8, j4);
        }
        int i4 = this.f8407i;
        if (i4 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(9, i4);
        }
        int i5 = this.f8408j;
        if (i5 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(10, i5);
        }
        if (!this.f8409k.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(11, this.f8409k);
        }
        int i6 = this.f8410l;
        if (i6 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(12, i6);
        }
        if (!this.f8411m.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(13, this.f8411m);
        }
        int i7 = this.f8412n;
        if (i7 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(14, i7);
        }
        int i8 = this.o;
        if (i8 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(15, i8);
        }
        int i9 = this.f8413p;
        if (i9 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(16, i9);
        }
        int i10 = this.f8414q;
        if (i10 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(17, i10);
        }
        return !Arrays.equals(this.f8415r, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(18, this.f8415r) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i3 = this.f8400a;
        if (i3 != -1) {
            codedOutputByteBufferNano.writeInt32(1, i3);
        }
        if (!this.f8401b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f8401b);
        }
        if (!this.f8402c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f8402c);
        }
        long j3 = this.f8403d;
        if (j3 != -1) {
            codedOutputByteBufferNano.writeInt64(4, j3);
        }
        C0899v7 c0899v7 = this.f8404e;
        if (c0899v7 != null) {
            codedOutputByteBufferNano.writeMessage(5, c0899v7);
        }
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f);
        }
        if (!this.f8405g.equals("")) {
            codedOutputByteBufferNano.writeString(7, this.f8405g);
        }
        long j4 = this.f8406h;
        if (j4 != -1) {
            codedOutputByteBufferNano.writeInt64(8, j4);
        }
        int i4 = this.f8407i;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeInt32(9, i4);
        }
        int i5 = this.f8408j;
        if (i5 != -1) {
            codedOutputByteBufferNano.writeInt32(10, i5);
        }
        if (!this.f8409k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f8409k);
        }
        int i6 = this.f8410l;
        if (i6 != -1) {
            codedOutputByteBufferNano.writeInt32(12, i6);
        }
        if (!this.f8411m.equals("")) {
            codedOutputByteBufferNano.writeString(13, this.f8411m);
        }
        int i7 = this.f8412n;
        if (i7 != -1) {
            codedOutputByteBufferNano.writeInt32(14, i7);
        }
        int i8 = this.o;
        if (i8 != -1) {
            codedOutputByteBufferNano.writeInt32(15, i8);
        }
        int i9 = this.f8413p;
        if (i9 != -1) {
            codedOutputByteBufferNano.writeInt32(16, i9);
        }
        int i10 = this.f8414q;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeInt32(17, i10);
        }
        if (!Arrays.equals(this.f8415r, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(18, this.f8415r);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0873u7 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0873u7().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0873u7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 8:
                    this.f8400a = codedInputByteBufferNano.readInt32();
                    break;
                case 18:
                    this.f8401b = codedInputByteBufferNano.readString();
                    break;
                case C0642l9.f7781G /* 26 */:
                    this.f8402c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    this.f8403d = codedInputByteBufferNano.readInt64();
                    break;
                case C0642l9.f7786M /* 42 */:
                    if (this.f8404e == null) {
                        this.f8404e = new C0899v7();
                    }
                    codedInputByteBufferNano.readMessage(this.f8404e);
                    break;
                case 50:
                    this.f = codedInputByteBufferNano.readString();
                    break;
                case 58:
                    this.f8405g = codedInputByteBufferNano.readString();
                    break;
                case BaseNCodec.PEM_CHUNK_SIZE /* 64 */:
                    this.f8406h = codedInputByteBufferNano.readInt64();
                    break;
                case 72:
                    this.f8407i = codedInputByteBufferNano.readInt32();
                    break;
                case 80:
                    this.f8408j = codedInputByteBufferNano.readInt32();
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    this.f8409k = codedInputByteBufferNano.readString();
                    break;
                case 96:
                    this.f8410l = codedInputByteBufferNano.readInt32();
                    break;
                case 106:
                    this.f8411m = codedInputByteBufferNano.readString();
                    break;
                case 112:
                    this.f8412n = codedInputByteBufferNano.readInt32();
                    break;
                case 120:
                    this.o = codedInputByteBufferNano.readInt32();
                    break;
                case 128:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.f8413p = readInt32;
                        break;
                    }
                case 136:
                    this.f8414q = codedInputByteBufferNano.readInt32();
                    break;
                case 146:
                    this.f8415r = codedInputByteBufferNano.readBytes();
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

    public static C0873u7 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0873u7) MessageNano.mergeFrom(new C0873u7(), bArr);
    }
}
