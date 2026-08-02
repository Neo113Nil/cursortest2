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
public final class H9 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f6065c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6066d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f6067e = 2;
    public static final int f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f6068g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final int f6069h = 5;

    /* renamed from: i, reason: collision with root package name */
    public static final int f6070i = 6;

    /* renamed from: j, reason: collision with root package name */
    public static volatile H9[] f6071j;

    /* renamed from: a, reason: collision with root package name */
    public int f6072a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f6073b;

    public H9() {
        a();
    }

    public static H9[] b() {
        if (f6071j == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6071j == null) {
                        f6071j = new H9[0];
                    }
                } finally {
                }
            }
        }
        return f6071j;
    }

    public final H9 a() {
        this.f6072a = 0;
        this.f6073b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i3 = this.f6072a;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i3);
        }
        return !Arrays.equals(this.f6073b, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f6073b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i3 = this.f6072a;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i3);
        }
        if (!Arrays.equals(this.f6073b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f6073b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final H9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                            this.f6072a = readInt32;
                            break;
                    }
                } else if (readTag != 18) {
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    }
                } else {
                    this.f6073b = codedInputByteBufferNano.readBytes();
                }
            }
        }
        return this;
    }

    public static H9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new H9().mergeFrom(codedInputByteBufferNano);
    }

    public static H9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (H9) MessageNano.mergeFrom(new H9(), bArr);
    }
}
