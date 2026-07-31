package io.appmetrica.analytics.impl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.InterfaceC1490j3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class I7 extends MessageNano {

    /* renamed from: s, reason: collision with root package name */
    public static volatile I7[] f37707s;

    /* renamed from: a, reason: collision with root package name */
    public int f37708a;

    /* renamed from: b, reason: collision with root package name */
    public String f37709b;

    /* renamed from: c, reason: collision with root package name */
    public String f37710c;

    /* renamed from: d, reason: collision with root package name */
    public long f37711d;

    /* renamed from: e, reason: collision with root package name */
    public J7 f37712e;

    /* renamed from: f, reason: collision with root package name */
    public String f37713f;

    /* renamed from: g, reason: collision with root package name */
    public String f37714g;

    /* renamed from: h, reason: collision with root package name */
    public long f37715h;

    /* renamed from: i, reason: collision with root package name */
    public int f37716i;

    /* renamed from: j, reason: collision with root package name */
    public int f37717j;

    /* renamed from: k, reason: collision with root package name */
    public String f37718k;

    /* renamed from: l, reason: collision with root package name */
    public int f37719l;

    /* renamed from: m, reason: collision with root package name */
    public String f37720m;

    /* renamed from: n, reason: collision with root package name */
    public int f37721n;

    /* renamed from: o, reason: collision with root package name */
    public int f37722o;

    /* renamed from: p, reason: collision with root package name */
    public int f37723p;

    /* renamed from: q, reason: collision with root package name */
    public int f37724q;

    /* renamed from: r, reason: collision with root package name */
    public byte[] f37725r;

    public I7() {
        a();
    }

    public static I7[] b() {
        if (f37707s == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f37707s == null) {
                        f37707s = new I7[0];
                    }
                } finally {
                }
            }
        }
        return f37707s;
    }

    public final I7 a() {
        this.f37708a = -1;
        this.f37709b = "";
        this.f37710c = "";
        this.f37711d = -1L;
        this.f37712e = null;
        this.f37713f = "";
        this.f37714g = "";
        this.f37715h = -1L;
        this.f37716i = -1;
        this.f37717j = -1;
        this.f37718k = "";
        this.f37719l = -1;
        this.f37720m = "";
        this.f37721n = -1;
        this.f37722o = -1;
        this.f37723p = -1;
        this.f37724q = -1;
        this.f37725r = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i4 = this.f37708a;
        if (i4 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i4);
        }
        if (!this.f37709b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f37709b);
        }
        if (!this.f37710c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f37710c);
        }
        long j4 = this.f37711d;
        if (j4 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(4, j4);
        }
        J7 j7 = this.f37712e;
        if (j7 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, j7);
        }
        if (!this.f37713f.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f37713f);
        }
        if (!this.f37714g.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(7, this.f37714g);
        }
        long j5 = this.f37715h;
        if (j5 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(8, j5);
        }
        int i5 = this.f37716i;
        if (i5 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(9, i5);
        }
        int i6 = this.f37717j;
        if (i6 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(10, i6);
        }
        if (!this.f37718k.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(11, this.f37718k);
        }
        int i7 = this.f37719l;
        if (i7 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(12, i7);
        }
        if (!this.f37720m.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(13, this.f37720m);
        }
        int i8 = this.f37721n;
        if (i8 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(14, i8);
        }
        int i9 = this.f37722o;
        if (i9 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(15, i9);
        }
        int i10 = this.f37723p;
        if (i10 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(16, i10);
        }
        int i11 = this.f37724q;
        if (i11 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(17, i11);
        }
        return !Arrays.equals(this.f37725r, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(18, this.f37725r) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i4 = this.f37708a;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeInt32(1, i4);
        }
        if (!this.f37709b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f37709b);
        }
        if (!this.f37710c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f37710c);
        }
        long j4 = this.f37711d;
        if (j4 != -1) {
            codedOutputByteBufferNano.writeInt64(4, j4);
        }
        J7 j7 = this.f37712e;
        if (j7 != null) {
            codedOutputByteBufferNano.writeMessage(5, j7);
        }
        if (!this.f37713f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f37713f);
        }
        if (!this.f37714g.equals("")) {
            codedOutputByteBufferNano.writeString(7, this.f37714g);
        }
        long j5 = this.f37715h;
        if (j5 != -1) {
            codedOutputByteBufferNano.writeInt64(8, j5);
        }
        int i5 = this.f37716i;
        if (i5 != -1) {
            codedOutputByteBufferNano.writeInt32(9, i5);
        }
        int i6 = this.f37717j;
        if (i6 != -1) {
            codedOutputByteBufferNano.writeInt32(10, i6);
        }
        if (!this.f37718k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f37718k);
        }
        int i7 = this.f37719l;
        if (i7 != -1) {
            codedOutputByteBufferNano.writeInt32(12, i7);
        }
        if (!this.f37720m.equals("")) {
            codedOutputByteBufferNano.writeString(13, this.f37720m);
        }
        int i8 = this.f37721n;
        if (i8 != -1) {
            codedOutputByteBufferNano.writeInt32(14, i8);
        }
        int i9 = this.f37722o;
        if (i9 != -1) {
            codedOutputByteBufferNano.writeInt32(15, i9);
        }
        int i10 = this.f37723p;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeInt32(16, i10);
        }
        int i11 = this.f37724q;
        if (i11 != -1) {
            codedOutputByteBufferNano.writeInt32(17, i11);
        }
        if (!Arrays.equals(this.f37725r, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(18, this.f37725r);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static I7 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new I7().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final I7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 8:
                    this.f37708a = codedInputByteBufferNano.readInt32();
                    break;
                case 18:
                    this.f37709b = codedInputByteBufferNano.readString();
                    break;
                case 26:
                    this.f37710c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    this.f37711d = codedInputByteBufferNano.readInt64();
                    break;
                case 42:
                    if (this.f37712e == null) {
                        this.f37712e = new J7();
                    }
                    codedInputByteBufferNano.readMessage(this.f37712e);
                    break;
                case 50:
                    this.f37713f = codedInputByteBufferNano.readString();
                    break;
                case 58:
                    this.f37714g = codedInputByteBufferNano.readString();
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    this.f37715h = codedInputByteBufferNano.readInt64();
                    break;
                case IronSourceConstants.TEST_SUITE_FAILED_TO_OPEN /* 72 */:
                    this.f37716i = codedInputByteBufferNano.readInt32();
                    break;
                case 80:
                    this.f37717j = codedInputByteBufferNano.readInt32();
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    this.f37718k = codedInputByteBufferNano.readString();
                    break;
                case 96:
                    this.f37719l = codedInputByteBufferNano.readInt32();
                    break;
                case 106:
                    this.f37720m = codedInputByteBufferNano.readString();
                    break;
                case InterfaceC1490j3.d.b.f16818j /* 112 */:
                    this.f37721n = codedInputByteBufferNano.readInt32();
                    break;
                case 120:
                    this.f37722o = codedInputByteBufferNano.readInt32();
                    break;
                case UserVerificationMethods.USER_VERIFY_PATTERN /* 128 */:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.f37723p = readInt32;
                        break;
                    }
                case 136:
                    this.f37724q = codedInputByteBufferNano.readInt32();
                    break;
                case 146:
                    this.f37725r = codedInputByteBufferNano.readBytes();
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

    public static I7 a(byte[] bArr) {
        return (I7) MessageNano.mergeFrom(new I7(), bArr);
    }
}
