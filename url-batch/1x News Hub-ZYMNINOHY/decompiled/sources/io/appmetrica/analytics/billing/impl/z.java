package io.appmetrica.analytics.billing.impl;

import com.startapp.simple.bloomfilter.codec.BaseNCodec;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.impl.C0642l9;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class z extends MessageNano {

    /* renamed from: l, reason: collision with root package name */
    public static final int f5265l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f5266m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f5267n = 2;
    public static final int o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f5268p = 2;

    /* renamed from: q, reason: collision with root package name */
    public static volatile z[] f5269q;

    /* renamed from: a, reason: collision with root package name */
    public int f5270a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f5271b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f5272c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f5273d;

    /* renamed from: e, reason: collision with root package name */
    public u f5274e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5275g;

    /* renamed from: h, reason: collision with root package name */
    public int f5276h;

    /* renamed from: i, reason: collision with root package name */
    public int f5277i;

    /* renamed from: j, reason: collision with root package name */
    public y f5278j;

    /* renamed from: k, reason: collision with root package name */
    public x f5279k;

    public z() {
        a();
    }

    public static z[] b() {
        if (f5269q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5269q == null) {
                        f5269q = new z[0];
                    }
                } finally {
                }
            }
        }
        return f5269q;
    }

    public final z a() {
        this.f5270a = 1;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f5271b = bArr;
        this.f5272c = bArr;
        this.f5273d = bArr;
        this.f5274e = null;
        this.f = 0L;
        this.f5275g = false;
        this.f5276h = 0;
        this.f5277i = 1;
        this.f5278j = null;
        this.f5279k = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i3 = this.f5270a;
        if (i3 != 1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i3);
        }
        int computeBytesSize = CodedOutputByteBufferNano.computeBytesSize(3, this.f5271b) + computeSerializedSize;
        byte[] bArr = this.f5272c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeBytesSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f5272c);
        }
        if (!Arrays.equals(this.f5273d, bArr2)) {
            computeBytesSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f5273d);
        }
        u uVar = this.f5274e;
        if (uVar != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(6, uVar);
        }
        long j3 = this.f;
        if (j3 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt64Size(7, j3);
        }
        boolean z = this.f5275g;
        if (z) {
            computeBytesSize += CodedOutputByteBufferNano.computeBoolSize(8, z);
        }
        int i4 = this.f5276h;
        if (i4 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt32Size(9, i4);
        }
        int i5 = this.f5277i;
        if (i5 != 1) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt32Size(10, i5);
        }
        y yVar = this.f5278j;
        if (yVar != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(11, yVar);
        }
        x xVar = this.f5279k;
        return xVar != null ? CodedOutputByteBufferNano.computeMessageSize(12, xVar) + computeBytesSize : computeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i3 = this.f5270a;
        if (i3 != 1) {
            codedOutputByteBufferNano.writeUInt32(1, i3);
        }
        codedOutputByteBufferNano.writeBytes(3, this.f5271b);
        byte[] bArr = this.f5272c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f5272c);
        }
        if (!Arrays.equals(this.f5273d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f5273d);
        }
        u uVar = this.f5274e;
        if (uVar != null) {
            codedOutputByteBufferNano.writeMessage(6, uVar);
        }
        long j3 = this.f;
        if (j3 != 0) {
            codedOutputByteBufferNano.writeInt64(7, j3);
        }
        boolean z = this.f5275g;
        if (z) {
            codedOutputByteBufferNano.writeBool(8, z);
        }
        int i4 = this.f5276h;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(9, i4);
        }
        int i5 = this.f5277i;
        if (i5 != 1) {
            codedOutputByteBufferNano.writeInt32(10, i5);
        }
        y yVar = this.f5278j;
        if (yVar != null) {
            codedOutputByteBufferNano.writeMessage(11, yVar);
        }
        x xVar = this.f5279k;
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
                    this.f5270a = codedInputByteBufferNano.readUInt32();
                    break;
                case C0642l9.f7781G /* 26 */:
                    this.f5271b = codedInputByteBufferNano.readBytes();
                    break;
                case 34:
                    this.f5272c = codedInputByteBufferNano.readBytes();
                    break;
                case C0642l9.f7786M /* 42 */:
                    this.f5273d = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f5274e == null) {
                        this.f5274e = new u();
                    }
                    codedInputByteBufferNano.readMessage(this.f5274e);
                    break;
                case 56:
                    this.f = codedInputByteBufferNano.readInt64();
                    break;
                case BaseNCodec.PEM_CHUNK_SIZE /* 64 */:
                    this.f5275g = codedInputByteBufferNano.readBool();
                    break;
                case 72:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != 0 && readInt32 != 1 && readInt32 != 2) {
                        break;
                    } else {
                        this.f5276h = readInt32;
                        break;
                    }
                case 80:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 1 && readInt322 != 2) {
                        break;
                    } else {
                        this.f5277i = readInt322;
                        break;
                    }
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    if (this.f5278j == null) {
                        this.f5278j = new y();
                    }
                    codedInputByteBufferNano.readMessage(this.f5278j);
                    break;
                case 98:
                    if (this.f5279k == null) {
                        this.f5279k = new x();
                    }
                    codedInputByteBufferNano.readMessage(this.f5279k);
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
