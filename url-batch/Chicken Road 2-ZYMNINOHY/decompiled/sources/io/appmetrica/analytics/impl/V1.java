package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class V1 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f11079c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f11080d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f11081e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f11082f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f11083g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final int f11084h = 5;

    /* renamed from: i, reason: collision with root package name */
    public static final int f11085i = 6;

    /* renamed from: j, reason: collision with root package name */
    public static final int f11086j = -1;

    /* renamed from: k, reason: collision with root package name */
    public static final int f11087k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final int f11088l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static volatile V1[] f11089m;

    /* renamed from: a, reason: collision with root package name */
    public int f11090a;

    /* renamed from: b, reason: collision with root package name */
    public int f11091b;

    public V1() {
        a();
    }

    public static V1[] b() {
        if (f11089m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11089m == null) {
                        f11089m = new V1[0];
                    }
                } finally {
                }
            }
        }
        return f11089m;
    }

    public final V1 a() {
        this.f11090a = 0;
        this.f11091b = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt32Size(3, this.f11091b) + CodedOutputByteBufferNano.computeInt32Size(2, this.f11090a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt32(2, this.f11090a);
        codedOutputByteBufferNano.writeInt32(3, this.f11091b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final V1 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag != 0) {
                if (readTag == 16) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    switch (readInt32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f11090a = readInt32;
                            break;
                    }
                } else if (readTag != 24) {
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    }
                } else {
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 == -1 || readInt322 == 0 || readInt322 == 1) {
                        this.f11091b = readInt322;
                    }
                }
            }
        }
        return this;
    }

    public static V1 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new V1().mergeFrom(codedInputByteBufferNano);
    }

    public static V1 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (V1) MessageNano.mergeFrom(new V1(), bArr);
    }
}
