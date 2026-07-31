package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.b2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2506b2 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f38694c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f38695d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f38696e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f38697f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f38698g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final int f38699h = 5;

    /* renamed from: i, reason: collision with root package name */
    public static final int f38700i = -1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f38701j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final int f38702k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static volatile C2506b2[] f38703l;

    /* renamed from: a, reason: collision with root package name */
    public int f38704a;

    /* renamed from: b, reason: collision with root package name */
    public int f38705b;

    public C2506b2() {
        a();
    }

    public static C2506b2[] b() {
        if (f38703l == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f38703l == null) {
                        f38703l = new C2506b2[0];
                    }
                } finally {
                }
            }
        }
        return f38703l;
    }

    public final C2506b2 a() {
        this.f38704a = 0;
        this.f38705b = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt32Size(3, this.f38705b) + CodedOutputByteBufferNano.computeInt32Size(2, this.f38704a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeInt32(2, this.f38704a);
        codedOutputByteBufferNano.writeInt32(3, this.f38705b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2506b2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 16) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3 || readInt32 == 4 || readInt32 == 5) {
                    this.f38704a = readInt32;
                }
            } else if (readTag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt322 = codedInputByteBufferNano.readInt32();
                if (readInt322 == -1 || readInt322 == 0 || readInt322 == 1) {
                    this.f38705b = readInt322;
                }
            }
        }
        return this;
    }

    public static C2506b2 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2506b2().mergeFrom(codedInputByteBufferNano);
    }

    public static C2506b2 a(byte[] bArr) {
        return (C2506b2) MessageNano.mergeFrom(new C2506b2(), bArr);
    }
}
