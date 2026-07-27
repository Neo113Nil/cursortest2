package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.impl.C0793l9;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class z extends MessageNano {

    /* renamed from: l, reason: collision with root package name */
    public static final int f6018l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f6019m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f6020n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f6021o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f6022p = 2;

    /* renamed from: q, reason: collision with root package name */
    public static volatile z[] f6023q;

    /* renamed from: a, reason: collision with root package name */
    public int f6024a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f6025b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f6026c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f6027d;

    /* renamed from: e, reason: collision with root package name */
    public u f6028e;

    /* renamed from: f, reason: collision with root package name */
    public long f6029f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6030g;

    /* renamed from: h, reason: collision with root package name */
    public int f6031h;

    /* renamed from: i, reason: collision with root package name */
    public int f6032i;

    /* renamed from: j, reason: collision with root package name */
    public y f6033j;

    /* renamed from: k, reason: collision with root package name */
    public x f6034k;

    public z() {
        a();
    }

    public static z[] b() {
        if (f6023q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6023q == null) {
                        f6023q = new z[0];
                    }
                } finally {
                }
            }
        }
        return f6023q;
    }

    public final z a() {
        this.f6024a = 1;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f6025b = bArr;
        this.f6026c = bArr;
        this.f6027d = bArr;
        this.f6028e = null;
        this.f6029f = 0L;
        this.f6030g = false;
        this.f6031h = 0;
        this.f6032i = 1;
        this.f6033j = null;
        this.f6034k = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f6024a;
        if (i2 != 1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i2);
        }
        int computeBytesSize = CodedOutputByteBufferNano.computeBytesSize(3, this.f6025b) + computeSerializedSize;
        byte[] bArr = this.f6026c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeBytesSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f6026c);
        }
        if (!Arrays.equals(this.f6027d, bArr2)) {
            computeBytesSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f6027d);
        }
        u uVar = this.f6028e;
        if (uVar != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(6, uVar);
        }
        long j2 = this.f6029f;
        if (j2 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt64Size(7, j2);
        }
        boolean z = this.f6030g;
        if (z) {
            computeBytesSize += CodedOutputByteBufferNano.computeBoolSize(8, z);
        }
        int i3 = this.f6031h;
        if (i3 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt32Size(9, i3);
        }
        int i6 = this.f6032i;
        if (i6 != 1) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt32Size(10, i6);
        }
        y yVar = this.f6033j;
        if (yVar != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(11, yVar);
        }
        x xVar = this.f6034k;
        return xVar != null ? computeBytesSize + CodedOutputByteBufferNano.computeMessageSize(12, xVar) : computeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f6024a;
        if (i2 != 1) {
            codedOutputByteBufferNano.writeUInt32(1, i2);
        }
        codedOutputByteBufferNano.writeBytes(3, this.f6025b);
        byte[] bArr = this.f6026c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f6026c);
        }
        if (!Arrays.equals(this.f6027d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f6027d);
        }
        u uVar = this.f6028e;
        if (uVar != null) {
            codedOutputByteBufferNano.writeMessage(6, uVar);
        }
        long j2 = this.f6029f;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeInt64(7, j2);
        }
        boolean z = this.f6030g;
        if (z) {
            codedOutputByteBufferNano.writeBool(8, z);
        }
        int i3 = this.f6031h;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeInt32(9, i3);
        }
        int i6 = this.f6032i;
        if (i6 != 1) {
            codedOutputByteBufferNano.writeInt32(10, i6);
        }
        y yVar = this.f6033j;
        if (yVar != null) {
            codedOutputByteBufferNano.writeMessage(11, yVar);
        }
        x xVar = this.f6034k;
        if (xVar != null) {
            codedOutputByteBufferNano.writeMessage(12, xVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static z b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new z().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final z mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 8:
                    this.f6024a = codedInputByteBufferNano.readUInt32();
                    break;
                case 26:
                    this.f6025b = codedInputByteBufferNano.readBytes();
                    break;
                case 34:
                    this.f6026c = codedInputByteBufferNano.readBytes();
                    break;
                case C0793l9.f8691M /* 42 */:
                    this.f6027d = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f6028e == null) {
                        this.f6028e = new u();
                    }
                    codedInputByteBufferNano.readMessage(this.f6028e);
                    break;
                case 56:
                    this.f6029f = codedInputByteBufferNano.readInt64();
                    break;
                case 64:
                    this.f6030g = codedInputByteBufferNano.readBool();
                    break;
                case 72:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != 0 && readInt32 != 1 && readInt32 != 2) {
                        break;
                    } else {
                        this.f6031h = readInt32;
                        break;
                    }
                case 80:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 1 && readInt322 != 2) {
                        break;
                    } else {
                        this.f6032i = readInt322;
                        break;
                    }
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    if (this.f6033j == null) {
                        this.f6033j = new y();
                    }
                    codedInputByteBufferNano.readMessage(this.f6033j);
                    break;
                case 98:
                    if (this.f6034k == null) {
                        this.f6034k = new x();
                    }
                    codedInputByteBufferNano.readMessage(this.f6034k);
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static z a(byte[] bArr) {
        return (z) MessageNano.mergeFrom(new z(), bArr);
    }
}
