package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.e2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0454e2 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f7212c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7213d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f7214e = 2;
    public static final int f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f7215g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final int f7216h = 5;

    /* renamed from: i, reason: collision with root package name */
    public static final int f7217i = -1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f7218j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final int f7219k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static volatile C0454e2[] f7220l;

    /* renamed from: a, reason: collision with root package name */
    public int f7221a;

    /* renamed from: b, reason: collision with root package name */
    public int f7222b;

    public C0454e2() {
        a();
    }

    public static C0454e2[] b() {
        if (f7220l == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7220l == null) {
                        f7220l = new C0454e2[0];
                    }
                } finally {
                }
            }
        }
        return f7220l;
    }

    public final C0454e2 a() {
        this.f7221a = 0;
        this.f7222b = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt32Size(3, this.f7222b) + CodedOutputByteBufferNano.computeInt32Size(2, this.f7221a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt32(2, this.f7221a);
        codedOutputByteBufferNano.writeInt32(3, this.f7222b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0454e2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 16) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3 || readInt32 == 4 || readInt32 == 5) {
                    this.f7221a = readInt32;
                }
            } else if (readTag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt322 = codedInputByteBufferNano.readInt32();
                if (readInt322 == -1 || readInt322 == 0 || readInt322 == 1) {
                    this.f7222b = readInt322;
                }
            }
        }
        return this;
    }

    public static C0454e2 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0454e2().mergeFrom(codedInputByteBufferNano);
    }

    public static C0454e2 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0454e2) MessageNano.mergeFrom(new C0454e2(), bArr);
    }
}
