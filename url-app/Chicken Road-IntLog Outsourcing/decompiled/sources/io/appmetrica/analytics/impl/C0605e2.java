package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.e2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0605e2 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f8071c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f8072d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f8073e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f8074f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f8075g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final int f8076h = 5;

    /* renamed from: i, reason: collision with root package name */
    public static final int f8077i = -1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f8078j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final int f8079k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static volatile C0605e2[] f8080l;

    /* renamed from: a, reason: collision with root package name */
    public int f8081a;

    /* renamed from: b, reason: collision with root package name */
    public int f8082b;

    public C0605e2() {
        a();
    }

    public static C0605e2[] b() {
        if (f8080l == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8080l == null) {
                        f8080l = new C0605e2[0];
                    }
                } finally {
                }
            }
        }
        return f8080l;
    }

    public final C0605e2 a() {
        this.f8081a = 0;
        this.f8082b = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt32Size(3, this.f8082b) + CodedOutputByteBufferNano.computeInt32Size(2, this.f8081a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeInt32(2, this.f8081a);
        codedOutputByteBufferNano.writeInt32(3, this.f8082b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0605e2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 16) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3 || readInt32 == 4 || readInt32 == 5) {
                    this.f8081a = readInt32;
                }
            } else if (readTag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt322 = codedInputByteBufferNano.readInt32();
                if (readInt322 == -1 || readInt322 == 0 || readInt322 == 1) {
                    this.f8082b = readInt322;
                }
            }
        }
    }

    public static C0605e2 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0605e2().mergeFrom(codedInputByteBufferNano);
    }

    public static C0605e2 a(byte[] bArr) {
        return (C0605e2) MessageNano.mergeFrom(new C0605e2(), bArr);
    }
}
