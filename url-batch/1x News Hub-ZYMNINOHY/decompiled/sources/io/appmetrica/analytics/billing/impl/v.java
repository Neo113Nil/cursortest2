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
    public static volatile v[] f5241e;

    /* renamed from: a, reason: collision with root package name */
    public long f5242a;

    /* renamed from: b, reason: collision with root package name */
    public w f5243b;

    /* renamed from: c, reason: collision with root package name */
    public int f5244c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f5245d;

    public v() {
        a();
    }

    public static v[] b() {
        if (f5241e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5241e == null) {
                        f5241e = new v[0];
                    }
                } finally {
                }
            }
        }
        return f5241e;
    }

    public final v a() {
        this.f5242a = 0L;
        this.f5243b = null;
        this.f5244c = 0;
        this.f5245d = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j3 = this.f5242a;
        if (j3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j3);
        }
        w wVar = this.f5243b;
        if (wVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, wVar);
        }
        int i3 = this.f5244c;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i3);
        }
        return !Arrays.equals(this.f5245d, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(4, this.f5245d) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j3 = this.f5242a;
        if (j3 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j3);
        }
        w wVar = this.f5243b;
        if (wVar != null) {
            codedOutputByteBufferNano.writeMessage(2, wVar);
        }
        int i3 = this.f5244c;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(3, i3);
        }
        if (!Arrays.equals(this.f5245d, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(4, this.f5245d);
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
                this.f5242a = codedInputByteBufferNano.readInt64();
            } else if (readTag == 18) {
                if (this.f5243b == null) {
                    this.f5243b = new w();
                }
                codedInputByteBufferNano.readMessage(this.f5243b);
            } else if (readTag == 24) {
                this.f5244c = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f5245d = codedInputByteBufferNano.readBytes();
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
