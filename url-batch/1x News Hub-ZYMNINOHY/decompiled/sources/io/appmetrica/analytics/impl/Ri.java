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

/* loaded from: classes.dex */
public final class Ri extends MessageNano {

    /* renamed from: l, reason: collision with root package name */
    public static final int f6561l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f6562m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f6563n = 2;
    public static final int o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f6564p = 2;

    /* renamed from: q, reason: collision with root package name */
    public static volatile Ri[] f6565q;

    /* renamed from: a, reason: collision with root package name */
    public int f6566a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f6567b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f6568c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f6569d;

    /* renamed from: e, reason: collision with root package name */
    public Mi f6570e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6571g;

    /* renamed from: h, reason: collision with root package name */
    public int f6572h;

    /* renamed from: i, reason: collision with root package name */
    public int f6573i;

    /* renamed from: j, reason: collision with root package name */
    public Qi f6574j;

    /* renamed from: k, reason: collision with root package name */
    public Pi f6575k;

    public Ri() {
        a();
    }

    public static Ri[] b() {
        if (f6565q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6565q == null) {
                        f6565q = new Ri[0];
                    }
                } finally {
                }
            }
        }
        return f6565q;
    }

    public final Ri a() {
        this.f6566a = 1;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f6567b = bArr;
        this.f6568c = bArr;
        this.f6569d = bArr;
        this.f6570e = null;
        this.f = 0L;
        this.f6571g = false;
        this.f6572h = 0;
        this.f6573i = 1;
        this.f6574j = null;
        this.f6575k = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i3 = this.f6566a;
        if (i3 != 1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i3);
        }
        int computeBytesSize = CodedOutputByteBufferNano.computeBytesSize(3, this.f6567b) + computeSerializedSize;
        byte[] bArr = this.f6568c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeBytesSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f6568c);
        }
        if (!Arrays.equals(this.f6569d, bArr2)) {
            computeBytesSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f6569d);
        }
        Mi mi = this.f6570e;
        if (mi != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(6, mi);
        }
        long j3 = this.f;
        if (j3 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt64Size(7, j3);
        }
        boolean z = this.f6571g;
        if (z) {
            computeBytesSize += CodedOutputByteBufferNano.computeBoolSize(8, z);
        }
        int i4 = this.f6572h;
        if (i4 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt32Size(9, i4);
        }
        int i5 = this.f6573i;
        if (i5 != 1) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt32Size(10, i5);
        }
        Qi qi = this.f6574j;
        if (qi != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(11, qi);
        }
        Pi pi = this.f6575k;
        return pi != null ? CodedOutputByteBufferNano.computeMessageSize(12, pi) + computeBytesSize : computeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i3 = this.f6566a;
        if (i3 != 1) {
            codedOutputByteBufferNano.writeUInt32(1, i3);
        }
        codedOutputByteBufferNano.writeBytes(3, this.f6567b);
        byte[] bArr = this.f6568c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f6568c);
        }
        if (!Arrays.equals(this.f6569d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f6569d);
        }
        Mi mi = this.f6570e;
        if (mi != null) {
            codedOutputByteBufferNano.writeMessage(6, mi);
        }
        long j3 = this.f;
        if (j3 != 0) {
            codedOutputByteBufferNano.writeInt64(7, j3);
        }
        boolean z = this.f6571g;
        if (z) {
            codedOutputByteBufferNano.writeBool(8, z);
        }
        int i4 = this.f6572h;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(9, i4);
        }
        int i5 = this.f6573i;
        if (i5 != 1) {
            codedOutputByteBufferNano.writeInt32(10, i5);
        }
        Qi qi = this.f6574j;
        if (qi != null) {
            codedOutputByteBufferNano.writeMessage(11, qi);
        }
        Pi pi = this.f6575k;
        if (pi != null) {
            codedOutputByteBufferNano.writeMessage(12, pi);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Ri b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Ri().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ri mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 8:
                    this.f6566a = codedInputByteBufferNano.readUInt32();
                    break;
                case C0642l9.f7781G /* 26 */:
                    this.f6567b = codedInputByteBufferNano.readBytes();
                    break;
                case 34:
                    this.f6568c = codedInputByteBufferNano.readBytes();
                    break;
                case C0642l9.f7786M /* 42 */:
                    this.f6569d = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f6570e == null) {
                        this.f6570e = new Mi();
                    }
                    codedInputByteBufferNano.readMessage(this.f6570e);
                    break;
                case 56:
                    this.f = codedInputByteBufferNano.readInt64();
                    break;
                case BaseNCodec.PEM_CHUNK_SIZE /* 64 */:
                    this.f6571g = codedInputByteBufferNano.readBool();
                    break;
                case 72:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != 0 && readInt32 != 1 && readInt32 != 2) {
                        break;
                    } else {
                        this.f6572h = readInt32;
                        break;
                    }
                case 80:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 1 && readInt322 != 2) {
                        break;
                    } else {
                        this.f6573i = readInt322;
                        break;
                    }
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    if (this.f6574j == null) {
                        this.f6574j = new Qi();
                    }
                    codedInputByteBufferNano.readMessage(this.f6574j);
                    break;
                case 98:
                    if (this.f6575k == null) {
                        this.f6575k = new Pi();
                    }
                    codedInputByteBufferNano.readMessage(this.f6575k);
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

    public static Ri a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Ri) MessageNano.mergeFrom(new Ri(), bArr);
    }
}
