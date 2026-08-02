package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class v extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile v[] f9483e;

    /* renamed from: a, reason: collision with root package name */
    public long f9484a;

    /* renamed from: b, reason: collision with root package name */
    public w f9485b;

    /* renamed from: c, reason: collision with root package name */
    public int f9486c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f9487d;

    public v() {
        a();
    }

    public static v[] b() {
        if (f9483e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9483e == null) {
                        f9483e = new v[0];
                    }
                } finally {
                }
            }
        }
        return f9483e;
    }

    public final v a() {
        this.f9484a = 0L;
        this.f9485b = null;
        this.f9486c = 0;
        this.f9487d = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j4 = this.f9484a;
        if (j4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j4);
        }
        w wVar = this.f9485b;
        if (wVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, wVar);
        }
        int i4 = this.f9486c;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i4);
        }
        return !Arrays.equals(this.f9487d, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(4, this.f9487d) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j4 = this.f9484a;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j4);
        }
        w wVar = this.f9485b;
        if (wVar != null) {
            codedOutputByteBufferNano.writeMessage(2, wVar);
        }
        int i4 = this.f9486c;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeUInt32(3, i4);
        }
        if (!Arrays.equals(this.f9487d, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(4, this.f9487d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final v mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f9484a = codedInputByteBufferNano.readInt64();
            } else if (readTag == 18) {
                if (this.f9485b == null) {
                    this.f9485b = new w();
                }
                codedInputByteBufferNano.readMessage(this.f9485b);
            } else if (readTag == 24) {
                this.f9486c = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f9487d = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static v b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new v().mergeFrom(codedInputByteBufferNano);
    }

    public static v a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (v) MessageNano.mergeFrom(new v(), bArr);
    }
}
