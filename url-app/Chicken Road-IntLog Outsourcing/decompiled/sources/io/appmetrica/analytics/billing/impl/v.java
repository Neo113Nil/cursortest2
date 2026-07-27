package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class v extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile v[] f5992e;

    /* renamed from: a, reason: collision with root package name */
    public long f5993a;

    /* renamed from: b, reason: collision with root package name */
    public w f5994b;

    /* renamed from: c, reason: collision with root package name */
    public int f5995c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f5996d;

    public v() {
        a();
    }

    public static v[] b() {
        if (f5992e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5992e == null) {
                        f5992e = new v[0];
                    }
                } finally {
                }
            }
        }
        return f5992e;
    }

    public final v a() {
        this.f5993a = 0L;
        this.f5994b = null;
        this.f5995c = 0;
        this.f5996d = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j2 = this.f5993a;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j2);
        }
        w wVar = this.f5994b;
        if (wVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, wVar);
        }
        int i2 = this.f5995c;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i2);
        }
        return !Arrays.equals(this.f5996d, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(4, this.f5996d) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        long j2 = this.f5993a;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j2);
        }
        w wVar = this.f5994b;
        if (wVar != null) {
            codedOutputByteBufferNano.writeMessage(2, wVar);
        }
        int i2 = this.f5995c;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(3, i2);
        }
        if (!Arrays.equals(this.f5996d, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(4, this.f5996d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final v mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f5993a = codedInputByteBufferNano.readInt64();
            } else if (readTag == 18) {
                if (this.f5994b == null) {
                    this.f5994b = new w();
                }
                codedInputByteBufferNano.readMessage(this.f5994b);
            } else if (readTag == 24) {
                this.f5995c = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f5996d = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static v b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new v().mergeFrom(codedInputByteBufferNano);
    }

    public static v a(byte[] bArr) {
        return (v) MessageNano.mergeFrom(new v(), bArr);
    }
}
