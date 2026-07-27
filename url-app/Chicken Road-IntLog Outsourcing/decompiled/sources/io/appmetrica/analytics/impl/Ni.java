package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Ni extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile Ni[] f7188e;

    /* renamed from: a, reason: collision with root package name */
    public long f7189a;

    /* renamed from: b, reason: collision with root package name */
    public Oi f7190b;

    /* renamed from: c, reason: collision with root package name */
    public int f7191c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f7192d;

    public Ni() {
        a();
    }

    public static Ni[] b() {
        if (f7188e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7188e == null) {
                        f7188e = new Ni[0];
                    }
                } finally {
                }
            }
        }
        return f7188e;
    }

    public final Ni a() {
        this.f7189a = 0L;
        this.f7190b = null;
        this.f7191c = 0;
        this.f7192d = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j2 = this.f7189a;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j2);
        }
        Oi oi = this.f7190b;
        if (oi != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, oi);
        }
        int i2 = this.f7191c;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i2);
        }
        return !Arrays.equals(this.f7192d, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(4, this.f7192d) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        long j2 = this.f7189a;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j2);
        }
        Oi oi = this.f7190b;
        if (oi != null) {
            codedOutputByteBufferNano.writeMessage(2, oi);
        }
        int i2 = this.f7191c;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(3, i2);
        }
        if (!Arrays.equals(this.f7192d, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(4, this.f7192d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ni mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f7189a = codedInputByteBufferNano.readInt64();
            } else if (readTag == 18) {
                if (this.f7190b == null) {
                    this.f7190b = new Oi();
                }
                codedInputByteBufferNano.readMessage(this.f7190b);
            } else if (readTag == 24) {
                this.f7191c = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f7192d = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static Ni b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Ni().mergeFrom(codedInputByteBufferNano);
    }

    public static Ni a(byte[] bArr) {
        return (Ni) MessageNano.mergeFrom(new Ni(), bArr);
    }
}
