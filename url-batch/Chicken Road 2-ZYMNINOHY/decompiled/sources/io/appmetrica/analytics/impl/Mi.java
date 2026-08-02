package io.appmetrica.analytics.impl;

import com.startapp.simple.bloomfilter.codec.BaseNCodec;
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

/* loaded from: classes.dex */
public final class Mi extends MessageNano {

    /* renamed from: l, reason: collision with root package name */
    public static final int f10660l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f10661m = 1;
    public static final int n = 2;
    public static final int o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f10662p = 2;

    /* renamed from: q, reason: collision with root package name */
    public static volatile Mi[] f10663q;

    /* renamed from: a, reason: collision with root package name */
    public int f10664a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f10665b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f10666c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f10667d;

    /* renamed from: e, reason: collision with root package name */
    public Hi f10668e;

    /* renamed from: f, reason: collision with root package name */
    public long f10669f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10670g;

    /* renamed from: h, reason: collision with root package name */
    public int f10671h;

    /* renamed from: i, reason: collision with root package name */
    public int f10672i;

    /* renamed from: j, reason: collision with root package name */
    public Li f10673j;

    /* renamed from: k, reason: collision with root package name */
    public Ki f10674k;

    public Mi() {
        a();
    }

    public static Mi[] b() {
        if (f10663q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f10663q == null) {
                        f10663q = new Mi[0];
                    }
                } finally {
                }
            }
        }
        return f10663q;
    }

    public final Mi a() {
        this.f10664a = 1;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f10665b = bArr;
        this.f10666c = bArr;
        this.f10667d = bArr;
        this.f10668e = null;
        this.f10669f = 0L;
        this.f10670g = false;
        this.f10671h = 0;
        this.f10672i = 1;
        this.f10673j = null;
        this.f10674k = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i4 = this.f10664a;
        if (i4 != 1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i4);
        }
        int computeBytesSize = CodedOutputByteBufferNano.computeBytesSize(3, this.f10665b) + computeSerializedSize;
        byte[] bArr = this.f10666c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeBytesSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f10666c);
        }
        if (!Arrays.equals(this.f10667d, bArr2)) {
            computeBytesSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f10667d);
        }
        Hi hi = this.f10668e;
        if (hi != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(6, hi);
        }
        long j4 = this.f10669f;
        if (j4 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt64Size(7, j4);
        }
        boolean z = this.f10670g;
        if (z) {
            computeBytesSize += CodedOutputByteBufferNano.computeBoolSize(8, z);
        }
        int i5 = this.f10671h;
        if (i5 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt32Size(9, i5);
        }
        int i6 = this.f10672i;
        if (i6 != 1) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt32Size(10, i6);
        }
        Li li = this.f10673j;
        if (li != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(11, li);
        }
        Ki ki = this.f10674k;
        return ki != null ? CodedOutputByteBufferNano.computeMessageSize(12, ki) + computeBytesSize : computeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i4 = this.f10664a;
        if (i4 != 1) {
            codedOutputByteBufferNano.writeUInt32(1, i4);
        }
        codedOutputByteBufferNano.writeBytes(3, this.f10665b);
        byte[] bArr = this.f10666c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f10666c);
        }
        if (!Arrays.equals(this.f10667d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f10667d);
        }
        Hi hi = this.f10668e;
        if (hi != null) {
            codedOutputByteBufferNano.writeMessage(6, hi);
        }
        long j4 = this.f10669f;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeInt64(7, j4);
        }
        boolean z = this.f10670g;
        if (z) {
            codedOutputByteBufferNano.writeBool(8, z);
        }
        int i5 = this.f10671h;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeInt32(9, i5);
        }
        int i6 = this.f10672i;
        if (i6 != 1) {
            codedOutputByteBufferNano.writeInt32(10, i6);
        }
        Li li = this.f10673j;
        if (li != null) {
            codedOutputByteBufferNano.writeMessage(11, li);
        }
        Ki ki = this.f10674k;
        if (ki != null) {
            codedOutputByteBufferNano.writeMessage(12, ki);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Mi b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Mi().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 8:
                    this.f10664a = codedInputByteBufferNano.readUInt32();
                    break;
                case 26:
                    this.f10665b = codedInputByteBufferNano.readBytes();
                    break;
                case Build.API_LEVELS.API_34 /* 34 */:
                    this.f10666c = codedInputByteBufferNano.readBytes();
                    break;
                case C0583e9.f11752M /* 42 */:
                    this.f10667d = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f10668e == null) {
                        this.f10668e = new Hi();
                    }
                    codedInputByteBufferNano.readMessage(this.f10668e);
                    break;
                case 56:
                    this.f10669f = codedInputByteBufferNano.readInt64();
                    break;
                case BaseNCodec.PEM_CHUNK_SIZE /* 64 */:
                    this.f10670g = codedInputByteBufferNano.readBool();
                    break;
                case 72:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != 0 && readInt32 != 1 && readInt32 != 2) {
                        break;
                    } else {
                        this.f10671h = readInt32;
                        break;
                    }
                case 80:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 1 && readInt322 != 2) {
                        break;
                    } else {
                        this.f10672i = readInt322;
                        break;
                    }
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    if (this.f10673j == null) {
                        this.f10673j = new Li();
                    }
                    codedInputByteBufferNano.readMessage(this.f10673j);
                    break;
                case 98:
                    if (this.f10674k == null) {
                        this.f10674k = new Ki();
                    }
                    codedInputByteBufferNano.readMessage(this.f10674k);
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

    public static Mi a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Mi) MessageNano.mergeFrom(new Mi(), bArr);
    }
}
