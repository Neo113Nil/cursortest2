package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.u7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1024u7 extends MessageNano {

    /* renamed from: s, reason: collision with root package name */
    public static volatile C1024u7[] f9343s;

    /* renamed from: a, reason: collision with root package name */
    public int f9344a;

    /* renamed from: b, reason: collision with root package name */
    public String f9345b;

    /* renamed from: c, reason: collision with root package name */
    public String f9346c;

    /* renamed from: d, reason: collision with root package name */
    public long f9347d;

    /* renamed from: e, reason: collision with root package name */
    public C1050v7 f9348e;

    /* renamed from: f, reason: collision with root package name */
    public String f9349f;

    /* renamed from: g, reason: collision with root package name */
    public String f9350g;

    /* renamed from: h, reason: collision with root package name */
    public long f9351h;

    /* renamed from: i, reason: collision with root package name */
    public int f9352i;

    /* renamed from: j, reason: collision with root package name */
    public int f9353j;

    /* renamed from: k, reason: collision with root package name */
    public String f9354k;

    /* renamed from: l, reason: collision with root package name */
    public int f9355l;

    /* renamed from: m, reason: collision with root package name */
    public String f9356m;

    /* renamed from: n, reason: collision with root package name */
    public int f9357n;

    /* renamed from: o, reason: collision with root package name */
    public int f9358o;

    /* renamed from: p, reason: collision with root package name */
    public int f9359p;

    /* renamed from: q, reason: collision with root package name */
    public int f9360q;

    /* renamed from: r, reason: collision with root package name */
    public byte[] f9361r;

    public C1024u7() {
        a();
    }

    public static C1024u7[] b() {
        if (f9343s == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9343s == null) {
                        f9343s = new C1024u7[0];
                    }
                } finally {
                }
            }
        }
        return f9343s;
    }

    public final C1024u7 a() {
        this.f9344a = -1;
        this.f9345b = "";
        this.f9346c = "";
        this.f9347d = -1L;
        this.f9348e = null;
        this.f9349f = "";
        this.f9350g = "";
        this.f9351h = -1L;
        this.f9352i = -1;
        this.f9353j = -1;
        this.f9354k = "";
        this.f9355l = -1;
        this.f9356m = "";
        this.f9357n = -1;
        this.f9358o = -1;
        this.f9359p = -1;
        this.f9360q = -1;
        this.f9361r = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f9344a;
        if (i2 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i2);
        }
        if (!this.f9345b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f9345b);
        }
        if (!this.f9346c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f9346c);
        }
        long j2 = this.f9347d;
        if (j2 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(4, j2);
        }
        C1050v7 c1050v7 = this.f9348e;
        if (c1050v7 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c1050v7);
        }
        if (!this.f9349f.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f9349f);
        }
        if (!this.f9350g.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(7, this.f9350g);
        }
        long j6 = this.f9351h;
        if (j6 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(8, j6);
        }
        int i3 = this.f9352i;
        if (i3 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(9, i3);
        }
        int i6 = this.f9353j;
        if (i6 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(10, i6);
        }
        if (!this.f9354k.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(11, this.f9354k);
        }
        int i7 = this.f9355l;
        if (i7 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(12, i7);
        }
        if (!this.f9356m.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(13, this.f9356m);
        }
        int i8 = this.f9357n;
        if (i8 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(14, i8);
        }
        int i9 = this.f9358o;
        if (i9 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(15, i9);
        }
        int i10 = this.f9359p;
        if (i10 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(16, i10);
        }
        int i11 = this.f9360q;
        if (i11 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(17, i11);
        }
        return !Arrays.equals(this.f9361r, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(18, this.f9361r) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f9344a;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeInt32(1, i2);
        }
        if (!this.f9345b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f9345b);
        }
        if (!this.f9346c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f9346c);
        }
        long j2 = this.f9347d;
        if (j2 != -1) {
            codedOutputByteBufferNano.writeInt64(4, j2);
        }
        C1050v7 c1050v7 = this.f9348e;
        if (c1050v7 != null) {
            codedOutputByteBufferNano.writeMessage(5, c1050v7);
        }
        if (!this.f9349f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f9349f);
        }
        if (!this.f9350g.equals("")) {
            codedOutputByteBufferNano.writeString(7, this.f9350g);
        }
        long j6 = this.f9351h;
        if (j6 != -1) {
            codedOutputByteBufferNano.writeInt64(8, j6);
        }
        int i3 = this.f9352i;
        if (i3 != -1) {
            codedOutputByteBufferNano.writeInt32(9, i3);
        }
        int i6 = this.f9353j;
        if (i6 != -1) {
            codedOutputByteBufferNano.writeInt32(10, i6);
        }
        if (!this.f9354k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f9354k);
        }
        int i7 = this.f9355l;
        if (i7 != -1) {
            codedOutputByteBufferNano.writeInt32(12, i7);
        }
        if (!this.f9356m.equals("")) {
            codedOutputByteBufferNano.writeString(13, this.f9356m);
        }
        int i8 = this.f9357n;
        if (i8 != -1) {
            codedOutputByteBufferNano.writeInt32(14, i8);
        }
        int i9 = this.f9358o;
        if (i9 != -1) {
            codedOutputByteBufferNano.writeInt32(15, i9);
        }
        int i10 = this.f9359p;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeInt32(16, i10);
        }
        int i11 = this.f9360q;
        if (i11 != -1) {
            codedOutputByteBufferNano.writeInt32(17, i11);
        }
        if (!Arrays.equals(this.f9361r, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(18, this.f9361r);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C1024u7 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1024u7().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1024u7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 8:
                    this.f9344a = codedInputByteBufferNano.readInt32();
                    break;
                case 18:
                    this.f9345b = codedInputByteBufferNano.readString();
                    break;
                case 26:
                    this.f9346c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    this.f9347d = codedInputByteBufferNano.readInt64();
                    break;
                case C0793l9.f8691M /* 42 */:
                    if (this.f9348e == null) {
                        this.f9348e = new C1050v7();
                    }
                    codedInputByteBufferNano.readMessage(this.f9348e);
                    break;
                case 50:
                    this.f9349f = codedInputByteBufferNano.readString();
                    break;
                case 58:
                    this.f9350g = codedInputByteBufferNano.readString();
                    break;
                case 64:
                    this.f9351h = codedInputByteBufferNano.readInt64();
                    break;
                case 72:
                    this.f9352i = codedInputByteBufferNano.readInt32();
                    break;
                case 80:
                    this.f9353j = codedInputByteBufferNano.readInt32();
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    this.f9354k = codedInputByteBufferNano.readString();
                    break;
                case 96:
                    this.f9355l = codedInputByteBufferNano.readInt32();
                    break;
                case 106:
                    this.f9356m = codedInputByteBufferNano.readString();
                    break;
                case 112:
                    this.f9357n = codedInputByteBufferNano.readInt32();
                    break;
                case 120:
                    this.f9358o = codedInputByteBufferNano.readInt32();
                    break;
                case 128:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.f9359p = readInt32;
                        break;
                    }
                case 136:
                    this.f9360q = codedInputByteBufferNano.readInt32();
                    break;
                case 146:
                    this.f9361r = codedInputByteBufferNano.readBytes();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static C1024u7 a(byte[] bArr) {
        return (C1024u7) MessageNano.mergeFrom(new C1024u7(), bArr);
    }
}
