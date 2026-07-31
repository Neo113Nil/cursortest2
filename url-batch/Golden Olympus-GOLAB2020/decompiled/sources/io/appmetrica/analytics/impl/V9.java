package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class V9 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f38406c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f38407d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f38408e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f38409f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f38410g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final int f38411h = 5;

    /* renamed from: i, reason: collision with root package name */
    public static final int f38412i = 6;

    /* renamed from: j, reason: collision with root package name */
    public static volatile V9[] f38413j;

    /* renamed from: a, reason: collision with root package name */
    public int f38414a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f38415b;

    public V9() {
        a();
    }

    public static V9[] b() {
        if (f38413j == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f38413j == null) {
                        f38413j = new V9[0];
                    }
                } finally {
                }
            }
        }
        return f38413j;
    }

    public final V9 a() {
        this.f38414a = 0;
        this.f38415b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i4 = this.f38414a;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i4);
        }
        return !Arrays.equals(this.f38415b, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f38415b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i4 = this.f38414a;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i4);
        }
        if (!Arrays.equals(this.f38415b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f38415b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final V9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                            this.f38414a = readInt32;
                            break;
                    }
                } else if (readTag != 18) {
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    }
                } else {
                    this.f38415b = codedInputByteBufferNano.readBytes();
                }
            }
        }
        return this;
    }

    public static V9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new V9().mergeFrom(codedInputByteBufferNano);
    }

    public static V9 a(byte[] bArr) {
        return (V9) MessageNano.mergeFrom(new V9(), bArr);
    }
}
