package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Ni extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile Ni[] f6378e;

    /* renamed from: a, reason: collision with root package name */
    public long f6379a;

    /* renamed from: b, reason: collision with root package name */
    public Oi f6380b;

    /* renamed from: c, reason: collision with root package name */
    public int f6381c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f6382d;

    public Ni() {
        a();
    }

    public static Ni[] b() {
        if (f6378e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6378e == null) {
                        f6378e = new Ni[0];
                    }
                } finally {
                }
            }
        }
        return f6378e;
    }

    public final Ni a() {
        this.f6379a = 0L;
        this.f6380b = null;
        this.f6381c = 0;
        this.f6382d = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j3 = this.f6379a;
        if (j3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j3);
        }
        Oi oi = this.f6380b;
        if (oi != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, oi);
        }
        int i3 = this.f6381c;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i3);
        }
        return !Arrays.equals(this.f6382d, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(4, this.f6382d) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j3 = this.f6379a;
        if (j3 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j3);
        }
        Oi oi = this.f6380b;
        if (oi != null) {
            codedOutputByteBufferNano.writeMessage(2, oi);
        }
        int i3 = this.f6381c;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(3, i3);
        }
        if (!Arrays.equals(this.f6382d, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(4, this.f6382d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ni mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f6379a = codedInputByteBufferNano.readInt64();
            } else if (readTag == 18) {
                if (this.f6380b == null) {
                    this.f6380b = new Oi();
                }
                codedInputByteBufferNano.readMessage(this.f6380b);
            } else if (readTag == 24) {
                this.f6381c = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f6382d = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static Ni b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Ni().mergeFrom(codedInputByteBufferNano);
    }

    public static Ni a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Ni) MessageNano.mergeFrom(new Ni(), bArr);
    }
}
