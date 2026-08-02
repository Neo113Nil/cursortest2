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
public final class Qi extends MessageNano {
    public static final int f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f6518g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f6519h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static volatile Qi[] f6520i;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f6521a;

    /* renamed from: b, reason: collision with root package name */
    public long f6522b;

    /* renamed from: c, reason: collision with root package name */
    public int f6523c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f6524d;

    /* renamed from: e, reason: collision with root package name */
    public long f6525e;

    public Qi() {
        a();
    }

    public static Qi[] b() {
        if (f6520i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6520i == null) {
                        f6520i = new Qi[0];
                    }
                } finally {
                }
            }
        }
        return f6520i;
    }

    public final Qi a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f6521a = bArr;
        this.f6522b = 0L;
        this.f6523c = 0;
        this.f6524d = bArr;
        this.f6525e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f6521a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f6521a);
        }
        long j3 = this.f6522b;
        if (j3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j3);
        }
        int i3 = this.f6523c;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i3);
        }
        if (!Arrays.equals(this.f6524d, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f6524d);
        }
        long j4 = this.f6525e;
        return j4 != 0 ? CodedOutputByteBufferNano.computeUInt64Size(5, j4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f6521a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f6521a);
        }
        long j3 = this.f6522b;
        if (j3 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j3);
        }
        int i3 = this.f6523c;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeInt32(3, i3);
        }
        if (!Arrays.equals(this.f6524d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f6524d);
        }
        long j4 = this.f6525e;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeUInt64(5, j4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Qi b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Qi().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Qi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f6521a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                this.f6522b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f6523c = readInt32;
                }
            } else if (readTag == 34) {
                this.f6524d = codedInputByteBufferNano.readBytes();
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f6525e = codedInputByteBufferNano.readUInt64();
            }
        }
        return this;
    }

    public static Qi a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Qi) MessageNano.mergeFrom(new Qi(), bArr);
    }
}
