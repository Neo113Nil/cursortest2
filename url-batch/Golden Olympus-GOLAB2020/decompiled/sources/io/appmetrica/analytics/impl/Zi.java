package io.appmetrica.analytics.impl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class Zi extends MessageNano {

    /* renamed from: l, reason: collision with root package name */
    public static final int f38626l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f38627m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f38628n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f38629o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f38630p = 2;

    /* renamed from: q, reason: collision with root package name */
    public static volatile Zi[] f38631q;

    /* renamed from: a, reason: collision with root package name */
    public int f38632a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f38633b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f38634c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f38635d;

    /* renamed from: e, reason: collision with root package name */
    public Ui f38636e;

    /* renamed from: f, reason: collision with root package name */
    public long f38637f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f38638g;

    /* renamed from: h, reason: collision with root package name */
    public int f38639h;

    /* renamed from: i, reason: collision with root package name */
    public int f38640i;

    /* renamed from: j, reason: collision with root package name */
    public Yi f38641j;

    /* renamed from: k, reason: collision with root package name */
    public Xi f38642k;

    public Zi() {
        a();
    }

    public static Zi[] b() {
        if (f38631q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f38631q == null) {
                        f38631q = new Zi[0];
                    }
                } finally {
                }
            }
        }
        return f38631q;
    }

    public final Zi a() {
        this.f38632a = 1;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f38633b = bArr;
        this.f38634c = bArr;
        this.f38635d = bArr;
        this.f38636e = null;
        this.f38637f = 0L;
        this.f38638g = false;
        this.f38639h = 0;
        this.f38640i = 1;
        this.f38641j = null;
        this.f38642k = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i4 = this.f38632a;
        if (i4 != 1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i4);
        }
        int computeBytesSize = CodedOutputByteBufferNano.computeBytesSize(3, this.f38633b) + computeSerializedSize;
        byte[] bArr = this.f38634c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeBytesSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f38634c);
        }
        if (!Arrays.equals(this.f38635d, bArr2)) {
            computeBytesSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f38635d);
        }
        Ui ui = this.f38636e;
        if (ui != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(6, ui);
        }
        long j4 = this.f38637f;
        if (j4 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt64Size(7, j4);
        }
        boolean z4 = this.f38638g;
        if (z4) {
            computeBytesSize += CodedOutputByteBufferNano.computeBoolSize(8, z4);
        }
        int i5 = this.f38639h;
        if (i5 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt32Size(9, i5);
        }
        int i6 = this.f38640i;
        if (i6 != 1) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt32Size(10, i6);
        }
        Yi yi = this.f38641j;
        if (yi != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(11, yi);
        }
        Xi xi = this.f38642k;
        return xi != null ? CodedOutputByteBufferNano.computeMessageSize(12, xi) + computeBytesSize : computeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i4 = this.f38632a;
        if (i4 != 1) {
            codedOutputByteBufferNano.writeUInt32(1, i4);
        }
        codedOutputByteBufferNano.writeBytes(3, this.f38633b);
        byte[] bArr = this.f38634c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f38634c);
        }
        if (!Arrays.equals(this.f38635d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f38635d);
        }
        Ui ui = this.f38636e;
        if (ui != null) {
            codedOutputByteBufferNano.writeMessage(6, ui);
        }
        long j4 = this.f38637f;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeInt64(7, j4);
        }
        boolean z4 = this.f38638g;
        if (z4) {
            codedOutputByteBufferNano.writeBool(8, z4);
        }
        int i5 = this.f38639h;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeInt32(9, i5);
        }
        int i6 = this.f38640i;
        if (i6 != 1) {
            codedOutputByteBufferNano.writeInt32(10, i6);
        }
        Yi yi = this.f38641j;
        if (yi != null) {
            codedOutputByteBufferNano.writeMessage(11, yi);
        }
        Xi xi = this.f38642k;
        if (xi != null) {
            codedOutputByteBufferNano.writeMessage(12, xi);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Zi b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Zi().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Zi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 8:
                    this.f38632a = codedInputByteBufferNano.readUInt32();
                    break;
                case 26:
                    this.f38633b = codedInputByteBufferNano.readBytes();
                    break;
                case 34:
                    this.f38634c = codedInputByteBufferNano.readBytes();
                    break;
                case 42:
                    this.f38635d = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f38636e == null) {
                        this.f38636e = new Ui();
                    }
                    codedInputByteBufferNano.readMessage(this.f38636e);
                    break;
                case IronSourceConstants.REGISTER_TRIGGER_FAIL /* 56 */:
                    this.f38637f = codedInputByteBufferNano.readInt64();
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    this.f38638g = codedInputByteBufferNano.readBool();
                    break;
                case IronSourceConstants.TEST_SUITE_FAILED_TO_OPEN /* 72 */:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != 0 && readInt32 != 1 && readInt32 != 2) {
                        break;
                    } else {
                        this.f38639h = readInt32;
                        break;
                    }
                case 80:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 1 && readInt322 != 2) {
                        break;
                    } else {
                        this.f38640i = readInt322;
                        break;
                    }
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    if (this.f38641j == null) {
                        this.f38641j = new Yi();
                    }
                    codedInputByteBufferNano.readMessage(this.f38641j);
                    break;
                case 98:
                    if (this.f38642k == null) {
                        this.f38642k = new Xi();
                    }
                    codedInputByteBufferNano.readMessage(this.f38642k);
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

    public static Zi a(byte[] bArr) {
        return (Zi) MessageNano.mergeFrom(new Zi(), bArr);
    }
}
