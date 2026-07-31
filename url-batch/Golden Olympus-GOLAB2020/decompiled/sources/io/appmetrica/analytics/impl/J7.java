package io.appmetrica.analytics.impl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes3.dex */
public final class J7 extends MessageNano {

    /* renamed from: k, reason: collision with root package name */
    public static volatile J7[] f37810k;

    /* renamed from: a, reason: collision with root package name */
    public int f37811a;

    /* renamed from: b, reason: collision with root package name */
    public double f37812b;

    /* renamed from: c, reason: collision with root package name */
    public double f37813c;

    /* renamed from: d, reason: collision with root package name */
    public int f37814d;

    /* renamed from: e, reason: collision with root package name */
    public int f37815e;

    /* renamed from: f, reason: collision with root package name */
    public int f37816f;

    /* renamed from: g, reason: collision with root package name */
    public int f37817g;

    /* renamed from: h, reason: collision with root package name */
    public long f37818h;

    /* renamed from: i, reason: collision with root package name */
    public String f37819i;

    /* renamed from: j, reason: collision with root package name */
    public String f37820j;

    public J7() {
        a();
    }

    public static J7[] b() {
        if (f37810k == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f37810k == null) {
                        f37810k = new J7[0];
                    }
                } finally {
                }
            }
        }
        return f37810k;
    }

    public final J7 a() {
        this.f37811a = -1;
        this.f37812b = -1.0d;
        this.f37813c = -1.0d;
        this.f37814d = -1;
        this.f37815e = -1;
        this.f37816f = -1;
        this.f37817g = -1;
        this.f37818h = -1L;
        this.f37819i = "";
        this.f37820j = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i4 = this.f37811a;
        if (i4 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i4);
        }
        if (Double.doubleToLongBits(this.f37812b) != Double.doubleToLongBits(-1.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f37812b);
        }
        if (Double.doubleToLongBits(this.f37813c) != Double.doubleToLongBits(-1.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f37813c);
        }
        int i5 = this.f37814d;
        if (i5 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i5);
        }
        int i6 = this.f37815e;
        if (i6 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(5, i6);
        }
        int i7 = this.f37816f;
        if (i7 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i7);
        }
        int i8 = this.f37817g;
        if (i8 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i8);
        }
        long j4 = this.f37818h;
        if (j4 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(8, j4);
        }
        if (!this.f37819i.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(9, this.f37819i);
        }
        return !this.f37820j.equals("") ? CodedOutputByteBufferNano.computeStringSize(10, this.f37820j) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i4 = this.f37811a;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeInt32(1, i4);
        }
        if (Double.doubleToLongBits(this.f37812b) != Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.f37812b);
        }
        if (Double.doubleToLongBits(this.f37813c) != Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.writeDouble(3, this.f37813c);
        }
        int i5 = this.f37814d;
        if (i5 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i5);
        }
        int i6 = this.f37815e;
        if (i6 != -1) {
            codedOutputByteBufferNano.writeInt32(5, i6);
        }
        int i7 = this.f37816f;
        if (i7 != -1) {
            codedOutputByteBufferNano.writeInt32(6, i7);
        }
        int i8 = this.f37817g;
        if (i8 != -1) {
            codedOutputByteBufferNano.writeInt32(7, i8);
        }
        long j4 = this.f37818h;
        if (j4 != -1) {
            codedOutputByteBufferNano.writeInt64(8, j4);
        }
        if (!this.f37819i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f37819i);
        }
        if (!this.f37820j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f37820j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static J7 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new J7().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                        this.f37811a = readInt32;
                        break;
                    }
                case 17:
                    this.f37812b = codedInputByteBufferNano.readDouble();
                    break;
                case 25:
                    this.f37813c = codedInputByteBufferNano.readDouble();
                    break;
                case 32:
                    this.f37814d = codedInputByteBufferNano.readInt32();
                    break;
                case 40:
                    this.f37815e = codedInputByteBufferNano.readInt32();
                    break;
                case 48:
                    this.f37816f = codedInputByteBufferNano.readInt32();
                    break;
                case IronSourceConstants.REGISTER_TRIGGER_FAIL /* 56 */:
                    this.f37817g = codedInputByteBufferNano.readInt32();
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    this.f37818h = codedInputByteBufferNano.readInt64();
                    break;
                case IronSourceConstants.TEST_SUITE_WEB_CONTROLLER_FAILED_TO_LOAD /* 74 */:
                    this.f37819i = codedInputByteBufferNano.readString();
                    break;
                case IronSourceConstants.TROUBLESHOOTING_AD_QUALITY_SDK_WAS_ALREADY_INITIALIZED_EVENT /* 82 */:
                    this.f37820j = codedInputByteBufferNano.readString();
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

    public static J7 a(byte[] bArr) {
        return (J7) MessageNano.mergeFrom(new J7(), bArr);
    }
}
