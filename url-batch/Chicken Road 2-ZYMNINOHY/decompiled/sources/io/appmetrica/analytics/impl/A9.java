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
public final class A9 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f10024c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f10025d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f10026e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f10027f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f10028g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final int f10029h = 5;

    /* renamed from: i, reason: collision with root package name */
    public static final int f10030i = 6;

    /* renamed from: j, reason: collision with root package name */
    public static volatile A9[] f10031j;

    /* renamed from: a, reason: collision with root package name */
    public int f10032a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f10033b;

    public A9() {
        a();
    }

    public static A9[] b() {
        if (f10031j == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f10031j == null) {
                        f10031j = new A9[0];
                    }
                } finally {
                }
            }
        }
        return f10031j;
    }

    public final A9 a() {
        this.f10032a = 0;
        this.f10033b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i4 = this.f10032a;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i4);
        }
        return !Arrays.equals(this.f10033b, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f10033b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i4 = this.f10032a;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i4);
        }
        if (!Arrays.equals(this.f10033b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f10033b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final A9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag != 0) {
                if (readTag == 8) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    switch (readInt32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f10032a = readInt32;
                            break;
                    }
                } else if (readTag != 18) {
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    }
                } else {
                    this.f10033b = codedInputByteBufferNano.readBytes();
                }
            }
        }
        return this;
    }

    public static A9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new A9().mergeFrom(codedInputByteBufferNano);
    }

    public static A9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (A9) MessageNano.mergeFrom(new A9(), bArr);
    }
}
