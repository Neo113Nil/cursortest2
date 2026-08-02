package io.appmetrica.analytics.billing.impl;

import com.startapp.simple.bloomfilter.codec.BaseNCodec;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.impl.C0583e9;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import io.flutter.Build;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class z extends MessageNano {

    /* renamed from: l, reason: collision with root package name */
    public static final int f9509l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f9510m = 1;
    public static final int n = 2;
    public static final int o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f9511p = 2;

    /* renamed from: q, reason: collision with root package name */
    public static volatile z[] f9512q;

    /* renamed from: a, reason: collision with root package name */
    public int f9513a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f9514b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f9515c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f9516d;

    /* renamed from: e, reason: collision with root package name */
    public u f9517e;

    /* renamed from: f, reason: collision with root package name */
    public long f9518f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9519g;

    /* renamed from: h, reason: collision with root package name */
    public int f9520h;

    /* renamed from: i, reason: collision with root package name */
    public int f9521i;

    /* renamed from: j, reason: collision with root package name */
    public y f9522j;

    /* renamed from: k, reason: collision with root package name */
    public x f9523k;

    public z() {
        a();
    }

    public static z[] b() {
        if (f9512q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9512q == null) {
                        f9512q = new z[0];
                    }
                } finally {
                }
            }
        }
        return f9512q;
    }

    public final z a() {
        this.f9513a = 1;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f9514b = bArr;
        this.f9515c = bArr;
        this.f9516d = bArr;
        this.f9517e = null;
        this.f9518f = 0L;
        this.f9519g = false;
        this.f9520h = 0;
        this.f9521i = 1;
        this.f9522j = null;
        this.f9523k = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i4 = this.f9513a;
        if (i4 != 1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i4);
        }
        int computeBytesSize = CodedOutputByteBufferNano.computeBytesSize(3, this.f9514b) + computeSerializedSize;
        byte[] bArr = this.f9515c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeBytesSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f9515c);
        }
        if (!Arrays.equals(this.f9516d, bArr2)) {
            computeBytesSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f9516d);
        }
        u uVar = this.f9517e;
        if (uVar != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(6, uVar);
        }
        long j4 = this.f9518f;
        if (j4 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt64Size(7, j4);
        }
        boolean z = this.f9519g;
        if (z) {
            computeBytesSize += CodedOutputByteBufferNano.computeBoolSize(8, z);
        }
        int i5 = this.f9520h;
        if (i5 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt32Size(9, i5);
        }
        int i6 = this.f9521i;
        if (i6 != 1) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt32Size(10, i6);
        }
        y yVar = this.f9522j;
        if (yVar != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(11, yVar);
        }
        x xVar = this.f9523k;
        return xVar != null ? CodedOutputByteBufferNano.computeMessageSize(12, xVar) + computeBytesSize : computeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i4 = this.f9513a;
        if (i4 != 1) {
            codedOutputByteBufferNano.writeUInt32(1, i4);
        }
        codedOutputByteBufferNano.writeBytes(3, this.f9514b);
        byte[] bArr = this.f9515c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f9515c);
        }
        if (!Arrays.equals(this.f9516d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f9516d);
        }
        u uVar = this.f9517e;
        if (uVar != null) {
            codedOutputByteBufferNano.writeMessage(6, uVar);
        }
        long j4 = this.f9518f;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeInt64(7, j4);
        }
        boolean z = this.f9519g;
        if (z) {
            codedOutputByteBufferNano.writeBool(8, z);
        }
        int i5 = this.f9520h;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeInt32(9, i5);
        }
        int i6 = this.f9521i;
        if (i6 != 1) {
            codedOutputByteBufferNano.writeInt32(10, i6);
        }
        y yVar = this.f9522j;
        if (yVar != null) {
            codedOutputByteBufferNano.writeMessage(11, yVar);
        }
        x xVar = this.f9523k;
        if (xVar != null) {
            codedOutputByteBufferNano.writeMessage(12, xVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static z b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new z().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final z mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 8:
                    this.f9513a = codedInputByteBufferNano.readUInt32();
                    break;
                case 26:
                    this.f9514b = codedInputByteBufferNano.readBytes();
                    break;
                case Build.API_LEVELS.API_34 /* 34 */:
                    this.f9515c = codedInputByteBufferNano.readBytes();
                    break;
                case C0583e9.f11752M /* 42 */:
                    this.f9516d = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f9517e == null) {
                        this.f9517e = new u();
                    }
                    codedInputByteBufferNano.readMessage(this.f9517e);
                    break;
                case 56:
                    this.f9518f = codedInputByteBufferNano.readInt64();
                    break;
                case BaseNCodec.PEM_CHUNK_SIZE /* 64 */:
                    this.f9519g = codedInputByteBufferNano.readBool();
                    break;
                case 72:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != 0 && readInt32 != 1 && readInt32 != 2) {
                        break;
                    } else {
                        this.f9520h = readInt32;
                        break;
                    }
                case 80:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 1 && readInt322 != 2) {
                        break;
                    } else {
                        this.f9521i = readInt322;
                        break;
                    }
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    if (this.f9522j == null) {
                        this.f9522j = new y();
                    }
                    codedInputByteBufferNano.readMessage(this.f9522j);
                    break;
                case 98:
                    if (this.f9523k == null) {
                        this.f9523k = new x();
                    }
                    codedInputByteBufferNano.readMessage(this.f9523k);
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

    public static z a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (z) MessageNano.mergeFrom(new z(), bArr);
    }
}
