package io.appmetrica.analytics.impl;

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

/* renamed from: io.appmetrica.analytics.impl.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0935s extends MessageNano {

    /* renamed from: l, reason: collision with root package name */
    public static final int f12691l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f12692m = 1;
    public static final int n = 2;
    public static final int o = 3;

    /* renamed from: p, reason: collision with root package name */
    public static final int f12693p = 4;

    /* renamed from: q, reason: collision with root package name */
    public static final int f12694q = 5;

    /* renamed from: r, reason: collision with root package name */
    public static final int f12695r = 6;

    /* renamed from: s, reason: collision with root package name */
    public static final int f12696s = 7;

    /* renamed from: t, reason: collision with root package name */
    public static volatile C0935s[] f12697t;

    /* renamed from: u, reason: collision with root package name */
    public static byte[] f12698u;
    public static volatile boolean v;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f12699a;

    /* renamed from: b, reason: collision with root package name */
    public r f12700b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f12701c;

    /* renamed from: d, reason: collision with root package name */
    public int f12702d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f12703e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f12704f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f12705g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f12706h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f12707i;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f12708j;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f12709k;

    public C0935s() {
        if (!v) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!v) {
                        f12698u = InternalNano.bytesDefaultValue("manual");
                        v = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static C0935s[] b() {
        if (f12697t == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12697t == null) {
                        f12697t = new C0935s[0];
                    }
                } finally {
                }
            }
        }
        return f12697t;
    }

    public final C0935s a() {
        this.f12699a = (byte[]) f12698u.clone();
        this.f12700b = null;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f12701c = bArr;
        this.f12702d = 0;
        this.f12703e = bArr;
        this.f12704f = bArr;
        this.f12705g = bArr;
        this.f12706h = bArr;
        this.f12707i = bArr;
        this.f12708j = bArr;
        this.f12709k = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f12699a, f12698u)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f12699a);
        }
        r rVar = this.f12700b;
        if (rVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, rVar);
        }
        byte[] bArr = this.f12701c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f12701c);
        }
        int i4 = this.f12702d;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i4);
        }
        if (!Arrays.equals(this.f12703e, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f12703e);
        }
        if (!Arrays.equals(this.f12704f, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(6, this.f12704f);
        }
        if (!Arrays.equals(this.f12705g, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(7, this.f12705g);
        }
        if (!Arrays.equals(this.f12706h, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f12706h);
        }
        if (!Arrays.equals(this.f12707i, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f12707i);
        }
        if (!Arrays.equals(this.f12708j, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.f12708j);
        }
        return !Arrays.equals(this.f12709k, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(11, this.f12709k) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f12699a, f12698u)) {
            codedOutputByteBufferNano.writeBytes(1, this.f12699a);
        }
        r rVar = this.f12700b;
        if (rVar != null) {
            codedOutputByteBufferNano.writeMessage(2, rVar);
        }
        byte[] bArr = this.f12701c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f12701c);
        }
        int i4 = this.f12702d;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i4);
        }
        if (!Arrays.equals(this.f12703e, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f12703e);
        }
        if (!Arrays.equals(this.f12704f, bArr2)) {
            codedOutputByteBufferNano.writeBytes(6, this.f12704f);
        }
        if (!Arrays.equals(this.f12705g, bArr2)) {
            codedOutputByteBufferNano.writeBytes(7, this.f12705g);
        }
        if (!Arrays.equals(this.f12706h, bArr2)) {
            codedOutputByteBufferNano.writeBytes(8, this.f12706h);
        }
        if (!Arrays.equals(this.f12707i, bArr2)) {
            codedOutputByteBufferNano.writeBytes(9, this.f12707i);
        }
        if (!Arrays.equals(this.f12708j, bArr2)) {
            codedOutputByteBufferNano.writeBytes(10, this.f12708j);
        }
        if (!Arrays.equals(this.f12709k, bArr2)) {
            codedOutputByteBufferNano.writeBytes(11, this.f12709k);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0935s b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0935s().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0935s mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    this.f12699a = codedInputByteBufferNano.readBytes();
                    break;
                case 18:
                    if (this.f12700b == null) {
                        this.f12700b = new r();
                    }
                    codedInputByteBufferNano.readMessage(this.f12700b);
                    break;
                case 26:
                    this.f12701c = codedInputByteBufferNano.readBytes();
                    break;
                case Build.API_LEVELS.API_32 /* 32 */:
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
                            this.f12702d = readInt32;
                            break;
                    }
                case C0583e9.f11752M /* 42 */:
                    this.f12703e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    this.f12704f = codedInputByteBufferNano.readBytes();
                    break;
                case 58:
                    this.f12705g = codedInputByteBufferNano.readBytes();
                    break;
                case 66:
                    this.f12706h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.f12707i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.f12708j = codedInputByteBufferNano.readBytes();
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    this.f12709k = codedInputByteBufferNano.readBytes();
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

    public static C0935s a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0935s) MessageNano.mergeFrom(new C0935s(), bArr);
    }
}
