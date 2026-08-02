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
public final class Ii extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile Ii[] f10442e;

    /* renamed from: a, reason: collision with root package name */
    public long f10443a;

    /* renamed from: b, reason: collision with root package name */
    public Ji f10444b;

    /* renamed from: c, reason: collision with root package name */
    public int f10445c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f10446d;

    public Ii() {
        a();
    }

    public static Ii[] b() {
        if (f10442e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f10442e == null) {
                        f10442e = new Ii[0];
                    }
                } finally {
                }
            }
        }
        return f10442e;
    }

    public final Ii a() {
        this.f10443a = 0L;
        this.f10444b = null;
        this.f10445c = 0;
        this.f10446d = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j4 = this.f10443a;
        if (j4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j4);
        }
        Ji ji = this.f10444b;
        if (ji != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, ji);
        }
        int i4 = this.f10445c;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i4);
        }
        return !Arrays.equals(this.f10446d, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(4, this.f10446d) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j4 = this.f10443a;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j4);
        }
        Ji ji = this.f10444b;
        if (ji != null) {
            codedOutputByteBufferNano.writeMessage(2, ji);
        }
        int i4 = this.f10445c;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeUInt32(3, i4);
        }
        if (!Arrays.equals(this.f10446d, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(4, this.f10446d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f10443a = codedInputByteBufferNano.readInt64();
            } else if (readTag == 18) {
                if (this.f10444b == null) {
                    this.f10444b = new Ji();
                }
                codedInputByteBufferNano.readMessage(this.f10444b);
            } else if (readTag == 24) {
                this.f10445c = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f10446d = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static Ii b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Ii().mergeFrom(codedInputByteBufferNano);
    }

    public static Ii a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Ii) MessageNano.mergeFrom(new Ii(), bArr);
    }
}
