package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0813s extends MessageNano {

    /* renamed from: l, reason: collision with root package name */
    public static final int f8259l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f8260m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f8261n = 2;
    public static final int o = 3;

    /* renamed from: p, reason: collision with root package name */
    public static final int f8262p = 4;

    /* renamed from: q, reason: collision with root package name */
    public static final int f8263q = 5;

    /* renamed from: r, reason: collision with root package name */
    public static final int f8264r = 6;

    /* renamed from: s, reason: collision with root package name */
    public static final int f8265s = 7;

    /* renamed from: t, reason: collision with root package name */
    public static volatile C0813s[] f8266t;

    /* renamed from: u, reason: collision with root package name */
    public static byte[] f8267u;
    public static volatile boolean v;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f8268a;

    /* renamed from: b, reason: collision with root package name */
    public r f8269b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f8270c;

    /* renamed from: d, reason: collision with root package name */
    public int f8271d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f8272e;
    public byte[] f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f8273g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f8274h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f8275i;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f8276j;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f8277k;

    public C0813s() {
        if (!v) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!v) {
                        f8267u = InternalNano.bytesDefaultValue("manual");
                        v = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static C0813s[] b() {
        if (f8266t == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8266t == null) {
                        f8266t = new C0813s[0];
                    }
                } finally {
                }
            }
        }
        return f8266t;
    }

    public final C0813s a() {
        this.f8268a = (byte[]) f8267u.clone();
        this.f8269b = null;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f8270c = bArr;
        this.f8271d = 0;
        this.f8272e = bArr;
        this.f = bArr;
        this.f8273g = bArr;
        this.f8274h = bArr;
        this.f8275i = bArr;
        this.f8276j = bArr;
        this.f8277k = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f8268a, f8267u)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f8268a);
        }
        r rVar = this.f8269b;
        if (rVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, rVar);
        }
        byte[] bArr = this.f8270c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f8270c);
        }
        int i3 = this.f8271d;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i3);
        }
        if (!Arrays.equals(this.f8272e, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f8272e);
        }
        if (!Arrays.equals(this.f, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(6, this.f);
        }
        if (!Arrays.equals(this.f8273g, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(7, this.f8273g);
        }
        if (!Arrays.equals(this.f8274h, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f8274h);
        }
        if (!Arrays.equals(this.f8275i, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f8275i);
        }
        if (!Arrays.equals(this.f8276j, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.f8276j);
        }
        return !Arrays.equals(this.f8277k, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(11, this.f8277k) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f8268a, f8267u)) {
            codedOutputByteBufferNano.writeBytes(1, this.f8268a);
        }
        r rVar = this.f8269b;
        if (rVar != null) {
            codedOutputByteBufferNano.writeMessage(2, rVar);
        }
        byte[] bArr = this.f8270c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f8270c);
        }
        int i3 = this.f8271d;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i3);
        }
        if (!Arrays.equals(this.f8272e, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f8272e);
        }
        if (!Arrays.equals(this.f, bArr2)) {
            codedOutputByteBufferNano.writeBytes(6, this.f);
        }
        if (!Arrays.equals(this.f8273g, bArr2)) {
            codedOutputByteBufferNano.writeBytes(7, this.f8273g);
        }
        if (!Arrays.equals(this.f8274h, bArr2)) {
            codedOutputByteBufferNano.writeBytes(8, this.f8274h);
        }
        if (!Arrays.equals(this.f8275i, bArr2)) {
            codedOutputByteBufferNano.writeBytes(9, this.f8275i);
        }
        if (!Arrays.equals(this.f8276j, bArr2)) {
            codedOutputByteBufferNano.writeBytes(10, this.f8276j);
        }
        if (!Arrays.equals(this.f8277k, bArr2)) {
            codedOutputByteBufferNano.writeBytes(11, this.f8277k);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0813s b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0813s().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0813s mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    this.f8268a = codedInputByteBufferNano.readBytes();
                    break;
                case 18:
                    if (this.f8269b == null) {
                        this.f8269b = new r();
                    }
                    codedInputByteBufferNano.readMessage(this.f8269b);
                    break;
                case C0642l9.f7781G /* 26 */:
                    this.f8270c = codedInputByteBufferNano.readBytes();
                    break;
                case 32:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    switch (readInt32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f8271d = readInt32;
                            break;
                    }
                case C0642l9.f7786M /* 42 */:
                    this.f8272e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    this.f = codedInputByteBufferNano.readBytes();
                    break;
                case 58:
                    this.f8273g = codedInputByteBufferNano.readBytes();
                    break;
                case 66:
                    this.f8274h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.f8275i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.f8276j = codedInputByteBufferNano.readBytes();
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    this.f8277k = codedInputByteBufferNano.readBytes();
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

    public static C0813s a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0813s) MessageNano.mergeFrom(new C0813s(), bArr);
    }
}
